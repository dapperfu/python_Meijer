package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {

    /* renamed from: b, reason: collision with root package name */
    private int f86868b;

    /* renamed from: c, reason: collision with root package name */
    private d<S> f86869c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.android.material.datepicker.a f86870d;

    class a extends n<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.n
        public void a(S s10) {
            Iterator<n<S>> it = MaterialTextInputPicker.this.f86872a.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    static <T> MaterialTextInputPicker<T> t0(d<T> dVar, int i10, com.google.android.material.datepicker.a aVar) {
        MaterialTextInputPicker<T> materialTextInputPicker = new MaterialTextInputPicker<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f86869c.E2(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f86868b)), viewGroup, bundle, this.f86870d, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f86868b = bundle.getInt("THEME_RES_ID_KEY");
        this.f86869c = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f86870d = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f86868b);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f86869c);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f86870d);
    }
}
