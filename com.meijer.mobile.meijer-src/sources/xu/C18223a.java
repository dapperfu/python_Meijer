package xu;

import gv.InterfaceC14411a;

/* renamed from: xu.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18223a<T> implements InterfaceC18226d<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f171027c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC18226d<T> f171028a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f171029b = f171027c;

    private synchronized Object a() {
        Object obj;
        obj = this.f171029b;
        if (obj == f171027c) {
            obj = this.f171028a.get();
            this.f171029b = d(this.f171029b, obj);
            this.f171028a = null;
        }
        return obj;
    }

    private static Object d(Object obj, Object obj2) {
        if (obj == f171027c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // gv.InterfaceC14411a
    public T get() {
        T t10 = (T) this.f171029b;
        return t10 == f171027c ? (T) a() : t10;
    }

    private C18223a(InterfaceC18226d<T> interfaceC18226d) {
        this.f171028a = interfaceC18226d;
    }

    @Deprecated
    public static <P extends InterfaceC14411a<T>, T> InterfaceC14411a<T> b(P p10) {
        return c(C18227e.a(p10));
    }

    public static <T> InterfaceC18226d<T> c(InterfaceC18226d<T> interfaceC18226d) {
        C18225c.b(interfaceC18226d);
        if (interfaceC18226d instanceof C18223a) {
            return interfaceC18226d;
        }
        return new C18223a(interfaceC18226d);
    }
}
