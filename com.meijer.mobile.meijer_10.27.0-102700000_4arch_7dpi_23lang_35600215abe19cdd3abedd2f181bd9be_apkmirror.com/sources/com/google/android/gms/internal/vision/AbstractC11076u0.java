package com.google.android.gms.internal.vision;

import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.internal.vision.u0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC11076u0 {

    /* renamed from: a, reason: collision with root package name */
    int f84647a;

    /* renamed from: b, reason: collision with root package name */
    private int f84648b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f84649c;

    private AbstractC11076u0() {
        this.f84647a = 100;
        this.f84648b = a.e.API_PRIORITY_OTHER;
        this.f84649c = false;
    }

    public static long a(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static int d(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract int c(int i10) throws zzjk;

    public abstract int e();

    static AbstractC11076u0 b(byte[] bArr, int i10, int i11, boolean z10) {
        C11079v0 c11079v0 = new C11079v0(bArr, i11);
        try {
            c11079v0.c(i11);
            return c11079v0;
        } catch (zzjk e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
