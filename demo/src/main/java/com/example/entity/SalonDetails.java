package com.example.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@ToString
public class SalonDetails {

    @Value("${SalonDetails.name}")
    private String name;
    @Value("${SalonDetails.address}")
    private String address;
    @Value("${SalonDetails.city}")
    private String city;
    @Value("${SalonDetails.state}")
    private String state;
    @Value("${SalonDetails.zipcode}")
    private int zipcode;
    @Value("${SalonDetails.phone}")
    private String phone;
    @Id
    private Long id;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
