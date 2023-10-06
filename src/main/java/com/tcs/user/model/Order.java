package com.tcs.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Long productId;
    private Long userId;
}