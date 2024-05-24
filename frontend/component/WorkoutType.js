import { StyleSheet, View, Picker } from 'react-native';
import React, { useState, useEffect } from 'react';
import axios from 'axios';
import Workout from './Workout';

const WorkoutType = () => {
    const [selectedValue, setSelectedValue] = useState("Back");
    const [workoutData, setWorkoutData] = useState(null);

    useEffect(() => {
        const fetchWorkoutData = async () => {
            try {
                const response = await axios.get(`http://localhost:8080/${selectedValue}`);
                setWorkoutData(response.data);
            } catch (error) {
                console.error(error);
            }
        };

        fetchWorkoutData();
    }, [selectedValue]);

    return (
        <View style={styles.container}>
            <Picker
                selectedValue={selectedValue}
                style={styles.picker}
                onValueChange={(itemValue, itemIndex) => setSelectedValue(itemValue)}
            >
                <Picker.Item label="Back" value="Back" />
                <Picker.Item label="Cardio" value="Cardio" />
                <Picker.Item label="Chest" value="Chest" />
                <Picker.Item label="Lower Arms" value="LowerArms" />
                <Picker.Item label="Lower Legs" value="LowerLegs" />
                <Picker.Item label="Neck" value="Neck" />
                <Picker.Item label="Shoulders" value="Shoulders" />
            </Picker>
            {workoutData && <Workout data={workoutData} />}
        </View>
    );
};

export default WorkoutType;

const styles = StyleSheet.create({
    container: {
        width: '100%',
        padding: 16,
    },
    picker: {
        height: 50,
        width: '100%',
    },
});
