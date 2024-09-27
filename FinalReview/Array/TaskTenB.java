
public class TaskTenB {
    public static void main(String[] args) {
        double[] cheetos_inches = new double[]{10.0, 12.0, 14.0, 16.0,18.0};            
        double averageLength = findAvgCm(cheetos_inches);
        System.out.println("The average Cheeto length is "+ averageLength
        +" cm");
    }

    public static double findAvgCm(double[] cheetos_inches){
        int sum = 0;
        int avg = 0;
        for(int i = 0; i < cheetos_inches.length; i++){
            sum += cheetos_inches[i];
        }
        avg=  sum/cheetos_inches.length;
        return avg;
    }
}
