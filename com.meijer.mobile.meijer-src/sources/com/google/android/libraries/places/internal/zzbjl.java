package com.google.android.libraries.places.internal;

import De.j;

/* loaded from: classes6.dex */
abstract class zzbjl extends zzbfh {
    zzbjl() {
    }

    protected abstract zzbfh zze();

    public final String toString() {
        return j.c(this).d("delegate", zze()).toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbfh
    public final void zzd() {
        zze().zzd();
    }
}
