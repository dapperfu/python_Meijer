package d7;

/* loaded from: classes4.dex */
public class j<T> implements X6.c<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final T f127291a;

    @Override // X6.c
    public void a() {
    }

    @Override // X6.c
    public final int getSize() {
        return 1;
    }

    @Override // X6.c
    public Class<T> c() {
        return (Class<T>) this.f127291a.getClass();
    }

    @Override // X6.c
    public final T get() {
        return this.f127291a;
    }

    public j(T t10) {
        this.f127291a = (T) p7.k.d(t10);
    }
}
