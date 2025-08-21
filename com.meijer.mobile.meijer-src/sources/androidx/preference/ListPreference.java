package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import b2.C6330k;
import com.fullstory.FS;
import k4.c;
import k4.f;
import k4.g;

/* loaded from: classes4.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: J, reason: collision with root package name */
    private CharSequence[] f57895J;

    /* renamed from: K, reason: collision with root package name */
    private CharSequence[] f57896K;

    /* renamed from: L, reason: collision with root package name */
    private String f57897L;

    /* renamed from: M, reason: collision with root package name */
    private String f57898M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f57899N;

    public static final class a implements Preference.b<ListPreference> {

        /* renamed from: a, reason: collision with root package name */
        private static a f57900a;

        public static a b() {
            if (f57900a == null) {
                f57900a = new a();
            }
            return f57900a;
        }

        private a() {
        }

        @Override // androidx.preference.Preference.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            if (TextUtils.isEmpty(listPreference.X())) {
                return listPreference.e().getString(f.f141434a);
            }
            return listPreference.X();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141517b0, i10, i11);
        this.f57895J = C6330k.o(typedArrayObtainStyledAttributes, g.f141526e0, g.f141520c0);
        this.f57896K = C6330k.o(typedArrayObtainStyledAttributes, g.f141529f0, g.f141523d0);
        int i12 = g.f141532g0;
        if (C6330k.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            S(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.f141565r0, i10, i11);
        this.f57898M = C6330k.m(typedArrayObtainStyledAttributes2, g.f141511Z0, g.f141589z0);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private int a0() {
        return V(this.f57897L);
    }

    public int V(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f57896K) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.f57896K[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] W() {
        return this.f57895J;
    }

    public CharSequence[] Y() {
        return this.f57896K;
    }

    public String Z() {
        return this.f57897L;
    }

    public void b0(String str) {
        boolean zEquals = TextUtils.equals(this.f57897L, str);
        if (zEquals && this.f57899N) {
            return;
        }
        this.f57897L = str;
        this.f57899N = true;
        R(str);
        if (zEquals) {
            return;
        }
        H();
    }

    @Override // androidx.preference.Preference
    public CharSequence B() {
        if (C() != null) {
            return C().a(this);
        }
        CharSequence charSequenceX = X();
        CharSequence charSequenceB = super.B();
        String str = this.f57898M;
        if (str != null) {
            if (charSequenceX == null) {
                charSequenceX = "";
            }
            String str2 = String.format(str, charSequenceX);
            if (!TextUtils.equals(str2, charSequenceB)) {
                FS.log_w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return str2;
            }
        }
        return charSequenceB;
    }

    @Override // androidx.preference.Preference
    protected Object L(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    public CharSequence X() {
        CharSequence[] charSequenceArr;
        int iA0 = a0();
        if (iA0 >= 0 && (charSequenceArr = this.f57895J) != null) {
            return charSequenceArr[iA0];
        }
        return null;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6330k.a(context, c.f141423b, R.attr.dialogPreferenceStyle));
    }
}
