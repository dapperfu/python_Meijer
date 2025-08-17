package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public abstract class K4 extends C10565x4 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f81814b = Logger.getLogger(K4.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f81815c = C10478n6.f();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f81816d = 0;

    /* renamed from: a, reason: collision with root package name */
    L4 f81817a;

    private K4() {
        throw null;
    }

    public abstract void A(int i10) throws IOException;

    public abstract void B(long j10) throws IOException;

    public abstract void C(long j10) throws IOException;

    public abstract void D(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void E(String str) throws IOException;

    public abstract int F();

    public abstract void i(int i10, int i11) throws IOException;

    public abstract void j(int i10, int i11) throws IOException;

    public abstract void k(int i10, int i11) throws IOException;

    public abstract void l(int i10, int i11) throws IOException;

    public abstract void m(int i10, long j10) throws IOException;

    public abstract void n(int i10, long j10) throws IOException;

    public abstract void o(int i10, boolean z10) throws IOException;

    public abstract void p(int i10, String str) throws IOException;

    public abstract void q(int i10, G4 g42) throws IOException;

    public abstract void r(G4 g42) throws IOException;

    abstract void s(byte[] bArr, int i10, int i11) throws IOException;

    abstract void t(int i10, K5 k52, V5 v52) throws IOException;

    public abstract void u(int i10, K5 k52) throws IOException;

    public abstract void v(int i10, G4 g42) throws IOException;

    public abstract void w(K5 k52) throws IOException;

    public abstract void x(byte b10) throws IOException;

    public abstract void y(int i10) throws IOException;

    public abstract void z(int i10) throws IOException;

    /* synthetic */ K4(byte[] bArr) {
    }

    static int d(K5 k52, V5 v52) {
        int iH = ((AbstractC10503q4) k52).h(v52);
        return G(iH) + iH;
    }

    @Deprecated
    static int g(int i10, K5 k52, V5 v52) {
        int iG = G(i10 << 3);
        return iG + iG + ((AbstractC10503q4) k52).h(v52);
    }

    final void f(String str, C10496p6 c10496p6) throws IOException {
        f81814b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c10496p6);
        byte[] bytes = str.getBytes(C10486o5.f82315a);
        try {
            int length = bytes.length;
            z(length);
            D(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzll(e10);
        }
    }

    public static int G(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int a(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int b(String str) {
        int length;
        try {
            length = C10505q6.b(str);
        } catch (C10496p6 unused) {
            length = str.getBytes(C10486o5.f82315a).length;
        }
        return G(length) + length;
    }

    public static int c(K5 k52) {
        int iA = k52.a();
        return G(iA) + iA;
    }

    public final void e() {
        if (F() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
