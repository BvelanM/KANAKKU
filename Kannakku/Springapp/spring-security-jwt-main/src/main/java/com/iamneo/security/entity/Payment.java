package com.iamneo.security.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String email;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String payeeAccountHolderName;
    private String payeeAccountId;
    private String ifscCode;
    private String note;
    private boolean addToRecord;

    // Constructors, Getters, and Setters (Omitted for brevity)

}
