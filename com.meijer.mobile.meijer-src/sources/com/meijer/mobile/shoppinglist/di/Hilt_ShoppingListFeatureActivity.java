package com.meijer.mobile.shoppinglist.di;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.f0;
import f.InterfaceC13892b;
import su.C17167a;
import tu.C17287a;
import wu.InterfaceC17927b;
import wu.InterfaceC17928c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public abstract class Hilt_ShoppingListFeatureActivity extends AppCompatActivity implements InterfaceC17928c {

    /* renamed from: r, reason: collision with root package name */
    private tu.h f118008r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C17287a f118009s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f118010t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f118011u = false;

    class a implements InterfaceC13892b {
        a() {
        }

        @Override // f.InterfaceC13892b
        public void a(Context context) {
            Hilt_ShoppingListFeatureActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // wu.InterfaceC17928c
    public final C17287a componentManager() {
        if (this.f118009s == null) {
            synchronized (this.f118010t) {
                try {
                    if (this.f118009s == null) {
                        this.f118009s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f118009s;
    }

    protected C17287a createComponentManager() {
        return new C17287a(this);
    }

    protected void inject() {
        if (this.f118011u) {
            return;
        }
        this.f118011u = true;
        ((c) generatedComponent()).W((ShoppingListFeatureActivity) wu.f.a(this));
    }

    Hilt_ShoppingListFeatureActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof InterfaceC17927b) {
            tu.h hVarB = componentManager().b();
            this.f118008r = hVarB;
            if (hVarB.b()) {
                this.f118008r.c(getDefaultViewModelCreationExtras());
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
        tu.h hVar = this.f118008r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
