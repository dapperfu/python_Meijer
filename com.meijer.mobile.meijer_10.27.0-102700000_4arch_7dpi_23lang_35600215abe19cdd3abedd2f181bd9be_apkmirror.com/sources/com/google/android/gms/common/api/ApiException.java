package com.google.android.gms.common.api;

/* loaded from: classes4.dex */
public class ApiException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    protected final Status f64729a;

    public Status a() {
        return this.f64729a;
    }

    public int b() {
        return this.f64729a.c0();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ApiException(Status status) {
        String strQ0;
        int iC0 = status.c0();
        if (status.q0() != null) {
            strQ0 = status.q0();
        } else {
            strQ0 = "";
        }
        super(iC0 + ": " + strQ0);
        this.f64729a = status;
    }
}
