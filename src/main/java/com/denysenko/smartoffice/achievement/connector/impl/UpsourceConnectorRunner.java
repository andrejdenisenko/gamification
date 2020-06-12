package com.denysenko.smartoffice.achievement.connector.impl;

import com.denysenko.smartoffice.achievement.connector.ConnectorRunner;
import com.denysenko.smartoffice.achievement.enums.ConnectorType;
import com.denysenko.smartoffice.achievement.model.Connector;
import org.springframework.stereotype.Component;

@Component
public class UpsourceConnectorRunner implements ConnectorRunner {

    @Override
    public ConnectorType getType() {
        return ConnectorType.UPSOURCE;
    }

    @Override
    public void readMetrics(Connector connector) {

    }


}
