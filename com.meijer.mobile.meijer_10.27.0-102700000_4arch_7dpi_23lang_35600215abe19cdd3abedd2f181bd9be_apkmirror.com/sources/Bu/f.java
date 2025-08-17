package Bu;

/* loaded from: classes11.dex */
public final class f<T> implements d<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f3268c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile d<T> f3269a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f3270b = f3268c;

    public static <T> d<T> a(d<T> dVar) {
        return ((dVar instanceof f) || (dVar instanceof a)) ? dVar : new f((d) c.b(dVar));
    }

    @Override // kv.InterfaceC15323a
    public T get() {
        T t10 = (T) this.f3270b;
        if (t10 != f3268c) {
            return t10;
        }
        d<T> dVar = this.f3269a;
        if (dVar == null) {
            return (T) this.f3270b;
        }
        T t11 = dVar.get();
        this.f3270b = t11;
        this.f3269a = null;
        return t11;
    }

    private f(d<T> dVar) {
        this.f3269a = dVar;
    }
}
