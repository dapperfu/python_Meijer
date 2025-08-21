package com.meijer.mobile.meijer.search;

import Wi.o;
import android.content.Context;
import android.os.Bundle;
import androidx.view.f0;
import com.meijer.mobile.architecture.ComposeActivity;
import f.InterfaceC13892b;
import su.C17167a;
import tu.C17287a;
import wu.InterfaceC17927b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_SearchProductActivityCompose<VSU, IVS extends Wi.o<VSU>, VS extends IVS> extends ComposeActivity<VSU, IVS, VS> implements InterfaceC17928c {

    /* renamed from: w, reason: collision with root package name */
    private tu.h f113809w;

    /* renamed from: x, reason: collision with root package name */
    private volatile C17287a f113810x;

    /* renamed from: y, reason: collision with root package name */
    private final Object f113811y = new Object();

    /* renamed from: z, reason: collision with root package name */
    private boolean f113812z = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_SearchProductActivityCompose.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // wu.InterfaceC17928c
    public final C17287a componentManager() {
        if (this.f113810x == null) {
            synchronized (this.f113811y) {
                try {
                    if (this.f113810x == null) {
                        this.f113810x = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f113810x;
    }

    protected C17287a createComponentManager() {
        return new C17287a(this);
    }

    protected void inject() {
        if (this.f113812z) {
            return;
        }
        this.f113812z = true;
        ((X) generatedComponent()).O((SearchProductActivityCompose) wu.f.a(this));
    }

    Hilt_SearchProductActivityCompose() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof InterfaceC17927b) {
            tu.h hVarB = componentManager().b();
            this.f113809w = hVarB;
            if (hVarB.b()) {
                this.f113809w.c(getDefaultViewModelCreationExtras());
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

    @Override // com.meijer.mobile.architecture.ComposeActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // com.meijer.mobile.architecture.ComposeActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        tu.h hVar = this.f113809w;
        if (hVar != null) {
            hVar.a();
        }
    }
}
