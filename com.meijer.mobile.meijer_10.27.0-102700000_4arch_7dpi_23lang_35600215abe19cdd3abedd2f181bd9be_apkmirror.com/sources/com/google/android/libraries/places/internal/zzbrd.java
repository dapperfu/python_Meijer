package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbrd implements Runnable {
    final /* synthetic */ zzbrx zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbrx zzbrxVar = this.zza;
        if (zzbrxVar.zzE() == null) {
            return;
        }
        zzbrxVar.zzk();
    }

    /* synthetic */ zzbrd(zzbrx zzbrxVar, byte[] bArr) {
        Objects.requireNonNull(zzbrxVar);
        this.zza = zzbrxVar;
    }
}
