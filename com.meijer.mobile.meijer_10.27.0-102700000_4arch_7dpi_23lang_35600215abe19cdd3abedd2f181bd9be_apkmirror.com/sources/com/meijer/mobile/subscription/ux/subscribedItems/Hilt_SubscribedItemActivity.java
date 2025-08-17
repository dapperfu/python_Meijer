package com.meijer.mobile.subscription.ux.subscribedItems;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes11.dex */
public abstract class Hilt_SubscribedItemActivity extends ComponentActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f118758r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f118759s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f118760t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f118761u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_SubscribedItemActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f118759s == null) {
            synchronized (this.f118760t) {
                try {
                    if (this.f118759s == null) {
                        this.f118759s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f118759s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f118761u) {
            return;
        }
        this.f118761u = true;
        ((c) generatedComponent()).b((SubscribedItemActivity) Au.f.a(this));
    }

    Hilt_SubscribedItemActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f118758r = hVarB;
            if (hVarB.b()) {
                this.f118758r.c(getDefaultViewModelCreationExtras());
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
        xu.h hVar = this.f118758r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
