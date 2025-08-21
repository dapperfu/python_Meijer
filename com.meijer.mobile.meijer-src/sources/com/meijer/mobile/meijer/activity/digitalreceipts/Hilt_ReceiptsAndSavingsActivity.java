package com.meijer.mobile.meijer.activity.digitalreceipts;

import android.content.Context;
import android.os.Bundle;
import androidx.view.ComponentActivity;
import androidx.view.f0;
import f.InterfaceC13892b;
import su.C17167a;
import tu.C17287a;
import wu.InterfaceC17927b;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_ReceiptsAndSavingsActivity extends ComponentActivity implements InterfaceC17928c {

    /* renamed from: r, reason: collision with root package name */
    private tu.h f106322r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C17287a f106323s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f106324t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f106325u = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_ReceiptsAndSavingsActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // wu.InterfaceC17928c
    public final C17287a componentManager() {
        if (this.f106323s == null) {
            synchronized (this.f106324t) {
                try {
                    if (this.f106323s == null) {
                        this.f106323s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f106323s;
    }

    protected C17287a createComponentManager() {
        return new C17287a(this);
    }

    protected void inject() {
        if (this.f106325u) {
            return;
        }
        this.f106325u = true;
        ((InterfaceC12178o) generatedComponent()).g((ReceiptsAndSavingsActivity) wu.f.a(this));
    }

    Hilt_ReceiptsAndSavingsActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof InterfaceC17927b) {
            tu.h hVarB = componentManager().b();
            this.f106322r = hVarB;
            if (hVarB.b()) {
                this.f106322r.c(getDefaultViewModelCreationExtras());
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

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        tu.h hVar = this.f106322r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
