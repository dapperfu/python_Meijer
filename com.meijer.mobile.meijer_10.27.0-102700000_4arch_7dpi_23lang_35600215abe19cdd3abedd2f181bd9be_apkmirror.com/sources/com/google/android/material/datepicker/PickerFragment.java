package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes4.dex */
abstract class PickerFragment<S> extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    protected final LinkedHashSet<n<S>> f86872a = new LinkedHashSet<>();

    boolean r0(n<S> nVar) {
        return this.f86872a.add(nVar);
    }

    void s0() {
        this.f86872a.clear();
    }

    PickerFragment() {
    }
}
