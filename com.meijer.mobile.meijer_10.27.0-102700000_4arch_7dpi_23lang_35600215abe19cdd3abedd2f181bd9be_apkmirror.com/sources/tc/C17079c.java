package tc;

/* renamed from: tc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17079c<T> implements InterfaceC17078b<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final C17079c<Object> f161617b = new C17079c<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f161618a;

    public static <T> InterfaceC17078b<T> a(T t10) {
        return new C17079c(C17080d.c(t10, "instance cannot be null"));
    }

    @Override // kv.InterfaceC15323a
    public T get() {
        return this.f161618a;
    }

    private C17079c(T t10) {
        this.f161618a = t10;
    }
}
