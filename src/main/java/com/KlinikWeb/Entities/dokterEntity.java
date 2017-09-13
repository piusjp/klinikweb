/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.KlinikWeb.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author HP
 */
@Entity
@Data
public class dokterEntity {

    public dokterEntity() {
    }

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDokter;

    @Column
    private String ktpDokter;

    @Column
    private String namaDokter;
    
    @Column
    private String spesialisDokter;
    
    @Column
    private String alamatDokter;
    
    @Column
    private String kontakDokter;
    
    @Column
    private String tanggalLahirDokter;
    
    @Column
    private String tempatLahirDokter;
}
