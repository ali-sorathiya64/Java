package util;

import exceptions.ValidationException;


@FunctionalInterface
public interface Validation <String> {
     void  validate (String value) throws ValidationException;
}