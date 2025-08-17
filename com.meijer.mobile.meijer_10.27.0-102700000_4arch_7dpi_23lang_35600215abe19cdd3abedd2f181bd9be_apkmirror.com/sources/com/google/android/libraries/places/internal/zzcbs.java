package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzcbs implements zzcbk {

    @JvmField
    public final zzcbx zza;

    @JvmField
    public final zzcbj zzb;

    @JvmField
    public boolean zzc;

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.zzc;
    }

    public zzcbs(zzcbx sink) {
        Intrinsics.j(sink, "sink");
        this.zza = sink;
        this.zzb = new zzcbj();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzcbx
    public final void close() throws Throwable {
        Throwable th2;
        if (this.zzc) {
            return;
        }
        try {
            zzcbj zzcbjVar = this.zzb;
            th2 = null;
            if (zzcbjVar.zzb() > 0) {
                this.zza.zzc(zzcbjVar, zzcbjVar.zzb());
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.zza.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        this.zzc = true;
        if (th2 != null) {
            throw th2;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcbk, com.google.android.libraries.places.internal.zzcbx, java.io.Flushable
    public final void flush() throws IOException {
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        zzcbj zzcbjVar = this.zzb;
        if (zzcbjVar.zzb() > 0) {
            this.zza.zzc(zzcbjVar, zzcbjVar.zzb());
        }
        this.zza.flush();
    }

    public final String toString() {
        zzcbx zzcbxVar = this.zza;
        StringBuilder sb2 = new StringBuilder(zzcbxVar.toString().length() + 8);
        sb2.append("buffer(");
        sb2.append(zzcbxVar);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) throws IOException {
        Intrinsics.j(source, "source");
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.zzb.write(source);
        zza();
        return iWrite;
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final zzcbk zzH(String string) {
        Intrinsics.j(string, "string");
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        this.zzb.zzv(string);
        return zza();
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final zzcbk zzI(byte[] source) {
        Intrinsics.j(source, "source");
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        this.zzb.zzy(source);
        return zza();
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final zzcbk zzJ(int i10) {
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        this.zzb.zzA(i10);
        return zza();
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final zzcbk zzK(int i10) {
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        this.zzb.zzB(i10);
        return zza();
    }

    @Override // com.google.android.libraries.places.internal.zzcbk
    public final zzcbk zzL(int i10) {
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        this.zzb.zzC(i10);
        return zza();
    }

    public final zzcbk zza() throws IOException {
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        zzcbj zzcbjVar = this.zzb;
        long jZzi = zzcbjVar.zzi();
        if (jZzi > 0) {
            this.zza.zzc(zzcbjVar, jZzi);
        }
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzcbx
    public final void zzc(zzcbj source, long j10) throws IOException {
        Intrinsics.j(source, "source");
        if (this.zzc) {
            throw new IllegalStateException("closed");
        }
        this.zzb.zzc(source, j10);
        zza();
    }
}
