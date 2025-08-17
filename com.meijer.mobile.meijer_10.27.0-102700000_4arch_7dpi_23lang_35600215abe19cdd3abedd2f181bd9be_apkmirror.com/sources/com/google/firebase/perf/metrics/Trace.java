package com.google.firebase.perf.metrics;

import Wf.e;
import Zf.k;
import ag.C5599a;
import ag.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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

/* loaded from: classes7.dex */
public class Trace extends com.google.firebase.perf.application.b implements Parcelable, Yf.b {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Yf.b> f89079a;

    /* renamed from: b, reason: collision with root package name */
    private final Trace f89080b;

    /* renamed from: c, reason: collision with root package name */
    private final GaugeManager f89081c;

    /* renamed from: d, reason: collision with root package name */
    private final String f89082d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, com.google.firebase.perf.metrics.a> f89083e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, String> f89084f;

    /* renamed from: g, reason: collision with root package name */
    private final List<Yf.a> f89085g;

    /* renamed from: h, reason: collision with root package name */
    private final List<Trace> f89086h;

    /* renamed from: i, reason: collision with root package name */
    private final k f89087i;

    /* renamed from: j, reason: collision with root package name */
    private final C5599a f89088j;

    /* renamed from: k, reason: collision with root package name */
    private l f89089k;

    /* renamed from: l, reason: collision with root package name */
    private l f89090l;

    /* renamed from: m, reason: collision with root package name */
    private static final Uf.a f89076m = Uf.a.e();

    /* renamed from: n, reason: collision with root package name */
    private static final Map<String, Trace> f89077n = new ConcurrentHashMap();

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    static final Parcelable.Creator<Trace> f89078o = new b();

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
        this(str, k.k(), new C5599a(), com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public static Trace c(String str) {
        return new Trace(str);
    }

    private com.google.firebase.perf.metrics.a n(String str) {
        com.google.firebase.perf.metrics.a aVar = this.f89083e.get(str);
        if (aVar != null) {
            return aVar;
        }
        com.google.firebase.perf.metrics.a aVar2 = new com.google.firebase.perf.metrics.a(str);
        this.f89083e.put(str, aVar2);
        return aVar2;
    }

    private void o(l lVar) {
        if (this.f89086h.isEmpty()) {
            return;
        }
        Trace trace = this.f89086h.get(this.f89086h.size() - 1);
        if (trace.f89090l == null) {
            trace.f89090l = lVar;
        }
    }

    @Override // Yf.b
    public void a(Yf.a aVar) {
        if (aVar == null) {
            f89076m.j("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (!i() || k()) {
                return;
            }
            this.f89085g.add(aVar);
        }
    }

    Map<String, com.google.firebase.perf.metrics.a> d() {
        return this.f89083e;
    }

    l e() {
        return this.f89090l;
    }

    List<Yf.a> f() {
        List<Yf.a> listUnmodifiableList;
        synchronized (this.f89085g) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Yf.a aVar : this.f89085g) {
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

    l g() {
        return this.f89089k;
    }

    @Keep
    public String getAttribute(String str) {
        return this.f89084f.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f89084f);
    }

    @Keep
    public long getLongMetric(String str) {
        com.google.firebase.perf.metrics.a aVar = str != null ? this.f89083e.get(str.trim()) : null;
        if (aVar == null) {
            return 0L;
        }
        return aVar.a();
    }

    public String getName() {
        return this.f89082d;
    }

    List<Trace> h() {
        return this.f89086h;
    }

    boolean i() {
        return this.f89089k != null;
    }

    boolean k() {
        return this.f89090l != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f89080b, 0);
        parcel.writeString(this.f89082d);
        parcel.writeList(this.f89086h);
        parcel.writeMap(this.f89083e);
        parcel.writeParcelable(this.f89089k, 0);
        parcel.writeParcelable(this.f89090l, 0);
        synchronized (this.f89085g) {
            parcel.writeList(this.f89085g);
        }
    }

    private void b(String str, String str2) {
        if (!k()) {
            if (!this.f89084f.containsKey(str) && this.f89084f.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            e.d(str, str2);
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f89082d));
    }

