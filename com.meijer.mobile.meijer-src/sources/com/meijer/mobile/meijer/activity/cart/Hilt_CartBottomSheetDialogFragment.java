package com.meijer.mobile.meijer.activity.cart;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.view.f0;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import pu.C16547a;
import su.C17167a;
import tu.C17293g;
import wu.InterfaceC17928c;

/* loaded from: classes10.dex */
abstract class Hilt_CartBottomSheetDialogFragment extends BottomSheetDialogFragment implements InterfaceC17928c {

    /* renamed from: a, reason: collision with root package name */
    private ContextWrapper f102453a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f102454b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C17293g f102455c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f102456d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f102457e = false;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    private void initializeComponentContext() {
        if (this.f102453a == null) {
            this.f102453a = C17293g.b(super.getContext(), this);
            this.f102454b = C16547a.a(super.getContext());
        }
    }

    @Override // wu.InterfaceC17928c
    public final C17293g componentManager() {
        if (this.f102455c == null) {
            synchronized (this.f102456d) {
                try {
                    if (this.f102455c == null) {
                        this.f102455c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f102455c;
    }

    protected C17293g createComponentManager() {
        return new C17293g(this);
    }

    protected void inject() {
        if (this.f102457e) {
            return;
        }
        this.f102457e = true;
        ((InterfaceC11873j0) generatedComponent()).j((CartBottomSheetDialogFragment) wu.f.a(this));
    }

    Hilt_CartBottomSheetDialogFragment() {
    }

    @Override // wu.InterfaceC17927b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f102454b) {
            return null;
        }
        initializeComponentContext();
        return this.f102453a;
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
        ContextWrapper contextWrapper = this.f102453a;
        wu.d.d(contextWrapper == null || C17293g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
