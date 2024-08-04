package com.devteria.identify_service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateRequest {  //ko có trường id nhes
    private String password;
    private String firstName;
    private String userName;
    private String lastName;
    private LocalDate dob;
}
