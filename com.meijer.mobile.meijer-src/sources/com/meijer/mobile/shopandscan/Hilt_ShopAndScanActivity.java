package com.meijer.mobile.shopandscan;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.f0;
import f.InterfaceC13892b;
import su.C17167a;
import tu.C17287a;
import wu.InterfaceC17927b;
import wu.InterfaceC17928c;

/* loaded from: classes12.dex */
public abstract class Hilt_ShopAndScanActivity extends AppCompatActivity implements InterfaceC17928c {

    /* renamed from: r, reason: collision with root package name */
    private tu.h f117678r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C17287a f117679s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f117680t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f117681u = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_ShopAndScanActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // wu.InterfaceC17928c
    public final C17287a componentManager() {
        if (this.f117679s == null) {
            synchronized (this.f117680t) {
                try {
                    if (this.f117679s == null) {
                        this.f117679s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f117679s;
    }

    protected C17287a createComponentManager() {
        return new C17287a(this);
    }

    protected void inject() {
        if (this.f117681u) {
            return;
        }
        this.f117681u = true;
        ((g) generatedComponent()).L0((ShopAndScanActivity) wu.f.a(this));
    }

    Hilt_ShopAndScanActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof InterfaceC17927b) {
            tu.h hVarB = componentManager().b();
            this.f117678r = hVarB;
            if (hVarB.b()) {
                this.f117678r.c(getDefaultViewModelCreationExtras());
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
        tu.h hVar = this.f117678r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
