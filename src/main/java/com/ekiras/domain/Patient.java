package com.ekiras.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Patient {

    @Id
    @GeneratedValue
    @Column(name = "pid")
    private Long patientId;

    @Column(name = "sex")
    private String patientsex;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name =" patientId")
    private Set<PatientReactions> reaction;
 
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name =" patientId")
    private Set<Drugs> drug;

    

//    @Type( type = "json" )
//    @Column( columnDefinition = "json" )
//    private String[] product_ndc;
//
//    
//    @Type( type = "json" )
//    @Column( columnDefinition = "json" )
//    private String[] manufacturer_name;
//
//
       
}
