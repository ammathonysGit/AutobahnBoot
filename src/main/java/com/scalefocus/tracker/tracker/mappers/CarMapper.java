package com.scalefocus.tracker.tracker.mappers;

import com.scalefocus.tracker.tracker.entity.Car;
import com.scalefocus.tracker.tracker.model.bindingmodels.CarBindingModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    CarBindingModel carToBindingModel(Car car);

    Car bindingModelToCar(CarBindingModel carBindingModel);

    //if it breaks @Context CycleAvoidingMappingContext context in bouth of the methods.

}
