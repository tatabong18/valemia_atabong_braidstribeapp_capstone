package security;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {

    private String firstFieldName;
    private String secondFieldName;

    @Override
    public void initialize(FieldMatch constraintAnnotation) {
        firstFieldName = constraintAnnotation.first();
        secondFieldName = constraintAnnotation.second();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }

        Object firstFieldValue = getValue(value, firstFieldName);
        Object secondFieldValue = getValue(value, secondFieldName);

        if (firstFieldValue == null && secondFieldValue == null) {
            return true;
        }

        if (firstFieldValue != null) {
            return firstFieldValue.equals(secondFieldValue);
        }

        return false;
    }

    private Object getValue(Object object, String fieldName) {
        try {
            java.lang.reflect.Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(object);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new IllegalArgumentException("Invalid field name: " + fieldName, e);
        }
    }
}
