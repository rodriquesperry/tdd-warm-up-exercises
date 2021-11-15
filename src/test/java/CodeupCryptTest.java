import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


public class CodeupCryptTest {
//The class should have a double static property called version that is not initialized, but it could set any floating number to simulate we have a version number.
   @Test
    public void testIfVersionIsSet() {
       //works because all primitive values have a default value
       assertEquals(0.0, CodeupCrypt.version, 0);
       //set the version
       CodeupCrypt.version = 1.2;
       //test to see if what you set it to passes
       assertEquals(1.2, CodeupCrypt.version, 0);
   }

   //It should have a method called hashPassword that takes in a string parameter and hashes it into a new string and return it.
   @Test
    public void testHashPassword() {
        String password = "Password";
        String expectedHash = "P4ssw0rd";

        String hashedPassword = CodeupCrypt.hashPassword(password);

        assertEquals(expectedHash, hashedPassword);
        assertEquals("P13", CodeupCrypt.hashPassword("Pie"));
        assertEquals("J9n1t", CodeupCrypt.hashPassword("Junit"));
   }

   @Test
    public void testCheckPassword() {
       assertTrue("Password and hash are not the same", CodeupCrypt.checkPassword("Douglas", "D09gl4s"));
       assertFalse(CodeupCrypt.checkPassword("Douglas", "Douglas"));
   }
}



