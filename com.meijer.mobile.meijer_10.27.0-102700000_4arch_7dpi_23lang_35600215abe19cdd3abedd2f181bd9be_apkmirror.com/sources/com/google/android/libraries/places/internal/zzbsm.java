package com.google.android.libraries.places.internal;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes6.dex */
final class zzbsm extends FilterInputStream implements InputStreamRetargetInterface {
    private final int zza;
    private final zzbwg zzb;
    private long zzc;
    private long zzd;
    private long zze;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.zze = this.zzd;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.zzd++;
        }
        zzb();
        zza();
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.zze == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.zzd = this.zze;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    private final void zza() {
        long j10 = this.zzd;
        long j11 = this.zzc;
        if (j10 > j11) {
            this.zzb.zzl(j10 - j11);
            this.zzc = this.zzd;
        }
    }

    private final void zzb() {
        long j10 = this.zzd;
        int i10 = this.zza;
        if (j10 <= i10) {
            return;
        }
        zzbjv zzbjvVar = zzbjv.zzf;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 47);
        sb2.append("Decompressed gRPC message exceeds maximum size ");
        sb2.append(i10);
        throw new zzbjy(zzbjvVar.zze(sb2.toString()), null);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j10);
        this.zzd += jSkip;
        zzb();
        zza();
        return jSkip;
    }

    zzbsm(InputStream inputStream, int i10, zzbwg zzbwgVar) {
        super(inputStream);
        this.zze = -1L;
        this.zza = i10;
        this.zzb = zzbwgVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, i11);
        if (i12 != -1) {
            this.zzd += i12;
        }
        zzb();
        zza();
        return i12;
    }
}
