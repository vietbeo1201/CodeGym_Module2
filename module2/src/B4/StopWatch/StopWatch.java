package B4.StopWatch;
import java.util.Random;
import java.util.Arrays;

public class StopWatch {
    double StartTime, StopTime, n, total;
    public StopWatch(){
    }
    public StopWatch(double StartTime, double StopTime){
        this.StartTime = StartTime;
        this.StopTime = StopTime;
    }
    public double getStartTime() {
        return StartTime;
    }
    public void setStartTime(double StartTime) {
        this.StartTime = StartTime;
    }
    public double getStopTime() {
        return StopTime;
    }
    public void setStopTime(double StopTime) {
        this.StopTime = StopTime;
    }
    public void Start(){
        StartTime = System.nanoTime();
        System.out.println("Start: " + StartTime);
    }
    public void Stop(){
        StopTime = System.nanoTime();
        System.out.println("Stop: " + StopTime);
    }
    public void getElapsedTime() {
         total = StopTime - StartTime;
    }
    public void SortArray(){
        int size = 100000; // Define array size
        int[] numbers = new int[size];

        // Generate random numbers and fill the array
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100); // Random numbers between 0 and 99
        }
        // Print original array
        //System.out.println("Original Array: " + Arrays.toString(numbers));

        // Sort the array
         Arrays.sort(numbers);

        // Print sorted array
        // System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
