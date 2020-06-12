package com.denysenko.smartoffice.achievement.connector.impl;

import com.denysenko.smartoffice.achievement.connector.ConnectorRunner;
import com.denysenko.smartoffice.achievement.enums.ConnectorType;
import com.denysenko.smartoffice.achievement.model.Connector;
import org.gitlab.api.GitlabAPI;
import org.gitlab.api.models.GitlabProject;
import org.springframework.stereotype.Component;

@Component
public class GitLabConnectorRunner implements ConnectorRunner {

    @Override
    public ConnectorType getType() {
        return ConnectorType.GITLAB;
    }

    @Override
    public void readMetrics(Connector connector) {

        GitlabAPI gitLabApi = GitlabAPI.connect("gitlab.ua-in.com", "w1AiZoY3aGpyh_ymzaxF");
        for (GitlabProject glp : gitLabApi.getProjects()) {
            System.out.println(glp.getName());
        }
    }


}
