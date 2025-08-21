package com.gimbal.internal.i;

/* loaded from: classes4.dex */
public final class c extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public String f65208a;

    /* renamed from: b, reason: collision with root package name */
    public int f65209b;

    public c() {
    }

    public c(String str, int i10) {
        this.f65208a = str;
        this.f65209b = i10;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Http4xxException [errorMessage=" + this.f65208a + ", statusCode=" + this.f65209b + "]";
    }
}
