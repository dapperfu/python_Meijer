package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.j;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzms implements j {
    final /* synthetic */ zzaks zza;
    final /* synthetic */ zzmu zzb;

    zzms(zzmu zzmuVar, zzaks zzaksVar) {
        this.zza = zzaksVar;
        Objects.requireNonNull(zzmuVar);
        this.zzb = zzmuVar;
    }

    @Override // com.google.common.util.concurrent.j
    public final void onFailure(Throwable th2) {
        this.zzb.zzc(this.zza);
    }

    @Override // com.google.common.util.concurrent.j
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str = (String) obj;
        if (!str.isEmpty()) {
            zzaks zzaksVar = this.zza;
            zzbdv zzbdvVarZzc = zzbdw.zzc();
            zzbdvVarZzc.zza(str);
            zzaksVar.zzk(zzbdvVarZzc);
        }
        this.zzb.zzc(this.zza);
    }
}
