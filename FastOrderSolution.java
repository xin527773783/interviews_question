/**
 * 1.快速排序基本思想:(采用分治法策略，是一种不稳定的排序算法) 
 *  1.1、先从数列中取出一个数作为基准数
 *  1.2、分区过程，将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边 
 *  1.3、再对左右区间重复第二步，直到各区间只有一个数 
 * 2.算法时间复杂度
 *  2.1 最差时间复杂度是O(n^2)与插入排序一样
 *  2.2 平均时间复杂度为O(nlog(n))
 *  2.3 平均时间复杂度也是O(nlogn)
 * 3.算法空间复杂度
 *  3.1 最优的情况下空间复杂度为：O(logn) 
 *  3.2 最差的情况下空间复杂度为：O( n )
 */
public class FastOrderSolution {

    static int partition(int a[], int left, int right) {
        int i = left;
        int j = right;
        int temp = a[i];
        while (i < j) {
            while (i < j && a[j] >= temp) {
                j--;
            }
            if (i < j) {
                a[i] = a[j];
            }
            while (i < j && a[i] <= temp) {
                i++;
            }
            if (i < j) {
                a[j] = a[i]; 
            }
        }
        a[i] = temp;
        return i;
    }

    static void quickSort(int a[], int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(a, left, right);
            //左边继续排序
            quickSort(a, left, dp - 1);
            //右边继续排序
            quickSort(a, dp + 1, right);
        }
    }
    
    public static void main(String[] args) {
        int[] a={5,4,9,1,7,6,2,3,8};
        quickSort(a,0,a.length-1);
        for(int i=0;i<9;i++)
        {
            System.out.println(a[i]);
        }
    }
}
