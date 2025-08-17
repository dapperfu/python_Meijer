package com.meijer.mobile.shopandscan;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes11.dex */
public abstract class Hilt_ShopAndScanActivity extends AppCompatActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f116733r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f116734s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f116735t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f116736u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_ShopAndScanActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f116734s == null) {
            synchronized (this.f116735t) {
                try {
                    if (this.f116734s == null) {
                        this.f116734s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f116734s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f116736u) {
            return;
        }
        this.f116736u = true;
        ((g) generatedComponent()).L0((ShopAndScanActivity) Au.f.a(this));
    }

    Hilt_ShopAndScanActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f116733r = hVarB;
            if (hVarB.b()) {
                this.f116733r.c(getDefaultViewModelCreationExtras());
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
        xu.h hVar = this.f116733r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
