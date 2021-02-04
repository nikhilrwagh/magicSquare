import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    public Solution solution = new Solution();

    @Test
    public void testMagicSquare(){
        int [][] inputArray = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
        Assert.assertEquals(solution.formingMagicSquare(inputArray),7);
    }

}
