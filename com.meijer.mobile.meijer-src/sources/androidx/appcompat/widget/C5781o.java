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
import b2.C6327h;
import com.fullstory.FS;
import i.C14587j;
import java.lang.ref.WeakReference;
import s2.C16994c;

/* renamed from: androidx.appcompat.widget.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5781o {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f47223a;

    /* renamed from: b, reason: collision with root package name */
    private K f47224b;

    /* renamed from: c, reason: collision with root package name */
    private K f47225c;

    /* renamed from: d, reason: collision with root package name */
    private K f47226d;

    /* renamed from: e, reason: collision with root package name */
    private K f47227e;

    /* renamed from: f, reason: collision with root package name */
    private K f47228f;

    /* renamed from: g, reason: collision with root package name */
    private K f47229g;

    /* renamed from: h, reason: collision with root package name */
    private K f47230h;

    /* renamed from: i, reason: collision with root package name */
    private final C5782p f47231i;

    /* renamed from: j, reason: collision with root package name */
    private int f47232j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f47233k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f47234l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f47235m;

    /* renamed from: androidx.appcompat.widget.o$a */
    class a extends C6327h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f47236a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f47237b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f47238c;

        @Override // b2.C6327h.e
        public void f(int i10) {
        }

        a(int i10, int i11, WeakReference weakReference) {
            this.f47236a = i10;
            this.f47237b = i11;
            this.f47238c = weakReference;
        }

        @Override // b2.C6327h.e
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f47236a) != -1) {
                typeface = e.a(typeface, i10, (this.f47237b & 2) != 0);
            }
            C5781o.this.n(this.f47238c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.o$b */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f47240a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f47241b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f47242c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f47240a = textView;
            this.f47241b = typeface;
            this.f47242c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f47240a.setTypeface(this.f47241b, this.f47242c);
        }
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f47223a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f47223a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f47223a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f47223a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f47223a.getCompoundDrawables();
        TextView textView2 = this.f47223a;
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
        this.f47231i.t(i10, f10);
    }

    private void C(Context context, M m10) {
        String strO;
        this.f47232j = m10.k(C14587j.f136503M2, this.f47232j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iK = m10.k(C14587j.f136515P2, -1);
            this.f47233k = iK;
            if (iK != -1) {
                this.f47232j &= 2;
            }
        }
        if (!m10.s(C14587j.f136511O2) && !m10.s(C14587j.f136519Q2)) {
            if (m10.s(C14587j.f136499L2)) {
                this.f47235m = false;
                int iK2 = m10.k(C14587j.f136499L2, 1);
                if (iK2 == 1) {
                    this.f47234l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f47234l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f47234l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f47234l = null;
        int i11 = m10.s(C14587j.f136519Q2) ? C14587j.f136519Q2 : C14587j.f136511O2;
        int i12 = this.f47233k;
        int i13 = this.f47232j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = m10.j(i11, this.f47232j, new a(i12, i13, new WeakReference(this.f47223a)));
                if (typefaceJ != null) {
                    if (i10 < 28 || this.f47233k == -1) {
                        this.f47234l = typefaceJ;
                    } else {
                        this.f47234l = e.a(FS.typefaceCreateDerived(typefaceJ, 0), this.f47233k, (this.f47232j & 2) != 0);
                    }
                }
                this.f47235m = this.f47234l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f47234l != null || (strO = m10.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f47233k == -1) {
            this.f47234l = Typeface.create(strO, this.f47232j);
        } else {
            this.f47234l = e.a(Typeface.create(strO, 0), this.f47233k, (this.f47232j & 2) != 0);
        }
    }

    private void a(Drawable drawable, K k10) {
        if (drawable == null || k10 == null) {
            return;
        }
        C5771e.i(drawable, k10, this.f47223a.getDrawableState());
    }

    private void z() {
        K k10 = this.f47230h;
        this.f47224b = k10;
        this.f47225c = k10;
        this.f47226d = k10;
        this.f47227e = k10;
        this.f47228f = k10;
        this.f47229g = k10;
    }

    void A(int i10, float f10) {
        if (Y.f47172c || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f47224b != null || this.f47225c != null || this.f47226d != null || this.f47227e != null) {
            Drawable[] compoundDrawables = this.f47223a.getCompoundDrawables();
            a(compoundDrawables[0], this.f47224b);
            a(compoundDrawables[1], this.f47225c);
            a(compoundDrawables[2], this.f47226d);
            a(compoundDrawables[3], this.f47227e);
        }
        if (this.f47228f == null && this.f47229g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f47223a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f47228f);
        a(compoundDrawablesRelative[2], this.f47229g);
    }

    void c() {
        this.f47231i.a();
    }

    int e() {
        return this.f47231i.f();
    }

    int f() {
        return this.f47231i.g();
    }

    int g() {
        return this.f47231i.h();
    }

    int[] h() {
        return this.f47231i.i();
    }

    int i() {
        return this.f47231i.j();
    }

    ColorStateList j() {
        K k10 = this.f47230h;
        if (k10 != null) {
            return k10.f46906a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        K k10 = this.f47230h;
        if (k10 != null) {
            return k10.f46907b;
        }
        return null;
    }

    boolean l() {
        return this.f47231i.n();
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
        Context context = this.f47223a.getContext();
        C5771e c5771eB = C5771e.b();
        M mV = M.v(context, attributeSet, C14587j.f136548Y, i10, 0);
        TextView textView = this.f47223a;
        ViewCompat.k0(textView, textView.getContext(), C14587j.f136548Y, attributeSet, mV.r(), i10, 0);
        int iN = mV.n(C14587j.f136552Z, -1);
        if (mV.s(C14587j.f136567c0)) {
            this.f47224b = d(context, c5771eB, mV.n(C14587j.f136567c0, 0));
        }
        if (mV.s(C14587j.f136557a0)) {
            this.f47225c = d(context, c5771eB, mV.n(C14587j.f136557a0, 0));
        }
        if (mV.s(C14587j.f136572d0)) {
            this.f47226d = d(context, c5771eB, mV.n(C14587j.f136572d0, 0));
        }
        if (mV.s(C14587j.f136562b0)) {
            this.f47227e = d(context, c5771eB, mV.n(C14587j.f136562b0, 0));
        }
        if (mV.s(C14587j.f136577e0)) {
            this.f47228f = d(context, c5771eB, mV.n(C14587j.f136577e0, 0));
        }
        if (mV.s(C14587j.f136582f0)) {
            this.f47229g = d(context, c5771eB, mV.n(C14587j.f136582f0, 0));
        }
        mV.x();
        boolean z12 = this.f47223a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iN != -1) {
            M mT = M.t(context, iN, C14587j.f136491J2);
            if (z12 || !mT.s(C14587j.f136527S2)) {
                zA = false;
                z10 = false;
            } else {
                zA = mT.a(C14587j.f136527S2, false);
                z10 = true;
            }
            C(context, mT);
            int i11 = Build.VERSION.SDK_INT;
            strO2 = mT.s(C14587j.f136531T2) ? mT.o(C14587j.f136531T2) : null;
            strO = (i11 < 26 || !mT.s(C14587j.f136523R2)) ? null : mT.o(C14587j.f136523R2);
            mT.x();
        } else {
            zA = false;
            z10 = false;
            strO = null;
            strO2 = null;
        }
        M mV2 = M.v(context, attributeSet, C14587j.f136491J2, i10, 0);
        if (z12 || !mV2.s(C14587j.f136527S2)) {
            z11 = z10;
        } else {
            zA = mV2.a(C14587j.f136527S2, false);
            z11 = true;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (mV2.s(C14587j.f136531T2)) {
            strO2 = mV2.o(C14587j.f136531T2);
        }
        if (i12 >= 26 && mV2.s(C14587j.f136523R2)) {
            strO = mV2.o(C14587j.f136523R2);
        }
        if (i12 >= 28 && mV2.s(C14587j.f136495K2) && mV2.f(C14587j.f136495K2, -1) == 0) {
            this.f47223a.setTextSize(0, 0.0f);
        }
        C(context, mV2);
        mV2.x();
        if (!z12 && z11) {
            s(zA);
        }
        Typeface typeface = this.f47234l;
        if (typeface != null) {
            if (this.f47233k == -1) {
                this.f47223a.setTypeface(typeface, this.f47232j);
            } else {
                this.f47223a.setTypeface(typeface);
            }
        }
        if (strO != null) {
            d.d(this.f47223a, strO);
        }
        if (strO2 != null) {
            c.b(this.f47223a, c.a(strO2));
        }
        this.f47231i.o(attributeSet, i10);
        if (Y.f47172c && this.f47231i.j() != 0) {
            int[] iArrI = this.f47231i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f47223a) != -1.0f) {
                    d.b(this.f47223a, this.f47231i.g(), this.f47231i.f(), this.f47231i.h(), 0);
                } else {
                    d.c(this.f47223a, iArrI, 0);
                }
            }
        }
        M mU = M.u(context, attributeSet, C14587j.f136587g0);
        int iN2 = mU.n(C14587j.f136627o0, -1);
        Drawable drawableC = iN2 != -1 ? c5771eB.c(context, iN2) : null;
        int iN3 = mU.n(C14587j.f136652t0, -1);
        Drawable drawableC2 = iN3 != -1 ? c5771eB.c(context, iN3) : null;
        int iN4 = mU.n(C14587j.f136632p0, -1);
        Drawable drawableC3 = iN4 != -1 ? c5771eB.c(context, iN4) : null;
        int iN5 = mU.n(C14587j.f136617m0, -1);
        Drawable drawableC4 = iN5 != -1 ? c5771eB.c(context, iN5) : null;
        int iN6 = mU.n(C14587j.f136637q0, -1);
        Drawable drawableC5 = iN6 != -1 ? c5771eB.c(context, iN6) : null;
        int iN7 = mU.n(C14587j.f136622n0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? c5771eB.c(context, iN7) : null);
        if (mU.s(C14587j.f136642r0)) {
            androidx.core.widget.k.h(this.f47223a, mU.c(C14587j.f136642r0));
        }
        if (mU.s(C14587j.f136647s0)) {
            androidx.core.widget.k.i(this.f47223a, C5790y.e(mU.k(C14587j.f136647s0, -1), null));
        }
        int iF = mU.f(C14587j.f136662v0, -1);
        int iF2 = mU.f(C14587j.f136667w0, -1);
        if (mU.s(C14587j.f136672x0)) {
            TypedValue typedValueW = mU.w(C14587j.f136672x0);
            if (typedValueW == null || typedValueW.type != 5) {
                f10 = mU.f(C14587j.f136672x0, -1);
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
            androidx.core.widget.k.k(this.f47223a, iF);
        }
        if (iF2 != -1) {
            androidx.core.widget.k.l(this.f47223a, iF2);
        }
        if (f10 != -1.0f) {
            if (iA == -1) {
                androidx.core.widget.k.m(this.f47223a, (int) f10);
            } else {
                androidx.core.widget.k.n(this.f47223a, iA, f10);
            }
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f47235m) {
            this.f47234l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f47232j));
                } else {
                    textView.setTypeface(typeface, this.f47232j);
                }
            }
        }
    }

    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (Y.f47172c) {
            return;
        }
        c();
    }

    void q(Context context, int i10) {
        String strO;
        M mT = M.t(context, i10, C14587j.f136491J2);
        if (mT.s(C14587j.f136527S2)) {
            s(mT.a(C14587j.f136527S2, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (mT.s(C14587j.f136495K2) && mT.f(C14587j.f136495K2, -1) == 0) {
            this.f47223a.setTextSize(0, 0.0f);
        }
        C(context, mT);
        if (i11 >= 26 && mT.s(C14587j.f136523R2) && (strO = mT.o(C14587j.f136523R2)) != null) {
            d.d(this.f47223a, strO);
        }
        mT.x();
        Typeface typeface = this.f47234l;
        if (typeface != null) {
            this.f47223a.setTypeface(typeface, this.f47232j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C16994c.f(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f47223a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        this.f47231i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) throws IllegalArgumentException {
        this.f47231i.q(iArr, i10);
    }

    void v(int i10) {
        this.f47231i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f47230h == null) {
            this.f47230h = new K();
        }
        K k10 = this.f47230h;
        k10.f46906a = colorStateList;
        k10.f46909d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f47230h == null) {
            this.f47230h = new K();
        }
        K k10 = this.f47230h;
        k10.f46907b = mode;
        k10.f46908c = mode != null;
        z();
    }

    C5781o(TextView textView) {
        this.f47223a = textView;
        this.f47231i = new C5782p(textView);
    }

    private static K d(Context context, C5771e c5771e, int i10) {
        ColorStateList colorStateListF = c5771e.f(context, i10);
        if (colorStateListF != null) {
            K k10 = new K();
            k10.f46909d = true;
            k10.f46906a = colorStateListF;
            return k10;
        }
        return null;
    }

    void p() {
        b();
    }
}
