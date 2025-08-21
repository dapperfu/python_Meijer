package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
final class Java16RecordComponentsLoader {

    /* renamed from: a, reason: collision with root package name */
    public static final Java16RecordComponentsLoader f144961a = new Java16RecordComponentsLoader();

    /* renamed from: b, reason: collision with root package name */
    private static Cache f144962b;

    public static final class Cache {

        /* renamed from: a, reason: collision with root package name */
        private final Method f144963a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f144964b;

        public final Method a() {
            return this.f144964b;
        }

        public final Method b() {
            return this.f144963a;
        }

        public Cache(Method method, Method method2) {
            this.f144963a = method;
            this.f144964b = method2;
        }
    }

    private final Cache b(Object obj) {
        Cache cache = f144962b;
        if (cache != null) {
            return cache;
        }
        Cache cacheA = a(obj);
        f144962b = cacheA;
        return cacheA;
    }

    public final Method c(Object recordComponent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(recordComponent, "recordComponent");
        Method methodA = b(recordComponent).a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(recordComponent, null);
        Intrinsics.h(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
        return (Method) objInvoke;
    }

    public final Class<?> d(Object recordComponent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(recordComponent, "recordComponent");
        Method methodB = b(recordComponent).b();
        if (methodB == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(recordComponent, null);
        Intrinsics.h(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
        return (Class) objInvoke;
    }

    private Java16RecordComponentsLoader() {
    }

    private final Cache a(Object obj) {
        Class<?> cls = obj.getClass();
        try {
            return new Cache(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }
}
