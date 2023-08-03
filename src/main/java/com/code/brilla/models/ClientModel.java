/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.code.brilla.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author emilio
 */
@Entity(name="CLIENTE")
@Data
public class ClientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private int id;
    @Column(name = "ID_USUARIO")
    private int userId;
    @Column(name = "GENERO", columnDefinition = "CHAR",length =1)
    private char gender;
    @Column(name = "LUGAR_EXPEDICION_DOCUMENTO", columnDefinition = "CHAR",length =5)
    private String documentIssuancePlaceholder;
    @Column(name = "FECHA_NACIMIENTO", columnDefinition = "date", length =3, precision = 10, nullable = false)
    private String birthDate;
    @Column(name = "FECHA_EXPEDICION_DOCUMENTO", columnDefinition = "date", length =3, precision = 10, nullable = false)
    private String documentIssueDate;
    @OneToOne
    @JoinColumn(name = "userId")
    private UserModel user;
}
