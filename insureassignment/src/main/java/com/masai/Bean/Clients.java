package com.masai.Bean;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Clients {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @NotNull
	    private String name;

	    @NotNull
	    private LocalDate dateOfBirth;

	    @NotNull
	    private String address;

	    @NotNull
	    private String contactInformation;

	    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Insurance> policies = new ArrayList<>();

	
}
