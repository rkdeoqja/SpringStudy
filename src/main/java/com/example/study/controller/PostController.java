package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") //스프링에서는 중복된 주소값을 가지고있을때 실행하지 못하지만 주소단위는 메서드이기때문에 클래스의 맵핑은 겹쳐도 영향을 주지않는다
public class PostController {

    //HTML <Form>
    //ajax 검색
    //http post body ->data
    // json,xml,multipart-form / text-plain

    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){

        return searchParam;
    }

    @PutMapping("/putMethod")
    public void put(){

    }

    @PatchMapping("/patchMethod")
    public void patch(){

    }



}
