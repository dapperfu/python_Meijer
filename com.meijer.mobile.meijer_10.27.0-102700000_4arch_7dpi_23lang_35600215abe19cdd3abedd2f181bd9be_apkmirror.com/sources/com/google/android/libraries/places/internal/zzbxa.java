package com.google.android.libraries.places.internal;

import Be.p;
import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
class zzbxa implements zzbzc {
    private final zzbzc zza;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public void zza(zzbzo zzbzoVar) throws IOException {
        this.zza.zza(zzbzoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public void zzb(int i10, zzbyz zzbyzVar) throws IOException {
        this.zza.zzb(i10, zzbyzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public void zzc(boolean z10, int i10, int i11) throws IOException {
        this.zza.zzc(z10, i10, i11);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zze() throws IOException {
        this.zza.zze();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzf(boolean z10, boolean z11, int i10, int i11, List list) throws IOException {
        this.zza.zzf(false, false, i10, 0, list);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final int zzg() {
        return this.zza.zzg();
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzh(boolean z10, int i10, zzcbj zzcbjVar, int i11) throws IOException {
        this.zza.zzh(z10, i10, zzcbjVar, i11);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzi(zzbzo zzbzoVar) throws IOException {
        this.zza.zzi(zzbzoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzj(int i10, zzbyz zzbyzVar, byte[] bArr) throws IOException {
        this.zza.zzj(0, zzbyzVar, bArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbzc
    public final void zzk(int i10, long j10) throws IOException {
        this.zza.zzk(i10, j10);
    }

    public zzbxa(zzbzc zzbzcVar) {
        this.zza = (zzbzc) p.r(zzbzcVar, "delegate");
    }
}
