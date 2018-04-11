package com.hlo.webclass.event;

//自定义菜单事件
public class MenuEvent extends BaseEvent{

	//自定义KEY值
	private String EventKey;

	public String getEventKey() {
		return EventKey;
	}

	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}
	
}
