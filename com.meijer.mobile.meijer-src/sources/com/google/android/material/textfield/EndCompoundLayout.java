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
import d2.C13595a;
import j.C14879a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p2.C16381t;
import q2.C16596c;
import qe.C16634c;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
class EndCompoundLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    final TextInputLayout f88531a;

    /* renamed from: b, reason: collision with root package name */
    private final FrameLayout f88532b;

    /* renamed from: c, reason: collision with root package name */
    private final CheckableImageButton f88533c;

    /* renamed from: d, reason: collision with root package name */
    private ColorStateList f88534d;

    /* renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f88535e;

    /* renamed from: f, reason: collision with root package name */
    private View.OnLongClickListener f88536f;

    /* renamed from: g, reason: collision with root package name */
    private final CheckableImageButton f88537g;

    /* renamed from: h, reason: collision with root package name */
    private final d f88538h;

    /* renamed from: i, reason: collision with root package name */
    private int f88539i;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashSet<TextInputLayout.g> f88540j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f88541k;

    /* renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f88542l;

    /* renamed from: m, reason: collision with root package name */
    private int f88543m;

    /* renamed from: n, reason: collision with root package name */
    private ImageView.ScaleType f88544n;

    /* renamed from: o, reason: collision with root package name */
    private View.OnLongClickListener f88545o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f88546p;

    /* renamed from: q, reason: collision with root package name */
    private final TextView f88547q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f88548r;

    /* renamed from: s, reason: collision with root package name */
    private EditText f88549s;

    /* renamed from: t, reason: collision with root package name */
    private final AccessibilityManager f88550t;

    /* renamed from: u, reason: collision with root package name */
    private C16596c.a f88551u;

    /* renamed from: v, reason: collision with root package name */
    private final TextWatcher f88552v;

    /* renamed from: w, reason: collision with root package name */
    private final TextInputLayout.f f88553w;

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
            if (EndCompoundLayout.this.f88549s == textInputLayout.getEditText()) {
                return;
            }
            if (EndCompoundLayout.this.f88549s != null) {
                EndCompoundLayout.this.f88549s.removeTextChangedListener(EndCompoundLayout.this.f88552v);
                if (EndCompoundLayout.this.f88549s.getOnFocusChangeListener() == EndCompoundLayout.this.m().e()) {
                    EndCompoundLayout.this.f88549s.setOnFocusChangeListener(null);
                }
            }
            EndCompoundLayout.this.f88549s = textInputLayout.getEditText();
            if (EndCompoundLayout.this.f88549s != null) {
                EndCompoundLayout.this.f88549s.addTextChangedListener(EndCompoundLayout.this.f88552v);
            }
            EndCompoundLayout.this.m().n(EndCompoundLayout.this.f88549s);
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
        private final SparseArray<r> f88557a = new SparseArray<>();

        /* renamed from: b, reason: collision with root package name */
        private final EndCompoundLayout f88558b;

        /* renamed from: c, reason: collision with root package name */
        private final int f88559c;

        /* renamed from: d, reason: collision with root package name */
        private final int f88560d;

        private r b(int i10) {
            if (i10 == -1) {
                return new g(this.f88558b);
            }
            if (i10 == 0) {
                return new u(this.f88558b);
            }
            if (i10 == 1) {
                return new w(this.f88558b, this.f88560d);
            }
            if (i10 == 2) {
                return new f(this.f88558b);
            }
            if (i10 == 3) {
                return new p(this.f88558b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        r c(int i10) {
            r rVar = this.f88557a.get(i10);
            if (rVar != null) {
                return rVar;
            }
            r rVarB = b(i10);
            this.f88557a.append(i10, rVarB);
            return rVarB;
        }

        d(EndCompoundLayout endCompoundLayout, M m10) {
            this.f88558b = endCompoundLayout;
            this.f88559c = m10.n(ce.l.f61836A9, 0);
            this.f88560d = m10.n(ce.l.f62114Y9, 0);
        }
    }

    private void B(M m10) {
        if (!m10.s(ce.l.f62125Z9)) {
            if (m10.s(ce.l.f61884E9)) {
                this.f88541k = C16634c.b(getContext(), m10, ce.l.f61884E9);
            }
            if (m10.s(ce.l.f61896F9)) {
                this.f88542l = com.google.android.material.internal.x.l(m10.k(ce.l.f61896F9, -1), null);
            }
        }
        if (m10.s(ce.l.f61860C9)) {
            U(m10.k(ce.l.f61860C9, 0));
            if (m10.s(ce.l.f62436z9)) {
                Q(m10.p(ce.l.f62436z9));
            }
            O(m10.a(ce.l.f62424y9, true));
        } else if (m10.s(ce.l.f62125Z9)) {
            if (m10.s(ce.l.f62137aa)) {
                this.f88541k = C16634c.b(getContext(), m10, ce.l.f62137aa);
            }
            if (m10.s(ce.l.f62149ba)) {
                this.f88542l = com.google.android.material.internal.x.l(m10.k(ce.l.f62149ba, -1), null);
            }
            U(m10.a(ce.l.f62125Z9, false) ? 1 : 0);
            Q(m10.p(ce.l.f62103X9));
        }
        T(m10.f(ce.l.f61848B9, getResources().getDimensionPixelSize(ce.d.f61635o0)));
        if (m10.s(ce.l.f61872D9)) {
            X(s.b(m10.k(ce.l.f61872D9, -1)));
        }
    }

    private void C(M m10) {
        if (m10.s(ce.l.f61956K9)) {
            this.f88534d = C16634c.b(getContext(), m10, ce.l.f61956K9);
        }
        if (m10.s(ce.l.f61968L9)) {
            this.f88535e = com.google.android.material.internal.x.l(m10.k(ce.l.f61968L9, -1), null);
        }
        if (m10.s(ce.l.f61944J9)) {
            c0(m10.g(ce.l.f61944J9));
        }
        this.f88533c.setContentDescription(getResources().getText(ce.j.f61767f));
        ViewCompat.w0(this.f88533c, 2);
        this.f88533c.setClickable(false);
        this.f88533c.setPressable(false);
        this.f88533c.setFocusable(false);
    }

    private void D(M m10) {
        this.f88547q.setVisibility(8);
        this.f88547q.setId(ce.f.f61693X);
        this.f88547q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.o0(this.f88547q, 1);
        q0(m10.n(ce.l.f62329qa, 0));
        if (m10.s(ce.l.f62341ra)) {
            r0(m10.c(ce.l.f62341ra));
        }
        p0(m10.p(ce.l.f62317pa));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        AccessibilityManager accessibilityManager;
        C16596c.a aVar = this.f88551u;
        if (aVar == null || (accessibilityManager = this.f88550t) == null) {
            return;
        }
        C16596c.b(accessibilityManager, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f88551u == null || this.f88550t == null || !ViewCompat.R(this)) {
            return;
        }
        C16596c.a(this.f88550t, this.f88551u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(r rVar) {
        if (this.f88549s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f88549s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f88537g.setOnFocusChangeListener(rVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(ce.h.f61741l, viewGroup, false);
        checkableImageButton.setId(i10);
        s.e(checkableImageButton);
        if (C16634c.h(getContext())) {
            C16381t.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator<TextInputLayout.g> it = this.f88540j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f88531a, i10);
        }
    }

    private int t(r rVar) {
        int i10 = this.f88538h.f88559c;
        return i10 == 0 ? rVar.d() : i10;
    }

    private void u0(boolean z10) {
        if (!z10 || n() == null) {
            s.a(this.f88531a, this.f88537g, this.f88541k, this.f88542l);
            return;
        }
        Drawable drawableMutate = C13595a.r(n()).mutate();
        C13595a.n(drawableMutate, this.f88531a.getErrorCurrentTextColors());
        this.f88537g.setImageDrawable(drawableMutate);
    }

    private void v0() {
        this.f88532b.setVisibility((this.f88537g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || !((this.f88546p == null || this.f88548r) ? 8 : false)) ? 0 : 8);
    }

    private void y0() {
        int visibility = this.f88547q.getVisibility();
        int i10 = (this.f88546p == null || this.f88548r) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f88547q.setVisibility(i10);
        this.f88531a.m0();
    }

    boolean A() {
        return this.f88539i != 0;
    }

    boolean F() {
        return this.f88532b.getVisibility() == 0 && this.f88537g.getVisibility() == 0;
    }

    boolean G() {
        return this.f88533c.getVisibility() == 0;
    }

    void H(boolean z10) {
        this.f88548r = z10;
        y0();
    }

    void J() {
        s.d(this.f88531a, this.f88537g, this.f88541k);
    }

    void K() {
        s.d(this.f88531a, this.f88533c, this.f88534d);
    }

    void N(boolean z10) {
        this.f88537g.setActivated(z10);
    }

    void O(boolean z10) {
        this.f88537g.setCheckable(z10);
    }

    void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    void R(int i10) {
        S(i10 != 0 ? C14879a.b(getContext(), i10) : null);
    }

    void S(Drawable drawable) {
        this.f88537g.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f88531a, this.f88537g, this.f88541k, this.f88542l);
            J();
        }
    }

    void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f88543m) {
            this.f88543m = i10;
            s.g(this.f88537g, i10);
            s.g(this.f88533c, i10);
        }
    }

    void U(int i10) {
        if (this.f88539i == i10) {
            return;
        }
        t0(m());
        int i11 = this.f88539i;
        this.f88539i = i10;
        j(i11);
        a0(i10 != 0);
        r rVarM = m();
        R(t(rVarM));
        P(rVarM.c());
        O(rVarM.l());
        if (!rVarM.i(this.f88531a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f88531a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(rVarM);
        V(rVarM.f());
        EditText editText = this.f88549s;
        if (editText != null) {
            rVarM.n(editText);
            h0(rVarM);
        }
        s.a(this.f88531a, this.f88537g, this.f88541k, this.f88542l);
        L(true);
    }

    void V(View.OnClickListener onClickListener) {
        s.h(this.f88537g, onClickListener, this.f88545o);
    }

    void W(View.OnLongClickListener onLongClickListener) {
        this.f88545o = onLongClickListener;
        s.i(this.f88537g, onLongClickListener);
    }

    void X(ImageView.ScaleType scaleType) {
        this.f88544n = scaleType;
        s.j(this.f88537g, scaleType);
        s.j(this.f88533c, scaleType);
    }

    void Y(ColorStateList colorStateList) {
        if (this.f88541k != colorStateList) {
            this.f88541k = colorStateList;
            s.a(this.f88531a, this.f88537g, colorStateList, this.f88542l);
        }
    }

    void Z(PorterDuff.Mode mode) {
        if (this.f88542l != mode) {
            this.f88542l = mode;
            s.a(this.f88531a, this.f88537g, this.f88541k, mode);
        }
    }

    void b0(int i10) {
        c0(i10 != 0 ? C14879a.b(getContext(), i10) : null);
        K();
    }

    void c0(Drawable drawable) {
        this.f88533c.setImageDrawable(drawable);
        w0();
        s.a(this.f88531a, this.f88533c, this.f88534d, this.f88535e);
    }

    void d0(View.OnClickListener onClickListener) {
        s.h(this.f88533c, onClickListener, this.f88536f);
    }

    void e0(View.OnLongClickListener onLongClickListener) {
        this.f88536f = onLongClickListener;
        s.i(this.f88533c, onLongClickListener);
    }

    void f0(ColorStateList colorStateList) {
        if (this.f88534d != colorStateList) {
            this.f88534d = colorStateList;
            s.a(this.f88531a, this.f88533c, colorStateList, this.f88535e);
        }
    }

    void g0(PorterDuff.Mode mode) {
        if (this.f88535e != mode) {
            this.f88535e = mode;
            s.a(this.f88531a, this.f88533c, this.f88534d, mode);
        }
    }

    void h() {
        this.f88537g.performClick();
        this.f88537g.jumpDrawablesToCurrentState();
    }

    void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    void j0(CharSequence charSequence) {
        this.f88537g.setContentDescription(charSequence);
    }

    void k0(int i10) {
        l0(i10 != 0 ? C14879a.b(getContext(), i10) : null);
    }

    CharSequence l() {
        return this.f88537g.getContentDescription();
    }

    void l0(Drawable drawable) {
        this.f88537g.setImageDrawable(drawable);
    }

    r m() {
        return this.f88538h.c(this.f88539i);
    }

    void m0(boolean z10) {
        if (z10 && this.f88539i != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    Drawable n() {
        return this.f88537g.getDrawable();
    }

    void n0(ColorStateList colorStateList) {
        this.f88541k = colorStateList;
        s.a(this.f88531a, this.f88537g, colorStateList, this.f88542l);
    }

    int o() {
        return this.f88543m;
    }

    void o0(PorterDuff.Mode mode) {
        this.f88542l = mode;
        s.a(this.f88531a, this.f88537g, this.f88541k, mode);
    }

    int p() {
        return this.f88539i;
    }

    ImageView.ScaleType q() {
        return this.f88544n;
    }

    void q0(int i10) {
        androidx.core.widget.k.p(this.f88547q, i10);
    }

    CheckableImageButton r() {
        return this.f88537g;
    }

    void r0(ColorStateList colorStateList) {
        this.f88547q.setTextColor(colorStateList);
    }

    Drawable s() {
        return this.f88533c.getDrawable();
    }

    CharSequence u() {
        return this.f88537g.getContentDescription();
    }

    Drawable v() {
        return this.f88537g.getDrawable();
    }

    CharSequence w() {
        return this.f88546p;
    }

    ColorStateList x() {
        return this.f88547q.getTextColors();
    }

    void x0() {
        if (this.f88531a.f88618d == null) {
            return;
        }
        ViewCompat.B0(this.f88547q, getContext().getResources().getDimensionPixelSize(ce.d.f61596Q), this.f88531a.f88618d.getPaddingTop(), (F() || G()) ? 0 : ViewCompat.D(this.f88531a.f88618d), this.f88531a.f88618d.getPaddingBottom());
    }

    TextView z() {
        return this.f88547q;
    }

    EndCompoundLayout(TextInputLayout textInputLayout, M m10) {
        super(textInputLayout.getContext());
        this.f88539i = 0;
        this.f88540j = new LinkedHashSet<>();
        this.f88552v = new a();
        b bVar = new b();
        this.f88553w = bVar;
        this.f88550t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f88531a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f88532b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, ce.f.f61687R);
        this.f88533c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, ce.f.f61686Q);
        this.f88537g = checkableImageButtonI2;
        this.f88538h = new d(this, m10);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f88547q = appCompatTextView;
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
        this.f88551u = rVar.h();
        g();
    }

    private void t0(r rVar) {
        M();
        this.f88551u = null;
        rVar.u();
    }

    private void w0() {
        boolean z10;
        int i10 = 0;
        if (s() != null && this.f88531a.N() && this.f88531a.b0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        CheckableImageButton checkableImageButton = this.f88533c;
        if (!z10) {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        v0();
        x0();
        if (!A()) {
            this.f88531a.m0();
        }
    }

    boolean E() {
        if (A() && this.f88537g.isChecked()) {
            return true;
        }
        return false;
    }

    void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f88531a.b0());
        }
    }

    void L(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        r rVarM = m();
        boolean z12 = true;
        if (rVarM.l() && (zIsChecked = this.f88537g.isChecked()) != rVarM.m()) {
            this.f88537g.setChecked(!zIsChecked);
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVarM.j() && (zIsActivated = this.f88537g.isActivated()) != rVarM.k()) {
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
            this.f88537g.setContentDescription(charSequence);
        }
    }

    void a0(boolean z10) {
        int i10;
        if (F() != z10) {
            CheckableImageButton checkableImageButton = this.f88537g;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            v0();
            x0();
            this.f88531a.m0();
        }
    }

    CheckableImageButton k() {
        if (G()) {
            return this.f88533c;
        }
        if (A() && F()) {
            return this.f88537g;
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
        this.f88546p = charSequence2;
        this.f88547q.setText(charSequence);
        y0();
    }

    int y() {
        int measuredWidth;
        if (!F() && !G()) {
            measuredWidth = 0;
        } else {
            measuredWidth = this.f88537g.getMeasuredWidth() + C16381t.b((ViewGroup.MarginLayoutParams) this.f88537g.getLayoutParams());
        }
        return ViewCompat.D(this) + ViewCompat.D(this.f88547q) + measuredWidth;
    }
}
