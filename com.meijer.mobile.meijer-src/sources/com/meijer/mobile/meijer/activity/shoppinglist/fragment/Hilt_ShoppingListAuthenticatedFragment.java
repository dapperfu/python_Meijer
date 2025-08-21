package com.meijer.mobile.meijer.activity.shoppinglist.fragment;

import Gn.h;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.view.f0;
import pu.C16547a;
import su.C17167a;
import tu.C17293g;
import wu.InterfaceC17928c;
import wu.d;
import wu.f;

/* loaded from: classes10.dex */
abstract class Hilt_ShoppingListAuthenticatedFragment extends Fragment implements InterfaceC17928c {

    /* renamed from: a, reason: collision with root package name */
    private ContextWrapper f113311a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f113312b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C17293g f113313c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f113314d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f113315e = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    private void initializeComponentContext() {
        if (this.f113311a == null) {
            this.f113311a = C17293g.b(super.getContext(), this);
            this.f113312b = C16547a.a(super.getContext());
        }
    }

    @Override // wu.InterfaceC17928c
    public final C17293g componentManager() {
        if (this.f113313c == null) {
            synchronized (this.f113314d) {
                try {
                    if (this.f113313c == null) {
                        this.f113313c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f113313c;
    }

    protected C17293g createComponentManager() {
        return new C17293g(this);
    }

    protected void inject() {
        if (this.f113315e) {
            return;
        }
        this.f113315e = true;
        ((h) generatedComponent()).i((ShoppingListAuthenticatedFragment) f.a(this));
    }

    Hilt_ShoppingListAuthenticatedFragment() {
    }

    @Override // wu.InterfaceC17927b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f113312b) {
            return null;
        }
        initializeComponentContext();
        return this.f113311a;
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
        ContextWrapper contextWrapper = this.f113311a;
        d.d(contextWrapper == null || C17293g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
