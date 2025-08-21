package com.google.gson.internal;

import com.google.maps.android.BuildConfig;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Properties;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    static final Type[] f90528a = new Type[0];

    private static final class a implements GenericArrayType, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Type f90529a;

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && x.f(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f90529a;
        }

        public int hashCode() {
            return this.f90529a.hashCode();
        }

        public String toString() {
            return x.u(this.f90529a) + "[]";
        }

        public a(Type type) {
            Objects.requireNonNull(type);
            this.f90529a = x.b(type);
        }
    }

    private static final class b implements ParameterizedType, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Type f90530a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f90531b;

        /* renamed from: c, reason: collision with root package name */
        private final Type[] f90532c;

        private static int a(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && x.f(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f90532c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f90530a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f90531b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f90532c) ^ this.f90531b.hashCode()) ^ a(this.f90530a);
        }

        public String toString() {
            int length = this.f90532c.length;
            if (length == 0) {
                return x.u(this.f90531b);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(x.u(this.f90531b));
            sb2.append("<");
            sb2.append(x.u(this.f90532c[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(x.u(this.f90532c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }

        public b(Type type, Class<?> cls, Type... typeArr) {
            Type typeB;
            Objects.requireNonNull(cls);
            if (type == null && x.o(cls)) {
                throw new IllegalArgumentException("Must specify owner type for " + cls);
            }
            if (type == null) {
                typeB = null;
            } else {
                typeB = x.b(type);
            }
            this.f90530a = typeB;
            this.f90531b = x.b(cls);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f90532c = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                Objects.requireNonNull(this.f90532c[i10]);
                x.c(this.f90532c[i10]);
                Type[] typeArr3 = this.f90532c;
                typeArr3[i10] = x.b(typeArr3[i10]);
            }
        }
    }

    private static final class c implements WildcardType, Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Type f90533a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f90534b;

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && x.f(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f90534b;
            return type != null ? new Type[]{type} : x.f90528a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f90533a};
        }

        public int hashCode() {
            Type type = this.f90534b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f90533a.hashCode() + 31);
        }

        public String toString() {
            if (this.f90534b != null) {
                return "? super " + x.u(this.f90534b);
            }
            if (this.f90533a == Object.class) {
                return "?";
            }
            return "? extends " + x.u(this.f90533a);
        }

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z10;
            boolean z11;
            if (typeArr2.length <= 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            w.a(z10);
            if (typeArr.length == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            w.a(z11);
            if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                x.c(typeArr2[0]);
                w.a(typeArr[0] == Object.class);
                this.f90534b = x.b(typeArr2[0]);
                this.f90533a = Object.class;
                return;
            }
            Objects.requireNonNull(typeArr[0]);
            x.c(typeArr[0]);
            this.f90534b = null;
            this.f90533a = x.b(typeArr[0]);
        }
    }

    public static boolean f(Type type, Type type2) {
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
            return e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    private static int m(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.reflect.Type q(java.lang.reflect.Type r10, java.lang.Class<?> r11, java.lang.reflect.Type r12, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r13) {
        /*
            r0 = 0
        L1:
            boolean r1 = r12 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L24
            r1 = r12
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r13.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.Class r3 = java.lang.Void.TYPE
            if (r2 == 0) goto L16
            if (r2 != r3) goto L15
            return r12
        L15:
            return r2
        L16:
            r13.put(r1, r3)
            if (r0 != 0) goto L1c
            r0 = r1
        L1c:
            java.lang.reflect.Type r12 = r(r10, r11, r1)
            if (r12 != r1) goto L1
            goto Lde
        L24:
            boolean r1 = r12 instanceof java.lang.Class
            if (r1 == 0) goto L49
            r1 = r12
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L49
            java.lang.Class r12 = r1.getComponentType()
            java.lang.reflect.Type r10 = q(r10, r11, r12, r13)
            boolean r11 = e(r12, r10)
            if (r11 == 0) goto L42
            r12 = r1
            goto Lde
        L42:
            java.lang.reflect.GenericArrayType r10 = a(r10)
        L46:
            r12 = r10
            goto Lde
        L49:
            boolean r1 = r12 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L64
            java.lang.reflect.GenericArrayType r12 = (java.lang.reflect.GenericArrayType) r12
            java.lang.reflect.Type r1 = r12.getGenericComponentType()
            java.lang.reflect.Type r10 = q(r10, r11, r1, r13)
            boolean r11 = e(r1, r10)
            if (r11 == 0) goto L5f
            goto Lde
        L5f:
            java.lang.reflect.GenericArrayType r10 = a(r10)
            goto L46
        L64:
            boolean r1 = r12 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lad
            java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
            java.lang.reflect.Type r1 = r12.getOwnerType()
            java.lang.reflect.Type r4 = q(r10, r11, r1, r13)
            boolean r1 = e(r4, r1)
            java.lang.reflect.Type[] r5 = r12.getActualTypeArguments()
            int r6 = r5.length
            r7 = r5
            r5 = r3
        L7f:
            if (r3 >= r6) goto L9e
            r8 = r7[r3]
            java.lang.reflect.Type r8 = q(r10, r11, r8, r13)
            r9 = r7[r3]
            boolean r9 = e(r8, r9)
            if (r9 != 0) goto L9b
            if (r5 != 0) goto L99
            java.lang.Object r5 = r7.clone()
            r7 = r5
            java.lang.reflect.Type[] r7 = (java.lang.reflect.Type[]) r7
            r5 = r2
        L99:
            r7[r3] = r8
        L9b:
            int r3 = r3 + 1
            goto L7f
        L9e:
            if (r1 == 0) goto La2
            if (r5 == 0) goto Lde
        La2:
            java.lang.reflect.Type r10 = r12.getRawType()
            java.lang.Class r10 = (java.lang.Class) r10
            java.lang.reflect.ParameterizedType r10 = n(r4, r10, r7)
            goto L46
        Lad:
            boolean r1 = r12 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto Lde
            java.lang.reflect.WildcardType r12 = (java.lang.reflect.WildcardType) r12
            java.lang.reflect.Type[] r1 = r12.getLowerBounds()
            java.lang.reflect.Type[] r4 = r12.getUpperBounds()
            int r5 = r1.length
            if (r5 != r2) goto Lcd
            r2 = r1[r3]
            java.lang.reflect.Type r10 = q(r10, r11, r2, r13)
            r11 = r1[r3]
            if (r10 == r11) goto Lde
            java.lang.reflect.WildcardType r12 = t(r10)
            goto Lde
        Lcd:
            int r1 = r4.length
            if (r1 != r2) goto Lde
            r1 = r4[r3]
            java.lang.reflect.Type r10 = q(r10, r11, r1, r13)
            r11 = r4[r3]
            if (r10 == r11) goto Lde
            java.lang.reflect.WildcardType r12 = s(r10)
        Lde:
            if (r0 == 0) goto Le3
            r13.put(r0, r12)
        Le3:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.x.q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static Type b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(b(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void c(Type type) {
        w.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static Type g(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type h(Type type, Class<?> cls) {
        Type typeL = l(type, cls, Collection.class);
        return typeL instanceof ParameterizedType ? ((ParameterizedType) typeL).getActualTypeArguments()[0] : Object.class;
    }

    private static Type i(Type type, Class<?> cls, Class<?> cls2) {
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
                    return i(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type[] j(Type type, Class<?> cls) {
        if (Properties.class.isAssignableFrom(cls)) {
            return new Type[]{String.class, String.class};
        }
        Type typeL = l(type, cls, Map.class);
        return typeL instanceof ParameterizedType ? ((ParameterizedType) typeL).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class<?> k(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            w.a(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return k(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? BuildConfig.TRAVIS : type.getClass().getName()));
    }

    private static Type l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        w.a(cls2.isAssignableFrom(cls));
        return p(type, cls, i(type, cls, cls2));
    }

    public static ParameterizedType n(Type type, Class<?> cls, Type... typeArr) {
        return new b(type, cls, typeArr);
    }

    public static boolean o(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                return true;
            }
        }
        return false;
    }

    public static Type p(Type type, Class<?> cls, Type type2) {
        return q(type, cls, type2, new HashMap());
    }

    public static WildcardType s(Type type) {
        return new c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f90528a);
    }

    public static WildcardType t(Type type) {
        return new c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static Class<?> d(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    private static boolean e(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private static Type r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsD = d(typeVariable);
        if (clsD != null) {
            Type typeI = i(type, cls, clsD);
            if (typeI instanceof ParameterizedType) {
                return ((ParameterizedType) typeI).getActualTypeArguments()[m(clsD.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }
}
