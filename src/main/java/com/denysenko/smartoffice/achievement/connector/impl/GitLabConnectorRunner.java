package com.denysenko.smartoffice.achievement.connector.impl;

import com.denysenko.smartoffice.achievement.connector.ConnectorRunner;
import com.denysenko.smartoffice.achievement.enums.ConnectorType;
import com.denysenko.smartoffice.achievement.model.Connector;
import org.gitlab.api.GitlabAPI;
import org.gitlab.api.models.GitlabProject;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class GitLabConnectorRunner implements ConnectorRunner {

    @Override
    public ConnectorType getType() {
        return ConnectorType.GITLAB;
    }

    @Override
    public void readMetrics(Connector connector) {


        GitlabAPI gitLabApi = GitlabAPI.connect("http://gitlab.ua-in.com", "k7NEjzEMzzxXesoG22oo");
        for (GitlabProject glp : gitLabApi.getProjects()) {
            System.out.println(glp.getName());
            System.out.println(glp.getId());
        }

        AtomicInteger i = new AtomicInteger();

        try {
            gitLabApi.getAllCommits("18")
                    .forEach(gitlabCommit -> {
                        System.out.println(i.getAndIncrement());
                        System.out.println(gitlabCommit.getAuthorName());
                        System.out.println(gitlabCommit.getAuthoredDate());
                        System.out.println(gitlabCommit.getAuthorEmail());
                        System.out.println(gitlabCommit.getMessage());
                    });

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
