package db;

import Bb.e;
import Bb.k;
import Lb.s;
import Vb.g;
import Vb.j;
import Vb.n;
import Vb.p;
import Yb.b;
import ac.InterfaceC5594a;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import cc.f;
import dc.c;
import dc.d;
import ec.C13641b;
import ec.InterfaceC13640a;
import fb.C13864a;
import fb.C13865b;
import ib.C14712a;
import ic.C14714b;
import ic.C14716d;
import ic.i;
import java.util.HashMap;
import java.util.Map;
import ob.C16010a;
import tb.l;
import tb.m;
import tb.o;
import tb.q;
import tb.r;

/* renamed from: db.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13501a implements k {

    /* renamed from: B, reason: collision with root package name */
    private static Context f127303B;

    /* renamed from: C, reason: collision with root package name */
    public static Application f127304C;

    /* renamed from: D, reason: collision with root package name */
    private static C13501a f127305D;

    /* renamed from: a, reason: collision with root package name */
    private b f127307a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC13640a f127308b;

    /* renamed from: c, reason: collision with root package name */
    public j f127309c;

    /* renamed from: d, reason: collision with root package name */
    public C14714b f127310d;

    /* renamed from: e, reason: collision with root package name */
    private Hb.a f127311e;

    /* renamed from: f, reason: collision with root package name */
    private e f127312f;

    /* renamed from: g, reason: collision with root package name */
    private Bb.b f127313g;

    /* renamed from: h, reason: collision with root package name */
    private C13865b f127314h;

    /* renamed from: i, reason: collision with root package name */
    public Vb.b f127315i;

    /* renamed from: j, reason: collision with root package name */
    public d f127316j;

    /* renamed from: k, reason: collision with root package name */
    private C14716d f127317k;

    /* renamed from: l, reason: collision with root package name */
    public C13864a f127318l;

    /* renamed from: m, reason: collision with root package name */
    private p f127319m;

    /* renamed from: n, reason: collision with root package name */
    private Vb.a f127320n;

    /* renamed from: o, reason: collision with root package name */
    private s f127321o;

    /* renamed from: p, reason: collision with root package name */
    public C16010a f127322p;

    /* renamed from: q, reason: collision with root package name */
    private cc.e f127323q;

    /* renamed from: r, reason: collision with root package name */
    private Map<String, String> f127324r;

    /* renamed from: s, reason: collision with root package name */
    private C14712a f127325s;

    /* renamed from: t, reason: collision with root package name */
    public Ua.a f127326t;

    /* renamed from: u, reason: collision with root package name */
    private tb.e f127327u;

    /* renamed from: v, reason: collision with root package name */
    private o f127328v;

    /* renamed from: w, reason: collision with root package name */
    public m f127329w;

    /* renamed from: x, reason: collision with root package name */
    private q f127330x;

    /* renamed from: y, reason: collision with root package name */
    public tb.k f127331y;

    /* renamed from: z, reason: collision with root package name */
    private static final C6380a f127306z = C6381b.a(C13501a.class.getName());

    /* renamed from: A, reason: collision with root package name */
    private static final C6382c f127302A = C6383d.a(C13501a.class.getName());

    private j b(p pVar, Vb.a aVar, C14712a c14712a) {
        Class cls = this.f127321o.b(this.f127313g.l()) ? Vb.m.class : g.class;
        return cls == g.class ? new g(aVar, pVar, i.c(), c14712a, this.f127327u) : cls == Vb.m.class ? new Vb.m(aVar, pVar, i.c(), c14712a, this.f127327u, this.f127314h.f130876e, this.f127330x) : new n(aVar, pVar, i.c(), c14712a, this.f127327u);
    }

    public static C13501a c() {
        if (f127303B == null) {
            throw new RuntimeException("Android context not initialized yet. Call setApiKey before calling any other method.");
        }
        C13501a c13501a = f127305D;
        if (c13501a != null) {
            return c13501a;
        }
        throw new RuntimeException("Processor factory initializeApplicationContext not called.");
    }

    public static void d(Application application) {
        if (f127305D == null) {
            f127304C = application;
            f127303B = application.getApplicationContext();
            C13501a c13501a = new C13501a();
            f127305D = c13501a;
            C13865b c13865bA = C13865b.a();
            c13501a.f127314h = c13865bA;
            c13501a.f127312f = c13865bA.f130874c;
            c13501a.f127313g = c13865bA.f130876e;
            c13501a.f127325s = c13865bA.f130867J;
            c13501a.f127321o = c13865bA.f130861D;
            Ub.a.a(f127303B.getApplicationContext());
            C13865b c13865b = c13501a.f127314h;
            c13501a.f127311e = c13865b.f130879h;
            c13501a.f127327u = new tb.e(c13865b.f130876e);
            c13501a.f127308b = new C13641b(c13501a.f127314h.f130865H, c13501a.f127311e, Tb.a.a(), c13501a.f127314h.f130874c, f127303B.getPackageName(), c13501a.f127314h.f130887p);
            Xb.a.a();
            InterfaceC5594a interfaceC5594aA = ac.b.a(c13501a.f127325s, c13501a.f127314h.f130862E);
            c13501a.f127322p = new C16010a(c13501a.f127314h.f130860C, c13501a.f127312f, c13501a.f127313g);
            c13501a.f127323q = new cc.e();
            c13501a.f127324r = new HashMap();
            Vb.b bVar = new Vb.b(c13501a.f127312f, f127303B);
            c13501a.f127315i = bVar;
            bVar.c();
            C14716d c14716d = new C14716d(c13501a.f127323q, c13501a.f127324r);
            c13501a.f127317k = c14716d;
            c13501a.f127315i.e(c14716d);
            f fVar = Xb.a.a().f39187a;
            c cVar = new c();
            Lb.g gVar = c13501a.f127314h.f130860C;
            Za.b bVar2 = C13865b.a().f130872a;
            ic.f fVar2 = new ic.f(bVar2, c13501a.f127313g);
            c13501a.f127316j = new d(fVar, c13501a.f127317k, c13501a.f127313g, c13501a.f127312f, gVar, c13501a.f127324r, cVar, fVar2);
            c13501a.f127310d = new C14714b(c13501a.f127308b, f127303B, interfaceC5594aA, c13501a.f127312f, c13501a.f127313g, c13501a.f127317k);
            c13501a.f127329w = new m(fVar, c13501a.f127312f, gVar, fVar2, c13501a.f127313g, new tb.s(c13501a.f127313g), cVar, interfaceC5594aA);
            r rVar = new r(bVar2);
            c13501a.f127331y = new tb.k(c13501a.f127308b, c13501a.f127314h.f130874c, c13501a.f127313g, interfaceC5594aA, new tb.i(c13501a.f127313g));
            c13501a.f127330x = new q(c13501a.f127314h.f130876e, bVar2, rVar);
            tb.p pVar = new tb.p(c13501a.f127329w, c13501a.f127308b, new tb.f(), new tb.g(), c13501a.f127330x, c13501a.f127331y);
            c13501a.f127328v = pVar;
            c13501a.f127319m = new Vb.q(c13501a.f127310d, pVar);
            Vb.a aVar = Xb.a.a().f39189c;
            c13501a.f127320n = aVar;
            j jVarB = c13501a.b(c13501a.f127319m, aVar, c13501a.f127325s);
            c13501a.f127309c = jVarB;
            c13501a.f127317k.c(jVarB);
            b bVar3 = new b(c13501a, c13501a.f127310d, c13501a.f127314h);
            d dVar = bVar3.f40234b.f127316j;
            dc.b bVar4 = new dc.b(bVar3.f40238f, bVar3.f40239g, dVar, "gimbalVisitCloseJob");
            bVar3.f40236d = bVar4;
            dVar.f127339b.add(bVar4);
            bVar3.f40236d = bVar3.f40236d;
            bVar3.f40241i = new l(bVar3.f40238f, bVar3.f40239g, bVar3.f40234b.f127329w, "ibeaconVisitCloseJob");
            bVar3.f40237e = new ic.o(bVar3.f40238f, bVar3.f40239g, bVar3.f40235c, bVar3.f40240h);
            bVar3.f40242j = new tb.j(bVar3.f40238f, bVar3.f40239g, bVar3.f40234b.f127331y, bVar3.f40240h);
            bVar3.f40233a.c(bVar3.f40236d);
            bVar3.f40233a.c(bVar3.f40241i);
            bVar3.f40233a.c(bVar3.f40237e);
            bVar3.f40233a.c(bVar3.f40242j);
            c13501a.f127307a = bVar3;
            c13501a.f127331y.f161568e = bVar3.f40242j;
            c13501a.f127310d.f137676d = bVar3.f40237e;
            C13864a c13864a = new C13864a(c13501a.f127317k, C13865b.a().f130872a, c13501a.f127312f, c13501a.f127313g);
            c13501a.f127318l = c13864a;
            c13864a.c();
            c13501a.f127313g.g(c13501a, "allowKitKat");
            c13501a.f127312f.h(c13501a, "Api_Key", "Location_Permission");
            c13501a.a("Api_Key", c13501a.f127312f.g());
            Context context = f127303B;
            Intent intent = new Intent(context.getPackageName());
            intent.setPackage(context.getPackageName());
            context.startService(intent);
            f127302A.e("Proxmity Service started by {}", context.getPackageName());
        }
    }

    private void e() {
        j jVarB = b(this.f127319m, this.f127320n, this.f127325s);
        if (this.f127321o.c()) {
            Ua.a aVarA = Ua.a.a();
            aVarA.f35862d.remove(this.f127309c);
        }
        this.f127309c = jVarB;
        this.f127317k.c(jVarB);
        if (this.f127321o.c()) {
            Ua.a.a().c(this.f127309c);
        }
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if ("allowKitKat".equals(str)) {
            e();
        } else if ("Location_Permission".equals(str) && ((Boolean) obj).booleanValue()) {
            e();
        }
    }

    private C13501a() {
    }
}
