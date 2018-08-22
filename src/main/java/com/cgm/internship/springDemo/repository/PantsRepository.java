package com.cgm.internship.springDemo.repository;

import com.cgm.internship.springDemo.model.Pants;

import java.util.List;

public interface PantsRepository {
    List<Pants> findAll();
}
