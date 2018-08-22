package com.cgm.internship.springDemo.service;

import com.cgm.internship.springDemo.model.Tshirt;
import com.cgm.internship.springDemo.repository.TshirtRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tshirtService")
@Scope("prototype")
public class TshirtServiceImpl implements TshirtService {

    private TshirtRepository tshirtRepository;
    private static Logger logger = LogManager.getLogger(TshirtServiceImpl.class);

    public TshirtServiceImpl() {

    }

    @Autowired
    public TshirtServiceImpl(TshirtRepository tshirtRepository) {
        this.tshirtRepository = tshirtRepository;
        logger.info("Constructor injection used.");
    }

    @Override
    public List<Tshirt> findAll() {
        return tshirtRepository.findAll();
    }


    public void setTshirtRepository(TshirtRepository tshirtRepository) {
        this.tshirtRepository = tshirtRepository;

    }
}