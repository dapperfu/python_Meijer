package com.meijer.mobile.scanner.ux.activity;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13892b;
import su.C17167a;
import tu.C17287a;
import wu.InterfaceC17927b;
import wu.InterfaceC17928c;

/* loaded from: classes12.dex */
public abstract class Hilt_ScannerDemoActivity extends ComponentActivity implements InterfaceC17928c {

    /* renamed from: r, reason: collision with root package name */
    private tu.h f117464r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C17287a f117465s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f117466t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f117467u = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_ScannerDemoActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // wu.InterfaceC17928c
    public final C17287a componentManager() {
        if (this.f117465s == null) {
            synchronized (this.f117466t) {
                try {
                    if (this.f117465s == null) {
                        this.f117465s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f117465s;
    }

    protected C17287a createComponentManager() {
        return new C17287a(this);
    }

    protected void inject() {
        if (this.f117467u) {
            return;
        }
        this.f117467u = true;
        ((A) generatedComponent()).o((ScannerDemoActivity) wu.f.a(this));
    }

    Hilt_ScannerDemoActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof InterfaceC17927b) {
            tu.h hVarB = componentManager().b();
            this.f117464r = hVarB;
            if (hVarB.b()) {
                this.f117464r.c(getDefaultViewModelCreationExtras());
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
        tu.h hVar = this.f117464r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
