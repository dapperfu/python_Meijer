package com.adobe.marketing.mobile.assurance.internal;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import com.adobe.marketing.mobile.C6446e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
class z {

    /* renamed from: a, reason: collision with root package name */
    private final c f62330a;

    /* renamed from: b, reason: collision with root package name */
    private final E f62331b;

    /* renamed from: c, reason: collision with root package name */
    private final List<r> f62332c;

    /* renamed from: d, reason: collision with root package name */
    private final C6424f f62333d;

    /* renamed from: e, reason: collision with root package name */
    private final b f62334e;

    /* renamed from: f, reason: collision with root package name */
    private C6442y f62335f;

    /* renamed from: g, reason: collision with root package name */
    private List<C6430l> f62336g;

    /* renamed from: h, reason: collision with root package name */
    private final Y f62337h;

    /* renamed from: i, reason: collision with root package name */
    private final B f62338i;

    class a implements B {
        @Override // com.adobe.marketing.mobile.assurance.internal.B
        public void b(EnumC6425g enumC6425g) {
        }

        a() {
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.B
        public void a() {
            if (z.this.f62336g == null) {
                return;
            }
            z.this.f62336g.clear();
            z.this.f62336g = null;
        }
    }

    static class b {
        C6442y a(String str, String str2, EnumC6426h enumC6426h, E e10, List<r> list, C6424f c6424f, List<C6430l> list2, B b10, X x10) {
            return new C6442y(e10, str, str2, enumC6426h, c6424f, list, list2, x10, b10);
        }

        b() {
        }
    }

    static class c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        private final z f62340a;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Q5.t.e("Assurance", "AssuranceSessionOrchestrator", "Session Activity Hook - onActivityResumed called " + activity.getClass().getCanonicalName(), new Object[0]);
            C6442y c6442yD = this.f62340a.d();
            if (c6442yD != null) {
                c6442yD.s(activity);
            }
        }

        c(z zVar) {
            this.f62340a = zVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Uri data = activity.getIntent().getData();
            if (data != null) {
                C6446e.b(data.toString());
            }
            Q5.t.e("Assurance", "AssuranceSessionOrchestrator", "Session Activity Hook - onActivityCreated called " + activity.getClass().getCanonicalName(), new Object[0]);
        }
    }

    z(Application application, E e10, List<r> list, C6424f c6424f) {
        this(application, e10, list, c6424f, new b());
    }

    synchronized void c(String str, EnumC6426h enumC6426h, String str2, B b10, X x10) {
        if (this.f62335f != null) {
            Q5.t.b("Assurance", "AssuranceSessionOrchestrator", "An active session already exists. Cannot create a new one.", new Object[0]);
            return;
        }
        C6442y c6442yA = this.f62334e.a(str, str2, enumC6426h, this.f62331b, this.f62332c, this.f62333d, this.f62336g, b10, x10);
        this.f62335f = c6442yA;
        c6442yA.v(this.f62338i);
        this.f62331b.k(str);
        this.f62335f.j();
    }

    synchronized void g(boolean z10) {
        try {
            Q5.t.a("Assurance", "AssuranceSessionOrchestrator", "Terminating active session purging Assurance shared state", new Object[0]);
            if (z10 && this.f62336g != null) {
                Q5.t.a("Assurance", "AssuranceSessionOrchestrator", "Clearing the queued events.", new Object[0]);
                this.f62336g.clear();
                this.f62336g = null;
            }
            this.f62331b.a();
            C6442y c6442y = this.f62335f;
            if (c6442y != null) {
                c6442y.w(this.f62338i);
                this.f62335f.k();
                this.f62335f = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    z(Application application, E e10, List<r> list, C6424f c6424f, b bVar) {
        this.f62338i = new a();
        this.f62331b = e10;
        this.f62332c = list;
        this.f62333d = c6424f;
        c cVar = new c(this);
        this.f62330a = cVar;
        this.f62336g = new ArrayList();
        this.f62334e = bVar;
        Y y10 = new Y(this);
        this.f62337h = y10;
        application.registerActivityLifecycleCallbacks(cVar);
        C6423e.f62233a.c(e10, y10);
    }

    C6442y d() {
        return this.f62335f;
    }

    void e(C6430l c6430l) {
        if (c6430l == null) {
            return;
        }
        C6442y c6442y = this.f62335f;
        if (c6442y != null) {
            c6442y.u(c6430l);
        }
        List<C6430l> list = this.f62336g;
        if (list != null) {
            list.add(c6430l);
        }
    }

    boolean f() {
        String strA = this.f62333d.a();
        Q5.t.a("Assurance", "AssuranceSessionOrchestrator", "Attempting to reconnect to stored URL: " + strA, new Object[0]);
        if (f6.i.a(strA)) {
            return false;
        }
        Uri uri = Uri.parse(strA);
        String queryParameter = uri.getQueryParameter("sessionId");
        if (f6.i.a(queryParameter)) {
            return false;
        }
        String queryParameter2 = uri.getQueryParameter("token");
        if (f6.i.a(queryParameter2)) {
            return false;
        }
        EnumC6426h enumC6426hB = F.b(uri);
        Q5.t.e("Assurance", "AssuranceSessionOrchestrator", "Initializing Assurance session. %s using stored connection details:%s ", queryParameter, strA);
        c(queryParameter, enumC6426hB, queryParameter2, null, X.PIN);
        return true;
    }
}
