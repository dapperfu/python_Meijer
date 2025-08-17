package com.bazaarvoice.bvandroidsdk;

import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class Error {

    @InterfaceC15617c("Code")
    private String code;
    private transient ErrorCode errorCode;

    @InterfaceC15617c("Message")
    private String message;

    public String getCode() {
        return this.code;
    }

    public ErrorCode getErrorCode() {
        if (this.errorCode == null) {
            try {
                this.errorCode = ErrorCode.valueOf(getCode());
            } catch (IllegalArgumentException unused) {
                this.errorCode = ErrorCode.ERROR_UNKNOWN;
            }
        }
        return this.errorCode;
    }

    public String getMessage() {
        return this.message;
    }

    Error(String str, String str2) {
        this.message = str;
        this.code = str2;
    }
}
