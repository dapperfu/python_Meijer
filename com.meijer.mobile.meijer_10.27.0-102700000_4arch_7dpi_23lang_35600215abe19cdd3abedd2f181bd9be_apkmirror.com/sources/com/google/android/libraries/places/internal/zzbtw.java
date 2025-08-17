package com.google.android.libraries.places.internal;

import Be.p;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* loaded from: classes6.dex */
final class zzbtw extends zzbkn {
    int zza;
    final int zzb;
    final byte[] zzc;
    int zzd = -1;

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu
    public final void zzb() {
        this.zzd = this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final int zzf() {
        return this.zzb - this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final int zzg() {
        zzd(1);
        int i10 = this.zza;
        this.zza = i10 + 1;
        return this.zzc[i10] & 255;
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu
    public final void zzc() {
        int i10 = this.zzd;
        if (i10 == -1) {
            throw new InvalidMarkException();
        }
        this.zza = i10;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzi(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.zzc, this.zza, bArr, i10, i11);
        this.zza += i11;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzj(ByteBuffer byteBuffer) {
        p.r(byteBuffer, "dest");
        int iRemaining = byteBuffer.remaining();
        zzd(iRemaining);
        byteBuffer.put(this.zzc, this.zza, iRemaining);
        this.zza += iRemaining;
    }

    zzbtw(byte[] bArr, int i10, int i11) {
        boolean z10;
        boolean z11;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p.e(z10, "offset must be >= 0");
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        p.e(z11, "length must be >= 0");
        int i12 = i11 + i10;
        p.e(i12 <= bArr.length, "offset + length exceeds array boundary");
        this.zzc = (byte[]) p.r(bArr, "bytes");
        this.zza = i10;
        this.zzb = i12;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzh(int i10) {
        zzd(i10);
        this.zza += i10;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzk(OutputStream outputStream, int i10) throws IOException {
        zzd(i10);
        outputStream.write(this.zzc, this.zza, i10);
        this.zza += i10;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final /* bridge */ /* synthetic */ zzbtu zzl(int i10) {
        zzd(i10);
        int i11 = this.zza;
        this.zza = i11 + i10;
        return new zzbtw(this.zzc, i11, i10);
    }
}
