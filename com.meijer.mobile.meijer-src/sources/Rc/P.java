package Rc;

import com.google.android.gms.internal.ads.C7270Rq;
import com.google.android.gms.internal.ads.Y6;
import com.google.android.gms.internal.ads.zzaou;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private static Y6 f32329a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f32330b = new Object();

    public final com.google.common.util.concurrent.q a(String str) {
        C7270Rq c7270Rq = new C7270Rq();
        f32329a.a(new N(str, null, c7270Rq));
        return c7270Rq;
    }

    public final com.google.common.util.concurrent.q b(int i10, String str, Map map, byte[] bArr) throws IOException {
        L l10 = new L(null);
        J j10 = new J(this, str, l10);
        Sc.m mVar = new Sc.m(null);
        K k10 = new K(this, i10, str, l10, j10, bArr, map, mVar);
        if (Sc.m.k()) {
            try {
                mVar.d(str, "GET", k10.w(), k10.L());
            } catch (zzaou e10) {
                Sc.p.g(e10.getMessage());
            }
        }
        f32329a.a(k10);
        return l10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x003b, B:16:0x0036, B:18:0x003d), top: B:22:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public P(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto Ld
            android.content.Context r4 = r4.getApplicationContext()
        Ld:
            java.lang.Object r0 = Rc.P.f32330b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.Y6 r1 = Rc.P.f32329a     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L3d
            com.google.android.gms.internal.ads.C8784lf.a(r4)     // Catch: java.lang.Throwable -> L34
            boolean r1 = com.google.android.gms.common.util.e.a()     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L36
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8784lf.f77402w4     // Catch: java.lang.Throwable -> L34
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L34
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L36
            com.google.android.gms.internal.ads.Y6 r4 = Rc.A.b(r4)     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r4 = move-exception
            goto L3f
        L36:
            r1 = 0
            com.google.android.gms.internal.ads.Y6 r4 = com.google.android.gms.internal.ads.A7.a(r4, r1)     // Catch: java.lang.Throwable -> L34
        L3b:
            Rc.P.f32329a = r4     // Catch: java.lang.Throwable -> L34
        L3d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Rc.P.<init>(android.content.Context):void");
    }
}
