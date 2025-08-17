package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b2.C6190k;
import java.util.HashSet;
import java.util.Set;
import k4.c;
import k4.g;

/* loaded from: classes4.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: J, reason: collision with root package name */
    private CharSequence[] f57677J;

    /* renamed from: K, reason: collision with root package name */
    private CharSequence[] f57678K;

    /* renamed from: L, reason: collision with root package name */
    private Set<String> f57679L;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f57679L = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141351k0, i10, i11);
        this.f57677J = C6190k.o(typedArrayObtainStyledAttributes, g.f141360n0, g.f141354l0);
        this.f57678K = C6190k.o(typedArrayObtainStyledAttributes, g.f141363o0, g.f141357m0);
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
        this(context, attributeSet, C6190k.a(context, c.f141230b, R.attr.dialogPreferenceStyle));
    }
}
