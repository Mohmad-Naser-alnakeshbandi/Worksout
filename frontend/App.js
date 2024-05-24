import { StatusBar } from 'expo-status-bar';
import { StyleSheet, View, ScrollView } from 'react-native';
import WorkoutType from "./component/WorkoutType";

export default function App() {
    return (
        <View style={styles.container}>
            <StatusBar style="auto" />
            <ScrollView>
                <WorkoutType />
            </ScrollView>
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'stretch',  // Change to 'stretch' to make children take full width
        justifyContent: 'flex-start',
    },
});
