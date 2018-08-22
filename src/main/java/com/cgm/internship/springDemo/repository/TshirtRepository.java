package com.cgm.internship.springDemo.repository;

import com.cgm.internship.springDemo.model.Tshirt;

import java.util.List;

public interface TshirtRepository {

        List<Tshirt> findAll();

}
