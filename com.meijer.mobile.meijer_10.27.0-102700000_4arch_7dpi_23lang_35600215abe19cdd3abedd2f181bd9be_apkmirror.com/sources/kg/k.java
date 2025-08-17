package kg;

import jg.InterfaceC14891b;
import kv.InterfaceC15323a;

/* loaded from: classes7.dex */
public final class k implements InterfaceC14891b<j> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC15323a<o> f141903a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC15323a<o> f141904b;

    public static k a(InterfaceC15323a<o> interfaceC15323a, InterfaceC15323a<o> interfaceC15323a2) {
        return new k(interfaceC15323a, interfaceC15323a2);
    }

    public static j c(o oVar, o oVar2) {
        return new j(oVar, oVar2);
    }

    @Override // kv.InterfaceC15323a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f141903a.get(), this.f141904b.get());
    }

    public k(InterfaceC15323a<o> interfaceC15323a, InterfaceC15323a<o> interfaceC15323a2) {
        this.f141903a = interfaceC15323a;
        this.f141904b = interfaceC15323a2;
    }
}
