package com.meijer.mobile.meijer.activity.shoppinglist;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.view.f0;
import com.meijer.mobile.core.base.ui.dialogfragment.MeijerDialogFragment;
import pu.C16547a;
import su.C17167a;
import tu.C17293g;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_ShoppingListItemDialogFragment extends MeijerDialogFragment implements InterfaceC17928c {

    /* renamed from: a, reason: collision with root package name */
    private ContextWrapper f113211a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f113212b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C17293g f113213c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f113214d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f113215e = false;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    private void initializeComponentContext() {
        if (this.f113211a == null) {
            this.f113211a = C17293g.b(super.getContext(), this);
            this.f113212b = C16547a.a(super.getContext());
        }
    }

    @Override // wu.InterfaceC17928c
    public final C17293g componentManager() {
        if (this.f113213c == null) {
            synchronized (this.f113214d) {
                try {
                    if (this.f113213c == null) {
                        this.f113213c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f113213c;
    }

    protected C17293g createComponentManager() {
        return new C17293g(this);
    }

    protected void inject() {
        if (this.f113215e) {
            return;
        }
        this.f113215e = true;
        ((n) generatedComponent()).h((ShoppingListItemDialogFragment) wu.f.a(this));
    }

    Hilt_ShoppingListItemDialogFragment() {
    }

    @Override // wu.InterfaceC17927b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f113212b) {
            return null;
        }
        initializeComponentContext();
        return this.f113211a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.view.InterfaceC6162j
    public f0.c getDefaultViewModelProviderFactory() {
        return C17167a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C17293g.c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f113211a;
        wu.d.d(contextWrapper == null || C17293g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
