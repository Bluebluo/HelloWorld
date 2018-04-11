package com.hlo.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hlo.service.CoreService;
import com.hlo.webclass.utils.WeixinCst;

@Controller
@RequestMapping("wxInspective")
public class CoreController {

		@Autowired
		private HttpServletRequest request;
		
		@Autowired
		private HttpServletResponse response;
		
		@Autowired
		private CoreService coreservice;
		
		@ResponseBody
		public void  WxInspective() throws Exception {
			System.out.println("Wx connecting...");
			try {
				String signature = request.getParameter("signature");
				String timestamp = request.getParameter("timestamp");
				String nonce = request.getParameter("nonce");
				String echostr = request.getParameter("echostr");
				String sortString = sort(WeixinCst.TOKEN, timestamp, nonce);
				String mySignature = sha1(sortString);
				if(mySignature != null && mySignature != "" && mySignature.equals(signature)) {
					System.out.println("sign check succefull");
					response.getWriter().write(echostr);
				}else {
					System.out.println("sign fail");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		@RequestMapping(method=RequestMethod.POST)
		@ResponseBody
		public void processMessage() throws Exception{
			try {
				String respXml = coreservice.processRequest(request);
				response.getWriter().print(respXml);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		private String sort(String token,String timestamp,String nonce) {
			String[] strArray = {token,timestamp,nonce};
			Arrays.sort(strArray);
			StringBuilder sb = new StringBuilder();
			for (String str:strArray) {
				sb.append(str);
			}
			return sb.toString();
		}
		
		private String sha1(String str) {
			try {
				MessageDigest digest = MessageDigest.getInstance("SHA-1");
				digest.update(str.getBytes());
				byte messageDigets[] = digest.digest();
				StringBuffer hexString = new StringBuffer();
				for (int i=0;i<messageDigets.length;i++) {
					String shaHex = Integer.toHexString(messageDigets[i] & 0xFF);
					if(shaHex.length()<2) {
						hexString.append(0);
					}
					hexString.append(shaHex);
				}
				return hexString.toString();
			}catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
			return "";
		}
}
