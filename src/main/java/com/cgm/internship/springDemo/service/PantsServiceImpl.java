package com.cgm.internship.springDemo.service;

import com.cgm.internship.springDemo.model.Pants;
import com.cgm.internship.springDemo.repository.PantsRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("pantsService")
@Scope("singleton")
public class PantsServiceImpl implements PantsService {

    private PantsRepository pantsRepository;
    private static Logger logger = LogManager.getLogger(PantsServiceImpl.class);

    public PantsServiceImpl() {

    }

//    @Autowired
    public PantsServiceImpl(PantsRepository pantsRepository) {
        this.pantsRepository = pantsRepository;
    }

    @Override
    public List<Pants> findAll() {
        return pantsRepository.findAll();
    }

    @Autowired
    public void setTshirtRepository(PantsRepository pantsRepository) {
        this.pantsRepository = pantsRepository;
        logger.info("Setter injection used.");

    }
}
