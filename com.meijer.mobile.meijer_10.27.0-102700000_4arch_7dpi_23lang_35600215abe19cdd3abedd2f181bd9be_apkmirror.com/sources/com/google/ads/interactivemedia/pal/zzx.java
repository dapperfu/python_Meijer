package com.google.ads.interactivemedia.pal;

import com.google.android.gms.internal.pal.I6;
import com.google.android.gms.internal.pal.J6;
import java.util.Random;

/* loaded from: classes4.dex */
public final class zzx {
    static final boolean zza;
    private final zzs zzb;
    private final boolean zzc;

    zzx(zzs zzsVar, boolean z10) {
        this.zzb = zzsVar;
        this.zzc = z10;
    }

    static {
        zza = new Random().nextInt(100) <= 0;
    }

    public final void zza(int i10) {
        if (this.zzc) {
            this.zzb.zza("pal_native", zzt.ERROR_EVENT.zza(), J6.d(zzu.ERROR_CODE.zza(), String.valueOf(i10)));
        }
    }

    final void zzb(zzw zzwVar) {
        if (this.zzc) {
            I6 i62 = new I6();
            i62.a(zzu.NONCE_LOADER_INIT_TIME.zza(), String.valueOf(zzwVar.zzc().zzd()));
            i62.a(zzu.NONCE_REQUESTED_TIME.zza(), String.valueOf(zzwVar.zzd().zzd()));
            i62.a(zzu.NONCE_LOADED_TIME.zza(), String.valueOf(zzwVar.zzb().zzd()));
            i62.a(zzu.SERVICE_START_TIME.zza(), String.valueOf(zzwVar.zzf().zzd()));
            i62.a(zzu.SERVICE_END_TIME.zza(), String.valueOf(zzwVar.zze().zzd()));
            i62.a(zzu.NONCE_LENGTH.zza(), String.valueOf(zzwVar.zza()));
            this.zzb.zza("pal_native", zzt.NONCE_LOADED.zza(), i62.c());
        }
    }
}
