package com.devteria.identify_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@NoArgsConstructor  // hafm tao ko tham so
@AllArgsConstructor // ham tao 1 tham so
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)  //random id
    private String id;
    private String password;
    private String firstName;
    private String userName;
    private String lastName;
    private LocalDate dob;
}
