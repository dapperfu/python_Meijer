package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.a;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbxq implements Runnable {
    final /* synthetic */ zzbxt zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbxt zzbxtVar = this.zza;
        zzbxtVar.zzI().execute(zzbxtVar.zzL());
        synchronized (zzbxtVar.zzG()) {
            zzbxtVar.zzW(a.e.API_PRIORITY_OTHER);
            zzbxtVar.zzr();
        }
    }

    zzbxq(zzbxt zzbxtVar) {
        Objects.requireNonNull(zzbxtVar);
        this.zza = zzbxtVar;
    }
}
