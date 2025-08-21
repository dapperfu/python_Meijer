package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
final class Y3 extends AbstractC7768c4 {

    /* renamed from: o, reason: collision with root package name */
    private static final byte[] f72305o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    private static final byte[] f72306p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    private boolean f72307n;

    public static boolean j(GQ gq2) {
        return k(gq2, f72305o);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7768c4
    protected final boolean c(GQ gq2, long j10, Z3 z32) throws zzbc {
        if (k(gq2, f72305o)) {
            byte[] bArrCopyOf = Arrays.copyOf(gq2.n(), gq2.u());
            int i10 = bArrCopyOf[9] & 255;
            List listE = M0.e(bArrCopyOf);
            if (z32.f72820a == null) {
                C9717uH0 c9717uH0 = new C9717uH0();
                c9717uH0.B("audio/opus");
                c9717uH0.r0(i10);
                c9717uH0.C(48000);
                c9717uH0.n(listE);
                z32.f72820a = c9717uH0.H();
                return true;
            }
        } else {
            if (!k(gq2, f72306p)) {
                C8211gC.b(z32.f72820a);
                return false;
            }
            C8211gC.b(z32.f72820a);
            if (!this.f72307n) {
                this.f72307n = true;
                gq2.m(8);
                C8776lb c8776lbB = C7869d1.b(AbstractC8042eh0.s(C7869d1.c(gq2, false, false).f73171a));
                if (c8776lbB != null) {
                    C9717uH0 c9717uH0B = z32.f72820a.b();
                    c9717uH0B.t(c8776lbB.d(z32.f72820a.f66501l));
                    z32.f72820a = c9717uH0B.H();
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

    @Override // com.google.android.gms.internal.ads.AbstractC7768c4
    protected final long a(GQ gq2) {
        return f(M0.d(gq2.n()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7768c4
    protected final void b(boolean z10) {
        super.b(z10);
        if (z10) {
            this.f72307n = false;
        }
    }
}
