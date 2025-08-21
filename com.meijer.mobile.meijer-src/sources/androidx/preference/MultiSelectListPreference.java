package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b2.C6330k;
import java.util.HashSet;
import java.util.Set;
import k4.c;
import k4.g;

/* loaded from: classes4.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: J, reason: collision with root package name */
    private CharSequence[] f57901J;

    /* renamed from: K, reason: collision with root package name */
    private CharSequence[] f57902K;

    /* renamed from: L, reason: collision with root package name */
    private Set<String> f57903L;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f57903L = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141544k0, i10, i11);
        this.f57901J = C6330k.o(typedArrayObtainStyledAttributes, g.f141553n0, g.f141547l0);
        this.f57902K = C6330k.o(typedArrayObtainStyledAttributes, g.f141556o0, g.f141550m0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected Object L(TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6330k.a(context, c.f141423b, R.attr.dialogPreferenceStyle));
    }
}
