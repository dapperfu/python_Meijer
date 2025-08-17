package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.y0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9985y0 {
    public static C8651lb a(InterfaceC9236r0 interfaceC9236r0, boolean z10) throws IOException {
        C8651lb c8651lbA = new H0().a(interfaceC9236r0, z10 ? null : C8706m2.f76701a);
        if (c8651lbA == null || c8651lbA.a() == 0) {
            return null;
        }
        return c8651lbA;
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
