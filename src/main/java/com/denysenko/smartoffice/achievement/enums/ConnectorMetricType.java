package com.denysenko.smartoffice.achievement.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ConnectorMetricType {

    GITLAB_COMMITS(ConnectorType.GITLAB),
    GITLAB_PROJECT_COMMITS(ConnectorType.GITLAB),
    JIRA_TICKETS_DONE(ConnectorType.JIRA),
    UPSOURCE_REVIEW_DONE(ConnectorType.UPSOURCE),
    UPSOURCE_REVIEW_WITHOUT_CONCERNS(ConnectorType.UPSOURCE);

    @Getter
    private final ConnectorType connectorType;
}
