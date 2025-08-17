package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzbzi {
    private static final String[] zza = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] zzb = new String[64];
    private static final String[] zzc = new String[256];

    zzbzi() {
    }

    static {
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            zzc[i11] = String.format("%8s", Integer.toBinaryString(i11)).replace(' ', '0');
        }
        String[] strArr = zzb;
        strArr[0] = "";
        strArr[1] = "END_STREAM";
        int[] iArr = {1};
        strArr[8] = "PADDED";
        for (int i12 = 0; i12 <= 0; i12++) {
            int i13 = iArr[i12];
            String[] strArr2 = zzb;
            strArr2[i13 | 8] = String.valueOf(strArr2[i13]).concat("|PADDED");
        }
        String[] strArr3 = zzb;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i14 = 0;
        while (i14 < 3) {
            int i15 = iArr2[i14];
            for (int i16 = i10; i16 <= 0; i16++) {
                int i17 = iArr[i16];
                int i18 = i17 | i15;
                String[] strArr4 = zzb;
                String str = strArr4[i17];
                String str2 = strArr4[i15];
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
                sb2.append(str);
                sb2.append("|");
                sb2.append(str2);
                strArr4[i18] = sb2.toString();
                int i19 = i18 | 8;
                String str3 = strArr4[i17];
                String str4 = strArr4[i15];
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length() + 7);
                sb3.append(str3);
                sb3.append("|");
                sb3.append(str4);
                sb3.append("|PADDED");
                strArr4[i19] = sb3.toString();
            }
            i14++;
            i10 = 0;
        }
        for (int i20 = 0; i20 < 64; i20++) {
            String[] strArr5 = zzb;
            if (strArr5[i20] == null) {
                strArr5[i20] = zzc[i20];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String zza(boolean r5, int r6, int r7, byte r8, byte r9) {
        /*
            r0 = 10
            if (r8 >= r0) goto L9
            java.lang.String[] r0 = com.google.android.libraries.places.internal.zzbzi.zza
            r0 = r0[r8]
            goto L17
        L9:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "0x%02x"
            java.lang.String r0 = java.lang.String.format(r1, r0)
        L17:
            r1 = 1
            if (r9 != 0) goto L1d
            java.lang.String r8 = ""
            goto L6c
        L1d:
            r2 = 2
            if (r8 == r2) goto L68
            r2 = 3
            if (r8 == r2) goto L68
            r2 = 4
            if (r8 == r2) goto L5e
            r3 = 6
            if (r8 == r3) goto L5e
            r3 = 7
            if (r8 == r3) goto L68
            r3 = 8
            if (r8 == r3) goto L68
            r3 = 64
            if (r9 >= r3) goto L39
            java.lang.String[] r3 = com.google.android.libraries.places.internal.zzbzi.zzb
            r3 = r3[r9]
            goto L3d
        L39:
            java.lang.String[] r3 = com.google.android.libraries.places.internal.zzbzi.zzc
            r3 = r3[r9]
        L3d:
            r4 = 5
            if (r8 != r4) goto L4d
            r8 = r9 & 4
            if (r8 == 0) goto L5c
            java.lang.String r8 = "HEADERS"
            java.lang.String r9 = "PUSH_PROMISE"
            java.lang.String r8 = r3.replace(r8, r9)
            goto L6c
        L4d:
            if (r8 != 0) goto L5c
            r8 = r9 & 32
            if (r8 == 0) goto L5c
            java.lang.String r8 = "PRIORITY"
            java.lang.String r9 = "COMPRESSED"
            java.lang.String r8 = r3.replace(r8, r9)
            goto L6c
        L5c:
            r8 = r3
            goto L6c
        L5e:
            if (r9 != r1) goto L63
            java.lang.String r8 = "ACK"
            goto L6c
        L63:
            java.lang.String[] r8 = com.google.android.libraries.places.internal.zzbzi.zzc
            r8 = r8[r9]
            goto L6c
        L68:
            java.lang.String[] r8 = com.google.android.libraries.places.internal.zzbzi.zzc
            r8 = r8[r9]
        L6c:
            java.util.Locale r9 = java.util.Locale.US
            if (r1 == r5) goto L73
            java.lang.String r5 = ">>"
            goto L75
        L73:
            java.lang.String r5 = "<<"
        L75:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r7, r0, r8}
            java.lang.String r6 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r5 = java.lang.String.format(r9, r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbzi.zza(boolean, int, int, byte, byte):java.lang.String");
    }
}
