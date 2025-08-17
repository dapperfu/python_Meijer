package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzaca {
    private final Class zza;
    private final Type zzb;
    private final int zzc;

    protected zzaca() {
        Type genericSuperclass = zzaca.class.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == zzaca.class) {
                Type typeZzc = zzwr.zzc(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    zze(typeZzc);
                }
                this.zzb = typeZzc;
                this.zza = zzwr.zza(typeZzc);
                this.zzc = typeZzc.hashCode();
                return;
            }
        } else if (genericSuperclass == zzaca.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#type-token-raw");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final int hashCode() {
        return this.zzc;
    }

    public final Class zzc() {
        return this.zza;
    }

    public final Type zzd() {
        return this.zzb;
    }

    public static zzaca zza(Class cls) {
        return new zzaca(cls);
    }

    public static zzaca zzb(Type type) {
        return new zzaca(type);
    }

    private static void zze(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + String.valueOf(typeVariable.getGenericDeclaration()) + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#typetoken-type-variable");
        }
        if (type instanceof GenericArrayType) {
            zze(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i10 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                zze(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i10 < length) {
                zze(actualTypeArguments[i10]);
                i10++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            zze(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i10 < length2) {
            zze(upperBounds[i10]);
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzaca) && zzwr.zzg(this.zzb, ((zzaca) obj).zzb);
    }

    public final String toString() {
        return zzwr.zzb(this.zzb);
    }

    private zzaca(Type type) {
        Objects.requireNonNull(type);
        Type typeZzc = zzwr.zzc(type);
        this.zzb = typeZzc;
        this.zza = zzwr.zza(typeZzc);
        this.zzc = typeZzc.hashCode();
    }
}
