package com.meijer.mobile.wic.ux;

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
public abstract class Hilt_WicLoginActivity extends ComponentActivity implements InterfaceC17928c {

    /* renamed from: r, reason: collision with root package name */
    private tu.h f120359r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C17287a f120360s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f120361t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f120362u = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_WicLoginActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // wu.InterfaceC17928c
    public final C17287a componentManager() {
        if (this.f120360s == null) {
            synchronized (this.f120361t) {
                try {
                    if (this.f120360s == null) {
                        this.f120360s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f120360s;
    }

    protected C17287a createComponentManager() {
        return new C17287a(this);
    }

    protected void inject() {
        if (this.f120362u) {
            return;
        }
        this.f120362u = true;
        ((b) generatedComponent()).U0((WicLoginActivity) wu.f.a(this));
    }

    Hilt_WicLoginActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof InterfaceC17927b) {
            tu.h hVarB = componentManager().b();
            this.f120359r = hVarB;
            if (hVarB.b()) {
                this.f120359r.c(getDefaultViewModelCreationExtras());
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
        tu.h hVar = this.f120359r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
