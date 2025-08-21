package df;

/* loaded from: classes8.dex */
public class t<T> implements Kf.b<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f128438c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f128439a = f128438c;

    /* renamed from: b, reason: collision with root package name */
    private volatile Kf.b<T> f128440b;

    @Override // Kf.b
    public T get() {
        T t10;
        T t11 = (T) this.f128439a;
        Object obj = f128438c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f128439a;
                if (t10 == obj) {
                    t10 = this.f128440b.get();
                    this.f128439a = t10;
                    this.f128440b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public t(Kf.b<T> bVar) {
        this.f128440b = bVar;
    }
}
