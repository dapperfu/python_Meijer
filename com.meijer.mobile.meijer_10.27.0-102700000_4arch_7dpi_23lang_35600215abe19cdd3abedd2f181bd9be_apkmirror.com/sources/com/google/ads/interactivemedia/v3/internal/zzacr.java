package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzacr extends zzacv {
    private final int zzc;
    private final int zzd;

    @Override // com.google.ads.interactivemedia.v3.internal.zzacv
    protected final int zzc() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacv, com.google.ads.interactivemedia.v3.internal.zzacw
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacv, com.google.ads.interactivemedia.v3.internal.zzacw
    public final byte zza(int i10) {
        zzacw.zzr(i10, this.zzd);
        return ((zzacv) this).zza[this.zzc + i10];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacv, com.google.ads.interactivemedia.v3.internal.zzacw
    final byte zzb(int i10) {
        return ((zzacv) this).zza[this.zzc + i10];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacv, com.google.ads.interactivemedia.v3.internal.zzacw
    protected final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(((zzacv) this).zza, this.zzc + i10, bArr, i11, i12);
    }

    zzacr(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzacw.zzm(i10, i10 + i11, bArr.length);
        this.zzc = i10;
        this.zzd = i11;
    }
}
