package com.meijer.mobile.meijer.activity.coupons.fragment;

import Au.c;
import Au.d;
import Au.f;
import Jm.t;
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
public abstract class Hilt_CouponsFragment extends MeijerFragment implements c {

    /* renamed from: a, reason: collision with root package name */
    private ContextWrapper f105423a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f105424b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C18101g f105425c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f105426d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f105427e = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    private void initializeComponentContext() {
        if (this.f105423a == null) {
            this.f105423a = C18101g.b(super.getContext(), this);
            this.f105424b = C17138a.a(super.getContext());
        }
    }

    @Override // Au.c
    public final C18101g componentManager() {
        if (this.f105425c == null) {
            synchronized (this.f105426d) {
                try {
                    if (this.f105425c == null) {
                        this.f105425c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f105425c;
    }

    protected C18101g createComponentManager() {
        return new C18101g(this);
    }

    protected void inject() {
        if (this.f105427e) {
            return;
        }
        this.f105427e = true;
        ((t) generatedComponent()).e((CouponsFragment) f.a(this));
    }

    @Override // Au.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f105424b) {
            return null;
        }
        initializeComponentContext();
        return this.f105423a;
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
        ContextWrapper contextWrapper = this.f105423a;
        d.d(contextWrapper == null || C18101g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
