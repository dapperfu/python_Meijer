package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.M;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d2.C13462a;
import j.C14791a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import oe.C16026c;
import p2.C16236t;
import q2.C16441c;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
class EndCompoundLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    final TextInputLayout f87691a;

    /* renamed from: b, reason: collision with root package name */
    private final FrameLayout f87692b;

    /* renamed from: c, reason: collision with root package name */
    private final CheckableImageButton f87693c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f87694d;

    /* renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f87695e;

    /* renamed from: f, reason: collision with root package name */
    private View.OnLongClickListener f87696f;

    /* renamed from: g, reason: collision with root package name */
    private final CheckableImageButton f87697g;

    /* renamed from: h, reason: collision with root package name */
    private final d f87698h;

    /* renamed from: i, reason: collision with root package name */
    private int f87699i;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashSet<TextInputLayout.g> f87700j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f87701k;

    /* renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f87702l;

    /* renamed from: m, reason: collision with root package name */
    private int f87703m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView.ScaleType f87704n;

    /* renamed from: o, reason: collision with root package name */
    private View.OnLongClickListener f87705o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f87706p;

    /* renamed from: q, reason: collision with root package name */
    private final TextView f87707q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f87708r;

    /* renamed from: s, reason: collision with root package name */
    private EditText f87709s;

    /* renamed from: t, reason: collision with root package name */
    private final AccessibilityManager f87710t;

    /* renamed from: u, reason: collision with root package name */
    private C16441c.a f87711u;

    /* renamed from: v, reason: collision with root package name */
    private final TextWatcher f87712v;

    /* renamed from: w, reason: collision with root package name */
    private final TextInputLayout.f f87713w;

    class a extends com.google.android.material.internal.r {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            EndCompoundLayout.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.r, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            EndCompoundLayout.this.m().b(charSequence, i10, i11, i12);
        }
    }

    class b implements TextInputLayout.f {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            if (EndCompoundLayout.this.f87709s == textInputLayout.getEditText()) {
                return;
            }
            if (EndCompoundLayout.this.f87709s != null) {
                EndCompoundLayout.this.f87709s.removeTextChangedListener(EndCompoundLayout.this.f87712v);
                if (EndCompoundLayout.this.f87709s.getOnFocusChangeListener() == EndCompoundLayout.this.m().e()) {
                    EndCompoundLayout.this.f87709s.setOnFocusChangeListener(null);
                }
            }
            EndCompoundLayout.this.f87709s = textInputLayout.getEditText();
            if (EndCompoundLayout.this.f87709s != null) {
                EndCompoundLayout.this.f87709s.addTextChangedListener(EndCompoundLayout.this.f87712v);
            }
            EndCompoundLayout.this.m().n(EndCompoundLayout.this.f87709s);
            EndCompoundLayout endCompoundLayout = EndCompoundLayout.this;
            endCompoundLayout.h0(endCompoundLayout.m());
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            EndCompoundLayout.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            EndCompoundLayout.this.M();
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private final SparseArray<r> f87717a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        private final EndCompoundLayout f87718b;

        /* renamed from: c, reason: collision with root package name */
        private final int f87719c;

        /* renamed from: d, reason: collision with root package name */
        private final int f87720d;

        private r b(int i10) {
            if (i10 == -1) {
                return new g(this.f87718b);
            }
            if (i10 == 0) {
                return new u(this.f87718b);
            }
            if (i10 == 1) {
                return new w(this.f87718b, this.f87720d);
            }
            if (i10 == 2) {
                return new f(this.f87718b);
            }
            if (i10 == 3) {
                return new p(this.f87718b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        r c(int i10) {
            r rVar = this.f87717a.get(i10);
            if (rVar != null) {
                return rVar;
            }
            r rVarB = b(i10);
            this.f87717a.append(i10, rVarB);
            return rVarB;
        }

        d(EndCompoundLayout endCompoundLayout, M m10) {
            this.f87718b = endCompoundLayout;
            this.f87719c = m10.n(ae.l.f44821A9, 0);
            this.f87720d = m10.n(ae.l.f45099Y9, 0);
        }
    }

    private void B(M m10) {
        if (!m10.s(ae.l.f45110Z9)) {
            if (m10.s(ae.l.f44869E9)) {
                this.f87701k = C16026c.b(getContext(), m10, ae.l.f44869E9);
            }
            if (m10.s(ae.l.f44881F9)) {
                this.f87702l = com.google.android.material.internal.x.l(m10.k(ae.l.f44881F9, -1), null);
            }
        }
        if (m10.s(ae.l.f44845C9)) {
            U(m10.k(ae.l.f44845C9, 0));
            if (m10.s(ae.l.f45421z9)) {
                Q(m10.p(ae.l.f45421z9));
            }
            O(m10.a(ae.l.f45409y9, true));
        } else if (m10.s(ae.l.f45110Z9)) {
            if (m10.s(ae.l.f45122aa)) {
                this.f87701k = C16026c.b(getContext(), m10, ae.l.f45122aa);
            }
            if (m10.s(ae.l.f45134ba)) {
                this.f87702l = com.google.android.material.internal.x.l(m10.k(ae.l.f45134ba, -1), null);
            }
            U(m10.a(ae.l.f45110Z9, false) ? 1 : 0);
            Q(m10.p(ae.l.f45088X9));
        }
        T(m10.f(ae.l.f44833B9, getResources().getDimensionPixelSize(ae.d.f44620o0)));
        if (m10.s(ae.l.f44857D9)) {
            X(s.b(m10.k(ae.l.f44857D9, -1)));
        }
    }

    private void C(M m10) {
        if (m10.s(ae.l.f44941K9)) {
            this.f87694d = C16026c.b(getContext(), m10, ae.l.f44941K9);
        }
        if (m10.s(ae.l.f44953L9)) {
            this.f87695e = com.google.android.material.internal.x.l(m10.k(ae.l.f44953L9, -1), null);
        }
        if (m10.s(ae.l.f44929J9)) {
            c0(m10.g(ae.l.f44929J9));
        }
        this.f87693c.setContentDescription(getResources().getText(ae.j.f44752f));
        ViewCompat.w0(this.f87693c, 2);
        this.f87693c.setClickable(false);
        this.f87693c.setPressable(false);
        this.f87693c.setFocusable(false);
    }

    private void D(M m10) {
        this.f87707q.setVisibility(8);
        this.f87707q.setId(ae.f.f44678X);
        this.f87707q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.o0(this.f87707q, 1);
        q0(m10.n(ae.l.f45314qa, 0));
        if (m10.s(ae.l.f45326ra)) {
            r0(m10.c(ae.l.f45326ra));
        }
        p0(m10.p(ae.l.f45302pa));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        C16441c.a aVar = this.f87711u;
        if (aVar == null || (accessibilityManager = this.f87710t) == null) {
            return;
        }
        C16441c.b(accessibilityManager, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f87711u == null || this.f87710t == null || !ViewCompat.R(this)) {
            return;
        }
        C16441c.a(this.f87710t, this.f87711u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(r rVar) {
        if (this.f87709s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f87709s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f87697g.setOnFocusChangeListener(rVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(ae.h.f44726l, viewGroup, false);
        checkableImageButton.setId(i10);
        s.e(checkableImageButton);
        if (C16026c.h(getContext())) {
            C16236t.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator<TextInputLayout.g> it = this.f87700j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f87691a, i10);
        }
    }

    private int t(r rVar) {
        int i10 = this.f87698h.f87719c;
        return i10 == 0 ? rVar.d() : i10;
    }

    private void u0(boolean z10) {
        if (!z10 || n() == null) {
            s.a(this.f87691a, this.f87697g, this.f87701k, this.f87702l);
            return;
        }
        Drawable drawableMutate = C13462a.r(n()).mutate();
        C13462a.n(drawableMutate, this.f87691a.getErrorCurrentTextColors());
        this.f87697g.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f87692b.setVisibility((this.f87697g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || !((this.f87706p == null || this.f87708r) ? 8 : false)) ? 0 : 8);
    }

    private void y0() {
        int visibility = this.f87707q.getVisibility();
        int i10 = (this.f87706p == null || this.f87708r) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f87707q.setVisibility(i10);
        this.f87691a.m0();
    }

    boolean A() {
        return this.f87699i != 0;
    }

    boolean F() {
        return this.f87692b.getVisibility() == 0 && this.f87697g.getVisibility() == 0;
    }

    boolean G() {
        return this.f87693c.getVisibility() == 0;
    }

    void H(boolean z10) {
        this.f87708r = z10;
        y0();
    }

    void J() {
        s.d(this.f87691a, this.f87697g, this.f87701k);
    }

    void K() {
        s.d(this.f87691a, this.f87693c, this.f87694d);
    }

    void N(boolean z10) {
        this.f87697g.setActivated(z10);
    }

    void O(boolean z10) {
        this.f87697g.setCheckable(z10);
    }

    void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    void R(int i10) {
        S(i10 != 0 ? C14791a.b(getContext(), i10) : null);
    }

    void S(Drawable drawable) {
        this.f87697g.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f87691a, this.f87697g, this.f87701k, this.f87702l);
            J();
        }
    }

    void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f87703m) {
            this.f87703m = i10;
            s.g(this.f87697g, i10);
            s.g(this.f87693c, i10);
        }
    }

    void U(int i10) {
        if (this.f87699i == i10) {
            return;
        }
        t0(m());
        int i11 = this.f87699i;
        this.f87699i = i10;
        j(i11);
        a0(i10 != 0);
        r rVarM = m();
        R(t(rVarM));
        P(rVarM.c());
        O(rVarM.l());
        if (!rVarM.i(this.f87691a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f87691a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(rVarM);
        V(rVarM.f());
        EditText editText = this.f87709s;
        if (editText != null) {
            rVarM.n(editText);
            h0(rVarM);
        }
        s.a(this.f87691a, this.f87697g, this.f87701k, this.f87702l);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        s.h(this.f87697g, onClickListener, this.f87705o);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f87705o = onLongClickListener;
        s.i(this.f87697g, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.f87704n = scaleType;
        s.j(this.f87697g, scaleType);
        s.j(this.f87693c, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f87701k != colorStateList) {
            this.f87701k = colorStateList;
            s.a(this.f87691a, this.f87697g, colorStateList, this.f87702l);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f87702l != mode) {
            this.f87702l = mode;
            s.a(this.f87691a, this.f87697g, this.f87701k, mode);
        }
    }

    void b0(int i10) {
        c0(i10 != 0 ? C14791a.b(getContext(), i10) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f87693c.setImageDrawable(drawable);
        w0();
        s.a(this.f87691a, this.f87693c, this.f87694d, this.f87695e);
    }

    void d0(View.OnClickListener onClickListener) {
        s.h(this.f87693c, onClickListener, this.f87696f);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f87696f = onLongClickListener;
        s.i(this.f87693c, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f87694d != colorStateList) {
            this.f87694d = colorStateList;
            s.a(this.f87691a, this.f87693c, colorStateList, this.f87695e);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f87695e != mode) {
            this.f87695e = mode;
            s.a(this.f87691a, this.f87693c, this.f87694d, mode);
        }
    }

    void h() {
        this.f87697g.performClick();
        this.f87697g.jumpDrawablesToCurrentState();
    }

    void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    void j0(CharSequence charSequence) {
        this.f87697g.setContentDescription(charSequence);
    }

    void k0(int i10) {
        l0(i10 != 0 ? C14791a.b(getContext(), i10) : null);
    }

    CharSequence l() {
        return this.f87697g.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f87697g.setImageDrawable(drawable);
    }

    r m() {
        return this.f87698h.c(this.f87699i);
    }

    void m0(boolean z10) {
        if (z10 && this.f87699i != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f87697g.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f87701k = colorStateList;
        s.a(this.f87691a, this.f87697g, colorStateList, this.f87702l);
    }

    int o() {
        return this.f87703m;
    }

    void o0(PorterDuff.Mode mode) {
        this.f87702l = mode;
        s.a(this.f87691a, this.f87697g, this.f87701k, mode);
    }

    int p() {
        return this.f87699i;
    }

    ImageView.ScaleType q() {
        return this.f87704n;
    }

    void q0(int i10) {
        androidx.core.widget.k.p(this.f87707q, i10);
    }

    CheckableImageButton r() {
        return this.f87697g;
    }

    void r0(ColorStateList colorStateList) {
        this.f87707q.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f87693c.getDrawable();
    }

    CharSequence u() {
        return this.f87697g.getContentDescription();
    }

    Drawable v() {
        return this.f87697g.getDrawable();
    }

    CharSequence w() {
        return this.f87706p;
    }

    ColorStateList x() {
        return this.f87707q.getTextColors();
    }

    void x0() {
        if (this.f87691a.f87778d == null) {
            return;
        }
        ViewCompat.B0(this.f87707q, getContext().getResources().getDimensionPixelSize(ae.d.f44581Q), this.f87691a.f87778d.getPaddingTop(), (F() || G()) ? 0 : ViewCompat.D(this.f87691a.f87778d), this.f87691a.f87778d.getPaddingBottom());
    }

    TextView z() {
        return this.f87707q;
    }

    EndCompoundLayout(TextInputLayout textInputLayout, M m10) {
        super(textInputLayout.getContext());
        this.f87699i = 0;
        this.f87700j = new LinkedHashSet<>();
        this.f87712v = new a();
        b bVar = new b();
        this.f87713w = bVar;
        this.f87710t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f87691a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f87692b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, ae.f.f44672R);
        this.f87693c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, ae.f.f44671Q);
        this.f87697g = checkableImageButtonI2;
        this.f87698h = new d(this, m10);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f87707q = appCompatTextView;
        C(m10);
        B(m10);
        D(m10);
        frameLayout.addView(checkableImageButtonI2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void s0(r rVar) {
        rVar.s();
        this.f87711u = rVar.h();
        g();
    }

    private void t0(r rVar) {
        M();
        this.f87711u = null;
        rVar.u();
    }

    private void w0() {
        boolean z10;
        int i10 = 0;
        if (s() != null && this.f87691a.N() && this.f87691a.b0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        CheckableImageButton checkableImageButton = this.f87693c;
        if (!z10) {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        v0();
        x0();
        if (!A()) {
            this.f87691a.m0();
        }
    }

    boolean E() {
        if (A() && this.f87697g.isChecked()) {
            return true;
        }
        return false;
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f87691a.b0());
        }
    }

    void L(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        r rVarM = m();
        boolean z12 = true;
        if (rVarM.l() && (zIsChecked = this.f87697g.isChecked()) != rVarM.m()) {
            this.f87697g.setChecked(!zIsChecked);
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVarM.j() && (zIsActivated = this.f87697g.isActivated()) != rVarM.k()) {
            N(!zIsActivated);
        } else {
            z12 = z11;
        }
        if (!z10 && !z12) {
            return;
        }
        J();
    }

    void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f87697g.setContentDescription(charSequence);
        }
    }

    void a0(boolean z10) {
        int i10;
        if (F() != z10) {
            CheckableImageButton checkableImageButton = this.f87697g;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            v0();
            x0();
            this.f87691a.m0();
        }
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f87693c;
        }
        if (A() && F()) {
            return this.f87697g;
        }
        return null;
    }

    void p0(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f87706p = charSequence2;
        this.f87707q.setText(charSequence);
        y0();
    }

    int y() {
        int measuredWidth;
        if (!F() && !G()) {
            measuredWidth = 0;
        } else {
            measuredWidth = this.f87697g.getMeasuredWidth() + C16236t.b((ViewGroup.MarginLayoutParams) this.f87697g.getLayoutParams());
        }
        return ViewCompat.D(this) + ViewCompat.D(this.f87707q) + measuredWidth;
    }
}
