package com.example.rybak_kl2tc_sprawdzian.remote.rest.api.dto.request;

public class ReservatedRoomsDto {
    private int id;
    private int roomId;
    private int days;

    public ReservatedRoomsDto() {
    }

    public ReservatedRoomsDto(int id, int roomId, int days) {
        this.id = id;
        this.roomId = roomId;
        this.days = days;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
