package com.meijer.mobile.accounts.ux.preferences;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes7.dex */
public abstract class Hilt_PreferenceScreenActivity extends ComponentActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f94586r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f94587s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f94588t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f94589u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_PreferenceScreenActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f94587s == null) {
            synchronized (this.f94588t) {
                try {
                    if (this.f94587s == null) {
                        this.f94587s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f94587s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f94589u) {
            return;
        }
        this.f94589u = true;
        ((b) generatedComponent()).b1((PreferenceScreenActivity) Au.f.a(this));
    }

    Hilt_PreferenceScreenActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f94586r = hVarB;
            if (hVarB.b()) {
                this.f94586r.c(getDefaultViewModelCreationExtras());
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
        xu.h hVar = this.f94586r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
