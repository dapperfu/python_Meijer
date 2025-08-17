package com.google.android.libraries.places.internal;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzcbt implements zzcbl {

    @JvmField
    public final zzcbz zza;

    @JvmField
    public final zzcbj zzb;

    @JvmField
    public boolean zzc;

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final zzcbj zze() {
        return this.zzb;
    }

    public zzcbt(zzcbz source) {
        Intrinsics.j(source, "source");
        this.zza = source;
        this.zzb = new zzcbj();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzcbz
    public final void close() throws IOException {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        this.zza.close();
        zzcbj zzcbjVar = this.zzb;
        zzcbjVar.zzt(zzcbjVar.zzb());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.j(sink, "sink");
        zzcbj zzcbjVar = this.zzb;
        if (zzcbjVar.zzb() == 0 && this.zza.zza(zzcbjVar, 8192L) == -1) {
            return -1;
        }
        return zzcbjVar.read(sink);
    }

    public final String toString() {
        zzcbz zzcbzVar = this.zza;
        StringBuilder sb2 = new StringBuilder(zzcbzVar.toString().length() + 8);
        sb2.append("buffer(");
        sb2.append(zzcbzVar);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcbz
    public final long zza(zzcbj sink, long j10) {
        Intrinsics.j(sink, "sink");
        if (j10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 15);
            sb2.append("byteCount < 0: ");
            sb2.append(j10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        zzcbj zzcbjVar = this.zzb;
        if (zzcbjVar.zzb() == 0) {
            if (j10 == 0) {
                return 0L;
            }
            if (this.zza.zza(zzcbjVar, 8192L) == -1) {
                return -1L;
            }
        }
        return zzcbjVar.zza(sink, Math.min(j10, zzcbjVar.zzb()));
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final boolean zzf() {
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        zzcbj zzcbjVar = this.zzb;
        return zzcbjVar.zzf() && this.zza.zza(zzcbjVar, 8192L) == -1;
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final void zzg(long j10) throws EOFException {
        zzcbj zzcbjVar;
        if (j10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 15);
            sb2.append("byteCount < 0: ");
            sb2.append(j10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        do {
            zzcbjVar = this.zzb;
            if (zzcbjVar.zzb() >= j10) {
                return;
            }
        } while (this.zza.zza(zzcbjVar, 8192L) != -1);
        throw new EOFException();
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final byte zzj() throws EOFException {
        zzg(1L);
        return this.zzb.zzj();
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final short zzl() throws EOFException {
        zzg(2L);
        return this.zzb.zzl();
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final int zzm() throws EOFException {
        zzg(4L);
        return this.zzb.zzm();
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final void zzt(long j10) throws EOFException {
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            zzcbj zzcbjVar = this.zzb;
            if (zzcbjVar.zzb() == 0 && this.zza.zza(zzcbjVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, zzcbjVar.zzb());
            zzcbjVar.zzt(jMin);
            j10 -= jMin;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final zzcbn zzn(long j10) throws EOFException {
        zzg(j10);
        return this.zzb.zzn(j10);
    }

    @Override // com.google.android.libraries.places.internal.zzcbl
    public final byte[] zzr(long j10) throws EOFException {
        zzg(j10);
        return this.zzb.zzr(j10);
    }
}
