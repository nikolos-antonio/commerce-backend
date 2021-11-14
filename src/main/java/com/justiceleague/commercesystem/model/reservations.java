package com.justiceleague.commercesystem.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date start_date;
    private Date end_date;

    @ManyToOne
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    private users user;

    @ManyToOne
    @JoinColumn(name = "cubicles_id", referencedColumnName = "id")
    private cubicles cubicle;

    public users getUser() {
        return user;
    }

    public void setUser(users user) {
        this.user = user;
    }

    public cubicles getCubicle() {
        return cubicle;
    }

    public void setCubicle(cubicles cubicle) {
        this.cubicle = cubicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
