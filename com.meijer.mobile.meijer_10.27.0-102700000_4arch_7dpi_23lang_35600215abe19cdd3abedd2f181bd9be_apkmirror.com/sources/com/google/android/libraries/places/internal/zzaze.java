package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
abstract class zzaze extends zzazi {
    final byte[] zza;
    final int zzb;
    int zzc;
    int zzd;

    zzaze(int i10) {
        super(null);
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i10, 20)];
        this.zza = bArr;
        this.zzb = bArr.length;
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final int zzc() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void zzd(byte b10) {
        byte[] bArr = this.zza;
        int i10 = this.zzc;
        bArr[i10] = b10;
        this.zzc = i10 + 1;
        this.zzd++;
    }

    final void zzg(int i10) {
        int i11 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i11] = (byte) i10;
        bArr[i11 + 1] = (byte) (i10 >> 8);
        bArr[i11 + 2] = (byte) (i10 >> 16);
        bArr[i11 + 3] = (byte) (i10 >> 24);
        this.zzc = i11 + 4;
        this.zzd += 4;
    }

    final void zzh(long j10) {
        int i10 = this.zzc;
        byte[] bArr = this.zza;
        bArr[i10] = (byte) j10;
        bArr[i10 + 1] = (byte) (j10 >> 8);
        bArr[i10 + 2] = (byte) (j10 >> 16);
        bArr[i10 + 3] = (byte) (j10 >> 24);
        bArr[i10 + 4] = (byte) (j10 >> 32);
        bArr[i10 + 5] = (byte) (j10 >> 40);
        bArr[i10 + 6] = (byte) (j10 >> 48);
        bArr[i10 + 7] = (byte) (j10 >> 56);
        this.zzc = i10 + 8;
        this.zzd += 8;
    }

    final void zze(int i10) {
        if (zzazi.zzb) {
            long j10 = this.zzc;
            while ((i10 & (-128)) != 0) {
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                zzbct.zzp(bArr, i11, (byte) (i10 | 128));
                i10 >>>= 7;
            }
            byte[] bArr2 = this.zza;
            int i12 = this.zzc;
            this.zzc = i12 + 1;
            zzbct.zzp(bArr2, i12, (byte) i10);
            this.zzd += (int) (this.zzc - j10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            byte[] bArr3 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            bArr3[i13] = (byte) (i10 | 128);
            this.zzd++;
            i10 >>>= 7;
        }
        byte[] bArr4 = this.zza;
        int i14 = this.zzc;
        this.zzc = i14 + 1;
        bArr4[i14] = (byte) i10;
        this.zzd++;
    }

    final void zzf(long j10) {
        if (zzazi.zzb) {
            long j11 = this.zzc;
            while (true) {
                int i10 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    byte[] bArr = this.zza;
                    int i11 = this.zzc;
                    this.zzc = i11 + 1;
                    zzbct.zzp(bArr, i11, (byte) i10);
                    this.zzd += (int) (this.zzc - j11);
                    return;
                }
                byte[] bArr2 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                zzbct.zzp(bArr2, i12, (byte) (i10 | 128));
                j10 >>>= 7;
            }
        } else {
            while (true) {
                int i13 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    byte[] bArr3 = this.zza;
                    int i14 = this.zzc;
                    this.zzc = i14 + 1;
                    bArr3[i14] = (byte) i13;
                    this.zzd++;
                    return;
                }
                byte[] bArr4 = this.zza;
                int i15 = this.zzc;
                this.zzc = i15 + 1;
                bArr4[i15] = (byte) (i13 | 128);
                this.zzd++;
                j10 >>>= 7;
            }
        }
    }
}
