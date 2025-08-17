package com.meijer.mobile.meijer.search;

import Vi.o;
import android.content.Context;
import android.os.Bundle;
import androidx.view.f0;
import com.meijer.mobile.architecture.ComposeActivity;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* loaded from: classes9.dex */
abstract class Hilt_SearchProductActivityCompose<VSU, IVS extends Vi.o<VSU>, VS extends IVS> extends ComposeActivity<VSU, IVS, VS> implements Au.c {

    /* renamed from: w, reason: collision with root package name */
    private xu.h f112957w;

    /* renamed from: x, reason: collision with root package name */
    private volatile C18095a f112958x;

    /* renamed from: y, reason: collision with root package name */
    private final Object f112959y = new Object();

    /* renamed from: z, reason: collision with root package name */
    private boolean f112960z = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_SearchProductActivityCompose.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f112958x == null) {
            synchronized (this.f112959y) {
                try {
                    if (this.f112958x == null) {
                        this.f112958x = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f112958x;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f112960z) {
            return;
        }
        this.f112960z = true;
        ((X) generatedComponent()).O((SearchProductActivityCompose) Au.f.a(this));
    }

    Hilt_SearchProductActivityCompose() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f112957w = hVarB;
            if (hVarB.b()) {
                this.f112957w.c(getDefaultViewModelCreationExtras());
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

    @Override // com.meijer.mobile.architecture.ComposeActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // com.meijer.mobile.architecture.ComposeActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        xu.h hVar = this.f112957w;
        if (hVar != null) {
            hVar.a();
        }
    }
}
