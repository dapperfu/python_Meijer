package com.meijer.mobile.meijer.activity.digitalreceipts;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes9.dex */
abstract class Hilt_SelfRemediationHostActivity extends ComponentActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f105477r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f105478s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f105479t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f105480u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_SelfRemediationHostActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f105478s == null) {
            synchronized (this.f105479t) {
                try {
                    if (this.f105478s == null) {
                        this.f105478s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f105478s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f105480u) {
            return;
        }
        this.f105480u = true;
        ((X) generatedComponent()).r((SelfRemediationHostActivity) Au.f.a(this));
    }

    Hilt_SelfRemediationHostActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f105477r = hVarB;
            if (hVarB.b()) {
                this.f105477r.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // Au.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.view.ComponentActivity, androidx.view.InterfaceC6020j
    public f0.c getDefaultViewModelProviderFactory() {
        return C17864a.a(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        xu.h hVar = this.f105477r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
