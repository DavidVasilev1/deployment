package com.nighthawk.spring_portfolio.mvc.person;

import lombok.Data;

@Data
public class PersonRequest {
    private String email;
    private String password;
    private String name;
    private String dob;
}
