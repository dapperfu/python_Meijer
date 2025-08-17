package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.ku0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8583ku0 extends Qt0 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f75711b = Logger.getLogger(AbstractC8583ku0.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f75712c = C7628bw0.a();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f75713d = 0;

    /* renamed from: a, reason: collision with root package name */
    C8690lu0 f75714a;

    private AbstractC8583ku0() {
        throw null;
    }

    static int c(int i10) {
        return i10 > 4096 ? RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT : i10;
    }

    public abstract void A(int i10) throws IOException;

    public abstract void B(int i10, long j10) throws IOException;

    public abstract void C(long j10) throws IOException;

    @Override // com.google.android.gms.internal.ads.Qt0
    public abstract void a(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void j() throws IOException;

    public abstract void k(byte b10) throws IOException;

    public abstract void l(int i10, boolean z10) throws IOException;

    public abstract void m(int i10, Zt0 zt0) throws IOException;

    public abstract int n();

    public abstract void o(int i10, int i11) throws IOException;

    public abstract void p(int i10) throws IOException;

    public abstract void q(int i10, long j10) throws IOException;

    public abstract void r(long j10) throws IOException;

    public abstract void s(int i10, int i11) throws IOException;

    public abstract void t(int i10) throws IOException;

    abstract void u(int i10, InterfaceC9120pv0 interfaceC9120pv0, Hv0 hv0) throws IOException;

    public abstract void v(int i10, InterfaceC9120pv0 interfaceC9120pv0) throws IOException;

    public abstract void w(int i10, Zt0 zt0) throws IOException;

    public abstract void x(int i10, String str) throws IOException;

    public abstract void y(int i10, int i11) throws IOException;

    public abstract void z(int i10, int i11) throws IOException;

    /* synthetic */ AbstractC8583ku0(C8476ju0 c8476ju0) {
    }

    @Deprecated
    static int D(int i10, InterfaceC9120pv0 interfaceC9120pv0, Hv0 hv0) {
        int iE = e(i10 << 3);
        return iE + iE + ((Ht0) interfaceC9120pv0).e(hv0);
    }

    static int b(InterfaceC9120pv0 interfaceC9120pv0, Hv0 hv0) {
        int iE = ((Ht0) interfaceC9120pv0).e(hv0);
        return e(iE) + iE;
    }

    final void h(String str, C8054fw0 c8054fw0) throws IOException {
        f75711b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c8054fw0);
        byte[] bytes = str.getBytes(Tu0.f70472a);
        try {
            int length = bytes.length;
            A(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgwt(e10);
        }
    }

    public static int E(InterfaceC9120pv0 interfaceC9120pv0) {
        int iZzaY = interfaceC9120pv0.zzaY();
        return e(iZzaY) + iZzaY;
    }

    public static int d(String str) {
        int length;
        try {
            length = C8161gw0.e(str);
        } catch (C8054fw0 unused) {
            length = str.getBytes(Tu0.f70472a).length;
        }
        return e(length) + length;
    }

    public static int e(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int f(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public final void g() {
        if (n() == 0) {
        } else {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
