package com.denysenko.smartoffice.achievement.controller;

import com.denysenko.smartoffice.achievement.service.AchievementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAchievementController {

    private final AchievementService achievementService;

    public UserAchievementController(AchievementService achievementService) {
        this.achievementService = achievementService;
    }

    @GetMapping(value = "/api/achievement/echo")
    public ResponseEntity<String> echo() {

        achievementService.readAllMetrics();

        return ResponseEntity.ok("Echo!");
    }
}
