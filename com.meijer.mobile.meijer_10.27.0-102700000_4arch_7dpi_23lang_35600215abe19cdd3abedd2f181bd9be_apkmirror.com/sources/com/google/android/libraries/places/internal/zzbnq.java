package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbnq implements Runnable {
    final /* synthetic */ InputStream zza;
    final /* synthetic */ zzbnz zzb;

    zzbnq(zzbnz zzbnzVar, InputStream inputStream) {
        this.zza = inputStream;
        Objects.requireNonNull(zzbnzVar);
        this.zzb = zzbnzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzt(this.zza);
    }
}
