package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzwo implements GenericArrayType, Serializable {
    private final Type zza;

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && zzwr.zzg(this, (GenericArrayType) obj);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return String.valueOf(zzwr.zzb(this.zza)).concat("[]");
    }

    public zzwo(Type type) {
        Objects.requireNonNull(type);
        this.zza = zzwr.zzc(type);
    }
}
