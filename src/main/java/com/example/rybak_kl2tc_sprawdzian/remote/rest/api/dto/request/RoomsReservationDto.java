package com.example.rybak_kl2tc_sprawdzian.remote.rest.api.dto.request;

import com.example.rybak_kl2tc_sprawdzian.remote.rest.api.dto.response.RoomsDto;

import java.util.List;

public class RoomsReservationDto {
    private int id;
    private List<ReservatedRoomsDto> listOfRooms;
    private PersonDto person;

    public RoomsReservationDto() {
    }

    public RoomsReservationDto(int id, List<ReservatedRoomsDto> listOfRooms, PersonDto person) {
        this.id = id;
        this.listOfRooms = listOfRooms;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ReservatedRoomsDto> getListOfRooms() {
        return listOfRooms;
    }

    public void setListOfRooms(List<ReservatedRoomsDto> listOfRooms) {
        this.listOfRooms = listOfRooms;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
