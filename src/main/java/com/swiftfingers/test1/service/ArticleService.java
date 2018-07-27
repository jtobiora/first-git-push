package com.swiftfingers.test1.service;

import java.util.List;

import com.swiftfingers.test1.model.Article;

public interface ArticleService {
	 public List<Article> getAllArticles();
	 
	 public Article getArticleById(long id);
	 
	 public void saveOrUpdate(Article article);
	 
	 public void deleteArticle(long id);
}
