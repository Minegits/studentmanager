package com.zzw.studentmanager.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private Integer id;
    private String name;
    private String password;

    public Teacher(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
