import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("bologna");
        list.add("crepe");
        List<String> expected = list;
        expected.remove(1);
        assertEquals(expected, ListExamples.filter(list, new ListExamples()));
    }
}