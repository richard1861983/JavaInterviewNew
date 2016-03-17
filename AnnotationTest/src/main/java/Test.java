import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
/**
 * Created by Administrator on 2016/3/12.
 */
public @interface Test {
    public int id();
    public String description() default "no description";
}
