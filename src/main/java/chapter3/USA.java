package chapter3;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by deft on 19.03.2017.
 */
@Qualifier
@Retention(RUNTIME)
@Target({FIELD, METHOD, TYPE})
public @interface USA {
}
