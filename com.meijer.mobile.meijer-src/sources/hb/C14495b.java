package hb;

import Db.l;
import Kb.h;
import Kb.i;
import Kb.n;
import Nb.g;
import Nb.o;
import Nb.p;
import Nb.q;
import Nb.s;
import ab.C5676a;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import bb.C6345b;
import bb.C6346c;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import ib.C14707a;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import kb.C15115a;
import nb.C15927b;
import pb.C16415b;
import qb.C16619b;
import tb.C17217b;
import tb.C17218c;
import ub.C17367c;
import wb.InterfaceC17855a;
import xb.C18150d;

/* renamed from: hb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14495b {

    /* renamed from: O, reason: collision with root package name */
    private static C13784a f135198O = C13785b.a(C14495b.class.getName());

    /* renamed from: P, reason: collision with root package name */
    private static C13786c f135199P = C13787d.a(C14495b.class.getName());

    /* renamed from: Q, reason: collision with root package name */
    private static final String[] f135200Q;

    /* renamed from: R, reason: collision with root package name */
    private static final Set<String> f135201R;

    /* renamed from: S, reason: collision with root package name */
    private static Context f135202S;

    /* renamed from: T, reason: collision with root package name */
    private static C14495b f135203T;

    /* renamed from: A, reason: collision with root package name */
    public Mb.c f135204A;

    /* renamed from: B, reason: collision with root package name */
    public C15927b f135205B;

    /* renamed from: C, reason: collision with root package name */
    public g f135206C;

    /* renamed from: E, reason: collision with root package name */
    public Nb.c f135208E;

    /* renamed from: F, reason: collision with root package name */
    Nb.b f135209F;

    /* renamed from: G, reason: collision with root package name */
    private C16619b f135210G;

    /* renamed from: H, reason: collision with root package name */
    public C17367c f135211H;

    /* renamed from: I, reason: collision with root package name */
    C18150d f135212I;

    /* renamed from: J, reason: collision with root package name */
    public C15115a f135213J;

    /* renamed from: K, reason: collision with root package name */
    private Kb.b f135214K;

    /* renamed from: L, reason: collision with root package name */
    public zb.f f135215L;

    /* renamed from: M, reason: collision with root package name */
    Nb.e f135216M;

    /* renamed from: N, reason: collision with root package name */
    public l f135217N;

    /* renamed from: a, reason: collision with root package name */
    public C6345b f135218a;

    /* renamed from: c, reason: collision with root package name */
    public Db.e f135220c;

    /* renamed from: d, reason: collision with root package name */
    o f135221d;

    /* renamed from: e, reason: collision with root package name */
    public Db.b f135222e;

    /* renamed from: f, reason: collision with root package name */
    public C6346c f135223f;

    /* renamed from: g, reason: collision with root package name */
    n f135224g;

    /* renamed from: h, reason: collision with root package name */
    public Jb.a f135225h;

    /* renamed from: i, reason: collision with root package name */
    public Kb.f f135226i;

    /* renamed from: j, reason: collision with root package name */
    public Kb.e f135227j;

    /* renamed from: k, reason: collision with root package name */
    public C5676a f135228k;

    /* renamed from: l, reason: collision with root package name */
    public Za.a f135229l;

    /* renamed from: m, reason: collision with root package name */
    public Hb.b f135230m;

    /* renamed from: n, reason: collision with root package name */
    public C16415b f135231n;

    /* renamed from: o, reason: collision with root package name */
    public ib.b f135232o;

    /* renamed from: p, reason: collision with root package name */
    public Fb.d f135233p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC17855a f135234q;

    /* renamed from: r, reason: collision with root package name */
    public zb.c f135235r;

    /* renamed from: s, reason: collision with root package name */
    public Hb.d f135236s;

    /* renamed from: t, reason: collision with root package name */
    public Hb.f f135237t;

    /* renamed from: u, reason: collision with root package name */
    Hb.c f135238u;

    /* renamed from: v, reason: collision with root package name */
    public ib.d f135239v;

    /* renamed from: w, reason: collision with root package name */
    public ab.d f135240w;

    /* renamed from: x, reason: collision with root package name */
    private C17217b f135241x;

    /* renamed from: y, reason: collision with root package name */
    private C17218c f135242y;

    /* renamed from: D, reason: collision with root package name */
    public s f135207D = new s(Build.VERSION.SDK_INT, Build.VERSION.RELEASE);

    /* renamed from: b, reason: collision with root package name */
    private Executor f135219b = Executors.newSingleThreadExecutor(new a());

    /* renamed from: z, reason: collision with root package name */
    p f135243z = new q();

    /* renamed from: hb.b$a */
    final class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "PropertyChangeNotify");
        }
    }

    static {
        String[] strArr = {"com.google.android.gms.measurement.prefs.xml", "com.gimbal.xml", "proximity.payloads_keyTimes.xml", "EstablishedLocations.xml", "EstablishedLocationsState.xml", "Gimbal_Storage_File.xml", "ReferenceLogs.xml", "Application_Configuration.xml", "proximity.payloads.xml", "proximity.transmitters_keyTimes.xml", "proximity.transmitters.xml", "proximity.datamasks.xml", "GIMBAL_PLACE_REPO.xml", "VisitRepository.gimbalBeacons.xml", "ORGANIZATION_PLACE_CACHE.xml", "GIMBAL_CACHED_COMMUNICATION_REPO.xml", "SCHEDULED_PLACE_EVENTS.xml", "PRIVATE_PLACE_CACHE.xml", "SCHEDULED_COMMUNICATIONS.xml", "FaarPrefs.xml", "RelaspherePref.xml", "proximity.shared.preferences", "SCHEDULED_ACTIONS_REPOSITORY", "Resolved_IBeacon_Repo", "com.qsl.faar.cache.OrganizationPlaceBubbleBoundary.xml", "com.qsl.faar.cache.KeyValue.xml", "com.qsl.faar.cache.OrganizationPlace.xml", "com.qsl.faar.cache.OrganizationPlaceEvent.xml", "com.qsl.faar.cache.ContentDescriptor", "com.qsl.faar.cache.PrivatePlace", "com.qsl.faar.cache.user", "com.qsl.faar.service.user.organization.UserApplication", "com.qsl.faar.cache.user", "bcState.xml", "Device_Attributes.xml"};
        f135200Q = strArr;
        f135201R = new HashSet(Arrays.asList(strArr));
    }

    public static synchronized C14495b a() {
        C14495b c14495b;
        try {
            if (f135202S == null) {
                throw new RuntimeException("Android context not initialized yet. Call setApiKey before calling any other method.");
            }
            c14495b = f135203T;
            if (c14495b == null) {
                throw new RuntimeException("Core factory initializeApplicationContext not called.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c14495b;
    }

    public static synchronized void b(Application application) {
        try {
            if (f135202S == null) {
                f135202S = application.getApplicationContext();
            }
            if (f135203T == null) {
                if (application.getSharedPreferences("Gimbal_Storage_File", 0).getString("Changed_Api_Key", null) != null) {
                    Context applicationContext = application.getApplicationContext();
                    File file = new File(applicationContext.getFilesDir().getParent() + "/shared_prefs/");
                    String[] list = file.list();
                    for (int i10 = 0; i10 < list.length; i10++) {
                        if (f135201R.contains(list[i10])) {
                            applicationContext.getSharedPreferences(list[i10].replace(".xml", ""), 0).edit().clear().commit();
                        }
                    }
                    for (int i11 = 0; i11 < list.length; i11++) {
                        if (f135201R.contains(list[i11])) {
                            File file2 = new File(file, list[i11]);
                            file2.delete();
                            file2.getAbsolutePath();
                        }
                    }
                    f135199P.f("-- Removed Gimbal Data from {}", file);
                    f135199P.f("-- Previous ApiKey cleared --", new Object[0]);
                }
                C14495b c14495b = new C14495b(f135202S);
                c14495b.f135214K = new Kb.b(f135202S, c14495b.f135220c);
                c14495b.f135211H = new C17367c();
                C18150d c18150d = new C18150d();
                c14495b.f135212I = c18150d;
                Kb.c cVar = new Kb.c(c14495b.f135211H, c14495b.f135214K, c14495b.f135220c, c18150d);
                c14495b.f135227j = cVar;
                c14495b.f135224g = new n(cVar.a());
                c14495b.f135204A = new Mb.c(c14495b.f135227j.a(), c14495b.f135226i, c14495b.f135220c, c14495b.f135218a, new Mb.d(c14495b.f135220c, c14495b.f135218a));
                c14495b.f135233p = new Fb.d(f135202S.getSharedPreferences("GIMBAL_PLACE_REPO", 0));
                wb.c cVar2 = new wb.c("eventlog.log", f135202S, new wb.d(c14495b.f135211H, c14495b.f135220c));
                c14495b.f135234q = new wb.b(c14495b.f135220c, c14495b.f135218a, cVar2, c14495b.f135226i, f135202S.getPackageName(), c14495b.f135213J);
                h hVarA = c14495b.f135227j.a();
                c14495b.f135237t = new Hb.f(c14495b.f135238u, c14495b.f135220c, new Kb.l(hVarA), new i(hVarA), c14495b.f135226i, c14495b.f135230m);
                c14495b.f135236s = new Hb.e(c14495b.f135220c, c14495b.f135238u);
                c14495b.f135231n = new C16415b(c14495b.f135226i, c14495b.f135222e, c14495b.f135227j.a());
                c14495b.f135205B = new C15927b(f135202S.getSharedPreferences("GIMBAL_CACHED_COMMUNICATION_REPO", 0));
                c14495b.f135232o = new ib.b(c14495b.f135226i, c14495b.f135227j.a());
                if (c14495b.f135238u.b()) {
                    c14495b.f135239v = new ib.e(f135202S, c14495b.f135220c);
                } else {
                    c14495b.f135239v = new ib.f();
                }
                c14495b.f135210G = new C16619b(c14495b.f135222e, c14495b.f135206C, c14495b.f135207D, c14495b.f135220c);
                c14495b.f135215L = new zb.f(c14495b.f135220c, f135202S.getPackageName(), c14495b.f135233p, cVar2, Db.h.a(), c14495b.f135234q, c14495b.f135243z);
                C17217b c17217b = new C17217b(c14495b, c14495b.f135224g, f135202S.getPackageName());
                c14495b.f135241x = c17217b;
                c17217b.f162380c.c();
                c14495b.f135234q.b(c14495b.f135241x.f162386i);
                c14495b.f135235r = new zb.d(c14495b.f135220c, c14495b.f135241x.f162384g, c14495b.f135218a, new zb.h(f135202S), new zb.g(f135202S), new zb.e(f135202S));
                C17217b c17217b2 = c14495b.f135241x;
                f135202S.getPackageName();
                c17217b2.f162390m = new C14707a(c17217b2.f162379b, c17217b2.f162381d, c14495b.f135235r, c14495b.f135239v, c14495b.f135222e, c14495b.f135220c);
                C17218c c17218c = new C17218c(c14495b.f135241x, c14495b.f135240w, c14495b.f135220c, c14495b.f135223f);
                c14495b.f135242y = c17218c;
                if (c17218c.f162393b.v()) {
                    c17218c.b();
                }
                c17218c.f162394c.c(c17218c.f162392a.f162384g);
                c17218c.f162394c.c(c17218c.f162392a.f162389l);
                c17218c.f162394c.c(c17218c.f162392a.f162390m);
                f135203T = c14495b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private C14495b(Context context) {
        this.f135208E = new Nb.c(context);
        this.f135209F = new Nb.b(context, this.f135207D);
        this.f135220c = new Db.e(new Db.o(context.getSharedPreferences("Gimbal_Storage_File", 0), this.f135219b));
        this.f135221d = new o(new Db.o(context.getSharedPreferences("Gimbal_Counters_File", 0), this.f135219b));
        this.f135222e = new Db.b(new Db.o(context.getSharedPreferences("Application_Configuration", 0), this.f135219b));
        this.f135217N = new Db.o(context.getSharedPreferences("Device_Attributes", 0), this.f135219b);
        this.f135213J = new C15115a(context, this.f135208E, this.f135207D, this.f135222e);
        this.f135216M = new Nb.e(context, this.f135207D);
        this.f135206C = new g(context);
        this.f135226i = new Kb.g(this.f135220c);
        this.f135225h = new Jb.a(this.f135220c);
        this.f135218a = new C6345b();
        this.f135228k = new C5676a(context, this.f135220c, this.f135213J);
        this.f135218a = new C6345b();
        this.f135229l = new Za.a(context, this.f135220c);
        this.f135223f = new C6346c(context.getSharedPreferences("com.gimbal", 0));
        this.f135230m = new Hb.b(context);
        this.f135238u = new Hb.c(context);
        this.f135240w = new ab.d(this.f135228k, this.f135223f, this.f135218a, this.f135229l);
    }
}