    protected void finalize() throws Throwable {
        try {
            if (j()) {
                f89076m.k("Trace '%s' is started but not stopped when it is destructed!", this.f89082d);
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
            f89076m.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!i()) {
            f89076m.k("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f89082d);
        } else {
            if (k()) {
                f89076m.k("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f89082d);
                return;
            }
            com.google.firebase.perf.metrics.a aVarN = n(str.trim());
            aVarN.b(j10);
            f89076m.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(aVarN.a()), this.f89082d);
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
            f89076m.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f89082d);
            z10 = true;
        } catch (Exception e10) {
            f89076m.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
            z10 = false;
        }
        if (z10) {
            this.f89084f.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j10) {
        String strE = e.e(str);
        if (strE != null) {
            f89076m.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strE);
            return;
        }
        if (!i()) {
            f89076m.k("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f89082d);
        } else if (k()) {
            f89076m.k("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f89082d);
        } else {
            n(str.trim()).c(j10);
            f89076m.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), this.f89082d);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (k()) {
            f89076m.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f89084f.remove(str);
        }
    }

    @Keep
    public void start() {
        if (!com.google.firebase.perf.config.a.g().K()) {
            f89076m.a("Trace feature is disabled.");
            return;
        }
        String strF = e.f(this.f89082d);
        if (strF != null) {
            f89076m.d("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f89082d, strF);
            return;
        }
        if (this.f89089k != null) {
            f89076m.d("Trace '%s' has already started, should not start again!", this.f89082d);
            return;
        }
        this.f89089k = this.f89088j.a();
        registerForAppState();
        Yf.a aVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f89079a);
        a(aVarPerfSession);
        if (aVarPerfSession.e()) {
            this.f89081c.collectGaugeMetricOnce(aVarPerfSession.d());
        }
    }

    @Keep
    public void stop() {
        if (!i()) {
            f89076m.d("Trace '%s' has not been started so unable to stop!", this.f89082d);
            return;
        }
        if (k()) {
            f89076m.d("Trace '%s' has already stopped, should not stop again!", this.f89082d);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f89079a);
        unregisterForAppState();
        l lVarA = this.f89088j.a();
        this.f89090l = lVarA;
        if (this.f89080b == null) {
            o(lVarA);
            if (!this.f89082d.isEmpty()) {
                this.f89087i.x(new com.google.firebase.perf.metrics.b(this).a(), getAppState());
                if (SessionManager.getInstance().perfSession().e()) {
                    this.f89081c.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
                    return;
                }
                return;
            }
            f89076m.c("Trace name is empty, no log is sent to server");
        }
    }

    public Trace(String str, k kVar, C5599a c5599a, com.google.firebase.perf.application.a aVar) {
        this(str, kVar, c5599a, aVar, GaugeManager.getInstance());
    }

    public Trace(String str, k kVar, C5599a c5599a, com.google.firebase.perf.application.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f89079a = new WeakReference<>(this);
        this.f89080b = null;
        this.f89082d = str.trim();
        this.f89086h = new ArrayList();
        this.f89083e = new ConcurrentHashMap();
        this.f89084f = new ConcurrentHashMap();
        this.f89088j = c5599a;
        this.f89087i = kVar;
        this.f89085g = Collections.synchronizedList(new ArrayList());
        this.f89081c = gaugeManager;
    }

    private Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : com.google.firebase.perf.application.a.b());
        this.f89079a = new WeakReference<>(this);
        this.f89080b = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f89082d = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f89086h = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f89083e = concurrentHashMap;
        this.f89084f = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, com.google.firebase.perf.metrics.a.class.getClassLoader());
        this.f89089k = (l) parcel.readParcelable(l.class.getClassLoader());
        this.f89090l = (l) parcel.readParcelable(l.class.getClassLoader());
        List<Yf.a> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f89085g = listSynchronizedList;
        parcel.readList(listSynchronizedList, Yf.a.class.getClassLoader());
        if (z10) {
            this.f89087i = null;
            this.f89088j = null;
            this.f89081c = null;
        } else {
            this.f89087i = k.k();
            this.f89088j = new C5599a();
            this.f89081c = GaugeManager.getInstance();
        }
    }
}
