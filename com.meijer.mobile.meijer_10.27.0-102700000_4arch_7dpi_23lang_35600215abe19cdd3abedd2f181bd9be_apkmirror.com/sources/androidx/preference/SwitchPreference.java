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
import b2.C6190k;
import k4.c;
import k4.g;

/* loaded from: classes4.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: I, reason: collision with root package name */
    private final a f57734I;

    /* renamed from: J, reason: collision with root package name */
    private CharSequence f57735J;

    /* renamed from: K, reason: collision with root package name */
    private CharSequence f57736K;

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
        this.f57734I = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141397z1, i10, i11);
        Z(C6190k.m(typedArrayObtainStyledAttributes, g.f141265H1, g.f141244A1));
        Y(C6190k.m(typedArrayObtainStyledAttributes, g.f141262G1, g.f141247B1));
        c0(C6190k.m(typedArrayObtainStyledAttributes, g.f141271J1, g.f141253D1));
        b0(C6190k.m(typedArrayObtainStyledAttributes, g.f141268I1, g.f141256E1));
        X(C6190k.b(typedArrayObtainStyledAttributes, g.f141259F1, g.f141250C1, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d0(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f57742D);
        }
        if (z10) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f57735J);
            r42.setTextOff(this.f57736K);
            r42.setOnCheckedChangeListener(this.f57734I);
        }
    }

    public void b0(CharSequence charSequence) {
        this.f57736K = charSequence;
        H();
    }

    public void c0(CharSequence charSequence) {
        this.f57735J = charSequence;
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
        this(context, attributeSet, C6190k.a(context, c.f141238j, R.attr.switchPreferenceStyle));
    }
}
