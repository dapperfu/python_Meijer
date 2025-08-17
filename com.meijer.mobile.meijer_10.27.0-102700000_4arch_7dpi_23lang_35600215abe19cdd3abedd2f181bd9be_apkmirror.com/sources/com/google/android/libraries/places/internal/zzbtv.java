package com.google.android.libraries.places.internal;

import Be.p;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes6.dex */
final class zzbtv extends InputStream implements zzbhl, InputStreamRetargetInterface {
    private final zzbtu zza;

    @Override // java.io.InputStream
    public final int read() {
        zzbtu zzbtuVar = this.zza;
        if (zzbtuVar.zzf() == 0) {
            return -1;
        }
        return zzbtuVar.zzg();
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.zza.zzf();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.zza.zzb();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.zza.zza();
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        this.zza.zzc();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) throws IOException {
        zzbtu zzbtuVar = this.zza;
        int iMin = (int) Math.min(zzbtuVar.zzf(), j10);
        zzbtuVar.zzh(iMin);
        return iMin;
    }

    public zzbtv(zzbtu zzbtuVar) {
        this.zza = (zzbtu) p.r(zzbtuVar, "buffer");
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        zzbtu zzbtuVar = this.zza;
        if (zzbtuVar.zzf() == 0) {
            return -1;
        }
        int iMin = Math.min(zzbtuVar.zzf(), i11);
        zzbtuVar.zzi(bArr, i10, iMin);
        return iMin;
    }
}
