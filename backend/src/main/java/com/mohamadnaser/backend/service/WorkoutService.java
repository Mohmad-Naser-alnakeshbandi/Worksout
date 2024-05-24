package com.mohamadnaser.backend.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mohamadnaser.backend.model.Workout;
import org.springframework.stereotype.Service;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class WorkoutService {
    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Workout> readJsonFile(String filePath) {
        try {
            return objectMapper.readValue(new File(filePath), objectMapper.getTypeFactory().constructCollectionType(List.class, Workout.class));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
