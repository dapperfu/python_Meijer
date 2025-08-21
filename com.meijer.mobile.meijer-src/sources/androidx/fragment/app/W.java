package androidx.fragment.app;

import V2.CreationExtras;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.view.AbstractC6165l;
import androidx.view.C6141O;
import androidx.view.C6146U;
import androidx.view.C6174u;
import androidx.view.InterfaceC6162j;
import androidx.view.f0;
import androidx.view.g0;
import androidx.view.h0;
import x4.C18086f;
import x4.C18088h;
import x4.InterfaceC18089i;

/* loaded from: classes.dex */
class W implements InterfaceC6162j, InterfaceC18089i, h0 {

    /* renamed from: a, reason: collision with root package name */
    private final Fragment f55182a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f55183b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f55184c;

    /* renamed from: d, reason: collision with root package name */
    private f0.c f55185d;

    /* renamed from: e, reason: collision with root package name */
    private C6174u f55186e = null;

    /* renamed from: f, reason: collision with root package name */
    private C18088h f55187f = null;

    void a(AbstractC6165l.a aVar) {
        this.f55186e.i(aVar);
    }

    void b() {
        if (this.f55186e == null) {
            this.f55186e = new C6174u(this);
            C18088h c18088hA = C18088h.a(this);
            this.f55187f = c18088hA;
            c18088hA.c();
            this.f55184c.run();
        }
    }

    boolean c() {
        return this.f55186e != null;
    }

    void d(Bundle bundle) {
        this.f55187f.d(bundle);
    }

    void e(Bundle bundle) {
        this.f55187f.e(bundle);
    }

    void f(AbstractC6165l.b bVar) {
        this.f55186e.n(bVar);
    }

    @Override // androidx.view.InterfaceC6162j
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f55182a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        V2.b bVar = new V2.b();
        if (application != null) {
            bVar.c(f0.a.f55485h, application);
        }
        bVar.c(C6141O.f55430a, this.f55182a);
        bVar.c(C6141O.f55431b, this);
        if (this.f55182a.getArguments() != null) {
            bVar.c(C6141O.f55432c, this.f55182a.getArguments());
        }
        return bVar;
    }

    @Override // androidx.view.InterfaceC6162j
    public f0.c getDefaultViewModelProviderFactory() {
        Application application;
        f0.c defaultViewModelProviderFactory = this.f55182a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f55182a.mDefaultFactory)) {
            this.f55185d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f55185d == null) {
            Context applicationContext = this.f55182a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            Fragment fragment = this.f55182a;
            this.f55185d = new C6146U(application, fragment, fragment.getArguments());
        }
        return this.f55185d;
    }

    W(Fragment fragment, g0 g0Var, Runnable runnable) {
        this.f55182a = fragment;
        this.f55183b = g0Var;
        this.f55184c = runnable;
    }

    @Override // androidx.view.InterfaceC6172s
    public AbstractC6165l getLifecycle() {
        b();
        return this.f55186e;
    }

    @Override // x4.InterfaceC18089i
    public C18086f getSavedStateRegistry() {
        b();
        return this.f55187f.getSavedStateRegistry();
    }

    @Override // androidx.view.h0
    /* renamed from: getViewModelStore */
    public g0 getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String() {
        b();
        return this.f55183b;
    }
}
