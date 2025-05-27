package outerShell;

import java.util.*;

public class ShoesShope {

    public static int[] sizeOfShoes(int n ) {
    Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] ssize = new int[n+1];
        System.out.println("enter the size of shoes ");
        while(true) {
            int iput = sc.nextInt();
            ssize[iput]++;
            count++;
            if (count == n) {
                break;
            }
        }
    return ssize;
    }

    public static Map<Integer,Integer> SellAndPrice (int numberCoustomer){
    Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <numberCoustomer; i++) {
          int  ws = sc.nextInt();
          int  price = sc.nextInt();
            map.put(ws , price);
        }
        sc.close();
return map;
    }

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the available 1 to 10:");
    int an = sc.nextInt();
    int total =0;
// contain size of shoes
    int[] size = sizeOfShoes(an);
// sells And price of shoes
        System.out.println("enter the number of shoes ");
    int numberCoustomer = sc.nextInt();
        System.out.println("enter the total price of shoes ");
    Map<Integer,Integer> map = SellAndPrice(numberCoustomer);
    //total sells price
    for(int el : map.keySet()) {
        if(size[el]!=0) {
            total += map.get(el);
        }
    }
    System.out.println(total);
    sc.close();
    }
}
