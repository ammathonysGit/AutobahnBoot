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
    private String repeat;

    public String getRepeat() {
        return repeat;
    }

    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
