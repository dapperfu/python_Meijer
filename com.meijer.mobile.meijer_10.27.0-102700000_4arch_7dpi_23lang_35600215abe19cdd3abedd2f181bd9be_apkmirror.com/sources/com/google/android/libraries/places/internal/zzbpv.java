package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbpv implements Runnable {
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbqg zzb;

    zzbpv(zzbqg zzbqgVar, zzbjv zzbjvVar) {
        this.zza = zzbjvVar;
        Objects.requireNonNull(zzbqgVar);
        this.zzb = zzbqgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList(this.zzb.zzy());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzbsj) arrayList.get(i10)).zze(this.zza);
        }
    }
}
