package Zb;

import java.util.List;

/* loaded from: classes4.dex */
public final class c<T> implements f<T> {

    /* renamed from: a, reason: collision with root package name */
    private int f42582a;

    /* renamed from: b, reason: collision with root package name */
    private g<T> f42583b;

    public c(String str) {
        this.f42582a = 0;
        this.f42583b = new g<>(str);
    }

    @Override // Zb.f
    public final void a(String str, T t10) {
        g<T> gVar = this.f42583b;
        int i10 = this.f42582a;
        if (i10 > 0 && gVar != null && gVar.b() >= i10) {
            gVar.a();
        }
        this.f42583b = gVar;
        gVar.a(str, t10);
    }

    @Override // Zb.f
    public final int b() {
        return this.f42583b.b();
    }

    @Override // Zb.f
    public final T b(String str, Class<T> cls) {
        return this.f42583b.b(str, cls);
    }

    @Override // Zb.f
    public final List<T> c(Class<T> cls) {
        return this.f42583b.c(cls);
    }

    public c(String str, int i10) {
        this.f42582a = i10;
        this.f42583b = new g<>(str);
    }

    @Override // Zb.f
    public final void a(String str) {
        this.f42583b.a(str);
    }

    @Override // Zb.f
    public final void a() {
        this.f42583b.a();
    }
}
