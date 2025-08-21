package Vf;

import xu.C18225c;
import xu.InterfaceC18226d;

/* loaded from: classes8.dex */
public final class b implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final a f39898a;

    public static b a(a aVar) {
        return new b(aVar);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.google.firebase.perf.config.a get() {
        return c(this.f39898a);
    }

    public b(a aVar) {
        this.f39898a = aVar;
    }

    public static com.google.firebase.perf.config.a c(a aVar) {
        return (com.google.firebase.perf.config.a) C18225c.d(aVar.a());
    }
}
