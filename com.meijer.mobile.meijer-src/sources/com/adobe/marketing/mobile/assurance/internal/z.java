package com.adobe.marketing.mobile.assurance.internal;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import com.adobe.marketing.mobile.C6571e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
class z {

    /* renamed from: a, reason: collision with root package name */
    private final c f63169a;

    /* renamed from: b, reason: collision with root package name */
    private final E f63170b;

    /* renamed from: c, reason: collision with root package name */
    private final List<r> f63171c;

    /* renamed from: d, reason: collision with root package name */
    private final C6549f f63172d;

    /* renamed from: e, reason: collision with root package name */
    private final b f63173e;

    /* renamed from: f, reason: collision with root package name */
    private C6567y f63174f;

    /* renamed from: g, reason: collision with root package name */
    private List<C6555l> f63175g;

    /* renamed from: h, reason: collision with root package name */
    private final Y f63176h;

    /* renamed from: i, reason: collision with root package name */
    private final B f63177i;

    class a implements B {
        @Override // com.adobe.marketing.mobile.assurance.internal.B
        public void b(EnumC6550g enumC6550g) {
        }

        a() {
        }

        @Override // com.adobe.marketing.mobile.assurance.internal.B
        public void a() {
            if (z.this.f63175g == null) {
                return;
            }
            z.this.f63175g.clear();
            z.this.f63175g = null;
        }
    }

    static class b {
        C6567y a(String str, String str2, EnumC6551h enumC6551h, E e10, List<r> list, C6549f c6549f, List<C6555l> list2, B b10, X x10) {
            return new C6567y(e10, str, str2, enumC6551h, c6549f, list, list2, x10, b10);
        }

        b() {
        }
    }

    static class c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        private final z f63179a;

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
            R5.t.e("Assurance", "AssuranceSessionOrchestrator", "Session Activity Hook - onActivityResumed called " + activity.getClass().getCanonicalName(), new Object[0]);
            C6567y c6567yD = this.f63179a.d();
            if (c6567yD != null) {
                c6567yD.s(activity);
            }
        }

        c(z zVar) {
            this.f63179a = zVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Uri data = activity.getIntent().getData();
            if (data != null) {
                C6571e.b(data.toString());
            }
            R5.t.e("Assurance", "AssuranceSessionOrchestrator", "Session Activity Hook - onActivityCreated called " + activity.getClass().getCanonicalName(), new Object[0]);
        }
    }

    z(Application application, E e10, List<r> list, C6549f c6549f) {
        this(application, e10, list, c6549f, new b());
    }

    synchronized void c(String str, EnumC6551h enumC6551h, String str2, B b10, X x10) {
        if (this.f63174f != null) {
            R5.t.b("Assurance", "AssuranceSessionOrchestrator", "An active session already exists. Cannot create a new one.", new Object[0]);
            return;
        }
        C6567y c6567yA = this.f63173e.a(str, str2, enumC6551h, this.f63170b, this.f63171c, this.f63172d, this.f63175g, b10, x10);
        this.f63174f = c6567yA;
        c6567yA.v(this.f63177i);
        this.f63170b.k(str);
        this.f63174f.j();
    }

    synchronized void g(boolean z10) {
        try {
            R5.t.a("Assurance", "AssuranceSessionOrchestrator", "Terminating active session purging Assurance shared state", new Object[0]);
            if (z10 && this.f63175g != null) {
                R5.t.a("Assurance", "AssuranceSessionOrchestrator", "Clearing the queued events.", new Object[0]);
                this.f63175g.clear();
                this.f63175g = null;
            }
            this.f63170b.a();
            C6567y c6567y = this.f63174f;
            if (c6567y != null) {
                c6567y.w(this.f63177i);
                this.f63174f.k();
                this.f63174f = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    z(Application application, E e10, List<r> list, C6549f c6549f, b bVar) {
        this.f63177i = new a();
        this.f63170b = e10;
        this.f63171c = list;
        this.f63172d = c6549f;
        c cVar = new c(this);
        this.f63169a = cVar;
        this.f63175g = new ArrayList();
        this.f63173e = bVar;
        Y y10 = new Y(this);
        this.f63176h = y10;
        application.registerActivityLifecycleCallbacks(cVar);
        C6548e.f63072a.c(e10, y10);
    }

    C6567y d() {
        return this.f63174f;
    }

    void e(C6555l c6555l) {
        if (c6555l == null) {
            return;
        }
        C6567y c6567y = this.f63174f;
        if (c6567y != null) {
            c6567y.u(c6555l);
        }
        List<C6555l> list = this.f63175g;
        if (list != null) {
            list.add(c6555l);
        }
    }

    boolean f() {
        String strA = this.f63172d.a();
        R5.t.a("Assurance", "AssuranceSessionOrchestrator", "Attempting to reconnect to stored URL: " + strA, new Object[0]);
        if (g6.i.a(strA)) {
            return false;
        }
        Uri uri = Uri.parse(strA);
        String queryParameter = uri.getQueryParameter("sessionId");
        if (g6.i.a(queryParameter)) {
            return false;
        }
        String queryParameter2 = uri.getQueryParameter("token");
        if (g6.i.a(queryParameter2)) {
            return false;
        }
        EnumC6551h enumC6551hB = F.b(uri);
        R5.t.e("Assurance", "AssuranceSessionOrchestrator", "Initializing Assurance session. %s using stored connection details:%s ", queryParameter, strA);
        c(queryParameter, enumC6551hB, queryParameter2, null, X.PIN);
        return true;
    }
}
