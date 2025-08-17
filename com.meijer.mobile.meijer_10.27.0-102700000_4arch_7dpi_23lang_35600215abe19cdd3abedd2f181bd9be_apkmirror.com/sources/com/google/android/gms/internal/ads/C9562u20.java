package com.google.android.gms.internal.ads;

import Ic.a;
import Mc.C4169y;
import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.u20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9562u20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f78721a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f78722b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f78723c;

    /* renamed from: d, reason: collision with root package name */
    private final int f78724d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f78725e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f78726f;

    /* renamed from: g, reason: collision with root package name */
    private final C9322rq f78727g;

    C9562u20(C9322rq c9322rq, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        this.f78727g = c9322rq;
        this.f78721a = context;
        this.f78722b = scheduledExecutorService;
        this.f78723c = executor;
        this.f78724d = i10;
        this.f78725e = z10;
        this.f78726f = z11;
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
    final /* synthetic */ com.google.android.gms.internal.ads.C9669v20 a(Ic.a.C0217a r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.Od0 r0 = new com.google.android.gms.internal.ads.Od0
            r0.<init>()
            boolean r1 = r7.f78725e
            if (r1 != 0) goto L1b
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8659lf.f76379j3
            com.google.android.gms.internal.ads.jf r2 = Mc.A.c()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L31
        L1b:
            boolean r1 = r7.f78725e
            if (r1 == 0) goto L6f
            com.google.android.gms.internal.ads.bf r1 = com.google.android.gms.internal.ads.C8659lf.f76393k3
            com.google.android.gms.internal.ads.jf r2 = Mc.A.c()
            java.lang.Object r1 = r2.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L6f
        L31:
            android.content.Context r0 = r7.f78721a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.Sd0 r1 = com.google.android.gms.internal.ads.C7162Sd0.k(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r2 = r8.a()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            android.content.Context r0 = r7.f78721a     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.String r3 = r0.getPackageName()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76463p3     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.jf r4 = Mc.A.c()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Object r0 = r4.a(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            long r4 = r0.longValue()     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            boolean r6 = r7.f78726f     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            com.google.android.gms.internal.ads.Od0 r0 = r1.j(r2, r3, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L5e java.io.IOException -> L60
            goto L6f
        L5e:
            r0 = move-exception
            goto L61
        L60:
            r0 = move-exception
        L61:
            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
            com.google.android.gms.internal.ads.Aq r2 = Lc.v.s()
            r2.x(r0, r1)
            com.google.android.gms.internal.ads.Od0 r0 = new com.google.android.gms.internal.ads.Od0
            r0.<init>()
        L6f:
            com.google.android.gms.internal.ads.v20 r1 = new com.google.android.gms.internal.ads.v20
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9562u20.a(Ic.a$a):com.google.android.gms.internal.ads.v20");
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return (Cj0) Mj0.e((Cj0) Mj0.o((Cj0) Mj0.m(Cj0.D(this.f78727g.a(this.f78721a, this.f78724d)), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.s20
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return this.f78118a.a((a.C0217a) obj);
            }
        }, this.f78723c), ((Long) Mc.A.c().a(C8659lf.f76307e1)).longValue(), TimeUnit.MILLISECONDS, this.f78722b), Throwable.class, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.t20
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return this.f78470a.b((Throwable) obj);
            }
        }, this.f78723c);
    }

    final /* synthetic */ C9669v20 b(Throwable th2) {
        String string;
        C4169y.b();
        ContentResolver contentResolver = this.f78721a.getContentResolver();
        if (contentResolver == null) {
            string = null;
        } else {
            string = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new C9669v20(null, string, new C7026Od0());
    }
}
