/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.remittance.Remittance.services;

import com.remittance.Remittance.Repos.UserRepository;
import com.remittance.Remittance.models.User;
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
public class UserService implements Common<User> {

    @Autowired
    UserRepository repository;

    @Override
    public User store(User t) {
        return repository.save(t);
    }

    @Override
    public User show(long id) {
        return repository.findById(id).get();
    }

    @Override
    public User update(User t) {
        return repository.save(t);
    }

    @Override
    public boolean delete(long id) {
        repository.deleteById(id);
        return !repository.findById(id).isPresent();
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    public Page<User> getAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

}
