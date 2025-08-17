package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
public class zzbc extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f80573a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80574b;

    public static zzbc a(String str, Throwable th2) {
        return new zzbc(str, th2, true, 1);
    }

    public static zzbc b(String str, Throwable th2) {
        return new zzbc(str, th2, true, 0);
    }

    public static zzbc c(String str) {
        return new zzbc(str, null, false, 1);
    }

    protected zzbc(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f80573a = z10;
        this.f80574b = i10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + " {contentIsMalformed=" + this.f80573a + ", dataType=" + this.f80574b + "}";
    }
}
