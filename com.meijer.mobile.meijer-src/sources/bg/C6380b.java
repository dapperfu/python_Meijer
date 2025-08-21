package bg;

import rc.AbstractC16884d;
import rc.C16883c;
import rc.InterfaceC16888h;
import rc.InterfaceC16889i;
import rc.InterfaceC16890j;

/* renamed from: bg.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6380b {

    /* renamed from: d, reason: collision with root package name */
    private static final Wf.a f60315d = Wf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final String f60316a;

    /* renamed from: b, reason: collision with root package name */
    private final Kf.b<InterfaceC16890j> f60317b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC16889i<dg.i> f60318c;

    private boolean a() {
        if (this.f60318c == null) {
            InterfaceC16890j interfaceC16890j = this.f60317b.get();
            if (interfaceC16890j != null) {
                this.f60318c = interfaceC16890j.a(this.f60316a, dg.i.class, C16883c.b("proto"), new InterfaceC16888h() { // from class: bg.a
                    @Override // rc.InterfaceC16888h
                    public final Object apply(Object obj) {
                        return ((dg.i) obj).v();
                    }
                });
            } else {
                f60315d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f60318c != null;
    }

    C6380b(Kf.b<InterfaceC16890j> bVar, String str) {
        this.f60316a = str;
        this.f60317b = bVar;
    }

    public void b(dg.i iVar) {
        if (!a()) {
            f60315d.j("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f60318c.b(AbstractC16884d.f(iVar));
        }
    }
}
