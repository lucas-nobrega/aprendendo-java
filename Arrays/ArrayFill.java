import java.util.Scanner;
public class ArrayFill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char option = input.nextLine().charAt(0);
        double[][] M = new double[12][12];
        double sum=0;

        for(int i=0; i<12; i++){
            for(int j=0; j<12; j++){
                M[i][j] = input.nextDouble();
                if(i-j < 0){
                    sum += M[i][j];
                }
            }
        }
        if(option == 'S'){
            System.out.println(String.format("%.1f", sum));
        }
        if(option == 'M'){
            sum = sum/66;
            System.out.println(String.format("%.1f", sum));
        }
    }
}