package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.o20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9046o20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Rc.r0 f78124a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f78125b;

    /* renamed from: c, reason: collision with root package name */
    private final Xj0 f78126c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f78127d;

    /* renamed from: e, reason: collision with root package name */
    private final C8234gT f78128e;

    /* renamed from: f, reason: collision with root package name */
    private final C9695u60 f78129f;

    /* renamed from: g, reason: collision with root package name */
    private final Sc.a f78130g;

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 56;
    }

    final /* synthetic */ com.google.common.util.concurrent.q a(final Throwable th2) throws Exception {
        this.f78126c.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.l20
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) Oc.A.c().a(C8784lf.f77296oa)).booleanValue();
                Throwable th3 = th2;
                if (zBooleanValue) {
                    Nc.v.s().y(th3, "TopicsSignalUnsampled.fetchTopicsSignal");
                } else {
                    Nc.v.s().w(th3, "TopicsSignal.fetchTopicsSignal");
                }
            }
        });
        return Mj0.h(th2 instanceof SecurityException ? new C9260q20("", 2, null) : th2 instanceof IllegalStateException ? new C9260q20("", 3, null) : th2 instanceof IllegalArgumentException ? new C9260q20("", 4, null) : th2 instanceof TimeoutException ? new C9260q20("", 5, null) : new C9260q20("", 0, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        if (java.util.Arrays.asList(r0.split(",")).contains(r5.f78125b.getPackageName()) == false) goto L28;
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9046o20.zzb():com.google.common.util.concurrent.q");
    }

    C9046o20(Rc.r0 r0Var, Context context, Xj0 xj0, ScheduledExecutorService scheduledExecutorService, C8234gT c8234gT, C9695u60 c9695u60, Sc.a aVar) {
        this.f78124a = r0Var;
        this.f78125b = context;
        this.f78126c = xj0;
        this.f78127d = scheduledExecutorService;
        this.f78128e = c8234gT;
        this.f78129f = c9695u60;
        this.f78130g = aVar;
    }
}
