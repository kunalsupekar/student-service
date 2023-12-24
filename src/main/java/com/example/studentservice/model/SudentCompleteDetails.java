package com.example.studentservice.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class SudentCompleteDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String FatherName;
    private String MotherName;
    private String Occupation;

}
