package com.bitcamp.web.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;



@NoArgsConstructor(access=AccessLevel.PROTECTED)
@Getter
@ToString
@Entity
@Table(name= "customers")
public class Customer  implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_id") private String customerId;
    @Column(name = "customer_name") private String customerName;
    @Column(name = "password") private String password;
    @Column(name = "ssn") private String ssn;
    @Column(name = "phone") private String phone;
    @Column(name = "city") private String city;
    @Column(name = "address") private String address;
    @Column(name = "postalcode") private String postalcode;
    @Column(name = "photo") private String photo;
    // @Column(name = "created_at") private Date createAt;
    // @Column(name = "updated_at") private Date updatedAt;

 
    @Override
    public String toString() {
        return String.format("Customer[customerId=%d, password='%s', customerName='%s']", customerId, password, customerName);
    }
    @Builder
    private Customer(String customerId, 
                    String password, 
                    String customerName,
                    String ssn,
                    String phone,
                    String city,
                    String address,
                    String postalcode,
                    String photo) {
		this.customerId = customerId;
        this.password = password;
        this.customerName = customerName;
        this.ssn = ssn;
        this.phone = phone;
        this.city = city;
        this.address = address;
        this.postalcode = postalcode;
        this.photo = photo;
    }
    @Builder
    private Customer(String customerId, 
                    String password, 
                    String customerName) {
		this.customerId = customerId;
        this.password = password;
        this.customerName = customerName;
	}


}