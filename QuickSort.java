import java.util.Scanner;

public class QuickSort {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] M = new int[N];
        for (int i = 0;i< N; i++)
        {
            System.out.printf("arr[%d] = ",i);
            M[i] = sc.nextInt();
        }
        System.out.println("mang ban vua nhap la:");
        for(int i= 0;i<M.length;i++)
        {
            System.out.printf(M[i] + " ");
        }
        System.out.println("mang sau khi sap xep la:");
        quickSors(M,0,N-1);
        showMe(M);


    }

    public static void quickSors(int M[],int left,int right)
            // quickSort(M,0,4)
            //0 là left bắc đầu chạy từ 0.
            //4 là độ dày tối đa của mảng (n-1).
    {
        if(left >= right)// kiểm tra left < right thì làm tiêp, không thì return
            return;
        int pivot = M[(left+right)/2]; // tìm pivot trong mảng
        // M(0+4)/2=2
        // -->M[2]=63
        int i = left,j=right;
        do
        {
            while (M[i] < pivot)
                i++;
          //M[0] < 63
          //29 <63 đúng thì i++ thì i=i+1 --> i=1
          //M[1] <63
          //40 < 63 ĐÚNG THÌ i++ -->i=2
          //M[2] < 63
          // 63 < 63 sai -->ngừng while i

            while(M[j] > pivot)
                j--;
          // M[j] > pivot
          // M[4] > 63
          // 17 > 63  ngừng while
            if(i<=j)
            // i = M[2]=2 <= j=M[4]
            // 2 <= 4 đúng  thì đỗi vị trí
            // lúc này mảng thành 29,40,17,54,63
            {
                int temp = M[i];
                M[i] = M[j];
                M[j] = temp;
                i++;
                j--;
             // i++ --> i =3 và j-- -->j=3

            }
        }
        while (i < j);
        // i=3 và j=3 không thỏa mản nên kết thúc do
        // --> dung de qui

        quickSors(M,left,j);
    // gọi đệ quy : quickSork(M,left,j)=(M,0,3) dùng để lưu giá trị sau nó-->lưu quicksork(M,i,right)
        quickSors(M,i,right);
     // quickSork(M,i,right)
     // (M,i=0,riht=4-1=3)
     // (M,0,3)
     // làm lại từ lúc tìm pivot đến hết.

    }
    public static void showMe(int[] M)
    {
        for(int i = 0;i <M.length;i++)
        {
            System.out.print(M[i] + " ");
        }
    }


}
