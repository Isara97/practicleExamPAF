package com.rst.boot.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "paymentAccount")
public class PaymentDTO implements Serializable {

    //id
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "payment_id", length = 10, nullable = false)
    private Integer id;
    //card name
    @Column(name = "card_name", length = 30, nullable = false)
    private String cardName;
    //credit crd number
    @Column(name = "card_number", length = 10, nullable = false)
    private Integer cardNumber;
    //exp month
    @Column(name = "expire_month", length = 10,nullable = false)
    private String month;
    //cvv
    @Column(name = "cvv_code", length = 3,nullable = false)
    private Integer cvvCode;
    //year
    @Column(name = "expire_year",length = 4,nullable = false)
    private String year;
    //full name
    @Column(name = "full_name",length = 30,nullable = false)
    private String fullName;
    //email
    @Column(name = "email",length = 60,nullable = false)
    private String email;
    //address
    @Column(name = "address",length = 100,nullable = false)
    private String address;
    //city
    @Column(name = "city",length = 60,nullable = false)
    private String city;
    //zip
    @Column(name = "zipCode",length = 5,nullable = false)
    private String zipCode;
    //state
    @Column(name = "state",length = 20,nullable = false)
    private String state;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public Integer getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getCvvCode() {
        return cvvCode;
    }

    public void setCvvCode(Integer cvvCode) {
        this.cvvCode = cvvCode;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
