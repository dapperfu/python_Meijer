package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.view.C5992H;
import androidx.view.InterfaceC6015f;
import androidx.view.InterfaceC6030s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
final class LifeCycle implements Application.ActivityLifecycleCallbacks, m8, InterfaceC6015f {

    /* renamed from: l, reason: collision with root package name */
    private static LifeCycle f91538l;

    /* renamed from: a, reason: collision with root package name */
    private long f91539a;

    /* renamed from: b, reason: collision with root package name */
    private long f91540b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f91541c;

    /* renamed from: g, reason: collision with root package name */
    private Integer f91545g;

    /* renamed from: h, reason: collision with root package name */
    private String f91546h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f91548j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f91549k;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<g> f91542d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<h> f91543e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<f> f91544f = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private final List<Activity> f91547i = new ArrayList();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5992H.l().getLifecycle().a(LifeCycle.this);
        }
    }

    class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f91551a;

        b(long j10) {
            this.f91551a = j10;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (LifeCycle.this.f91542d != null) {
                Iterator it = new ArrayList(LifeCycle.this.f91542d).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar != null) {
                        gVar.a(this.f91551a);
                    }
                }
            }
        }
    }

    class c extends v4 {
        c() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (LifeCycle.this.f91543e != null) {
                Iterator it = new ArrayList(LifeCycle.this.f91543e).iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar != null) {
                        hVar.onBackground();
                    }
                }
            }
        }
    }

    class d extends v4 {
        d() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (LifeCycle.this.f91543e != null) {
                Iterator it = LifeCycle.this.f91543e.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar != null) {
                        hVar.onForeground();
                    }
                }
            }
        }
    }

    class e extends v4 {
        e() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (LifeCycle.this.f91544f != null) {
                Iterator it = LifeCycle.this.f91544f.iterator();
                while (it.hasNext()) {
                    f fVar = (f) it.next();
                    if (fVar != null) {
                        fVar.b();
                    }
                }
            }
        }
    }

    protected interface f {
        void a();

        void b();
    }

    protected interface g {
        void a(long j10);
    }

    protected interface h {
        void onBackground();

        void onForeground();
    }

    private LifeCycle() {
        j();
    }

    public static synchronized LifeCycle b() {
        try {
            if (f91538l == null) {
                f91538l = new LifeCycle();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f91538l;
    }

    private void g() {
        w7.b().a().execute(new e());
    }

    private void h() {
        w7.b().a().execute(new c());
    }

    private void i() {
        w7.b().a().execute(new d());
    }

    private void j() {
        try {
            i4.c().a().registerActivityLifecycleCallbacks(this);
            w7.b().c().execute(new a());
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    String a() {
        return this.f91546h;
    }

    protected Long c() {
        if (this.f91539a == 0) {
            return 0L;
        }
        return Long.valueOf(System.currentTimeMillis() - this.f91539a);
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        ArrayList<h> arrayList = this.f91543e;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<g> arrayList2 = this.f91542d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        k();
        f91538l = null;
    }

    protected Long d() {
        if (this.f91540b == 0) {
            return 0L;
        }
        return Long.valueOf(System.currentTimeMillis() - this.f91540b);
    }

    boolean e() {
        return a("com.medallia.digital.mobilesdk.MedalliaFullFormActivity") || a("com.medallia.digital.mobilesdk.MedalliaModalFormActivity");
    }

    protected boolean f() {
        return this.f91541c;
    }

    protected void k() {
        try {
            i4.c().a().unregisterActivityLifecycleCallbacks(this);
            C5992H.l().getLifecycle().d(this);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f91546h = activity.getClass().getName();
        this.f91545g = Integer.valueOf(activity.hashCode());
        if (this.f91541c) {
            b(activity);
        }
        i4.c().a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f91547i.remove(activity);
        if (this.f91547i.isEmpty()) {
            return;
        }
        i4.c().a(this.f91547i.get(0));
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        try {
            if (this.f91548j && this.f91549k) {
                this.f91549k = false;
            } else {
                this.f91547i.add(activity);
            }
            g();
            this.f91546h = activity.getClass().getName();
            this.f91545g = Integer.valueOf(activity.hashCode());
            Context baseContext = i4.c().d().getBaseContext();
            if (baseContext == null || baseContext.getClass().getName().equals(this.f91546h)) {
                return;
            }
            i4.c().a(activity);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Integer num = this.f91545g;
        if (num == null || num.intValue() != activity.hashCode()) {
            this.f91546h = activity.getClass().getName();
            this.f91545g = Integer.valueOf(activity.hashCode());
            if (this.f91541c) {
                b(activity);
            }
            i4.c().a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // androidx.view.InterfaceC6015f
    public /* bridge */ /* synthetic */ void onCreate(InterfaceC6030s interfaceC6030s) {
        super.onCreate(interfaceC6030s);
    }

    @Override // androidx.view.InterfaceC6015f
    public /* bridge */ /* synthetic */ void onDestroy(InterfaceC6030s interfaceC6030s) {
        super.onDestroy(interfaceC6030s);
    }

    @Override // androidx.view.InterfaceC6015f
    public /* bridge */ /* synthetic */ void onPause(InterfaceC6030s interfaceC6030s) {
        super.onPause(interfaceC6030s);
    }

    @Override // androidx.view.InterfaceC6015f
    public /* bridge */ /* synthetic */ void onResume(InterfaceC6030s interfaceC6030s) {
        super.onResume(interfaceC6030s);
    }

    @Override // androidx.view.InterfaceC6015f
    public /* bridge */ /* synthetic */ void onStart(InterfaceC6030s interfaceC6030s) {
        super.onStart(interfaceC6030s);
    }

    @Override // androidx.view.InterfaceC6015f
    public void onStop(InterfaceC6030s interfaceC6030s) {
        try {
            a4.b("LifecycleOwner onStop");
            this.f91541c = true;
            i4.c().a((Context) null);
            h();
            this.f91539a = System.currentTimeMillis();
            this.f91540b = 0L;
            this.f91545g = null;
            Iterator<f> it = this.f91544f.iterator();
            while (it.hasNext()) {
                f next = it.next();
                if (next != null) {
                    next.a();
                }
            }
            a4.b("Application is in background");
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    private void a(long j10) {
        w7.b().a().execute(new b(j10));
    }

    private void b(Activity activity) {
        if (this.f91541c) {
            this.f91541c = false;
            i4.a(activity.getApplication());
            a(c().longValue());
            i();
            this.f91540b = System.currentTimeMillis();
            this.f91539a = 0L;
            a4.b("Application is in foreground");
        }
    }

    protected void a(Activity activity) {
        a4.b("setCurrentActivityRunning was called");
        if (this.f91548j || activity == null || this.f91545g != null) {
            return;
        }
        this.f91546h = activity.getClass().getName();
        this.f91545g = Integer.valueOf(activity.hashCode());
        this.f91547i.add(activity);
        b(activity);
        this.f91541c = false;
        this.f91548j = true;
        this.f91549k = true;
        a4.b("setCurrentActivityRunning done");
    }

    public void b(f fVar) {
        ArrayList<f> arrayList = this.f91544f;
        if (arrayList == null || fVar == null) {
            return;
        }
        arrayList.remove(fVar);
    }

    public void a(f fVar) {
        ArrayList<f> arrayList = this.f91544f;
        if (arrayList == null || fVar == null) {
            return;
        }
        arrayList.add(fVar);
    }

    public void b(g gVar) {
        ArrayList<g> arrayList = this.f91542d;
        if (arrayList == null || gVar == null) {
            return;
        }
        arrayList.remove(gVar);
    }

    public void a(g gVar) {
        ArrayList<g> arrayList = this.f91542d;
        if (arrayList == null || gVar == null) {
            return;
        }
        arrayList.add(gVar);
    }

    public void b(h hVar) {
        if (hVar != null) {
            try {
                ArrayList<h> arrayList = this.f91543e;
                if (arrayList == null) {
                    return;
                }
                arrayList.remove(hVar);
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    public void a(h hVar) {
        if (hVar != null) {
            try {
                ArrayList<h> arrayList = this.f91543e;
                if (arrayList == null || arrayList.contains(hVar)) {
                    return;
                }
                this.f91543e.add(hVar);
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    protected boolean a(String str) {
        String strA = a();
        if (this.f91548j && strA != null && strA.equals(str)) {
            a4.b("isActivityRunning current activity: " + strA);
            return true;
        }
        List<Activity> list = this.f91547i;
        if (list != null && !list.isEmpty()) {
            strA = this.f91547i.get(0).getClass().getName();
        }
        a4.b("isActivityRunning current activity: " + strA);
        return strA != null && strA.equals(str);
    }
}
