package com.scalefocus.tracker.tracker.mappers;

import com.scalefocus.tracker.tracker.entity.User;
import com.scalefocus.tracker.tracker.model.bindingmodels.AccountBindingModel;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-04-19T18:16:15+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public AccountBindingModel userToAccountBindingModel(User user) {
        if ( user == null ) {
            return null;
        }

        AccountBindingModel accountBindingModel = new AccountBindingModel();

        return accountBindingModel;
    }

    @Override
    public User accountBindingModelToUser(AccountBindingModel accountBindingModel) {
        if ( accountBindingModel == null ) {
            return null;
        }

        User user = new User();

        return user;
    }
}
