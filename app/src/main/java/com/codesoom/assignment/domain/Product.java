package com.codesoom.assignment.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 상품 모델
 */
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String maker;

    private Integer price;

    private String imageUrl;

    /**
     * 상품 정보를 변경한다.
     * @param source 갱신될 상품 정보
     */
    public void changeWith(Product source) {
        this.name = source.name;
        this.maker = source.maker;
        this.price = source.price;
    }
}
