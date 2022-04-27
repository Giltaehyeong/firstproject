package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor //생성자
@ToString //toString()
//Refactoring 했네 ~
public class ArticleForm {
    
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(null, title, content);
        //반환해줌 뭐를? Article entity 객체 
    }
}
