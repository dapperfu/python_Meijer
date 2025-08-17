package tb;

import ac.InterfaceC5594a;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import lc.C15395a;

/* loaded from: classes4.dex */
public class m implements Ua.b {

    /* renamed from: m, reason: collision with root package name */
    private static final C6380a f161579m = C6381b.a(m.class.getName());

    /* renamed from: n, reason: collision with root package name */
    static final C6382c f161580n = C6383d.a(m.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private ic.e f161581a;

    /* renamed from: b, reason: collision with root package name */
    final cc.f f161582b;

    /* renamed from: c, reason: collision with root package name */
    private Bb.b f161583c;

    /* renamed from: d, reason: collision with root package name */
    private Lb.g f161584d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f161585e;

    /* renamed from: f, reason: collision with root package name */
    private s f161586f;

    /* renamed from: g, reason: collision with root package name */
    dc.c f161587g;

    /* renamed from: h, reason: collision with root package name */
    boolean f161588h;

    /* renamed from: i, reason: collision with root package name */
    long f161589i;

    /* renamed from: j, reason: collision with root package name */
    public AtomicBoolean f161590j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    public Rb.c f161591k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC5594a f161592l;

    @Override // Ua.b
    public final void a() {
        this.f161588h = false;
        this.f161589i = this.f161586f.a().longValue();
        if (this.f161590j.get()) {
            f161580n.a("Changed default foreground departure interval for iBeacons to {} secs", Long.valueOf(this.f161589i));
        }
    }

    final void b(List<C15395a> list) {
        for (C15395a c15395a : list) {
            Rb.c cVar = this.f161591k;
            if (cVar != null) {
                cVar.c(c15395a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(tb.b r10, lc.C15397c r11) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.m.c(tb.b, lc.c):void");
    }

    public m(cc.f fVar, Bb.e eVar, Lb.g gVar, ic.e eVar2, Bb.b bVar, s sVar, dc.c cVar, InterfaceC5594a interfaceC5594a) {
        this.f161582b = fVar;
        this.f161584d = gVar;
        this.f161581a = eVar2;
        this.f161583c = bVar;
        this.f161586f = sVar;
        this.f161587g = cVar;
        this.f161585e = eVar.f();
        this.f161592l = interfaceC5594a;
    }

    @Override // Ua.b
    public final void b() {
        this.f161588h = true;
        this.f161589i = this.f161586f.c().longValue();
        if (this.f161590j.get()) {
            f161580n.a("Changed default background departure interval for iBeacons to {} secs", Long.valueOf(this.f161589i));
        }
    }
}
