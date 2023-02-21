import org.junit.Assert;
import org.junit.Test;

public class Task1Test {

    Task1 task1 = new Task1();

    @Test
    public void sample()
    {
        int [] result= {1,3};
        int [] array = {10, 20, 30, 40};
        int target= 60;
        Assert.assertEquals(task1.findTupleToAffUpToTarget(array,target),result);
    }

    @Test
    public void sample1()
    {
        int [] result= {0,1};
        int [] array = {2,7,11,15};
        int target= 9;
        Assert.assertEquals(task1.findTupleToAffUpToTarget(array,target),result);
    }

    @Test
    public void sample2()
    {
        int [] result= {1,2};
        int [] array = {3,2,4};
        int target= 6;
        Assert.assertEquals(task1.findTupleToAffUpToTarget(array,target),result);
    }

    @Test
    public void sample3()
    {
        int [] result= {0,1};
        int [] array = {3,3};
        int target= 6;
        Assert.assertEquals(task1.findTupleToAffUpToTarget(array,target),result);
    }

    @Test
    public void sample4()
    {

        int [] array = {3,3};
        int target= 16;
        Assert.assertEquals(task1.findTupleToAffUpToTarget(array,target),null);
    }

}
