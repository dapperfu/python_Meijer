package com.meijer.mobile.meijer.activity.cart;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.view.f0;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import tu.C17138a;
import wu.C17864a;
import xu.C18101g;

/* loaded from: classes9.dex */
abstract class Hilt_CartBottomSheetDialogFragment extends BottomSheetDialogFragment implements Au.c {

    /* renamed from: a, reason: collision with root package name */
    private ContextWrapper f101598a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f101599b;

    /* renamed from: c, reason: collision with root package name */
    private volatile C18101g f101600c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f101601d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f101602e = false;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        initializeComponentContext();
        inject();
    }

    private void initializeComponentContext() {
        if (this.f101598a == null) {
            this.f101598a = C18101g.b(super.getContext(), this);
            this.f101599b = C17138a.a(super.getContext());
        }
    }

    @Override // Au.c
    public final C18101g componentManager() {
        if (this.f101600c == null) {
            synchronized (this.f101601d) {
                try {
                    if (this.f101600c == null) {
                        this.f101600c = createComponentManager();
                    }
                } finally {
                }
            }
        }
        return this.f101600c;
    }

    protected C18101g createComponentManager() {
        return new C18101g(this);
    }

    protected void inject() {
        if (this.f101602e) {
            return;
        }
        this.f101602e = true;
        ((InterfaceC11748j0) generatedComponent()).j((CartBottomSheetDialogFragment) Au.f.a(this));
    }

    Hilt_CartBottomSheetDialogFragment() {
    }

    @Override // Au.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f101599b) {
            return null;
        }
        initializeComponentContext();
        return this.f101598a;
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
        ContextWrapper contextWrapper = this.f101598a;
        Au.d.d(contextWrapper == null || C18101g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        initializeComponentContext();
        inject();
    }
}
