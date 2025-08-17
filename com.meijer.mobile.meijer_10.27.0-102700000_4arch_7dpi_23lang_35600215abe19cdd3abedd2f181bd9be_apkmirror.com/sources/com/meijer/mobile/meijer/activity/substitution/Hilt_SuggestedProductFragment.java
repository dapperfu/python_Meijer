package com.meijer.mobile.meijer.activity.substitution;

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
abstract class Hilt_SuggestedProductFragment extends MeijerFragment implements Au.c {

    /* renamed from: a, reason: collision with root package name */
    private ContextWrapper f112797a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f112798b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C18101g f112799c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f112800d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f112801e = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    private void initializeComponentContext() {
        if (this.f112797a == null) {
            this.f112797a = C18101g.b(super.getContext(), this);
            this.f112798b = C17138a.a(super.getContext());
        }
    }

    @Override // Au.c
    public final C18101g componentManager() {
        if (this.f112799c == null) {
            synchronized (this.f112800d) {
                try {
                    if (this.f112799c == null) {
                        this.f112799c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f112799c;
    }

    protected C18101g createComponentManager() {
        return new C18101g(this);
    }

    protected void inject() {
        if (this.f112801e) {
            return;
        }
        this.f112801e = true;
        ((L) generatedComponent()).d((SuggestedProductFragment) Au.f.a(this));
    }

    Hilt_SuggestedProductFragment() {
    }

    @Override // Au.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f112798b) {
            return null;
        }
        initializeComponentContext();
        return this.f112797a;
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
        ContextWrapper contextWrapper = this.f112797a;
        Au.d.d(contextWrapper == null || C18101g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
