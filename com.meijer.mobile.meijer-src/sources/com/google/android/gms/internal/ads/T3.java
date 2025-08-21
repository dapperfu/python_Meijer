package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes6.dex */
final class T3 extends AbstractC7768c4 {

    /* renamed from: n, reason: collision with root package name */
    private B0 f71121n;

    /* renamed from: o, reason: collision with root package name */
    private S3 f71122o;

    private static boolean j(byte[] bArr) {
        return bArr[0] == -1;
    }

    T3() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7768c4
    protected final long a(GQ gq2) {
        if (j(gq2.n())) {
            int i10 = (gq2.n()[2] & 255) >> 4;
            if (i10 != 6) {
                if (i10 == 7) {
                    i10 = 7;
                    gq2.m(4);
                    gq2.N();
                }
            } else {
                gq2.m(4);
                gq2.N();
            }
            int iA = C10003x0.a(gq2, i10);
            gq2.l(0);
            return iA;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7768c4
    protected final void b(boolean z10) {
        super.b(z10);
        if (z10) {
            this.f71121n = null;
            this.f71122o = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7768c4
    protected final boolean c(GQ gq2, long j10, Z3 z32) {
        byte[] bArrN = gq2.n();
        B0 b02 = this.f71121n;
        if (b02 == null) {
            B0 b03 = new B0(bArrN, 17);
            this.f71121n = b03;
            z32.f72820a = b03.c(Arrays.copyOfRange(bArrN, 9, gq2.u()), null);
            return true;
        }
        if ((bArrN[0] & Byte.MAX_VALUE) == 3) {
            A0 a0B = C10110y0.b(gq2);
            B0 b0F = b02.f(a0B);
            this.f71121n = b0F;
            this.f71122o = new S3(b0F, a0B);
            return true;
        }
        if (!j(bArrN)) {
            return true;
        }
        S3 s32 = this.f71122o;
        if (s32 != null) {
            s32.b(j10);
            z32.f72821b = this.f71122o;
        }
        z32.f72820a.getClass();
        return false;
    }
}
