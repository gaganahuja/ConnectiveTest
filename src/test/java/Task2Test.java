import org.junit.Assert;
import org.junit.Test;

public class Task2Test {
@Test
    public void sample1() {
            Task2 task2 = new Task2();
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        Assert.assertEquals(task2.findMaxWaterRetention(array),49);
    }


    @Test
    public void sample2() {
        Task2 task2 = new Task2();
        int[] array = {1,1};
       Assert.assertEquals(task2.findMaxWaterRetention(array),1);
    }

    @Test
    public void sample3() {
        Task2 task2 = new Task2();
        int[] array = {4,3,2,1,4};
        Assert.assertEquals(task2.findMaxWaterRetention(array),16);
    }

    @Test
    public void sample4() {
        Task2 task2 = new Task2();
        int[] array = {1,2,1};
        Assert.assertEquals(task2.findMaxWaterRetention(array),2);
    }
}
