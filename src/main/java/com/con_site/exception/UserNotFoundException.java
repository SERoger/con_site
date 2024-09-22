package com.con_site.exception;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

public class UserNotFoundException extends NotFoundException {
    String message;
    public UserNotFoundException(String message) {
        super();
        this.message=message;
    }
}
