package com.meijer.mobile.chatbot.ux;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes7.dex */
public abstract class Hilt_ChatBotActivity extends ComponentActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f95940r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f95941s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f95942t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f95943u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_ChatBotActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f95941s == null) {
            synchronized (this.f95942t) {
                try {
                    if (this.f95941s == null) {
                        this.f95941s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f95941s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f95943u) {
            return;
        }
        this.f95943u = true;
        ((f) generatedComponent()).i((ChatBotActivity) Au.f.a(this));
    }

    Hilt_ChatBotActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f95940r = hVarB;
            if (hVarB.b()) {
                this.f95940r.c(getDefaultViewModelCreationExtras());
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
        xu.h hVar = this.f95940r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
