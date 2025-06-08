package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {
    @Test
    public void testGetGreeting(){
        HelloWorld helloworld = new HelloWorld();
        assertNotNull(helloworld.getGreeting());
        
    }
    
}
