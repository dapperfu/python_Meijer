package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.eu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7943eu0 {

    /* renamed from: d, reason: collision with root package name */
    private static volatile int f73944d = 100;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f73945e = 0;

    /* renamed from: a, reason: collision with root package name */
    int f73946a;

    /* renamed from: b, reason: collision with root package name */
    final int f73947b = f73944d;

    /* renamed from: c, reason: collision with root package name */
    C8050fu0 f73948c;

    /* synthetic */ AbstractC7943eu0(C7836du0 c7836du0) {
    }

    public static int c(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long d(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public abstract void A(int i10);

    public abstract boolean a() throws IOException;

    public abstract boolean b() throws IOException;

    public abstract double g() throws IOException;

    public abstract float h() throws IOException;

    public abstract int i();

    public abstract int j(int i10) throws zzgyg;

    public abstract int k() throws IOException;

    public abstract int l() throws IOException;

    public abstract int m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract int p() throws IOException;

    public abstract int q() throws IOException;

    public abstract long r() throws IOException;

    public abstract long s() throws IOException;

    public abstract long t() throws IOException;

    public abstract long u() throws IOException;

    public abstract long v() throws IOException;

    public abstract Zt0 w() throws IOException;

    public abstract String x() throws IOException;

    public abstract String y() throws IOException;

    public abstract void z(int i10) throws zzgyg;

    public static AbstractC7943eu0 e(InputStream inputStream, int i10) {
        if (inputStream != null) {
            return new C7730cu0(inputStream, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT, null);
        }
        byte[] bArr = Tu0.f70473b;
        int length = bArr.length;
        return f(bArr, 0, 0, false);
    }

    static AbstractC7943eu0 f(byte[] bArr, int i10, int i11, boolean z10) {
        C7517au0 c7517au0 = new C7517au0(bArr, i10, i11, z10, null);
        try {
            c7517au0.j(i11);
            return c7517au0;
        } catch (zzgyg e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
