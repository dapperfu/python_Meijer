package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
final class zztz extends zztq {
    private zzty zza;

    zztz(zzri zzriVar, boolean z10, Executor executor, Callable callable) {
        super(zzriVar, false, false);
        this.zza = new zztx(this, callable, executor);
        zzt();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zztg
    protected final void zzp() {
        zzty zztyVar = this.zza;
        if (zztyVar != null) {
            zztyVar.zzh();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zztq
    final void zzs() {
        zzty zztyVar = this.zza;
        if (zztyVar != null) {
            zztyVar.zzf();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zztq
    final void zzv(int i10) {
        super.zzv(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }
}
