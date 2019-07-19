/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.remittance.Remittance.controllers;

import com.remittance.Remittance.utils.Common;
import com.remittance.Remittance.models.User;
import com.remittance.Remittance.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author btinsae
 */
@Controller("/user")
public class UserController implements Common<User> {

    @Autowired
    UserService service;

    @PostMapping
    @Override
    public User store(User t) {
        return service.store(t);
    }

    @GetMapping("/{id}")
    @Override
    public User show(@PathVariable("id") long id) {
        return service.show(id);
    }

    @PutMapping("/{id}")
    @Override
    public User update(User t) {
        return service.update(t);
    }

    @DeleteMapping("/{id}")
    @Override
    public boolean delete(long id) {
        return service.delete(id);
    }

    @GetMapping()
    public Page<User> getAll(@RequestParam(defaultValue = "0") String page,
            @RequestParam(defaultValue = "10") String size,
            @RequestParam(required = false) String sortBy) {
        Pageable pageable = null;
        if (sortBy != null) {
            pageable = PageRequest.of(Integer.parseInt(page), Integer.parseInt(size), Sort.by(sortBy));
        } else {
            pageable = PageRequest.of(Integer.parseInt(page), Integer.parseInt(size));
        }

        return service.getAll(pageable);
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
