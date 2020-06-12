package com.denysenko.smartoffice.achievement.service.impl;

import com.denysenko.smartoffice.achievement.connector.ConnectorRunner;
import com.denysenko.smartoffice.achievement.enums.ConnectorType;
import com.denysenko.smartoffice.achievement.model.Connector;
import com.denysenko.smartoffice.achievement.service.AchievementService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class AchievementServiceImpl implements AchievementService {

    private final List<ConnectorRunner> connectorRunnerList;

    public AchievementServiceImpl(List<ConnectorRunner> connectorRunnerList) {
        this.connectorRunnerList = connectorRunnerList;
    }

    @Override
    public void readAllMetrics() {

        List<Connector> connectors = new ArrayList<>();

        Connector gitLabUaInComConnector = new Connector();
        gitLabUaInComConnector.setName("gitlab.ua-in.com");
        gitLabUaInComConnector.setType(ConnectorType.GITLAB);

        connectors.add(gitLabUaInComConnector);

        connectors.forEach(connector -> {
            getConnectorRunner(connector.getType())
                    .readMetrics(connector);
        });

    }

    private ConnectorRunner getConnectorRunner(ConnectorType connectorType) {

        return this.connectorRunnerList.stream()
                .filter(connectorRunner -> Objects.equals(connectorRunner.getType(), connectorType))
                .findAny()
                .orElse(null);
    }
}
