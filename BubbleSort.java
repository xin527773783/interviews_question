/**
 * 冒泡排序基本思想：
 *   在要排序的一组数中，对当前还未排好序的范围内的全部数，
 *   自上而下对相邻的两个数依次进行比较和调整，让较大的数往下沉，较小的往上冒。
 *   即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 * 1.时间复杂度
 *  1.1 最差时间复杂度：O(n2)
 *  1.2 最好时间复杂度 O(n2)   
 * 2.空间复杂度  O(1)
 * 3.冒泡排序是一种稳定的排序算法
 * */
public class BubbleSort {
    //交换方法
    static void swap(int[] a,int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {3,8,6,4,7,1,9};
        bubbleSort(a);
        for(int i :a) {System.out.println(i);}
    }
}
