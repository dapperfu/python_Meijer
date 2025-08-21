package com.google.gson.internal;

import com.google.gson.JsonIOException;
import com.google.gson.r;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import qg.C16666a;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Type, com.google.gson.g<?>> f90525a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f90526b;

    /* renamed from: c, reason: collision with root package name */
    private final List<com.google.gson.r> f90527c;

    private static <T> D<T> A(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return (D<T>) y(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (D<T>) B(type, cls);
        }
        return null;
    }

    private static D<? extends Map<? extends Object, Object>> B(Type type, Class<?> cls) {
        if (cls.isAssignableFrom(B.class) && x(type)) {
            return new D() { // from class: com.google.gson.internal.e
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.p();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new D() { // from class: com.google.gson.internal.f
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.c();
                }
            };
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new D() { // from class: com.google.gson.internal.g
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.j();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new D() { // from class: com.google.gson.internal.h
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.a();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new D() { // from class: com.google.gson.internal.i
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.h();
                }
            };
        }
        return null;
    }

    private static <T> D<T> C(final Type type, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new D() { // from class: com.google.gson.internal.c
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.m(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new D() { // from class: com.google.gson.internal.d
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.f(type);
                }
            };
        }
        return null;
    }

    private <T> D<T> D(final Class<? super T> cls) {
        if (this.f90526b) {
            return new D() { // from class: com.google.gson.internal.u
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.e(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new D() { // from class: com.google.gson.internal.b
            @Override // com.google.gson.internal.D
            public final Object a() {
                return v.o(str);
            }
        };
    }

    public static /* synthetic */ Map a() {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Collection b() {
        return new ArrayList();
    }

    public static /* synthetic */ Map c() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ Object d(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Object e(Class cls) {
        try {
            return J.f90338a.d(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    public static /* synthetic */ Object f(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new JsonIOException("Invalid EnumMap type: " + type.toString());
    }

    public static /* synthetic */ Map h() {
        return new ConcurrentSkipListMap();
    }

    public static /* synthetic */ Map j() {
        return new TreeMap();
    }

    public static /* synthetic */ Object k(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Collection l() {
        return new LinkedHashSet();
    }

    public static /* synthetic */ Object m(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
    }

    public static /* synthetic */ Object n(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Object o(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Map p() {
        return new B();
    }

    public static /* synthetic */ Object q(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Collection r() {
        return new TreeSet();
    }

    public static /* synthetic */ Object s(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw C16666a.e(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + C16666a.c(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + C16666a.c(constructor) + "' with no args", e12.getCause());
        }
    }

    public static /* synthetic */ Collection t() {
        return new ArrayDeque();
    }

    public static /* synthetic */ Object u(String str) {
        throw new JsonIOException(str);
    }

    private static boolean x(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length != 0 && x.k(actualTypeArguments[0]) == String.class;
    }

    private static D<? extends Collection<? extends Object>> y(Class<?> cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new D() { // from class: com.google.gson.internal.q
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.b();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new D() { // from class: com.google.gson.internal.r
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.l();
                }
            };
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new D() { // from class: com.google.gson.internal.s
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.r();
                }
            };
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new D() { // from class: com.google.gson.internal.t
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.t();
                }
            };
        }
        return null;
    }

    public String toString() {
        return this.f90525a.toString();
    }

    public v(Map<Type, com.google.gson.g<?>> map, boolean z10, List<com.google.gson.r> list) {
        this.f90525a = map;
        this.f90526b = z10;
        this.f90527c = list;
    }

    static String v(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + I.a("r8-abstract-class");
        }
        return null;
    }

    private static <T> D<T> z(Class<? super T> cls, r.a aVar) throws NoSuchMethodException, SecurityException {
        final String strP;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            r.a aVar2 = r.a.ALLOW;
            if (aVar != aVar2 && (!G.a(declaredConstructor, null) || (aVar == r.a.BLOCK_ALL && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
                return new D() { // from class: com.google.gson.internal.j
                    @Override // com.google.gson.internal.D
                    public final Object a() {
                        return v.n(str);
                    }
                };
            }
            if (aVar == aVar2 && (strP = C16666a.p(declaredConstructor)) != null) {
                return new D() { // from class: com.google.gson.internal.k
                    @Override // com.google.gson.internal.D
                    public final Object a() {
                        return v.k(strP);
                    }
                };
            }
            return new D() { // from class: com.google.gson.internal.m
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.s(declaredConstructor);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public <T> D<T> w(com.google.gson.reflect.a<T> aVar, boolean z10) throws NoSuchMethodException, SecurityException {
        final Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        final com.google.gson.g<?> gVar = this.f90525a.get(type);
        if (gVar != null) {
            return new D() { // from class: com.google.gson.internal.a
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return gVar.createInstance(type);
                }
            };
        }
        final com.google.gson.g<?> gVar2 = this.f90525a.get(rawType);
        if (gVar2 != null) {
            return new D() { // from class: com.google.gson.internal.l
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return gVar2.createInstance(type);
                }
            };
        }
        D<T> dC = C(type, rawType);
        if (dC != null) {
            return dC;
        }
        r.a aVarB = G.b(this.f90527c, rawType);
        D<T> dZ = z(rawType, aVarB);
        if (dZ != null) {
            return dZ;
        }
        D<T> dA = A(type, rawType);
        if (dA != null) {
            return dA;
        }
        final String strV = v(rawType);
        if (strV != null) {
            return new D() { // from class: com.google.gson.internal.n
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.q(strV);
                }
            };
        }
        if (!z10) {
            final String str = "Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.";
            return new D() { // from class: com.google.gson.internal.o
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.d(str);
                }
            };
        }
        if (aVarB != r.a.ALLOW) {
            final String str2 = "Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
            return new D() { // from class: com.google.gson.internal.p
                @Override // com.google.gson.internal.D
                public final Object a() {
                    return v.u(str2);
                }
            };
        }
        return D(rawType);
    }
}
