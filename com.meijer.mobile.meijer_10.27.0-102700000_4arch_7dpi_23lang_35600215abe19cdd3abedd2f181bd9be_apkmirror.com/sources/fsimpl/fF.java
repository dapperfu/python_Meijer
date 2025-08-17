package fsimpl;

import java.security.SecureRandom;

/* loaded from: classes14.dex */
public class fF {

    /* renamed from: a, reason: collision with root package name */
    private static final int f132207a = "AbCdEF. GHIJklM NOPQRS. TUVWXYZ ABCDEF. GHIJKLM NOPQRS. TUVWXYZ 1234567890".length();

    /* renamed from: b, reason: collision with root package name */
    private static final long f132208b = new SecureRandom().nextLong();

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.Object r7, java.lang.String r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r8.length()
            r0.<init>(r1)
            long r1 = fsimpl.fF.f132208b
            int r3 = r8.hashCode()
            long r3 = (long) r3
            long r1 = r1 ^ r3
            boolean r3 = r7 instanceof android.view.View
            r4 = 0
            if (r3 == 0) goto L20
            android.view.View r7 = (android.view.View) r7
            int r7 = r7.getId()
            r3 = -1
            if (r7 == r3) goto L2b
            goto L2c
        L20:
            boolean r3 = r7 instanceof com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode
            if (r3 == 0) goto L2b
            com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode r7 = (com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode) r7
            int r7 = r7._fsGetSemanticsId()
            goto L2c
        L2b:
            r7 = 0
        L2c:
            long r5 = (long) r7
            long r1 = r1 ^ r5
            java.util.Random r7 = new java.util.Random
            r7.<init>(r1)
        L33:
            int r1 = r8.length()
            if (r4 >= r1) goto L4b
            int r1 = fsimpl.fF.f132207a
            int r1 = r7.nextInt(r1)
            java.lang.String r2 = "AbCdEF. GHIJklM NOPQRS. TUVWXYZ ABCDEF. GHIJKLM NOPQRS. TUVWXYZ 1234567890"
            char r1 = r2.charAt(r1)
            r0.append(r1)
            int r4 = r4 + 1
            goto L33
        L4b:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fsimpl.fF.a(java.lang.Object, java.lang.String):java.lang.String");
    }
}
