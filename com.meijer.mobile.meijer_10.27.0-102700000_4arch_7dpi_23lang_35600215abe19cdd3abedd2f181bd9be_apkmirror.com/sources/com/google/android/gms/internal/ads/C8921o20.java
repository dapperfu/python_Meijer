package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.o20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8921o20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.r0 f77284a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f77285b;

    /* renamed from: c, reason: collision with root package name */
    private final Xj0 f77286c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f77287d;

    /* renamed from: e, reason: collision with root package name */
    private final C8109gT f77288e;

    /* renamed from: f, reason: collision with root package name */
    private final C9570u60 f77289f;

    /* renamed from: g, reason: collision with root package name */
    private final Qc.a f77290g;

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 56;
    }

    final /* synthetic */ com.google.common.util.concurrent.q a(final Throwable th2) throws Exception {
        this.f77286c.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.l20
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) Mc.A.c().a(C8659lf.f76456oa)).booleanValue();
                Throwable th3 = th2;
                if (zBooleanValue) {
                    Lc.v.s().y(th3, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    Lc.v.s().w(th3, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return Mj0.h(th2 instanceof SecurityException ? new C9135q20("", 2, null) : th2 instanceof IllegalStateException ? new C9135q20("", 3, null) : th2 instanceof IllegalArgumentException ? new C9135q20("", 4, null) : th2 instanceof TimeoutException ? new C9135q20("", 5, null) : new C9135q20("", 0, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.f77285b.getPackageName()) == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    @Override // com.google.android.gms.internal.ads.T10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.q zzb() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8921o20.zzb():com.google.common.util.concurrent.q");
    }

    C8921o20(Pc.r0 r0Var, Context context, Xj0 xj0, ScheduledExecutorService scheduledExecutorService, C8109gT c8109gT, C9570u60 c9570u60, Qc.a aVar) {
        this.f77284a = r0Var;
        this.f77285b = context;
        this.f77286c = xj0;
        this.f77287d = scheduledExecutorService;
        this.f77288e = c8109gT;
        this.f77289f = c9570u60;
        this.f77290g = aVar;
    }
}
