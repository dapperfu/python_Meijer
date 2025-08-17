package com.meijer.mobile.mperks.ux;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes9.dex */
public abstract class Hilt_MperksFeatureActivity extends ComponentActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f113606r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f113607s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f113608t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f113609u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_MperksFeatureActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f113607s == null) {
            synchronized (this.f113608t) {
                try {
                    if (this.f113607s == null) {
                        this.f113607s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f113607s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f113609u) {
            return;
        }
        this.f113609u = true;
        ((d0) generatedComponent()).j((MperksFeatureActivity) Au.f.a(this));
    }

    Hilt_MperksFeatureActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f113606r = hVarB;
            if (hVarB.b()) {
                this.f113606r.c(getDefaultViewModelCreationExtras());
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
        xu.h hVar = this.f113606r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
