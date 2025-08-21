package w6;

import k6.AbstractC15093a;

/* renamed from: w6.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17847c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final C17846b<T> f166967a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC15093a<?, ?> f166968b;

    /* renamed from: c, reason: collision with root package name */
    protected T f166969c;

    public C17847c() {
        this.f166967a = new C17846b<>();
        this.f166969c = null;
    }

    public T a(C17846b<T> c17846b) {
        return this.f166969c;
    }

    public final T b(float f10, float f11, T t10, T t11, float f12, float f13, float f14) {
        return a(this.f166967a.h(f10, f11, t10, t11, f12, f13, f14));
    }

    public final void c(AbstractC15093a<?, ?> abstractC15093a) {
        this.f166968b = abstractC15093a;
    }

    public C17847c(T t10) {
        this.f166967a = new C17846b<>();
        this.f166969c = t10;
    }
}
