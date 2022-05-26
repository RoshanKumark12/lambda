package org.example.Entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private String name;
    private String address;
    private int rollno;
}
