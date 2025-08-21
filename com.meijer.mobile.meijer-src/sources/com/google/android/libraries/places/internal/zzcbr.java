package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class zzcbr implements zzcbx {
    private final OutputStream zza;
    private final zzccb zzb;

    public zzcbr(OutputStream out, zzccb timeout) {
        Intrinsics.j(out, "out");
        Intrinsics.j(timeout, "timeout");
        this.zza = out;
        this.zzb = timeout;
    }

    @Override // com.google.android.libraries.places.internal.zzcbx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza.close();
    }

    @Override // com.google.android.libraries.places.internal.zzcbx, java.io.Flushable
    public final void flush() throws IOException {
        this.zza.flush();
    }

    public final String toString() {
        OutputStream outputStream = this.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(outputStream).length() + 6);
        sb2.append("sink(");
        sb2.append(outputStream);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcbx
    public final void zzc(zzcbj source, long j10) throws IOException {
        Intrinsics.j(source, "source");
        zzcbf.zza(source.zzb(), 0L, j10);
        while (j10 > 0) {
            this.zzb.zzb();
            zzcbu zzcbuVar = source.zza;
            Intrinsics.g(zzcbuVar);
            int iMin = (int) Math.min(j10, zzcbuVar.zzc - zzcbuVar.zzb);
            this.zza.write(zzcbuVar.zza, zzcbuVar.zzb, iMin);
            zzcbuVar.zzb += iMin;
            long j11 = iMin;
            source.zzd(source.zzb() - j11);
            j10 -= j11;
            if (zzcbuVar.zzb == zzcbuVar.zzc) {
                source.zza = zzcbuVar.zzb();
                zzcbv.zzb(zzcbuVar);
            }
        }
    }
}
