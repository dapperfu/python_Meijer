package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzwq implements WildcardType, Serializable {
    private final Type zza;
    private final Type zzb;

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.zzb;
        return type != null ? new Type[]{type} : zzwr.zza;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.zza};
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && zzwr.zzg(this, (WildcardType) obj);
    }

    public final int hashCode() {
        Type type = this.zzb;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.zza.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.zzb;
        if (type != null) {
            return "? super ".concat(String.valueOf(zzwr.zzb(type)));
        }
        Type type2 = this.zza;
        return type2 == Object.class ? "?" : "? extends ".concat(String.valueOf(zzwr.zzb(type2)));
    }

    public zzwq(Type[] typeArr, Type[] typeArr2) {
        boolean z10;
        boolean z11;
        int length = typeArr2.length;
        if (length <= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzwn.zza(z10);
        if (typeArr.length == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        zzwn.zza(z11);
        if (length == 1) {
            Objects.requireNonNull(typeArr2[0]);
            zzwr.zzf(typeArr2[0]);
            zzwn.zza(typeArr[0] == Object.class);
            this.zzb = zzwr.zzc(typeArr2[0]);
            this.zza = Object.class;
            return;
        }
        Objects.requireNonNull(typeArr[0]);
        zzwr.zzf(typeArr[0]);
        this.zzb = null;
        this.zza = zzwr.zzc(typeArr[0]);
    }
}
