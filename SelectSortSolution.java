
/**
 * 直接选择排序思想：
 *  在要排序的一组数中，选出最小的一个数与第一个位置的数交换；
 *  然后在剩下的数当中再找最小的与第二个位置的数交换，
 *  如此循环到倒数第二个数和最后一个数比较为止。
 * 1.时间复杂度：
 *  1.1 平均时间复杂度O(n^2)
 *  1.2 最好时间复杂度O(n^2)
 *  1.3 最差时间复杂度O(n^2)
 * 2.空间复杂度：O(1)
 * 3.选择排序是一个不稳定的排序算法
 *  
 * */
public class SelectSortSolution {
    //交换方法
    static void swap(int[] a,int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //每一趟循环比较时，min用于存放较小元素的数组下标，
            //这样当前批次比较完毕最终存放的就是此趟内最小的元素的下标，
            //避免每次遇到较小元素都要进行交换。
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    //找到最小值
                    min = j;
                }
            }
            if (min != i) {
                swap(arr, min, i);
            }
        }
    }
public static void main(String[] args) {
    int[] a = {2,1,3,6,9,7,4};
    selectSort(a);
    for (int i : a) {
        System.out.println(i);
    }
}
}
