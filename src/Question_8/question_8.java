package Question_8;
import java.util.*;

public class question_8 {
    public static void main(String[] args) {
        searchForPartOfArrayAndSum();
    }

    public static void searchForPartOfArrayAndSum() {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Dear user, enter the size of the array n: ");
        int n = sc.nextInt();
        System.out.print("Enter k: ");  // указывает с какого номера массива будет производится подсчет суммы. Отсчет с 0.
        int k = sc.nextInt();
        System.out.print("Enter m: "); // указывает каким номером массива будет заканчиваться подсчет суммы. m - включительно.
        int m = sc.nextInt();
        int[] d = new int[n];
        int sum = 0;                   // Условие: k<m<n

        for (int i = 0; i < n; i++) {
            d[i] = random.nextInt(100) + 1;
        }
        System.out.println("Full array: " + Arrays.toString(d)); //выведем весь массив для наглядного примера

        System.out.println("Part of array from "+k+" to "+m+": ");
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if ((i == k) && (j == m)) {
                    for (i = k; i <= m; i++) {
                        System.out.print(d[i] + "\t"); //выведем часть массива от [k] до [m]

                        sum = sum + d[i];
                    }
                    System.out.println();
                    System.out.println("Sum: " + sum); //сумма массива от [k] до [m]
                }
            }
        }
    }
}






