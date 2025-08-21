package com.google.ads.interactivemedia.v3.internal;

import com.google.maps.android.BuildConfig;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/* loaded from: classes4.dex */
public final class zzwr {
    static final Type[] zza = new Type[0];

    public static boolean zzg(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return zzg(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013d A[EDGE_INSN: B:84:0x013d->B:78:0x013d BREAK  A[LOOP:0: B:3:0x0002->B:87:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[LOOP:0: B:3:0x0002->B:87:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [com.google.ads.interactivemedia.v3.internal.zzwo] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.google.ads.interactivemedia.v3.internal.zzwq] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.google.ads.interactivemedia.v3.internal.zzwq] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.google.ads.interactivemedia.v3.internal.zzwp] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.google.ads.interactivemedia.v3.internal.zzwo] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Type zzk(java.lang.reflect.Type r10, java.lang.Class r11, java.lang.reflect.Type r12, java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zzwr.zzk(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    public static Class zza(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            zzwn.zza(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) zza(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return zza(((WildcardType) type).getUpperBounds()[0]);
        }
        String name = type == null ? BuildConfig.TRAVIS : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + String.valueOf(type) + "> is of type " + name);
    }

    public static String zzb(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type zzc(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new zzwo(zzc(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new zzwp(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new zzwo(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new zzwq(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static Type zzd(Type type, Class cls) {
        Type typeZzj = zzj(type, cls, Collection.class);
        return typeZzj instanceof ParameterizedType ? ((ParameterizedType) typeZzj).getActualTypeArguments()[0] : Object.class;
    }

    public static Type zze(Type type, Class cls, Type type2) {
        return zzk(type, cls, type2, new HashMap());
    }

    static void zzf(Type type) {
        boolean z10 = true;
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            z10 = false;
        }
        zzwn.zza(z10);
    }

    public static Type[] zzh(Type type, Class cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeZzj = zzj(type, cls, Map.class);
        return typeZzj instanceof ParameterizedType ? ((ParameterizedType) typeZzj).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    private static Type zzi(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return zzi(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return zzi(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static Type zzj(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        zzwn.zza(cls2.isAssignableFrom(cls));
        return zze(type, cls, zzi(type, cls, cls2));
    }
}
