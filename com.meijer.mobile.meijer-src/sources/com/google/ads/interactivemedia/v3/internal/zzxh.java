package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* loaded from: classes4.dex */
final class zzxh implements zzya {
    final /* synthetic */ Type zza;

    zzxh(Type type) {
        this.zza = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzya
    public final Object zza() {
        Type type = this.zza;
        if (!(type instanceof ParameterizedType)) {
            throw new zzvx("Invalid EnumMap type: ".concat(String.valueOf(type.toString())));
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new zzvx("Invalid EnumMap type: ".concat(String.valueOf(this.zza.toString())));
    }
}
