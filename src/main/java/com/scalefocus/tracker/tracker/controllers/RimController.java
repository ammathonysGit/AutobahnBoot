package com.scalefocus.tracker.tracker.controllers;

import com.scalefocus.tracker.tracker.constants.RimConstants;
import com.scalefocus.tracker.tracker.entity.Rim;
import com.scalefocus.tracker.tracker.services.RimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class RimController {


    private RimService rimService;

    @Autowired
    public RimController(RimService rimService) {
        this.rimService = rimService;
    }


    @RequestMapping(RimConstants.VIEW_ALL_RIMS)
    public ModelAndView viewRims(ModelAndView modelAndView) {
        List<Rim> rimList = rimService.getAllRims();

        modelAndView.addObject("rimsListOne", rimList.subList(0, 3));
        modelAndView.addObject("rimsListTwo", rimList.subList(3,6));
        modelAndView.addObject("rimsListThree", rimList.subList(6,9));
        modelAndView.setViewName("rims");

        return modelAndView;
    }


    @RequestMapping(RimConstants.VIEW_RIM_ID)
    public ModelAndView viewCurrentRim(@PathVariable Integer id, ModelAndView modelAndView) {
        modelAndView.addObject("rim", rimService.getRimById(id));
        modelAndView.setViewName("rim");

        return modelAndView;

    }

}
