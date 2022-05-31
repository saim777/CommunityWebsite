package com.communitywebsite.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;

	@NotNull
    @Column(name = "email")
    private String email;
     
    @Column(nullable = false, length = 64)
    private String password;
     
    @Column(name = "first_name", nullable = false, length = 20)
    private String firstName;
     
    @Column(name = "last_name", nullable = false, length = 20)
    private String lastName;

	@Column(nullable = false, length = 10)
	private Long mobileNo;


	@Column(unique = true, nullable = false, length = 15)
	private Long enrollmentNo;

	@Column(nullable = false, length = 64)
	private String collegeName;

	@Column(nullable = false, length = 4)
	private int yearOfAddmission;

	@Column(nullable = false, length = 64)
	private String courseName;

	@Column(nullable = true, length = 64)
	private String courseStream;
}
