package com.meijer.mobile.scanner.ux.activity;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes11.dex */
public abstract class Hilt_ScannerDemoActivity extends ComponentActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f116519r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f116520s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f116521t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f116522u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_ScannerDemoActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f116520s == null) {
            synchronized (this.f116521t) {
                try {
                    if (this.f116520s == null) {
                        this.f116520s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f116520s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f116522u) {
            return;
        }
        this.f116522u = true;
        ((A) generatedComponent()).o((ScannerDemoActivity) Au.f.a(this));
    }

    Hilt_ScannerDemoActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f116519r = hVarB;
            if (hVarB.b()) {
                this.f116519r.c(getDefaultViewModelCreationExtras());
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
        xu.h hVar = this.f116519r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
