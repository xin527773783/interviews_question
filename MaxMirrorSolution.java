/**
*求解：最长的镜像子串
*我们的目标是求一个串的最大镜像子串（最长的镜像子串），如果有多个最大镜像子串，对称中心靠左的优先选中。
*
*/

public class MaxMirroeSolution {
    public static String getMaxMirrorString(String s) {
        String max_s = ""; // 所求的最大对称子串
        for (int i = 0; i < s.length(); i++) {
            // 第一种对称模式(偶数对称)
            int step = 1;
            try {
                //for无限循环
                for (;;) {
                    //从s[i]s[i+1]为基准判断其前后的多少值是相等的
                    if (s.charAt(i - step) != s.charAt(i + step))
                        break;
                    step++;
                }
            } catch (Exception e) {
            }
            //截取第一种对称
            String s1 = s.substring(i - step + 1, i + step); 
            // 第二种对称模式(奇数对称)
            step = 0;
            try {
                for (;;) {
                	//以s[i]为基准，判断其前后的多少值是相等的
                    if (s.charAt(i - step) != s.charAt(i + step + 1))
                        break; 
                    step++;
                }
            } catch (Exception e) {
            }
            //截取第二种对称
            String s2 = s.substring(i - step + 1, i + step + 1);
            if (s1.length() > max_s.length())
                max_s = s1;
            if (s2.length() > max_s.length())
                max_s = s2;
        }
        return max_s;
    }

    public static void main(String[] args) {
        System.out.println(getMaxMirrorString("DABBBA"));
        System.out.println(getMaxMirrorString("abcdeefghhgfeiieje444k444lmn"));

    }
}
