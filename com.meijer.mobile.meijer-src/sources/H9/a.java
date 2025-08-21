package H9;

/* loaded from: classes4.dex */
public abstract class a<T, S> implements i<T, S> {

    /* renamed from: a, reason: collision with root package name */
    private final S f13440a;

    /* renamed from: b, reason: collision with root package name */
    private T f13441b;

    @Override // H9.l
    public void remove() {
        this.f13441b = null;
        a(this.f13440a);
    }

    @Override // H9.l
    public T get() {
        T tB = this.f13441b;
        if (tB == null) {
            tB = b(this.f13440a);
        }
        this.f13441b = tB;
        return tB;
    }

    @Override // H9.l
    public void set(T t10) {
        this.f13441b = t10;
        c(this.f13440a, t10);
    }

    public a(S s10) {
        I9.b.c(s10, "Store must not be null!");
        this.f13440a = s10;
    }
}
