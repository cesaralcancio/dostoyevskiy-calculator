import org.junit.Assert;
import org.junit.Test;

public class DostoyevskiyCalculatorTest {

    private DostoyevskiyCalculator calculator = new DostoyevskiyCalculator();

    @Test
    public void case1() {
        long[] n = {1, 1, 3, 6, 9, 22};
        long result = calculator.calculateSmallestDebt(n);
        Assert.assertEquals(21, result);
    }

    @Test
    public void case2() {
        long[] valores = {1, 1, 3, 6, 9, 21};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(42, result);
    }

    @Test
    public void case3() {
        long[] valores = {1};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(2, result);
    }

    @Test
    public void case4() {
        long[] valores = {2, 1, 1000000000};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(4, result);
    }

    @Test
    public void case5() {
        long[] valores = {1, 1, 1, 1, 1000000000};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(5, result);
    }

    @Test
    public void case6() {
        long[] valores = {1, 1};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(3, result);
    }

    @Test
    public void case7() {
        long[] valores = {3};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(1, result);
    }

    @Test
    public void case8() {
        long[] valores = {5, 5, 6};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(1, result);
    }

    @Test
    public void case10() {
        long[] valores = {1, 1, 2};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(5, result);
    }

    @Test
    public void case11() {
        long[] valores = {1, 1, 1, 2};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(6, result);
    }

    @Test
    public void case12() {
        long[] valores = {1, 1, 1, 1, 2};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(7, result);
    }

    @Test
    public void case13() {
        long[] valores = {1, 1, 1, 1, 2, 2};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(9, result);
    }

    @Test
    public void case14() {
        long[] valores = {1, 1, 1, 1, 2, 2, 4};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(13, result);
    }

    @Test
    public void case15() {
        long[] valores = {1, 1, 1, 1, 2, 2, 4, 1000};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(13, result);
    }

    @Test
    public void case16() {
        long[] valores = {1, 1, 1, 1, 2, 2, 4, 13, 1000};
        long result = calculator.calculateSmallestDebt(valores);
        Assert.assertEquals(26, result);
    }
}
