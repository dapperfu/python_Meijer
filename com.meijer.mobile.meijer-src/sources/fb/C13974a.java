package fb;

import Db.b;
import Db.e;
import Db.k;
import Nb.s;
import Xb.g;
import Xb.j;
import Xb.n;
import Xb.p;
import ac.C5680b;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import bb.C6345b;
import cc.InterfaceC6500a;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import ec.f;
import fc.c;
import fc.d;
import gc.C14345b;
import gc.InterfaceC14344a;
import hb.C14494a;
import hb.C14495b;
import java.util.HashMap;
import java.util.Map;
import kb.C15115a;
import kc.C15117b;
import kc.C15119d;
import kc.i;
import qb.C16618a;
import vb.l;
import vb.m;
import vb.o;
import vb.q;
import vb.r;

/* renamed from: fb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13974a implements k {

    /* renamed from: B, reason: collision with root package name */
    private static Context f131632B;

    /* renamed from: C, reason: collision with root package name */
    public static Application f131633C;

    /* renamed from: D, reason: collision with root package name */
    private static C13974a f131634D;

    /* renamed from: a, reason: collision with root package name */
    private C5680b f131636a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC14344a f131637b;

    /* renamed from: c, reason: collision with root package name */
    public j f131638c;

    /* renamed from: d, reason: collision with root package name */
    public C15117b f131639d;

    /* renamed from: e, reason: collision with root package name */
    private Jb.a f131640e;

    /* renamed from: f, reason: collision with root package name */
    private e f131641f;

    /* renamed from: g, reason: collision with root package name */
    private b f131642g;

    /* renamed from: h, reason: collision with root package name */
    private C14495b f131643h;

    /* renamed from: i, reason: collision with root package name */
    public Xb.b f131644i;

    /* renamed from: j, reason: collision with root package name */
    public d f131645j;

    /* renamed from: k, reason: collision with root package name */
    private C15119d f131646k;

    /* renamed from: l, reason: collision with root package name */
    public C14494a f131647l;

    /* renamed from: m, reason: collision with root package name */
    private p f131648m;

    /* renamed from: n, reason: collision with root package name */
    private Xb.a f131649n;

    /* renamed from: o, reason: collision with root package name */
    private s f131650o;

    /* renamed from: p, reason: collision with root package name */
    public C16618a f131651p;

    /* renamed from: q, reason: collision with root package name */
    private ec.e f131652q;

    /* renamed from: r, reason: collision with root package name */
    private Map<String, String> f131653r;

    /* renamed from: s, reason: collision with root package name */
    private C15115a f131654s;

    /* renamed from: t, reason: collision with root package name */
    public Wa.a f131655t;

    /* renamed from: u, reason: collision with root package name */
    private vb.e f131656u;

    /* renamed from: v, reason: collision with root package name */
    private o f131657v;

    /* renamed from: w, reason: collision with root package name */
    public m f131658w;

    /* renamed from: x, reason: collision with root package name */
    private q f131659x;

    /* renamed from: y, reason: collision with root package name */
    public vb.k f131660y;

    /* renamed from: z, reason: collision with root package name */
    private static final C13784a f131635z = C13785b.a(C13974a.class.getName());

    /* renamed from: A, reason: collision with root package name */
    private static final C13786c f131631A = C13787d.a(C13974a.class.getName());

    private j b(p pVar, Xb.a aVar, C15115a c15115a) {
        Class cls = this.f131650o.b(this.f131642g.l()) ? Xb.m.class : g.class;
        return cls == g.class ? new g(aVar, pVar, i.c(), c15115a, this.f131656u) : cls == Xb.m.class ? new Xb.m(aVar, pVar, i.c(), c15115a, this.f131656u, this.f131643h.f135222e, this.f131659x) : new n(aVar, pVar, i.c(), c15115a, this.f131656u);
    }

    public static C13974a c() {
        if (f131632B == null) {
            throw new RuntimeException("Android context not initialized yet. Call setApiKey before calling any other method.");
        }
        C13974a c13974a = f131634D;
        if (c13974a != null) {
            return c13974a;
        }
        throw new RuntimeException("Processor factory initializeApplicationContext not called.");
    }

    public static void d(Application application) {
        if (f131634D == null) {
            f131633C = application;
            f131632B = application.getApplicationContext();
            C13974a c13974a = new C13974a();
            f131634D = c13974a;
            C14495b c14495bA = C14495b.a();
            c13974a.f131643h = c14495bA;
            c13974a.f131641f = c14495bA.f135220c;
            c13974a.f131642g = c14495bA.f135222e;
            c13974a.f131654s = c14495bA.f135213J;
            c13974a.f131650o = c14495bA.f135207D;
            Wb.a.a(f131632B.getApplicationContext());
            C14495b c14495b = c13974a.f131643h;
            c13974a.f131640e = c14495b.f135225h;
            c13974a.f131656u = new vb.e(c14495b.f135222e);
            c13974a.f131637b = new C14345b(c13974a.f131643h.f135211H, c13974a.f131640e, Vb.a.a(), c13974a.f131643h.f135220c, f131632B.getPackageName(), c13974a.f131643h.f135233p);
            Zb.a.a();
            InterfaceC6500a interfaceC6500aA = cc.b.a(c13974a.f131654s, c13974a.f131643h.f135208E);
            c13974a.f131651p = new C16618a(c13974a.f131643h.f135206C, c13974a.f131641f, c13974a.f131642g);
            c13974a.f131652q = new ec.e();
            c13974a.f131653r = new HashMap();
            Xb.b bVar = new Xb.b(c13974a.f131641f, f131632B);
            c13974a.f131644i = bVar;
            bVar.c();
            C15119d c15119d = new C15119d(c13974a.f131652q, c13974a.f131653r);
            c13974a.f131646k = c15119d;
            c13974a.f131644i.e(c15119d);
            f fVar = Zb.a.a().f43665a;
            c cVar = new c();
            Nb.g gVar = c13974a.f131643h.f135206C;
            C6345b c6345b = C14495b.a().f135218a;
            kc.f fVar2 = new kc.f(c6345b, c13974a.f131642g);
            c13974a.f131645j = new d(fVar, c13974a.f131646k, c13974a.f131642g, c13974a.f131641f, gVar, c13974a.f131653r, cVar, fVar2);
            c13974a.f131639d = new C15117b(c13974a.f131637b, f131632B, interfaceC6500aA, c13974a.f131641f, c13974a.f131642g, c13974a.f131646k);
            c13974a.f131658w = new m(fVar, c13974a.f131641f, gVar, fVar2, c13974a.f131642g, new vb.s(c13974a.f131642g), cVar, interfaceC6500aA);
            r rVar = new r(c6345b);
            c13974a.f131660y = new vb.k(c13974a.f131637b, c13974a.f131643h.f135220c, c13974a.f131642g, interfaceC6500aA, new vb.i(c13974a.f131642g));
            c13974a.f131659x = new q(c13974a.f131643h.f135222e, c6345b, rVar);
            vb.p pVar = new vb.p(c13974a.f131658w, c13974a.f131637b, new vb.f(), new vb.g(), c13974a.f131659x, c13974a.f131660y);
            c13974a.f131657v = pVar;
            c13974a.f131648m = new Xb.q(c13974a.f131639d, pVar);
            Xb.a aVar = Zb.a.a().f43667c;
            c13974a.f131649n = aVar;
            j jVarB = c13974a.b(c13974a.f131648m, aVar, c13974a.f131654s);
            c13974a.f131638c = jVarB;
            c13974a.f131646k.c(jVarB);
            C5680b c5680b = new C5680b(c13974a, c13974a.f131639d, c13974a.f131643h);
            d dVar = c5680b.f45366b.f131645j;
            fc.b bVar2 = new fc.b(c5680b.f45370f, c5680b.f45371g, dVar, "gimbalVisitCloseJob");
            c5680b.f45368d = bVar2;
            dVar.f131668b.add(bVar2);
            c5680b.f45368d = c5680b.f45368d;
            c5680b.f45373i = new l(c5680b.f45370f, c5680b.f45371g, c5680b.f45366b.f131658w, "ibeaconVisitCloseJob");
            c5680b.f45369e = new kc.o(c5680b.f45370f, c5680b.f45371g, c5680b.f45367c, c5680b.f45372h);
            c5680b.f45374j = new vb.j(c5680b.f45370f, c5680b.f45371g, c5680b.f45366b.f131660y, c5680b.f45372h);
            c5680b.f45365a.c(c5680b.f45368d);
            c5680b.f45365a.c(c5680b.f45373i);
            c5680b.f45365a.c(c5680b.f45369e);
            c5680b.f45365a.c(c5680b.f45374j);
            c13974a.f131636a = c5680b;
            c13974a.f131660y.f165746e = c5680b.f45374j;
            c13974a.f131639d.f141765d = c5680b.f45369e;
            C14494a c14494a = new C14494a(c13974a.f131646k, C14495b.a().f135218a, c13974a.f131641f, c13974a.f131642g);
            c13974a.f131647l = c14494a;
            c14494a.c();
            c13974a.f131642g.g(c13974a, "allowKitKat");
            c13974a.f131641f.h(c13974a, "Api_Key", "Location_Permission");
            c13974a.a("Api_Key", c13974a.f131641f.g());
            Context context = f131632B;
            Intent intent = new Intent(context.getPackageName());
            intent.setPackage(context.getPackageName());
            context.startService(intent);
            f131631A.e("Proxmity Service started by {}", context.getPackageName());
        }
    }

    private void e() {
        j jVarB = b(this.f131648m, this.f131649n, this.f131654s);
        if (this.f131650o.c()) {
            Wa.a aVarA = Wa.a.a();
            aVarA.f40887d.remove(this.f131638c);
        }
        this.f131638c = jVarB;
        this.f131646k.c(jVarB);
        if (this.f131650o.c()) {
            Wa.a.a().c(this.f131638c);
        }
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if ("allowKitKat".equals(str)) {
            e();
        } else if ("Location_Permission".equals(str) && ((Boolean) obj).booleanValue()) {
            e();
        }
    }

    private C13974a() {
    }
}
