/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsubsum;

/**
 *
 * @author Birsen
 */
public class MaxSubSum {

    public static int maxSubSum(int[] a) {
     
        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;

                for (int k = i; k <= j; k++) {
                     
                    thisSum += a[k];
                    System.out.print(" dizi[" + k + "]:" + a[k]);
                }
                System.out.println();
                System.out.println(" toplam: " + thisSum);
                System.out.println();
                if (thisSum > maxSum) {
                    maxSum = thisSum;

                }
            }
        }

        return maxSum;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum;

        maxSum = maxSubSum(a);
        System.out.println("8 elemanli dizinin maximum elemanları toplamı:" + maxSum);
    }
}
