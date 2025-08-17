package com.meijer.mobile.accounts.ux.unauthenticated;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes7.dex */
public abstract class Hilt_UnauthenticatedBottomSheetActivity extends ComponentActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f94985r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f94986s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f94987t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f94988u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_UnauthenticatedBottomSheetActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f94986s == null) {
            synchronized (this.f94987t) {
                try {
                    if (this.f94986s == null) {
                        this.f94986s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f94986s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f94988u) {
            return;
        }
        this.f94988u = true;
        ((i) generatedComponent()).i0((UnauthenticatedBottomSheetActivity) Au.f.a(this));
    }

    Hilt_UnauthenticatedBottomSheetActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f94985r = hVarB;
            if (hVarB.b()) {
                this.f94985r.c(getDefaultViewModelCreationExtras());
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
        xu.h hVar = this.f94985r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
