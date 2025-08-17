package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes6.dex */
public final class QD0 implements XD0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69545a;

    public QD0(Context context) {
        this.f69545a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    @Override // com.google.android.gms.internal.ads.XD0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.ZD0 a(com.google.android.gms.internal.ads.WD0 r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = com.google.android.gms.internal.ads.OV.f69091a
            r1 = 23
            if (r0 < r1) goto L45
            r1 = 31
            if (r0 < r1) goto Lb
            goto L20
        Lb:
            android.content.Context r1 = r6.f69545a
            if (r1 == 0) goto L45
            r2 = 28
            if (r0 < r2) goto L45
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "com.amazon.hardware.tv_screen"
            boolean r1 = r1.hasSystemFeature(r2)
            if (r1 != 0) goto L20
            goto L45
        L20:
            com.google.android.gms.internal.ads.C r0 = r7.f71035c
            java.lang.String r0 = r0.f65664o
            int r0 = com.google.android.gms.internal.ads.C7057Pc.b(r0)
            java.lang.String r1 = com.google.android.gms.internal.ads.OV.d(r0)
            java.lang.String r2 = "DMCodecAdapterFactory"
            java.lang.String r3 = "Creating an asynchronous MediaCodec adapter for track type "
            java.lang.String r1 = r3.concat(r1)
            com.google.android.gms.internal.ads.C9917xL.e(r2, r1)
            com.google.android.gms.internal.ads.GD0 r1 = new com.google.android.gms.internal.ads.GD0
            r1.<init>(r0)
            r0 = 1
            r1.e(r0)
            com.google.android.gms.internal.ads.ID0 r7 = r1.d(r7)
            return r7
        L45:
            r1 = 0
            com.google.android.gms.internal.ads.bE0 r2 = r7.f71033a     // Catch: java.lang.RuntimeException -> L92 java.io.IOException -> L94
            java.lang.String r2 = r2.f72767a     // Catch: java.lang.RuntimeException -> L92 java.io.IOException -> L94
            java.lang.String r3 = "createCodec:"
            java.lang.String r3 = r3.concat(r2)     // Catch: java.lang.RuntimeException -> L92 java.io.IOException -> L94
            android.os.Trace.beginSection(r3)     // Catch: java.lang.RuntimeException -> L92 java.io.IOException -> L94
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r2)     // Catch: java.lang.RuntimeException -> L92 java.io.IOException -> L94
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L92 java.io.IOException -> L94
            java.lang.String r3 = "configureCodec"
            android.os.Trace.beginSection(r3)     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            android.view.Surface r3 = r7.f71036d     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            r4 = 0
            if (r3 != 0) goto L75
            com.google.android.gms.internal.ads.bE0 r5 = r7.f71033a     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            boolean r5 = r5.f72774h     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            if (r5 == 0) goto L75
            r5 = 35
            if (r0 < r5) goto L75
            r4 = 8
            goto L75
        L71:
            r7 = move-exception
            goto L90
        L73:
            r7 = move-exception
            goto L90
        L75:
            android.media.MediaFormat r0 = r7.f71034b     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            r2.configure(r0, r3, r1, r4)     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            java.lang.String r0 = "startCodec"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            r2.start()     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            android.os.Trace.endSection()     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            com.google.android.gms.internal.ads.wE0 r0 = new com.google.android.gms.internal.ads.wE0     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            com.google.android.gms.internal.ads.UD0 r7 = r7.f71038f     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            r0.<init>(r2, r7, r1)     // Catch: java.lang.RuntimeException -> L71 java.io.IOException -> L73
            return r0
        L90:
            r1 = r2
            goto L95
        L92:
            r7 = move-exception
            goto L95
        L94:
            r7 = move-exception
        L95:
            if (r1 == 0) goto L9a
            r1.release()
        L9a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.QD0.a(com.google.android.gms.internal.ads.WD0):com.google.android.gms.internal.ads.ZD0");
    }
}
