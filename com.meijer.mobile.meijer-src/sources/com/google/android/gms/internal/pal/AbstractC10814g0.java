package com.google.android.gms.internal.pal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.pal.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10814g0 {

    /* renamed from: d, reason: collision with root package name */
    private static volatile int f83971d = 100;

    /* renamed from: a, reason: collision with root package name */
    int f83972a;

    /* renamed from: b, reason: collision with root package name */
    final int f83973b = f83971d;

    /* renamed from: c, reason: collision with root package name */
    C10830h0 f83974c;

    /* synthetic */ AbstractC10814g0(C10798f0 c10798f0) {
    }

    public static int l(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long m(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public abstract int a();

    public abstract int b(int i10) throws zzadi;

    public abstract int c() throws IOException;

    public abstract AbstractC10730b0 d() throws IOException;

    public abstract String e() throws IOException;

    public abstract String f() throws IOException;

    public abstract void g(int i10) throws zzadi;

    public abstract void h(int i10);

    public abstract boolean i() throws IOException;

    public abstract boolean j() throws IOException;

    public abstract boolean k(int i10) throws IOException;

    static AbstractC10814g0 n(byte[] bArr, int i10, int i11, boolean z10) {
        C10781e0 c10781e0 = new C10781e0(bArr, 0, i11, z10, null);
        try {
            c10781e0.b(i11);
            return c10781e0;
        } catch (zzadi e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
