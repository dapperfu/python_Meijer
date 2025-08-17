package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8777mk0 extends Uj0 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9309rj0 f76871c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ RunnableFutureC8991ok0 f76872d;

    C8777mk0(RunnableFutureC8991ok0 runnableFutureC8991ok0, InterfaceC9309rj0 interfaceC9309rj0) {
        this.f76872d = runnableFutureC8991ok0;
        this.f76871c = interfaceC9309rj0;
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final /* bridge */ /* synthetic */ Object a() throws Exception {
        InterfaceC9309rj0 interfaceC9309rj0 = this.f76871c;
        com.google.common.util.concurrent.q qVarZza = interfaceC9309rj0.zza();
        C6657Df0.d(qVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC9309rj0);
        return qVarZza;
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final String b() {
        return this.f76871c.toString();
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final void d(Throwable th2) {
        this.f76872d.h(th2);
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final /* synthetic */ void e(Object obj) {
        this.f76872d.v((com.google.common.util.concurrent.q) obj);
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final boolean f() {
        return this.f76872d.isDone();
    }
}
