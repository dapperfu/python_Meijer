package com.meijer.mobile.meijer.activity;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.f0;
import f.InterfaceC13892b;
import su.C17167a;
import tu.C17287a;
import wu.InterfaceC17927b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_UniversalLinkBypassActivity extends AppCompatActivity implements InterfaceC17928c {

    /* renamed from: r, reason: collision with root package name */
    private tu.h f101826r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C17287a f101827s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f101828t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f101829u = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_UniversalLinkBypassActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // wu.InterfaceC17928c
    public final C17287a componentManager() {
        if (this.f101827s == null) {
            synchronized (this.f101828t) {
                try {
                    if (this.f101827s == null) {
                        this.f101827s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f101827s;
    }

    protected C17287a createComponentManager() {
        return new C17287a(this);
    }

    protected void inject() {
        if (this.f101829u) {
            return;
        }
        this.f101829u = true;
        ((v) generatedComponent()).g1((UniversalLinkBypassActivity) wu.f.a(this));
    }

    Hilt_UniversalLinkBypassActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof InterfaceC17927b) {
            tu.h hVarB = componentManager().b();
            this.f101826r = hVarB;
            if (hVarB.b()) {
                this.f101826r.c(getDefaultViewModelCreationExtras());
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
        tu.h hVar = this.f101826r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
