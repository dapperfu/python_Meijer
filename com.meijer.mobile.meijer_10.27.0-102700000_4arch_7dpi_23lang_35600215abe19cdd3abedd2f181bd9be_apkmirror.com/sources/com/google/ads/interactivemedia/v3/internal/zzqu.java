package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes4.dex */
final class zzqu extends zzsd implements Serializable {
    final Comparator zza;

    @Override // com.google.ads.interactivemedia.v3.internal.zzsd, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzqu) {
            return this.zza.equals(((zzqu) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    zzqu(Comparator comparator) {
        comparator.getClass();
        this.zza = comparator;
    }
}
