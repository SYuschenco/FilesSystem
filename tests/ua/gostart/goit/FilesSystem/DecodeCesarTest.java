package ua.gostart.goit.FilesSystem;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.Timeout;
import static org.junit.Assert.assertEquals;


public class DecodeCesarTest {

    @Rule
    public Timeout time = new Timeout(1000);

    @org.junit.Test
    public void testDecode() throws Exception {
        String lineForDecode = "BCDbcd[{";
        int shift = 1;
        String expectingDecodingLine = "ABCabcZz";
        assertEquals(expectingDecodingLine, DecodeCesar.decode(shift, ' ', '~', lineForDecode));
    }
}