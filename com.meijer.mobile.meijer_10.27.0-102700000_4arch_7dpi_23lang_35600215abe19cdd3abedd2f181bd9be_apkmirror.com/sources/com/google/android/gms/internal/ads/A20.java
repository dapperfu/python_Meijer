package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class A20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f65054a;

    /* renamed from: b, reason: collision with root package name */
    private final String f65055b;

    public A20(C9322rq c9322rq, Executor executor, String str, PackageInfo packageInfo, int i10) {
        this.f65054a = executor;
        this.f65055b = str;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 41;
    }

    final /* synthetic */ com.google.common.util.concurrent.q a(Throwable th2) throws Exception {
        return Mj0.h(new B20(this.f65055b));
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return Mj0.f(Mj0.m(Mj0.h(this.f65055b), new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.y20
            @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
            public final Object apply(Object obj) {
                return new B20((String) obj);
            }
        }, this.f65054a), Throwable.class, new InterfaceC9416sj0() { // from class: com.google.android.gms.internal.ads.z20
            @Override // com.google.android.gms.internal.ads.InterfaceC9416sj0
            public final com.google.common.util.concurrent.q zza(Object obj) {
                return this.f80343a.a((Throwable) obj);
            }
        }, this.f65054a);
    }
}
