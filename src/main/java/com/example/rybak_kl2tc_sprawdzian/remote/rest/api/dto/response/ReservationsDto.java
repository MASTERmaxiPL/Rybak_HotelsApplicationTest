package com.example.rybak_kl2tc_sprawdzian.remote.rest.api.dto.response;

import com.example.rybak_kl2tc_sprawdzian.domain.model.ReservationStatusType;
import com.example.rybak_kl2tc_sprawdzian.remote.rest.api.dto.request.PersonDto;
import com.example.rybak_kl2tc_sprawdzian.remote.rest.api.dto.request.RoomsReservationDto;

import java.util.List;

public class ReservationsDto {
    private int id;
    private ReservationStatusType status;
    private List<RoomsReservationDto> listOfRooms;
    private PersonDto person;

    public ReservationsDto() {
    }

    public ReservationsDto(int id, ReservationStatusType status, List<RoomsReservationDto> listOfRooms, PersonDto person) {
        this.id = id;
        this.status = status;
        this.listOfRooms = listOfRooms;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ReservationStatusType getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusType status) {
        this.status = status;
    }

    public List<RoomsReservationDto> getListOfRooms() {
        return listOfRooms;
    }

    public void setListOfRooms(List<RoomsReservationDto> listOfRooms) {
        this.listOfRooms = listOfRooms;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
