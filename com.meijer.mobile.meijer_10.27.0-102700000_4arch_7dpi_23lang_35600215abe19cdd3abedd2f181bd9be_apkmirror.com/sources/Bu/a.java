package Bu;

import kv.InterfaceC15323a;

/* loaded from: classes11.dex */
public final class a<T> implements d<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f3263c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile d<T> f3264a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f3265b = f3263c;

    private synchronized Object a() {
        Object obj;
        obj = this.f3265b;
        if (obj == f3263c) {
            obj = this.f3264a.get();
            this.f3265b = d(this.f3265b, obj);
            this.f3264a = null;
        }
        return obj;
    }

    private static Object d(Object obj, Object obj2) {
        if (obj == f3263c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // kv.InterfaceC15323a
    public T get() {
        T t10 = (T) this.f3265b;
        return t10 == f3263c ? (T) a() : t10;
    }

    private a(d<T> dVar) {
        this.f3264a = dVar;
    }

    public static <T> d<T> b(d<T> dVar) {
        c.b(dVar);
        if (dVar instanceof a) {
            return dVar;
        }
        return new a(dVar);
    }

    @Deprecated
    public static <P extends InterfaceC15323a<T>, T> InterfaceC15323a<T> c(P p10) {
        return b(e.a(p10));
    }
}
