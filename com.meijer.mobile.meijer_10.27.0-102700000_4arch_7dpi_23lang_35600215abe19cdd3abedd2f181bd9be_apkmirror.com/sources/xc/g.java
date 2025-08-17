package xc;

import kv.InterfaceC15323a;
import tc.C17080d;
import tc.InterfaceC17078b;

/* loaded from: classes4.dex */
public final class g implements InterfaceC17078b<yc.f> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<Bc.a> f169550a;

    public static g b(InterfaceC15323a<Bc.a> interfaceC15323a) {
        return new g(interfaceC15323a);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public yc.f get() {
        return a(this.f169550a.get());
    }

    public g(InterfaceC15323a<Bc.a> interfaceC15323a) {
        this.f169550a = interfaceC15323a;
    }

    public static yc.f a(Bc.a aVar) {
        return (yc.f) C17080d.d(f.a(aVar));
    }
}
