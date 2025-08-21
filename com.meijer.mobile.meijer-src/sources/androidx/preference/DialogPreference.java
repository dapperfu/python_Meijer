package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import b2.C6330k;
import k4.c;
import k4.g;

/* loaded from: classes4.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: D, reason: collision with root package name */
    private CharSequence f57882D;

    /* renamed from: E, reason: collision with root package name */
    private CharSequence f57883E;

    /* renamed from: F, reason: collision with root package name */
    private Drawable f57884F;

    /* renamed from: G, reason: collision with root package name */
    private CharSequence f57885G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f57886H;

    /* renamed from: I, reason: collision with root package name */
    private int f57887I;

    public DialogPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f141441C, i10, i11);
        String strM = C6330k.m(typedArrayObtainStyledAttributes, g.f141471M, g.f141444D);
        this.f57882D = strM;
        if (strM == null) {
            this.f57882D = D();
        }
        this.f57883E = C6330k.m(typedArrayObtainStyledAttributes, g.f141468L, g.f141447E);
        this.f57884F = C6330k.c(typedArrayObtainStyledAttributes, g.f141462J, g.f141450F);
        this.f57885G = C6330k.m(typedArrayObtainStyledAttributes, g.f141477O, g.f141453G);
        this.f57886H = C6330k.m(typedArrayObtainStyledAttributes, g.f141474N, g.f141456H);
        this.f57887I = C6330k.l(typedArrayObtainStyledAttributes, g.f141465K, g.f141459I, 0);
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
        this(context, attributeSet, C6330k.a(context, c.f141423b, R.attr.dialogPreferenceStyle));
    }
}
