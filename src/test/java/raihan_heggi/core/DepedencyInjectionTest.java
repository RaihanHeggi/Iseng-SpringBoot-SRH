package raihan_heggi.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import raihan_heggi.core.data.Foo;
import raihan_heggi.core.data.FooBar;
import raihan_heggi.core.data.Bar;

public class DepedencyInjectionTest {
    

    @Test
    void testNoDi(){
        var foo = new Foo();
        var bar = new Bar();

        var foobar = new FooBar(foo, bar);
        
        Assertions.assertSame(foo, foobar.getFoo());
        Assertions.assertSame(bar, foobar.getBar());
    }

}
