import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Wrappershould {



    //String is empty ""
    //String is null
    //String is one Word and columns equals string
    //String is one Word and columns less than string
    //String is two Word and columns longer than string

    @Test
    void wrapReturnStringInColumns(){
        Wrapper wrapper = new Wrapper();
        assertEquals("",wrapper.wrap("",7));
        assertEquals("",wrapper.wrap(null,2));
        assertEquals("word",wrapper.wrap("word",4));
        assertEquals("wo\nrd",wrapper.wrap("word",2));
        assertEquals("Hello\nWord", wrapper.wrap("Hello Word", 7));
        assertEquals("Hello  \nWord", wrapper.wrap("Hello   Word", 9));
    }

}
