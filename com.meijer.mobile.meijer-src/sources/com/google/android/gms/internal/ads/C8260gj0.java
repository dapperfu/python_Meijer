package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8260gj0 extends AbstractRunnableC8473ij0 {
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC8473ij0
    final /* bridge */ /* synthetic */ Object E(Object obj, Object obj2) throws Exception {
        InterfaceC9541sj0 interfaceC9541sj0 = (InterfaceC9541sj0) obj;
        com.google.common.util.concurrent.q qVarZza = interfaceC9541sj0.zza(obj2);
        C6782Df0.d(qVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC9541sj0);
        return qVarZza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC8473ij0
    final /* synthetic */ void F(Object obj) {
        v((com.google.common.util.concurrent.q) obj);
    }

    C8260gj0(com.google.common.util.concurrent.q qVar, InterfaceC9541sj0 interfaceC9541sj0) {
        super(qVar, interfaceC9541sj0);
    }
}
