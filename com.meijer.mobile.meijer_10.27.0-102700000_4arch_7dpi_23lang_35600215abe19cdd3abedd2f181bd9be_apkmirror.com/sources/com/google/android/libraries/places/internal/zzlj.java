package com.google.android.libraries.places.internal;

import android.text.TextUtils;

/* loaded from: classes6.dex */
public final class zzlj {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int zza(java.lang.String r8) {
        /*
            r0 = 13
            if (r8 != 0) goto L5
            return r0
        L5:
            int r1 = r8.hashCode()
            r2 = 3
            r3 = 4
            r4 = 1
            r5 = 0
            r6 = 5
            r7 = 2
            switch(r1) {
                case -1698126997: goto L45;
                case -1125000185: goto L3b;
                case -813482689: goto L31;
                case 2524: goto L27;
                case 1023286998: goto L1d;
                case 1831775833: goto L13;
                default: goto L12;
            }
        L12:
            goto L4f
        L13:
            java.lang.String r1 = "OVER_QUERY_LIMIT"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L4f
            r8 = r7
            goto L50
        L1d:
            java.lang.String r1 = "NOT_FOUND"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L4f
            r8 = r6
            goto L50
        L27:
            java.lang.String r1 = "OK"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L4f
            r8 = r5
            goto L50
        L31:
            java.lang.String r1 = "ZERO_RESULTS"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L4f
            r8 = r4
            goto L50
        L3b:
            java.lang.String r1 = "INVALID_REQUEST"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L4f
            r8 = r3
            goto L50
        L45:
            java.lang.String r1 = "REQUEST_DENIED"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L4f
            r8 = r2
            goto L50
        L4f:
            r8 = -1
        L50:
            if (r8 == 0) goto L69
            if (r8 == r4) goto L69
            if (r8 == r7) goto L66
            if (r8 == r2) goto L63
            if (r8 == r3) goto L60
            if (r8 == r6) goto L5d
            return r0
        L5d:
            r8 = 9013(0x2335, float:1.263E-41)
            return r8
        L60:
            r8 = 9012(0x2334, float:1.2629E-41)
            return r8
        L63:
            r8 = 9011(0x2333, float:1.2627E-41)
            return r8
        L66:
            r8 = 9010(0x2332, float:1.2626E-41)
            return r8
        L69:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzlj.zza(java.lang.String):int");
    }

    public static String zzb(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2;
    }
}
