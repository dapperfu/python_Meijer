package com.google.android.libraries.places.internal;

import Be.p;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes6.dex */
final class zzbzu extends InputStream implements zzbgk, zzbhl, InputStreamRetargetInterface {
    private zzbbl zza;
    private final zzbbt zzb;
    private ByteArrayInputStream zzc;

    @Override // java.io.InputStream
    public final int read() {
        zzbbl zzbblVar = this.zza;
        if (zzbblVar != null) {
            this.zzc = new ByteArrayInputStream(zzbblVar.zzaZ());
            this.zza = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream, j$.io.InputStreamRetargetInterface
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    final zzbbt zzc() {
        return this.zzb;
    }

    @Override // java.io.InputStream
    public final int available() {
        zzbbl zzbblVar = this.zza;
        if (zzbblVar != null) {
            return zzbblVar.zzbl();
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbgk
    public final int zza(OutputStream outputStream) throws IOException {
        zzbbl zzbblVar = this.zza;
        if (zzbblVar != null) {
            int iZzbl = zzbblVar.zzbl();
            this.zza.zzba(outputStream);
            this.zza = null;
            return iZzbl;
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int i10 = zzbzw.zzb;
        p.r(byteArrayInputStream, "inputStream cannot be null!");
        p.r(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j10 = 0;
        while (true) {
            int i11 = byteArrayInputStream.read(bArr);
            if (i11 == -1) {
                int i12 = (int) j10;
                this.zzc = null;
                return i12;
            }
            outputStream.write(bArr, 0, i11);
            j10 += i11;
        }
    }

    final zzbbl zzb() {
        zzbbl zzbblVar = this.zza;
        if (zzbblVar != null) {
            return zzbblVar;
        }
        throw new IllegalStateException("message not available");
    }

    zzbzu(zzbbl zzbblVar, zzbbt zzbbtVar) {
        this.zza = zzbblVar;
        this.zzb = zzbbtVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        zzbbl zzbblVar = this.zza;
        if (zzbblVar != null) {
            int iZzbl = zzbblVar.zzbl();
            if (iZzbl == 0) {
                this.zza = null;
                this.zzc = null;
                return -1;
            }
            if (i11 >= iZzbl) {
                zzazi zzaziVarZzy = zzazi.zzy(bArr, i10, iZzbl);
                this.zza.zzbz(zzaziVarZzy);
                zzaziVarZzy.zzE();
                this.zza = null;
                this.zzc = null;
                return iZzbl;
            }
            this.zzc = new ByteArrayInputStream(this.zza.zzaZ());
            this.zza = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.zzc;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i10, i11);
        }
        return -1;
    }
}
