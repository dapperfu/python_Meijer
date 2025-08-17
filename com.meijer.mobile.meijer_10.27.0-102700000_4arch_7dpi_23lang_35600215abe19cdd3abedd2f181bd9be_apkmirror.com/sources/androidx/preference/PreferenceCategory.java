package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import b2.C6190k;
import k4.c;

/* loaded from: classes4.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    @Override // androidx.preference.Preference
    public boolean F() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6190k.a(context, c.f141233e, R.attr.preferenceCategoryStyle));
    }

    @Override // androidx.preference.Preference
    public boolean T() {
        return !super.F();
    }
}
