package com.fullstory;

/* loaded from: classes.dex */
public class Reason implements FSReason {
    public static final int CLASS_LOAD_FAILURE = -2147483643;
    public static final int ENDIANNESS_UNSUPPORTED = -2147483644;
    public static final int NOT_INSTRUMENTED = Integer.MIN_VALUE;
    public static final int OS_UNSUPPORTED_OTHER = -2147483645;
    public static final int OS_VERSION_TOO_HIGH = -2147483646;
    public static final int OS_VERSION_TOO_LOW = -2147483647;
    private final int code;
    private final String message;

    public Reason(int i10, String str) {
        this.code = i10;
        this.message = str;
    }

    @Override // com.fullstory.FSReason
    public int getCode() {
        return this.code;
    }

    @Override // com.fullstory.FSReason
    public String getMessage() {
        return this.message;
    }
}
