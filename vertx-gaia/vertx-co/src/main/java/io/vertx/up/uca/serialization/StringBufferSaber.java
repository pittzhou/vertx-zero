package io.vertx.up.uca.serialization;

import io.vertx.up.eon.Strings;
import io.vertx.up.fn.Fn;

/**
 * StringBuffer, StringBuilder
 */
public class StringBufferSaber extends BaseSaber {
    @Override
    public Object from(final Class<?> paramType,
                       final String literal) {
        return Fn.orNull(() ->
                Fn.orSemi(StringBuilder.class == paramType
                        || StringBuffer.class == paramType, this.getLogger(),
                    () -> {
                        if (StringBuffer.class == paramType) {
                            return new StringBuffer(literal);
                        } else {
                            return new StringBuilder(literal);
                        }
                    }, () -> Strings.EMPTY),
            paramType, literal);
    }

    @Override
    public <T> Object from(final T input) {
        return Fn.orNull(() -> {
            Object reference = null;
            if (input instanceof StringBuilder
                || input instanceof StringBuffer) {
                reference = input.toString();
            }
            return reference;
        }, input);
    }
}
