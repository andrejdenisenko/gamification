package com.denysenko.smartoffice.achievement.model;


import com.denysenko.smartoffice.core.model.User;
import lombok.Data;

@Data
public class UserAchievement {

    private User user;
    private Achievement achievement;
    private Integer status;
    private Boolean win;

}
