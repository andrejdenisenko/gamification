package com.denysenko.smartoffice.achievement.model;

import com.denysenko.smartoffice.achievement.enums.ConnectorType;
import lombok.Data;

@Data
public class Connector {

    private String name;
    private ConnectorType type;
}
