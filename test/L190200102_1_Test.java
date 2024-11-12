import org.junit.Assert;
import org.junit.Test;

/**
 * 测试用例设计原则：
 * 1. 等价类划分：测试正数、负数、零的组合。
 * 2. 边界值分析：测试整数部分和小数部分的边界情况。
 * 3. 特殊值测试：测试分子为0、分母为1、出现循环小数等情况。
 */
public class L190200102_1_Test {

    // 测试目的：分子能被分母整除的情况
    // 用例：numerator = 4, denominator = 2，期望输出 "2"
    @Test
    public void testExactDivision() {
        Solution1 solution = new Solution1();
        String result = solution.fractionToDecimal(4, 2);
        Assert.assertEquals("2", result);
    }

    // 测试目的：正分数的非循环小数
    // 用例：numerator = 1, denominator = 2，期望输出 "0.5"
    @Test
    public void testNonRepeatingDecimal() {
        Solution1 solution = new Solution1();
        String result = solution.fractionToDecimal(1, 2);
        Assert.assertEquals("0.5", result);
    }

    // 测试目的：正分数的循环小数
    // 用例：numerator = 4, denominator = 333，期望输出 "0.(012)"
    @Test
    public void testRepeatingDecimal() {
        Solution1 solution = new Solution1();
        String result = solution.fractionToDecimal(4, 333);
        Assert.assertEquals("0.(012)", result);
    }

    // 测试目的：负分数的循环小数
    // 用例：numerator = -1, denominator = 3，期望输出 "-0.(3)"
    @Test
    public void testNegativeRepeatingDecimal() {
        Solution1 solution = new Solution1();
        String result = solution.fractionToDecimal(-1, 3);
        Assert.assertEquals("-0.(3)", result);
    }

    // 测试目的：分子为0的情况
    // 用例：numerator = 0, denominator = 5，期望输出 "0"
    @Test
    public void testZeroNumerator() {
        Solution1 solution = new Solution1();
        String result = solution.fractionToDecimal(0, 5);
        Assert.assertEquals("0", result);
    }

    // 测试目的：分母为1的情况
    // 用例：numerator = 7, denominator = 1，期望输出 "7"
    @Test
    public void testDenominatorOne() {
        Solution1 solution = new Solution1();
        String result = solution.fractionToDecimal(7, 1);
        Assert.assertEquals("7", result);
    }

    // 测试目的：最大整数值的情况
    // 用例：numerator = Integer.MAX_VALUE, denominator = 2，期望输出 "1073741823.5"
    @Test
    public void testMaxInteger() {
        Solution1 solution = new Solution1();
        String result = solution.fractionToDecimal(Integer.MAX_VALUE, 2);
        Assert.assertEquals("1073741823.5", result);
    }

    // 测试目的：最小整数值的情况
    // 用例：numerator = Integer.MIN_VALUE, denominator = -1，期望输出 "2147483648"
    @Test
    public void testMinInteger() {
        Solution1 solution = new Solution1();
        String result = solution.fractionToDecimal(Integer.MIN_VALUE, -1);
        Assert.assertEquals("2147483648", result);
    }
}
