package com.w3g.springbootjwt.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter @NoArgsConstructor
public class UserData implements Serializable {
    private String username;
    private String password;



}
