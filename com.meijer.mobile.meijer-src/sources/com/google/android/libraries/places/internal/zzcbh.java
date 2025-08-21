package com.google.android.libraries.places.internal;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzcbh implements zzcbz {
    final /* synthetic */ zzcbz zza;

    zzcbh(zzcbi zzcbiVar, zzcbz zzcbzVar) {
        this.zza = zzcbzVar;
    }

    @Override // com.google.android.libraries.places.internal.zzcbz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.zza.close();
            Unit unit = Unit.f143329a;
        } catch (IOException e10) {
            throw e10;
        } finally {
            zzcbi.zza();
        }
    }

    public final String toString() {
        zzcbz zzcbzVar = this.zza;
        StringBuilder sb2 = new StringBuilder(zzcbzVar.toString().length() + 21);
        sb2.append("AsyncTimeout.source(");
        sb2.append(zzcbzVar);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzcbz
    public final long zza(zzcbj sink, long j10) {
        Intrinsics.j(sink, "sink");
        try {
            return this.zza.zza(sink, j10);
        } catch (IOException e10) {
            throw e10;
        } finally {
            zzcbi.zza();
        }
    }
}
