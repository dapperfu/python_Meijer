package vc;

/* renamed from: vc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17654c<T> implements InterfaceC17653b<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final C17654c<Object> f165795b = new C17654c<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f165796a;

    public static <T> InterfaceC17653b<T> a(T t10) {
        return new C17654c(C17655d.c(t10, "instance cannot be null"));
    }

    @Override // gv.InterfaceC14411a
    public T get() {
        return this.f165796a;
    }

    private C17654c(T t10) {
        this.f165796a = t10;
    }
}
