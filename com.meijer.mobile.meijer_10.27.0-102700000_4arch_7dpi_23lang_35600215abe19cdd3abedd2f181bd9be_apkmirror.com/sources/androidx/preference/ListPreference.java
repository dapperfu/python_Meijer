package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import b2.C6190k;
import com.fullstory.FS;
import k4.c;
import k4.f;
import k4.g;

/* loaded from: classes4.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: J, reason: collision with root package name */
    private CharSequence[] f57671J;

    /* renamed from: K, reason: collision with root package name */
    private CharSequence[] f57672K;

    /* renamed from: L, reason: collision with root package name */
    private String f57673L;

    /* renamed from: M, reason: collision with root package name */
    private String f57674M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f57675N;

    public static final class a implements Preference.b<ListPreference> {

        /* renamed from: a, reason: collision with root package name */
        private static a f57676a;

        public static a b() {
            if (f57676a == null) {
                f57676a = new a();
            }
            return f57676a;
        }

        private a() {
        }

        @Override // androidx.preference.Preference.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            if (TextUtils.isEmpty(listPreference.X())) {
                return listPreference.e().getString(f.f141241a);
            }
            return listPreference.X();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141324b0, i10, i11);
        this.f57671J = C6190k.o(typedArrayObtainStyledAttributes, g.f141333e0, g.f141327c0);
        this.f57672K = C6190k.o(typedArrayObtainStyledAttributes, g.f141336f0, g.f141330d0);
        int i12 = g.f141339g0;
        if (C6190k.b(typedArrayObtainStyledAttributes, i12, i12, false)) {
            S(a.b());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.f141372r0, i10, i11);
        this.f57674M = C6190k.m(typedArrayObtainStyledAttributes2, g.f141318Z0, g.f141396z0);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private int a0() {
        return V(this.f57673L);
    }

    public int V(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f57672K) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.f57672K[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] W() {
        return this.f57671J;
    }

    public CharSequence[] Y() {
        return this.f57672K;
    }

    public String Z() {
        return this.f57673L;
    }

    public void b0(String str) {
        boolean zEquals = TextUtils.equals(this.f57673L, str);
        if (zEquals && this.f57675N) {
            return;
        }
        this.f57673L = str;
        this.f57675N = true;
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
        String str = this.f57674M;
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
        if (iA0 >= 0 && (charSequenceArr = this.f57671J) != null) {
            return charSequenceArr[iA0];
        }
        return null;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6190k.a(context, c.f141230b, R.attr.dialogPreferenceStyle));
    }
}
