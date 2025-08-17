package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
class zzacv extends zzacu {
    protected final byte[] zza;

    zzacv(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzacw) || zzd() != ((zzacw) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzacv)) {
            return obj.equals(this);
        }
        zzacv zzacvVar = (zzacv) obj;
        int iZzn = zzn();
        int iZzn2 = zzacvVar.zzn();
        if (iZzn == 0 || iZzn2 == 0 || iZzn == iZzn2) {
            return zzg(zzacvVar, 0, zzd());
        }
        return false;
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    protected void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zza, i10, bArr, i11, i12);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    public final zzada zzk() {
        return zzada.zzE(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacu
    final boolean zzg(zzacw zzacwVar, int i10, int i11) {
        if (i11 <= zzacwVar.zzd()) {
            int i12 = i10 + i11;
            if (i12 <= zzacwVar.zzd()) {
                if (zzacwVar instanceof zzacv) {
                    zzacv zzacvVar = (zzacv) zzacwVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzacvVar.zza;
                    int iZzc = zzc() + i11;
                    int iZzc2 = zzc();
                    int iZzc3 = zzacvVar.zzc() + i10;
                    while (iZzc2 < iZzc) {
                        if (bArr[iZzc2] != bArr2[iZzc3]) {
                            return false;
                        }
                        iZzc2++;
                        iZzc3++;
                    }
                    return true;
                }
                return zzacwVar.zzj(i10, i12).equals(zzj(0, i11));
            }
            throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + zzacwVar.zzd());
        }
        throw new IllegalArgumentException("Length too large: " + i11 + zzd());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    protected final int zzi(int i10, int i11, int i12) {
        return zzaee.zzb(i10, this.zza, zzc() + i11, i12);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    public final zzacw zzj(int i10, int i11) {
        int iZzm = zzacw.zzm(i10, i11, zzd());
        if (iZzm == 0) {
            return zzacw.zzb;
        }
        return new zzacr(this.zza, zzc() + i10, iZzm);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacw
    final void zzl(zzaco zzacoVar) throws IOException {
        ((zzadc) zzacoVar).zzc(this.zza, zzc(), zzd());
    }
}
