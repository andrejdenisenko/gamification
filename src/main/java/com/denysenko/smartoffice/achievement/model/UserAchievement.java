package com.denysenko.smartoffice.achievement.model;


import com.denysenko.smartoffice.core.model.User;
import lombok.Data;

@Data
public class UserAchievement {

    private User user;
    private Achievement achievement;
    // 0-100
    private Integer status;
    // status == 100
    private Boolean win;

}
