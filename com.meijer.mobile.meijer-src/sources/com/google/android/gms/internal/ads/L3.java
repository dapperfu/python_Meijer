package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class L3 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f69087a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69088b;

    /* renamed from: c, reason: collision with root package name */
    public final W0 f69089c;

    /* renamed from: d, reason: collision with root package name */
    public final int f69090d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f69091e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public L3(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r11 != 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r0
        Lf:
            r2 = r2 ^ r3
            com.google.android.gms.internal.ads.C8211gC.d(r2)
            r4.f69087a = r5
            r4.f69088b = r6
            r4.f69090d = r7
            r4.f69091e = r11
            com.google.android.gms.internal.ads.W0 r5 = new com.google.android.gms.internal.ads.W0
            if (r6 != 0) goto L20
            goto L77
        L20:
            int r7 = r6.hashCode()
            r11 = 3
            r2 = 2
            switch(r7) {
                case 3046605: goto L47;
                case 3046671: goto L3d;
                case 3049879: goto L34;
                case 3049895: goto L2a;
                default: goto L29;
            }
        L29:
            goto L51
        L2a:
            java.lang.String r7 = "cens"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = r1
            goto L52
        L34:
            java.lang.String r7 = "cenc"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            goto L52
        L3d:
            java.lang.String r7 = "cbcs"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = r11
            goto L52
        L47:
            java.lang.String r7 = "cbc1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = r2
            goto L52
        L51:
            r0 = -1
        L52:
            if (r0 == 0) goto L77
            if (r0 == r1) goto L77
            if (r0 == r2) goto L76
            if (r0 == r11) goto L76
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "Unsupported protection scheme type '"
            r7.append(r11)
            r7.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            com.google.android.gms.internal.ads.C10042xL.f(r7, r6)
            goto L77
        L76:
            r1 = r2
        L77:
            r5.<init>(r1, r8, r9, r10)
            r4.f69089c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.L3.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
