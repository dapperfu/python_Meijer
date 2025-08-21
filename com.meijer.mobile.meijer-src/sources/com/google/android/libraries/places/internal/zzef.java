package com.google.android.libraries.places.internal;

import Vd.C5508b;
import Vd.C5517k;
import com.google.common.util.concurrent.j;
import com.google.common.util.concurrent.q;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
final class zzef implements j {
    final /* synthetic */ C5517k zza;
    final /* synthetic */ q zzb;
    final /* synthetic */ C5508b zzc;

    zzef(C5517k c5517k, q qVar, C5508b c5508b) {
        this.zza = c5517k;
        this.zzb = qVar;
        this.zzc = c5508b;
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
