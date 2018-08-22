package com.cgm.internship.springDemo.repository;

import com.cgm.internship.springDemo.model.Pants;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("pantsRepository")
public class HibernatePantsRepositoryImpl implements PantsRepository{

    @Override
    public List<Pants> findAll() {
        List<Pants> pantsList = new ArrayList<>();

        Pants pants = new Pants();
        pants.setSize("XL");
        pants.setColor("Brown");
        pants.setMadeIn("Romania");
        pants.setMaterial("Cotton");
        pants.setType("Slim-fit");
        pantsList.add(pants);

        return pantsList;
    }
}
