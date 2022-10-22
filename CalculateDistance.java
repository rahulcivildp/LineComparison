package LineComparison;

public class CalculateDistance {

    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 5;

        double dist = Math.sqrt((double) (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Distance between two points: " + dist);
    }
}
