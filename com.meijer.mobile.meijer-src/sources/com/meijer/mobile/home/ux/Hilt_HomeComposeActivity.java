package com.meijer.mobile.home.ux;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.view.f0;
import f.InterfaceC13892b;
import su.C17167a;
import tu.C17287a;
import wu.InterfaceC17927b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
public abstract class Hilt_HomeComposeActivity extends FragmentActivity implements InterfaceC17928c {

    /* renamed from: r, reason: collision with root package name */
    private tu.h f98682r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C17287a f98683s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f98684t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f98685u = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_HomeComposeActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // wu.InterfaceC17928c
    public final C17287a componentManager() {
        if (this.f98683s == null) {
            synchronized (this.f98684t) {
                try {
                    if (this.f98683s == null) {
                        this.f98683s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f98683s;
    }

    protected C17287a createComponentManager() {
        return new C17287a(this);
    }

    protected void inject() {
        if (this.f98685u) {
            return;
        }
        this.f98685u = true;
        ((T) generatedComponent()).u((HomeComposeActivity) wu.f.a(this));
    }

    Hilt_HomeComposeActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof InterfaceC17927b) {
            tu.h hVarB = componentManager().b();
            this.f98682r = hVarB;
            if (hVarB.b()) {
                this.f98682r.c(getDefaultViewModelCreationExtras());
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        tu.h hVar = this.f98682r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
