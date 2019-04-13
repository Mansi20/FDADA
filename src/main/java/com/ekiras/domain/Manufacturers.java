package com.ekiras.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Manufacturers {

	
	
	    @Id
	    @GeneratedValue
	    @Column(name = "id")
	    private Long manufacturerId;

	    @Column(name = "manufacturer_name")
	    private String manufacturerName;
	    
	    @Column(name = "manufacturer_UNII")
	    private String manufacturerUNII;
	    
}
