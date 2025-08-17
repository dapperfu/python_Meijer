package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes7.dex */
final class b0 {

    /* renamed from: c, reason: collision with root package name */
    private static final b0 f90487c = new b0();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, f0<?>> f90489b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final g0 f90488a = new H();

    public static b0 a() {
        return f90487c;
    }

    public f0<?> b(Class<?> cls, f0<?> f0Var) {
        C11538y.b(cls, "messageType");
        C11538y.b(f0Var, "schema");
        return this.f90489b.putIfAbsent(cls, f0Var);
    }

    public <T> f0<T> c(Class<T> cls) {
        C11538y.b(cls, "messageType");
        f0<T> f0VarA = (f0) this.f90489b.get(cls);
        if (f0VarA == null) {
            f0VarA = this.f90488a.a(cls);
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
