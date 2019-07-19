/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.remittance.Remittance.utils;

import java.util.List;

/**
 *
 * @author btinsae
 * @param <T>
 */
public interface Common<T> {
   T store(T t);
   T show(long id);
   T update(T t);
   boolean delete(long id);

    /**
     *
     * @return
     */
    List<T> getAll();
    
            
}
