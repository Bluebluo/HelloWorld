package com.hlo.controller;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hlo.utils.NetWorkHelper;
import com.hlo.webclass.bean.AccessToken;
import com.hlo.webclass.bean.AccessTokenInfo;
import com.hlo.webclass.utils.WeixinCst;

@Controller
public class AccessTokenListener implements ApplicationListener<ContextRefreshedEvent>{

	public void onApplicationEvent(ContextRefreshedEvent  event) {
		if(event.getApplicationContext().getParent() == null) {
			System.out.println("启动后加载");
			//getAccessTolen();
		}
	}

	//初始化获取accessToken
	public void  getAccessTolen() {
		System.out.println("get accessToken first");
		new Thread(new Runnable() {
			public void run() {
				while(true) {
					try {
						AccessTokenInfo.accessToken = getAccessToken(WeixinCst.APPID, WeixinCst.APPSECRET);
						Thread.sleep(7000*1000);
					}catch (Exception e) {
						e.printStackTrace();					
					}
				}
			}
		}).start();
	}

	private AccessToken getAccessToken(String appId,String appSecret) {
		NetWorkHelper netWorkHelper = new NetWorkHelper();
		String Url = String.format("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s"
				,appId,appSecret);
		String result = netWorkHelper.getHttpsResponse(Url, "");
		System.out.println("AccessToken: "+result);
		JSONObject json = JSON.parseObject(result);
		AccessToken accessToken = new AccessToken();
		accessToken.setAccessToken(json.getString("access_token"));
		accessToken.setExpiresin(json.getInteger("expires_in"));
		return accessToken;
	}


}
