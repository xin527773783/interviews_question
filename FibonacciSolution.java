
//1,现在要求输入一个整数n，请你输出斐波那契数列的第n项。
//斐波纳契数列以如下被以递推的方法定义：F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
//2.一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
//基本思想，采用斐波那契数列
public class FibonacciSolution {
    public static long fibonacci(int n) {
        int result = 0;
        int preOne = 1;
        int preTwo = 0;
        if (n == 0) {
            return preTwo;
        }
        if (n == 1) {
            return preOne;
        }
        for (int i = 2; i <= n; i++) {
            result = preOne + preTwo;
            preTwo = preOne;
            preOne = result;
        }
        return result;
    }

    //3.一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
    //求该青蛙跳上一个n级的台阶总共有多少种跳法。
    //思路：2^(n-1)
    public int JumpFloor2(int target) {
        return (int) Math.pow(2,target-1);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(38));
    }
}
