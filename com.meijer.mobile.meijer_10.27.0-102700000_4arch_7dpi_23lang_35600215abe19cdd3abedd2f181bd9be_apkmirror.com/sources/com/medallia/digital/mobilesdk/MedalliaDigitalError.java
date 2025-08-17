package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
public abstract class MedalliaDigitalError {
    private final int errorCode;
    private final String message;

    protected MedalliaDigitalError(int i10, String str) {
        this.errorCode = i10;
        this.message = str;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getMessage() {
        return "(" + this.errorCode + ") " + this.message;
    }
}
