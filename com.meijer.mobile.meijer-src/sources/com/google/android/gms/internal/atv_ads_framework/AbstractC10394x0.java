package com.google.android.gms.internal.atv_ads_framework;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.x0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10394x0 extends C10344g0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f81912b = Logger.getLogger(AbstractC10394x0.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f81913c = C10326a2.C();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f81914d = 0;

    /* renamed from: a, reason: collision with root package name */
    C10397y0 f81915a;

    private AbstractC10394x0() {
    }

    public static int v(int i10) {
        if (i10 >= 0) {
            return y(i10);
        }
        return 10;
    }

    public static int y(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int z(long j10) {
        int i10;
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if (((-34359738368L) & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if (((-2097152) & j10) != 0) {
            j10 >>>= 14;
            i10 += 2;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public abstract int d();

    public abstract void e(byte b10) throws IOException;

    public abstract void f(int i10, boolean z10) throws IOException;

    public abstract void g(int i10, AbstractC10374q0 abstractC10374q0) throws IOException;

    public abstract void h(int i10, int i11) throws IOException;

    public abstract void i(int i10) throws IOException;

    public abstract void j(int i10, long j10) throws IOException;

    public abstract void k(long j10) throws IOException;

    public abstract void l(int i10, int i11) throws IOException;

    public abstract void m(int i10) throws IOException;

    public abstract void n(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void o(int i10, String str) throws IOException;

    public abstract void p(int i10, int i11) throws IOException;

    public abstract void q(int i10, int i11) throws IOException;

    public abstract void r(int i10) throws IOException;

    public abstract void s(int i10, long j10) throws IOException;

    public abstract void t(long j10) throws IOException;

    /* synthetic */ AbstractC10394x0(C10391w0 c10391w0) {
    }

    public static AbstractC10394x0 A(byte[] bArr, int i10, int i11) {
        return new C10388v0(bArr, 0, i11);
    }

    @Deprecated
    static int u(int i10, InterfaceC10372p1 interfaceC10372p1, InterfaceC10401z1 interfaceC10401z1) {
        int iB = ((AbstractC10335d0) interfaceC10372p1).b(interfaceC10401z1);
        int iY = y(i10 << 3);
        return iY + iY + iB;
    }

    static int w(InterfaceC10372p1 interfaceC10372p1, InterfaceC10401z1 interfaceC10401z1) {
        int iB = ((AbstractC10335d0) interfaceC10372p1).b(interfaceC10401z1);
        return y(iB) + iB;
    }

    final void b(String str, e2 e2Var) throws IOException {
        f81912b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2Var);
        byte[] bytes = str.getBytes(S0.f81713b);
        try {
            int length = bytes.length;
            r(length);
            n(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzct(e10);
        }
    }

    public static int x(String str) {
        int length;
        try {
            length = f2.c(str);
        } catch (e2 unused) {
            length = str.getBytes(S0.f81713b).length;
        }
        return y(length) + length;
    }

    public final void a() {
        if (d() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
