package com.meijer.mobile.shoppinglist.di;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.view.f0;
import f.InterfaceC13782b;
import wu.C17864a;
import xu.C18095a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public abstract class Hilt_ShoppingListFeatureActivity extends AppCompatActivity implements Au.c {

    /* renamed from: r, reason: collision with root package name */
    private xu.h f117063r;

    /* renamed from: s, reason: collision with root package name */
    private volatile C18095a f117064s;

    /* renamed from: t, reason: collision with root package name */
    private final Object f117065t = new Object();

    /* renamed from: u, reason: collision with root package name */
    private boolean f117066u = false;

    class a implements InterfaceC13782b {
        a() {
        }

        @Override // f.InterfaceC13782b
        public void a(Context context) {
            Hilt_ShoppingListFeatureActivity.this.inject();
        }
    }

    private void _initHiltInternal() {
        addOnContextAvailableListener(new a());
    }

    @Override // Au.c
    public final C18095a componentManager() {
        if (this.f117064s == null) {
            synchronized (this.f117065t) {
                try {
                    if (this.f117064s == null) {
                        this.f117064s = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f117064s;
    }

    protected C18095a createComponentManager() {
        return new C18095a(this);
    }

    protected void inject() {
        if (this.f117066u) {
            return;
        }
        this.f117066u = true;
        ((c) generatedComponent()).W((ShoppingListFeatureActivity) Au.f.a(this));
    }

    Hilt_ShoppingListFeatureActivity() {
        _initHiltInternal();
    }

    private void initSavedStateHandleHolder() {
        if (getApplication() instanceof Au.b) {
            xu.h hVarB = componentManager().b();
            this.f117063r = hVarB;
            if (hVarB.b()) {
                this.f117063r.c(getDefaultViewModelCreationExtras());
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initSavedStateHandleHolder();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        xu.h hVar = this.f117063r;
        if (hVar != null) {
            hVar.a();
        }
    }
}
