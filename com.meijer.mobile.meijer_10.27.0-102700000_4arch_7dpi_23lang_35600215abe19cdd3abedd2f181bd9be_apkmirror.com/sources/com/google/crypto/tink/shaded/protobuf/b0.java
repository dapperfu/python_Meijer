package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes7.dex */
final class b0 {

    /* renamed from: c, reason: collision with root package name */
    private static final b0 f88317c = new b0();

    /* renamed from: d, reason: collision with root package name */
    static boolean f88318d = false;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, f0<?>> f88320b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final g0 f88319a = new I();

    public static b0 a() {
        return f88317c;
    }

    public f0<?> b(Class<?> cls, f0<?> f0Var) {
        C11329z.b(cls, "messageType");
        C11329z.b(f0Var, "schema");
        return this.f88320b.putIfAbsent(cls, f0Var);
    }

    public <T> f0<T> c(Class<T> cls) {
        C11329z.b(cls, "messageType");
        f0<T> f0VarA = (f0) this.f88320b.get(cls);
        if (f0VarA == null) {
            f0VarA = this.f88319a.a(cls);
            f0<T> f0Var = (f0<T>) b(cls, f0VarA);
            if (f0Var != null) {
                return f0Var;
            }
        }
        return f0VarA;
    }

    private b0() {
    }

    public <T> f0<T> d(T t10) {
        return c(t10.getClass());
    }
}
