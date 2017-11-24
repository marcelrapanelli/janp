package com.janp.justanormalperson.datas;

/**
 * Created by Marcel.Tavares on 20/10/2017.
 */
public class ResponseData {

    private boolean error;
    private boolean success;
    private String message;

    public ResponseData(){};

    public ResponseData(boolean error, boolean success, String message) {
        this.error = error;
        this.success = success;
        this.message = message;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
