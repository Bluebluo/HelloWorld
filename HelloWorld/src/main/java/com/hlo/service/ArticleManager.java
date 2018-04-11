package com.hlo.service;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hlo.webclass.bean.Article;
import com.hlo.webclass.resp.ArticleMessage;
import com.hlo.webclass.utils.MessageUtil;

/*
 * 构造图文消息
 */
@Service
public class ArticleManager {

	
	/*
	 * 构造一条图文消息
	 */
	public Article buildArticle(String title,String description,String url,String picUrl) {
		Article article = new Article();
		article.setTitle(title);
		article.setDescription(description);
		article.setUrl(url);
		article.setPicUrl(picUrl);
		return article;
	}
	
	/*
	 * 构造一组图文消息
	 */
	public ArticleMessage buildArticleMessage(List<Article> articles) {
		ArticleMessage articleMessage = new ArticleMessage();
		articleMessage.setArticles(articles);
		articleMessage.setArticleCount(articles.size());
		articleMessage.setCreateTime(new Date().getTime());
		articleMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
		return articleMessage;
	}
	
}
