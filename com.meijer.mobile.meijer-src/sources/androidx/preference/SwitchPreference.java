package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import b2.C6330k;
import k4.c;
import k4.g;

/* loaded from: classes4.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: I, reason: collision with root package name */
    private final a f57958I;

    /* renamed from: J, reason: collision with root package name */
    private CharSequence f57959J;

    /* renamed from: K, reason: collision with root package name */
    private CharSequence f57960K;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreference.this.a(Boolean.valueOf(z10))) {
                SwitchPreference.this.W(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f57958I = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141590z1, i10, i11);
        Z(C6330k.m(typedArrayObtainStyledAttributes, g.f141458H1, g.f141437A1));
        Y(C6330k.m(typedArrayObtainStyledAttributes, g.f141455G1, g.f141440B1));
        c0(C6330k.m(typedArrayObtainStyledAttributes, g.f141464J1, g.f141446D1));
        b0(C6330k.m(typedArrayObtainStyledAttributes, g.f141461I1, g.f141449E1));
        X(C6330k.b(typedArrayObtainStyledAttributes, g.f141452F1, g.f141443C1, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d0(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f57966D);
        }
        if (z10) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f57959J);
            r42.setTextOff(this.f57960K);
            r42.setOnCheckedChangeListener(this.f57958I);
        }
    }

    public void b0(CharSequence charSequence) {
        this.f57960K = charSequence;
        H();
    }

    public void c0(CharSequence charSequence) {
        this.f57959J = charSequence;
        H();
    }

    private void e0(View view) {
        if (!((AccessibilityManager) e().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        d0(view.findViewById(R.id.switch_widget));
        a0(view.findViewById(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected void O(View view) {
        super.O(view);
        e0(view);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6330k.a(context, c.f141431j, R.attr.switchPreferenceStyle));
    }
}
