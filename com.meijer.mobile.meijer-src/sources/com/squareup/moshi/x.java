package com.squareup.moshi;

import com.google.maps.android.BuildConfig;
import gu.C14410c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* loaded from: classes12.dex */
public final class x {
    public static boolean d(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof C14410c.b ? ((C14410c.b) parameterizedType).f134478c : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof C14410c.b ? ((C14410c.b) parameterizedType2).f134478c : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static ParameterizedType j(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new C14410c.b(null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    static Type a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    public static GenericArrayType b(Type type) {
        return new C14410c.a(type);
    }

    public static Type c(Type type, Class<?> cls) {
        Type typeH = h(type, cls, Collection.class);
        if (typeH instanceof WildcardType) {
            typeH = ((WildcardType) typeH).getUpperBounds()[0];
        }
        return typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments()[0] : Object.class;
    }

    public static String e(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    public static Class<?> g(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return g(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? BuildConfig.TRAVIS : type.getClass().getName()));
    }

    static Type[] i(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeH = h(type, cls, Map.class);
        return typeH instanceof ParameterizedType ? ((ParameterizedType) typeH).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Set<? extends Annotation> k(Set<? extends Annotation> set, Class<? extends Annotation> cls) {
        if (!cls.isAnnotationPresent(j.class)) {
            throw new IllegalArgumentException(cls + " is not a JsonQualifier.");
        }
        if (set.isEmpty()) {
            return null;
        }
        for (Annotation annotation : set) {
            if (cls.equals(annotation.annotationType())) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(set);
                linkedHashSet.remove(annotation);
                return Collections.unmodifiableSet(linkedHashSet);
            }
        }
        return null;
    }

    public static WildcardType l(Type type) {
        return new C14410c.C2129c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, C14410c.f134471b);
    }

    public static WildcardType m(Type type) {
        return new C14410c.C2129c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    static Type f(Type type) {
        Class<?> clsG = g(type);
        return C14410c.q(type, clsG, clsG.getGenericSuperclass());
    }

    static Type h(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C14410c.q(type, cls, C14410c.e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }
}
