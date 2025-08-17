package com.meijer.mobile.weeklyad;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes11.dex */
abstract class Hilt_WeeklyAdSelectionActivity extends ComponentActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f119138r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f119139s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f119140t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f119141u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_WeeklyAdSelectionActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f119139s == null) {
            synchronized (this.f119140t) {
                try {
                    if (this.f119139s == null) {
                        this.f119139s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f119139s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f119141u) {
            return;
        }
        this.f119141u = true;
        ((r) generatedComponent()).V0((WeeklyAdSelectionActivity) Au.f.a(this));
    }

    Hilt_WeeklyAdSelectionActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f119138r = hVarB;
            if (hVarB.b()) {
                this.f119138r.c(getDefaultViewModelCreationExtras());
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
        xu.h hVar = this.f119138r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
