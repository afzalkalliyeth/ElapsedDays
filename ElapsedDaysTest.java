import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ElapsedDaysTest {

    
    @Test
    public void testEalpsedDays0() {
        Main main = new Main();

        String result = main.getElapsedDays("07/11/1972 - 08/11/1972");
        assertEquals("07/11/1972 - 08/11/1972: 0 days", result);        
    }
    
    @Test
    public void testEalpsedDays01() {
        Main main = new Main();

        String result = main.getElapsedDays("01/01/2000 - 03/01/2000");
        assertEquals("01/01/2000 - 03/01/2000: 1 days", result);        
    }    
    
    @Test
    public void testEalpsedDays1() {
        Main main = new Main();

        String result = main.getElapsedDays("02/06/1983 - 22/06/1983");
        assertEquals("02/06/1983 - 22/06/1983: 19 days", result);        
    }
    
    @Test
    public void testEalpsedDays2() {
        Main main = new Main();
        
        String result = main.getElapsedDays("04/07/1984 - 25/12/1984");
        assertEquals("04/07/1984 - 25/12/1984: 173 days", result);
    }
    
    @Test
    public void testEalpsedDays3() {
        Main main = new Main();
        
        String result = main.getElapsedDays("03/01/1989 - 03/08/1983");
        assertEquals("03/01/1989 - 03/08/1983: 1979 days", result);
    }

    @Test
    public void testEalpsedDays4() {
        Main main = new Main();
        
        String result = main.getElapsedDays("03/08/1983 - 03/01/1989");
        assertEquals("03/08/1983 - 03/01/1989: 1979 days", result);
    }	
}