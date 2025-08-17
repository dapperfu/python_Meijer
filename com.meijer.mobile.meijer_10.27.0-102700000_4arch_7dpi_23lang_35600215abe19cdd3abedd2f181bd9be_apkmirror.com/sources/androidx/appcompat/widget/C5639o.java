package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import b2.C6187h;
import com.fullstory.FS;
import i.C14584j;
import java.lang.ref.WeakReference;
import s2.C16848c;

/* renamed from: androidx.appcompat.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5639o {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f46999a;

    /* renamed from: b, reason: collision with root package name */
    private K f47000b;

    /* renamed from: c, reason: collision with root package name */
    private K f47001c;

    /* renamed from: d, reason: collision with root package name */
    private K f47002d;

    /* renamed from: e, reason: collision with root package name */
    private K f47003e;

    /* renamed from: f, reason: collision with root package name */
    private K f47004f;

    /* renamed from: g, reason: collision with root package name */
    private K f47005g;

    /* renamed from: h, reason: collision with root package name */
    private K f47006h;

    /* renamed from: i, reason: collision with root package name */
    private final C5640p f47007i;

    /* renamed from: j, reason: collision with root package name */
    private int f47008j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f47009k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f47010l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f47011m;

    /* renamed from: androidx.appcompat.widget.o$a */
    class a extends C6187h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f47012a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f47013b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f47014c;

        @Override // b2.C6187h.e
        public void f(int i10) {
        }

        a(int i10, int i11, WeakReference weakReference) {
            this.f47012a = i10;
            this.f47013b = i11;
            this.f47014c = weakReference;
        }

        @Override // b2.C6187h.e
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f47012a) != -1) {
                typeface = e.a(typeface, i10, (this.f47013b & 2) != 0);
            }
            C5639o.this.n(this.f47014c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.o$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f47016a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f47017b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f47018c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f47016a = textView;
            this.f47017b = typeface;
            this.f47018c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f47016a.setTypeface(this.f47017b, this.f47018c);
        }
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f46999a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f46999a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f46999a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f46999a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f46999a.getCompoundDrawables();
        TextView textView2 = this.f46999a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: androidx.appcompat.widget.o$c */
    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.widget.o$d */
    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.o$e */
    static class e {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    private void B(int i10, float f10) {
        this.f47007i.t(i10, f10);
    }

    private void C(Context context, M m10) {
        String strO;
        this.f47008j = m10.k(C14584j.f136746M2, this.f47008j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iK = m10.k(C14584j.f136758P2, -1);
            this.f47009k = iK;
            if (iK != -1) {
                this.f47008j &= 2;
            }
        }
        if (!m10.s(C14584j.f136754O2) && !m10.s(C14584j.f136762Q2)) {
            if (m10.s(C14584j.f136742L2)) {
                this.f47011m = false;
                int iK2 = m10.k(C14584j.f136742L2, 1);
                if (iK2 == 1) {
                    this.f47010l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f47010l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f47010l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f47010l = null;
        int i11 = m10.s(C14584j.f136762Q2) ? C14584j.f136762Q2 : C14584j.f136754O2;
        int i12 = this.f47009k;
        int i13 = this.f47008j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = m10.j(i11, this.f47008j, new a(i12, i13, new WeakReference(this.f46999a)));
                if (typefaceJ != null) {
                    if (i10 < 28 || this.f47009k == -1) {
                        this.f47010l = typefaceJ;
                    } else {
                        this.f47010l = e.a(FS.typefaceCreateDerived(typefaceJ, 0), this.f47009k, (this.f47008j & 2) != 0);
                    }
                }
                this.f47011m = this.f47010l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f47010l != null || (strO = m10.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f47009k == -1) {
            this.f47010l = Typeface.create(strO, this.f47008j);
        } else {
            this.f47010l = e.a(Typeface.create(strO, 0), this.f47009k, (this.f47008j & 2) != 0);
        }
    }

    private void a(Drawable drawable, K k10) {
        if (drawable == null || k10 == null) {
            return;
        }
        C5629e.i(drawable, k10, this.f46999a.getDrawableState());
    }

    private void z() {
        K k10 = this.f47006h;
        this.f47000b = k10;
        this.f47001c = k10;
        this.f47002d = k10;
        this.f47003e = k10;
        this.f47004f = k10;
        this.f47005g = k10;
    }

    void A(int i10, float f10) {
        if (Y.f46948c || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f47000b != null || this.f47001c != null || this.f47002d != null || this.f47003e != null) {
            Drawable[] compoundDrawables = this.f46999a.getCompoundDrawables();
            a(compoundDrawables[0], this.f47000b);
            a(compoundDrawables[1], this.f47001c);
            a(compoundDrawables[2], this.f47002d);
            a(compoundDrawables[3], this.f47003e);
        }
        if (this.f47004f == null && this.f47005g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f46999a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f47004f);
        a(compoundDrawablesRelative[2], this.f47005g);
    }

    void c() {
        this.f47007i.a();
    }

    int e() {
        return this.f47007i.f();
    }

    int f() {
        return this.f47007i.g();
    }

    int g() {
        return this.f47007i.h();
    }

    int[] h() {
        return this.f47007i.i();
    }

    int i() {
        return this.f47007i.j();
    }

    ColorStateList j() {
        K k10 = this.f47006h;
        if (k10 != null) {
            return k10.f46682a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        K k10 = this.f47006h;
        if (k10 != null) {
            return k10.f46683b;
        }
        return null;
    }

    boolean l() {
        return this.f47007i.n();
    }

    @SuppressLint({"NewApi"})
    void m(AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z10;
        String strO;
        String strO2;
        boolean z11;
        int iA;
        float f10;
        Context context = this.f46999a.getContext();
        C5629e c5629eB = C5629e.b();
        M mV = M.v(context, attributeSet, C14584j.f136791Y, i10, 0);
        TextView textView = this.f46999a;
        ViewCompat.k0(textView, textView.getContext(), C14584j.f136791Y, attributeSet, mV.r(), i10, 0);
        int iN = mV.n(C14584j.f136795Z, -1);
        if (mV.s(C14584j.f136810c0)) {
            this.f47000b = d(context, c5629eB, mV.n(C14584j.f136810c0, 0));
        }
        if (mV.s(C14584j.f136800a0)) {
            this.f47001c = d(context, c5629eB, mV.n(C14584j.f136800a0, 0));
        }
        if (mV.s(C14584j.f136815d0)) {
            this.f47002d = d(context, c5629eB, mV.n(C14584j.f136815d0, 0));
        }
        if (mV.s(C14584j.f136805b0)) {
            this.f47003e = d(context, c5629eB, mV.n(C14584j.f136805b0, 0));
        }
        if (mV.s(C14584j.f136820e0)) {
            this.f47004f = d(context, c5629eB, mV.n(C14584j.f136820e0, 0));
        }
        if (mV.s(C14584j.f136825f0)) {
            this.f47005g = d(context, c5629eB, mV.n(C14584j.f136825f0, 0));
        }
        mV.x();
        boolean z12 = this.f46999a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iN != -1) {
            M mT = M.t(context, iN, C14584j.f136734J2);
            if (z12 || !mT.s(C14584j.f136770S2)) {
                zA = false;
                z10 = false;
            } else {
                zA = mT.a(C14584j.f136770S2, false);
                z10 = true;
            }
            C(context, mT);
            int i11 = Build.VERSION.SDK_INT;
            strO2 = mT.s(C14584j.f136774T2) ? mT.o(C14584j.f136774T2) : null;
            strO = (i11 < 26 || !mT.s(C14584j.f136766R2)) ? null : mT.o(C14584j.f136766R2);
            mT.x();
        } else {
            zA = false;
            z10 = false;
            strO = null;
            strO2 = null;
        }
        M mV2 = M.v(context, attributeSet, C14584j.f136734J2, i10, 0);
        if (z12 || !mV2.s(C14584j.f136770S2)) {
            z11 = z10;
        } else {
            zA = mV2.a(C14584j.f136770S2, false);
            z11 = true;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (mV2.s(C14584j.f136774T2)) {
            strO2 = mV2.o(C14584j.f136774T2);
        }
        if (i12 >= 26 && mV2.s(C14584j.f136766R2)) {
            strO = mV2.o(C14584j.f136766R2);
        }
        if (i12 >= 28 && mV2.s(C14584j.f136738K2) && mV2.f(C14584j.f136738K2, -1) == 0) {
            this.f46999a.setTextSize(0, 0.0f);
        }
        C(context, mV2);
        mV2.x();
        if (!z12 && z11) {
            s(zA);
        }
        Typeface typeface = this.f47010l;
        if (typeface != null) {
            if (this.f47009k == -1) {
                this.f46999a.setTypeface(typeface, this.f47008j);
            } else {
                this.f46999a.setTypeface(typeface);
            }
        }
        if (strO != null) {
            d.d(this.f46999a, strO);
        }
        if (strO2 != null) {
            c.b(this.f46999a, c.a(strO2));
        }
        this.f47007i.o(attributeSet, i10);
        if (Y.f46948c && this.f47007i.j() != 0) {
            int[] iArrI = this.f47007i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f46999a) != -1.0f) {
                    d.b(this.f46999a, this.f47007i.g(), this.f47007i.f(), this.f47007i.h(), 0);
                } else {
                    d.c(this.f46999a, iArrI, 0);
                }
            }
        }
        M mU = M.u(context, attributeSet, C14584j.f136830g0);
        int iN2 = mU.n(C14584j.f136870o0, -1);
        Drawable drawableC = iN2 != -1 ? c5629eB.c(context, iN2) : null;
        int iN3 = mU.n(C14584j.f136895t0, -1);
        Drawable drawableC2 = iN3 != -1 ? c5629eB.c(context, iN3) : null;
        int iN4 = mU.n(C14584j.f136875p0, -1);
        Drawable drawableC3 = iN4 != -1 ? c5629eB.c(context, iN4) : null;
        int iN5 = mU.n(C14584j.f136860m0, -1);
        Drawable drawableC4 = iN5 != -1 ? c5629eB.c(context, iN5) : null;
        int iN6 = mU.n(C14584j.f136880q0, -1);
        Drawable drawableC5 = iN6 != -1 ? c5629eB.c(context, iN6) : null;
        int iN7 = mU.n(C14584j.f136865n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? c5629eB.c(context, iN7) : null);
        if (mU.s(C14584j.f136885r0)) {
            androidx.core.widget.k.h(this.f46999a, mU.c(C14584j.f136885r0));
        }
        if (mU.s(C14584j.f136890s0)) {
            androidx.core.widget.k.i(this.f46999a, C5648y.e(mU.k(C14584j.f136890s0, -1), null));
        }
        int iF = mU.f(C14584j.f136905v0, -1);
        int iF2 = mU.f(C14584j.f136910w0, -1);
        if (mU.s(C14584j.f136915x0)) {
            TypedValue typedValueW = mU.w(C14584j.f136915x0);
            if (typedValueW == null || typedValueW.type != 5) {
                f10 = mU.f(C14584j.f136915x0, -1);
                iA = -1;
            } else {
                iA = o2.k.a(typedValueW.data);
                f10 = TypedValue.complexToFloat(typedValueW.data);
            }
        } else {
            iA = -1;
            f10 = -1.0f;
        }
        mU.x();
        if (iF != -1) {
            androidx.core.widget.k.k(this.f46999a, iF);
        }
        if (iF2 != -1) {
            androidx.core.widget.k.l(this.f46999a, iF2);
        }
        if (f10 != -1.0f) {
            if (iA == -1) {
                androidx.core.widget.k.m(this.f46999a, (int) f10);
            } else {
                androidx.core.widget.k.n(this.f46999a, iA, f10);
            }
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f47011m) {
            this.f47010l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f47008j));
                } else {
                    textView.setTypeface(typeface, this.f47008j);
                }
            }
        }
    }

    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (Y.f46948c) {
            return;
        }
        c();
    }

    void q(Context context, int i10) {
        String strO;
        M mT = M.t(context, i10, C14584j.f136734J2);
        if (mT.s(C14584j.f136770S2)) {
            s(mT.a(C14584j.f136770S2, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (mT.s(C14584j.f136738K2) && mT.f(C14584j.f136738K2, -1) == 0) {
            this.f46999a.setTextSize(0, 0.0f);
        }
        C(context, mT);
        if (i11 >= 26 && mT.s(C14584j.f136766R2) && (strO = mT.o(C14584j.f136766R2)) != null) {
            d.d(this.f46999a, strO);
        }
        mT.x();
        Typeface typeface = this.f47010l;
        if (typeface != null) {
            this.f46999a.setTypeface(typeface, this.f47008j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C16848c.f(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f46999a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        this.f47007i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) throws IllegalArgumentException {
        this.f47007i.q(iArr, i10);
    }

    void v(int i10) {
        this.f47007i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f47006h == null) {
            this.f47006h = new K();
        }
        K k10 = this.f47006h;
        k10.f46682a = colorStateList;
        k10.f46685d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f47006h == null) {
            this.f47006h = new K();
        }
        K k10 = this.f47006h;
        k10.f46683b = mode;
        k10.f46684c = mode != null;
        z();
    }

    C5639o(TextView textView) {
        this.f46999a = textView;
        this.f47007i = new C5640p(textView);
    }

    private static K d(Context context, C5629e c5629e, int i10) {
        ColorStateList colorStateListF = c5629e.f(context, i10);
        if (colorStateListF != null) {
            K k10 = new K();
            k10.f46685d = true;
            k10.f46682a = colorStateListF;
            return k10;
        }
        return null;
    }

    void p() {
        b();
    }
}
