package com.google.android.libraries.places.internal;

import De.p;

/* loaded from: classes6.dex */
final class zzbkb implements Runnable {
    final Runnable zza;
    boolean zzb;
    boolean zzc;

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zzc = true;
        this.zza.run();
    }

    zzbkb(Runnable runnable) {
        this.zza = (Runnable) p.r(runnable, "task");
    }
}
