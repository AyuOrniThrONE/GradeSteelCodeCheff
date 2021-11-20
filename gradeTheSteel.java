import java.util.*;

public class gradeTheSteel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (1 <= t && t <= 1000) {
            for (int i = 0; i < t; i++) {

                int h = sc.nextInt();
                double c = sc.nextDouble();
                int tens = sc.nextInt();
                int[] grades = { 5, 6, 7, 8, 9, 10 };
                
                if (0 <= h && h <= 10000 && 0 <= c && c <= 10000 && 0 <= tens && tens <= 10000) {
                    
                    if (h > 50 && c < 0.7 && tens > 5600) {
                        System.out.println(grades[5]);
                    }
                    else if (h > 50 && c < 0.7 && tens < 5600) {
                        System.out.println(grades[4]);
                    }
                    
                    else if (c < 0.7 && tens > 5600 && h < 50) {
                        System.out.println(grades[3]);
                    }
                    
                    else if (h > 50 && tens > 5600 && c > 0.7) {
                        System.out.println(grades[2]);
                    }
                    else if (h > 50 || c < 0.7 || tens > 5600) {
                        System.out.println(grades[1]);
                    } 

                    else {
                        System.out.println(grades[0]);
                    }
                }
            }

        }

    }
}
