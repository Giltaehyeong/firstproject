package com.example.firstproject.dto;

public class ArticleForm {
    
    private String title;
    private String content;

    //생성자란? -> 인스턴스 초기화 메서드
    // 변수의 초기화 작업에 주로 사용되어 인스턴스 생성 시에 실행되어야 할 작업을 위해서도 사용된다.
    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    //데이터가 잘 받아졌는지 확인하기 위해 toString() 메서드를 제너레이트 해준다.
    //@Override란? -> 자식 클래스에 여러 개의 메서드가 있을 경우, 어떤 메서드가 Override 되었는지 쉽게 알기 어렵습니다.
    //이 때, 오버라이드 메서드를 사용하여 명시적으로 선언하게 되면 많은 메서드 중에서 어떠한 메서드가 부모 클래스로부터 오버라이딩이 되었는지 쉽게 파악
    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

}
