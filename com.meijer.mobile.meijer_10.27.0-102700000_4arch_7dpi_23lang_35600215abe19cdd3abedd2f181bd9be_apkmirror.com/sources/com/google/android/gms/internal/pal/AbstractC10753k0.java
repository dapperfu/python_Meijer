package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.pal.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10753k0 extends Q {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f83200b = Logger.getLogger(AbstractC10753k0.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f83201c = T1.C();

    /* renamed from: a, reason: collision with root package name */
    C10769l0 f83202a;

    private AbstractC10753k0() {
    }

    public static int D(int i10) {
        return a(i10 << 3);
    }

    public static int a(int i10) {
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

    public static int b(long j10) {
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
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & (-16384)) != 0 ? i10 + 1 : i10;
    }

    public static AbstractC10753k0 c(byte[] bArr) {
        return new C10721i0(bArr, 0, bArr.length);
    }

    public static int z(int i10) {
        if (i10 >= 0) {
            return a(i10);
        }
        return 10;
    }

    public abstract int g();

    public abstract void h(byte b10) throws IOException;

    public abstract void i(int i10, boolean z10) throws IOException;

    public abstract void j(int i10, AbstractC10605b0 abstractC10605b0) throws IOException;

    public abstract void k(int i10, int i11) throws IOException;

    public abstract void l(int i10) throws IOException;

    public abstract void m(int i10, long j10) throws IOException;

    public abstract void n(long j10) throws IOException;

    public abstract void o(int i10, int i11) throws IOException;

    public abstract void p(int i10) throws IOException;

    public abstract void q(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void r(int i10, String str) throws IOException;

    public abstract void s(int i10, int i11) throws IOException;

    public abstract void t(int i10, int i11) throws IOException;

    public abstract void u(int i10) throws IOException;

    public abstract void v(int i10, long j10) throws IOException;

    public abstract void w(long j10) throws IOException;

    /* synthetic */ AbstractC10753k0(C10737j0 c10737j0) {
    }

    static int B(InterfaceC10690g1 interfaceC10690g1, InterfaceC10881s1 interfaceC10881s1) {
        K k10 = (K) interfaceC10690g1;
        int iC = k10.c();
        if (iC == -1) {
            iC = interfaceC10881s1.zza(k10);
            k10.d(iC);
        }
        return a(iC) + iC;
    }

    @Deprecated
    static int y(int i10, InterfaceC10690g1 interfaceC10690g1, InterfaceC10881s1 interfaceC10881s1) {
        int iA = a(i10 << 3);
        int i11 = iA + iA;
        K k10 = (K) interfaceC10690g1;
        int iC = k10.c();
        if (iC == -1) {
            iC = interfaceC10881s1.zza(k10);
            k10.d(iC);
        }
        return i11 + iC;
    }

    final void e(String str, X1 x12) throws IOException {
        f83200b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) x12);
        byte[] bytes = str.getBytes(J0.f82677b);
        try {
            int length = bytes.length;
            u(length);
            q(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzacf(e10);
        }
    }

    public static int A(L0 l02) {
        int iA = l02.a();
        return a(iA) + iA;
    }

    public static int C(String str) {
        int length;
        try {
            length = Y1.c(str);
        } catch (X1 unused) {
            length = str.getBytes(J0.f82677b).length;
        }
        return a(length) + length;
    }

    public static int x(AbstractC10605b0 abstractC10605b0) {
        int iF = abstractC10605b0.f();
        return a(iF) + iF;
    }

    public final void d() {
        if (g() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
