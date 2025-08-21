package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzvq<T> extends zzzr<T> {
    private zzwj zza = null;

    zzvq() {
    }

    private final zzwj zzc() {
        zzwj zzwjVar = this.zza;
        if (zzwjVar != null) {
            return zzwjVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    public final void zzb(zzwj zzwjVar) {
        if (this.zza != null) {
            throw new AssertionError("Delegate is already set");
        }
        this.zza = zzwjVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final T read(zzacc zzaccVar) throws IOException {
        return (T) zzc().read(zzaccVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final void write(zzace zzaceVar, T t10) throws IOException {
        zzc().write(zzaceVar, t10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzzr
    public final zzwj zza() {
        return zzc();
    }
}
