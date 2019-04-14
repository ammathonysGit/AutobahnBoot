package com.scalefocus.tracker.tracker.model.bindingmodels;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountBindingModel {

    private Integer id;
    private String username;
    private String password;
}
