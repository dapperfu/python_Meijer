package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8135gj0 extends AbstractRunnableC8348ij0 {
    @Override // com.google.android.gms.internal.ads.AbstractRunnableC8348ij0
    final /* bridge */ /* synthetic */ Object E(Object obj, Object obj2) throws Exception {
        InterfaceC9416sj0 interfaceC9416sj0 = (InterfaceC9416sj0) obj;
        com.google.common.util.concurrent.q qVarZza = interfaceC9416sj0.zza(obj2);
        C6657Df0.d(qVarZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC9416sj0);
        return qVarZza;
    }

    @Override // com.google.android.gms.internal.ads.AbstractRunnableC8348ij0
    final /* synthetic */ void F(Object obj) {
        v((com.google.common.util.concurrent.q) obj);
    }

    C8135gj0(com.google.common.util.concurrent.q qVar, InterfaceC9416sj0 interfaceC9416sj0) {
        super(qVar, interfaceC9416sj0);
    }
}
