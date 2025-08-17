package com.google.firebase.perf.application;

import Vf.f;
import Zf.k;
import ag.C5599a;
import ag.EnumC5600b;
import ag.EnumC5601c;
import ag.g;
import ag.j;
import ag.l;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import bg.m;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: r, reason: collision with root package name */
    private static final Uf.a f88982r = Uf.a.e();

    /* renamed from: s, reason: collision with root package name */
    private static volatile a f88983s;

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<Activity, Boolean> f88984a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap<Activity, d> f88985b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap<Activity, c> f88986c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<Activity, Trace> f88987d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Long> f88988e;

    /* renamed from: f, reason: collision with root package name */
    private final Set<WeakReference<b>> f88989f;

    /* renamed from: g, reason: collision with root package name */
    private Set<InterfaceC1284a> f88990g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicInteger f88991h;

    /* renamed from: i, reason: collision with root package name */
    private final k f88992i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f88993j;

    /* renamed from: k, reason: collision with root package name */
    private final C5599a f88994k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f88995l;

    /* renamed from: m, reason: collision with root package name */
    private l f88996m;

    /* renamed from: n, reason: collision with root package name */
    private l f88997n;

    /* renamed from: o, reason: collision with root package name */
    private bg.d f88998o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f88999p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f89000q;

    /* renamed from: com.google.firebase.perf.application.a$a, reason: collision with other inner class name */
    public interface InterfaceC1284a {
        void a();
    }

    public interface b {
        void onUpdateAppState(bg.d dVar);
    }

    a(k kVar, C5599a c5599a) {
        this(kVar, c5599a, com.google.firebase.perf.config.a.g(), g());
    }

    public synchronized void i(Context context) {
        if (this.f88999p) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f88999p = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.f88984a.isEmpty()) {
                this.f88996m = this.f88994k.a();
                this.f88984a.put(activity, Boolean.TRUE);
                if (this.f89000q) {
                    q(bg.d.FOREGROUND);
                    l();
                    this.f89000q = false;
                } else {
                    n(EnumC5601c.BACKGROUND_TRACE_NAME.toString(), this.f88997n, this.f88996m);
                    q(bg.d.FOREGROUND);
                }
            } else {
                this.f88984a.put(activity, Boolean.TRUE);
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
            if (h() && this.f88993j.K()) {
                if (!this.f88985b.containsKey(activity)) {
                    o(activity);
                }
                this.f88985b.get(activity).c();
                Trace trace = new Trace(c(activity), this.f88992i, this.f88994k, this);
                trace.start();
                this.f88987d.put(activity, trace);
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
            if (this.f88984a.containsKey(activity)) {
                this.f88984a.remove(activity);
                if (this.f88984a.isEmpty()) {
                    this.f88997n = this.f88994k.a();
                    n(EnumC5601c.FOREGROUND_TRACE_NAME.toString(), this.f88996m, this.f88997n);
                    q(bg.d.BACKGROUND);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static a b() {
        if (f88983s == null) {
            synchronized (a.class) {
                try {
                    if (f88983s == null) {
                        f88983s = new a(k.k(), new C5599a());
                    }
                } finally {
                }
            }
        }
        return f88983s;
    }

    public static String c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    private void l() {
        synchronized (this.f88990g) {
            try {
                for (InterfaceC1284a interfaceC1284a : this.f88990g) {
                    if (interfaceC1284a != null) {
                        interfaceC1284a.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void m(Activity activity) {
        Trace trace = this.f88987d.get(activity);
        if (trace == null) {
            return;
        }
        this.f88987d.remove(activity);
        g<f.a> gVarE = this.f88985b.get(activity).e();
        if (!gVarE.d()) {
            f88982r.k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            j.a(trace, gVarE.c());
            trace.stop();
        }
    }

    private void n(String str, l lVar, l lVar2) {
        if (this.f88993j.K()) {
            m.b bVarI = m.F0().Q(str).O(lVar.e()).P(lVar.d(lVar2)).I(SessionManager.getInstance().perfSession().a());
            int andSet = this.f88991h.getAndSet(0);
            synchronized (this.f88988e) {
                try {
                    bVarI.K(this.f88988e);
                    if (andSet != 0) {
                        bVarI.M(EnumC5600b.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
                    }
                    this.f88988e.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f88992i.x(bVarI.build(), bg.d.FOREGROUND_BACKGROUND);
        }
    }

    private void q(bg.d dVar) {
        this.f88998o = dVar;
        synchronized (this.f88989f) {
            try {
                Iterator<WeakReference<b>> it = this.f88989f.iterator();
                while (it.hasNext()) {
                    b bVar = it.next().get();
                    if (bVar != null) {
                        bVar.onUpdateAppState(this.f88998o);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public bg.d a() {
        return this.f88998o;
    }

    public void d(String str, long j10) {
        synchronized (this.f88988e) {
            try {
                Long l10 = this.f88988e.get(str);
                if (l10 == null) {
                    this.f88988e.put(str, Long.valueOf(j10));
                } else {
                    this.f88988e.put(str, Long.valueOf(l10.longValue() + j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(int i10) {
        this.f88991h.addAndGet(i10);
    }

    public boolean f() {
        return this.f89000q;
    }

    protected boolean h() {
        return this.f88995l;
    }

    public void j(InterfaceC1284a interfaceC1284a) {
        synchronized (this.f88990g) {
            this.f88990g.add(interfaceC1284a);
        }
    }

    public void k(WeakReference<b> weakReference) {
        synchronized (this.f88989f) {
            this.f88989f.add(weakReference);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f88985b.remove(activity);
        if (this.f88986c.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().unregisterFragmentLifecycleCallbacks(this.f88986c.remove(activity));
        }
    }

    public void p(WeakReference<b> weakReference) {
        synchronized (this.f88989f) {
            this.f88989f.remove(weakReference);
        }
    }

    private static boolean g() {
        return d.a();
    }

    private void o(Activity activity) {
        if (h() && this.f88993j.K()) {
            d dVar = new d(activity);
            this.f88985b.put(activity, dVar);
            if (activity instanceof FragmentActivity) {
                c cVar = new c(this.f88994k, this.f88992i, this, dVar);
                this.f88986c.put(activity, cVar);
                ((FragmentActivity) activity).getSupportFragmentManager().registerFragmentLifecycleCallbacks(cVar, true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o(activity);
    }

    a(k kVar, C5599a c5599a, com.google.firebase.perf.config.a aVar, boolean z10) {
        this.f88984a = new WeakHashMap<>();
        this.f88985b = new WeakHashMap<>();
        this.f88986c = new WeakHashMap<>();
        this.f88987d = new WeakHashMap<>();
        this.f88988e = new HashMap();
        this.f88989f = new HashSet();
        this.f88990g = new HashSet();
        this.f88991h = new AtomicInteger(0);
        this.f88998o = bg.d.BACKGROUND;
        this.f88999p = false;
        this.f89000q = true;
        this.f88992i = kVar;
        this.f88994k = c5599a;
        this.f88993j = aVar;
        this.f88995l = z10;
    }
}
