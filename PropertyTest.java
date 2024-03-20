import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PropertyTest 
{

    @Before
    public void setUp() {
        //Property property1 = new Property("T3 Monte Belo", 150000.0); // Fixture
    }

    @Test
    public void testConstructor() {
        Property property1 = new Property("T3 Monte Belo", 15.0); // Fixture
       // assertEquals("T3 Monte Belo", property1.getDescription());
        assertEquals(15.0, property1.getPrice());
    }

}