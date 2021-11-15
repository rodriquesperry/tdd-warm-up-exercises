import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class CodeupCryptTest {

   @Test
    public void testIfVersionIsSet() {
       //works because all primitive values have a default value
       assertEquals(0.0, CodeupCrypt.version, 0);
   }
}



