package com.google.android.libraries.places.internal;

import Be.p;

/* loaded from: classes6.dex */
final class zzaqc {
    private final zzbjv zza;
    private final int zzb;

    private zzaqc(int i10, zzbjv zzbjvVar) {
        this.zzb = i10;
        this.zza = zzbjvVar;
    }

    static zzaqc zzb(int i10) {
        p.w(true);
        return new zzaqc(i10, null);
    }

    static zzaqc zzc(int i10, zzbjv zzbjvVar) {
        if (i10 != 4) {
            i10 = 5;
        }
        p.w(true);
        return new zzaqc(i10, (zzbjv) p.q(zzbjvVar));
    }

    final /* synthetic */ zzbjv zza() {
        return this.zza;
    }

    final /* synthetic */ int zzd() {
        return this.zzb;
    }
}
