package com.meijer.mobile.rateandtip.ux;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes11.dex */
abstract class Hilt_RateAndTipActivity extends AppCompatActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f115036r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f115037s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f115038t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f115039u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_RateAndTipActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f115037s == null) {
            synchronized (this.f115038t) {
                try {
                    if (this.f115037s == null) {
                        this.f115037s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f115037s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f115039u) {
            return;
        }
        this.f115039u = true;
        ((j) generatedComponent()).e((RateAndTipActivity) Au.f.a(this));
    }

    Hilt_RateAndTipActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f115036r = hVarB;
            if (hVarB.b()) {
                this.f115036r.c(getDefaultViewModelCreationExtras());
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

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        xu.h hVar = this.f115036r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
