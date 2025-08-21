package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import b2.C6330k;
import k4.c;
import k4.f;
import k4.g;

/* loaded from: classes4.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: J, reason: collision with root package name */
    private String f57893J;

    public static final class a implements Preference.b<EditTextPreference> {

        /* renamed from: a, reason: collision with root package name */
        private static a f57894a;

        public static a b() {
            if (f57894a == null) {
                f57894a = new a();
            }
            return f57894a;
        }

        private a() {
        }

        @Override // androidx.preference.Preference.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            if (TextUtils.isEmpty(editTextPreference.V())) {
                return editTextPreference.e().getString(f.f141434a);
            }
            return editTextPreference.V();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141483Q, i10, i11);
        int i12 = g.f141486R;
        if (C6330k.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            S(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean T() {
        return TextUtils.isEmpty(this.f57893J) || super.T();
    }

    public String V() {
        return this.f57893J;
    }

    @Override // androidx.preference.Preference
    protected Object L(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6330k.a(context, c.f141425d, R.attr.editTextPreferenceStyle));
    }
}
