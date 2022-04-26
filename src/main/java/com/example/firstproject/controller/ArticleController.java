package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
//1. 컨트롤러 생성.
public class ArticleController {


    @GetMapping("/articles/new")
    //3. 브라우저에서 접속하는 URL 주소
    public String newArticleForm(){
        return "articles/new";
        //2. View 페이지 정보
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        return "";
    }
}
