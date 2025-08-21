package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cE0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7789cE0 {
    private static int b(boolean z10) {
        List supportedPerformancePoints;
        try {
            C9717uH0 c9717uH0 = new C9717uH0();
            c9717uH0.B("video/avc");
            C cH = c9717uH0.H();
            if (cH.f66504o != null) {
                List listE = C9711uE0.e(InterfaceC8535jE0.f76265a, cH, z10, false);
                for (int i10 = 0; i10 < listE.size(); i10++) {
                    if (((C7683bE0) listE.get(i10)).f73610d != null && ((C7683bE0) listE.get(i10)).f73610d.getVideoCapabilities() != null && (supportedPerformancePoints = ((C7683bE0) listE.get(i10)).f73610d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        n3.k.a();
                        return c(supportedPerformancePoints, n3.j.a(1280, 720, 60));
                    }
                }
            }
        } catch (zzsu unused) {
        }
        return 0;
    }

    private static int c(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (n3.m.a(list.get(i10)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
        /*
            java.util.List r2 = n3.l.a(r2)
            r0 = 0
            if (r2 == 0) goto L50
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Le
            goto L50
        Le:
            int r5 = (int) r5
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = n3.j.a(r3, r4, r5)
            int r2 = c(r2, r3)
            r3 = 1
            if (r2 != r3) goto L4f
            java.lang.Boolean r4 = com.google.android.gms.internal.ads.C7896dE0.b()
            if (r4 != 0) goto L4f
            int r4 = com.google.android.gms.internal.ads.OV.f69931a
            r5 = 35
            if (r4 < r5) goto L28
        L26:
            r3 = r0
            goto L3d
        L28:
            int r4 = b(r0)
            int r5 = b(r3)
            if (r4 != 0) goto L33
            goto L3d
        L33:
            r6 = 2
            if (r5 != 0) goto L39
            if (r4 == r6) goto L26
            goto L3d
        L39:
            if (r4 != r6) goto L3d
            if (r5 == r6) goto L26
        L3d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.C7896dE0.c(r3)
            java.lang.Boolean r3 = com.google.android.gms.internal.ads.C7896dE0.b()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L4f
            return r0
        L4f:
            return r2
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C7789cE0.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }
}
