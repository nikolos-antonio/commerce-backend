package com.justiceleague.commercesystem.model;

import java.util.Date;

public class ReservationInsertionRequest {
    private Integer user_id;
    private Integer cubicle_id;
    private Date start_date;
    private Date end_date;

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

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
