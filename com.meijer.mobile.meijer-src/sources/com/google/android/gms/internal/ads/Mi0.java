package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class Mi0 extends Oi0 {
    @Override // com.google.android.gms.internal.ads.Oi0
    final /* bridge */ /* synthetic */ Object E(Object obj, Throwable th2) throws Exception {
        InterfaceC9541sj0 interfaceC9541sj0 = (InterfaceC9541sj0) obj;
        com.google.common.util.concurrent.q qVarZza = interfaceC9541sj0.zza(th2);
        C6782Df0.d(qVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC9541sj0);
        return qVarZza;
    }

    @Override // com.google.android.gms.internal.ads.Oi0
    final /* synthetic */ void F(Object obj) {
        v((com.google.common.util.concurrent.q) obj);
    }

    Mi0(com.google.common.util.concurrent.q qVar, Class cls, InterfaceC9541sj0 interfaceC9541sj0) {
        super(qVar, cls, interfaceC9541sj0);
    }
}
