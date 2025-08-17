package com.google.android.libraries.places.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
final class zzbxz extends zzbkn {
    private final zzcbj zza;

    zzbxz(zzcbj zzcbjVar) {
        this.zza = zzcbjVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final int zzf() {
        return (int) this.zza.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzk(OutputStream outputStream, int i10) throws IOException {
        this.zza.zzh(outputStream, i10);
    }

    @Override // com.google.android.libraries.places.internal.zzbkn, com.google.android.libraries.places.internal.zzbtu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        zzcbj zzcbjVar = this.zza;
        zzcbjVar.zzt(zzcbjVar.zzb());
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final int zzg() {
        try {
            return this.zza.zzj() & 255;
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzh(int i10) {
        try {
            this.zza.zzt(i10);
        } catch (EOFException e10) {
            throw new IndexOutOfBoundsException(e10.getMessage());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzi(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int iZzs = this.zza.zzs(bArr, i10, i11);
            if (iZzs == -1) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 25);
                sb2.append("EOF trying to read ");
                sb2.append(i11);
                sb2.append(" bytes");
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            i11 -= iZzs;
            i10 += iZzs;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final void zzj(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.libraries.places.internal.zzbtu
    public final zzbtu zzl(int i10) {
        zzcbj zzcbjVar = new zzcbj();
        zzcbjVar.zzc(this.zza, i10);
        return new zzbxz(zzcbjVar);
    }
}
