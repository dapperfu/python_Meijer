package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;

/* loaded from: classes4.dex */
final class zzsb extends zzsd implements Serializable {
    static final zzsb zza = new zzsb();

    private zzsb() {
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsd
    public final zzsd zza() {
        return zzsm.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsd, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }
}
