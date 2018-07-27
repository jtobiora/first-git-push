package com.swiftfingers.test1.repository;

import org.springframework.data.repository.CrudRepository;

import com.swiftfingers.test1.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
