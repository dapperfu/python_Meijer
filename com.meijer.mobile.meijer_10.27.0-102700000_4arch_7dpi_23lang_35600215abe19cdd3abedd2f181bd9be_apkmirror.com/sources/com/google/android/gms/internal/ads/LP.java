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
    private final Xj0 f68362a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f68363b;

    /* renamed from: c, reason: collision with root package name */
    private final C9601uQ f68364c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC7738cy0 f68365d;

    public LP(Xj0 xj0, Xj0 xj02, C9601uQ c9601uQ, InterfaceC7738cy0 interfaceC7738cy0) {
        this.f68362a = xj0;
        this.f68363b = xj02;
        this.f68364c = c9601uQ;
        this.f68365d = interfaceC7738cy0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ OQ a(C9853wo c9853wo) throws Exception {
        return (OQ) this.f68364c.c(c9853wo).get(((Integer) Mc.A.c().a(C8659lf.f76591y5)).intValue(), TimeUnit.SECONDS);
    }

    final /* synthetic */ com.google.common.util.concurrent.q b(final C9853wo c9853wo, int i10, zzdyh zzdyhVar) throws Exception {
        Bundle bundle;
        if (c9853wo != null && (bundle = c9853wo.f79538m) != null) {
            bundle.putBoolean("ls", true);
        }
        return Mj0.n(((BinderC9388sR) this.f68365d.zzb()).C9(c9853wo, i10), new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.HP
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return Mj0.h(new OQ((InputStream) obj, c9853wo));
            }
        }, this.f68363b);
    }

    public final com.google.common.util.concurrent.q c(final C9853wo c9853wo) {
        String str = c9853wo.f79529d;
        Lc.v.t();
        com.google.common.util.concurrent.q qVarG = Pc.D0.d(str) ? Mj0.g(new zzdyh(1)) : Mj0.f(this.f68362a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.IP
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f67615a.a(c9853wo);
            }
        }), ExecutionException.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.JP
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return Mj0.g(cause);
            }
        }, this.f68363b);
        final int callingUid = Binder.getCallingUid();
        return Mj0.f(qVarG, zzdyh.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.KP
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f68085a.b(c9853wo, callingUid, (zzdyh) obj);
            }
        }, this.f68363b);
    }
}
