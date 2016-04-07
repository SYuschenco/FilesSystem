package ua.gostart.goit.FilesSystem;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.Timeout;
import static org.junit.Assert.assertEquals;

public class EncodeCesarTest {

    @Rule
    public Timeout time = new Timeout(1000);

    @org.junit.Test
    public void testEncode() throws Exception {
        String lineToEncode = "ABCabcZz";
        int shift = 1;
        String expectingEncodingLine = "BCDbcd[{";
        assertEquals(expectingEncodingLine, EncodeCesar.encode(shift, ' ', '~', lineToEncode));
    }
}