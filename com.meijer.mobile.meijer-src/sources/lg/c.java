package lg;

/* loaded from: classes8.dex */
public final class c<T> implements InterfaceC15490b<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final c<Object> f149603b = new c<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f149604a;

    public static <T> InterfaceC15490b<T> a(T t10) {
        return new c(d.c(t10, "instance cannot be null"));
    }

    @Override // gv.InterfaceC14411a
    public T get() {
        return this.f149604a;
    }

    private c(T t10) {
        this.f149604a = t10;
    }
}
