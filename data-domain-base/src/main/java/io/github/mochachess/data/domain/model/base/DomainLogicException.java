package io.github.mochachess.data.domain.model.base;

public class DomainLogicException extends Exception {
    public DomainLogicException(String message) {
        super(message);
    }

    public DomainLogicException(String messageFormat, Object... args) {
        super(String.format(messageFormat, args));
    }
}
