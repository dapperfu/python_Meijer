package v6;

import j6.AbstractC14861a;

/* renamed from: v6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17514c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final C17513b<T> f164583a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC14861a<?, ?> f164584b;

    /* renamed from: c, reason: collision with root package name */
    protected T f164585c;

    public C17514c() {
        this.f164583a = new C17513b<>();
        this.f164585c = null;
    }

    public T a(C17513b<T> c17513b) {
        return this.f164585c;
    }

    public final T b(float f10, float f11, T t10, T t11, float f12, float f13, float f14) {
        return a(this.f164583a.h(f10, f11, t10, t11, f12, f13, f14));
    }

    public final void c(AbstractC14861a<?, ?> abstractC14861a) {
        this.f164584b = abstractC14861a;
    }

    public C17514c(T t10) {
        this.f164583a = new C17513b<>();
        this.f164585c = t10;
    }
}
