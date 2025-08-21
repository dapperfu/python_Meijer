package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbqy extends zzbmj {
    final /* synthetic */ zzbfh zza;
    final /* synthetic */ zzbjv zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbqy(zzbqz zzbqzVar, zzbfh zzbfhVar, zzbjv zzbjvVar) {
        super(zzbqzVar.zzg());
        this.zza = zzbfhVar;
        this.zzb = zzbjvVar;
        Objects.requireNonNull(zzbqzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbmj
    public final void zza() {
        this.zza.zzc(this.zzb, new zzbip());
    }
}
