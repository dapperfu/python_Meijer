package com.google.firebase.perf.application;

import Xf.f;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import bg.k;
import cg.C6505a;
import cg.EnumC6506b;
import cg.EnumC6507c;
import cg.g;
import cg.j;
import cg.l;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import dg.m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: r, reason: collision with root package name */
    private static final Wf.a f89824r = Wf.a.e();

    /* renamed from: s, reason: collision with root package name */
    private static volatile a f89825s;

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Activity, Boolean> f89826a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap<Activity, d> f89827b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap<Activity, c> f89828c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Activity, Trace> f89829d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Long> f89830e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<WeakReference<b>> f89831f;

    /* renamed from: g, reason: collision with root package name */
    private Set<InterfaceC1293a> f89832g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicInteger f89833h;

    /* renamed from: i, reason: collision with root package name */
    private final k f89834i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f89835j;

    /* renamed from: k, reason: collision with root package name */
    private final C6505a f89836k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f89837l;

    /* renamed from: m, reason: collision with root package name */
    private l f89838m;

    /* renamed from: n, reason: collision with root package name */
    private l f89839n;

    /* renamed from: o, reason: collision with root package name */
    private dg.d f89840o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f89841p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f89842q;

    /* renamed from: com.google.firebase.perf.application.a$a, reason: collision with other inner class name */
    public interface InterfaceC1293a {
        void a();
    }

    public interface b {
        void onUpdateAppState(dg.d dVar);
    }

    a(k kVar, C6505a c6505a) {
        this(kVar, c6505a, com.google.firebase.perf.config.a.g(), g());
    }

    public synchronized void i(Context context) {
        if (this.f89841p) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f89841p = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f89826a.isEmpty()) {
                this.f89838m = this.f89836k.a();
                this.f89826a.put(activity, Boolean.TRUE);
                if (this.f89842q) {
                    q(dg.d.FOREGROUND);
                    l();
                    this.f89842q = false;
                } else {
                    n(EnumC6507c.BACKGROUND_TRACE_NAME.toString(), this.f89839n, this.f89838m);
                    q(dg.d.FOREGROUND);
                }
            } else {
                this.f89826a.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        try {
            if (h() && this.f89835j.K()) {
                if (!this.f89827b.containsKey(activity)) {
                    o(activity);
                }
                this.f89827b.get(activity).c();
                Trace trace = new Trace(c(activity), this.f89834i, this.f89836k, this);
                trace.start();
                this.f89829d.put(activity, trace);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        try {
            if (h()) {
                m(activity);
            }
            if (this.f89826a.containsKey(activity)) {
                this.f89826a.remove(activity);
                if (this.f89826a.isEmpty()) {
                    this.f89839n = this.f89836k.a();
                    n(EnumC6507c.FOREGROUND_TRACE_NAME.toString(), this.f89838m, this.f89839n);
                    q(dg.d.BACKGROUND);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static a b() {
        if (f89825s == null) {
            synchronized (a.class) {
                try {
                    if (f89825s == null) {
                        f89825s = new a(k.k(), new C6505a());
                    }
                } finally {
                }
            }
        }
        return f89825s;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private void l() {
        synchronized (this.f89832g) {
            try {
                for (InterfaceC1293a interfaceC1293a : this.f89832g) {
                    if (interfaceC1293a != null) {
                        interfaceC1293a.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void m(Activity activity) {
        Trace trace = this.f89829d.get(activity);
        if (trace == null) {
            return;
        }
        this.f89829d.remove(activity);
        g<f.a> gVarE = this.f89827b.get(activity).e();
        if (!gVarE.d()) {
            f89824r.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            j.a(trace, gVarE.c());
            trace.stop();
        }
    }

    private void n(String str, l lVar, l lVar2) {
        if (this.f89835j.K()) {
            m.b bVarI = m.F0().Q(str).O(lVar.e()).P(lVar.d(lVar2)).I(SessionManager.getInstance().perfSession().a());
            int andSet = this.f89833h.getAndSet(0);
            synchronized (this.f89830e) {
                try {
                    bVarI.K(this.f89830e);
                    if (andSet != 0) {
                        bVarI.M(EnumC6506b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                    }
                    this.f89830e.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f89834i.x(bVarI.build(), dg.d.FOREGROUND_BACKGROUND);
        }
    }

    private void q(dg.d dVar) {
        this.f89840o = dVar;
        synchronized (this.f89831f) {
            try {
                Iterator<WeakReference<b>> it = this.f89831f.iterator();
                while (it.hasNext()) {
                    b bVar = it.next().get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.f89840o);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public dg.d a() {
        return this.f89840o;
    }

    public void d(String str, long j10) {
        synchronized (this.f89830e) {
            try {
                Long l10 = this.f89830e.get(str);
                if (l10 == null) {
                    this.f89830e.put(str, Long.valueOf(j10));
                } else {
                    this.f89830e.put(str, Long.valueOf(l10.longValue() + j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(int i10) {
        this.f89833h.addAndGet(i10);
    }

    public boolean f() {
        return this.f89842q;
    }

    protected boolean h() {
        return this.f89837l;
    }

    public void j(InterfaceC1293a interfaceC1293a) {
        synchronized (this.f89832g) {
            this.f89832g.add(interfaceC1293a);
        }
    }

    public void k(WeakReference<b> weakReference) {
        synchronized (this.f89831f) {
            this.f89831f.add(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f89827b.remove(activity);
        if (this.f89828c.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.f89828c.remove(activity));
        }
    }

    public void p(WeakReference<b> weakReference) {
        synchronized (this.f89831f) {
            this.f89831f.remove(weakReference);
        }
    }

    private static boolean g() {
        return d.a();
    }

    private void o(Activity activity) {
        if (h() && this.f89835j.K()) {
            d dVar = new d(activity);
            this.f89827b.put(activity, dVar);
            if (activity instanceof FragmentActivity) {
                c cVar = new c(this.f89836k, this.f89834i, this, dVar);
                this.f89828c.put(activity, cVar);
                ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(cVar, true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o(activity);
    }

    a(k kVar, C6505a c6505a, com.google.firebase.perf.config.a aVar, boolean z10) {
        this.f89826a = new WeakHashMap<>();
        this.f89827b = new WeakHashMap<>();
        this.f89828c = new WeakHashMap<>();
        this.f89829d = new WeakHashMap<>();
        this.f89830e = new HashMap();
        this.f89831f = new HashSet();
        this.f89832g = new HashSet();
        this.f89833h = new AtomicInteger(0);
        this.f89840o = dg.d.BACKGROUND;
        this.f89841p = false;
        this.f89842q = true;
        this.f89834i = kVar;
        this.f89836k = c6505a;
        this.f89835j = aVar;
        this.f89837l = z10;
    }
}
