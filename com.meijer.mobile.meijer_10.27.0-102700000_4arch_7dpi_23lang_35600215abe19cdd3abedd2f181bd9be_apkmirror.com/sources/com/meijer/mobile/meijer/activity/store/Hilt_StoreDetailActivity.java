package com.meijer.mobile.meijer.activity.store;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;
import xu.h;

/* loaded from: classes9.dex */
abstract class Hilt_StoreDetailActivity extends AppCompatActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private h f112535r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f112536s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f112537t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f112538u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_StoreDetailActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f112536s == null) {
            synchronized (this.f112537t) {
                try {
                    if (this.f112536s == null) {
                        this.f112536s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f112536s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f112538u) {
            return;
        }
        this.f112538u = true;
        ((e) generatedComponent()).O0((StoreDetailActivity) Au.f.a(this));
    }

    Hilt_StoreDetailActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            h hVarB = componentManager().b();
            this.f112535r = hVarB;
            if (hVarB.b()) {
                this.f112535r.c(getDefaultViewModelCreationExtras());
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
        h hVar = this.f112535r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
