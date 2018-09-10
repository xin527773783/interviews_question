/**
 * 直接插入排序基本思想:
 *  每一步将一个待排序的记录，插入到前面已经排好序的有序序列中去，直到插完所有元素为止。
 *1.时间复杂度
 * 1.1 最好时间复杂度：O(n)
 * 1.2 最差时间复杂度：O(n^2)
 *2.空间复杂度：O(1)
 *3.直接插入排序是一种稳定的排序算法
 * */
public class InsertSort {
    static void swap(int[] a, int i, int j) {
        int temp = i;
        a[i] = a[j];
        a[j] = temp;
    }
    
    static void insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j] > a[j - 1]) {
                swap(a, j, j-1);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {4,2,5,16,7,1,3};
        insertSort(a);
        for (int i : a) {
            System.out.println(i);
        }    
    }

}
