package com.google.android.libraries.places.internal;

import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzapv {
    final /* synthetic */ zzapy zza;
    private final Object zzb;
    private final LinkedHashMap zzc;
    private int zzd;

    final /* synthetic */ Object zzc() {
        return this.zzb;
    }

    final /* synthetic */ LinkedHashMap zzd() {
        return this.zzc;
    }

    final /* synthetic */ int zze() {
        return this.zzd;
    }

    final /* synthetic */ void zzf(int i10) {
        this.zzd = i10;
    }

    final boolean zza() {
        return this.zzc.isEmpty() && this.zzd == this.zza.zzr().zzd();
    }

    final boolean zzb() {
        return this.zzc.isEmpty() && this.zzd == this.zza.zzr().zzf() + 1;
    }

    /* synthetic */ zzapv(zzapy zzapyVar, Object obj, byte[] bArr) {
        Objects.requireNonNull(zzapyVar);
        this.zza = zzapyVar;
        this.zzc = new LinkedHashMap();
        this.zzb = obj;
    }
}
