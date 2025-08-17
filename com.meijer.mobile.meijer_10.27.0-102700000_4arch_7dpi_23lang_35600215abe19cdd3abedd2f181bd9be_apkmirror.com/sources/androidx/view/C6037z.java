package androidx.view;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0004\u0012\u00020\u00110\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR2\u0010 \u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0\b0\u001f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/lifecycle/z;", "", "<init>", "()V", "object", "Landroidx/lifecycle/p;", "f", "(Ljava/lang/Object;)Landroidx/lifecycle/p;", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/i;", "constructor", "a", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)Landroidx/lifecycle/i;", "Ljava/lang/Class;", "klass", "b", "(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;", "", "d", "(Ljava/lang/Class;)I", "g", "", "e", "(Ljava/lang/Class;)Z", "", "className", "c", "(Ljava/lang/String;)Ljava/lang/String;", "", "Ljava/util/Map;", "callbackCache", "", "classToAdapters", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6037z {

    /* renamed from: a, reason: collision with root package name */
    public static final C6037z f55302a = new C6037z();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<Class<?>, Integer> callbackCache = new HashMap();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<Class<?>, List<Constructor<? extends InterfaceC6018i>>> classToAdapters = new HashMap();

    @JvmStatic
    public static final String c(String className) {
        Intrinsics.j(className, "className");
        return StringsKt.Q(className, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    private final int d(Class<?> klass) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Map<Class<?>, Integer> map = callbackCache;
        Integer num = map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(klass);
        map.put(klass, Integer.valueOf(iG));
        return iG;
    }

    private final boolean e(Class<?> klass) {
        return klass != null && InterfaceC6029r.class.isAssignableFrom(klass);
    }

    @JvmStatic
    public static final InterfaceC6027p f(Object object) {
        Intrinsics.j(object, "object");
        boolean z10 = object instanceof InterfaceC6027p;
        boolean z11 = object instanceof InterfaceC6015f;
        if (z10 && z11) {
            return new C6016g((InterfaceC6015f) object, (InterfaceC6027p) object);
        }
        if (z11) {
            return new C6016g((InterfaceC6015f) object, null);
        }
        if (z10) {
            return (InterfaceC6027p) object;
        }
        Class<?> cls = object.getClass();
        C6037z c6037z = f55302a;
        if (c6037z.d(cls) != 2) {
            return new C5993I(object);
        }
        List<Constructor<? extends InterfaceC6018i>> list = classToAdapters.get(cls);
        Intrinsics.g(list);
        List<Constructor<? extends InterfaceC6018i>> list2 = list;
        if (list2.size() == 1) {
            return new C6007X(c6037z.a(list2.get(0), object));
        }
        int size = list2.size();
        InterfaceC6018i[] interfaceC6018iArr = new InterfaceC6018i[size];
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC6018iArr[i10] = f55302a.a(list2.get(i10), object);
        }
        return new C6014e(interfaceC6018iArr);
    }

    private C6037z() {
    }

    private final InterfaceC6018i a(Constructor<? extends InterfaceC6018i> constructor, Object object) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            InterfaceC6018i interfaceC6018iNewInstance = constructor.newInstance(object);
            Intrinsics.g(interfaceC6018iNewInstance);
            return interfaceC6018iNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor<? extends InterfaceC6018i> b(Class<?> klass) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name;
        try {
            Package r02 = klass.getPackage();
            String canonicalName = klass.getCanonicalName();
            if (r02 != null) {
                name = r02.getName();
            } else {
                name = "";
            }
            Intrinsics.g(name);
            if (name.length() != 0) {
                Intrinsics.g(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                Intrinsics.i(canonicalName, "substring(...)");
            }
            Intrinsics.g(canonicalName);
            String strC = c(canonicalName);
            if (name.length() != 0) {
                strC = name + '.' + strC;
            }
            Class<?> cls = Class.forName(strC);
            Intrinsics.h(cls, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls.getDeclaredConstructor(klass);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    private final int g(Class<?> klass) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC6018i> constructorB = b(klass);
        if (constructorB != null) {
            classToAdapters.put(klass, CollectionsKt.e(constructorB));
            return 2;
        }
        if (C6013d.f55242c.d(klass)) {
            return 1;
        }
        Class<? super Object> superclass = klass.getSuperclass();
        if (e(superclass)) {
            Intrinsics.g(superclass);
            if (d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends InterfaceC6018i>> list = classToAdapters.get(superclass);
            Intrinsics.g(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Iterator itA = ArrayIteratorKt.a(klass.getInterfaces());
        while (itA.hasNext()) {
            Class<?> cls = (Class) itA.next();
            if (e(cls)) {
                Intrinsics.g(cls);
                if (d(cls) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends InterfaceC6018i>> list2 = classToAdapters.get(cls);
                Intrinsics.g(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(klass, arrayList);
        return 2;
    }
}
