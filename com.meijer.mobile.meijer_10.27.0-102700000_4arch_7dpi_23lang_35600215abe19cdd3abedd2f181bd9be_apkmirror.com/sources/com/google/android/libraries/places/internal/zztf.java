package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes6.dex */
final class zztf extends zztj {
    private static final zztf zza = new zztf(zztj.zze());
    private final AtomicReference zzb;

    public static final zztf zza() {
        return zza;
    }

    @Override // com.google.android.libraries.places.internal.zztj
    public final boolean zzb(String str, Level level, boolean z10) {
        ((zztj) this.zzb.get()).zzb(str, level, z10);
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zztj
    public final zztu zzc() {
        return ((zztj) this.zzb.get()).zzc();
    }

    @Override // com.google.android.libraries.places.internal.zztj
    public final zzsj zzd() {
        return ((zztj) this.zzb.get()).zzd();
    }

    zztf(zztj zztjVar) {
        this.zzb = new AtomicReference(zztjVar);
    }
}
