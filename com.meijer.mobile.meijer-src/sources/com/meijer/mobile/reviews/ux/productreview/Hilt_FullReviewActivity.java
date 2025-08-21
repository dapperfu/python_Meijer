package com.meijer.mobile.reviews.ux.productreview;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.f0;
import f.InterfaceC13892b;
import su.C17167a;
import tu.C17287a;
import wu.InterfaceC17927b;
import wu.InterfaceC17928c;

/* loaded from: classes12.dex */
public abstract class Hilt_FullReviewActivity extends AppCompatActivity implements InterfaceC17928c {

    /* renamed from: r, reason: collision with root package name */
    private tu.h f116423r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C17287a f116424s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f116425t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f116426u = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_FullReviewActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // wu.InterfaceC17928c
    public final C17287a componentManager() {
        if (this.f116424s == null) {
            synchronized (this.f116425t) {
                try {
                    if (this.f116424s == null) {
                        this.f116424s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f116424s;
    }

    protected C17287a createComponentManager() {
        return new C17287a(this);
    }

    protected void inject() {
        if (this.f116426u) {
            return;
        }
        this.f116426u = true;
        ((InterfaceC12835a0) generatedComponent()).n((FullReviewActivity) wu.f.a(this));
    }

    Hilt_FullReviewActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof InterfaceC17927b) {
            tu.h hVarB = componentManager().b();
            this.f116423r = hVarB;
            if (hVarB.b()) {
                this.f116423r.c(getDefaultViewModelCreationExtras());
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

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        tu.h hVar = this.f116423r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
