package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mk0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8902mk0 extends Uj0 {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC9434rj0 f77711c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ RunnableFutureC9116ok0 f77712d;

    C8902mk0(RunnableFutureC9116ok0 runnableFutureC9116ok0, InterfaceC9434rj0 interfaceC9434rj0) {
        this.f77712d = runnableFutureC9116ok0;
        this.f77711c = interfaceC9434rj0;
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final /* bridge */ /* synthetic */ Object a() throws Exception {
        InterfaceC9434rj0 interfaceC9434rj0 = this.f77711c;
        com.google.common.util.concurrent.q qVarZza = interfaceC9434rj0.zza();
        C6782Df0.d(qVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC9434rj0);
        return qVarZza;
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final String b() {
        return this.f77711c.toString();
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final void d(Throwable th2) {
        this.f77712d.h(th2);
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final /* synthetic */ void e(Object obj) {
        this.f77712d.v((com.google.common.util.concurrent.q) obj);
    }

    @Override // com.google.android.gms.internal.ads.Uj0
    final boolean f() {
        return this.f77712d.isDone();
    }
}
