package com.hlo.service;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlo.bean.Course;
import com.hlo.bean.Teacher;
import com.hlo.bean.TeacherExample;
import com.hlo.dao.TeacherMapper;
import com.hlo.webclass.bean.Article;
import com.hlo.webclass.resp.ArticleMessage;
import com.hlo.webclass.resp.TextMessage;
import com.hlo.webclass.utils.MessageUtil;
import com.hlo.webclass.utils.WeixinCst;

@Service
public class CoreService {
	
	@Autowired
	TeacherManager teacherManager;
	
	@Autowired
	CourseManager courseManager;
	
	@Autowired
	SectionManager sectionManager;
	
	@Autowired
	ExerciseManager exerciseManager;
	
	@Autowired
	OnlineTestManager onlineTestManager;
	
	@Autowired
	ArticleManager articleManager;
	
	public String processRequest(HttpServletRequest request) throws Exception{
		String respXml = null;
		String respContent = "未知的消息类型!";
		try {
			//调用parseXml解析request消息
			Map<String, String> requestMap = MessageUtil.parseXml(request);
			String fromUserName = requestMap.get("FromUserName");
			String toUserName = requestMap.get("ToUserName");
			String msgType = requestMap.get("MsgType");
			//回复文本消息
			TextMessage textMessage = new TextMessage();
			textMessage.setFromUserName(toUserName);
			textMessage.setToUserName(fromUserName);
			textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
			textMessage.setCreateTime(new Date().getTime());
			
			if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
				respContent = "您发送的是文本消息";
			}else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)){
				respContent = "您发送的是语音消息";
			}else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {
				respContent = "您发送的是图片消息";
			}else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {
				respContent = "您发送的是位置消息";
			}else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO)) {
				respContent = "您发送的是视频消息";
			}else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_SHORTVIDEO)) {
				respContent = "您发送的是小视频消息";
			}else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {
				respContent = "您发送的是连接消息";
			}
			// 事件推送
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {
                // 事件类型
                String eventType = requestMap.get("Event");
                // 关注
                if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
                    respContent = "谢谢您的关注！";
                }
                // 取消关注
                else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
                    // TODO 取消订阅后用户不会再收到公众账号发送的消息，因此不需要回复
                }
                // 扫描带参数二维码
                else if (eventType.equals(MessageUtil.EVENT_TYPE_SCAN)) {
                    // TODO 处理扫描带参数二维码事件
                }
                // 上报地理位置
                else if (eventType.equals(MessageUtil.EVENT_TYPE_LOCATION)) {
                    // TODO 处理上报地理位置事件
                }
                // 自定义菜单
                else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
                    // TODO 处理菜单点击事件
                	respXml = handleClickEvent(request,requestMap);
                }
            }
            // 设置文本消息的内容
            textMessage.setContent(respContent);
            // 将文本消息对象转换成xml
            respXml = MessageUtil.messageToXml(textMessage);
		}catch (Exception e) {
			e.printStackTrace();
		}	
		return respXml;
	}
	
	public String handleClickEvent(HttpServletRequest request,Map<String, String> requestMap) {
		ArticleMessage articleMessage = new ArticleMessage();
		String fromUserName = requestMap.get("FromUserName");
		String toUserName = requestMap.get("ToUserName");
		String msgType = requestMap.get("MsgType");
		String eventKey = requestMap.get("EventKey");
		
		//课程信息全部都在course之中
		Course course = courseManager.getOneCourse(1);
		switch (Integer.parseInt(eventKey)) {
		//课程简介及大纲
		case 11:
			articleMessage = courseManager.buildInroduce(course);
			articleMessage.setFromUserName(toUserName);
			articleMessage.setToUserName(fromUserName);
			return MessageUtil.messageToXml(articleMessage);
			
		//试验大纲与指导书
		case 12:
			articleMessage = courseManager.buildOutline(course);
			articleMessage.setFromUserName(toUserName);
			articleMessage.setToUserName(fromUserName);
			return MessageUtil.messageToXml(articleMessage);
		
		//教材及参考书目
		case 13:

		//教师信息
		case 14:
			Teacher teacher = teacherManager.getOneTeacher(1);
			articleMessage = teacherManager.buildOneTeacherMsg(teacher);
			articleMessage.setFromUserName(toUserName);
			articleMessage.setToUserName(fromUserName);
			return MessageUtil.messageToXml(articleMessage);
		case 21:
			
		
		default:
			break;
		}
		return null;
	}
}
