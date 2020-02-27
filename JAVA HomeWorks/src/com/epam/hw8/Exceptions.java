package com.epam.hw8;

class EmptyArrayException extends RuntimeException {
    public EmptyArrayException() {
        super();
    }
    public EmptyArrayException(String notification){
        super(notification);
    }
}
