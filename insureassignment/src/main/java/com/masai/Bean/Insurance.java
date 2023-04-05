package com.masai.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;
import org.springframework.data.annotation.Id;

import ch.qos.logback.core.net.server.Client;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Insurance {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotNull
	    private String policyNumber;

	    @NotNull
	    private String type;

	    @NotNull
	    private Double coverageAmount;

	    @NotNull
	    private Double premium;

	    @NotNull
	    private LocalDate startDate;

	    @NotNull
	    private LocalDate endDate;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "client_id", nullable = false)
	    private Client client;

	    @OneToMany(mappedBy = "insurancePolicy", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Claims> claims = new ArrayList<>();

}