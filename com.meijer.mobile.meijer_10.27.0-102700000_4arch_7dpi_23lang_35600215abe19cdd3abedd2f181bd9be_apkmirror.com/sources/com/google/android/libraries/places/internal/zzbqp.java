package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbqp implements Runnable {
    final /* synthetic */ zzbrx zza;

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzl(true);
    }

    zzbqp(zzbrx zzbrxVar) {
        Objects.requireNonNull(zzbrxVar);
        this.zza = zzbrxVar;
    }
}
