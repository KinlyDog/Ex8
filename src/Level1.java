public class Level1 {
    public static int light(int time, int red, int green) {
        int sum = red + green;
        int color = 0;

        int count = time;
        if (time > sum) {
            count = time - time / sum * sum;
        }

        if (count < red) {
            color = red - count;
        }

        return color;
    }

    public static int Unmanned(int l, int n, int[][] track) {
        int car = 0;
        int x = 0;

        for (int i = 1; i <= l; i++) {
            car++;

            if (i == track[x][0]) {
                car += light(car, track[x][1], track[x][2]);
                x++;
            }

            if (x == n) {
                x--;
            }

        }

        return car;
    }
}
