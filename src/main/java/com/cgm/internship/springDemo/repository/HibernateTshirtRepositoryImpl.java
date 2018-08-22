package com.cgm.internship.springDemo.repository;

import com.cgm.internship.springDemo.model.Tshirt;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("tshirtRepository")
public class HibernateTshirtRepositoryImpl implements TshirtRepository{

    @Override
    public List<Tshirt> findAll() {
        List<Tshirt> tshirts = new ArrayList<>();

        Tshirt tshirt = new Tshirt();
        tshirt.setSize("M");
        tshirt.setColor("White");
        tshirt.setMadeIn("China");
        tshirt.setMaterial("Cotton");
        tshirt.setType("Slim-fit");
        tshirts.add(tshirt);

        return tshirts;
    }
}
