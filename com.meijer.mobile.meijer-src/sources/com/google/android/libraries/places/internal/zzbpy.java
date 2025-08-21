package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzbpy extends zzbot {
    private final zzbmg zza;
    private final zzblh zzb;

    /* synthetic */ zzbpy(zzbmg zzbmgVar, zzblh zzblhVar, byte[] bArr) {
        this.zza = zzbmgVar;
        this.zzb = zzblhVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbot
    protected final zzbmg zza() {
        return this.zza;
    }

    final /* synthetic */ zzblh zzg() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbot, com.google.android.libraries.places.internal.zzblu
    public final zzblr zzb(zzbiu zzbiuVar, zzbip zzbipVar, zzbfd zzbfdVar, zzbfp[] zzbfpVarArr) {
        return new zzbpx(this, this.zza.zzb(zzbiuVar, zzbipVar, zzbfdVar, zzbfpVarArr));
    }
}
