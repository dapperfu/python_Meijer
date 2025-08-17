package com.google.android.libraries.places.internal;

import Be.j;
import com.google.common.util.concurrent.AbstractC11289a;

/* loaded from: classes6.dex */
final class zzcae extends AbstractC11289a {
    private final zzbfi zza;

    final /* synthetic */ zzbfi zza() {
        return this.zza;
    }

    @Override // com.google.common.util.concurrent.AbstractC11289a
    protected final void interruptTask() {
        this.zza.zze("GrpcFuture was cancelled", null);
    }

    zzcae(zzbfi zzbfiVar) {
        this.zza = zzbfiVar;
    }

    @Override // com.google.common.util.concurrent.AbstractC11289a
    protected final String pendingToString() {
        return j.c(this).d("clientCall", this.zza).toString();
    }

    @Override // com.google.common.util.concurrent.AbstractC11289a
    protected final boolean set(Object obj) {
        return super.set(obj);
    }

    @Override // com.google.common.util.concurrent.AbstractC11289a
    protected final boolean setException(Throwable th2) {
        return super.setException(th2);
    }
}
