package com.meijer.mobile.meijer.activity.shoppinglist;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.view.f0;
import com.meijer.mobile.core.base.ui.dialogfragment.MeijerDialogFragment;
import tu.C17138a;
import wu.C17864a;
import xu.C18101g;

/* loaded from: classes9.dex */
abstract class Hilt_ShoppingListItemDialogFragment extends MeijerDialogFragment implements Au.c {

    /* renamed from: a, reason: collision with root package name */
    private ContextWrapper f112359a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f112360b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C18101g f112361c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f112362d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f112363e = false;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    private void initializeComponentContext() {
        if (this.f112359a == null) {
            this.f112359a = C18101g.b(super.getContext(), this);
            this.f112360b = C17138a.a(super.getContext());
        }
    }

    @Override // Au.c
    public final C18101g componentManager() {
        if (this.f112361c == null) {
            synchronized (this.f112362d) {
                try {
                    if (this.f112361c == null) {
                        this.f112361c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f112361c;
    }

    protected C18101g createComponentManager() {
        return new C18101g(this);
    }

    protected void inject() {
        if (this.f112363e) {
            return;
        }
        this.f112363e = true;
        ((n) generatedComponent()).h((ShoppingListItemDialogFragment) Au.f.a(this));
    }

    Hilt_ShoppingListItemDialogFragment() {
    }

    @Override // Au.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f112360b) {
            return null;
        }
        initializeComponentContext();
        return this.f112359a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.view.InterfaceC6020j
    public f0.c getDefaultViewModelProviderFactory() {
        return C17864a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return layoutInflaterOnGetLayoutInflater.cloneInContext(C18101g.c(layoutInflaterOnGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f112359a;
        Au.d.d(contextWrapper == null || C18101g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
