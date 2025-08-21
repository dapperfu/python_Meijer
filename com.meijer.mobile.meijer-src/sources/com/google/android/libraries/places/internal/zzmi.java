package com.google.android.libraries.places.internal;

import android.content.Context;

/* loaded from: classes6.dex */
public final class zzmi implements zzbep {
    private final zzbes zza;

    private zzmi(zzbes zzbesVar) {
        this.zza = zzbesVar;
    }

    public static zzmi zzc(zzbes zzbesVar) {
        return new zzmi(zzbesVar);
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Context zzb() {
        return zzd((Context) this.zza.zzb());
    }

    public static Context zzd(Context context) {
        Context applicationContext = context.getApplicationContext();
        zzber.zza(applicationContext);
        return applicationContext;
    }
}
