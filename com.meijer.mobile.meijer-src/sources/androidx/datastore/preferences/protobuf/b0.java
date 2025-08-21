package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
final class b0 {

    /* renamed from: c, reason: collision with root package name */
    private static final b0 f54438c = new b0();

    /* renamed from: d, reason: collision with root package name */
    static boolean f54439d = false;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap<Class<?>, f0<?>> f54441b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final g0 f54440a = new H();

    public static b0 a() {
        return f54438c;
    }

    public f0<?> b(Class<?> cls, f0<?> f0Var) {
        C6100y.b(cls, "messageType");
        C6100y.b(f0Var, "schema");
        return this.f54441b.putIfAbsent(cls, f0Var);
    }

    public <T> f0<T> c(Class<T> cls) {
        C6100y.b(cls, "messageType");
        f0<T> f0VarA = (f0) this.f54441b.get(cls);
        if (f0VarA == null) {
            f0VarA = this.f54440a.a(cls);
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
