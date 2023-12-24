package com.example.studentservice.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Getter
@Setter
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long prn;
	private String firstname;
	private String lastname;
	private String email;
	private String address;
	private float marks;
	private String department;


@OneToMany(cascade=CascadeType.ALL)
	private List<SudentCompleteDetails> studentCompleteDetails;


}
