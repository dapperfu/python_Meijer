package com.google.android.libraries.places.internal;

import Be.l;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
final class zzbvk {
    final int zza;
    final int zzb;
    final int zzc;
    final AtomicInteger zzd;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbvk)) {
            return false;
        }
        zzbvk zzbvkVar = (zzbvk) obj;
        return this.zza == zzbvkVar.zza && this.zzc == zzbvkVar.zzc;
    }

    public final int hashCode() {
        return l.b(Integer.valueOf(this.zza), Integer.valueOf(this.zzc));
    }

    final boolean zza() {
        return this.zzd.get() > this.zzb;
    }

    final boolean zzb() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = this.zzd;
            i10 = atomicInteger.get();
            if (i10 == 0) {
                return false;
            }
            i11 = i10 - 1000;
        } while (!atomicInteger.compareAndSet(i10, Math.max(i11, 0)));
        return i11 > this.zzb;
    }

    zzbvk(float f10, float f11) {
        AtomicInteger atomicInteger = new AtomicInteger();
        this.zzd = atomicInteger;
        this.zzc = (int) (f11 * 1000.0f);
        int i10 = (int) (f10 * 1000.0f);
        this.zza = i10;
        this.zzb = i10 / 2;
        atomicInteger.set(i10);
    }
}
