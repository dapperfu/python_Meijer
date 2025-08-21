package com.google.android.gms.common.api;

/* loaded from: classes4.dex */
public class ApiException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    protected final Status f65569a;

    public Status a() {
        return this.f65569a;
    }

    public int b() {
        return this.f65569a.b0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiException(Status status) {
        String strR0;
        int iB0 = status.b0();
        if (status.r0() != null) {
            strR0 = status.r0();
        } else {
            strR0 = "";
        }
        super(iB0 + ": " + strR0);
        this.f65569a = status;
    }
}
