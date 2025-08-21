package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.m30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8834m30 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final C6693Aq f77545a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f77546b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f77547c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f77548d;

    /* renamed from: e, reason: collision with root package name */
    private final Xj0 f77549e;

    C8834m30(C6693Aq c6693Aq, boolean z10, boolean z11, C9234pq c9234pq, Xj0 xj0, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f77545a = c6693Aq;
        this.f77546b = z10;
        this.f77547c = z11;
        this.f77549e = xj0;
        this.f77548d = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 50;
    }

    final /* synthetic */ C8941n30 a(Exception exc) {
        this.f77545a.x(exc, "TrustlessTokenSignal");
        return new C8941n30(null);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        if (((Boolean) Oc.A.c().a(C8784lf.f76957Q6)).booleanValue() && this.f77547c) {
            return Mj0.h(new C8941n30(null));
        }
        if (!this.f77546b) {
            return Mj0.h(new C8941n30(null));
        }
        return Mj0.e(Mj0.o(Mj0.m(Mj0.h(null), new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.k30
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return new C8941n30((String) obj);
            }
        }, this.f77549e), ((Long) C6681Ag.f65996b.e()).longValue(), TimeUnit.MILLISECONDS, this.f77548d), Exception.class, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.l30
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                return this.f76582a.a((Exception) obj);
            }
        }, this.f77549e);
    }
}
