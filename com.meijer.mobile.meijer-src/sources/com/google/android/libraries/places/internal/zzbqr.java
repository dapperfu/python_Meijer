package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbqr implements Runnable {
    final /* synthetic */ zzbrx zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbrx zzbrxVar = this.zza;
        zzbrxVar.zzV().zza(2, "Entering SHUTDOWN state");
        zzbrxVar.zzA().zza(zzbfy.SHUTDOWN);
    }

    zzbqr(zzbrx zzbrxVar) {
        Objects.requireNonNull(zzbrxVar);
        this.zza = zzbrxVar;
    }
}
