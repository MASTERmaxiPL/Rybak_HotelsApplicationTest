package com.example.rybak_kl2tc_sprawdzian.remote.rest.api.dto.response;

import java.math.BigDecimal;

public class RoomsDto {
    private int id;
    private int beds;
    private BigDecimal price;

    public RoomsDto() {
    }

    public RoomsDto(int id, int beds, BigDecimal price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
