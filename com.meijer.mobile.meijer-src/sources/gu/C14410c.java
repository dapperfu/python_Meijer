package gu;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.g;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import com.squareup.moshi.k;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: gu.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14410c {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<Annotation> f134470a = Collections.EMPTY_SET;

    /* renamed from: b, reason: collision with root package name */
    public static final Type[] f134471b = new Type[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Class<?> f134472c;

    /* renamed from: d, reason: collision with root package name */
    private static final Class<? extends Annotation> f134473d;

    /* renamed from: e, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f134474e;

    /* renamed from: gu.c$a */
    public static final class a implements GenericArrayType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f134475a;

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && x.d(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f134475a;
        }

        public int hashCode() {
            return this.f134475a.hashCode();
        }

        public String toString() {
            return C14410c.v(this.f134475a) + "[]";
        }

        public a(Type type) {
            this.f134475a = C14410c.a(type);
        }
    }

    /* renamed from: gu.c$b */
    public static final class b implements ParameterizedType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f134476a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f134477b;

        /* renamed from: c, reason: collision with root package name */
        public final Type[] f134478c;

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && x.d(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f134478c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f134476a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f134477b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f134478c) ^ this.f134477b.hashCode()) ^ C14410c.g(this.f134476a);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((this.f134478c.length + 1) * 30);
            sb2.append(C14410c.v(this.f134477b));
            if (this.f134478c.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(C14410c.v(this.f134478c[0]));
            for (int i10 = 1; i10 < this.f134478c.length; i10++) {
                sb2.append(", ");
                sb2.append(C14410c.v(this.f134478c[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }

        public b(Type type, Type type2, Type... typeArr) {
            Type typeA;
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || x.g(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            if (type == null) {
                typeA = null;
            } else {
                typeA = C14410c.a(type);
            }
            this.f134476a = typeA;
            this.f134477b = C14410c.a(type2);
            this.f134478c = (Type[]) typeArr.clone();
            int i10 = 0;
            while (true) {
                Type[] typeArr2 = this.f134478c;
                if (i10 < typeArr2.length) {
                    typeArr2[i10].getClass();
                    C14410c.b(this.f134478c[i10]);
                    Type[] typeArr3 = this.f134478c;
                    typeArr3[i10] = C14410c.a(typeArr3[i10]);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: gu.c$c, reason: collision with other inner class name */
    public static final class C2129c implements WildcardType {

        /* renamed from: a, reason: collision with root package name */
        private final Type f134479a;

        /* renamed from: b, reason: collision with root package name */
        private final Type f134480b;

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && x.d(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f134480b;
            return type != null ? new Type[]{type} : C14410c.f134471b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f134479a};
        }

        public int hashCode() {
            Type type = this.f134480b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f134479a.hashCode() + 31);
        }

        public String toString() {
            if (this.f134480b != null) {
                return "? super " + C14410c.v(this.f134480b);
            }
            if (this.f134479a == Object.class) {
                return "?";
            }
            return "? extends " + C14410c.v(this.f134479a);
        }

        public C2129c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length == 1) {
                    if (typeArr2.length == 1) {
                        typeArr2[0].getClass();
                        C14410c.b(typeArr2[0]);
                        if (typeArr[0] == Object.class) {
                            this.f134480b = C14410c.a(typeArr2[0]);
                            this.f134479a = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    typeArr[0].getClass();
                    C14410c.b(typeArr[0]);
                    this.f134480b = null;
                    this.f134479a = C14410c.a(typeArr[0]);
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    public static boolean f(Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().getSimpleName().equals("Nullable")) {
                return true;
            }
        }
        return false;
    }

    static int h(Object[] objArr, Object obj) {
        for (int i10 = 0; i10 < objArr.length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    public static Set<? extends Annotation> l(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(j.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f134470a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class cls;
        try {
            cls = Class.forName(getKotlinMetadataClassName());
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        f134473d = cls;
        f134472c = DefaultConstructorMarker.class;
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        linkedHashMap.put(Boolean.TYPE, Boolean.class);
        linkedHashMap.put(Byte.TYPE, Byte.class);
        linkedHashMap.put(Character.TYPE, Character.class);
        linkedHashMap.put(Double.TYPE, Double.class);
        linkedHashMap.put(Float.TYPE, Float.class);
        linkedHashMap.put(Integer.TYPE, Integer.class);
        linkedHashMap.put(Long.TYPE, Long.class);
        linkedHashMap.put(Short.TYPE, Short.class);
        linkedHashMap.put(Void.TYPE, Void.class);
        f134474e = Collections.unmodifiableMap(linkedHashMap);
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(a(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType) || (type instanceof C2129c)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new C2129c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    public static h<?> d(t tVar, Type type, Class<?> cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls2;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        i iVar = (i) cls.getAnnotation(i.class);
        Class<?> cls3 = null;
        if (iVar == null || !iVar.generateAdapter()) {
            return null;
        }
        try {
            try {
                cls2 = Class.forName(x.e(cls.getName()), true, cls.getClassLoader());
            } catch (NoSuchMethodException e10) {
                e = e10;
            }
            try {
                if (type instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    try {
                        declaredConstructor = cls2.getDeclaredConstructor(t.class, Type[].class);
                        objArr = new Object[]{tVar, actualTypeArguments};
                    } catch (NoSuchMethodException unused) {
                        declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                        objArr = new Object[]{actualTypeArguments};
                    }
                } else {
                    try {
                        objArr = new Object[]{tVar};
                        declaredConstructor = cls2.getDeclaredConstructor(t.class);
                    } catch (NoSuchMethodException unused2) {
                        declaredConstructor = cls2.getDeclaredConstructor(null);
                        objArr = new Object[0];
                    }
                }
                declaredConstructor.setAccessible(true);
                return ((h) declaredConstructor.newInstance(objArr)).nullSafe();
            } catch (NoSuchMethodException e11) {
                e = e11;
                cls3 = cls2;
                if ((type instanceof ParameterizedType) || cls3.getTypeParameters().length == 0) {
                    throw new RuntimeException("Failed to find the generated JsonAdapter constructor for " + type, e);
                }
                throw new RuntimeException("Failed to find the generated JsonAdapter constructor for '" + type + "'. Suspiciously, the type was not parameterized but the target class '" + cls3.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", e);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Failed to find the generated JsonAdapter class for " + type, e12);
        } catch (IllegalAccessException e13) {
            throw new RuntimeException("Failed to access the generated JsonAdapter for " + type, e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException("Failed to instantiate the generated JsonAdapter for " + type, e14);
        } catch (InvocationTargetException e15) {
            throw t(e15);
        }
    }

    public static Type e(Type type, Class<?> cls, Class<?> cls2) {
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
                    return e(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
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
                    return e(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static int g(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static boolean i(Class<?> cls) {
        Class<? extends Annotation> cls2 = f134473d;
        return cls2 != null && cls.isAnnotationPresent(cls2);
    }

    public static String m(String str, g gVar) {
        if (gVar != null) {
            String strName = gVar.name();
            if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(strName)) {
                return strName;
            }
        }
        return str;
    }

    public static String n(String str, AnnotatedElement annotatedElement) {
        return m(str, (g) annotatedElement.getAnnotation(g.class));
    }

    public static Type p(Type type) {
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        if (wildcardType.getLowerBounds().length != 0) {
            return type;
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return upperBounds[0];
        }
        throw new IllegalArgumentException();
    }

    public static Type q(Type type, Class<?> cls, Type type2) {
        return r(type, cls, type2, new LinkedHashSet());
    }

    private static Type r(Type type, Class<?> cls, Type type2, Collection<TypeVariable<?>> collection) {
        while (type2 instanceof TypeVariable) {
            TypeVariable<?> typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = s(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeR = r(type, cls, componentType, collection);
                return componentType == typeR ? cls2 : x.b(typeR);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeR2 = r(type, cls, genericComponentType, collection);
            return genericComponentType == typeR2 ? genericArrayType : x.b(typeR2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeR3 = r(type, cls, ownerType, collection);
            boolean z10 = typeR3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i10 = 0; i10 < length; i10++) {
                Type typeR4 = r(type, cls, actualTypeArguments[i10], collection);
                if (typeR4 != actualTypeArguments[i10]) {
                    if (!z10) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z10 = true;
                    }
                    actualTypeArguments[i10] = typeR4;
                }
            }
            return z10 ? new b(typeR3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z11 = type2 instanceof WildcardType;
        Type type3 = type2;
        if (z11) {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeR5 = r(type, cls, lowerBounds[0], collection);
                type3 = wildcardType;
                if (typeR5 != lowerBounds[0]) {
                    return x.m(typeR5);
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeR6 = r(type, cls, upperBounds[0], collection);
                    type3 = wildcardType;
                    if (typeR6 != upperBounds[0]) {
                        return x.l(typeR6);
                    }
                }
            }
        }
        return type3;
    }

    public static String u(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    static String v(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    static Class<?> c(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static boolean j(Class<?> cls) {
        String name = cls.getName();
        if (!name.startsWith("android.") && !name.startsWith("androidx.") && !name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("kotlin.") && !name.startsWith("kotlinx.") && !name.startsWith("scala.")) {
            return false;
        }
        return true;
    }

    public static Set<? extends Annotation> k(AnnotatedElement annotatedElement) {
        return l(annotatedElement.getAnnotations());
    }

    public static JsonDataException o(String str, String str2, k kVar) {
        String str3;
        String path = kVar.getPath();
        if (str2.equals(str)) {
            str3 = String.format("Required value '%s' missing at %s", str, path);
        } else {
            str3 = String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, path);
        }
        return new JsonDataException(str3);
    }

    static Type s(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsC = c(typeVariable);
        if (clsC != null) {
            Type typeE = e(type, cls, clsC);
            if (typeE instanceof ParameterizedType) {
                return ((ParameterizedType) typeE).getActualTypeArguments()[h(clsC.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static RuntimeException t(InvocationTargetException invocationTargetException) {
        Throwable targetException = invocationTargetException.getTargetException();
        if (!(targetException instanceof RuntimeException)) {
            if (targetException instanceof Error) {
                throw ((Error) targetException);
            }
            throw new RuntimeException(targetException);
        }
        throw ((RuntimeException) targetException);
    }

    public static JsonDataException w(String str, String str2, k kVar) {
        String str3;
        String path = kVar.getPath();
        if (str2.equals(str)) {
            str3 = String.format("Non-null value '%s' was null at %s", str, path);
        } else {
            str3 = String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, path);
        }
        return new JsonDataException(str3);
    }
}
