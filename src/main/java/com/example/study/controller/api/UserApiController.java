package com.example.study.controller.api;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.UserApiRequest;
import com.example.study.model.network.response.UserApiResponse;
import com.example.study.service.UserApiLogicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController implements CrudInterface<UserApiRequest,UserApiResponse> {

    @Autowired
    private UserApiLogicService userApiLogicService;

    @Override
    @PostMapping("")    // /api/user        //Create
    public Header<UserApiResponse> create(@RequestBody Header<UserApiRequest> request) {
        log.info("{}",request);
        return userApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}") // /api/user/{id}   //Read
    public Header<UserApiResponse> read(@PathVariable(name = "id") Long id) {
        log.info("read id:{}",id);
        return userApiLogicService.read(id);
    }

    @Override
    @PutMapping("")                         //Update
    public Header<UserApiResponse> update(@RequestBody Header<UserApiRequest> request) {
        return userApiLogicService.update(request);
    }

    @Override                                   //Delete
    @DeleteMapping("{id}")  // /api/user/{id}
    public Header<UserApiResponse> delete(@PathVariable Long id) {
        log.info("delete: {}",id);
        return userApiLogicService.delete(id);
    }
}
