package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class zzahw implements Map.Entry, Comparable, Serializable {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equals(zza(), entry.getKey()) && Objects.equals(zzb(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return zza();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return zzb();
    }

    public abstract Object zza();

    public abstract Object zzb();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzahw zzahwVar = (zzahw) obj;
        zzahn zzahnVar = new zzahn();
        zzahnVar.zzb(zza(), zzahwVar.zza(), null);
        zzahnVar.zzb(zzb(), zzahwVar.zzb(), null);
        return zzahnVar.zza();
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return Objects.hashCode(zza()) ^ Objects.hashCode(zzb());
    }

    public final String toString() {
        return "(" + String.valueOf(zza()) + "," + String.valueOf(zzb()) + ")";
    }
}
