package com.ekiras.domain;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Drugs {

	

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long drugId;

    @Column(name = "drug_adminstration_route")
    private String drugadministrationroute;
    
    @Column(name = "drug_charactrization")
    private String drugcharacterization;
    
    @Column(name = "drug_route")
    private String drugroute;
    
    @Column(name = "drug_generic_name")
    private String drugGenericName;

    @Column(name = "drugindication")
    private String drugindication;

    @Column(name = "drugdosagetext")
    private String drugdosagetext;

//    @ElementCollection
//    private List<String> productType;
//
//    
//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name ="drugId")
//    private Set<Manufacturers> manufacturers;
//    
//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name ="drugId")
//    private Set<NDCNumber> ndcNumber;



}
