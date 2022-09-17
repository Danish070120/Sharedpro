package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Builder
@Table(name = "professor")
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "professor_id")
	private int professorId;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee employee;

}
