//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
//请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

//思路：斐波那契数列思想
 publicpublic class Ffibonaccik{
    public static int fibonaccik(int n) {
        int number = 1;
        int sum = 1;
        if (n <= 0)
            return 0;
        if (n == 1 ) {
            return 1;
        }

        while (n-- >= 2) {
            sum += number;
            number = sum - number;
        }
        return sum;
    }
    public static void main() {
        System.out.println(Fibonaccik(4));
    }
}