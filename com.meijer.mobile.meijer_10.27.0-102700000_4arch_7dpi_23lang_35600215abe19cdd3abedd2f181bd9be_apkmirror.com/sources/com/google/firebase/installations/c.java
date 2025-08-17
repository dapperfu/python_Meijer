package com.google.firebase.installations;

import Gf.i;
import Mf.d;
import Mf.f;
import Td.AbstractC5232j;
import Td.C5233k;
import Td.C5235m;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import bf.t;
import com.google.android.gms.common.internal.r;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class c implements Jf.e {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f88737m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f88738n = new a();

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f88739a;

    /* renamed from: b, reason: collision with root package name */
    private final Mf.c f88740b;

    /* renamed from: c, reason: collision with root package name */
    private final Lf.c f88741c;

    /* renamed from: d, reason: collision with root package name */
    private final h f88742d;

    /* renamed from: e, reason: collision with root package name */
    private final t<Lf.b> f88743e;

    /* renamed from: f, reason: collision with root package name */
    private final Jf.g f88744f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f88745g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f88746h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f88747i;

    /* renamed from: j, reason: collision with root package name */
    private String f88748j;

    /* renamed from: k, reason: collision with root package name */
    private Set<Kf.a> f88749k;

    /* renamed from: l, reason: collision with root package name */
    private final List<g> f88750l;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f88751a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f88751a.getAndIncrement())));
        }

        a() {
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(final com.google.firebase.f fVar, If.b<i> bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new Mf.c(fVar.k(), bVar), new Lf.c(fVar), h.c(), new t(new If.b() { // from class: Jf.a
            @Override // If.b
            public final Object get() {
                return com.google.firebase.installations.c.e(fVar);
            }
        }), new Jf.g());
    }

    private synchronized void A(String str) {
        this.f88748j = str;
    }

    private synchronized void B(Lf.d dVar, Lf.d dVar2) {
        if (this.f88749k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<Kf.a> it = this.f88749k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    private synchronized String n() {
        return this.f88748j;
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f88752a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f88753b;

        static {
            int[] iArr = new int[f.b.values().length];
            f88753b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f88753b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f88753b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f88752a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f88752a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static /* synthetic */ Lf.b e(com.google.firebase.f fVar) {
        return new Lf.b(fVar);
    }

    private AbstractC5232j<f> f() {
        C5233k c5233k = new C5233k();
        h(new d(this.f88742d, c5233k));
        return c5233k.a();
    }

    private AbstractC5232j<String> g() {
        C5233k c5233k = new C5233k();
        h(new e(c5233k));
        return c5233k.a();
    }

    private void h(g gVar) {
        synchronized (this.f88745g) {
            this.f88750l.add(gVar);
        }
    }

    private Lf.d k(Lf.d dVar) throws FirebaseInstallationsException {
        Mf.f fVarE = this.f88740b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.f88753b[fVarE.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f88742d.b());
        }
        if (i10 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i10 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        A(null);
        return dVar.r();
    }

    private Lf.b o() {
        return this.f88743e.get();
    }

    public static c q(com.google.firebase.f fVar) {
        r.b(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) fVar.j(Jf.e.class);
    }

    /* JADX WARN: Finally extract failed */
    private Lf.d r() {
        Lf.d dVarD;
        synchronized (f88737m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f88739a.k(), "generatefid.lock");
                try {
                    dVarD = this.f88741c.d();
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVarD;
    }

    /* JADX WARN: Finally extract failed */
    private Lf.d s() {
        Lf.d dVarD;
        synchronized (f88737m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f88739a.k(), "generatefid.lock");
                try {
                    dVarD = this.f88741c.d();
                    if (dVarD.j()) {
                        dVarD = this.f88741c.b(dVarD.t(w(dVarD)));
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVarD;
    }

    /* JADX WARN: Finally extract failed */
    private void u(Lf.d dVar) {
        synchronized (f88737m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f88739a.k(), "generatefid.lock");
                try {
                    this.f88741c.b(dVar);
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private String w(Lf.d dVar) {
        if ((!this.f88739a.m().equals("CHIME_ANDROID_SDK") && !this.f88739a.u()) || !dVar.m()) {
            return this.f88744f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f88744f.a() : strF;
    }

    private void y(Exception exc) {
        synchronized (this.f88745g) {
            try {
                Iterator<g> it = this.f88750l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void z(Lf.d dVar) {
        synchronized (this.f88745g) {
            try {
                Iterator<g> it = this.f88750l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    String l() {
        return this.f88739a.n().b();
    }

    String m() {
        return this.f88739a.n().c();
    }

    String t() {
        return this.f88739a.n().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z10) {
        Lf.d dVarX;
        Lf.d dVarR = r();
        try {
            if (!dVarR.i() && !dVarR.l()) {
                if (!z10 && !this.f88742d.f(dVarR)) {
                    return;
                }
                dVarX = k(dVarR);
            } else {
                dVarX = x(dVarR);
            }
            u(dVarX);
            B(dVarR, dVarX);
            if (dVarX.k()) {
                A(dVarX.d());
            }
            if (dVarX.i()) {
                y(new FirebaseInstallationsException(FirebaseInstallationsException.a.BAD_CONFIG));
            } else if (dVarX.j()) {
                y(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            } else {
                z(dVarX);
            }
        } catch (FirebaseInstallationsException e10) {
            y(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(final boolean z10) {
        Lf.d dVarS = s();
        if (z10) {
            dVarS = dVarS.p();
        }
        z(dVarS);
        this.f88747i.execute(new Runnable() { // from class: Jf.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f15087a.i(z10);
            }
        });
    }

    public static c p() {
        return q(com.google.firebase.f.l());
    }

    private void v() {
        r.g(m(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.g(t(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.g(l(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(h.h(m()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        r.b(h.g(l()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private Lf.d x(Lf.d dVar) throws FirebaseInstallationsException {
        String strI;
        if (dVar.d() != null && dVar.d().length() == 11) {
            strI = o().i();
        } else {
            strI = null;
        }
        Mf.d dVarD = this.f88740b.d(l(), dVar.d(), t(), m(), strI);
        int i10 = b.f88752a[dVarD.e().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return dVar.q("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        return dVar.s(dVarD.c(), dVarD.d(), this.f88742d.b(), dVarD.b().c(), dVarD.b().d());
    }

    @Override // Jf.e
    public AbstractC5232j<f> a(final boolean z10) {
        v();
        AbstractC5232j<f> abstractC5232jF = f();
        this.f88746h.execute(new Runnable() { // from class: Jf.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f15085a.j(z10);
            }
        });
        return abstractC5232jF;
    }

    @Override // Jf.e
    public AbstractC5232j<String> getId() {
        v();
        String strN = n();
        if (strN != null) {
            return C5235m.f(strN);
        }
        AbstractC5232j<String> abstractC5232jG = g();
        this.f88746h.execute(new Runnable() { // from class: Jf.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f15084a.j(false);
            }
        });
        return abstractC5232jG;
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(ExecutorService executorService, Executor executor, com.google.firebase.f fVar, Mf.c cVar, Lf.c cVar2, h hVar, t<Lf.b> tVar, Jf.g gVar) {
        this.f88745g = new Object();
        this.f88749k = new HashSet();
        this.f88750l = new ArrayList();
        this.f88739a = fVar;
        this.f88740b = cVar;
        this.f88741c = cVar2;
        this.f88742d = hVar;
        this.f88743e = tVar;
        this.f88744f = gVar;
        this.f88746h = executorService;
        this.f88747i = executor;
    }
}
