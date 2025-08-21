package com.google.android.gms.internal.vision;

import com.google.android.gms.common.api.a;

/* renamed from: com.google.android.gms.internal.vision.u0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC11201u0 {

    /* renamed from: a, reason: collision with root package name */
    int f85487a;

    /* renamed from: b, reason: collision with root package name */
    private int f85488b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f85489c;

    private AbstractC11201u0() {
        this.f85487a = 100;
        this.f85488b = a.e.API_PRIORITY_OTHER;
        this.f85489c = false;
    }

    public static long a(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static int d(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract int c(int i10) throws zzjk;

    public abstract int e();

    static AbstractC11201u0 b(byte[] bArr, int i10, int i11, boolean z10) {
        C11204v0 c11204v0 = new C11204v0(bArr, i11);
        try {
            c11204v0.c(i11);
            return c11204v0;
        } catch (zzjk e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
