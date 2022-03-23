package Q2;

public class Main {
    public static String data_48 = "../TSP-RMHC-main/src/Q2/TSP_100.txt";

    public static void main(String[] args) {
        double [][] distances = TSP.ReadArrayFile(data_48, " ");
        System.out.println("Route = " + TSPProblem.RunTSP(100000, distances));
        System.out.println("Fitness = " + TSPProblem.finalFit);

    }
}
