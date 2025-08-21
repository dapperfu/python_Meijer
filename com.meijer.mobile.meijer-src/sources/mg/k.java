package mg;

import gv.InterfaceC14411a;
import lg.InterfaceC15490b;

/* loaded from: classes8.dex */
public final class k implements InterfaceC15490b<j> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14411a<o> f151049a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC14411a<o> f151050b;

    public static k a(InterfaceC14411a<o> interfaceC14411a, InterfaceC14411a<o> interfaceC14411a2) {
        return new k(interfaceC14411a, interfaceC14411a2);
    }

    public static j c(o oVar, o oVar2) {
        return new j(oVar, oVar2);
    }

    @Override // gv.InterfaceC14411a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c(this.f151049a.get(), this.f151050b.get());
    }

    public k(InterfaceC14411a<o> interfaceC14411a, InterfaceC14411a<o> interfaceC14411a2) {
        this.f151049a = interfaceC14411a;
        this.f151050b = interfaceC14411a2;
    }
}
