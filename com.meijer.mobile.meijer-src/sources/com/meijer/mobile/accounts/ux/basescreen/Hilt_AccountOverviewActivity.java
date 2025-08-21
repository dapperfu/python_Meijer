package com.meijer.mobile.accounts.ux.basescreen;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13892b;
import su.C17167a;
import tu.C17287a;
import wu.InterfaceC17927b;
import wu.InterfaceC17928c;

/* loaded from: classes8.dex */
public abstract class Hilt_AccountOverviewActivity extends ComponentActivity implements InterfaceC17928c {

    /* renamed from: r, reason: collision with root package name */
    private tu.h f95109r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C17287a f95110s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f95111t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f95112u = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_AccountOverviewActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // wu.InterfaceC17928c
    public final C17287a componentManager() {
        if (this.f95110s == null) {
            synchronized (this.f95111t) {
                try {
                    if (this.f95110s == null) {
                        this.f95110s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f95110s;
    }

    protected C17287a createComponentManager() {
        return new C17287a(this);
    }

    protected void inject() {
        if (this.f95112u) {
            return;
        }
        this.f95112u = true;
        ((n) generatedComponent()).k1((AccountOverviewActivity) wu.f.a(this));
    }

    Hilt_AccountOverviewActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof InterfaceC17927b) {
            tu.h hVarB = componentManager().b();
            this.f95109r = hVarB;
            if (hVarB.b()) {
                this.f95109r.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // wu.InterfaceC17927b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.view.ComponentActivity, androidx.view.InterfaceC6162j
    public f0.c getDefaultViewModelProviderFactory() {
        return C17167a.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        tu.h hVar = this.f95109r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
