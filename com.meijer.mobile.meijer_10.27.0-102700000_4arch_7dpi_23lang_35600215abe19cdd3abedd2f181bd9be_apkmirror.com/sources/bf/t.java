package bf;

/* loaded from: classes7.dex */
public class t<T> implements If.b<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f60203c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f60204a = f60203c;

    /* renamed from: b, reason: collision with root package name */
    private volatile If.b<T> f60205b;

    @Override // If.b
    public T get() {
        T t10;
        T t11 = (T) this.f60204a;
        Object obj = f60203c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f60204a;
                if (t10 == obj) {
                    t10 = this.f60205b.get();
                    this.f60204a = t10;
                    this.f60205b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    public t(If.b<T> bVar) {
        this.f60205b = bVar;
    }
}
