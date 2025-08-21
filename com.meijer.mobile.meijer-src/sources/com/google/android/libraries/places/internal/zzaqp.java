package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaqp {
    public static boolean zza(int i10) {
        return i10 <= 126 ? i10 >= 32 || i10 == 10 || i10 == 13 || i10 == 9 || i10 == 12 : i10 < 55296 ? i10 >= 160 : i10 < 64976 ? i10 > 57343 : i10 > 65007 && (i10 & 65534) != 65534 && i10 <= 1114111;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String zzb(java.lang.String r6, int r7) {
        /*
            int r7 = r6.length()
            r0 = 0
            r1 = r0
        L6:
            if (r1 != r7) goto L9
            return r6
        L9:
            int r2 = r1 + 1
            char r3 = r6.charAt(r1)
            r4 = 126(0x7e, float:1.77E-43)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r3 > r4) goto L1b
            r4 = 32
            if (r3 < r4) goto L22
            goto L49
        L1b:
            if (r3 >= r5) goto L22
            r4 = 160(0xa0, float:2.24E-43)
            if (r3 < r4) goto L22
            goto L49
        L22:
            if (r3 >= r5) goto L35
            r1 = 10
            if (r3 == r1) goto L49
            r1 = 13
            if (r3 == r1) goto L49
            r1 = 9
            if (r3 == r1) goto L49
            r1 = 12
            if (r3 == r1) goto L49
            goto L59
        L35:
            r4 = 57343(0xdfff, float:8.0355E-41)
            r5 = 65534(0xfffe, float:9.1833E-41)
            if (r3 <= r4) goto L4b
            r1 = 64976(0xfdd0, float:9.1051E-41)
            if (r3 < r1) goto L49
            r1 = 65007(0xfdef, float:9.1094E-41)
            if (r3 <= r1) goto L59
            if (r3 >= r5) goto L59
        L49:
            r1 = r2
            goto L6
        L4b:
            int r2 = java.lang.Character.codePointAt(r6, r1)
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 < r3) goto L59
            r2 = r2 & r5
            if (r2 == r5) goto L59
            int r1 = r1 + 2
            goto L6
        L59:
            int r7 = r6.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
        L62:
            if (r0 >= r7) goto L8d
            char r2 = r6.charAt(r0)
            boolean r3 = zza(r2)
            if (r3 == 0) goto L74
            r1.append(r2)
            int r0 = r0 + 1
            goto L62
        L74:
            int r2 = java.lang.Character.codePointAt(r6, r0)
            boolean r3 = zza(r2)
            r4 = 1
            if (r4 == r3) goto L83
            r3 = 65533(0xfffd, float:9.1831E-41)
            goto L84
        L83:
            r3 = r2
        L84:
            r1.appendCodePoint(r3)
            int r2 = java.lang.Character.charCount(r2)
            int r0 = r0 + r2
            goto L62
        L8d:
            java.lang.String r6 = r1.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzaqp.zzb(java.lang.String, int):java.lang.String");
    }
}
