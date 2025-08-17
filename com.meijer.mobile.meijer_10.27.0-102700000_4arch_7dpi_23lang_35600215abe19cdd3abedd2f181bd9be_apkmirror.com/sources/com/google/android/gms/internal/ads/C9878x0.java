package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.x0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9878x0 {
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(com.google.android.gms.internal.ads.GQ r23, com.google.android.gms.internal.ads.B0 r24, int r25, com.google.android.gms.internal.ads.C9771w0 r26) {
        /*
            r0 = r23
            r1 = r24
            int r2 = r0.t()
            long r3 = r0.K()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r25
            long r7 = (long) r7
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L19
            return r8
        L19:
            r9 = 1
            long r5 = r5 & r9
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L23
            r5 = r6
            goto L24
        L23:
            r5 = r8
        L24:
            r7 = 12
            long r11 = r3 >> r7
            r13 = 8
            long r13 = r3 >> r13
            r15 = 4
            long r15 = r3 >> r15
            long r17 = r3 >> r6
            long r3 = r3 & r9
            r19 = 15
            r21 = r9
            long r9 = r15 & r19
            int r9 = (int) r9
            r10 = 7
            r15 = -1
            if (r9 > r10) goto L43
            int r10 = r1.f65395g
            int r10 = r10 + r15
            if (r9 != r10) goto Laf
            goto L4c
        L43:
            r10 = 10
            if (r9 > r10) goto Laf
            int r9 = r1.f65395g
            r10 = 2
            if (r9 != r10) goto Laf
        L4c:
            r9 = 7
            long r9 = r17 & r9
            int r9 = (int) r9
            if (r9 != 0) goto L54
            goto L58
        L54:
            int r10 = r1.f65397i
            if (r9 != r10) goto Laf
        L58:
            int r3 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r3 == 0) goto Laf
            r3 = r26
            boolean r3 = d(r0, r1, r5, r3)
            if (r3 == 0) goto Laf
            long r3 = r11 & r19
            int r3 = (int) r3
            int r3 = a(r0, r3)
            if (r3 == r15) goto Laf
            int r4 = r1.f65390b
            if (r3 > r4) goto Laf
            long r3 = r13 & r19
            int r5 = r1.f65393e
            int r3 = (int) r3
            if (r3 != 0) goto L79
            goto L9b
        L79:
            r4 = 11
            if (r3 > r4) goto L82
            int r1 = r1.f65394f
            if (r3 == r1) goto L9b
            goto Laf
        L82:
            if (r3 != r7) goto L8d
            int r1 = r0.C()
            int r1 = r1 * 1000
            if (r1 != r5) goto Laf
            goto L9b
        L8d:
            r1 = 14
            if (r3 > r1) goto Laf
            int r4 = r0.G()
            if (r3 != r1) goto L99
            int r4 = r4 * 10
        L99:
            if (r4 != r5) goto Laf
        L9b:
            int r1 = r0.C()
            int r3 = r0.t()
            byte[] r0 = r0.n()
            int r3 = r3 + r15
            int r0 = com.google.android.gms.internal.ads.OV.y(r0, r2, r3, r8)
            if (r1 != r0) goto Laf
            return r6
        Laf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9878x0.c(com.google.android.gms.internal.ads.GQ, com.google.android.gms.internal.ads.B0, int, com.google.android.gms.internal.ads.w0):boolean");
    }

    public static int a(GQ gq2, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return gq2.C() + 1;
            case 7:
                return gq2.G() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long b(InterfaceC9236r0 interfaceC9236r0, B0 b02) throws IOException {
        boolean z10;
        int i10;
        interfaceC9236r0.zzj();
        interfaceC9236r0.zzg(1);
        byte[] bArr = new byte[1];
        interfaceC9236r0.g(bArr, 0, 1);
        int i11 = bArr[0] & 1;
        if (1 != i11) {
            z10 = false;
        } else {
            z10 = true;
        }
        interfaceC9236r0.zzg(2);
        if (1 != i11) {
            i10 = 6;
        } else {
            i10 = 7;
        }
        GQ gq2 = new GQ(i10);
        gq2.k(C9557u0.a(interfaceC9236r0, gq2.n(), 0, i10));
        interfaceC9236r0.zzj();
        C9771w0 c9771w0 = new C9771w0();
        if (d(gq2, b02, z10, c9771w0)) {
            return c9771w0.f79396a;
        }
        throw zzbc.a(null, null);
    }

    private static boolean d(GQ gq2, B0 b02, boolean z10, C9771w0 c9771w0) {
        try {
            long jN = gq2.N();
            if (!z10) {
                jN *= b02.f65390b;
            }
            c9771w0.f79396a = jN;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
