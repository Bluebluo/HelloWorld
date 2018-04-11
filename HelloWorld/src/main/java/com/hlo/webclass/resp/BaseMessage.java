package com.hlo.webclass.resp;

//响应基类
public class BaseMessage {

	//发送方账号
	private String ToUserName;

	//接收方账号
	private String FromUserName;
	
	//消息创建时间
	private long CreateTime;
	
	//消息类型
	private String MsgType;

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
}
