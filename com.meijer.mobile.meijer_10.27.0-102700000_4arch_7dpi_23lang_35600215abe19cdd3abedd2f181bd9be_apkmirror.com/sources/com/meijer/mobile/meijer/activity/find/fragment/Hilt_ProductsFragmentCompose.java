package com.meijer.mobile.meijer.activity.find.fragment;

import Zm.t0;
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
abstract class Hilt_ProductsFragmentCompose extends MeijerFragment implements Au.c {

    /* renamed from: a, reason: collision with root package name */
    private ContextWrapper f106785a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f106786b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C18101g f106787c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f106788d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f106789e = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    private void initializeComponentContext() {
        if (this.f106785a == null) {
            this.f106785a = C18101g.b(super.getContext(), this);
            this.f106786b = C17138a.a(super.getContext());
        }
    }

    @Override // Au.c
    public final C18101g componentManager() {
        if (this.f106787c == null) {
            synchronized (this.f106788d) {
                try {
                    if (this.f106787c == null) {
                        this.f106787c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f106787c;
    }

    protected C18101g createComponentManager() {
        return new C18101g(this);
    }

    protected void inject() {
        if (this.f106789e) {
            return;
        }
        this.f106789e = true;
        ((t0) generatedComponent()).g((ProductsFragmentCompose) Au.f.a(this));
    }

    Hilt_ProductsFragmentCompose() {
    }

    @Override // Au.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f106786b) {
            return null;
        }
        initializeComponentContext();
        return this.f106785a;
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
        ContextWrapper contextWrapper = this.f106785a;
        Au.d.d(contextWrapper == null || C18101g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
