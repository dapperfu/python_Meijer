package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.view.ViewCompat;
import androidx.emoji2.text.f;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;
import d2.C13595a;
import i.C14578a;
import i.C14585h;
import i.C14587j;
import j.C14879a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import m.C15614a;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements FSDraw {

    /* renamed from: S, reason: collision with root package name */
    private static final Property<SwitchCompat, Float> f47040S = new a(Float.class, "thumbPos");

    /* renamed from: T, reason: collision with root package name */
    private static final int[] f47041T = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    private int f47042A;

    /* renamed from: B, reason: collision with root package name */
    private int f47043B;

    /* renamed from: C, reason: collision with root package name */
    private int f47044C;

    /* renamed from: D, reason: collision with root package name */
    private int f47045D;

    /* renamed from: E, reason: collision with root package name */
    private int f47046E;

    /* renamed from: F, reason: collision with root package name */
    private int f47047F;

    /* renamed from: G, reason: collision with root package name */
    private int f47048G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f47049H;

    /* renamed from: I, reason: collision with root package name */
    private final TextPaint f47050I;

    /* renamed from: J, reason: collision with root package name */
    private ColorStateList f47051J;

    /* renamed from: K, reason: collision with root package name */
    private Layout f47052K;

    /* renamed from: L, reason: collision with root package name */
    private Layout f47053L;

    /* renamed from: M, reason: collision with root package name */
    private TransformationMethod f47054M;

    /* renamed from: N, reason: collision with root package name */
    ObjectAnimator f47055N;

    /* renamed from: O, reason: collision with root package name */
    private final C5781o f47056O;

    /* renamed from: P, reason: collision with root package name */
    private C5773g f47057P;

    /* renamed from: Q, reason: collision with root package name */
    private b f47058Q;

    /* renamed from: R, reason: collision with root package name */
    private final Rect f47059R;

    /* renamed from: a, reason: collision with root package name */
    private Drawable f47060a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f47061b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f47062c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f47063d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f47064e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f47065f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f47066g;

    /* renamed from: h, reason: collision with root package name */
    private PorterDuff.Mode f47067h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f47068i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f47069j;

    /* renamed from: k, reason: collision with root package name */
    private int f47070k;

    /* renamed from: l, reason: collision with root package name */
    private int f47071l;

    /* renamed from: m, reason: collision with root package name */
    private int f47072m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f47073n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f47074o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f47075p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f47076q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f47077r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f47078s;

    /* renamed from: t, reason: collision with root package name */
    private int f47079t;

    /* renamed from: u, reason: collision with root package name */
    private int f47080u;

    /* renamed from: v, reason: collision with root package name */
    private float f47081v;

    /* renamed from: w, reason: collision with root package name */
    private float f47082w;

    /* renamed from: x, reason: collision with root package name */
    private VelocityTracker f47083x;

    /* renamed from: y, reason: collision with root package name */
    private int f47084y;

    /* renamed from: z, reason: collision with root package name */
    float f47085z;

    class a extends Property<SwitchCompat, Float> {
        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f47085z);
        }

        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f10) {
            switchCompat.setThumbPosition(f10.floatValue());
        }
    }

    static class b extends f.AbstractC1120f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference<SwitchCompat> f47086a;

        @Override // androidx.emoji2.text.f.AbstractC1120f
        public void a(Throwable th2) {
            SwitchCompat switchCompat = this.f47086a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.f.AbstractC1120f
        public void b() {
            SwitchCompat switchCompat = this.f47086a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        b(SwitchCompat switchCompat) {
            this.f47086a = new WeakReference(switchCompat);
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14578a.f136275O);
    }

    private static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private void o(int i10, int i11) {
        n(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    private void q(MotionEvent motionEvent) throws Resources.NotFoundException {
        this.f47079t = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f47083x.computeCurrentVelocity(1000);
            float xVelocity = this.f47083x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f47084y) {
                targetCheckedState = getTargetCheckedState();
            } else if (!Y.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    public void fsSuperDraw_f8e650a5029c502d6c50f47dd3e78cbb(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    public void n(Typeface typeface, int i10) {
        if (i10 <= 0) {
            this.f47050I.setFakeBoldText(false);
            this.f47050I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : FS.typefaceCreateDerived(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.f47050I.setFakeBoldText((i11 & 1) != 0);
            this.f47050I.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f47061b = null;
        this.f47062c = null;
        this.f47063d = false;
        this.f47064e = false;
        this.f47066g = null;
        this.f47067h = null;
        this.f47068i = false;
        this.f47069j = false;
        this.f47083x = VelocityTracker.obtain();
        this.f47049H = true;
        this.f47059R = new Rect();
        H.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f47050I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        M mV = M.v(context, attributeSet, C14587j.f136659u2, i10, 0);
        ViewCompat.k0(this, context, C14587j.f136659u2, attributeSet, mV.r(), i10, 0);
        Drawable drawableG = mV.g(C14587j.f136674x2);
        this.f47060a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = mV.g(C14587j.f136476G2);
        this.f47065f = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(mV.p(C14587j.f136664v2));
        setTextOffInternal(mV.p(C14587j.f136669w2));
        this.f47078s = mV.a(C14587j.f136679y2, true);
        this.f47070k = mV.f(C14587j.f136461D2, 0);
        this.f47071l = mV.f(C14587j.f136446A2, 0);
        this.f47072m = mV.f(C14587j.f136451B2, 0);
        this.f47073n = mV.a(C14587j.f136684z2, false);
        ColorStateList colorStateListC = mV.c(C14587j.f136466E2);
        if (colorStateListC != null) {
            this.f47061b = colorStateListC;
            this.f47063d = true;
        }
        PorterDuff.Mode modeE = C5790y.e(mV.k(C14587j.f136471F2, -1), null);
        if (this.f47062c != modeE) {
            this.f47062c = modeE;
            this.f47064e = true;
        }
        if (this.f47063d || this.f47064e) {
            b();
        }
        ColorStateList colorStateListC2 = mV.c(C14587j.f136481H2);
        if (colorStateListC2 != null) {
            this.f47066g = colorStateListC2;
            this.f47068i = true;
        }
        PorterDuff.Mode modeE2 = C5790y.e(mV.k(C14587j.f136486I2, -1), null);
        if (this.f47067h != modeE2) {
            this.f47067h = modeE2;
            this.f47069j = true;
        }
        if (this.f47068i || this.f47069j) {
            c();
        }
        int iN = mV.n(C14587j.f136456C2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        C5781o c5781o = new C5781o(this);
        this.f47056O = c5781o;
        c5781o.m(attributeSet, i10);
        mV.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f47080u = viewConfiguration.getScaledTouchSlop();
        this.f47084y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private void a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f47040S, z10 ? 1.0f : 0.0f);
        this.f47055N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f47055N.setAutoCancel(true);
        this.f47055N.start();
    }

    private void b() {
        Drawable drawable = this.f47060a;
        if (drawable != null) {
            if (this.f47063d || this.f47064e) {
                Drawable drawableMutate = C13595a.r(drawable).mutate();
                this.f47060a = drawableMutate;
                if (this.f47063d) {
                    C13595a.o(drawableMutate, this.f47061b);
                }
                if (this.f47064e) {
                    C13595a.p(this.f47060a, this.f47062c);
                }
                if (this.f47060a.isStateful()) {
                    this.f47060a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f47065f;
        if (drawable != null) {
            if (this.f47068i || this.f47069j) {
                Drawable drawableMutate = C13595a.r(drawable).mutate();
                this.f47065f = drawableMutate;
                if (this.f47068i) {
                    C13595a.o(drawableMutate, this.f47066g);
                }
                if (this.f47069j) {
                    C13595a.p(this.f47065f, this.f47067h);
                }
                if (this.f47065f.isStateful()) {
                    this.f47065f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f47055N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private C5773g getEmojiTextViewHelper() {
        if (this.f47057P == null) {
            this.f47057P = new C5773g(this);
        }
        return this.f47057P;
    }

    private boolean getTargetCheckedState() {
        return this.f47085z > 0.5f;
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f47065f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f47059R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f47060a;
        Rect rectD = drawable2 != null ? C5790y.d(drawable2) : C5790y.f47259c;
        return ((((this.f47042A - this.f47044C) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f47060a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f47060a.getPadding(this.f47059R);
        int i10 = this.f47046E;
        int i11 = this.f47080u;
        int i12 = i10 - i11;
        int i13 = (this.f47045D + thumbOffset) - i11;
        int i14 = this.f47044C + i13;
        Rect rect = this.f47059R;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f47048G + i11));
    }

    private Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f47050I, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f47076q;
            if (string == null) {
                string = getResources().getString(C14585h.f136424b);
            }
            ViewCompat.F0(this, string);
        }
    }

    private void l() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f47074o;
            if (string == null) {
                string = getResources().getString(C14585h.f136425c);
            }
            ViewCompat.F0(this, string);
        }
    }

    private void p() {
        if (this.f47058Q == null && this.f47057P.b() && androidx.emoji2.text.f.k()) {
            androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
            int iG = fVarC.g();
            if (iG == 3 || iG == 0) {
                b bVar = new b(this);
                this.f47058Q = bVar;
                fVarC.v(bVar);
            }
        }
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f47076q = charSequence;
        this.f47077r = g(charSequence);
        this.f47053L = null;
        if (this.f47078s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f47074o = charSequence;
        this.f47075p = g(charSequence);
        this.f47052K = null;
        if (this.f47078s) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f47059R;
        int i12 = this.f47045D;
        int i13 = this.f47046E;
        int i14 = this.f47047F;
        int i15 = this.f47048G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f47060a;
        Rect rectD = drawable != null ? C5790y.d(drawable) : C5790y.f47259c;
        Drawable drawable2 = this.f47065f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectD != null) {
                int i17 = rectD.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectD.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectD.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectD.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f47065f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f47065f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f47060a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f47044C + rect.right;
            this.f47060a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                C13595a.l(background, i24, i13, i25, i15);
            }
        }
        fsSuperDraw_f8e650a5029c502d6c50f47dd3e78cbb(canvas);
    }

    public boolean getShowText() {
        return this.f47078s;
    }

    public boolean getSplitTrack() {
        return this.f47073n;
    }

    public int getSwitchMinWidth() {
        return this.f47071l;
    }

    public int getSwitchPadding() {
        return this.f47072m;
    }

    public CharSequence getTextOff() {
        return this.f47076q;
    }

    public CharSequence getTextOn() {
        return this.f47074o;
    }

    public Drawable getThumbDrawable() {
        return this.f47060a;
    }

    protected final float getThumbPosition() {
        return this.f47085z;
    }

    public int getThumbTextPadding() {
        return this.f47070k;
    }

    public ColorStateList getThumbTintList() {
        return this.f47061b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f47062c;
    }

    public Drawable getTrackDrawable() {
        return this.f47065f;
    }

    public ColorStateList getTrackTintList() {
        return this.f47066g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f47067h;
    }

    void j() {
        setTextOnInternal(this.f47074o);
        setTextOffInternal(this.f47076q);
        requestLayout();
    }

    public void m(Context context, int i10) {
        M mT = M.t(context, i10, C14587j.f136491J2);
        ColorStateList colorStateListC = mT.c(C14587j.f136507N2);
        if (colorStateListC != null) {
            this.f47051J = colorStateListC;
        } else {
            this.f47051J = getTextColors();
        }
        int iF = mT.f(C14587j.f136495K2, 0);
        if (iF != 0) {
            float f10 = iF;
            if (f10 != this.f47050I.getTextSize()) {
                this.f47050I.setTextSize(f10);
                requestLayout();
            }
        }
        o(mT.k(C14587j.f136499L2, -1), mT.k(C14587j.f136503M2, -1));
        if (mT.a(C14587j.f136527S2, false)) {
            this.f47054M = new C15614a(getContext());
        } else {
            this.f47054M = null;
        }
        setTextOnInternal(this.f47074o);
        setTextOffInternal(this.f47076q);
        mT.x();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f47041T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f47078s) {
            if (this.f47052K == null) {
                this.f47052K = i(this.f47075p);
            }
            if (this.f47053L == null) {
                this.f47053L = i(this.f47077r);
            }
        }
        Rect rect = this.f47059R;
        Drawable drawable = this.f47060a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f47060a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f47060a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f47044C = Math.max(this.f47078s ? Math.max(this.f47052K.getWidth(), this.f47053L.getWidth()) + (this.f47070k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f47065f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f47065f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f47060a;
        if (drawable3 != null) {
            Rect rectD = C5790y.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.f47049H ? Math.max(this.f47071l, (this.f47044C * 2) + iMax + iMax2) : this.f47071l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f47042A = iMax3;
        this.f47043B = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) throws android.content.res.Resources.NotFoundException {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f47083x
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f47079t
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f47081v
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = androidx.appcompat.widget.Y.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f47085z
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f47085z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f47081v = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f47081v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f47080u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f47082w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f47080u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f47079t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f47081v = r0
            r6.f47082w = r3
            return r1
        L89:
            int r0 = r6.f47079t
            if (r0 != r2) goto L94
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f47079t = r0
            android.view.VelocityTracker r0 = r6.f47083x
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f47079t = r1
            r6.f47081v = r0
            r6.f47082w = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    protected final void setEnforceSwitchWidth(boolean z10) {
        this.f47049H = z10;
        invalidate();
    }

    public void setShowText(boolean z10) {
        if (this.f47078s != z10) {
            this.f47078s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f47073n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f47071l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f47072m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f47050I.getTypeface() == null || this.f47050I.getTypeface().equals(typeface)) && (this.f47050I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f47050I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f47060a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f47060a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.f47085z = f10;
        invalidate();
    }

    public void setThumbTextPadding(int i10) {
        this.f47070k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f47061b = colorStateList;
        this.f47063d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f47062c = mode;
        this.f47064e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f47065f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f47065f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f47066g = colorStateList;
        this.f47068i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f47067h = mode;
        this.f47069j = true;
        c();
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.f47054M);
        if (transformationMethodF != null) {
            return transformationMethodF.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    private int getThumbOffset() {
        float f10;
        if (Y.b(this)) {
            f10 = 1.0f - this.f47085z;
        } else {
            f10 = this.f47085z;
        }
        return (int) ((f10 * getThumbScrollRange()) + 0.5f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f47060a;
        if (drawable != null) {
            C13595a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f47065f;
        if (drawable2 != null) {
            C13595a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        boolean state;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f47060a;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        } else {
            state = false;
        }
        Drawable drawable2 = this.f47065f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!Y.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f47042A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f47072m;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (Y.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f47042A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f47072m;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.k.r(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f47060a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f47065f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f47055N;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f47055N.end();
            this.f47055N = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.f47059R;
        Drawable drawable = this.f47065f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f47046E;
        int i11 = this.f47048G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f47060a;
        if (drawable != null) {
            if (this.f47073n && drawable2 != null) {
                Rect rectD = C5790y.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectD.left;
                rect.right -= rectD.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            } else {
                drawable.draw(canvas);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.f47052K;
        } else {
            layout = this.f47053L;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f47051J;
            if (colorStateList != null) {
                this.f47050I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f47050I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i12 + i13) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f47074o;
            } else {
                charSequence = this.f47076q;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(text);
                sb2.append(' ');
                sb2.append(charSequence);
                accessibilityNodeInfo.setText(sb2);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int i14;
        int paddingTop;
        int height;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f47060a != null) {
            Rect rect = this.f47059R;
            Drawable drawable = this.f47065f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = C5790y.d(this.f47060a);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (Y.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f47042A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f47042A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i14 = this.f47043B;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f47043B;
                this.f47045D = paddingLeft;
                this.f47046E = paddingTop;
                this.f47048G = height;
                this.f47047F = width;
            }
        } else {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i14 = this.f47043B;
            paddingTop = paddingTop2 - (i14 / 2);
        }
        height = i14 + paddingTop;
        this.f47045D = paddingLeft;
        this.f47046E = paddingTop;
        this.f47048G = height;
        this.f47047F = width;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f47074o;
        } else {
            charSequence = this.f47076q;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().d(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) throws Resources.NotFoundException {
        float f10;
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && isLaidOut()) {
            a(zIsChecked);
            return;
        }
        d();
        if (zIsChecked) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        setThumbPosition(f10);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.k.s(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().e(z10);
        setTextOnInternal(this.f47074o);
        setTextOffInternal(this.f47076q);
        requestLayout();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setTextOff(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            k();
        }
    }

    public void setTextOn(CharSequence charSequence) throws Resources.NotFoundException {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(C14879a.b(getContext(), i10));
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(C14879a.b(getContext(), i10));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f47060a && drawable != this.f47065f) {
            return false;
        }
        return true;
    }
}
