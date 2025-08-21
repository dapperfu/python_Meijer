package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
final class Java16SealedRecordLoader {

    /* renamed from: a, reason: collision with root package name */
    public static final Java16SealedRecordLoader f144965a = new Java16SealedRecordLoader();

    /* renamed from: b, reason: collision with root package name */
    private static Cache f144966b;

    public static final class Cache {

        /* renamed from: a, reason: collision with root package name */
        private final Method f144967a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f144968b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f144969c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f144970d;

        public final Method a() {
            return this.f144968b;
        }

        public final Method b() {
            return this.f144970d;
        }

        public final Method c() {
            return this.f144969c;
        }

        public final Method d() {
            return this.f144967a;
        }

        public Cache(Method method, Method method2, Method method3, Method method4) {
            this.f144967a = method;
            this.f144968b = method2;
            this.f144969c = method3;
            this.f144970d = method4;
        }
    }

    private final Cache a() {
        try {
            return new Cache(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null, null, null);
        }
    }

    private final Cache b() {
        Cache cache = f144966b;
        if (cache != null) {
            return cache;
        }
        Cache cacheA = a();
        f144966b = cacheA;
        return cacheA;
    }

    public final Class<?>[] c(Class<?> clazz) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(clazz, "clazz");
        Method methodA = b().a();
        if (methodA == null) {
            return null;
        }
        Object objInvoke = methodA.invoke(clazz, null);
        Intrinsics.h(objInvoke, "null cannot be cast to non-null type kotlin.Array<java.lang.Class<*>>");
        return (Class[]) objInvoke;
    }

    public final Object[] d(Class<?> clazz) {
        Intrinsics.j(clazz, "clazz");
        Method methodB = b().b();
        if (methodB == null) {
            return null;
        }
        return (Object[]) methodB.invoke(clazz, null);
    }

    public final Boolean e(Class<?> clazz) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(clazz, "clazz");
        Method methodC = b().c();
        if (methodC == null) {
            return null;
        }
        Object objInvoke = methodC.invoke(clazz, null);
        Intrinsics.h(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    public final Boolean f(Class<?> clazz) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(clazz, "clazz");
        Method methodD = b().d();
        if (methodD == null) {
            return null;
        }
        Object objInvoke = methodD.invoke(clazz, null);
        Intrinsics.h(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
        return (Boolean) objInvoke;
    }

    private Java16SealedRecordLoader() {
    }
}
