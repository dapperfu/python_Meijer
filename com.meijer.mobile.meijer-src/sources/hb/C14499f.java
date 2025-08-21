package hb;

import Ob.p;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import bb.C6345b;
import cb.C6497a;
import cc.InterfaceC6500a;
import com.gimbal.internal.service.GimbalServiceStartStopReceiver;
import eb.C13786c;
import eb.C13787d;
import fb.C13974a;
import jb.C14972a;
import mb.C15700a;
import mb.C15700a.b;
import mb.C15703d;
import nt.C16020b;
import ob.C16090a;
import ob.C16092c;
import ob.C16093d;
import ob.C16096g;
import ob.C16097h;
import ob.C16100k;
import pt.InterfaceC16543c;
import ut.C17473g;
import vb.m;

/* renamed from: hb.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14499f {

    /* renamed from: v, reason: collision with root package name */
    private static final C13786c f135262v = C13787d.a(C14495b.class.getName());

    /* renamed from: w, reason: collision with root package name */
    private static Context f135263w;

    /* renamed from: x, reason: collision with root package name */
    private static C14499f f135264x;

    /* renamed from: a, reason: collision with root package name */
    private C14495b f135265a = C14495b.a();

    /* renamed from: b, reason: collision with root package name */
    private C16020b f135266b = C16020b.a();

    /* renamed from: c, reason: collision with root package name */
    private C13974a f135267c = C13974a.c();

    /* renamed from: d, reason: collision with root package name */
    public C16093d f135268d;

    /* renamed from: e, reason: collision with root package name */
    public Cb.e f135269e;

    /* renamed from: f, reason: collision with root package name */
    public Cb.b f135270f;

    /* renamed from: g, reason: collision with root package name */
    private Bb.b f135271g;

    /* renamed from: h, reason: collision with root package name */
    Bb.a f135272h;

    /* renamed from: i, reason: collision with root package name */
    public C16096g f135273i;

    /* renamed from: j, reason: collision with root package name */
    private C14498e f135274j;

    /* renamed from: k, reason: collision with root package name */
    private C16090a f135275k;

    /* renamed from: l, reason: collision with root package name */
    C16100k f135276l;

    /* renamed from: m, reason: collision with root package name */
    C16097h f135277m;

    /* renamed from: n, reason: collision with root package name */
    private C16092c f135278n;

    /* renamed from: o, reason: collision with root package name */
    private Hb.a f135279o;

    /* renamed from: p, reason: collision with root package name */
    public p f135280p;

    /* renamed from: q, reason: collision with root package name */
    C6497a f135281q;

    /* renamed from: r, reason: collision with root package name */
    private C14972a f135282r;

    /* renamed from: s, reason: collision with root package name */
    Eb.e f135283s;

    /* renamed from: t, reason: collision with root package name */
    Eb.d f135284t;

    /* renamed from: u, reason: collision with root package name */
    public C15700a f135285u;

    private C14499f(Context context) {
        C14495b c14495b = this.f135265a;
        InterfaceC6500a interfaceC6500aA = cc.b.a(c14495b.f135213J, c14495b.f135208E);
        C17473g c17473gC = this.f135266b.f153247f.f164552s.c();
        InterfaceC16543c interfaceC16543c = this.f135266b.f153243b;
        C13974a c13974a = this.f135267c;
        fc.d dVar = c13974a.f131645j;
        C14495b c14495b2 = this.f135265a;
        this.f135269e = new Cb.e(c17473gC, interfaceC16543c, dVar, c14495b2.f135220c, c14495b2.f135222e, c13974a.f131658w);
        this.f135282r = new C14972a(this.f135265a.f135234q, interfaceC6500aA);
        new C6345b();
        C14495b c14495b3 = this.f135265a;
        Cb.b bVar = new Cb.b(c14495b3.f135233p, this.f135282r, c14495b3.f135243z, interfaceC6500aA, c14495b3.f135222e, c14495b3.f135206C, c14495b3.f135220c);
        this.f135270f = bVar;
        this.f135266b.f153244c.a(bVar);
        C13974a c13974a2 = this.f135267c;
        fc.d dVar2 = c13974a2.f131645j;
        if (dVar2 != null) {
            dVar2.f131674h.f131664a = this.f135270f;
        }
        m mVar = c13974a2.f131658w;
        if (mVar != null) {
            mVar.f165769k = this.f135270f;
        }
        C14495b c14495b4 = this.f135265a;
        this.f135278n = new C16092c(context, c14495b4.f135213J, c14495b4.f135207D);
        this.f135276l = new C16100k(context.getSharedPreferences("SCHEDULED_COMMUNICATIONS", 0));
        C14495b c14495b5 = this.f135265a;
        this.f135277m = new C16097h(c14495b5.f135205B, this.f135276l, c14495b5.f135240w, this.f135278n, c14495b5.f135209F);
        C14495b c14495b6 = this.f135265a;
        this.f135273i = new C16096g(c14495b6.f135226i, c14495b6.f135227j.a(), this.f135265a.f135220c, this.f135277m);
        Cb.b bVar2 = this.f135270f;
        C16096g c16096g = this.f135273i;
        C14495b c14495b7 = this.f135265a;
        C16093d c16093d = new C16093d(bVar2, c16096g, c14495b7.f135233p, this.f135282r, c14495b7.f135220c, c14495b7.f135222e, c14495b7.f135216M);
        this.f135268d = c16093d;
        this.f135277m.f153824g = c16093d;
        C14495b c14495b8 = this.f135265a;
        this.f135271g = new Bb.b(c14495b8.f135220c, c14495b8.f135222e);
        C14495b c14495b9 = this.f135265a;
        Bb.a aVar = new Bb.a(c14495b9.f135226i, c14495b9.f135220c, c14495b9.f135227j.a(), this.f135271g);
        this.f135272h = aVar;
        this.f135270f.f(aVar);
        C14495b c14495b10 = this.f135265a;
        this.f135280p = new p(context, c14495b10.f135220c, c14495b10.f135222e, c14495b10.f135213J, c14495b10.f135208E);
        C14495b c14495b11 = this.f135265a;
        this.f135281q = new C6497a(context, c14495b11.f135213J, c14495b11.f135208E, c14495b11.f135222e, c14495b11.f135220c);
        this.f135284t = new Eb.d(context.getSharedPreferences("SCHEDULED_PLACE_EVENTS", 0));
        this.f135283s = new Eb.e(this.f135270f, this.f135284t, this.f135265a.f135240w);
        C6345b c6345b = new C6345b();
        C14495b c14495b12 = this.f135265a;
        C15703d c15703d = new C15703d(context, c6345b, c14495b12.f135220c, c14495b12.f135208E, c14495b12.f135209F, c14495b12.f135213J, this.f135280p, c14495b12.f135207D, c14495b12.f135222e, c14495b12.f135238u);
        C6345b c6345b2 = new C6345b();
        C14495b c14495b13 = this.f135265a;
        this.f135285u = new C15700a(context, c6345b2, c14495b13.f135220c, c14495b13.f135221d, c15703d, this.f135267c.f131644i, interfaceC6500aA, c14495b13.f135226i, c14495b13.f135227j.a(), this.f135265a.f135212I);
        C14498e c14498e = new C14498e(this, this.f135265a);
        this.f135274j = c14498e;
        this.f135272h.f2620d = c14498e.f135250d;
        this.f135277m.f153820c = c14498e.f135259m;
        Eb.e eVar = this.f135283s;
        eVar.f7074b = c14498e.f135260n;
        this.f135270f.f4172i = eVar;
        C15700a c15700a = this.f135285u;
        c15700a.f150942k = c14498e.f135255i;
        c15700a.d();
        c15700a.new b(c15700a.f150934c, c15700a.f150937f).c();
        c15700a.f150936e.e(c15700a);
        c15700a.f150934c.h(c15700a, "Registration_Properties");
        c15700a.f150934c.h(c15700a, "Places_Enabled");
        c15700a.f150934c.h(c15700a, "Established_Locations_Enabled");
        c15700a.f150934c.h(c15700a, "Communicate_Enabled");
        c15700a.f150934c.h(c15700a, "Beacon_Manager_Enabled");
        c15700a.f150934c.h(c15700a, "Changed_Api_Key");
        C16093d c16093d2 = this.f135268d;
        Db.e eVar2 = this.f135265a.f135220c;
        Hb.a aVar2 = new Hb.a(context, c16093d2);
        this.f135279o = aVar2;
        if (aVar2.f13489a != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.c2dm.intent.RECEIVE");
            aVar2.f13491c.registerReceiver(aVar2, intentFilter);
        }
        C16090a c16090a = new C16090a(context, this.f135268d, this.f135265a.f135220c);
        this.f135275k = c16090a;
        c16090a.c();
        this.f135269e.d();
        C14498e c14498e2 = this.f135274j;
        if (this.f135265a.f135220c.v()) {
            c14498e2.b();
            c14498e2.f135257k.u();
        }
    }

    public static C14499f a() {
        if (f135263w == null) {
            throw new IllegalStateException("Android context not initialized yet. Call setApiKey before calling any other method.");
        }
        C14499f c14499f = f135264x;
        if (c14499f != null) {
            return c14499f;
        }
        throw new IllegalStateException("Processor factory initializeApplicationContext not called.");
    }

    public static void b(Application application) {
        if (f135263w == null) {
            f135263w = application.getApplicationContext();
        }
        if (f135264x == null) {
            f135264x = new C14499f(f135263w);
            Context context = f135263w;
            Intent intent = new Intent(GimbalServiceStartStopReceiver.a(context));
            intent.setPackage(context.getPackageName());
            context.startService(intent);
            f135262v.e("Gimbal Service starting - " + context.getPackageName(), new Object[0]);
        }
    }

    public static Context c() {
        return f135263w;
    }
}
