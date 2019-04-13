package com.ekiras.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PatientReactions {

	
	    @Id
	    @GeneratedValue
	    @Column(name = "reactionId")
	    private Long reactionId;

	    @Column(name = "reaction_name")
	    private String reactionmeddrapt;
//	
//	    @NotNull
//	    @Column(name =" vote", columnDefinition = "tinyint(1) default 0 COMMENT '0:not voted, 1:vote'")
//	    private int type;

	
}
