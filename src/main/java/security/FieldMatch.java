package security;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Documented
@Constraint(validatedBy = FieldMatchValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldMatch {

    String message() default "Fields must match";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String first();
    String second();

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        FieldMatch[] value();
    }
}
