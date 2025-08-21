package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class zzcbo implements zzcbz {
    private final InputStream zza;
    private final zzccb zzb;

    public zzcbo(InputStream input, zzccb timeout) {
        Intrinsics.j(input, "input");
        Intrinsics.j(timeout, "timeout");
        this.zza = input;
        this.zzb = timeout;
    }

    @Override // com.google.android.libraries.places.internal.zzcbz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    public final String toString() {
        InputStream inputStream = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(inputStream).length() + 8);
        sb2.append("source(");
        sb2.append(inputStream);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcbz
    public final long zza(zzcbj sink, long j10) throws IOException {
        Intrinsics.j(sink, "sink");
        try {
            this.zzb.zzb();
            zzcbu zzcbuVarZzE = sink.zzE(1);
            int i10 = this.zza.read(zzcbuVarZzE.zza, zzcbuVarZzE.zzc, (int) Math.min(j10, 8192 - zzcbuVarZzE.zzc));
            if (i10 != -1) {
                zzcbuVarZzE.zzc += i10;
                long j11 = i10;
                sink.zzd(sink.zzb() + j11);
                return j11;
            }
            if (zzcbuVarZzE.zzb != zzcbuVarZzE.zzc) {
                return -1L;
            }
            sink.zza = zzcbuVarZzE.zzb();
            zzcbv.zzb(zzcbuVarZzE);
            return -1L;
        } catch (AssertionError e10) {
            if (zzcbq.zza(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }
}
