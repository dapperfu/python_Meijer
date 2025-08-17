package com.google.android.libraries.places.internal;

import Td.C5224b;
import Td.C5233k;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.q;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
final class zzef implements j {
    final /* synthetic */ C5233k zza;
    final /* synthetic */ q zzb;
    final /* synthetic */ C5224b zzc;

    zzef(C5233k c5233k, q qVar, C5224b c5224b) {
        this.zza = c5233k;
        this.zzb = qVar;
        this.zzc = c5224b;
    }

    @Override // com.google.common.util.concurrent.j
    public final void onFailure(Throwable th2) {
        if (this.zzb.isCancelled()) {
            this.zzc.a();
        } else if (th2 instanceof Exception) {
            this.zza.b((Exception) th2);
        } else {
            this.zza.b(new ExecutionException(th2));
        }
    }

    @Override // com.google.common.util.concurrent.j
    public final void onSuccess(Object obj) {
        this.zza.c(obj);
    }
}
