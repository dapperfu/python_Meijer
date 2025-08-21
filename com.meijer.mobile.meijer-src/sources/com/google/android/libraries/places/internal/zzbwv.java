package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbwv extends zzbxa {
    final /* synthetic */ zzbwx zza;

    @Override // com.google.android.libraries.places.internal.zzbxa, com.google.android.libraries.places.internal.zzbzc
    public final void zza(zzbzo zzbzoVar) throws IOException {
        zzbwx zzbwxVar = this.zza;
        zzbwxVar.zzl(zzbwxVar.zzk() + 1);
        super.zza(zzbzoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbxa, com.google.android.libraries.places.internal.zzbzc
    public final void zzb(int i10, zzbyz zzbyzVar) throws IOException {
        zzbwx zzbwxVar = this.zza;
        zzbwxVar.zzl(zzbwxVar.zzk() + 1);
        super.zzb(i10, zzbyzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbxa, com.google.android.libraries.places.internal.zzbzc
    public final void zzc(boolean z10, int i10, int i11) throws IOException {
        if (z10) {
            zzbwx zzbwxVar = this.zza;
            zzbwxVar.zzl(zzbwxVar.zzk() + 1);
        }
        super.zzc(z10, i10, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbwv(zzbwx zzbwxVar, zzbzc zzbzcVar) {
        super(zzbzcVar);
        Objects.requireNonNull(zzbwxVar);
        this.zza = zzbwxVar;
    }
}
