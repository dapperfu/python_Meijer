package com.meijer.mobile.coupon.di;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.f0;
import f.InterfaceC13892b;
import su.C17167a;
import tu.C17287a;
import tu.h;
import wu.InterfaceC17927b;
import wu.InterfaceC17928c;
import wu.f;

/* loaded from: classes10.dex */
public abstract class Hilt_CouponFeatureActivity extends AppCompatActivity implements InterfaceC17928c {

    /* renamed from: r, reason: collision with root package name */
    private h f97323r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C17287a f97324s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f97325t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f97326u = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_CouponFeatureActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // wu.InterfaceC17928c
    public final C17287a componentManager() {
        if (this.f97324s == null) {
            synchronized (this.f97325t) {
                try {
                    if (this.f97324s == null) {
                        this.f97324s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f97324s;
    }

    protected C17287a createComponentManager() {
        return new C17287a(this);
    }

    protected void inject() {
        if (this.f97326u) {
            return;
        }
        this.f97326u = true;
        ((c) generatedComponent()).T0((CouponFeatureActivity) f.a(this));
    }

    Hilt_CouponFeatureActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof InterfaceC17927b) {
            h hVarB = componentManager().b();
            this.f97323r = hVarB;
            if (hVarB.b()) {
                this.f97323r.c(getDefaultViewModelCreationExtras());
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        h hVar = this.f97323r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
