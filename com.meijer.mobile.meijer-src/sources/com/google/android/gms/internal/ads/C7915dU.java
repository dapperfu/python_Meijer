package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.dU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7915dU implements InterfaceC8448iT {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7278Ry f74250a;

    /* renamed from: b, reason: collision with root package name */
    private final JT f74251b;

    /* renamed from: c, reason: collision with root package name */
    private final Xj0 f74252c;

    /* renamed from: d, reason: collision with root package name */
    private final C7678bC f74253d;

    /* renamed from: e, reason: collision with root package name */
    private final ScheduledExecutorService f74254e;

    /* renamed from: f, reason: collision with root package name */
    private final C9296qN f74255f;

    public C7915dU(AbstractC7278Ry abstractC7278Ry, JT jt2, C7678bC c7678bC, ScheduledExecutorService scheduledExecutorService, Xj0 xj0, C9296qN c9296qN) {
        this.f74250a = abstractC7278Ry;
        this.f74251b = jt2;
        this.f74253d = c7678bC;
        this.f74254e = scheduledExecutorService;
        this.f74252c = xj0;
        this.f74255f = c9296qN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final boolean a(C8733l60 c8733l60, Z50 z50) {
        InterfaceC7158Oh interfaceC7158OhA = c8733l60.f76588a.f75445a.a();
        boolean zA = this.f74251b.a(c8733l60, z50);
        if (((Boolean) Oc.A.c().a(C8784lf.f76976Rb)).booleanValue()) {
            this.f74255f.b().put("has_dbl", interfaceC7158OhA != null ? "1" : "0");
            this.f74255f.b().put("crdb", true == zA ? "1" : "0");
        }
        return interfaceC7158OhA != null && zA;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8448iT
    public final com.google.common.util.concurrent.q b(final C8733l60 c8733l60, final Z50 z50) {
        return this.f74252c.k0(new Callable() { // from class: com.google.android.gms.internal.ads.aU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f73266a.c(c8733l60, z50);
            }
        });
    }

    final /* synthetic */ AbstractC8929my c(final C8733l60 c8733l60, final Z50 z50) throws Exception {
        return this.f74250a.b(new C7279Rz(c8733l60, z50, null), new C8610jz(c8733l60.f76588a.f75445a.a(), new Runnable() { // from class: com.google.android.gms.internal.ads.bU
            @Override // java.lang.Runnable
            public final void run() {
                this.f73652a.f(c8733l60, z50);
            }
        })).zza();
    }

    final /* synthetic */ void f(C8733l60 c8733l60, Z50 z50) {
        Mj0.r(Mj0.o(this.f74251b.b(c8733l60, z50), z50.f72852R, TimeUnit.SECONDS, this.f74254e), new C7808cU(this), this.f74252c);
    }
}
