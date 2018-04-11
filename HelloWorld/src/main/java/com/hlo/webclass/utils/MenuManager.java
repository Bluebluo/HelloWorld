package com.hlo.webclass.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hlo.webclass.bean.AccessToken;
import com.hlo.webclass.menu.Button;
import com.hlo.webclass.menu.CommonButton;
import com.hlo.webclass.menu.ComplexButton;
import com.hlo.webclass.menu.Menu;
import com.hlo.webclass.menu.ViewButton;

public class MenuManager {
	
	private final static Logger log = LoggerFactory.getLogger(MenuManager.class);
	
	public static void main(String[] args) {
		// 第三方用户唯一凭证
        String appId = WeixinCst.APPID;
        // 第三方用户唯一凭证密钥
        String appSecret = WeixinCst.APPSECRET;

        // 调用接口获取access_token
        AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);
        //AccessToken at = AccessTokenInfo.accessToken;
        if (null != at) {
        	Menu menu = null;
        	//生成click类型菜单
        	//menu = getMenu();
        	
        	//生成view类型菜单
        	menu = getViewMenu();
            // 调用接口创建菜单
            int result = WeixinUtil.createMenu(menu, at.getAccessToken());
        	//调用接口删除菜单
            //int result = WeixinUtil.deleteMenu(at.getAccessToken());
            // 判断菜单创建结果
            if (0 == result)
                System.out.println("菜单创建成功！");
            else
                log.info("菜单创建失败，错误码：" + result);
        }else {
        	log.info("菜单创建失败！");
        }
	}
	
	public static Menu getViewMenu() {
		String path = WeixinCst.PATH;
		Menu menu = new Menu();
    	
    	ViewButton btn11 = new ViewButton();
    	btn11.setName("课程简介及大纲");
    	btn11.setType("view");
    	btn11.setUrl(path+"/course/introduce.jsp");
    	
    	ViewButton btn12 = new ViewButton();
    	btn12.setName("试验大纲与指导书");
    	btn12.setType("view");
    	btn12.setUrl(path+"/course/outline.jsp");
    	
    	ViewButton btn13 = new ViewButton();
    	btn13.setName("教材及参考书目");
    	btn13.setType("view");
    	btn13.setUrl(path+"/book?class=1");
    	
    	ViewButton btn14 = new ViewButton();
    	btn14.setName("教师信息");
    	btn14.setType("view");
    	btn14.setUrl(path+"/course/teacher.jsp");
    	
    	ViewButton btn21 = new ViewButton();
    	btn21.setName("课件及视频");
    	btn21.setType("view");
    	btn21.setUrl(path+"/course/courseData.jsp");
    	
    	ViewButton btn22 = new ViewButton();
    	btn22.setName("重点难点解析");
    	btn22.setType("view");
    	btn22.setUrl(path+"/course/coursePoint.jsp");
    	
    	ViewButton btn23 = new ViewButton();
    	btn23.setName("练习题");
    	btn23.setType("view");
    	btn23.setUrl(path+"/course/courseExercise.jsp");
    	
    	ViewButton btn24 = new ViewButton();
    	btn24.setName("精彩案例");
    	btn24.setType("view");
    	btn24.setUrl(path+"/course/niceCase.jsp");
    	
    	ViewButton btn25 = new ViewButton();
    	btn25.setName("拓展资料");
    	btn25.setType("view");
    	btn25.setUrl(path+"/course/moreData.jsp");
    	
    	ViewButton btn31 = new ViewButton();
    	btn31.setName("学习路线");
    	btn31.setType("view");
    	btn31.setUrl(path+"/course/learningGuide.jsp");
    	
    	ViewButton btn32 = new ViewButton();
    	btn32.setName("在线测试");
    	btn32.setType("view");
    	btn32.setUrl(path+"/onlineTest?course=1");
    	
    	CommonButton btn33 = new CommonButton();
    	btn33.setName("在线交流");
    	btn33.setType("click");
    	btn33.setKey("contact");
    	
    	ComplexButton mainBtn1 = new ComplexButton();
    	mainBtn1.setName("教学概述");
    	mainBtn1.setSub_button(new ViewButton[] {btn14,btn13,btn12,btn11});
    	
    	ComplexButton mainBtn2 = new ComplexButton();
    	mainBtn2.setName("学习资料");
    	mainBtn2.setSub_button(new ViewButton[] {btn25,btn24,btn23,btn22,btn21});
    	
    	ComplexButton mainBtn3 = new ComplexButton();
    	mainBtn3.setName("学习指导");
    	mainBtn3.setSub_button(new Button[] {btn33,btn32,btn31});
    	
    	menu.setButton(new Button[] {mainBtn1,mainBtn2,mainBtn3});
    	
    	return menu;
	}
	
    public static Menu getMenu(){
    	Menu menu = new Menu();
    	
    	CommonButton btn11 = new CommonButton();
    	btn11.setName("课程简介及大纲");
    	btn11.setType("click");
    	btn11.setKey("11");
    	
    	CommonButton btn12 = new CommonButton();
    	btn12.setName("试验大纲与指导书");
    	btn12.setType("click");
    	btn12.setKey("12");
    	
    	CommonButton btn13 = new CommonButton();
    	btn13.setName("教材及参考书目");
    	btn13.setType("click");
    	btn13.setKey("13");
    	
    	CommonButton btn14 = new CommonButton();
    	btn14.setName("教师信息");
    	btn14.setType("click");
    	btn14.setKey("14");
    	
    	CommonButton btn21 = new CommonButton();
    	btn21.setName("课件及视频");
    	btn21.setType("click");
    	btn21.setKey("21");
    	
    	CommonButton btn22 = new CommonButton();
    	btn22.setName("重点难点解析");
    	btn22.setType("click");
    	btn22.setKey("22");
    	
    	CommonButton btn23 = new CommonButton();
    	btn23.setName("练习题");
    	btn23.setType("click");
    	btn23.setKey("23");
    	
    	CommonButton btn24 = new CommonButton();
    	btn24.setName("精彩案例");
    	btn24.setType("click");
    	btn24.setKey("24");
    	
    	CommonButton btn25 = new CommonButton();
    	btn25.setName("拓展资料");
    	btn25.setType("click");
    	btn25.setKey("25");
    	
    	CommonButton btn31 = new CommonButton();
    	btn31.setName("学习路线");
    	btn31.setType("click");
    	btn31.setKey("31");
    	
    	CommonButton btn32 = new CommonButton();
    	btn32.setName("在线测试");
    	btn32.setType("click");
    	btn32.setKey("32");
    	
    	CommonButton btn33 = new CommonButton();
    	btn33.setName("在线交流");
    	btn33.setType("click");
    	btn33.setKey("33");
    	
    	ComplexButton mainBtn1 = new ComplexButton();
    	mainBtn1.setName("教学概述");
    	mainBtn1.setSub_button(new CommonButton[] {btn14,btn13,btn12,btn11});
    	
    	ComplexButton mainBtn2 = new ComplexButton();
    	mainBtn2.setName("学习资料");
    	mainBtn2.setSub_button(new CommonButton[] {btn25,btn24,btn23,btn22,btn21});
    	
    	ComplexButton mainBtn3 = new ComplexButton();
    	mainBtn3.setName("学习指导");
    	mainBtn3.setSub_button(new CommonButton[] {btn33,btn32,btn31});
    	
    	menu.setButton(new Button[] {mainBtn1,mainBtn2,mainBtn3});
    	
    	return menu;
    }
}
