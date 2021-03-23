package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderDetailStatus {

    ORDERING(0,"대기","배송 대기 상태"),
    COMPLETE(1,"완료","배송 완료 상태"),
    CONFIRM(2,"배송중","배송중");

    private Integer id;
    private String title;
    private String description;


}
