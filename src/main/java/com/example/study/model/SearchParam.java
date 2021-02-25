package com.example.study.model;

import lombok.AllArgsConstructor;
import lombok.Data;
//compile 'org.projectlombok:lombok:1.18.10'             그래들파일에 디펜던시에 추가해준다
//annotationProcessor 'org.projectlombok:lombok:1.18.10'  그래들파일에 디펜던시에 추가해준다


@Data                   //자동적으로 기본생성자와 get set메서드를 만들어주는 어노테이션
@AllArgsConstructor        //모든 매개변수를 가진 생성자를 추가하는 어노테이션
public class SearchParam {

    private String account;
    private String email;
    private int page;
    //{"account":"", "email":"","page":0}


    /*
    public SearchParam(){

    }

    public SearchParam(String account){
        this.account = account;
    }

    public SearchParam(String account,String email,int page){
        this.account = account;
        this.email = email;
        this.page = page;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    */

}
