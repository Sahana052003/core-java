package com.xworkz.customclass.runner;

import com.xworkz.customclass.dto.StudentDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {


        List<StudentDTO> list=new ArrayList<>();

        list.add(new StudentDTO(27,"Karthik"));
        list.add(new StudentDTO(23,"nandushree"));
        list.add(new StudentDTO(22,"Muktha"));

        Collections.sort(list);
        System.out.println(list);
    }
}
