import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size của mảng");
        int size = sc.nextInt();
        int [] a = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử của mảng ở vị trí " + i);
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int j = 0; j < size; j++) {
            if (min > a[j]){
                min = a[j];
            }
        }
        System.out.print("Phần tử nhỏ nhất trong mảng: "+ min);

    }
}
