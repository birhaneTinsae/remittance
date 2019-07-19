/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.remittance.Remittance.models;

import java.util.Currency;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author btinsae
 */
@Data
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double amount;
    private Currency currency;
    @Enumerated(EnumType.STRING)
    private Agent agent;
    @ManyToOne
    private Branch branch;

}

enum Agent {
    WESTERNUNION, RIA, DEHABSHIL, TRANSFAST
}
