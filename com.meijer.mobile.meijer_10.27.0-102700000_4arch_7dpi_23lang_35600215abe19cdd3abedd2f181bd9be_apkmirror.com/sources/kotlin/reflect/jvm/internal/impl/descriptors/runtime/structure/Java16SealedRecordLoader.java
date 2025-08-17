package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
final class Java16SealedRecordLoader {

    /* renamed from: a, reason: collision with root package name */
    public static final Java16SealedRecordLoader f144058a = new Java16SealedRecordLoader();

    /* renamed from: b, reason: collision with root package name */
    private static Cache f144059b;

    public static final class Cache {

        /* renamed from: a, reason: collision with root package name */
        private final Method f144060a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f144061b;

        /* renamed from: c, reason: collision with root package name */
        private final Method f144062c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f144063d;

        public final Method a() {
            return this.f144061b;
        }

        public final Method b() {
            return this.f144063d;
        }

        public final Method c() {
            return this.f144062c;
        }

        public final Method d() {
            return this.f144060a;
        }

        public Cache(Method method, Method method2, Method method3, Method method4) {
            this.f144060a = method;
            this.f144061b = method2;
            this.f144062c = method3;
            this.f144063d = method4;
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
        Cache cache = f144059b;
        if (cache != null) {
            return cache;
        }
        Cache cacheA = a();
        f144059b = cacheA;
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
