package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* loaded from: classes4.dex */
final class zzsm extends zzsd implements Serializable {
    static final zzsm zza = new zzsm();

    private zzsm() {
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsd
    public final zzsd zza() {
        return zzsb.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsd, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }
}
