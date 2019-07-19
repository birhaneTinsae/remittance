/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.remittance.Remittance.Repos;

import com.remittance.Remittance.models.Transaction;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author btinsae
 */
public interface TransactionRepository extends PagingAndSortingRepository<Transaction,Long >{
    
}
