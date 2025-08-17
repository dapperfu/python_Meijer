package com.gimbal.internal.i;

/* loaded from: classes4.dex */
public final class c extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public String f64368a;

    /* renamed from: b, reason: collision with root package name */
    public int f64369b;

    public c() {
    }

    public c(String str, int i10) {
        this.f64368a = str;
        this.f64369b = i10;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Http4xxException [errorMessage=" + this.f64368a + ", statusCode=" + this.f64369b + "]";
    }
}
