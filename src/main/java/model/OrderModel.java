package model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderModel {

    private String firstName;
    private String lastName;
    private String address;
    private String metroStation;
    private String phone;
    private String deliveryDate;
    private Integer rentTime;
    private List<String> color;
    private String comment;


    public OrderModel(String firstName, String lastName, String address, String metroStation,
                      String phone, String deliveryDate, Integer rentTime, List<String> color,
                      String comment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.metroStation = metroStation;
        this.phone = phone;
        this.deliveryDate = deliveryDate;
        this.rentTime = rentTime;
        this.color = color;
        this.comment = comment;
    }
}