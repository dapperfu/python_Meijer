package com.meijer.mobile.meijer.activity.orders;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13892b;
import su.C17167a;
import tu.C17287a;
import wu.InterfaceC17927b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_OrdersActivity extends ComponentActivity implements InterfaceC17928c {

    /* renamed from: r, reason: collision with root package name */
    private tu.h f111113r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C17287a f111114s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f111115t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f111116u = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_OrdersActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // wu.InterfaceC17928c
    public final C17287a componentManager() {
        if (this.f111114s == null) {
            synchronized (this.f111115t) {
                try {
                    if (this.f111114s == null) {
                        this.f111114s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f111114s;
    }

    protected C17287a createComponentManager() {
        return new C17287a(this);
    }

    protected void inject() {
        if (this.f111116u) {
            return;
        }
        this.f111116u = true;
        ((w0) generatedComponent()).G0((OrdersActivity) wu.f.a(this));
    }

    Hilt_OrdersActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof InterfaceC17927b) {
            tu.h hVarB = componentManager().b();
            this.f111113r = hVarB;
            if (hVarB.b()) {
                this.f111113r.c(getDefaultViewModelCreationExtras());
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
        tu.h hVar = this.f111113r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
