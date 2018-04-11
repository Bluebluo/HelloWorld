package com.hlo.webclass.resp;

//响应文本消息
public class TextMessage extends BaseMessage{

	//响应内容
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
	
	
}
