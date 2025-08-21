package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
final class zztx extends zzty {
    final /* synthetic */ zztz zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zztx(zztz zztzVar, Callable callable, Executor executor) {
        super(zztzVar, executor);
        this.zza = zztzVar;
        this.zzc = callable;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzus
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzus
    final String zzb() {
        return this.zzc.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzty
    final void zzc(Object obj) {
        this.zza.zzc(obj);
    }
}
