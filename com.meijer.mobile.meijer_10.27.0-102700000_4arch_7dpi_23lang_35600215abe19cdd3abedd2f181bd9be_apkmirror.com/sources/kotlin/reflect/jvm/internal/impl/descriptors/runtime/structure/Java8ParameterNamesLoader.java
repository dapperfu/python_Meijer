package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes13.dex */
final class Java8ParameterNamesLoader {

    /* renamed from: a, reason: collision with root package name */
    public static final Java8ParameterNamesLoader f144064a = new Java8ParameterNamesLoader();

    /* renamed from: b, reason: collision with root package name */
    private static Cache f144065b;

    public static final class Cache {

        /* renamed from: a, reason: collision with root package name */
        private final Method f144066a;

        /* renamed from: b, reason: collision with root package name */
        private final Method f144067b;

        public final Method a() {
            return this.f144067b;
        }

        public final Method b() {
            return this.f144066a;
        }

        public Cache(Method method, Method method2) {
            this.f144066a = method;
            this.f144067b = method2;
        }
    }

    public final Cache a(Member member) throws NoSuchMethodException, SecurityException {
        Intrinsics.j(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new Cache(cls.getMethod("getParameters", null), ReflectClassUtilKt.j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new Cache(null, null);
        }
    }

    public final List<String> b(Member member) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method methodA;
        Intrinsics.j(member, "member");
        Cache cacheA = f144065b;
        if (cacheA == null) {
            synchronized (this) {
                cacheA = f144065b;
                if (cacheA == null) {
                    cacheA = f144064a.a(member);
                    f144065b = cacheA;
                }
            }
        }
        Method methodB = cacheA.b();
        if (methodB == null || (methodA = cacheA.a()) == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(member, null);
        Intrinsics.h(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodA.invoke(obj, null);
            Intrinsics.h(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }

    private Java8ParameterNamesLoader() {
    }
}
