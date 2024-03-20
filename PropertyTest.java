import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PropertyTest 
{

    private Property property1;
    
    @Test
    public void setUp() {
        Property property1 = new Property("T3 Monte Belo", 150000.0); // Fixture
    }

    @Test
    public void testConstructor() {
        Property property1 = new Property("T3 Monte Belo", 15.0); // Fixture
        assertEquals("T3 Monte Belo", property1.getDescription());
        assertEquals(15.0, property1.getPrice());
    }

}