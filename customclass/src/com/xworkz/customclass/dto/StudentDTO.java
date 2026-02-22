package com.xworkz.customclass.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO implements Comparable<StudentDTO>{
    private int age;
    private String name;

    @Override
    public int compareTo(StudentDTO o) {
        return this.name.compareTo(o.name);
    }
}
