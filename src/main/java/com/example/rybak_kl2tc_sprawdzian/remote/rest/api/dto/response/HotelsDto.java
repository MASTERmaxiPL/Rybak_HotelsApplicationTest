package com.example.rybak_kl2tc_sprawdzian.remote.rest.api.dto.response;

import java.util.List;

public class HotelsDto {
    private int id;
    private String name;
    private List<RoomsDto> ListOfRooms;

    public HotelsDto() {
    }

    public HotelsDto(int id, String name, List<RoomsDto> listOfRooms) {
        this.id = id;
        this.name = name;
        ListOfRooms = listOfRooms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoomsDto> getListOfRooms() {
        return ListOfRooms;
    }

    public void setListOfRooms(List<RoomsDto> listOfRooms) {
        ListOfRooms = listOfRooms;
    }
}
