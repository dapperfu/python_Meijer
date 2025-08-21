package kotlin.reflect.jvm.internal.calls;

import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u0014\u001a\u00028\u0000\"\b\b\u0000\u0010\r*\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00000\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018²\u0006\f\u0010\u0016\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"", "Ljava/lang/Class;", "expectedType", "q", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "", "index", "", "name", "expectedJvmType", "", "p", "(ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Void;", "T", "annotationClass", "", "values", "", "Ljava/lang/reflect/Method;", "methods", "g", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "hashCode", "toString", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class AnnotationConstructorCallerKt {
    public static final <T> T g(Class<T> annotationClass, Map<String, ? extends Object> values, List<Method> methods) {
        Intrinsics.j(annotationClass, "annotationClass");
        Intrinsics.j(values, "values");
        Intrinsics.j(methods, "methods");
        Lazy lazyB = LazyKt.b(new a(values));
        T t10 = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new c(annotationClass, values, LazyKt.b(new b(annotationClass, values)), lazyB, methods));
        Intrinsics.h(t10, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t10;
    }

    public static /* synthetic */ Object h(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.x(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list = arrayList;
        }
        return g(cls, map, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00fc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> boolean i(java.lang.Class<T> r5, java.util.List<java.lang.reflect.Method> r6, java.util.Map<java.lang.String, ? extends java.lang.Object> r7, java.lang.Object r8) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.i(java.lang.Class, java.util.List, java.util.Map, java.lang.Object):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(Class cls, Map map) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        sb2.append(cls.getCanonicalName());
        CollectionsKt___CollectionsKt.y0(map.entrySet(), sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : d.f144120a);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence m(Map.Entry entry) {
        String string;
        Intrinsics.j(entry, "entry");
        String str = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            string = Arrays.toString((boolean[]) value);
            Intrinsics.i(string, "toString(...)");
        } else if (value instanceof char[]) {
            string = Arrays.toString((char[]) value);
            Intrinsics.i(string, "toString(...)");
        } else if (value instanceof byte[]) {
            string = Arrays.toString((byte[]) value);
            Intrinsics.i(string, "toString(...)");
        } else if (value instanceof short[]) {
            string = Arrays.toString((short[]) value);
            Intrinsics.i(string, "toString(...)");
        } else if (value instanceof int[]) {
            string = Arrays.toString((int[]) value);
            Intrinsics.i(string, "toString(...)");
        } else if (value instanceof float[]) {
            string = Arrays.toString((float[]) value);
            Intrinsics.i(string, "toString(...)");
        } else if (value instanceof long[]) {
            string = Arrays.toString((long[]) value);
            Intrinsics.i(string, "toString(...)");
        } else if (value instanceof double[]) {
            string = Arrays.toString((double[]) value);
            Intrinsics.i(string, "toString(...)");
        } else if (value instanceof Object[]) {
            string = Arrays.toString((Object[]) value);
            Intrinsics.i(string, "toString(...)");
        } else {
            string = value.toString();
        }
        return str + '=' + string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void p(int i10, String str, Class<?> cls) {
        String strT;
        KClass kClassB = Intrinsics.e(cls, Class.class) ? Reflection.b(KClass.class) : (cls.isArray() && Intrinsics.e(cls.getComponentType(), Class.class)) ? Reflection.b(KClass[].class) : JvmClassMappingKt.e(cls);
        if (Intrinsics.e(kClassB.t(), Reflection.b(Object[].class).t())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(kClassB.t());
            sb2.append('<');
            Class<?> componentType = JvmClassMappingKt.b(kClassB).getComponentType();
            Intrinsics.i(componentType, "getComponentType(...)");
            sb2.append(JvmClassMappingKt.e(componentType).t());
            sb2.append('>');
            strT = sb2.toString();
        } else {
            strT = kClassB.t();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + strT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = JvmClassMappingKt.b((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof KClass[]) {
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                KClass[] kClassArr = (KClass[]) obj;
                ArrayList arrayList = new ArrayList(kClassArr.length);
                for (KClass kClass : kClassArr) {
                    arrayList.add(JvmClassMappingKt.b(kClass));
                }
                obj = arrayList.toArray(new Class[0]);
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(Map map) {
        int iHashCode;
        int iHashCode2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof boolean[]) {
                iHashCode = Arrays.hashCode((boolean[]) value);
            } else if (value instanceof char[]) {
                iHashCode = Arrays.hashCode((char[]) value);
            } else if (value instanceof byte[]) {
                iHashCode = Arrays.hashCode((byte[]) value);
            } else if (value instanceof short[]) {
                iHashCode = Arrays.hashCode((short[]) value);
            } else if (value instanceof int[]) {
                iHashCode = Arrays.hashCode((int[]) value);
            } else if (value instanceof float[]) {
                iHashCode = Arrays.hashCode((float[]) value);
            } else if (value instanceof long[]) {
                iHashCode = Arrays.hashCode((long[]) value);
            } else if (value instanceof double[]) {
                iHashCode = Arrays.hashCode((double[]) value);
            } else if (value instanceof Object[]) {
                iHashCode = Arrays.hashCode((Object[]) value);
            } else {
                iHashCode = value.hashCode();
            }
            iHashCode2 += iHashCode ^ (str.hashCode() * l3.f93324d);
        }
        return iHashCode2;
    }

    private static final int k(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    private static final String n(Lazy<String> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object o(Class cls, Map map, Lazy lazy, Lazy lazy2, List list, Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(k(lazy2));
                }
            } else if (name.equals("toString")) {
                return n(lazy);
            }
        }
        if (Intrinsics.e(name, "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(i(cls, list, map, ArraysKt.R0(objArr)));
        }
        if (map.containsKey(name)) {
            return map.get(name);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Method is not supported: ");
        sb2.append(method);
        sb2.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb2.append(ArraysKt.h1(objArr));
        sb2.append(')');
        throw new KotlinReflectionInternalError(sb2.toString());
    }
}
