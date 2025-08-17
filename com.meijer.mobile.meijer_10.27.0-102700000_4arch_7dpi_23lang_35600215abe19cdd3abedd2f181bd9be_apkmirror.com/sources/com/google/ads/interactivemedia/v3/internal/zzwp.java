package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzwp implements ParameterizedType, Serializable {
    private final Type zza;
    private final Type zzb;
    private final Type[] zzc;

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.zza;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && zzwr.zzg(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.zzc.clone();
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ Arrays.hashCode(this.zzc);
        Type type = this.zza;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        int length = this.zzc.length;
        if (length == 0) {
            return zzwr.zzb(this.zzb);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(zzwr.zzb(this.zzb));
        sb2.append("<");
        sb2.append(zzwr.zzb(this.zzc[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(", ");
            sb2.append(zzwr.zzb(this.zzc[i10]));
        }
        sb2.append(">");
        return sb2.toString();
    }

    public zzwp(Type type, Type type2, Type... typeArr) {
        Type typeZzc;
        Objects.requireNonNull(type2);
        if (type == null && (type2 instanceof Class)) {
            Class cls = (Class) type2;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                throw new IllegalArgumentException("Must specify owner type for ".concat(String.valueOf(type2)));
            }
        }
        if (type == null) {
            typeZzc = null;
        } else {
            typeZzc = zzwr.zzc(type);
        }
        this.zza = typeZzc;
        this.zzb = zzwr.zzc(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.zzc = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.zzc[i10]);
            zzwr.zzf(this.zzc[i10]);
            Type[] typeArr3 = this.zzc;
            typeArr3[i10] = zzwr.zzc(typeArr3[i10]);
        }
    }
}
