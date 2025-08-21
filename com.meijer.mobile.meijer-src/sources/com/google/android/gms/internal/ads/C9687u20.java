package com.google.android.gms.internal.ads;

import Kc.a;
import Oc.C4447y;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.u20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9687u20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79561a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f79562b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f79563c;

    /* renamed from: d, reason: collision with root package name */
    private final int f79564d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f79565e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f79566f;

    /* renamed from: g, reason: collision with root package name */
    private final C9447rq f79567g;

    C9687u20(C9447rq c9447rq, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        this.f79567g = c9447rq;
        this.f79561a = context;
        this.f79562b = scheduledExecutorService;
        this.f79563c = executor;
        this.f79564d = i10;
        this.f79565e = z10;
        this.f79566f = z11;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 40;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ com.google.android.gms.internal.ads.C9794v20 a(Kc.a.C0277a r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.Od0 r0 = new com.google.android.gms.internal.ads.Od0
            r0.<init>()
            boolean r1 = r7.f79565e
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8784lf.f77219j3
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.f79565e
            if (r1 == 0) goto L6f
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8784lf.f77233k3
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L31:
            android.content.Context r0 = r7.f79561a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.Sd0 r1 = com.google.android.gms.internal.ads.C7287Sd0.k(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r2 = r8.a()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            android.content.Context r0 = r7.f79561a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f77303p3     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.jf r4 = Oc.A.c()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Object r0 = r4.a(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            boolean r6 = r7.f79566f     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.Od0 r0 = r1.j(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            goto L6f
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
            com.google.android.gms.internal.ads.Aq r2 = Nc.v.s()
            r2.x(r0, r1)
            com.google.android.gms.internal.ads.Od0 r0 = new com.google.android.gms.internal.ads.Od0
            r0.<init>()
        L6f:
            com.google.android.gms.internal.ads.v20 r1 = new com.google.android.gms.internal.ads.v20
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9687u20.a(Kc.a$a):com.google.android.gms.internal.ads.v20");
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return (Cj0) Mj0.e((Cj0) Mj0.o((Cj0) Mj0.m(Cj0.D(this.f79567g.a(this.f79561a, this.f79564d)), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.s20
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return this.f78958a.a((a.C0277a) obj);
            }
        }, this.f79563c), ((Long) Oc.A.c().a(C8784lf.f77147e1)).longValue(), TimeUnit.MILLISECONDS, this.f79562b), Throwable.class, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.t20
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return this.f79310a.b((Throwable) obj);
            }
        }, this.f79563c);
    }

    final /* synthetic */ C9794v20 b(Throwable th2) {
        String string;
        C4447y.b();
        ContentResolver contentResolver = this.f79561a.getContentResolver();
        if (contentResolver == null) {
            string = null;
        } else {
            string = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new C9794v20(null, string, new C7151Od0());
    }
}
