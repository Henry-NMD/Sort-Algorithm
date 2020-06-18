import java.util.Scanner;

public class BubbleSort {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("nhap gia tri phan tu trong mang:");
        for(int i = 0;i < N;i++ )
        {
            System.out.printf("arr[%d] = ",i);
            arr[i] = sc.nextInt();

        }
        System.out.println("mang ban vua nhap la:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        bubbleSort(arr);
        showBubbleSort(arr);
    }
    public static void bubbleSort(int[] arr)
    {
        int temp = arr[0];
        for(int i = 0;i < arr.length;i++ )
        {
            for(int j = i+1;j < arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    }
    public static void showBubbleSort(int[] arr)
    {
        System.out.println("\nmang sau khi sap xep la:");
        for(int i = 0;i < arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
