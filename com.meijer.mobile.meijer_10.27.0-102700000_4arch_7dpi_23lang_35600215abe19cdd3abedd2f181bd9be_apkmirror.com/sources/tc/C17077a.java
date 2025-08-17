package tc;

import kv.InterfaceC15323a;

/* renamed from: tc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17077a<T> implements InterfaceC15323a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f161614c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC15323a<T> f161615a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f161616b = f161614c;

    private static Object b(Object obj, Object obj2) {
        if (obj == f161614c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // kv.InterfaceC15323a
    public T get() {
        T t10;
        T t11 = (T) this.f161616b;
        Object obj = f161614c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f161616b;
                if (t10 == obj) {
                    t10 = this.f161615a.get();
                    this.f161616b = b(this.f161616b, t10);
                    this.f161615a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    private C17077a(InterfaceC15323a<T> interfaceC15323a) {
        this.f161615a = interfaceC15323a;
    }

    public static <P extends InterfaceC15323a<T>, T> InterfaceC15323a<T> a(P p10) {
        C17080d.b(p10);
        if (p10 instanceof C17077a) {
            return p10;
        }
        return new C17077a(p10);
    }
}
