package com.meijer.mobile.meijer.activity.find;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes9.dex */
abstract class Hilt_ImageDetailActivity extends ComponentActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f106466r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f106467s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f106468t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f106469u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_ImageDetailActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f106467s == null) {
            synchronized (this.f106468t) {
                try {
                    if (this.f106467s == null) {
                        this.f106467s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f106467s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f106469u) {
            return;
        }
        this.f106469u = true;
        ((InterfaceC12088h0) generatedComponent()).m((ImageDetailActivity) Au.f.a(this));
    }

    Hilt_ImageDetailActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f106466r = hVarB;
            if (hVarB.b()) {
                this.f106466r.c(getDefaultViewModelCreationExtras());
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

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        xu.h hVar = this.f106466r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
