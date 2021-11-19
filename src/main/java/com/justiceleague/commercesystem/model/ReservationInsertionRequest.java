package com.justiceleague.commercesystem.model;

import java.time.LocalDate;
import java.util.Date;

public class ReservationInsertionRequest {
    private Integer user_id;
    private Integer cubicle_id;
    private LocalDate start_date;
    private LocalDate end_date;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getCubicle_id() {
        return cubicle_id;
    }

    public void setCubicle_id(Integer cubicle_id) {
        this.cubicle_id = cubicle_id;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }
}
