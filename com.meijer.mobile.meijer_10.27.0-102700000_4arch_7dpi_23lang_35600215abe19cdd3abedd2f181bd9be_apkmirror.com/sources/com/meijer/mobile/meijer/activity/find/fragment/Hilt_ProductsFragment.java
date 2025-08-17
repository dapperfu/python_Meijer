package com.meijer.mobile.meijer.activity.find.fragment;

import Zm.v0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.view.f0;
import com.meijer.mobile.meijer.activity.fragment.MeijerFragment;
import tu.C17138a;
import wu.C17864a;
import xu.C18101g;

/* loaded from: classes9.dex */
abstract class Hilt_ProductsFragment extends MeijerFragment implements Au.c {

    /* renamed from: a, reason: collision with root package name */
    private ContextWrapper f106780a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f106781b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C18101g f106782c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f106783d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f106784e = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    private void initializeComponentContext() {
        if (this.f106780a == null) {
            this.f106780a = C18101g.b(super.getContext(), this);
            this.f106781b = C17138a.a(super.getContext());
        }
    }

    @Override // Au.c
    public final C18101g componentManager() {
        if (this.f106782c == null) {
            synchronized (this.f106783d) {
                try {
                    if (this.f106782c == null) {
                        this.f106782c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f106782c;
    }

    protected C18101g createComponentManager() {
        return new C18101g(this);
    }

    protected void inject() {
        if (this.f106784e) {
            return;
        }
        this.f106784e = true;
        ((v0) generatedComponent()).c((ProductsFragment) Au.f.a(this));
    }

    Hilt_ProductsFragment() {
    }

    @Override // Au.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f106781b) {
            return null;
        }
        initializeComponentContext();
        return this.f106780a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.view.InterfaceC6020j
    public f0.c getDefaultViewModelProviderFactory() {
        return C17864a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C18101g.c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f106780a;
        Au.d.d(contextWrapper == null || C18101g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
