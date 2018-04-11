package com.hlo.bean;

import java.util.HashMap;
import java.util.Map;

public class Msg {
	private int code;
	private String info;
	private Map<String, Object> extend = new HashMap<String, Object>();
	
	public static Msg success() {
		Msg msg = new Msg();
		msg.setCode(200);
		msg.setInfo("成功");
		return msg;
	}
	
	public static Msg fail() {
		Msg msg = new Msg();
		msg.setCode(300);
		msg.setInfo("失败");
		return msg;
	}
	
	public Msg add(String str,Object obj) {
		this.getExtend().put(str, obj);
		return this;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}

	

}
