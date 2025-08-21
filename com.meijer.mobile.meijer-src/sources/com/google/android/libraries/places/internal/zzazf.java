package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes6.dex */
final class zzazf extends zzazi {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzazf(byte[] bArr, int i10, int i11) {
        super(null);
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        int i12 = i10 + i11;
        int length = bArr.length;
        if ((i10 | i11 | (length - i12)) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        this.zza = bArr;
        this.zzc = i10;
        this.zzb = i12;
    }

    @Override // com.google.android.libraries.places.internal.zzazi, com.google.android.libraries.places.internal.zzays
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzv(bArr, 0, i11);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final int zzc() {
        return this.zzb - this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzx() {
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzK(int i10, int i11) throws IOException {
        zzr((i10 << 3) | i11);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzL(int i10, int i11) throws IOException {
        zzr(i10 << 3);
        zzq(i11);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzM(int i10, int i11) throws IOException {
        zzr(i10 << 3);
        zzr(i11);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzN(int i10, int i11) throws IOException {
        zzr((i10 << 3) | 5);
        zzs(i11);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzO(int i10, long j10) throws IOException {
        zzr(i10 << 3);
        zzt(j10);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzi(int i10, long j10) throws IOException {
        zzr((i10 << 3) | 1);
        zzu(j10);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzj(int i10, boolean z10) throws IOException {
        zzr(i10 << 3);
        zzp(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzk(int i10, String str) throws IOException {
        zzr((i10 << 3) | 2);
        zzw(str);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzl(int i10, zzayz zzayzVar) throws IOException {
        zzr((i10 << 3) | 2);
        zzr(zzayzVar.zzc());
        zzayzVar.zzf(this);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    final void zzm(int i10, zzbbl zzbblVar, zzbbz zzbbzVar) throws IOException {
        zzr((i10 << 3) | 2);
        zzr(((zzaym) zzbblVar).zzbb(zzbbzVar));
        zzbbzVar.zzf(zzbblVar, this.zze);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzn(int i10, zzbbl zzbblVar) throws IOException {
        zzr(11);
        zzM(2, i10);
        zzr(26);
        zzr(zzbblVar.zzbl());
        zzbblVar.zzbz(this);
        zzr(12);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzo(int i10, zzayz zzayzVar) throws IOException {
        zzr(11);
        zzM(2, i10);
        zzl(3, zzayzVar);
        zzr(12);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzp(byte b10) throws IOException {
        int i10 = this.zzc;
        try {
            int i11 = i10 + 1;
            try {
                this.zza[i10] = b10;
                this.zzc = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new zzazg(i10, this.zzb, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzq(int i10) throws IOException {
        if (i10 >= 0) {
            zzr(i10);
        } else {
            zzt(i10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzr(int i10) throws IOException {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.zzc;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.zza[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new zzazg(i12, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new zzazg(i12, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.zza[i12] = (byte) i10;
        this.zzc = i11;
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzs(int i10) throws IOException {
        int i11 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.zzc = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzazg(i11, this.zzb, 4, e10);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzu(long j10) throws IOException {
        int i10 = this.zzc;
        try {
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
        } catch (IndexOutOfBoundsException e10) {
            throw new zzazg(i10, this.zzb, 8, e10);
        }
    }

    public final void zzv(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.zza, this.zzc, i11);
            this.zzc += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzazg(this.zzc, this.zzb, i11, e10);
        }
    }

    public final void zzw(String str) throws IOException {
        int i10 = this.zzc;
        try {
            int iZzz = zzazi.zzz(str.length() * 3);
            int iZzz2 = zzazi.zzz(str.length());
            if (iZzz2 != iZzz) {
                zzr(zzbcw.zza(str));
                byte[] bArr = this.zza;
                int i11 = this.zzc;
                this.zzc = zzbcw.zzb(str, bArr, i11, this.zzb - i11);
                return;
            }
            int i12 = i10 + iZzz2;
            this.zzc = i12;
            int iZzb = zzbcw.zzb(str, this.zza, i12, this.zzb - i12);
            this.zzc = i10;
            zzr((iZzb - i10) - iZzz2);
            this.zzc = iZzb;
        } catch (zzbcv e10) {
            this.zzc = i10;
            zzF(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzazg(e11);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzt(long j10) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z10 = zzazi.zzb;
        int i11 = this.zzc;
        if (z10 && this.zzb - i11 >= 10) {
            while ((j10 & (-128)) != 0) {
                zzbct.zzp(this.zza, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            zzbct.zzp(this.zza, i11, (byte) j10);
        } else {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.zza[i11] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new zzazg(i11, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.zza[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new zzazg(i11, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        this.zzc = i10;
    }
}
