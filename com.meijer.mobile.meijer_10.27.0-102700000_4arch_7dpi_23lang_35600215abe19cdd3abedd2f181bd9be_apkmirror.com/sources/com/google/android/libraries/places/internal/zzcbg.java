package com.google.android.libraries.places.internal;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzcbg implements zzcbx {
    final /* synthetic */ zzcbx zza;

    zzcbg(zzcbi zzcbiVar, zzcbx zzcbxVar) {
        this.zza = zzcbxVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcbx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zza.close();
            Unit unit = Unit.f142422a;
        } catch (IOException e10) {
            throw e10;
        } finally {
            zzcbi.zza();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzcbx, java.io.Flushable
    public final void flush() {
        try {
            this.zza.flush();
            Unit unit = Unit.f142422a;
        } catch (IOException e10) {
            throw e10;
        } finally {
            zzcbi.zza();
        }
    }

    public final String toString() {
        zzcbx zzcbxVar = this.zza;
        StringBuilder sb2 = new StringBuilder(zzcbxVar.toString().length() + 19);
        sb2.append("AsyncTimeout.sink(");
        sb2.append(zzcbxVar);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcbx
    public final void zzc(zzcbj source, long j10) {
        Intrinsics.j(source, "source");
        zzcbf.zza(source.zzb(), 0L, j10);
        while (true) {
            long j11 = 0;
            if (j10 <= 0) {
                return;
            }
            zzcbu zzcbuVar = source.zza;
            Intrinsics.g(zzcbuVar);
            while (true) {
                if (j11 >= 65536) {
                    break;
                }
                j11 += zzcbuVar.zzc - zzcbuVar.zzb;
                if (j11 >= j10) {
                    j11 = j10;
                    break;
                } else {
                    zzcbuVar = zzcbuVar.zzf;
                    Intrinsics.g(zzcbuVar);
                }
            }
            try {
                try {
                    this.zza.zzc(source, j11);
                    Unit unit = Unit.f142422a;
                    zzcbi.zza();
                    j10 -= j11;
                } catch (IOException e10) {
                    zzcbi.zza();
                    throw e10;
                }
            } catch (Throwable th2) {
                zzcbi.zza();
                throw th2;
            }
        }
    }
}
