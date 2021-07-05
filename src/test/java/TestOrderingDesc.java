import NumReverse.Util;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestOrderingDesc {

    public int[] nums;

    @BeforeEach
    public void setup(){
        nums = new int[]{15, 7, 3, 54, 0};
    }

    @DisplayName("NumHandling")
    @Test
    void TestNumsOrdering(){
        int[] numOrdered = {0,3,7,15,54};
        Assertions.assertArrayEquals(numOrdered, Util.revNums(nums));
    }
}