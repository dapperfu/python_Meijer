package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzbyb implements zzbwq {
    private final zzcbj zza;
    private int zzb;
    private int zzc;

    zzbyb(zzcbj zzcbjVar, int i10) {
        this.zza = zzcbjVar;
        this.zzb = i10;
    }

    @Override // com.google.android.libraries.places.internal.zzbwq
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbwq
    public final int zzd() {
        return this.zzc;
    }

    final zzcbj zze() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbwq
    public final void zza(byte[] bArr, int i10, int i11) {
        this.zza.zzz(bArr, i10, i11);
        this.zzb -= i11;
        this.zzc += i11;
    }

    @Override // com.google.android.libraries.places.internal.zzbwq
    public final void zzb(byte b10) {
        this.zza.zzA(b10);
        this.zzb--;
        this.zzc++;
    }
}
