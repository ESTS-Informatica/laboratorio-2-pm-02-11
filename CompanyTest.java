import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CompanyTest
{
    private Company company1;
    
    @Test
    public void setUp()
    {
        User client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        User client2 = new User("António Francisco", "922222222", "tohico@hotmail.com");
        User seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        User seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
    }
    
    @Test
    public void testConstrutor()
    {
       
    }
}
