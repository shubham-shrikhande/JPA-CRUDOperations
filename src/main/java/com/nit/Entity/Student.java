package com.nit.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity

@Table
@Data
@AllArgsConstructor
public class Student implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	public Student(String name, char[] resume, byte[] photo) {
		super();
		this.name = name;
		this.resume = resume;
		this.photo = photo;
	}
	@Column
	private String name;
	@Lob
	private char[] resume;
	@Lob
	private byte[] photo;
	
	
}
