package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzhu implements zzom {
    final /* synthetic */ zznt zza;

    zzhu(zznt zzntVar) {
        this.zza = zzntVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzom
    public final void zza(int i10, long j10) {
        this.zza.zzd(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzom
    public final void zzb(int i10, long j10, String str) {
        this.zza.zze(i10, System.currentTimeMillis() - j10, str);
    }
}
