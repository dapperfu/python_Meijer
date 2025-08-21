package lg;

/* renamed from: lg.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15489a<T> implements e<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f149600c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile e<T> f149601a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f149602b = f149600c;

    private static Object b(Object obj, Object obj2) {
        if (obj == f149600c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // gv.InterfaceC14411a
    public T get() {
        T t10;
        T t11 = (T) this.f149602b;
        Object obj = f149600c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f149602b;
                if (t10 == obj) {
                    t10 = this.f149601a.get();
                    this.f149602b = b(this.f149602b, t10);
                    this.f149601a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    private C15489a(e<T> eVar) {
        this.f149601a = eVar;
    }

    public static <P extends e<T>, T> e<T> a(P p10) {
        d.b(p10);
        if (p10 instanceof C15489a) {
            return p10;
        }
        return new C15489a(p10);
    }
}
