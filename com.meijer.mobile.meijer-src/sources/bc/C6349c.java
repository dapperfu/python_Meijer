package bc;

import java.util.List;

/* renamed from: bc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6349c<T> implements InterfaceC6352f<T> {

    /* renamed from: a, reason: collision with root package name */
    private int f60249a;

    /* renamed from: b, reason: collision with root package name */
    private C6353g<T> f60250b;

    public C6349c(String str) {
        this.f60249a = 0;
        this.f60250b = new C6353g<>(str);
    }

    @Override // bc.InterfaceC6352f
    public final void a(String str, T t10) {
        C6353g<T> c6353g = this.f60250b;
        int i10 = this.f60249a;
        if (i10 > 0 && c6353g != null && c6353g.b() >= i10) {
            c6353g.a();
        }
        this.f60250b = c6353g;
        c6353g.a(str, t10);
    }

    @Override // bc.InterfaceC6352f
    public final int b() {
        return this.f60250b.b();
    }

    @Override // bc.InterfaceC6352f
    public final T b(String str, Class<T> cls) {
        return this.f60250b.b(str, cls);
    }

    @Override // bc.InterfaceC6352f
    public final List<T> c(Class<T> cls) {
        return this.f60250b.c(cls);
    }

    public C6349c(String str, int i10) {
        this.f60249a = i10;
        this.f60250b = new C6353g<>(str);
    }

    @Override // bc.InterfaceC6352f
    public final void a(String str) {
        this.f60250b.a(str);
    }

    @Override // bc.InterfaceC6352f
    public final void a() {
        this.f60250b.a();
    }
}
