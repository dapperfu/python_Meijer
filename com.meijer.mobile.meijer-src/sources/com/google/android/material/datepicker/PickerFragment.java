package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
abstract class PickerFragment<S> extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    protected final LinkedHashSet<n<S>> f87712a = new LinkedHashSet<>();

    boolean u0(n<S> nVar) {
        return this.f87712a.add(nVar);
    }

    void v0() {
        this.f87712a.clear();
    }

    PickerFragment() {
    }
}
