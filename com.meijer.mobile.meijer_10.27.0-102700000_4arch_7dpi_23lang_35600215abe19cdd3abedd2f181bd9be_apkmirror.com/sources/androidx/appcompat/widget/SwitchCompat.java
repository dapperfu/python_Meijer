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
import d2.C13462a;
import i.C14575a;
import i.C14582h;
import i.C14584j;
import j.C14791a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import m.C15503a;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton implements FSDraw {

    /* renamed from: S, reason: collision with root package name */
    private static final Property<SwitchCompat, Float> f46816S = new a(Float.class, "thumbPos");

    /* renamed from: T, reason: collision with root package name */
    private static final int[] f46817T = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    private int f46818A;

    /* renamed from: B, reason: collision with root package name */
    private int f46819B;

    /* renamed from: C, reason: collision with root package name */
    private int f46820C;

    /* renamed from: D, reason: collision with root package name */
    private int f46821D;

    /* renamed from: E, reason: collision with root package name */
    private int f46822E;

    /* renamed from: F, reason: collision with root package name */
    private int f46823F;

    /* renamed from: G, reason: collision with root package name */
    private int f46824G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f46825H;

    /* renamed from: I, reason: collision with root package name */
    private final TextPaint f46826I;

    /* renamed from: J, reason: collision with root package name */
    private ColorStateList f46827J;

    /* renamed from: K, reason: collision with root package name */
    private Layout f46828K;

    /* renamed from: L, reason: collision with root package name */
    private Layout f46829L;

    /* renamed from: M, reason: collision with root package name */
    private TransformationMethod f46830M;

    /* renamed from: N, reason: collision with root package name */
    ObjectAnimator f46831N;

    /* renamed from: O, reason: collision with root package name */
    private final C5639o f46832O;

    /* renamed from: P, reason: collision with root package name */
    private C5631g f46833P;

    /* renamed from: Q, reason: collision with root package name */
    private b f46834Q;

    /* renamed from: R, reason: collision with root package name */
    private final Rect f46835R;

    /* renamed from: a, reason: collision with root package name */
    private Drawable f46836a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f46837b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f46838c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f46839d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f46840e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f46841f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f46842g;

    /* renamed from: h, reason: collision with root package name */
    private PorterDuff.Mode f46843h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f46844i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f46845j;

    /* renamed from: k, reason: collision with root package name */
    private int f46846k;

    /* renamed from: l, reason: collision with root package name */
    private int f46847l;

    /* renamed from: m, reason: collision with root package name */
    private int f46848m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f46849n;

    /* renamed from: o, reason: collision with root package name */
    private CharSequence f46850o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f46851p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f46852q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f46853r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f46854s;

    /* renamed from: t, reason: collision with root package name */
    private int f46855t;

    /* renamed from: u, reason: collision with root package name */
    private int f46856u;

    /* renamed from: v, reason: collision with root package name */
    private float f46857v;

    /* renamed from: w, reason: collision with root package name */
    private float f46858w;

    /* renamed from: x, reason: collision with root package name */
    private VelocityTracker f46859x;

    /* renamed from: y, reason: collision with root package name */
    private int f46860y;

    /* renamed from: z, reason: collision with root package name */
    float f46861z;

    class a extends Property<SwitchCompat, Float> {
        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f46861z);
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

    static class b extends f.AbstractC1107f {

        /* renamed from: a, reason: collision with root package name */
        private final Reference<SwitchCompat> f46862a;

        @Override // androidx.emoji2.text.f.AbstractC1107f
        public void a(Throwable th2) {
            SwitchCompat switchCompat = this.f46862a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.f.AbstractC1107f
        public void b() {
            SwitchCompat switchCompat = this.f46862a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        b(SwitchCompat switchCompat) {
            this.f46862a = new WeakReference(switchCompat);
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C14575a.f136518O);
    }

    private static float f(float f10, float f11, float f12) {
        return f10 < f11 ? f11 : f10 > f12 ? f12 : f10;
    }

    private void o(int i10, int i11) {
        n(i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i11);
    }

    private void q(MotionEvent motionEvent) throws Resources.NotFoundException {
        this.f46855t = 0;
        boolean targetCheckedState = true;
        boolean z10 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z10) {
            this.f46859x.computeCurrentVelocity(1000);
            float xVelocity = this.f46859x.getXVelocity();
            if (Math.abs(xVelocity) <= this.f46860y) {
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
            this.f46826I.setFakeBoldText(false);
            this.f46826I.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i10) : FS.typefaceCreateDerived(typeface, i10);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i11 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i10;
            this.f46826I.setFakeBoldText((i11 & 1) != 0);
            this.f46826I.setTextSkewX((i11 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f46837b = null;
        this.f46838c = null;
        this.f46839d = false;
        this.f46840e = false;
        this.f46842g = null;
        this.f46843h = null;
        this.f46844i = false;
        this.f46845j = false;
        this.f46859x = VelocityTracker.obtain();
        this.f46825H = true;
        this.f46835R = new Rect();
        H.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f46826I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        M mV = M.v(context, attributeSet, C14584j.f136902u2, i10, 0);
        ViewCompat.k0(this, context, C14584j.f136902u2, attributeSet, mV.r(), i10, 0);
        Drawable drawableG = mV.g(C14584j.f136917x2);
        this.f46836a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = mV.g(C14584j.f136719G2);
        this.f46841f = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        setTextOnInternal(mV.p(C14584j.f136907v2));
        setTextOffInternal(mV.p(C14584j.f136912w2));
        this.f46854s = mV.a(C14584j.f136922y2, true);
        this.f46846k = mV.f(C14584j.f136704D2, 0);
        this.f46847l = mV.f(C14584j.f136689A2, 0);
        this.f46848m = mV.f(C14584j.f136694B2, 0);
        this.f46849n = mV.a(C14584j.f136927z2, false);
        ColorStateList colorStateListC = mV.c(C14584j.f136709E2);
        if (colorStateListC != null) {
            this.f46837b = colorStateListC;
            this.f46839d = true;
        }
        PorterDuff.Mode modeE = C5648y.e(mV.k(C14584j.f136714F2, -1), null);
        if (this.f46838c != modeE) {
            this.f46838c = modeE;
            this.f46840e = true;
        }
        if (this.f46839d || this.f46840e) {
            b();
        }
        ColorStateList colorStateListC2 = mV.c(C14584j.f136724H2);
        if (colorStateListC2 != null) {
            this.f46842g = colorStateListC2;
            this.f46844i = true;
        }
        PorterDuff.Mode modeE2 = C5648y.e(mV.k(C14584j.f136729I2, -1), null);
        if (this.f46843h != modeE2) {
            this.f46843h = modeE2;
            this.f46845j = true;
        }
        if (this.f46844i || this.f46845j) {
            c();
        }
        int iN = mV.n(C14584j.f136699C2, 0);
        if (iN != 0) {
            m(context, iN);
        }
        C5639o c5639o = new C5639o(this);
        this.f46832O = c5639o;
        c5639o.m(attributeSet, i10);
        mV.x();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f46856u = viewConfiguration.getScaledTouchSlop();
        this.f46860y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i10);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private void a(boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f46816S, z10 ? 1.0f : 0.0f);
        this.f46831N = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f46831N.setAutoCancel(true);
        this.f46831N.start();
    }

    private void b() {
        Drawable drawable = this.f46836a;
        if (drawable != null) {
            if (this.f46839d || this.f46840e) {
                Drawable drawableMutate = C13462a.r(drawable).mutate();
                this.f46836a = drawableMutate;
                if (this.f46839d) {
                    C13462a.o(drawableMutate, this.f46837b);
                }
                if (this.f46840e) {
                    C13462a.p(this.f46836a, this.f46838c);
                }
                if (this.f46836a.isStateful()) {
                    this.f46836a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f46841f;
        if (drawable != null) {
            if (this.f46844i || this.f46845j) {
                Drawable drawableMutate = C13462a.r(drawable).mutate();
                this.f46841f = drawableMutate;
                if (this.f46844i) {
                    C13462a.o(drawableMutate, this.f46842g);
                }
                if (this.f46845j) {
                    C13462a.p(this.f46841f, this.f46843h);
                }
                if (this.f46841f.isStateful()) {
                    this.f46841f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.f46831N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private C5631g getEmojiTextViewHelper() {
        if (this.f46833P == null) {
            this.f46833P = new C5631g(this);
        }
        return this.f46833P;
    }

    private boolean getTargetCheckedState() {
        return this.f46861z > 0.5f;
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f46841f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f46835R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f46836a;
        Rect rectD = drawable2 != null ? C5648y.d(drawable2) : C5648y.f47035c;
        return ((((this.f46818A - this.f46820C) - rect.left) - rect.right) - rectD.left) - rectD.right;
    }

    private boolean h(float f10, float f11) {
        if (this.f46836a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f46836a.getPadding(this.f46835R);
        int i10 = this.f46822E;
        int i11 = this.f46856u;
        int i12 = i10 - i11;
        int i13 = (this.f46821D + thumbOffset) - i11;
        int i14 = this.f46820C + i13;
        Rect rect = this.f46835R;
        return f10 > ((float) i13) && f10 < ((float) (((i14 + rect.left) + rect.right) + i11)) && f11 > ((float) i12) && f11 < ((float) (this.f46824G + i11));
    }

    private Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f46826I, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f46852q;
            if (string == null) {
                string = getResources().getString(C14582h.f136667b);
            }
            ViewCompat.F0(this, string);
        }
    }

    private void l() throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f46850o;
            if (string == null) {
                string = getResources().getString(C14582h.f136668c);
            }
            ViewCompat.F0(this, string);
        }
    }

    private void p() {
        if (this.f46834Q == null && this.f46833P.b() && androidx.emoji2.text.f.k()) {
            androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
            int iG = fVarC.g();
            if (iG == 3 || iG == 0) {
                b bVar = new b(this);
                this.f46834Q = bVar;
                fVarC.v(bVar);
            }
        }
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f46852q = charSequence;
        this.f46853r = g(charSequence);
        this.f46829L = null;
        if (this.f46854s) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f46850o = charSequence;
        this.f46851p = g(charSequence);
        this.f46828K = null;
        if (this.f46854s) {
            p();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        Rect rect = this.f46835R;
        int i12 = this.f46821D;
        int i13 = this.f46822E;
        int i14 = this.f46823F;
        int i15 = this.f46824G;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f46836a;
        Rect rectD = drawable != null ? C5648y.d(drawable) : C5648y.f47035c;
        Drawable drawable2 = this.f46841f;
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
                this.f46841f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f46841f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f46836a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f46820C + rect.right;
            this.f46836a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                C13462a.l(background, i24, i13, i25, i15);
            }
        }
        fsSuperDraw_f8e650a5029c502d6c50f47dd3e78cbb(canvas);
    }

    public boolean getShowText() {
        return this.f46854s;
    }

    public boolean getSplitTrack() {
        return this.f46849n;
    }

    public int getSwitchMinWidth() {
        return this.f46847l;
    }

    public int getSwitchPadding() {
        return this.f46848m;
    }

    public CharSequence getTextOff() {
        return this.f46852q;
    }

    public CharSequence getTextOn() {
        return this.f46850o;
    }

    public Drawable getThumbDrawable() {
        return this.f46836a;
    }

    protected final float getThumbPosition() {
        return this.f46861z;
    }

    public int getThumbTextPadding() {
        return this.f46846k;
    }

    public ColorStateList getThumbTintList() {
        return this.f46837b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f46838c;
    }

    public Drawable getTrackDrawable() {
        return this.f46841f;
    }

    public ColorStateList getTrackTintList() {
        return this.f46842g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f46843h;
    }

    void j() {
        setTextOnInternal(this.f46850o);
        setTextOffInternal(this.f46852q);
        requestLayout();
    }

    public void m(Context context, int i10) {
        M mT = M.t(context, i10, C14584j.f136734J2);
        ColorStateList colorStateListC = mT.c(C14584j.f136750N2);
        if (colorStateListC != null) {
            this.f46827J = colorStateListC;
        } else {
            this.f46827J = getTextColors();
        }
        int iF = mT.f(C14584j.f136738K2, 0);
        if (iF != 0) {
            float f10 = iF;
            if (f10 != this.f46826I.getTextSize()) {
                this.f46826I.setTextSize(f10);
                requestLayout();
            }
        }
        o(mT.k(C14584j.f136742L2, -1), mT.k(C14584j.f136746M2, -1));
        if (mT.a(C14584j.f136770S2, false)) {
            this.f46830M = new C15503a(getContext());
        } else {
            this.f46830M = null;
        }
        setTextOnInternal(this.f46850o);
        setTextOffInternal(this.f46852q);
        mT.x();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f46817T);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f46854s) {
            if (this.f46828K == null) {
                this.f46828K = i(this.f46851p);
            }
            if (this.f46829L == null) {
                this.f46829L = i(this.f46853r);
            }
        }
        Rect rect = this.f46835R;
        Drawable drawable = this.f46836a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f46836a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f46836a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f46820C = Math.max(this.f46854s ? Math.max(this.f46828K.getWidth(), this.f46829L.getWidth()) + (this.f46846k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f46841f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f46841f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f46836a;
        if (drawable3 != null) {
            Rect rectD = C5648y.d(drawable3);
            iMax = Math.max(iMax, rectD.left);
            iMax2 = Math.max(iMax2, rectD.right);
        }
        int iMax3 = this.f46825H ? Math.max(this.f46847l, (this.f46820C * 2) + iMax + iMax2) : this.f46847l;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f46818A = iMax3;
        this.f46819B = iMax4;
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
            android.view.VelocityTracker r0 = r6.f46859x
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
            int r0 = r6.f46855t
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f46857v
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
            float r0 = r6.f46861z
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f46861z
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f46857v = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f46857v
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f46856u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f46858w
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f46856u
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f46855t = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f46857v = r0
            r6.f46858w = r3
            return r1
        L89:
            int r0 = r6.f46855t
            if (r0 != r2) goto L94
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f46855t = r0
            android.view.VelocityTracker r0 = r6.f46859x
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f46855t = r1
            r6.f46857v = r0
            r6.f46858w = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    protected final void setEnforceSwitchWidth(boolean z10) {
        this.f46825H = z10;
        invalidate();
    }

    public void setShowText(boolean z10) {
        if (this.f46854s != z10) {
            this.f46854s = z10;
            requestLayout();
            if (z10) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f46849n = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f46847l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f46848m = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f46826I.getTypeface() == null || this.f46826I.getTypeface().equals(typeface)) && (this.f46826I.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f46826I.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f46836a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f46836a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f10) {
        this.f46861z = f10;
        invalidate();
    }

    public void setThumbTextPadding(int i10) {
        this.f46846k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f46837b = colorStateList;
        this.f46839d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f46838c = mode;
        this.f46840e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f46841f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f46841f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f46842g = colorStateList;
        this.f46844i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f46843h = mode;
        this.f46845j = true;
        c();
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private CharSequence g(CharSequence charSequence) {
        TransformationMethod transformationMethodF = getEmojiTextViewHelper().f(this.f46830M);
        if (transformationMethodF != null) {
            return transformationMethodF.getTransformation(charSequence, this);
        }
        return charSequence;
    }

    private int getThumbOffset() {
        float f10;
        if (Y.b(this)) {
            f10 = 1.0f - this.f46861z;
        } else {
            f10 = this.f46861z;
        }
        return (int) ((f10 * getThumbScrollRange()) + 0.5f);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f46836a;
        if (drawable != null) {
            C13462a.k(drawable, f10, f11);
        }
        Drawable drawable2 = this.f46841f;
        if (drawable2 != null) {
            C13462a.k(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        boolean state;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f46836a;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        } else {
            state = false;
        }
        Drawable drawable2 = this.f46841f;
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
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f46818A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f46848m;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (Y.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f46818A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f46848m;
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
        Drawable drawable = this.f46836a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f46841f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f46831N;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f46831N.end();
            this.f46831N = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.f46835R;
        Drawable drawable = this.f46841f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f46822E;
        int i11 = this.f46824G;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f46836a;
        if (drawable != null) {
            if (this.f46849n && drawable2 != null) {
                Rect rectD = C5648y.d(drawable2);
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
            layout = this.f46828K;
        } else {
            layout = this.f46829L;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f46827J;
            if (colorStateList != null) {
                this.f46826I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f46826I.drawableState = drawableState;
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
                charSequence = this.f46850o;
            } else {
                charSequence = this.f46852q;
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
        if (this.f46836a != null) {
            Rect rect = this.f46835R;
            Drawable drawable = this.f46841f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectD = C5648y.d(this.f46836a);
            iMax = Math.max(0, rectD.left - rect.left);
            iMax2 = Math.max(0, rectD.right - rect.right);
        } else {
            iMax = 0;
        }
        if (Y.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f46818A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f46818A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i14 = this.f46819B;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f46819B;
                this.f46821D = paddingLeft;
                this.f46822E = paddingTop;
                this.f46824G = height;
                this.f46823F = width;
            }
        } else {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i14 = this.f46819B;
            paddingTop = paddingTop2 - (i14 / 2);
        }
        height = i14 + paddingTop;
        this.f46821D = paddingLeft;
        this.f46822E = paddingTop;
        this.f46824G = height;
        this.f46823F = width;
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f46850o;
        } else {
            charSequence = this.f46852q;
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
        setTextOnInternal(this.f46850o);
        setTextOffInternal(this.f46852q);
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
        setThumbDrawable(C14791a.b(getContext(), i10));
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(C14791a.b(getContext(), i10));
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() throws Resources.NotFoundException {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f46836a && drawable != this.f46841f) {
            return false;
        }
        return true;
    }
}
