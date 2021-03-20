package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderGroupStatus {

    WAITING(0,"대기","배송 대기 상태"),
    COMPLETE(1,"완료","배송 완료 상태");

    private Integer id;
    private String title;
    private String description;


}
