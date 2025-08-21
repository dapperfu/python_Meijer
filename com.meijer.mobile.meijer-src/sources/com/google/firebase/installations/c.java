package com.google.firebase.installations;

import If.i;
import Of.d;
import Of.f;
import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.C5519m;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.google.android.gms.common.internal.r;
import com.google.firebase.installations.FirebaseInstallationsException;
import df.t;
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

/* loaded from: classes8.dex */
public class c implements Lf.e {

    /* renamed from: m, reason: collision with root package name */
    private static final Object f89577m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private static final ThreadFactory f89578n = new a();

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f89579a;

    /* renamed from: b, reason: collision with root package name */
    private final Of.c f89580b;

    /* renamed from: c, reason: collision with root package name */
    private final Nf.c f89581c;

    /* renamed from: d, reason: collision with root package name */
    private final h f89582d;

    /* renamed from: e, reason: collision with root package name */
    private final t<Nf.b> f89583e;

    /* renamed from: f, reason: collision with root package name */
    private final Lf.g f89584f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f89585g;

    /* renamed from: h, reason: collision with root package name */
    private final ExecutorService f89586h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f89587i;

    /* renamed from: j, reason: collision with root package name */
    private String f89588j;

    /* renamed from: k, reason: collision with root package name */
    private Set<Mf.a> f89589k;

    /* renamed from: l, reason: collision with root package name */
    private final List<g> f89590l;

    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f89591a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        @SuppressLint({"ThreadPoolCreation"})
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f89591a.getAndIncrement())));
        }

        a() {
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(final com.google.firebase.f fVar, Kf.b<i> bVar, ExecutorService executorService, Executor executor) {
        this(executorService, executor, fVar, new Of.c(fVar.k(), bVar), new Nf.c(fVar), h.c(), new t(new Kf.b() { // from class: Lf.a
            @Override // Kf.b
            public final Object get() {
                return com.google.firebase.installations.c.e(fVar);
            }
        }), new Lf.g());
    }

    private synchronized void A(String str) {
        this.f89588j = str;
    }

    private synchronized void B(Nf.d dVar, Nf.d dVar2) {
        if (this.f89589k.size() != 0 && !TextUtils.equals(dVar.d(), dVar2.d())) {
            Iterator<Mf.a> it = this.f89589k.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    private synchronized String n() {
        return this.f89588j;
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f89592a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f89593b;

        static {
            int[] iArr = new int[f.b.values().length];
            f89593b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89593b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89593b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f89592a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f89592a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static /* synthetic */ Nf.b e(com.google.firebase.f fVar) {
        return new Nf.b(fVar);
    }

    private AbstractC5516j<f> f() {
        C5517k c5517k = new C5517k();
        h(new d(this.f89582d, c5517k));
        return c5517k.a();
    }

    private AbstractC5516j<String> g() {
        C5517k c5517k = new C5517k();
        h(new e(c5517k));
        return c5517k.a();
    }

    private void h(g gVar) {
        synchronized (this.f89585g) {
            this.f89590l.add(gVar);
        }
    }

    private Nf.d k(Nf.d dVar) throws FirebaseInstallationsException {
        Of.f fVarE = this.f89580b.e(l(), dVar.d(), t(), dVar.f());
        int i10 = b.f89593b[fVarE.b().ordinal()];
        if (i10 == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f89582d.b());
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

    private Nf.b o() {
        return this.f89583e.get();
    }

    public static c q(com.google.firebase.f fVar) {
        r.b(fVar != null, "Null is not a valid value of FirebaseApp.");
        return (c) fVar.j(Lf.e.class);
    }

    /* JADX WARN: Finally extract failed */
    private Nf.d r() {
        Nf.d dVarD;
        synchronized (f89577m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f89579a.k(), "generatefid.lock");
                try {
                    dVarD = this.f89581c.d();
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
    private Nf.d s() {
        Nf.d dVarD;
        synchronized (f89577m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f89579a.k(), "generatefid.lock");
                try {
                    dVarD = this.f89581c.d();
                    if (dVarD.j()) {
                        dVarD = this.f89581c.b(dVarD.t(w(dVarD)));
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
    private void u(Nf.d dVar) {
        synchronized (f89577m) {
            try {
                com.google.firebase.installations.b bVarA = com.google.firebase.installations.b.a(this.f89579a.k(), "generatefid.lock");
                try {
                    this.f89581c.b(dVar);
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

    private String w(Nf.d dVar) {
        if ((!this.f89579a.m().equals("CHIME_ANDROID_SDK") && !this.f89579a.u()) || !dVar.m()) {
            return this.f89584f.a();
        }
        String strF = o().f();
        return TextUtils.isEmpty(strF) ? this.f89584f.a() : strF;
    }

    private void y(Exception exc) {
        synchronized (this.f89585g) {
            try {
                Iterator<g> it = this.f89590l.iterator();
                while (it.hasNext()) {
                    if (it.next().b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void z(Nf.d dVar) {
        synchronized (this.f89585g) {
            try {
                Iterator<g> it = this.f89590l.iterator();
                while (it.hasNext()) {
                    if (it.next().a(dVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    String l() {
        return this.f89579a.n().b();
    }

    String m() {
        return this.f89579a.n().c();
    }

    String t() {
        return this.f89579a.n().e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z10) {
        Nf.d dVarX;
        Nf.d dVarR = r();
        try {
            if (!dVarR.i() && !dVarR.l()) {
                if (!z10 && !this.f89582d.f(dVarR)) {
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
        Nf.d dVarS = s();
        if (z10) {
            dVarS = dVarS.p();
        }
        z(dVarS);
        this.f89587i.execute(new Runnable() { // from class: Lf.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f18424a.i(z10);
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

    private Nf.d x(Nf.d dVar) throws FirebaseInstallationsException {
        String strI;
        if (dVar.d() != null && dVar.d().length() == 11) {
            strI = o().i();
        } else {
            strI = null;
        }
        Of.d dVarD = this.f89580b.d(l(), dVar.d(), t(), m(), strI);
        int i10 = b.f89592a[dVarD.e().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return dVar.q("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        return dVar.s(dVarD.c(), dVarD.d(), this.f89582d.b(), dVarD.b().c(), dVarD.b().d());
    }

    @Override // Lf.e
    public AbstractC5516j<f> a(final boolean z10) {
        v();
        AbstractC5516j<f> abstractC5516jF = f();
        this.f89586h.execute(new Runnable() { // from class: Lf.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f18422a.j(z10);
            }
        });
        return abstractC5516jF;
    }

    @Override // Lf.e
    public AbstractC5516j<String> getId() {
        v();
        String strN = n();
        if (strN != null) {
            return C5519m.f(strN);
        }
        AbstractC5516j<String> abstractC5516jG = g();
        this.f89586h.execute(new Runnable() { // from class: Lf.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f18421a.j(false);
            }
        });
        return abstractC5516jG;
    }

    @SuppressLint({"ThreadPoolCreation"})
    c(ExecutorService executorService, Executor executor, com.google.firebase.f fVar, Of.c cVar, Nf.c cVar2, h hVar, t<Nf.b> tVar, Lf.g gVar) {
        this.f89585g = new Object();
        this.f89589k = new HashSet();
        this.f89590l = new ArrayList();
        this.f89579a = fVar;
        this.f89580b = cVar;
        this.f89581c = cVar2;
        this.f89582d = hVar;
        this.f89583e = tVar;
        this.f89584f = gVar;
        this.f89586h = executorService;
        this.f89587i = executor;
    }
}
