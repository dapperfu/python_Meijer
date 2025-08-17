package com.meijer.mobile.coupon.di;

import Au.f;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;
import xu.h;

/* loaded from: classes9.dex */
public abstract class Hilt_CouponFeatureActivity extends AppCompatActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private h f96465r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f96466s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f96467t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f96468u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_CouponFeatureActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f96466s == null) {
            synchronized (this.f96467t) {
                try {
                    if (this.f96466s == null) {
                        this.f96466s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f96466s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f96468u) {
            return;
        }
        this.f96468u = true;
        ((c) generatedComponent()).T0((CouponFeatureActivity) f.a(this));
    }

    Hilt_CouponFeatureActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            h hVarB = componentManager().b();
            this.f96465r = hVarB;
            if (hVarB.b()) {
                this.f96465r.c(getDefaultViewModelCreationExtras());
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
        h hVar = this.f96465r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
