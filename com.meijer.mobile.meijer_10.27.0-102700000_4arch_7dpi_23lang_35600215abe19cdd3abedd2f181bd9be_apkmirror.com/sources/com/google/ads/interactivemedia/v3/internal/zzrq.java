package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;

/* loaded from: classes4.dex */
abstract class zzrq extends zzrr {
    abstract zzrp zzh();

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr
    final boolean zzi() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = zzh().get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    zzrq() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr, java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzso.zza(zzh().entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zzh().size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final boolean zzf() {
        return zzh().zzk();
    }
}
