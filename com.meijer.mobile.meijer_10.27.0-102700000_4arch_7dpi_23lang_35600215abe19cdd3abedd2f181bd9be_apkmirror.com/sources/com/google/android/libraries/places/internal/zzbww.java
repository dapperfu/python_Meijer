package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
abstract class zzbww implements Runnable {
    final /* synthetic */ zzbwx zzb;

    public abstract void zza() throws IOException;

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            if (this.zzb.zzi() == null) {
                throw new IOException("Unable to perform write due to unavailable sink.");
            }
            zza();
        } catch (Exception e10) {
            this.zzb.zzf().zzg(e10);
        }
    }

    /* synthetic */ zzbww(zzbwx zzbwxVar, byte[] bArr) {
        Objects.requireNonNull(zzbwxVar);
        this.zzb = zzbwxVar;
    }
}
