package com.meijer.mobile.subscription.ux.subscription;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes11.dex */
public abstract class Hilt_SubscriptionActivity extends ComponentActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f118945r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f118946s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f118947t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f118948u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_SubscriptionActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f118946s == null) {
            synchronized (this.f118947t) {
                try {
                    if (this.f118946s == null) {
                        this.f118946s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f118946s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f118948u) {
            return;
        }
        this.f118948u = true;
        ((v) generatedComponent()).g0((SubscriptionActivity) Au.f.a(this));
    }

    Hilt_SubscriptionActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f118945r = hVarB;
            if (hVarB.b()) {
                this.f118945r.c(getDefaultViewModelCreationExtras());
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
        xu.h hVar = this.f118945r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
