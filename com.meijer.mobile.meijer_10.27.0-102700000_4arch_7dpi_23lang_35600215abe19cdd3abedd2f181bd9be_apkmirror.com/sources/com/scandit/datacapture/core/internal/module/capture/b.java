package com.scandit.datacapture.core.internal.module.capture;

/* loaded from: classes11.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList a(android.content.Context r12) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.j(r12, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L43
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            java.lang.String r1 = r12.getPackageName()
            r3 = 134217728(0x8000000, float:3.85186E-34)
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r3)
            android.content.pm.SigningInfo r0 = w6.M.a(r0)
            if (r0 == 0) goto L43
            boolean r1 = w6.N.a(r0)
            if (r1 == 0) goto L2b
            android.content.pm.Signature[] r0 = w6.O.a(r0)
            goto L44
        L2b:
            android.content.pm.Signature[] r0 = w6.P.a(r0)
            java.lang.String r1 = "getSigningCertificateHistory(...)"
            kotlin.jvm.internal.Intrinsics.i(r0, r1)
            java.lang.Object r0 = kotlin.collections.ArraysKt.g0(r0)
            android.content.pm.Signature r0 = (android.content.pm.Signature) r0
            if (r0 == 0) goto L43
            r1 = 1
            android.content.pm.Signature[] r1 = new android.content.pm.Signature[r1]
            r1[r2] = r0
            r0 = r1
            goto L44
        L43:
            r0 = 0
        L44:
            if (r0 != 0) goto L5a
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            java.lang.String r12 = r12.getPackageName()
            r1 = 64
            android.content.pm.PackageInfo r12 = r0.getPackageInfo(r12, r1)
            android.content.pm.Signature[] r0 = r12.signatures
            if (r0 != 0) goto L5a
            android.content.pm.Signature[] r0 = new android.content.pm.Signature[r2]
        L5a:
            java.util.List r12 = kotlin.collections.ArraysKt.c0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.x(r12, r1)
            r0.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
        L6d:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r12.next()
            android.content.pm.Signature r1 = (android.content.pm.Signature) r1
            java.lang.String r2 = "SHA-1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)
            byte[] r1 = r1.toByteArray()
            byte[] r3 = r2.digest(r1)
            java.lang.String r1 = "digest(...)"
            kotlin.jvm.internal.Intrinsics.i(r3, r1)
            com.scandit.datacapture.core.internal.module.capture.a r9 = com.scandit.datacapture.core.internal.module.capture.a.f124206a
            r10 = 30
            r11 = 0
            java.lang.String r4 = ""
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r1 = kotlin.collections.ArraysKt.B0(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.add(r1)
            goto L6d
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.internal.module.capture.b.a(android.content.Context):java.util.ArrayList");
    }
}
