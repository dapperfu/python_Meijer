package Zf;

import pc.AbstractC16280d;
import pc.C16279c;
import pc.InterfaceC16284h;
import pc.InterfaceC16285i;
import pc.InterfaceC16286j;

/* loaded from: classes7.dex */
final class b {

    /* renamed from: d, reason: collision with root package name */
    private static final Uf.a f42648d = Uf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final String f42649a;

    /* renamed from: b, reason: collision with root package name */
    private final If.b<InterfaceC16286j> f42650b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC16285i<bg.i> f42651c;

    private boolean a() {
        if (this.f42651c == null) {
            InterfaceC16286j interfaceC16286j = this.f42650b.get();
            if (interfaceC16286j != null) {
                this.f42651c = interfaceC16286j.a(this.f42649a, bg.i.class, C16279c.b("proto"), new InterfaceC16284h() { // from class: Zf.a
                    @Override // pc.InterfaceC16284h
                    public final Object apply(Object obj) {
                        return ((bg.i) obj).v();
                    }
                });
            } else {
                f42648d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f42651c != null;
    }

    b(If.b<InterfaceC16286j> bVar, String str) {
        this.f42649a = str;
        this.f42650b = bVar;
    }

    public void b(bg.i iVar) {
        if (!a()) {
            f42648d.j("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f42651c.a(AbstractC16280d.f(iVar));
        }
    }
}
