package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import b2.C6330k;
import k4.c;
import k4.d;
import k4.g;

/* loaded from: classes4.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: I, reason: collision with root package name */
    private final a f57962I;

    /* renamed from: J, reason: collision with root package name */
    private CharSequence f57963J;

    /* renamed from: K, reason: collision with root package name */
    private CharSequence f57964K;

    private class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (SwitchPreferenceCompat.this.a(Boolean.valueOf(z10))) {
                SwitchPreferenceCompat.this.W(z10);
            } else {
                compoundButton.setChecked(!z10);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f57962I = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141467K1, i10, i11);
        Z(C6330k.m(typedArrayObtainStyledAttributes, g.f141491S1, g.f141470L1));
        Y(C6330k.m(typedArrayObtainStyledAttributes, g.f141488R1, g.f141473M1));
        c0(C6330k.m(typedArrayObtainStyledAttributes, g.f141497U1, g.f141479O1));
        b0(C6330k.m(typedArrayObtainStyledAttributes, g.f141494T1, g.f141482P1));
        X(C6330k.b(typedArrayObtainStyledAttributes, g.f141485Q1, g.f141476N1, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d0(View view) throws Resources.NotFoundException {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f57966D);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f57963J);
            switchCompat.setTextOff(this.f57964K);
            switchCompat.setOnCheckedChangeListener(this.f57962I);
        }
    }

    public void b0(CharSequence charSequence) {
        this.f57964K = charSequence;
        H();
    }

    public void c0(CharSequence charSequence) {
        this.f57963J = charSequence;
        H();
    }

    private void e0(View view) throws Resources.NotFoundException {
        if (!((AccessibilityManager) e().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        d0(view.findViewById(d.f141432a));
        a0(view.findViewById(R.id.summary));
    }

    @Override // androidx.preference.Preference
    protected void O(View view) throws Resources.NotFoundException {
        super.O(view);
        e0(view);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f141430i);
    }
}
