package com.example.study.controller;

import com.example.study.model.SearchParam;
import com.example.study.model.network.Header;
import org.springframework.web.bind.annotation.*;

@RestController                                     //컨트롤러로 사용한다는 어노테이션
@RequestMapping("/api")                //어떤 주소로 받을건지 path를 지정 localhost:8080/api
public class GetController {
    //localhost:8080/api/getMethod
    @RequestMapping(method = RequestMethod.GET,path = "/getMethod")     //method를 get type으로받고 path는 getMethod
    public String getRequest(){

        return "Hi getMethod";
    }

    @GetMapping("/getParameter")    //localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id,@RequestParam(name = "password") String pwd){
        String password = "bbbb";
        System.out.println("id: "+id);
        System.out.println("pwd: "+pwd);

        return id+pwd;
    }

    //localhost:8080/api/getMultiParameter?account=abcd&email=study@gmail.com&page=10
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        //json형식 {"account":"", "email":"","page":0}
        return searchParam;//spring Boot에서는 jackson라이브러리를 이용하여  json으로 자동변환되어 리턴된다
    }

  /*  @GetMapping("/header")
    public Header getHeader(){

        //{"resultCode":"OK","description":"OK"}
        return  Header.builder().resultCode("OK").description("OK").build();

    }
*/
}
