package com.example.study.controller.api;

import com.example.study.ifs.CrudInterface;
import com.example.study.model.network.Header;
import com.example.study.model.network.request.OrderDetailApiRequest;
import com.example.study.model.network.response.OrderDetailApiResponse;
import com.example.study.repository.OrderDetailRepository;
import com.example.study.service.OrderDetailApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orderDetail")
public class OrderDetailApiController implements CrudInterface<OrderDetailApiRequest, OrderDetailApiResponse> {

    @Autowired
    OrderDetailApiLogicService orderDetailApiLogicService;

    @Override
    @PostMapping("")
    public Header<OrderDetailApiResponse> create(@RequestBody Header<OrderDetailApiRequest> request) {
        return orderDetailApiLogicService.create(request);
    }

    @Override
    @GetMapping({"{id}"})
    public Header<OrderDetailApiResponse> read(@PathVariable Long id) {
        return orderDetailApiLogicService.read(id);
    }

    @Override
    public Header<OrderDetailApiResponse> update(Header<OrderDetailApiRequest> request) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }
}
