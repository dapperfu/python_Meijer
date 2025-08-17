package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
final class G4 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f67071c = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f67072d;

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f67073e;

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f67074f;

    /* renamed from: a, reason: collision with root package name */
    public final int f67075a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f67076b;

    private G4(int i10, PointF pointF) {
        this.f67075a = i10;
        this.f67076b = pointF;
    }

    static {
        Locale locale = Locale.US;
        f67072d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f67073e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f67074f = Pattern.compile("\\\\an(\\d+)");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e A[Catch: RuntimeException -> 0x000a, TryCatch #1 {RuntimeException -> 0x000a, blocks: (B:23:0x0082, B:25:0x008e, B:27:0x0094, B:28:0x0099), top: B:37:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.G4 a(java.lang.String r12) throws java.lang.NumberFormatException {
        /*
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.G4.f67071c
            java.util.regex.Matcher r12 = r0.matcher(r12)
            r0 = 0
            r1 = -1
            r3 = r0
            r2 = r1
        La:
            boolean r4 = r12.find()
            if (r4 == 0) goto La0
            r4 = 1
            java.lang.String r5 = r12.group(r4)
            r5.getClass()
            java.util.regex.Pattern r6 = com.google.android.gms.internal.ads.G4.f67072d     // Catch: java.lang.RuntimeException -> L82
            java.util.regex.Matcher r6 = r6.matcher(r5)     // Catch: java.lang.RuntimeException -> L82
            java.util.regex.Pattern r7 = com.google.android.gms.internal.ads.G4.f67073e     // Catch: java.lang.RuntimeException -> L82
            java.util.regex.Matcher r7 = r7.matcher(r5)     // Catch: java.lang.RuntimeException -> L82
            boolean r8 = r6.find()     // Catch: java.lang.RuntimeException -> L82
            boolean r9 = r7.find()     // Catch: java.lang.RuntimeException -> L82
            r10 = 2
            if (r8 == 0) goto L55
            if (r9 == 0) goto L4c
            java.lang.String r7 = "SsaStyle.Overrides"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L82
            r8.<init>()     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r9 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='"
            r8.append(r9)     // Catch: java.lang.RuntimeException -> L82
            r8.append(r5)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r9 = "'"
            r8.append(r9)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r8 = r8.toString()     // Catch: java.lang.RuntimeException -> L82
            com.google.android.gms.internal.ads.C9917xL.e(r7, r8)     // Catch: java.lang.RuntimeException -> L82
        L4c:
            java.lang.String r7 = r6.group(r4)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r6 = r6.group(r10)     // Catch: java.lang.RuntimeException -> L82
            goto L62
        L55:
            if (r9 == 0) goto L7e
            java.lang.String r6 = r7.group(r4)     // Catch: java.lang.RuntimeException -> L82
            java.lang.String r7 = r7.group(r10)     // Catch: java.lang.RuntimeException -> L82
            r11 = r7
            r7 = r6
            r6 = r11
        L62:
            android.graphics.PointF r8 = new android.graphics.PointF     // Catch: java.lang.RuntimeException -> L82
            if (r7 == 0) goto L7d
            java.lang.String r7 = r7.trim()     // Catch: java.lang.RuntimeException -> L82
            float r7 = java.lang.Float.parseFloat(r7)     // Catch: java.lang.RuntimeException -> L82
            if (r6 == 0) goto L7c
            java.lang.String r6 = r6.trim()     // Catch: java.lang.RuntimeException -> L82
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.RuntimeException -> L82
            r8.<init>(r7, r6)     // Catch: java.lang.RuntimeException -> L82
            goto L7f
        L7c:
            throw r0     // Catch: java.lang.RuntimeException -> L82
        L7d:
            throw r0     // Catch: java.lang.RuntimeException -> L82
        L7e:
            r8 = r0
        L7f:
            if (r8 == 0) goto L82
            r3 = r8
        L82:
            java.util.regex.Pattern r6 = com.google.android.gms.internal.ads.G4.f67074f     // Catch: java.lang.RuntimeException -> La
            java.util.regex.Matcher r5 = r6.matcher(r5)     // Catch: java.lang.RuntimeException -> La
            boolean r6 = r5.find()     // Catch: java.lang.RuntimeException -> La
            if (r6 == 0) goto L9a
            java.lang.String r4 = r5.group(r4)     // Catch: java.lang.RuntimeException -> La
            if (r4 == 0) goto L99
            int r4 = com.google.android.gms.internal.ads.H4.a(r4)     // Catch: java.lang.RuntimeException -> La
            goto L9b
        L99:
            throw r0     // Catch: java.lang.RuntimeException -> La
        L9a:
            r4 = r1
        L9b:
            if (r4 == r1) goto La
            r2 = r4
            goto La
        La0:
            com.google.android.gms.internal.ads.G4 r12 = new com.google.android.gms.internal.ads.G4
            r12.<init>(r2, r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.G4.a(java.lang.String):com.google.android.gms.internal.ads.G4");
    }

    public static String b(String str) {
        return f67071c.matcher(str).replaceAll("");
    }
}
