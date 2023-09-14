import com.google.auto.value.AutoValue;

/**
 * @author Andrius Semionovas
 * @since 2017-08-25
 */

@AutoValue
public class Foo {
    public int id = 42;

    public void foo(Bar bar) {
        System.out.print(id);
    }
}
