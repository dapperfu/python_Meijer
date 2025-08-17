package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.a;

/* loaded from: classes6.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    private int f81135a;

    /* renamed from: b, reason: collision with root package name */
    private int f81136b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f81137c;

    private J() {
        this.f81135a = 100;
        this.f81136b = a.e.API_PRIORITY_OTHER;
        this.f81137c = false;
    }

    public static long a(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    static J b(byte[] bArr, int i10, int i11, boolean z10) {
        L l10 = new L(bArr, 0, i11, false);
        try {
            l10.d(i11);
            return l10;
        } catch (zzco e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int e(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract int c();

    public abstract int d(int i10) throws zzco;
}
