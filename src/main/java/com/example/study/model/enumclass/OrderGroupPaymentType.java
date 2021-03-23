package com.example.study.model.enumclass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderGroupPaymentType {

    CARD(0,"카드","카드 결제"),
    BANK_TRANSFER(1,"계좌이체","계좌 이체"),
    CHECK_CARD(2,"체크카드","체크카드");

    private Integer id;
    private String title;
    private String description;
}
