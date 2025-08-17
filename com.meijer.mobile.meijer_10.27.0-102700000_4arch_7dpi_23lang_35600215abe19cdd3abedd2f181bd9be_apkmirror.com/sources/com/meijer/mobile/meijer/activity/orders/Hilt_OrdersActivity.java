package com.meijer.mobile.meijer.activity.orders;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes9.dex */
abstract class Hilt_OrdersActivity extends ComponentActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f110252r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f110253s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f110254t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f110255u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_OrdersActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f110253s == null) {
            synchronized (this.f110254t) {
                try {
                    if (this.f110253s == null) {
                        this.f110253s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f110253s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f110255u) {
            return;
        }
        this.f110255u = true;
        ((w0) generatedComponent()).G0((OrdersActivity) Au.f.a(this));
    }

    Hilt_OrdersActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f110252r = hVarB;
            if (hVarB.b()) {
                this.f110252r.c(getDefaultViewModelCreationExtras());
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
        xu.h hVar = this.f110252r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
