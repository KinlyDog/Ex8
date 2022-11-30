public class Level1 {
    public static int light(int time, int red, int green) {
        int sum = red + green;
        int count = time;
        int TrafficLightColor = 0;

        if (time > sum) {
            count = time % sum;
        }

        if (count < red) {
            TrafficLightColor = red - count;
        }

        return TrafficLightColor;
    }

    public static int Unmanned(int l, int n, int[][] track) {
        int car = 0;
        int x = 0;

        for (int i = 1; i <= l; i++) {
            car++;

            if (i == track[x][0]) {
                car += light(car, track[x][1], track[x][2]);
                x = x < n - 1 ?
                        x + 1 :
                        x;
            }
        }

        return car;
    }
}
