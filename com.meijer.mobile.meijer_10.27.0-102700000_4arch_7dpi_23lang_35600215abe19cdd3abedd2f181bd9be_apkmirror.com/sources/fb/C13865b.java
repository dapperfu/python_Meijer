package fb;

import Bb.l;
import Ib.h;
import Ib.i;
import Ib.n;
import Lb.g;
import Lb.o;
import Lb.p;
import Lb.q;
import Lb.s;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import gb.C14231a;
import ib.C14712a;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import lb.C15393b;
import nb.C15787b;
import ob.C16011b;
import rb.C16743b;
import rb.C16744c;
import sb.C16920c;
import ub.InterfaceC17238a;
import vb.C17538d;

/* renamed from: fb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13865b {

    /* renamed from: O, reason: collision with root package name */
    private static C6380a f130852O = C6381b.a(C13865b.class.getName());

    /* renamed from: P, reason: collision with root package name */
    private static C6382c f130853P = C6383d.a(C13865b.class.getName());

    /* renamed from: Q, reason: collision with root package name */
    private static final String[] f130854Q;

    /* renamed from: R, reason: collision with root package name */
    private static final Set<String> f130855R;

    /* renamed from: S, reason: collision with root package name */
    private static Context f130856S;

    /* renamed from: T, reason: collision with root package name */
    private static C13865b f130857T;

    /* renamed from: A, reason: collision with root package name */
    public Kb.c f130858A;

    /* renamed from: B, reason: collision with root package name */
    public C15393b f130859B;

    /* renamed from: C, reason: collision with root package name */
    public g f130860C;

    /* renamed from: E, reason: collision with root package name */
    public Lb.c f130862E;

    /* renamed from: F, reason: collision with root package name */
    Lb.b f130863F;

    /* renamed from: G, reason: collision with root package name */
    private C16011b f130864G;

    /* renamed from: H, reason: collision with root package name */
    public C16920c f130865H;

    /* renamed from: I, reason: collision with root package name */
    C17538d f130866I;

    /* renamed from: J, reason: collision with root package name */
    public C14712a f130867J;

    /* renamed from: K, reason: collision with root package name */
    private Ib.b f130868K;

    /* renamed from: L, reason: collision with root package name */
    public xb.f f130869L;

    /* renamed from: M, reason: collision with root package name */
    Lb.e f130870M;

    /* renamed from: N, reason: collision with root package name */
    public l f130871N;

    /* renamed from: a, reason: collision with root package name */
    public Za.b f130872a;

    /* renamed from: c, reason: collision with root package name */
    public Bb.e f130874c;

    /* renamed from: d, reason: collision with root package name */
    o f130875d;

    /* renamed from: e, reason: collision with root package name */
    public Bb.b f130876e;

    /* renamed from: f, reason: collision with root package name */
    public Za.c f130877f;

    /* renamed from: g, reason: collision with root package name */
    n f130878g;

    /* renamed from: h, reason: collision with root package name */
    public Hb.a f130879h;

    /* renamed from: i, reason: collision with root package name */
    public Ib.f f130880i;

    /* renamed from: j, reason: collision with root package name */
    public Ib.e f130881j;

    /* renamed from: k, reason: collision with root package name */
    public Ya.a f130882k;

    /* renamed from: l, reason: collision with root package name */
    public Xa.a f130883l;

    /* renamed from: m, reason: collision with root package name */
    public Fb.b f130884m;

    /* renamed from: n, reason: collision with root package name */
    public C15787b f130885n;

    /* renamed from: o, reason: collision with root package name */
    public gb.b f130886o;

    /* renamed from: p, reason: collision with root package name */
    public Db.d f130887p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC17238a f130888q;

    /* renamed from: r, reason: collision with root package name */
    public xb.c f130889r;

    /* renamed from: s, reason: collision with root package name */
    public Fb.d f130890s;

    /* renamed from: t, reason: collision with root package name */
    public Fb.f f130891t;

    /* renamed from: u, reason: collision with root package name */
    Fb.c f130892u;

    /* renamed from: v, reason: collision with root package name */
    public gb.d f130893v;

    /* renamed from: w, reason: collision with root package name */
    public Ya.d f130894w;

    /* renamed from: x, reason: collision with root package name */
    private C16743b f130895x;

    /* renamed from: y, reason: collision with root package name */
    private C16744c f130896y;

    /* renamed from: D, reason: collision with root package name */
    public s f130861D = new s(Build.VERSION.SDK_INT, Build.VERSION.RELEASE);

    /* renamed from: b, reason: collision with root package name */
    private Executor f130873b = Executors.newSingleThreadExecutor(new a());

    /* renamed from: z, reason: collision with root package name */
    p f130897z = new q();

    /* renamed from: fb.b$a */
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
        f130854Q = strArr;
        f130855R = new HashSet(Arrays.asList(strArr));
    }

    public static synchronized C13865b a() {
        C13865b c13865b;
        try {
            if (f130856S == null) {
                throw new RuntimeException("Android context not initialized yet. Call setApiKey before calling any other method.");
            }
            c13865b = f130857T;
            if (c13865b == null) {
                throw new RuntimeException("Core factory initializeApplicationContext not called.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c13865b;
    }

    public static synchronized void b(Application application) {
        try {
            if (f130856S == null) {
                f130856S = application.getApplicationContext();
            }
            if (f130857T == null) {
                if (application.getSharedPreferences("Gimbal_Storage_File", 0).getString("Changed_Api_Key", null) != null) {
                    Context applicationContext = application.getApplicationContext();
                    File file = new File(applicationContext.getFilesDir().getParent() + "/shared_prefs/");
                    String[] list = file.list();
                    for (int i10 = 0; i10 < list.length; i10++) {
                        if (f130855R.contains(list[i10])) {
                            applicationContext.getSharedPreferences(list[i10].replace(".xml", ""), 0).edit().clear().commit();
                        }
                    }
                    for (int i11 = 0; i11 < list.length; i11++) {
                        if (f130855R.contains(list[i11])) {
                            File file2 = new File(file, list[i11]);
                            file2.delete();
                            file2.getAbsolutePath();
                        }
                    }
                    f130853P.f("-- Removed Gimbal Data from {}", file);
                    f130853P.f("-- Previous ApiKey cleared --", new Object[0]);
                }
                C13865b c13865b = new C13865b(f130856S);
                c13865b.f130868K = new Ib.b(f130856S, c13865b.f130874c);
                c13865b.f130865H = new C16920c();
                C17538d c17538d = new C17538d();
                c13865b.f130866I = c17538d;
                Ib.c cVar = new Ib.c(c13865b.f130865H, c13865b.f130868K, c13865b.f130874c, c17538d);
                c13865b.f130881j = cVar;
                c13865b.f130878g = new n(cVar.a());
                c13865b.f130858A = new Kb.c(c13865b.f130881j.a(), c13865b.f130880i, c13865b.f130874c, c13865b.f130872a, new Kb.d(c13865b.f130874c, c13865b.f130872a));
                c13865b.f130887p = new Db.d(f130856S.getSharedPreferences("GIMBAL_PLACE_REPO", 0));
                ub.c cVar2 = new ub.c("eventlog.log", f130856S, new ub.d(c13865b.f130865H, c13865b.f130874c));
                c13865b.f130888q = new ub.b(c13865b.f130874c, c13865b.f130872a, cVar2, c13865b.f130880i, f130856S.getPackageName(), c13865b.f130867J);
                h hVarA = c13865b.f130881j.a();
                c13865b.f130891t = new Fb.f(c13865b.f130892u, c13865b.f130874c, new Ib.l(hVarA), new i(hVarA), c13865b.f130880i, c13865b.f130884m);
                c13865b.f130890s = new Fb.e(c13865b.f130874c, c13865b.f130892u);
                c13865b.f130885n = new C15787b(c13865b.f130880i, c13865b.f130876e, c13865b.f130881j.a());
                c13865b.f130859B = new C15393b(f130856S.getSharedPreferences("GIMBAL_CACHED_COMMUNICATION_REPO", 0));
                c13865b.f130886o = new gb.b(c13865b.f130880i, c13865b.f130881j.a());
                if (c13865b.f130892u.b()) {
                    c13865b.f130893v = new gb.e(f130856S, c13865b.f130874c);
                } else {
                    c13865b.f130893v = new gb.f();
                }
                c13865b.f130864G = new C16011b(c13865b.f130876e, c13865b.f130860C, c13865b.f130861D, c13865b.f130874c);
                c13865b.f130869L = new xb.f(c13865b.f130874c, f130856S.getPackageName(), c13865b.f130887p, cVar2, Bb.h.a(), c13865b.f130888q, c13865b.f130897z);
                C16743b c16743b = new C16743b(c13865b, c13865b.f130878g, f130856S.getPackageName());
                c13865b.f130895x = c16743b;
                c16743b.f157890c.c();
                c13865b.f130888q.b(c13865b.f130895x.f157896i);
                c13865b.f130889r = new xb.d(c13865b.f130874c, c13865b.f130895x.f157894g, c13865b.f130872a, new xb.h(f130856S), new xb.g(f130856S), new xb.e(f130856S));
                C16743b c16743b2 = c13865b.f130895x;
                f130856S.getPackageName();
                c16743b2.f157900m = new C14231a(c16743b2.f157889b, c16743b2.f157891d, c13865b.f130889r, c13865b.f130893v, c13865b.f130876e, c13865b.f130874c);
                C16744c c16744c = new C16744c(c13865b.f130895x, c13865b.f130894w, c13865b.f130874c, c13865b.f130877f);
                c13865b.f130896y = c16744c;
                if (c16744c.f157903b.v()) {
                    c16744c.b();
                }
                c16744c.f157904c.c(c16744c.f157902a.f157894g);
                c16744c.f157904c.c(c16744c.f157902a.f157899l);
                c16744c.f157904c.c(c16744c.f157902a.f157900m);
                f130857T = c13865b;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private C13865b(Context context) {
        this.f130862E = new Lb.c(context);
        this.f130863F = new Lb.b(context, this.f130861D);
        this.f130874c = new Bb.e(new Bb.o(context.getSharedPreferences("Gimbal_Storage_File", 0), this.f130873b));
        this.f130875d = new o(new Bb.o(context.getSharedPreferences("Gimbal_Counters_File", 0), this.f130873b));
        this.f130876e = new Bb.b(new Bb.o(context.getSharedPreferences("Application_Configuration", 0), this.f130873b));
        this.f130871N = new Bb.o(context.getSharedPreferences("Device_Attributes", 0), this.f130873b);
        this.f130867J = new C14712a(context, this.f130862E, this.f130861D, this.f130876e);
        this.f130870M = new Lb.e(context, this.f130861D);
        this.f130860C = new g(context);
        this.f130880i = new Ib.g(this.f130874c);
        this.f130879h = new Hb.a(this.f130874c);
        this.f130872a = new Za.b();
        this.f130882k = new Ya.a(context, this.f130874c, this.f130867J);
        this.f130872a = new Za.b();
        this.f130883l = new Xa.a(context, this.f130874c);
        this.f130877f = new Za.c(context.getSharedPreferences("com.gimbal", 0));
        this.f130884m = new Fb.b(context);
        this.f130892u = new Fb.c(context);
        this.f130894w = new Ya.d(this.f130882k, this.f130877f, this.f130872a, this.f130883l);
    }
}
