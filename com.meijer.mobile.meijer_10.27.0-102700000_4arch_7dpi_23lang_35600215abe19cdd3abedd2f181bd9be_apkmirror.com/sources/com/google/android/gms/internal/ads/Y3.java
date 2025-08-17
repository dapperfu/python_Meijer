package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
final class Y3 extends AbstractC7643c4 {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f71465o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f71466p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f71467n;

    public static boolean j(GQ gq2) {
        return k(gq2, f71465o);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7643c4
    protected final boolean c(GQ gq2, long j10, Z3 z32) throws zzbc {
        if (k(gq2, f71465o)) {
            byte[] bArrCopyOf = Arrays.copyOf(gq2.n(), gq2.u());
            int i10 = bArrCopyOf[9] & 255;
            List listE = M0.e(bArrCopyOf);
            if (z32.f71980a == null) {
                C9592uH0 c9592uH0 = new C9592uH0();
                c9592uH0.B("audio/opus");
                c9592uH0.r0(i10);
                c9592uH0.C(48000);
                c9592uH0.n(listE);
                z32.f71980a = c9592uH0.H();
                return true;
            }
        } else {
            if (!k(gq2, f71466p)) {
                C8086gC.b(z32.f71980a);
                return false;
            }
            C8086gC.b(z32.f71980a);
            if (!this.f71467n) {
                this.f71467n = true;
                gq2.m(8);
                C8651lb c8651lbB = C7744d1.b(AbstractC7917eh0.s(C7744d1.c(gq2, false, false).f72331a));
                if (c8651lbB != null) {
                    C9592uH0 c9592uH0B = z32.f71980a.b();
                    c9592uH0B.t(c8651lbB.d(z32.f71980a.f65661l));
                    z32.f71980a = c9592uH0B.H();
                }
            }
        }
        return true;
    }

    Y3() {
    }

    private static boolean k(GQ gq2, byte[] bArr) {
        if (gq2.r() < 8) {
            return false;
        }
        int iT = gq2.t();
        byte[] bArr2 = new byte[8];
        gq2.h(bArr2, 0, 8);
        gq2.l(iT);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7643c4
    protected final long a(GQ gq2) {
        return f(M0.d(gq2.n()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7643c4
    protected final void b(boolean z10) {
        super.b(z10);
        if (z10) {
            this.f71467n = false;
        }
    }
}
