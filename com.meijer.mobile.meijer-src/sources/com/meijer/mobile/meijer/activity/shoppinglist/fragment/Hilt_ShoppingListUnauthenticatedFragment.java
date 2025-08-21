package com.meijer.mobile.meijer.activity.shoppinglist.fragment;

import Gn.j;
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
abstract class Hilt_ShoppingListUnauthenticatedFragment extends Fragment implements InterfaceC17928c {

    /* renamed from: a, reason: collision with root package name */
    private ContextWrapper f113316a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f113317b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C17293g f113318c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f113319d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f113320e = false;

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    private void initializeComponentContext() {
        if (this.f113316a == null) {
            this.f113316a = C17293g.b(super.getContext(), this);
            this.f113317b = C16547a.a(super.getContext());
        }
    }

    @Override // wu.InterfaceC17928c
    public final C17293g componentManager() {
        if (this.f113318c == null) {
            synchronized (this.f113319d) {
                try {
                    if (this.f113318c == null) {
                        this.f113318c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f113318c;
    }

    protected C17293g createComponentManager() {
        return new C17293g(this);
    }

    protected void inject() {
        if (this.f113320e) {
            return;
        }
        this.f113320e = true;
        ((j) generatedComponent()).b((ShoppingListUnauthenticatedFragment) f.a(this));
    }

    Hilt_ShoppingListUnauthenticatedFragment() {
    }

    @Override // wu.InterfaceC17927b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f113317b) {
            return null;
        }
        initializeComponentContext();
        return this.f113316a;
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
        ContextWrapper contextWrapper = this.f113316a;
        d.d(contextWrapper == null || C17293g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
