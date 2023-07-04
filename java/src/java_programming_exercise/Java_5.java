package java_programming_exercise;
//The Rule is xn = xn−1 + xn−2
	public class Java_5 {
	public static void main(String[] args) {
		int n = 10; 
        int[] series = new int[n];
        series[0] = 0;
        series[1] = 1;
        int i = 2;
        System.out.println("Fibonacci Series:");
        System.out.print(series[0] + " " + series[1] + " ");
        do {
            series[i] = series[i - 1] + series[i - 2];
            System.out.print(series[i] + " ");
            i++;
        } while (i < n);
	}
}
