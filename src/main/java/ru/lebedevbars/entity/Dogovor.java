package ru.lebedevbars.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Dogovor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID dogovor_id;
    private String dog_no;
    private String dog_date;
    private String update_time;
    private Boolean is_updated;

    public Dogovor() {
    }

    public UUID getDogovor_id() {
        return dogovor_id;
    }

    public void setDogovor_id(UUID dogovor_id) {
        this.dogovor_id = dogovor_id;
    }

    public String getDog_no() {
        return dog_no;
    }

    public void setDog_no(String dog_no) {
        this.dog_no = dog_no;
    }

    public String getDog_date() {
        return dog_date;
    }

    public void setDog_date(String dog_date) {
        this.dog_date = dog_date;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Boolean getIs_updated() {
        return is_updated;
    }

    public void setIs_updated(Boolean is_updated) {
        this.is_updated = is_updated;
    }
}
