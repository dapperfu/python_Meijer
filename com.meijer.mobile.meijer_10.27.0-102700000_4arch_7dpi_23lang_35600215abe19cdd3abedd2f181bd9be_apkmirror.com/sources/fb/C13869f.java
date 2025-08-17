package fb;

import Mb.p;
import ab.C5591a;
import ac.InterfaceC5594a;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cb.C6382c;
import cb.C6383d;
import com.gimbal.internal.service.GimbalServiceStartStopReceiver;
import db.C13501a;
import hb.C14394a;
import kb.C15129a;
import kb.C15129a.b;
import kb.C15132d;
import mb.C15580a;
import mb.C15582c;
import mb.C15583d;
import mb.C15586g;
import mb.C15587h;
import mb.C15590k;
import nt.C15944b;
import pt.InterfaceC16417c;
import tb.m;
import ut.C17321g;
import zb.C18413a;
import zb.C18414b;

/* renamed from: fb.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13869f {

    /* renamed from: v, reason: collision with root package name */
    private static final C6382c f130916v = C6383d.a(C13865b.class.getName());

    /* renamed from: w, reason: collision with root package name */
    private static Context f130917w;

    /* renamed from: x, reason: collision with root package name */
    private static C13869f f130918x;

    /* renamed from: a, reason: collision with root package name */
    private C13865b f130919a = C13865b.a();

    /* renamed from: b, reason: collision with root package name */
    private C15944b f130920b = C15944b.a();

    /* renamed from: c, reason: collision with root package name */
    private C13501a f130921c = C13501a.c();

    /* renamed from: d, reason: collision with root package name */
    public C15583d f130922d;

    /* renamed from: e, reason: collision with root package name */
    public Ab.e f130923e;

    /* renamed from: f, reason: collision with root package name */
    public Ab.b f130924f;

    /* renamed from: g, reason: collision with root package name */
    private C18414b f130925g;

    /* renamed from: h, reason: collision with root package name */
    C18413a f130926h;

    /* renamed from: i, reason: collision with root package name */
    public C15586g f130927i;

    /* renamed from: j, reason: collision with root package name */
    private C13868e f130928j;

    /* renamed from: k, reason: collision with root package name */
    private C15580a f130929k;

    /* renamed from: l, reason: collision with root package name */
    C15590k f130930l;

    /* renamed from: m, reason: collision with root package name */
    C15587h f130931m;

    /* renamed from: n, reason: collision with root package name */
    private C15582c f130932n;

    /* renamed from: o, reason: collision with root package name */
    private Fb.a f130933o;

    /* renamed from: p, reason: collision with root package name */
    public p f130934p;

    /* renamed from: q, reason: collision with root package name */
    C5591a f130935q;

    /* renamed from: r, reason: collision with root package name */
    private C14394a f130936r;

    /* renamed from: s, reason: collision with root package name */
    Cb.e f130937s;

    /* renamed from: t, reason: collision with root package name */
    Cb.d f130938t;

    /* renamed from: u, reason: collision with root package name */
    public C15129a f130939u;

    private C13869f(Context context) {
        C13865b c13865b = this.f130919a;
        InterfaceC5594a interfaceC5594aA = ac.b.a(c13865b.f130867J, c13865b.f130862E);
        C17321g c17321gC = this.f130920b.f152795f.f163474s.c();
        InterfaceC16417c interfaceC16417c = this.f130920b.f152791b;
        C13501a c13501a = this.f130921c;
        dc.d dVar = c13501a.f127316j;
        C13865b c13865b2 = this.f130919a;
        this.f130923e = new Ab.e(c17321gC, interfaceC16417c, dVar, c13865b2.f130874c, c13865b2.f130876e, c13501a.f127329w);
        this.f130936r = new C14394a(this.f130919a.f130888q, interfaceC5594aA);
        new Za.b();
        C13865b c13865b3 = this.f130919a;
        Ab.b bVar = new Ab.b(c13865b3.f130887p, this.f130936r, c13865b3.f130897z, interfaceC5594aA, c13865b3.f130876e, c13865b3.f130860C, c13865b3.f130874c);
        this.f130924f = bVar;
        this.f130920b.f152792c.a(bVar);
        C13501a c13501a2 = this.f130921c;
        dc.d dVar2 = c13501a2.f127316j;
        if (dVar2 != null) {
            dVar2.f127345h.f127335a = this.f130924f;
        }
        m mVar = c13501a2.f127329w;
        if (mVar != null) {
            mVar.f161591k = this.f130924f;
        }
        C13865b c13865b4 = this.f130919a;
        this.f130932n = new C15582c(context, c13865b4.f130867J, c13865b4.f130861D);
        this.f130930l = new C15590k(context.getSharedPreferences("SCHEDULED_COMMUNICATIONS", 0));
        C13865b c13865b5 = this.f130919a;
        this.f130931m = new C15587h(c13865b5.f130859B, this.f130930l, c13865b5.f130894w, this.f130932n, c13865b5.f130863F);
        C13865b c13865b6 = this.f130919a;
        this.f130927i = new C15586g(c13865b6.f130880i, c13865b6.f130881j.a(), this.f130919a.f130874c, this.f130931m);
        Ab.b bVar2 = this.f130924f;
        C15586g c15586g = this.f130927i;
        C13865b c13865b7 = this.f130919a;
        C15583d c15583d = new C15583d(bVar2, c15586g, c13865b7.f130887p, this.f130936r, c13865b7.f130874c, c13865b7.f130876e, c13865b7.f130870M);
        this.f130922d = c15583d;
        this.f130931m.f150037g = c15583d;
        C13865b c13865b8 = this.f130919a;
        this.f130925g = new C18414b(c13865b8.f130874c, c13865b8.f130876e);
        C13865b c13865b9 = this.f130919a;
        C18413a c18413a = new C18413a(c13865b9.f130880i, c13865b9.f130874c, c13865b9.f130881j.a(), this.f130925g);
        this.f130926h = c18413a;
        this.f130924f.f(c18413a);
        C13865b c13865b10 = this.f130919a;
        this.f130934p = new p(context, c13865b10.f130874c, c13865b10.f130876e, c13865b10.f130867J, c13865b10.f130862E);
        C13865b c13865b11 = this.f130919a;
        this.f130935q = new C5591a(context, c13865b11.f130867J, c13865b11.f130862E, c13865b11.f130876e, c13865b11.f130874c);
        this.f130938t = new Cb.d(context.getSharedPreferences("SCHEDULED_PLACE_EVENTS", 0));
        this.f130937s = new Cb.e(this.f130924f, this.f130938t, this.f130919a.f130894w);
        Za.b bVar3 = new Za.b();
        C13865b c13865b12 = this.f130919a;
        C15132d c15132d = new C15132d(context, bVar3, c13865b12.f130874c, c13865b12.f130862E, c13865b12.f130863F, c13865b12.f130867J, this.f130934p, c13865b12.f130861D, c13865b12.f130876e, c13865b12.f130892u);
        Za.b bVar4 = new Za.b();
        C13865b c13865b13 = this.f130919a;
        this.f130939u = new C15129a(context, bVar4, c13865b13.f130874c, c13865b13.f130875d, c15132d, this.f130921c.f127315i, interfaceC5594aA, c13865b13.f130880i, c13865b13.f130881j.a(), this.f130919a.f130866I);
        C13868e c13868e = new C13868e(this, this.f130919a);
        this.f130928j = c13868e;
        this.f130926h.f171706d = c13868e.f130904d;
        this.f130931m.f150033c = c13868e.f130913m;
        Cb.e eVar = this.f130937s;
        eVar.f3762b = c13868e.f130914n;
        this.f130924f.f176i = eVar;
        C15129a c15129a = this.f130939u;
        c15129a.f141796k = c13868e.f130909i;
        c15129a.d();
        c15129a.new b(c15129a.f141788c, c15129a.f141791f).c();
        c15129a.f141790e.e(c15129a);
        c15129a.f141788c.h(c15129a, "Registration_Properties");
        c15129a.f141788c.h(c15129a, "Places_Enabled");
        c15129a.f141788c.h(c15129a, "Established_Locations_Enabled");
        c15129a.f141788c.h(c15129a, "Communicate_Enabled");
        c15129a.f141788c.h(c15129a, "Beacon_Manager_Enabled");
        c15129a.f141788c.h(c15129a, "Changed_Api_Key");
        C15583d c15583d2 = this.f130922d;
        Bb.e eVar2 = this.f130919a.f130874c;
        Fb.a aVar = new Fb.a(context, c15583d2);
        this.f130933o = aVar;
        if (aVar.f10362a != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.c2dm.intent.RECEIVE");
            aVar.f10364c.registerReceiver(aVar, intentFilter);
        }
        C15580a c15580a = new C15580a(context, this.f130922d, this.f130919a.f130874c);
        this.f130929k = c15580a;
        c15580a.c();
        this.f130923e.d();
        C13868e c13868e2 = this.f130928j;
        if (this.f130919a.f130874c.v()) {
            c13868e2.b();
            c13868e2.f130911k.u();
        }
    }

    public static C13869f a() {
        if (f130917w == null) {
            throw new IllegalStateException("Android context not initialized yet. Call setApiKey before calling any other method.");
        }
        C13869f c13869f = f130918x;
        if (c13869f != null) {
            return c13869f;
        }
        throw new IllegalStateException("Processor factory initializeApplicationContext not called.");
    }

    public static void b(Application application) {
        if (f130917w == null) {
            f130917w = application.getApplicationContext();
        }
        if (f130918x == null) {
            f130918x = new C13869f(f130917w);
            Context context = f130917w;
            Intent intent = new Intent(GimbalServiceStartStopReceiver.a(context));
            intent.setPackage(context.getPackageName());
            context.startService(intent);
            f130916v.e("Gimbal Service starting - " + context.getPackageName(), new Object[0]);
        }
    }

    public static Context c() {
        return f130917w;
    }
}
