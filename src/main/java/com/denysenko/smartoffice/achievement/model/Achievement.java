package com.denysenko.smartoffice.achievement.model;

import com.denysenko.smartoffice.achievement.enums.ConnectorMetricType;
import lombok.Data;

@Data
public class Achievement {

    private String name;
    private String icon;
    private Connector connector;
    private ConnectorMetricType connectorMetricType;
    private Integer goal;
}
