package com.meijer.mobile.wic.ux;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes11.dex */
public abstract class Hilt_WicLoginActivity extends ComponentActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f119386r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f119387s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f119388t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f119389u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_WicLoginActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f119387s == null) {
            synchronized (this.f119388t) {
                try {
                    if (this.f119387s == null) {
                        this.f119387s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f119387s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f119389u) {
            return;
        }
        this.f119389u = true;
        ((b) generatedComponent()).U0((WicLoginActivity) Au.f.a(this));
    }

    Hilt_WicLoginActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f119386r = hVarB;
            if (hVarB.b()) {
                this.f119386r.c(getDefaultViewModelCreationExtras());
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
        xu.h hVar = this.f119386r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
