package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes6.dex */
final class zzazh extends zzaze {
    private final OutputStream zzg;

    @Override // com.google.android.libraries.places.internal.zzazi, com.google.android.libraries.places.internal.zzays
    public final void zza(byte[] bArr, int i10, int i11) throws IOException {
        zzw(bArr, 0, i11);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzr(int i10) throws IOException {
        zzI(5);
        zze(i10);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzs(int i10) throws IOException {
        zzI(4);
        zzg(i10);
    }

    private final void zzI(int i10) throws IOException {
        if (this.zzb - this.zzc < i10) {
            zzJ();
        }
    }

    private final void zzJ() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzK(int i10, int i11) throws IOException {
        zzr((i10 << 3) | i11);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzL(int i10, int i11) throws IOException {
        zzI(20);
        zze(i10 << 3);
        if (i11 >= 0) {
            zze(i11);
        } else {
            zzf(i11);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzM(int i10, int i11) throws IOException {
        zzI(20);
        zze(i10 << 3);
        zze(i11);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzN(int i10, int i11) throws IOException {
        zzI(14);
        zze((i10 << 3) | 5);
        zzg(i11);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzO(int i10, long j10) throws IOException {
        zzI(20);
        zze(i10 << 3);
        zzf(j10);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzi(int i10, long j10) throws IOException {
        zzI(18);
        zze((i10 << 3) | 1);
        zzh(j10);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzj(int i10, boolean z10) throws IOException {
        zzI(11);
        zze(i10 << 3);
        zzd(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzk(int i10, String str) throws IOException {
        zzr((i10 << 3) | 2);
        zzv(str);
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
        if (this.zzc == this.zzb) {
            zzJ();
        }
        zzd(b10);
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
    public final void zzt(long j10) throws IOException {
        zzI(10);
        zzf(j10);
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzu(long j10) throws IOException {
        zzI(8);
        zzh(j10);
    }

    public final void zzw(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.zzb;
        int i13 = this.zzc;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, 0, this.zza, i13, i11);
            this.zzc += i11;
            this.zzd += i11;
            return;
        }
        byte[] bArr2 = this.zza;
        System.arraycopy(bArr, 0, bArr2, i13, i14);
        this.zzc = i12;
        this.zzd += i14;
        zzJ();
        int i15 = i11 - i14;
        if (i15 <= i12) {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.zzc = i15;
        } else {
            this.zzg.write(bArr, i14, i15);
        }
        this.zzd += i15;
    }

    @Override // com.google.android.libraries.places.internal.zzazi
    public final void zzx() throws IOException {
        if (this.zzc > 0) {
            zzJ();
        }
    }

    zzazh(OutputStream outputStream, int i10) {
        super(i10);
        if (outputStream != null) {
            this.zzg = outputStream;
            return;
        }
        throw new NullPointerException("out");
    }

    public final void zzv(String str) throws IOException {
        int iZza;
        try {
            int length = str.length() * 3;
            int iZzz = zzazi.zzz(length);
            int i10 = iZzz + length;
            int i11 = this.zzb;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iZzb = zzbcw.zzb(str, bArr, 0, length);
                zzr(iZzb);
                zzw(bArr, 0, iZzb);
                return;
            }
            if (i10 > i11 - this.zzc) {
                zzJ();
            }
            int iZzz2 = zzazi.zzz(str.length());
            int i12 = this.zzc;
            try {
                if (iZzz2 == iZzz) {
                    int i13 = i12 + iZzz2;
                    this.zzc = i13;
                    int iZzb2 = zzbcw.zzb(str, this.zza, i13, i11 - i13);
                    this.zzc = i12;
                    iZza = (iZzb2 - i12) - iZzz2;
                    zze(iZza);
                    this.zzc = iZzb2;
                } else {
                    iZza = zzbcw.zza(str);
                    zze(iZza);
                    this.zzc = zzbcw.zzb(str, this.zza, this.zzc, iZza);
                }
                this.zzd += iZza;
            } catch (zzbcv e10) {
                this.zzd -= this.zzc - i12;
                this.zzc = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzazg(e11);
            }
        } catch (zzbcv e12) {
            zzF(str, e12);
        }
    }
}
