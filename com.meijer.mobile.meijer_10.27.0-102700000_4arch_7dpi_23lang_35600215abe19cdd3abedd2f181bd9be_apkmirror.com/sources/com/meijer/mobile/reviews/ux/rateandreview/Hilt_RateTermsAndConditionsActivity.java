package com.meijer.mobile.reviews.ux.rateandreview;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes11.dex */
abstract class Hilt_RateTermsAndConditionsActivity extends AppCompatActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f116006r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f116007s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f116008t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f116009u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_RateTermsAndConditionsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f116007s == null) {
            synchronized (this.f116008t) {
                try {
                    if (this.f116007s == null) {
                        this.f116007s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f116007s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f116009u) {
            return;
        }
        this.f116009u = true;
        ((InterfaceC12776i0) generatedComponent()).j0((RateTermsAndConditionsActivity) Au.f.a(this));
    }

    Hilt_RateTermsAndConditionsActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f116006r = hVarB;
            if (hVarB.b()) {
                this.f116006r.c(getDefaultViewModelCreationExtras());
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
        xu.h hVar = this.f116006r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
