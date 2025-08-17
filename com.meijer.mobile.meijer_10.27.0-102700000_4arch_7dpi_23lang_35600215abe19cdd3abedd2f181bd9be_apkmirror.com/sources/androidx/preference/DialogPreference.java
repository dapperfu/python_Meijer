package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import b2.C6190k;
import k4.c;
import k4.g;

/* loaded from: classes4.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: D, reason: collision with root package name */
    private CharSequence f57658D;

    /* renamed from: E, reason: collision with root package name */
    private CharSequence f57659E;

    /* renamed from: F, reason: collision with root package name */
    private Drawable f57660F;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f57661G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f57662H;

    /* renamed from: I, reason: collision with root package name */
    private int f57663I;

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141248C, i10, i11);
        String strM = C6190k.m(typedArrayObtainStyledAttributes, g.f141278M, g.f141251D);
        this.f57658D = strM;
        if (strM == null) {
            this.f57658D = D();
        }
        this.f57659E = C6190k.m(typedArrayObtainStyledAttributes, g.f141275L, g.f141254E);
        this.f57660F = C6190k.c(typedArrayObtainStyledAttributes, g.f141269J, g.f141257F);
        this.f57661G = C6190k.m(typedArrayObtainStyledAttributes, g.f141284O, g.f141260G);
        this.f57662H = C6190k.m(typedArrayObtainStyledAttributes, g.f141281N, g.f141263H);
        this.f57663I = C6190k.l(typedArrayObtainStyledAttributes, g.f141272K, g.f141266I, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void J() {
        z();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6190k.a(context, c.f141230b, R.attr.dialogPreferenceStyle));
    }
}
