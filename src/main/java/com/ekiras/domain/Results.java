package com.ekiras.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.lattice.constants.DBconstants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Results {
	
	 @Id
	    @GeneratedValue
	    @Column(name = "id")
	    private Long resultId;

String	receivedate;
	
@OneToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
@JoinColumn(name = "id")
private Patient patient;
}
