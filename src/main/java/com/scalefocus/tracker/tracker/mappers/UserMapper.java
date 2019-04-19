package com.scalefocus.tracker.tracker.mappers;

import com.scalefocus.tracker.tracker.entity.User;
import com.scalefocus.tracker.tracker.model.bindingmodels.AccountBindingModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    AccountBindingModel userToAccountBindingModel(User user);

    User accountBindingModelToUser(AccountBindingModel accountBindingModel);

    //if it breaks @Context CycleAvoidingMappingContext context in bouth of the methods.
}
