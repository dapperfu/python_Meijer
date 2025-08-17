package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
final class zzvg extends zzus {
    final /* synthetic */ zzvh zza;
    private final Callable zzb;

    zzvg(zzvh zzvhVar, Callable callable) {
        this.zza = zzvhVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzus
    final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzus
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzus
    final void zzd(Throwable th2) {
        this.zza.zzd(th2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzus
    final void zze(Object obj) {
        this.zza.zzc(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzus
    final boolean zzg() {
        return this.zza.isDone();
    }
}
