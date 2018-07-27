package com.swiftfingers.test1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.swiftfingers.test1.model.Article;
import com.swiftfingers.test1.repository.ArticleRepository;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService{
	 @Autowired
	 ArticleRepository articleRepository;

	 @Override
	 public List<Article> getAllArticles() {
	  return (List<Article>) articleRepository.findAll();
	 }

	 @Override
	 public Article getArticleById(long id) {
	  return articleRepository.findOne(id);
	 }

	 @Override
	 public void saveOrUpdate(Article article) {
	  articleRepository.save(article);
	 }

	 @Override
	 public void deleteArticle(long id) {
	  articleRepository.delete(id);
	 }

}
