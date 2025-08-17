package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.eQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7892eQ {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f73859a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f73860b;

    /* renamed from: c, reason: collision with root package name */
    private final Xj0 f73861c;

    /* renamed from: d, reason: collision with root package name */
    private final AQ f73862d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC7738cy0 f73863e;

    public C7892eQ(ScheduledExecutorService scheduledExecutorService, Xj0 xj0, Xj0 xj02, AQ aq2, InterfaceC7738cy0 interfaceC7738cy0) {
        this.f73859a = scheduledExecutorService;
        this.f73860b = xj0;
        this.f73861c = xj02;
        this.f73862d = aq2;
        this.f73863e = interfaceC7738cy0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ OQ a(C9853wo c9853wo) throws Exception {
        return (OQ) this.f73862d.c(c9853wo).get(((Integer) Mc.A.c().a(C8659lf.f76591y5)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ com.google.common.util.concurrent.q b(final C9853wo c9853wo, int i10, Throwable th2) throws Exception {
        Bundle bundle;
        if (c9853wo != null && (bundle = c9853wo.f79538m) != null) {
            bundle.putBoolean("ls", true);
        }
        return Mj0.n(((BinderC9388sR) this.f73863e.zzb()).D9(c9853wo, i10), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.bQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h(new OQ((InputStream) obj, c9853wo));
            }
        }, this.f73860b);
    }

    public final com.google.common.util.concurrent.q c(final C9853wo c9853wo) {
        com.google.common.util.concurrent.q qVarI0;
        String str = c9853wo.f79529d;
        Lc.v.t();
        if (Pc.D0.d(str)) {
            qVarI0 = Mj0.g(new zzdyh(1));
        } else {
            qVarI0 = ((Boolean) Mc.A.c().a(C8659lf.f76439n7)).booleanValue() ? this.f73861c.i0(new Callable() { // from class: com.google.android.gms.internal.ads.cQ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f73176a.a(c9853wo);
                }
            }) : this.f73862d.c(c9853wo);
        }
        final int callingUid = Binder.getCallingUid();
        return (Cj0) Mj0.f((Cj0) Mj0.o(Cj0.D(qVarI0), ((Integer) Mc.A.c().a(C8659lf.f76591y5)).intValue(), TimeUnit.SECONDS, this.f73859a), Throwable.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.dQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f73403a.b(c9853wo, callingUid, (Throwable) obj);
            }
        }, this.f73860b);
    }
}
