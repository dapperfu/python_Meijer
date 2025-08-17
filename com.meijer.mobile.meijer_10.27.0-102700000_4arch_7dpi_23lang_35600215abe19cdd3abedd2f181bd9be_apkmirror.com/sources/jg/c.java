package jg;

/* loaded from: classes7.dex */
public final class c<T> implements InterfaceC14891b<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final c<Object> f139589b = new c<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f139590a;

    public static <T> InterfaceC14891b<T> a(T t10) {
        return new c(d.c(t10, "instance cannot be null"));
    }

    @Override // kv.InterfaceC15323a
    public T get() {
        return this.f139590a;
    }

    private c(T t10) {
        this.f139590a = t10;
    }
}
