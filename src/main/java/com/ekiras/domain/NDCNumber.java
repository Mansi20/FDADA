package com.ekiras.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class NDCNumber {


	
	   @Id
	    @GeneratedValue
	    @Column(name = "id")
	    private Long ndctId;

	    @Column(name = "ndc_number")
	    private Long ndcNumber;
	    

}
