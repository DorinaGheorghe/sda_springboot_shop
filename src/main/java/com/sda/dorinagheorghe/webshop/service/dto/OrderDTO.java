package com.sda.dorinagheorghe.webshop.service.dto;

import java.util.List;

public class OrderDTO {

    private long customerId;
    private List<Long> productIds;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }
}
