package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class LP {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f69202a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f69203b;

    /* renamed from: c, reason: collision with root package name */
    private final C9726uQ f69204c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC7863cy0 f69205d;

    public LP(Xj0 xj0, Xj0 xj02, C9726uQ c9726uQ, InterfaceC7863cy0 interfaceC7863cy0) {
        this.f69202a = xj0;
        this.f69203b = xj02;
        this.f69204c = c9726uQ;
        this.f69205d = interfaceC7863cy0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ OQ a(C9978wo c9978wo) throws Exception {
        return (OQ) this.f69204c.c(c9978wo).get(((Integer) Oc.A.c().a(C8784lf.f77431y5)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ com.google.common.util.concurrent.q b(final C9978wo c9978wo, int i10, zzdyh zzdyhVar) throws Exception {
        Bundle bundle;
        if (c9978wo != null && (bundle = c9978wo.f80378m) != null) {
            bundle.putBoolean("ls", true);
        }
        return Mj0.n(((BinderC9513sR) this.f69205d.zzb()).C9(c9978wo, i10), new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.HP
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h(new OQ((InputStream) obj, c9978wo));
            }
        }, this.f69203b);
    }

    public final com.google.common.util.concurrent.q c(final C9978wo c9978wo) {
        String str = c9978wo.f80369d;
        Nc.v.t();
        com.google.common.util.concurrent.q qVarG = Rc.D0.d(str) ? Mj0.g(new zzdyh(1)) : Mj0.f(this.f69202a.k0(new Callable() { // from class: com.google.android.gms.internal.ads.IP
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f68455a.a(c9978wo);
            }
        }), ExecutionException.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.JP
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return Mj0.g(cause);
            }
        }, this.f69203b);
        final int callingUid = Binder.getCallingUid();
        return Mj0.f(qVarG, zzdyh.class, new InterfaceC9541sj0() { // from class: com.google.android.gms.internal.ads.KP
            @Override // com.google.android.gms.internal.ads.InterfaceC9541sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f68925a.b(c9978wo, callingUid, (zzdyh) obj);
            }
        }, this.f69203b);
    }
}
