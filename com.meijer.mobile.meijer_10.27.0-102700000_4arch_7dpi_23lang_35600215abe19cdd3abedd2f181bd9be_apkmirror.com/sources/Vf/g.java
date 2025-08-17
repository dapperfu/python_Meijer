package Vf;

import Zf.k;
import ag.o;
import bg.h;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class g extends com.google.firebase.perf.application.b implements Yf.b {

    /* renamed from: i, reason: collision with root package name */
    private static final Uf.a f37546i = Uf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final List<Yf.a> f37547a;

    /* renamed from: b, reason: collision with root package name */
    private final GaugeManager f37548b;

    /* renamed from: c, reason: collision with root package name */
    private final k f37549c;

    /* renamed from: d, reason: collision with root package name */
    private final h.b f37550d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference<Yf.b> f37551e;

    /* renamed from: f, reason: collision with root package name */
    private String f37552f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37553g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f37554h;

    private g(k kVar) {
        this(kVar, com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public g(k kVar, com.google.firebase.perf.application.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f37550d = h.K0();
        this.f37551e = new WeakReference<>(this);
        this.f37549c = kVar;
        this.f37548b = gaugeManager;
        this.f37547a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public static g c(k kVar) {
        return new g(kVar);
    }

    private boolean g() {
        return this.f37550d.J();
    }

    private boolean h() {
        return this.f37550d.L();
    }

    @Override // Yf.b
    public void a(Yf.a aVar) {
        if (aVar == null) {
            f37546i.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else {
            if (!g() || h()) {
                return;
            }
            this.f37547a.add(aVar);
        }
    }

    List<Yf.a> d() {
        List<Yf.a> listUnmodifiableList;
        synchronized (this.f37547a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Yf.a aVar : this.f37547a) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listUnmodifiableList;
    }

    public long e() {
        return this.f37550d.I();
    }

    public boolean f() {
        return this.f37550d.K();
    }

    public g j(String str) {
        h.d dVar;
        if (str != null) {
            h.d dVar2 = h.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    dVar = h.d.OPTIONS;
                    break;
                case "GET":
                    dVar = h.d.GET;
                    break;
                case "PUT":
                    dVar = h.d.PUT;
                    break;
                case "HEAD":
                    dVar = h.d.HEAD;
                    break;
                case "POST":
                    dVar = h.d.POST;
                    break;
                case "PATCH":
                    dVar = h.d.PATCH;
                    break;
                case "TRACE":
                    dVar = h.d.TRACE;
                    break;
                case "CONNECT":
                    dVar = h.d.CONNECT;
                    break;
                case "DELETE":
                    dVar = h.d.DELETE;
                    break;
                default:
                    dVar = h.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f37550d.N(dVar);
        }
        return this;
    }

    public g k(int i10) {
        this.f37550d.O(i10);
        return this;
    }

    public g n() {
        this.f37550d.P(h.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public g o(long j10) {
        this.f37550d.Q(j10);
        return this;
    }

    public g r(String str) {
        if (str == null) {
            this.f37550d.H();
            return this;
        }
        if (i(str)) {
            this.f37550d.R(str);
            return this;
        }
        f37546i.j("The content type of the response is not a valid content-type:" + str);
        return this;
    }

    public g s(long j10) {
        this.f37550d.S(j10);
        return this;
    }

    public g t(long j10) {
        this.f37550d.U(j10);
        return this;
    }

    public g v(long j10) {
        this.f37550d.V(j10);
        if (SessionManager.getInstance().perfSession().e()) {
            this.f37548b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public g w(long j10) {
        this.f37550d.W(j10);
        return this;
    }

    public g x(String str) {
        if (str != null) {
            this.f37550d.X(o.e(o.d(str), 2000));
        }
        return this;
    }

    public g y(String str) {
        this.f37552f = str;
        return this;
    }

    private static boolean i(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt > 127) {
                return false;
            }
        }
        return true;
    }

    public h b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f37551e);
        unregisterForAppState();
        bg.k[] kVarArrB = Yf.a.b(d());
        if (kVarArrB != null) {
            this.f37550d.G(Arrays.asList(kVarArrB));
        }
        h hVarBuild = this.f37550d.build();
        if (!Xf.d.c(this.f37552f)) {
            f37546i.a("Dropping network request from a 'User-Agent' that is not allowed");
            return hVarBuild;
        }
        if (!this.f37553g) {
            this.f37549c.w(hVarBuild, getAppState());
            this.f37553g = true;
            return hVarBuild;
        }
        if (this.f37554h) {
            f37546i.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
        }
        return hVarBuild;
    }

    public g q(long j10) {
        Yf.a aVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f37551e);
        this.f37550d.M(j10);
        a(aVarPerfSession);
        if (aVarPerfSession.e()) {
            this.f37548b.collectGaugeMetricOnce(aVarPerfSession.d());
        }
        return this;
    }
}
