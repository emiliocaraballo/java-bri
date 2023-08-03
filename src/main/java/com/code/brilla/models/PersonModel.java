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
import lombok.Data;

/**
 *
 * @author emilio
 */
@Entity(name="PERSONA")
@Data
public class PersonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSONA")
    private int id;
    @Column(name = "NOMBRES")
    private String names;
    @Column(name = "APELLIDOS")
    private String lastNames;
    @Column(name = "CORREO")
    private String email;
    @Column(name = "CELULAR")
    private String cellPhone;
    @Column(name = "TELEFONO")
    private String phone;
    @Column(name = "PRIMER_NOMBRE")
    private String firstName;
    @Column(name = "SEGUNDO_NOMBRE")
    private String secondName;
    @Column(name = "PRIMER_APELLIDO")
    private String surName;
    @Column(name = "SEGUNDO_APELLIDO")
    private String secondSurname;
    @Column(name = "NUM_DOCUMENTO")
    private String nroDocument;
    @Column(name = "TIPO_DOCUMENTO")
    private String typeDocument;
    @Column(name = "AUDIT_ESTADO")
    private boolean AUDIT_ESTADO;
    @Column(name = "AUDIT_FECHA_CREACION", columnDefinition = "datetime", length =8, precision = 23, nullable = false, scale = 3)
    private String AUDIT_FECHA_CREACION;
    @Column(name = "AUDIT_USUARIO_CREACION")
    private String AUDIT_USUARIO_CREACION;
        @Column(name = "AUDIT_FECHA_MODIFICACION", columnDefinition = "datetime", length =8, precision = 23, nullable = false, scale = 3)
    private String AUDIT_FECHA_MODIFICACION;
    @Column(name = "AUDIT_USUARIO_MODIFICACION")
    private String AUDIT_USUARIO_MODIFICACION;
}
