import { StyleSheet, View, Text, Image, FlatList, ScrollView } from 'react-native';
import React from 'react';

const Workout = ({ data }) => {
    const renderItem = ({ item }) => (
        <View style={styles.itemContainer}>
            <View style={styles.textContainer}>
                <Text style={styles.title}>{item.name}</Text>
                <Text style={styles.text}>Equipment: {item.equipment}</Text>
                <Text style={styles.text}>Target: {item.target}</Text>
                <Text style={styles.text}>Secondary Muscles: {item.secondaryMuscles.join(', ')}</Text>
                <Text style={styles.text}>Instructions:</Text>
                {item.instructions.map((instruction, index) => (
                    <Text key={index} style={styles.instruction}>{instruction}</Text>
                ))}
            </View>
            <Image source={{ uri: item.gifUrl }} style={styles.image} />
        </View>
    );

    return (
        <ScrollView>
            <FlatList
                data={data}
                renderItem={renderItem}
                keyExtractor={(item) => item.id}
            />
        </ScrollView>
    );
};

export default Workout;

const styles = StyleSheet.create({
    itemContainer: {
        width: '100%',
        flexDirection: 'row',
        alignItems: 'flex-start',
        padding: 16,
        marginBottom: 16,
        backgroundColor: '#f9f9f9',
        borderRadius: 8,
        shadowColor: '#000',
        shadowOffset: { width: 0, height: 2 },
        shadowOpacity: 0.1,
        shadowRadius: 8,
        elevation: 5,
    },
    textContainer: {
        flex: 2,
        paddingRight: 16,
    },
    title: {
        fontSize: 18,
        fontWeight: 'bold',
        marginBottom: 8,
    },
    image: {
        flex: 1,
        width: null,
        height: null,
        aspectRatio: 1,
        borderRadius: 8,
        resizeMode: 'contain',
    },
    text: {
        fontSize: 16,
        marginBottom: 4,
    },
    instruction: {
        fontSize: 14,
        marginBottom: 2,
        paddingLeft: 16,
    },
});
