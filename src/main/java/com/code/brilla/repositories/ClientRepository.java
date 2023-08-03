/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code.brilla.repositories;
import com.code.brilla.models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author emilio
 */
@Repository
public interface ClientRepository extends JpaRepository<ClientModel, Integer> {
    //@Query("SELECT p FROM ECOMMERCE_PRODUCTO p WHERE p.PRECIO >= 100")
    //List<Object>  buscarProductosPorCriterios();
}