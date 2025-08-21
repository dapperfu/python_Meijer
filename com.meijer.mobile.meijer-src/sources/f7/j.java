package f7;

/* loaded from: classes4.dex */
public class j<T> implements Z6.c<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final T f131620a;

    @Override // Z6.c
    public void a() {
    }

    @Override // Z6.c
    public final int getSize() {
        return 1;
    }

    @Override // Z6.c
    public Class<T> c() {
        return (Class<T>) this.f131620a.getClass();
    }

    @Override // Z6.c
    public final T get() {
        return this.f131620a;
    }

    public j(T t10) {
        this.f131620a = (T) r7.k.d(t10);
    }
}
