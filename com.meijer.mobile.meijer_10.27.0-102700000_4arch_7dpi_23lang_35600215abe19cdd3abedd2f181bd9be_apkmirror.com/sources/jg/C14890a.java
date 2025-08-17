package jg;

/* renamed from: jg.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14890a<T> implements e<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f139586c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile e<T> f139587a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f139588b = f139586c;

    private static Object b(Object obj, Object obj2) {
        if (obj == f139586c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // kv.InterfaceC15323a
    public T get() {
        T t10;
        T t11 = (T) this.f139588b;
        Object obj = f139586c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f139588b;
                if (t10 == obj) {
                    t10 = this.f139587a.get();
                    this.f139588b = b(this.f139588b, t10);
                    this.f139587a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    private C14890a(e<T> eVar) {
        this.f139587a = eVar;
    }

    public static <P extends e<T>, T> e<T> a(P p10) {
        d.b(p10);
        if (p10 instanceof C14890a) {
            return p10;
        }
        return new C14890a(p10);
    }
}
