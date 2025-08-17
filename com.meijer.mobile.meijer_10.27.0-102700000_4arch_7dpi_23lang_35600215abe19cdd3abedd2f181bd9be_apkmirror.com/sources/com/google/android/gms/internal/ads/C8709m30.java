package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.m30, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8709m30 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final C6568Aq f76705a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f76706b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f76707c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f76708d;

    /* renamed from: e, reason: collision with root package name */
    private final Xj0 f76709e;

    C8709m30(C6568Aq c6568Aq, boolean z10, boolean z11, C9109pq c9109pq, Xj0 xj0, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f76705a = c6568Aq;
        this.f76706b = z10;
        this.f76707c = z11;
        this.f76709e = xj0;
        this.f76708d = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 50;
    }

    final /* synthetic */ C8816n30 a(Exception exc) {
        this.f76705a.x(exc, "TrustlessTokenSignal");
        return new C8816n30(null);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76117Q6)).booleanValue() && this.f76707c) {
            return Mj0.h(new C8816n30(null));
        }
        if (!this.f76706b) {
            return Mj0.h(new C8816n30(null));
        }
        return Mj0.e(Mj0.o(Mj0.m(Mj0.h(null), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.k30
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return new C8816n30((String) obj);
            }
        }, this.f76709e), ((Long) C6556Ag.f65156b.e()).longValue(), TimeUnit.MILLISECONDS, this.f76708d), Exception.class, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.l30
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return this.f75742a.a((Exception) obj);
            }
        }, this.f76709e);
    }
}
