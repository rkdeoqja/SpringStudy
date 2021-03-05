package com.example.study.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;

    private String name;

    private String title;

    private String content;

    private Integer price;

    private String brandName;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredBy;

    private LocalDateTime createdAt;

    private String createBy;

    private LocalDateTime updatedAt;

    private String updatedBy;


    // 1 : N
    //LAZY=지연로딩   , EAGER = 즉시로딩
    //LAZY = select * from item where id = ?
    //LAZY = 1:N
    //EAGER = 1:1
    //item_id = order_detail.item_id
    //user_id = order_detail.user_id
    // where item.id = ?
    //JOIN item item0_ left outer join order_detail orderdetai1_ on item0_.id=orderdetai1_.item_id left outer join user user2_ on orderdetai1_.user_id=user2_.id
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "item")
//    private List<OrderDetail> orderDetailList;

}