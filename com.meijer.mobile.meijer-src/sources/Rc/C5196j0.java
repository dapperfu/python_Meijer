package Rc;

/* renamed from: Rc.j0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5196j0 {

    /* renamed from: b, reason: collision with root package name */
    private static C5196j0 f32362b;

    /* renamed from: a, reason: collision with root package name */
    String f32363a;

    public static C5196j0 a() {
        if (f32362b == null) {
            f32362b = new C5196j0();
        }
        return f32362b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Updating user agent."
            Rc.p0.k(r0)
            java.lang.String r0 = android.webkit.WebSettings.getDefaultUserAgent(r7)
            java.lang.String r1 = r6.f32363a
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3e
            android.content.Context r1 = id.C14726i.c(r7)
            boolean r2 = com.google.android.gms.common.util.e.a()
            if (r2 != 0) goto L1e
            if (r1 != 0) goto L3c
            r1 = 0
        L1e:
            java.lang.String r2 = android.webkit.WebSettings.getDefaultUserAgent(r7)
            r3 = 0
            java.lang.String r4 = "admob_user_agent"
            android.content.SharedPreferences r3 = r7.getSharedPreferences(r4, r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r5 = "user_agent"
            android.content.SharedPreferences$Editor r2 = r3.putString(r5, r2)
            if (r1 != 0) goto L39
            r2.apply()
            goto L3c
        L39:
            com.google.android.gms.common.util.q.a(r7, r2, r4)
        L3c:
            r6.f32363a = r0
        L3e:
            java.lang.String r7 = "User agent is updated."
            Rc.p0.k(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Rc.C5196j0.b(android.content.Context):void");
    }

    private C5196j0() {
    }
}
