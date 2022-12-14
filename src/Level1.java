public class Level1 {
    public static int getStopTime(int time, int red, int green) {
        int count = time;
        int trafficLightColor = 0;

        int sum = red + green;
        if (time > sum) {
            count = time % sum;
        }

        if (count < red) {
            trafficLightColor = red - count;
        }

        return trafficLightColor;
    }

    public static int Unmanned(int l, int n, int[][] track) {
        int car = 0;
        int trafficLight = 0;

        for (int i = 1; i <= l; i++) {
            car++;

            if (i == track[trafficLight][0]) {
                car += getStopTime(car, track[trafficLight][1], track[trafficLight][2]);
                trafficLight = trafficLight < n - 1 ? trafficLight + 1 : trafficLight;
            }
        }

        return car;
    }
}
