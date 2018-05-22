import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person("Sarah", 30);
    }

    @Test
    public void hasName(){
        assertEquals("Sarah", person.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(30, person.getAge());
    }
}
