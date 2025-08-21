package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes4.dex */
public abstract class zzrp<K, V> implements Map<K, V>, Serializable {
    private transient zzrr zza;
    private transient zzrr zzb;
    private transient zzri zzc;

    zzrp() {
    }

    public static zzrp zzd() {
        return zzsj.zza;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    abstract zzri zza();

    abstract zzrr zzg();

    abstract zzrr zzh();

    abstract boolean zzk();

    public static zzrp zzc(Map map) {
        if ((map instanceof zzrp) && !(map instanceof SortedMap)) {
            zzrp zzrpVar = (zzrp) map;
            if (!zzrpVar.zzk()) {
                return zzrpVar;
            }
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        zzro zzroVar = new zzro(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzroVar.zzb(setEntrySet);
        return zzroVar.zzc();
    }

    public static zzrp zzf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        zzqt.zzb("IABTCF_AddtlConsent", "String");
        zzqt.zzb("IABTCF_gdprApplies", "Number");
        zzqt.zzb("IABTCF_TCString", "String");
        zzqt.zzb("IABUSPrivacy_String", "String");
        zzqt.zzb("IABGPP_HDR_GppString", "String");
        zzqt.zzb("IABGPP_GppSID", "String");
        return zzsj.zzl(6, new Object[]{"IABTCF_AddtlConsent", "String", "IABTCF_gdprApplies", "Number", "IABTCF_TCString", "String", "IABUSPrivacy_String", "String", "IABGPP_HDR_GppString", "String", "IABGPP_GppSID", "String"}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public zzri values() {
        zzri zzriVar = this.zzc;
        if (zzriVar != null) {
            return zzriVar;
        }
        zzri zzriVarZza = zza();
        this.zzc = zzriVarZza;
        return zzriVarZza;
    }

    @Override // java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzrr entrySet() {
        zzrr zzrrVar = this.zza;
        if (zzrrVar != null) {
            return zzrrVar;
        }
        zzrr zzrrVarZzg = zzg();
        this.zza = zzrrVarZzg;
        return zzrrVarZzg;
    }

    @Override // java.util.Map
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public zzrr keySet() {
        zzrr zzrrVar = this.zzb;
        if (zzrrVar != null) {
            return zzrrVar;
        }
        zzrr zzrrVarZzh = zzh();
        this.zzb = zzrrVarZzh;
        return zzrrVarZzh;
    }

    public static zzrp zze(Object obj, Object obj2) {
        zzqt.zzb(obj, obj2);
        return zzsj.zzl(1, new Object[]{obj, obj2}, null);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzso.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        int size = size();
        zzqt.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }
}
