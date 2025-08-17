package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import b2.C6190k;
import k4.c;
import k4.g;

/* loaded from: classes4.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: I, reason: collision with root package name */
    private final a f57656I;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (CheckBoxPreference.this.a(Boolean.valueOf(z10))) {
                CheckBoxPreference.this.W(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f57656I = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141371r, i10, i11);
        Z(C6190k.m(typedArrayObtainStyledAttributes, g.f141389x, g.f141374s));
        Y(C6190k.m(typedArrayObtainStyledAttributes, g.f141386w, g.f141377t));
        X(C6190k.b(typedArrayObtainStyledAttributes, g.f141383v, g.f141380u, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b0(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f57742D);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f57656I);
        }
    }

    private void c0(View view) {
        if (!((AccessibilityManager) e().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        b0(view.findViewById(R.id.checkbox));
        a0(view.findViewById(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected void O(View view) {
        super.O(view);
        c0(view);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6190k.a(context, c.f141229a, R.attr.checkBoxPreferenceStyle));
    }
}
