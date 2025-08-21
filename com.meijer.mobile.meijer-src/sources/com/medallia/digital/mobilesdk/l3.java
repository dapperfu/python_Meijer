package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f93321a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f93322b = 4095;

    /* renamed from: c, reason: collision with root package name */
    public static final int f93323c = 255;

    /* renamed from: d, reason: collision with root package name */
    public static final int f93324d = 127;

    /* renamed from: e, reason: collision with root package name */
    public static final int f93325e = 32;

    /* renamed from: f, reason: collision with root package name */
    public static final int f93326f = 15;

    l3() {
    }

    protected static Object a(Object obj) {
        return obj != null ? obj : JSONObject.NULL;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0035. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075 A[PHI: r4
      0x0075: PHI (r4v6 char) = (r4v5 char), (r4v7 char) binds: [B:28:0x0065, B:30:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static java.lang.String b(java.lang.String r6) {
        /*
            int r0 = r6.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r0 * 2
            r1.<init>(r2)
            r2 = 0
        Lc:
            if (r2 >= r0) goto L7e
            char r3 = r6.charAt(r2)
            r4 = 4095(0xfff, float:5.738E-42)
            if (r3 <= r4) goto L23
            java.lang.String r4 = "\\u"
        L18:
            r1.append(r4)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r1.append(r3)
            goto L7b
        L23:
            r4 = 255(0xff, float:3.57E-43)
            if (r3 <= r4) goto L2a
            java.lang.String r4 = "\\u0"
            goto L18
        L2a:
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 <= r4) goto L2f
            goto L3c
        L2f:
            r4 = 32
            r5 = 92
            if (r3 >= r4) goto L63
            switch(r3) {
                case 8: goto L5d;
                case 9: goto L57;
                case 10: goto L51;
                case 11: goto L38;
                case 12: goto L4b;
                case 13: goto L42;
                default: goto L38;
            }
        L38:
            r4 = 15
            if (r3 <= r4) goto L3f
        L3c:
            java.lang.String r4 = "\\u00"
            goto L18
        L3f:
            java.lang.String r4 = "\\u000"
            goto L18
        L42:
            r1.append(r5)
            r3 = 114(0x72, float:1.6E-43)
        L47:
            r1.append(r3)
            goto L7b
        L4b:
            r1.append(r5)
            r3 = 102(0x66, float:1.43E-43)
            goto L47
        L51:
            r1.append(r5)
            r3 = 110(0x6e, float:1.54E-43)
            goto L47
        L57:
            r1.append(r5)
            r3 = 116(0x74, float:1.63E-43)
            goto L47
        L5d:
            r1.append(r5)
            r3 = 98
            goto L47
        L63:
            r4 = 34
            if (r3 == r4) goto L75
            r4 = 39
            if (r3 == r4) goto L75
            if (r3 == r5) goto L6e
            goto L47
        L6e:
            r1.append(r5)
            r1.append(r5)
            goto L7b
        L75:
            r1.append(r5)
            r1.append(r4)
        L7b:
            int r2 = r2 + 1
            goto Lc
        L7e:
            java.lang.String r6 = r1.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.l3.b(java.lang.String):java.lang.String");
    }

    protected static String c(String str) {
        if (str != null) {
            str = str.replace("\n", "\\n");
        }
        if (str == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        return "\"" + str + "\"";
    }

    protected static String d(String str) {
        if (str != null) {
            str = b(str);
        }
        if (str == null) {
            return com.google.maps.android.BuildConfig.TRAVIS;
        }
        return "\"" + str + "\"";
    }

    protected static String e(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != '\\') {
                sb2.append(str.charAt(i10));
            }
        }
        return sb2.toString();
    }

    protected static String a(String str) {
        return str != null ? str.replace("\"", "\\\"") : str;
    }

    protected static String a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return str.replace(z10 ? "'" : "%27", z10 ? "%27" : "'");
    }
}
