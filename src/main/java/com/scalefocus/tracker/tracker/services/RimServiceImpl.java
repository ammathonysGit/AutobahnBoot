package com.scalefocus.tracker.tracker.services;

import com.scalefocus.tracker.tracker.entity.Rim;
import com.scalefocus.tracker.tracker.repository.RimsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RimServiceImpl implements RimService {

    private RimsRepository rimsRepository;

    @Autowired
    public RimServiceImpl(RimsRepository rimsRepository) {
        this.rimsRepository = rimsRepository;
    }


    @Override
    public List<Rim> getAllRims() {
        return rimsRepository.findAll();
    }

    @Override
    public Rim saveRim(Rim rimToSave) {
        return rimsRepository.saveAndFlush(rimToSave);
    }

    @Override
    public void deleteRim(Rim rimToDelete) {
        rimsRepository.delete(rimToDelete);
    }

    @Override
    public Rim getRimById(Integer id) {
        return rimsRepository.findById(id).get();
    }

    @Override
    public Rim updateRim(Rim rimToUpdate) {
        return rimsRepository.saveAndFlush(rimToUpdate);
    }
}
