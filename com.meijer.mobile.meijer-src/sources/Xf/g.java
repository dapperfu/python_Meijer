package Xf;

import ag.C5688a;
import bg.k;
import cg.o;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import dg.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class g extends com.google.firebase.perf.application.b implements ag.b {

    /* renamed from: i, reason: collision with root package name */
    private static final Wf.a f42258i = Wf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final List<C5688a> f42259a;

    /* renamed from: b, reason: collision with root package name */
    private final GaugeManager f42260b;

    /* renamed from: c, reason: collision with root package name */
    private final k f42261c;

    /* renamed from: d, reason: collision with root package name */
    private final h.b f42262d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference<ag.b> f42263e;

    /* renamed from: f, reason: collision with root package name */
    private String f42264f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f42265g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f42266h;

    private g(k kVar) {
        this(kVar, com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public g(k kVar, com.google.firebase.perf.application.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f42262d = h.K0();
        this.f42263e = new WeakReference<>(this);
        this.f42261c = kVar;
        this.f42260b = gaugeManager;
        this.f42259a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public static g c(k kVar) {
        return new g(kVar);
    }

    private boolean g() {
        return this.f42262d.J();
    }

    private boolean h() {
        return this.f42262d.L();
    }

    @Override // ag.b
    public void a(C5688a c5688a) {
        if (c5688a == null) {
            f42258i.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else {
            if (!g() || h()) {
                return;
            }
            this.f42259a.add(c5688a);
        }
    }

    List<C5688a> d() {
        List<C5688a> listUnmodifiableList;
        synchronized (this.f42259a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (C5688a c5688a : this.f42259a) {
                    if (c5688a != null) {
                        arrayList.add(c5688a);
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
        return this.f42262d.I();
    }

    public boolean f() {
        return this.f42262d.K();
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
            this.f42262d.N(dVar);
        }
        return this;
    }

    public g k(int i10) {
        this.f42262d.O(i10);
        return this;
    }

    public g n() {
        this.f42262d.P(h.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public g o(long j10) {
        this.f42262d.Q(j10);
        return this;
    }

    public g r(String str) {
        if (str == null) {
            this.f42262d.H();
            return this;
        }
        if (i(str)) {
            this.f42262d.R(str);
            return this;
        }
        f42258i.j("The content type of the response is not a valid content-type:" + str);
        return this;
    }

    public g s(long j10) {
        this.f42262d.S(j10);
        return this;
    }

    public g t(long j10) {
        this.f42262d.U(j10);
        return this;
    }

    public g v(long j10) {
        this.f42262d.V(j10);
        if (SessionManager.getInstance().perfSession().e()) {
            this.f42260b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public g w(long j10) {
        this.f42262d.W(j10);
        return this;
    }

    public g x(String str) {
        if (str != null) {
            this.f42262d.X(o.e(o.d(str), 2000));
        }
        return this;
    }

    public g y(String str) {
        this.f42264f = str;
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
        SessionManager.getInstance().unregisterForSessionUpdates(this.f42263e);
        unregisterForAppState();
        dg.k[] kVarArrB = C5688a.b(d());
        if (kVarArrB != null) {
            this.f42262d.G(Arrays.asList(kVarArrB));
        }
        h hVarBuild = this.f42262d.build();
        if (!Zf.d.c(this.f42264f)) {
            f42258i.a("Dropping network request from a 'User-Agent' that is not allowed");
            return hVarBuild;
        }
        if (!this.f42265g) {
            this.f42261c.w(hVarBuild, getAppState());
            this.f42265g = true;
            return hVarBuild;
        }
        if (this.f42266h) {
            f42258i.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
        }
        return hVarBuild;
    }

    public g q(long j10) {
        C5688a c5688aPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f42263e);
        this.f42262d.M(j10);
        a(c5688aPerfSession);
        if (c5688aPerfSession.e()) {
            this.f42260b.collectGaugeMetricOnce(c5688aPerfSession.d());
        }
        return this;
    }
}
