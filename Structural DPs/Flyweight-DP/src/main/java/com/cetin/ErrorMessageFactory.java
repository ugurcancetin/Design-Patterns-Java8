package com.cetin;

//Flyweight factory. Returns shared flyweight based on key
public class ErrorMessageFactory {
    //This serves as key for getting flyweight instance
    public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    private ErrorMessageFactory() {

    }

    public UserBannedErrorMessage getUserBannedMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);
    }
}
