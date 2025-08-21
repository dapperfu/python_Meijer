package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.eQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8017eQ {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f74699a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f74700b;

    /* renamed from: c, reason: collision with root package name */
    private final Xj0 f74701c;

    /* renamed from: d, reason: collision with root package name */
    private final AQ f74702d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC7863cy0 f74703e;

    public C8017eQ(ScheduledExecutorService scheduledExecutorService, Xj0 xj0, Xj0 xj02, AQ aq2, InterfaceC7863cy0 interfaceC7863cy0) {
        this.f74699a = scheduledExecutorService;
        this.f74700b = xj0;
        this.f74701c = xj02;
        this.f74702d = aq2;
        this.f74703e = interfaceC7863cy0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ OQ a(C9978wo c9978wo) throws Exception {
        return (OQ) this.f74702d.c(c9978wo).get(((Integer) Oc.A.c().a(C8784lf.f77431y5)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ com.google.common.util.concurrent.q b(final C9978wo c9978wo, int i10, Throwable th2) throws Exception {
        Bundle bundle;
        if (c9978wo != null && (bundle = c9978wo.f80378m) != null) {
            bundle.putBoolean("ls", true);
        }
        return Mj0.n(((BinderC9513sR) this.f74703e.zzb()).D9(c9978wo, i10), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.bQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h(new OQ((InputStream) obj, c9978wo));
            }
        }, this.f74700b);
    }

    public final com.google.common.util.concurrent.q c(final C9978wo c9978wo) {
        com.google.common.util.concurrent.q qVarK0;
        String str = c9978wo.f80369d;
        Nc.v.t();
        if (Rc.D0.d(str)) {
            qVarK0 = Mj0.g(new zzdyh(1));
        } else {
            qVarK0 = ((Boolean) Oc.A.c().a(C8784lf.f77279n7)).booleanValue() ? this.f74701c.k0(new Callable() { // from class: com.google.android.gms.internal.ads.cQ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f74016a.a(c9978wo);
                }
            }) : this.f74702d.c(c9978wo);
        }
        final int callingUid = Binder.getCallingUid();
        return (Cj0) Mj0.f((Cj0) Mj0.o(Cj0.D(qVarK0), ((Integer) Oc.A.c().a(C8784lf.f77431y5)).intValue(), TimeUnit.SECONDS, this.f74699a), Throwable.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.dQ
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f74243a.b(c9978wo, callingUid, (Throwable) obj);
            }
        }, this.f74700b);
    }
}
