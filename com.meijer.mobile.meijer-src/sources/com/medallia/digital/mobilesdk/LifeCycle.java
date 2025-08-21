package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.view.C6134H;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
final class LifeCycle implements Application.ActivityLifecycleCallbacks, m8, InterfaceC6157f {

    /* renamed from: l, reason: collision with root package name */
    private static LifeCycle f92377l;

    /* renamed from: a, reason: collision with root package name */
    private long f92378a;

    /* renamed from: b, reason: collision with root package name */
    private long f92379b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f92380c;

    /* renamed from: g, reason: collision with root package name */
    private Integer f92384g;

    /* renamed from: h, reason: collision with root package name */
    private String f92385h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f92387j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f92388k;

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<g> f92381d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<h> f92382e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<f> f92383f = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private final List<Activity> f92386i = new ArrayList();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6134H.l().getLifecycle().a(LifeCycle.this);
        }
    }

    class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f92390a;

        b(long j10) {
            this.f92390a = j10;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (LifeCycle.this.f92381d != null) {
                Iterator it = new ArrayList(LifeCycle.this.f92381d).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar != null) {
                        gVar.a(this.f92390a);
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
            if (LifeCycle.this.f92382e != null) {
                Iterator it = new ArrayList(LifeCycle.this.f92382e).iterator();
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
            if (LifeCycle.this.f92382e != null) {
                Iterator it = LifeCycle.this.f92382e.iterator();
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
            if (LifeCycle.this.f92383f != null) {
                Iterator it = LifeCycle.this.f92383f.iterator();
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
            if (f92377l == null) {
                f92377l = new LifeCycle();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f92377l;
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
        return this.f92385h;
    }

    protected Long c() {
        if (this.f92378a == 0) {
            return 0L;
        }
        return Long.valueOf(System.currentTimeMillis() - this.f92378a);
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        ArrayList<h> arrayList = this.f92382e;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<g> arrayList2 = this.f92381d;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        k();
        f92377l = null;
    }

    protected Long d() {
        if (this.f92379b == 0) {
            return 0L;
        }
        return Long.valueOf(System.currentTimeMillis() - this.f92379b);
    }

    boolean e() {
        return a("com.medallia.digital.mobilesdk.MedalliaFullFormActivity") || a("com.medallia.digital.mobilesdk.MedalliaModalFormActivity");
    }

    protected boolean f() {
        return this.f92380c;
    }

    protected void k() {
        try {
            i4.c().a().unregisterActivityLifecycleCallbacks(this);
            C6134H.l().getLifecycle().d(this);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f92385h = activity.getClass().getName();
        this.f92384g = Integer.valueOf(activity.hashCode());
        if (this.f92380c) {
            b(activity);
        }
        i4.c().a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f92386i.remove(activity);
        if (this.f92386i.isEmpty()) {
            return;
        }
        i4.c().a(this.f92386i.get(0));
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        try {
            if (this.f92387j && this.f92388k) {
                this.f92388k = false;
            } else {
                this.f92386i.add(activity);
            }
            g();
            this.f92385h = activity.getClass().getName();
            this.f92384g = Integer.valueOf(activity.hashCode());
            Context baseContext = i4.c().d().getBaseContext();
            if (baseContext == null || baseContext.getClass().getName().equals(this.f92385h)) {
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
        Integer num = this.f92384g;
        if (num == null || num.intValue() != activity.hashCode()) {
            this.f92385h = activity.getClass().getName();
            this.f92384g = Integer.valueOf(activity.hashCode());
            if (this.f92380c) {
                b(activity);
            }
            i4.c().a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // androidx.view.InterfaceC6157f
    public /* bridge */ /* synthetic */ void onCreate(InterfaceC6172s interfaceC6172s) {
        super.onCreate(interfaceC6172s);
    }

    @Override // androidx.view.InterfaceC6157f
    public /* bridge */ /* synthetic */ void onDestroy(InterfaceC6172s interfaceC6172s) {
        super.onDestroy(interfaceC6172s);
    }

    @Override // androidx.view.InterfaceC6157f
    public /* bridge */ /* synthetic */ void onPause(InterfaceC6172s interfaceC6172s) {
        super.onPause(interfaceC6172s);
    }

    @Override // androidx.view.InterfaceC6157f
    public /* bridge */ /* synthetic */ void onResume(InterfaceC6172s interfaceC6172s) {
        super.onResume(interfaceC6172s);
    }

    @Override // androidx.view.InterfaceC6157f
    public /* bridge */ /* synthetic */ void onStart(InterfaceC6172s interfaceC6172s) {
        super.onStart(interfaceC6172s);
    }

    @Override // androidx.view.InterfaceC6157f
    public void onStop(InterfaceC6172s interfaceC6172s) {
        try {
            a4.b("LifecycleOwner onStop");
            this.f92380c = true;
            i4.c().a((Context) null);
            h();
            this.f92378a = System.currentTimeMillis();
            this.f92379b = 0L;
            this.f92384g = null;
            Iterator<f> it = this.f92383f.iterator();
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
        if (this.f92380c) {
            this.f92380c = false;
            i4.a(activity.getApplication());
            a(c().longValue());
            i();
            this.f92379b = System.currentTimeMillis();
            this.f92378a = 0L;
            a4.b("Application is in foreground");
        }
    }

    protected void a(Activity activity) {
        a4.b("setCurrentActivityRunning was called");
        if (this.f92387j || activity == null || this.f92384g != null) {
            return;
        }
        this.f92385h = activity.getClass().getName();
        this.f92384g = Integer.valueOf(activity.hashCode());
        this.f92386i.add(activity);
        b(activity);
        this.f92380c = false;
        this.f92387j = true;
        this.f92388k = true;
        a4.b("setCurrentActivityRunning done");
    }

    public void b(f fVar) {
        ArrayList<f> arrayList = this.f92383f;
        if (arrayList == null || fVar == null) {
            return;
        }
        arrayList.remove(fVar);
    }

    public void a(f fVar) {
        ArrayList<f> arrayList = this.f92383f;
        if (arrayList == null || fVar == null) {
            return;
        }
        arrayList.add(fVar);
    }

    public void b(g gVar) {
        ArrayList<g> arrayList = this.f92381d;
        if (arrayList == null || gVar == null) {
            return;
        }
        arrayList.remove(gVar);
    }

    public void a(g gVar) {
        ArrayList<g> arrayList = this.f92381d;
        if (arrayList == null || gVar == null) {
            return;
        }
        arrayList.add(gVar);
    }

    public void b(h hVar) {
        if (hVar != null) {
            try {
                ArrayList<h> arrayList = this.f92382e;
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
                ArrayList<h> arrayList = this.f92382e;
                if (arrayList == null || arrayList.contains(hVar)) {
                    return;
                }
                this.f92382e.add(hVar);
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    protected boolean a(String str) {
        String strA = a();
        if (this.f92387j && strA != null && strA.equals(str)) {
            a4.b("isActivityRunning current activity: " + strA);
            return true;
        }
        List<Activity> list = this.f92386i;
        if (list != null && !list.isEmpty()) {
            strA = this.f92386i.get(0).getClass().getName();
        }
        a4.b("isActivityRunning current activity: " + strA);
        return strA != null && strA.equals(str);
    }
}
