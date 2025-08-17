package com.google.android.gms.internal.pal;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.pal.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10689g0 {

    /* renamed from: d, reason: collision with root package name */
    private static volatile int f83131d = 100;

    /* renamed from: a, reason: collision with root package name */
    int f83132a;

    /* renamed from: b, reason: collision with root package name */
    final int f83133b = f83131d;

    /* renamed from: c, reason: collision with root package name */
    C10705h0 f83134c;

    /* synthetic */ AbstractC10689g0(C10673f0 c10673f0) {
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

    public abstract AbstractC10605b0 d() throws IOException;

    public abstract String e() throws IOException;

    public abstract String f() throws IOException;

    public abstract void g(int i10) throws zzadi;

    public abstract void h(int i10);

    public abstract boolean i() throws IOException;

    public abstract boolean j() throws IOException;

    public abstract boolean k(int i10) throws IOException;

    static AbstractC10689g0 n(byte[] bArr, int i10, int i11, boolean z10) {
        C10656e0 c10656e0 = new C10656e0(bArr, 0, i11, z10, null);
        try {
            c10656e0.b(i11);
            return c10656e0;
        } catch (zzadi e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
