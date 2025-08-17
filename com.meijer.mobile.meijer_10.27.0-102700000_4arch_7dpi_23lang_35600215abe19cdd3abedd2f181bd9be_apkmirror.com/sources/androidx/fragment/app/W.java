package androidx.fragment.app;

import V2.CreationExtras;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.view.AbstractC6023l;
import androidx.view.C5999O;
import androidx.view.C6004U;
import androidx.view.C6032u;
import androidx.view.InterfaceC6020j;
import androidx.view.f0;
import androidx.view.g0;
import androidx.view.h0;

/* loaded from: classes.dex */
class W implements InterfaceC6020j, x4.i, h0 {

    /* renamed from: a, reason: collision with root package name */
    private final Fragment f54958a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f54959b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f54960c;

    /* renamed from: d, reason: collision with root package name */
    private f0.c f54961d;

    /* renamed from: e, reason: collision with root package name */
    private C6032u f54962e = null;

    /* renamed from: f, reason: collision with root package name */
    private x4.h f54963f = null;

    void a(AbstractC6023l.a aVar) {
        this.f54962e.i(aVar);
    }

    void b() {
        if (this.f54962e == null) {
            this.f54962e = new C6032u(this);
            x4.h hVarA = x4.h.a(this);
            this.f54963f = hVarA;
            hVarA.c();
            this.f54960c.run();
        }
    }

    boolean c() {
        return this.f54962e != null;
    }

    void d(Bundle bundle) {
        this.f54963f.d(bundle);
    }

    void e(Bundle bundle) {
        this.f54963f.e(bundle);
    }

    void f(AbstractC6023l.b bVar) {
        this.f54962e.n(bVar);
    }

    @Override // androidx.view.InterfaceC6020j
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f54958a.requireContext().getApplicationContext();
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
            bVar.c(f0.a.f55261h, application);
        }
        bVar.c(C5999O.f55206a, this.f54958a);
        bVar.c(C5999O.f55207b, this);
        if (this.f54958a.getArguments() != null) {
            bVar.c(C5999O.f55208c, this.f54958a.getArguments());
        }
        return bVar;
    }

    @Override // androidx.view.InterfaceC6020j
    public f0.c getDefaultViewModelProviderFactory() {
        Application application;
        f0.c defaultViewModelProviderFactory = this.f54958a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f54958a.mDefaultFactory)) {
            this.f54961d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f54961d == null) {
            Context applicationContext = this.f54958a.requireContext().getApplicationContext();
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
            Fragment fragment = this.f54958a;
            this.f54961d = new C6004U(application, fragment, fragment.getArguments());
        }
        return this.f54961d;
    }

    W(Fragment fragment, g0 g0Var, Runnable runnable) {
        this.f54958a = fragment;
        this.f54959b = g0Var;
        this.f54960c = runnable;
    }

    @Override // androidx.view.InterfaceC6030s
    public AbstractC6023l getLifecycle() {
        b();
        return this.f54962e;
    }

    @Override // x4.i
    public x4.f getSavedStateRegistry() {
        b();
        return this.f54963f.getSavedStateRegistry();
    }

    @Override // androidx.view.h0
    /* renamed from: getViewModelStore */
    public g0 getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String() {
        b();
        return this.f54959b;
    }
}
