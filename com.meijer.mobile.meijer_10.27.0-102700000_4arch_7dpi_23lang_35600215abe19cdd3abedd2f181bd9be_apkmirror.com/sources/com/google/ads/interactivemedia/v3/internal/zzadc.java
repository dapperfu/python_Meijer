package com.google.ads.interactivemedia.v3.internal;

import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;

/* loaded from: classes4.dex */
final class zzadc extends zzadf {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzadc(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i11;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final int zza() {
        return this.zzc - this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzl(byte[] bArr, int i10, int i11) throws IOException {
        zzc(bArr, 0, i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzb(byte b10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzadd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
        }
    }

    public final void zzc(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, i10, this.zzb, this.zzd, i11);
            this.zzd += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzadd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzd(int i10, boolean z10) throws IOException {
        zzt(i10 << 3);
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zze(int i10, zzacw zzacwVar) throws IOException {
        zzt((i10 << 3) | 2);
        zzt(zzacwVar.zzd());
        zzacwVar.zzl(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzf(int i10, int i11) throws IOException {
        zzt((i10 << 3) | 5);
        zzg(i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzg(int i10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            int i12 = i11 + 1;
            this.zzd = i12;
            bArr[i11] = (byte) (i10 & l3.f92484c);
            int i13 = i11 + 2;
            this.zzd = i13;
            bArr[i12] = (byte) ((i10 >> 8) & l3.f92484c);
            int i14 = i11 + 3;
            this.zzd = i14;
            bArr[i13] = (byte) ((i10 >> 16) & l3.f92484c);
            this.zzd = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & l3.f92484c);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzadd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzh(int i10, long j10) throws IOException {
        zzt((i10 << 3) | 1);
        zzi(j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzi(long j10) throws IOException {
        try {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            int i11 = i10 + 1;
            this.zzd = i11;
            bArr[i10] = (byte) (((int) j10) & l3.f92484c);
            int i12 = i10 + 2;
            this.zzd = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & l3.f92484c);
            int i13 = i10 + 3;
            this.zzd = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & l3.f92484c);
            int i14 = i10 + 4;
            this.zzd = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & l3.f92484c);
            int i15 = i10 + 5;
            this.zzd = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & l3.f92484c);
            int i16 = i10 + 6;
            this.zzd = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & l3.f92484c);
            int i17 = i10 + 7;
            this.zzd = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & l3.f92484c);
            this.zzd = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & l3.f92484c);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzadd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzj(int i10, int i11) throws IOException {
        zzt(i10 << 3);
        zzk(i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzk(int i10) throws IOException {
        if (i10 >= 0) {
            zzt(i10);
        } else {
            zzv(i10);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    final void zzm(int i10, zzafb zzafbVar, zzaft zzaftVar) throws IOException {
        zzt((i10 << 3) | 2);
        zzt(((zzach) zzafbVar).zzat(zzaftVar));
        zzaftVar.zzj(zzafbVar, this.zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzn(int i10, zzafb zzafbVar) throws IOException {
        zzt(11);
        zzs(2, i10);
        zzt(26);
        zzt(zzafbVar.zzax());
        zzafbVar.zzaR(this);
        zzt(12);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzo(int i10, zzacw zzacwVar) throws IOException {
        zzt(11);
        zzs(2, i10);
        zze(3, zzacwVar);
        zzt(12);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzp(int i10, String str) throws IOException {
        zzt((i10 << 3) | 2);
        zzq(str);
    }

    public final void zzq(String str) throws IOException {
        int i10 = this.zzd;
        try {
            int iZzz = zzadf.zzz(str.length() * 3);
            int iZzz2 = zzadf.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzt(zzagr.zzc(str));
                byte[] bArr = this.zzb;
                int i11 = this.zzd;
                this.zzd = zzagr.zzb(str, bArr, i11, this.zzc - i11);
                return;
            }
            int i12 = i10 + iZzz2;
            this.zzd = i12;
            int iZzb = zzagr.zzb(str, this.zzb, i12, this.zzc - i12);
            this.zzd = i10;
            zzt((iZzb - i10) - iZzz2);
            this.zzd = iZzb;
        } catch (zzagq e10) {
            this.zzd = i10;
            zzC(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzadd(e11);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzr(int i10, int i11) throws IOException {
        zzt((i10 << 3) | i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzs(int i10, int i11) throws IOException {
        zzt(i10 << 3);
        zzt(i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzt(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & l3.f92484c);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzadd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
            }
        }
        byte[] bArr2 = this.zzb;
        int i12 = this.zzd;
        this.zzd = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzu(int i10, long j10) throws IOException {
        zzt(i10 << 3);
        zzv(j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzadf
    public final void zzv(long j10) throws IOException {
        if (!zzadf.zzc || this.zzc - this.zzd < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i10 = this.zzd;
                    this.zzd = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & l3.f92484c);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzadd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zzd), Integer.valueOf(this.zzc), 1), e10);
                }
            }
            byte[] bArr2 = this.zzb;
            int i11 = this.zzd;
            this.zzd = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.zzb;
                int i13 = this.zzd;
                this.zzd = i13 + 1;
                zzago.zzn(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.zzb;
            int i14 = this.zzd;
            this.zzd = i14 + 1;
            zzago.zzn(bArr4, i14, (byte) ((i12 | 128) & l3.f92484c));
            j10 >>>= 7;
        }
    }
}
