import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContainerTest {

    private Container container;

    @Before
    public void setUp(){
        container = new Container();
    }

    @Test
    public void absentReturnNull() {
        Object res = container.get("");
        Assert.assertEquals(null, res);
    }

    @Test
    public void canAddObject() {
        Glucose glucose = new Glucose();
        container.add("glucose", glucose);
        Object retrievedGlucose = container.get("glucose");
        Assert.assertEquals(glucose, retrievedGlucose);

        Water water = new Water();
        container.add("water", water);
        Object rettrievedWater = container.get("water");
        Assert.assertEquals(water, rettrievedWater);
    }

    @Test
    public void canAddAndRetrieve() {
        Glucose glucose = new Glucose();
        container.add(glucose);
        Water water = new Water();
        container.add(water);
        Glucose retrievedGlucose = container.get(Glucose.class);
        Water rettrievedWater = container.get(Water.class);
        Assert.assertEquals(glucose, retrievedGlucose);
        Assert.assertEquals(water, rettrievedWater);
    }


    @Test(expected = Exception.class )
    public void ifRetriedAddThrowException() throws Exception {
        throw new Exception();
    }

}
