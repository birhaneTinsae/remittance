/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.remittance.Remittance.services;

import com.remittance.Remittance.Repos.BranchRepository;

import com.remittance.Remittance.models.Branch;
import com.remittance.Remittance.utils.Common;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 *
 * @author btinsae
 */
@Service
public class BranchService implements Common<Branch> {

    @Autowired
    BranchRepository repository;

    @Override
    public Branch store(Branch t) {
     return repository.save(t);
    }

    @Override
    public Branch show(long id) {
       return repository.findById(id).get();
    }

    @Override
    public Branch update(Branch t) {
      return repository.save(t);
    }

    @Override
    public boolean delete(long id) {
        repository.deleteById(id);
        return !repository.findById(id).isPresent();
       
    }

    @Override
    public List<Branch> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Page<Branch> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

}
