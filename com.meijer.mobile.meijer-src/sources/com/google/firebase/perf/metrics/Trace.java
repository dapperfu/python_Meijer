package com.google.firebase.perf.metrics;

import Yf.e;
import ag.C5688a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import bg.k;
import cg.C6505a;
import cg.l;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class Trace extends com.google.firebase.perf.application.b implements Parcelable, ag.b {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<ag.b> f89921a;

    /* renamed from: b, reason: collision with root package name */
    private final Trace f89922b;

    /* renamed from: c, reason: collision with root package name */
    private final GaugeManager f89923c;

    /* renamed from: d, reason: collision with root package name */
    private final String f89924d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, com.google.firebase.perf.metrics.a> f89925e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f89926f;

    /* renamed from: g, reason: collision with root package name */
    private final List<C5688a> f89927g;

    /* renamed from: h, reason: collision with root package name */
    private final List<Trace> f89928h;

    /* renamed from: i, reason: collision with root package name */
    private final k f89929i;

    /* renamed from: j, reason: collision with root package name */
    private final C6505a f89930j;

    /* renamed from: k, reason: collision with root package name */
    private l f89931k;

    /* renamed from: l, reason: collision with root package name */
    private l f89932l;

    /* renamed from: m, reason: collision with root package name */
    private static final Wf.a f89918m = Wf.a.e();

    /* renamed from: n, reason: collision with root package name */
    private static final Map<String, Trace> f89919n = new ConcurrentHashMap();

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    static final Parcelable.Creator<Trace> f89920o = new b();

    class a implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }

        a() {
        }
    }

    class b implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Trace[] newArray(int i10) {
            return new Trace[i10];
        }

        b() {
        }
    }

    /* synthetic */ Trace(Parcel parcel, boolean z10, a aVar) {
        this(parcel, z10);
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    private Trace(String str) {
        this(str, k.k(), new C6505a(), com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public static Trace c(String str) {
        return new Trace(str);
    }

    private com.google.firebase.perf.metrics.a n(String str) {
        com.google.firebase.perf.metrics.a aVar = this.f89925e.get(str);
        if (aVar != null) {
            return aVar;
        }
        com.google.firebase.perf.metrics.a aVar2 = new com.google.firebase.perf.metrics.a(str);
        this.f89925e.put(str, aVar2);
        return aVar2;
    }

    private void o(l lVar) {
        if (this.f89928h.isEmpty()) {
            return;
        }
        Trace trace = this.f89928h.get(this.f89928h.size() - 1);
        if (trace.f89932l == null) {
            trace.f89932l = lVar;
        }
    }

    @Override // ag.b
    public void a(C5688a c5688a) {
        if (c5688a == null) {
            f89918m.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (!i() || k()) {
                return;
            }
            this.f89927g.add(c5688a);
        }
    }

    Map<String, com.google.firebase.perf.metrics.a> d() {
        return this.f89925e;
    }

    l e() {
        return this.f89932l;
    }

    List<C5688a> f() {
        List<C5688a> listUnmodifiableList;
        synchronized (this.f89927g) {
            try {
                ArrayList arrayList = new ArrayList();
                for (C5688a c5688a : this.f89927g) {
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

    l g() {
        return this.f89931k;
    }

    @Keep
    public String getAttribute(String str) {
        return this.f89926f.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f89926f);
    }

    @Keep
    public long getLongMetric(String str) {
        com.google.firebase.perf.metrics.a aVar = str != null ? this.f89925e.get(str.trim()) : null;
        if (aVar == null) {
            return 0L;
        }
        return aVar.a();
    }

    public String getName() {
        return this.f89924d;
    }

    List<Trace> h() {
        return this.f89928h;
    }

    boolean i() {
        return this.f89931k != null;
    }

    boolean k() {
        return this.f89932l != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f89922b, 0);
        parcel.writeString(this.f89924d);
        parcel.writeList(this.f89928h);
        parcel.writeMap(this.f89925e);
        parcel.writeParcelable(this.f89931k, 0);
        parcel.writeParcelable(this.f89932l, 0);
        synchronized (this.f89927g) {
            parcel.writeList(this.f89927g);
        }
    }

    private void b(String str, String str2) {
        if (!k()) {
            if (!this.f89926f.containsKey(str) && this.f89926f.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            e.d(str, str2);
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f89924d));
    }

    protected void finalize() throws Throwable {
        try {
            if (j()) {
                f89918m.k("Trace '%s' is started but not stopped when it is destructed!", this.f89924d);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public void incrementMetric(String str, long j10) {
        String strE = e.e(str);
        if (strE != null) {
            f89918m.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!i()) {
            f89918m.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f89924d);
        } else {
            if (k()) {
                f89918m.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f89924d);
                return;
            }
            com.google.firebase.perf.metrics.a aVarN = n(str.trim());
            aVarN.b(j10);
            f89918m.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(aVarN.a()), this.f89924d);
        }
    }

    boolean j() {
        if (i() && !k()) {
            return true;
        }
        return false;
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z10;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            f89918m.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f89924d);
            z10 = true;
        } catch (Exception e10) {
            f89918m.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
            z10 = false;
        }
        if (z10) {
            this.f89926f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j10) {
        String strE = e.e(str);
        if (strE != null) {
            f89918m.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!i()) {
            f89918m.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f89924d);
        } else if (k()) {
            f89918m.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f89924d);
        } else {
            n(str.trim()).c(j10);
            f89918m.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), this.f89924d);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (k()) {
            f89918m.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f89926f.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.a.g().K()) {
            f89918m.a("Trace feature is disabled.");
            return;
        }
        String strF = e.f(this.f89924d);
        if (strF != null) {
            f89918m.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f89924d, strF);
            return;
        }
        if (this.f89931k != null) {
            f89918m.d("Trace '%s' has already started, should not start again!", this.f89924d);
            return;
        }
        this.f89931k = this.f89930j.a();
        registerForAppState();
        C5688a c5688aPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f89921a);
        a(c5688aPerfSession);
        if (c5688aPerfSession.e()) {
            this.f89923c.collectGaugeMetricOnce(c5688aPerfSession.d());
        }
    }

    @Keep
    public void stop() {
        if (!i()) {
            f89918m.d("Trace '%s' has not been started so unable to stop!", this.f89924d);
            return;
        }
        if (k()) {
            f89918m.d("Trace '%s' has already stopped, should not stop again!", this.f89924d);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f89921a);
        unregisterForAppState();
        l lVarA = this.f89930j.a();
        this.f89932l = lVarA;
        if (this.f89922b == null) {
            o(lVarA);
            if (!this.f89924d.isEmpty()) {
                this.f89929i.x(new com.google.firebase.perf.metrics.b(this).a(), getAppState());
                if (SessionManager.getInstance().perfSession().e()) {
                    this.f89923c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
                    return;
                }
                return;
            }
            f89918m.c("Trace name is empty, no log is sent to server");
        }
    }

    public Trace(String str, k kVar, C6505a c6505a, com.google.firebase.perf.application.a aVar) {
        this(str, kVar, c6505a, aVar, GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, C6505a c6505a, com.google.firebase.perf.application.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f89921a = new WeakReference<>(this);
        this.f89922b = null;
        this.f89924d = str.trim();
        this.f89928h = new ArrayList();
        this.f89925e = new ConcurrentHashMap();
        this.f89926f = new ConcurrentHashMap();
        this.f89930j = c6505a;
        this.f89929i = kVar;
        this.f89927g = Collections.synchronizedList(new ArrayList());
        this.f89923c = gaugeManager;
    }

    private Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : com.google.firebase.perf.application.a.b());
        this.f89921a = new WeakReference<>(this);
        this.f89922b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f89924d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f89928h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f89925e = concurrentHashMap;
        this.f89926f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, com.google.firebase.perf.metrics.a.class.getClassLoader());
        this.f89931k = (l) parcel.readParcelable(l.class.getClassLoader());
        this.f89932l = (l) parcel.readParcelable(l.class.getClassLoader());
        List<C5688a> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f89927g = listSynchronizedList;
        parcel.readList(listSynchronizedList, C5688a.class.getClassLoader());
        if (z10) {
            this.f89929i = null;
            this.f89930j = null;
            this.f89923c = null;
        } else {
            this.f89929i = k.k();
            this.f89930j = new C6505a();
            this.f89923c = GaugeManager.getInstance();
        }
    }
}
