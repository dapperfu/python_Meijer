package vb;

import cc.InterfaceC6500a;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.C15929a;

/* loaded from: classes4.dex */
public class m implements Wa.b {

    /* renamed from: m, reason: collision with root package name */
    private static final C13784a f165757m = C13785b.a(m.class.getName());

    /* renamed from: n, reason: collision with root package name */
    static final C13786c f165758n = C13787d.a(m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private kc.e f165759a;

    /* renamed from: b, reason: collision with root package name */
    final ec.f f165760b;

    /* renamed from: c, reason: collision with root package name */
    private Db.b f165761c;

    /* renamed from: d, reason: collision with root package name */
    private Nb.g f165762d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f165763e;

    /* renamed from: f, reason: collision with root package name */
    private s f165764f;

    /* renamed from: g, reason: collision with root package name */
    fc.c f165765g;

    /* renamed from: h, reason: collision with root package name */
    boolean f165766h;

    /* renamed from: i, reason: collision with root package name */
    long f165767i;

    /* renamed from: j, reason: collision with root package name */
    public AtomicBoolean f165768j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public Tb.c f165769k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC6500a f165770l;

    @Override // Wa.b
    public final void a() {
        this.f165766h = false;
        this.f165767i = this.f165764f.a().longValue();
        if (this.f165768j.get()) {
            f165758n.a("Changed default foreground departure interval for iBeacons to {} secs", Long.valueOf(this.f165767i));
        }
    }

    final void b(List<C15929a> list) {
        for (C15929a c15929a : list) {
            Tb.c cVar = this.f165769k;
            if (cVar != null) {
                cVar.d(c15929a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(vb.b r10, nc.C15931c r11) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.m.c(vb.b, nc.c):void");
    }

    public m(ec.f fVar, Db.e eVar, Nb.g gVar, kc.e eVar2, Db.b bVar, s sVar, fc.c cVar, InterfaceC6500a interfaceC6500a) {
        this.f165760b = fVar;
        this.f165762d = gVar;
        this.f165759a = eVar2;
        this.f165761c = bVar;
        this.f165764f = sVar;
        this.f165765g = cVar;
        this.f165763e = eVar.f();
        this.f165770l = interfaceC6500a;
    }

    @Override // Wa.b
    public final void b() {
        this.f165766h = true;
        this.f165767i = this.f165764f.c().longValue();
        if (this.f165768j.get()) {
            f165758n.a("Changed default background departure interval for iBeacons to {} secs", Long.valueOf(this.f165767i));
        }
    }
}
