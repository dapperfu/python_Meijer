package com.google.android.material.textfield;

import ae.C5597b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.ViewCompat;
import be.C6230a;
import q2.C16441c;

/* loaded from: classes4.dex */
class p extends r {

    /* renamed from: s, reason: collision with root package name */
    private static final boolean f87857s = true;

    /* renamed from: e, reason: collision with root package name */
    private final int f87858e;

    /* renamed from: f, reason: collision with root package name */
    private final int f87859f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f87860g;

    /* renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f87861h;

    /* renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f87862i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f87863j;

    /* renamed from: k, reason: collision with root package name */
    private final C16441c.a f87864k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f87865l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f87866m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f87867n;

    /* renamed from: o, reason: collision with root package name */
    private long f87868o;

    /* renamed from: p, reason: collision with root package name */
    private AccessibilityManager f87869p;

    /* renamed from: q, reason: collision with root package name */
    private ValueAnimator f87870q;

    /* renamed from: r, reason: collision with root package name */
    private ValueAnimator f87871r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f87871r.start();
        }
    }

    private void K() {
        this.f87866m = true;
        this.f87868o = System.currentTimeMillis();
    }

    @Override // com.google.android.material.textfield.r
    boolean i(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.r
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.r
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.r
    boolean t() {
        return true;
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.f87871r = E(this.f87859f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f87858e, 1.0f, 0.0f);
        this.f87870q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private void H(boolean z10) {
        if (this.f87867n != z10) {
            this.f87867n = z10;
            this.f87871r.cancel();
            this.f87870q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void I() {
        this.f87861h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(this.f87851a, view, motionEvent);
            }
        });
        if (f87857s) {
            this.f87861h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    p.A(this.f87852a);
                }
            });
        }
        this.f87861h.setThreshold(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.f87861h == null) {
            return;
        }
        if (G()) {
            this.f87866m = false;
        }
        if (this.f87866m) {
            this.f87866m = false;
            return;
        }
        if (f87857s) {
            H(!this.f87867n);
        } else {
            this.f87867n = !this.f87867n;
            r();
        }
        if (!this.f87867n) {
            this.f87861h.dismissDropDown();
        } else {
            this.f87861h.requestFocus();
            this.f87861h.showDropDown();
        }
    }

    public static /* synthetic */ void v(p pVar) {
        boolean zIsPopupShowing = pVar.f87861h.isPopupShowing();
        pVar.H(zIsPopupShowing);
        pVar.f87866m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = pVar.f87861h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        ViewCompat.w0(pVar.f87876d, z10 ? 2 : 1);
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z10) {
        pVar.f87865l = z10;
        pVar.r();
        if (z10) {
            return;
        }
        pVar.H(false);
        pVar.f87866m = false;
    }

    @Override // com.google.android.material.textfield.r
    public void a(Editable editable) {
        if (this.f87869p.isTouchExplorationEnabled() && q.a(this.f87861h) && !this.f87876d.hasFocus()) {
            this.f87861h.dismissDropDown();
        }
        this.f87861h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(this.f87856a);
            }
        });
    }

    @Override // com.google.android.material.textfield.r
    int c() {
        return ae.j.f44753g;
    }

    @Override // com.google.android.material.textfield.r
    int d() {
        return f87857s ? ae.e.f44651i : ae.e.f44652j;
    }

    @Override // com.google.android.material.textfield.r
    View.OnFocusChangeListener e() {
        return this.f87863j;
    }

    @Override // com.google.android.material.textfield.r
    View.OnClickListener f() {
        return this.f87862i;
    }

    @Override // com.google.android.material.textfield.r
    public C16441c.a h() {
        return this.f87864k;
    }

    @Override // com.google.android.material.textfield.r
    boolean k() {
        return this.f87865l;
    }

    @Override // com.google.android.material.textfield.r
    boolean m() {
        return this.f87867n;
    }

    @Override // com.google.android.material.textfield.r
    public void o(View view, q2.y yVar) {
        if (!q.a(this.f87861h)) {
            yVar.p0(Spinner.class.getName());
        }
        if (yVar.Y()) {
            yVar.C0(null);
        }
    }

    @Override // com.google.android.material.textfield.r
    @SuppressLint({"WrongConstant"})
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f87869p.isEnabled() || q.a(this.f87861h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f87867n && !this.f87861h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            J();
            K();
        }
    }

    @Override // com.google.android.material.textfield.r
    @SuppressLint({"ClickableViewAccessibility"})
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f87861h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f87857s) {
                this.f87861h.setOnDismissListener(null);
            }
        }
    }

    p(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f87862i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87853a.J();
            }
        };
        this.f87863j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                p.y(this.f87854a, view, z10);
            }
        };
        this.f87864k = new C16441c.a() { // from class: com.google.android.material.textfield.n
            @Override // q2.C16441c.a
            public final void onTouchExplorationStateChanged(boolean z10) {
                p.w(this.f87855a, z10);
            }
        };
        this.f87868o = Long.MAX_VALUE;
        this.f87859f = ne.i.f(endCompoundLayout.getContext(), C5597b.f44493O, 67);
        this.f87858e = ne.i.f(endCompoundLayout.getContext(), C5597b.f44493O, 50);
        this.f87860g = ne.i.g(endCompoundLayout.getContext(), C5597b.f44498T, C6230a.f60115a);
    }

    public static /* synthetic */ void A(p pVar) {
        pVar.K();
        pVar.H(false);
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f87860g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(this.f87850a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f87868o;
        if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= 300) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f87876d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f87866m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.r
    public void n(EditText editText) {
        this.f87861h = D(editText);
        I();
        this.f87873a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f87869p.isTouchExplorationEnabled()) {
            ViewCompat.w0(this.f87876d, 2);
        }
        this.f87873a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.r
    void s() {
        F();
        this.f87869p = (AccessibilityManager) this.f87875c.getSystemService("accessibility");
    }
}
