package com.scalefocus.tracker.tracker.services;

import com.scalefocus.tracker.tracker.entity.Rim;

import java.util.List;

public interface RimService {

    List<Rim> getAllRims();
    Rim saveRim(Rim rimToSave);
    void deleteRim(Rim rimToDelete);
    Rim getRimById(Integer id);
    Rim updateRim(Rim rimToUpdate);
}
