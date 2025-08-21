package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbqs implements Runnable {
    final /* synthetic */ zzbrx zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbrx zzbrxVar = this.zza;
        if (zzbrxVar.zzN()) {
            return;
        }
        zzbrxVar.zzO(true);
        zzbrxVar.zzi();
    }

    zzbqs(zzbrx zzbrxVar) {
        Objects.requireNonNull(zzbrxVar);
        this.zza = zzbrxVar;
    }
}
