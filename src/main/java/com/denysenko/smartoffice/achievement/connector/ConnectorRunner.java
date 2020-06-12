package com.denysenko.smartoffice.achievement.connector;

import com.denysenko.smartoffice.achievement.enums.ConnectorType;
import com.denysenko.smartoffice.achievement.model.Connector;

public interface ConnectorRunner {
    ConnectorType getType();
    void readMetrics(Connector connector);
}
