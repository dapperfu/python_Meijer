package com.google.android.material.textfield;

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
import ce.C6503b;
import de.C13661a;
import q2.C16596c;

/* loaded from: classes4.dex */
class p extends r {

    /* renamed from: s, reason: collision with root package name */
    private static final boolean f88697s = true;

    /* renamed from: e, reason: collision with root package name */
    private final int f88698e;

    /* renamed from: f, reason: collision with root package name */
    private final int f88699f;

    /* renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f88700g;

    /* renamed from: h, reason: collision with root package name */
    private AutoCompleteTextView f88701h;

    /* renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f88702i;

    /* renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f88703j;

    /* renamed from: k, reason: collision with root package name */
    private final C16596c.a f88704k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f88705l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f88706m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f88707n;

    /* renamed from: o, reason: collision with root package name */
    private long f88708o;

    /* renamed from: p, reason: collision with root package name */
    private AccessibilityManager f88709p;

    /* renamed from: q, reason: collision with root package name */
    private ValueAnimator f88710q;

    /* renamed from: r, reason: collision with root package name */
    private ValueAnimator f88711r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f88711r.start();
        }
    }

    private void K() {
        this.f88706m = true;
        this.f88708o = System.currentTimeMillis();
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
        this.f88711r = E(this.f88699f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f88698e, 1.0f, 0.0f);
        this.f88710q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private void H(boolean z10) {
        if (this.f88707n != z10) {
            this.f88707n = z10;
            this.f88711r.cancel();
            this.f88710q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void I() {
        this.f88701h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(this.f88691a, view, motionEvent);
            }
        });
        if (f88697s) {
            this.f88701h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    p.A(this.f88692a);
                }
            });
        }
        this.f88701h.setThreshold(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.f88701h == null) {
            return;
        }
        if (G()) {
            this.f88706m = false;
        }
        if (this.f88706m) {
            this.f88706m = false;
            return;
        }
        if (f88697s) {
            H(!this.f88707n);
        } else {
            this.f88707n = !this.f88707n;
            r();
        }
        if (!this.f88707n) {
            this.f88701h.dismissDropDown();
        } else {
            this.f88701h.requestFocus();
            this.f88701h.showDropDown();
        }
    }

    public static /* synthetic */ void v(p pVar) {
        boolean zIsPopupShowing = pVar.f88701h.isPopupShowing();
        pVar.H(zIsPopupShowing);
        pVar.f88706m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = pVar.f88701h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        ViewCompat.w0(pVar.f88716d, z10 ? 2 : 1);
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z10) {
        pVar.f88705l = z10;
        pVar.r();
        if (z10) {
            return;
        }
        pVar.H(false);
        pVar.f88706m = false;
    }

    @Override // com.google.android.material.textfield.r
    public void a(Editable editable) {
        if (this.f88709p.isTouchExplorationEnabled() && q.a(this.f88701h) && !this.f88716d.hasFocus()) {
            this.f88701h.dismissDropDown();
        }
        this.f88701h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(this.f88696a);
            }
        });
    }

    @Override // com.google.android.material.textfield.r
    int c() {
        return ce.j.f61768g;
    }

    @Override // com.google.android.material.textfield.r
    int d() {
        return f88697s ? ce.e.f61666i : ce.e.f61667j;
    }

    @Override // com.google.android.material.textfield.r
    View.OnFocusChangeListener e() {
        return this.f88703j;
    }

    @Override // com.google.android.material.textfield.r
    View.OnClickListener f() {
        return this.f88702i;
    }

    @Override // com.google.android.material.textfield.r
    public C16596c.a h() {
        return this.f88704k;
    }

    @Override // com.google.android.material.textfield.r
    boolean k() {
        return this.f88705l;
    }

    @Override // com.google.android.material.textfield.r
    boolean m() {
        return this.f88707n;
    }

    @Override // com.google.android.material.textfield.r
    public void o(View view, q2.y yVar) {
        if (!q.a(this.f88701h)) {
            yVar.p0(Spinner.class.getName());
        }
        if (yVar.Y()) {
            yVar.C0(null);
        }
    }

    @Override // com.google.android.material.textfield.r
    @SuppressLint({"WrongConstant"})
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f88709p.isEnabled() || q.a(this.f88701h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f88707n && !this.f88701h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            J();
            K();
        }
    }

    @Override // com.google.android.material.textfield.r
    @SuppressLint({"ClickableViewAccessibility"})
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f88701h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f88697s) {
                this.f88701h.setOnDismissListener(null);
            }
        }
    }

    p(EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
        this.f88702i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88693a.J();
            }
        };
        this.f88703j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                p.y(this.f88694a, view, z10);
            }
        };
        this.f88704k = new C16596c.a() { // from class: com.google.android.material.textfield.n
            @Override // q2.C16596c.a
            public final void onTouchExplorationStateChanged(boolean z10) {
                p.w(this.f88695a, z10);
            }
        };
        this.f88708o = Long.MAX_VALUE;
        this.f88699f = pe.i.f(endCompoundLayout.getContext(), C6503b.f61508O, 67);
        this.f88698e = pe.i.f(endCompoundLayout.getContext(), C6503b.f61508O, 50);
        this.f88700g = pe.i.g(endCompoundLayout.getContext(), C6503b.f61513T, C13661a.f128350a);
    }

    public static /* synthetic */ void A(p pVar) {
        pVar.K();
        pVar.H(false);
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f88700g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(this.f88690a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f88708o;
        if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= 300) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f88716d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f88706m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.r
    public void n(EditText editText) {
        this.f88701h = D(editText);
        I();
        this.f88713a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f88709p.isTouchExplorationEnabled()) {
            ViewCompat.w0(this.f88716d, 2);
        }
        this.f88713a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.r
    void s() {
        F();
        this.f88709p = (AccessibilityManager) this.f88715c.getSystemService("accessibility");
    }
}
