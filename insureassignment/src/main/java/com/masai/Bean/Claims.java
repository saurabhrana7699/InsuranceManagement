package com.masai.Bean;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Claims {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotNull
	    private String claimNumber;

	    @NotNull
	    private String description;

	    @NotNull
	    private LocalDate claimDate;

	    @NotNull
	    private String claimStatus;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "insurance_policy_id", nullable = false)
	    private Insurance insurancePolicy;

}
