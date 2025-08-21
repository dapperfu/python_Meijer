package com.meijer.mobile.meijer.activity.find.fragment;

import an.v0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.view.f0;
import com.meijer.mobile.meijer.activity.fragment.MeijerFragment;
import pu.C16547a;
import su.C17167a;
import tu.C17293g;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_ProductsFragment extends MeijerFragment implements InterfaceC17928c {

    /* renamed from: a, reason: collision with root package name */
    private ContextWrapper f107636a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f107637b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C17293g f107638c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f107639d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f107640e = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    private void initializeComponentContext() {
        if (this.f107636a == null) {
            this.f107636a = C17293g.b(super.getContext(), this);
            this.f107637b = C16547a.a(super.getContext());
        }
    }

    @Override // wu.InterfaceC17928c
    public final C17293g componentManager() {
        if (this.f107638c == null) {
            synchronized (this.f107639d) {
                try {
                    if (this.f107638c == null) {
                        this.f107638c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f107638c;
    }

    protected C17293g createComponentManager() {
        return new C17293g(this);
    }

    protected void inject() {
        if (this.f107640e) {
            return;
        }
        this.f107640e = true;
        ((v0) generatedComponent()).c((ProductsFragment) wu.f.a(this));
    }

    Hilt_ProductsFragment() {
    }

    @Override // wu.InterfaceC17927b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f107637b) {
            return null;
        }
        initializeComponentContext();
        return this.f107636a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.view.InterfaceC6162j
    public f0.c getDefaultViewModelProviderFactory() {
        return C17167a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C17293g.c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f107636a;
        wu.d.d(contextWrapper == null || C17293g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
