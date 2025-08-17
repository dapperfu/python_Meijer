package F9;

/* loaded from: classes4.dex */
public abstract class a<T, S> implements i<T, S> {

    /* renamed from: a, reason: collision with root package name */
    private final S f10313a;

    /* renamed from: b, reason: collision with root package name */
    private T f10314b;

    @Override // F9.l
    public void remove() {
        this.f10314b = null;
        a(this.f10313a);
    }

    @Override // F9.l
    public T get() {
        T tB = this.f10314b;
        if (tB == null) {
            tB = b(this.f10313a);
        }
        this.f10314b = tB;
        return tB;
    }

    @Override // F9.l
    public void set(T t10) {
        this.f10314b = t10;
        c(this.f10313a, t10);
    }

    public a(S s10) {
        G9.b.c(s10, "Store must not be null!");
        this.f10313a = s10;
    }
}
