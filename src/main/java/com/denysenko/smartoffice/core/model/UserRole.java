package com.denysenko.smartoffice.core.model;

import com.denysenko.smartoffice.core.enums.Role;
import lombok.Data;

@Data
public class UserRole {

    private User user;
    private Role role;

}
