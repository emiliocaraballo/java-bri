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
import jakarta.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author emilio
 */
@Entity(name="USUARIO")
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private int id;
    @Column(name = "NICKNAME")
    private String nickName;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "ESTADO")
    private boolean status;
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
    @OneToOne(mappedBy = "user")
    private ClientModel client;
}
