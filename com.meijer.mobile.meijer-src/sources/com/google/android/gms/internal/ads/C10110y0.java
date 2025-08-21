package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.y0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10110y0 {
    public static C8776lb a(InterfaceC9361r0 interfaceC9361r0, boolean z10) throws IOException {
        C8776lb c8776lbA = new H0().a(interfaceC9361r0, z10 ? null : C8831m2.f77541a);
        if (c8776lbA == null || c8776lbA.a() == 0) {
            return null;
        }
        return c8776lbA;
    }

    public static A0 b(GQ gq2) {
        gq2.m(1);
        int iE = gq2.E();
        long jT = gq2.t();
        long j10 = iE;
        int i10 = iE / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long J10 = gq2.J();
            if (J10 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = J10;
            jArrCopyOf2[i11] = gq2.J();
            gq2.m(2);
            i11++;
        }
        gq2.m((int) ((jT + j10) - gq2.t()));
        return new A0(jArrCopyOf, jArrCopyOf2);
    }
}
