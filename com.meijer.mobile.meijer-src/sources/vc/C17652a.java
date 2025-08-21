package vc;

import gv.InterfaceC14411a;

/* renamed from: vc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17652a<T> implements InterfaceC14411a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f165792c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC14411a<T> f165793a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f165794b = f165792c;

    private static Object b(Object obj, Object obj2) {
        if (obj == f165792c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // gv.InterfaceC14411a
    public T get() {
        T t10;
        T t11 = (T) this.f165794b;
        Object obj = f165792c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f165794b;
                if (t10 == obj) {
                    t10 = this.f165793a.get();
                    this.f165794b = b(this.f165794b, t10);
                    this.f165793a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    private C17652a(InterfaceC14411a<T> interfaceC14411a) {
        this.f165793a = interfaceC14411a;
    }

    public static <P extends InterfaceC14411a<T>, T> InterfaceC14411a<T> a(P p10) {
        C17655d.b(p10);
        if (p10 instanceof C17652a) {
            return p10;
        }
        return new C17652a(p10);
    }
}
