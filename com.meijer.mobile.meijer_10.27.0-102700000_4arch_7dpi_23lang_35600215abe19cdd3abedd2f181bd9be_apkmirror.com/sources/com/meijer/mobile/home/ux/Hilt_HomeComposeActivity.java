package com.meijer.mobile.home.ux;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes9.dex */
public abstract class Hilt_HomeComposeActivity extends FragmentActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f97824r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f97825s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f97826t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f97827u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_HomeComposeActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f97825s == null) {
            synchronized (this.f97826t) {
                try {
                    if (this.f97825s == null) {
                        this.f97825s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f97825s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f97827u) {
            return;
        }
        this.f97827u = true;
        ((T) generatedComponent()).u((HomeComposeActivity) Au.f.a(this));
    }

    Hilt_HomeComposeActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f97824r = hVarB;
            if (hVarB.b()) {
                this.f97824r.c(getDefaultViewModelCreationExtras());
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        xu.h hVar = this.f97824r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
