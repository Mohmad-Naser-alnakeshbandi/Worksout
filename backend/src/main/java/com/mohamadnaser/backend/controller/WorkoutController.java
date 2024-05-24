package com.mohamadnaser.backend.controller;

import com.mohamadnaser.backend.model.Workout;
import com.mohamadnaser.backend.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@CrossOrigin(origins = "http://localhost:8081") // Allowing requests from your React Native app
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    private static final Map<String, String> workoutFilePaths = new HashMap<>();

    static {
        workoutFilePaths.put("Back", "src/main/resources/static/Data/back.json");
        workoutFilePaths.put("Cardio", "src/main/resources/static/Data/cardio.json");
        workoutFilePaths.put("Chest", "src/main/resources/static/Data/chest.json");
        workoutFilePaths.put("LowerArms", "src/main/resources/static/Data/lower-arms.json");
        workoutFilePaths.put("LowerLegs", "src/main/resources/static/Data/lower-legs.json");
        workoutFilePaths.put("Neck", "src/main/resources/static/Data/neck.json");
        workoutFilePaths.put("Shoulders", "src/main/resources/static/Data/shoulders.json");
    }

    @GetMapping("/{workoutType}")
    public List<Workout> getWorkouts(@PathVariable String workoutType) {
        String filePath = workoutFilePaths.get(workoutType);
        if (filePath == null) {
            throw new IllegalArgumentException("Invalid workout type: " + workoutType);
        }
        return workoutService.readJsonFile(filePath);
    }
}
