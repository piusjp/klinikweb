/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.KlinikWeb.Repositories;

import com.KlinikWeb.Entities.pasienEntity;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 *
 * @author HP
 */
@RestResource
public interface pasienRepository extends JpaRepository<pasienEntity, Long>{
    
    public List<pasienEntity> findPasienEntitiesByNamaPasien(String namaPasien);
}
