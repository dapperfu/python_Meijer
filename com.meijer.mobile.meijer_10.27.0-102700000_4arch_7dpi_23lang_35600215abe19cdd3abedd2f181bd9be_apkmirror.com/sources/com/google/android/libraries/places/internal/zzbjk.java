package com.google.android.libraries.places.internal;

import Be.j;

/* loaded from: classes6.dex */
abstract class zzbjk extends zzbfi {
    zzbjk() {
    }

    protected abstract zzbfi zzf();

    public final String toString() {
        return j.c(this).d("delegate", zzf()).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public void zzc(int i10) {
        zzf().zzc(i10);
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public void zzd() {
        zzf().zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbfi
    public void zze(String str, Throwable th2) {
        zzf().zze(str, th2);
    }
}
