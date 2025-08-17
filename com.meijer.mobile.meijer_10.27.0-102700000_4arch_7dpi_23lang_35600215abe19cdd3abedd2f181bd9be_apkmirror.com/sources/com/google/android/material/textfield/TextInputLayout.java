package com.google.android.material.textfield;

import H4.C3656c;
import ae.C5597b;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C5629e;
import androidx.appcompat.widget.C5648y;
import androidx.appcompat.widget.M;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import be.C6230a;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.material.internal.CheckableImageButton;
import d2.C13462a;
import ie.C14718a;
import j.C14791a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m2.C15544a;
import oe.C16026c;
import p2.C16236t;
import re.C16756d;
import re.C16760h;
import re.C16765m;
import ue.C17250a;
import w2.AbstractC17751a;

/* loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener, FSDraw, FSDispatchDraw {

    /* renamed from: C0, reason: collision with root package name */
    private static final int f87745C0 = ae.k.f44802r;

    /* renamed from: D0, reason: collision with root package name */
    private static final int[][] f87746D0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f87747A;

    /* renamed from: A0, reason: collision with root package name */
    private boolean f87748A0;

    /* renamed from: B, reason: collision with root package name */
    private ColorStateList f87749B;

    /* renamed from: B0, reason: collision with root package name */
    private boolean f87750B0;

    /* renamed from: C, reason: collision with root package name */
    private boolean f87751C;

    /* renamed from: D, reason: collision with root package name */
    private CharSequence f87752D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f87753E;

    /* renamed from: F, reason: collision with root package name */
    private C16760h f87754F;

    /* renamed from: G, reason: collision with root package name */
    private C16760h f87755G;

    /* renamed from: H, reason: collision with root package name */
    private StateListDrawable f87756H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f87757I;

    /* renamed from: J, reason: collision with root package name */
    private C16760h f87758J;

    /* renamed from: K, reason: collision with root package name */
    private C16760h f87759K;

    /* renamed from: L, reason: collision with root package name */
    private C16765m f87760L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f87761M;

    /* renamed from: N, reason: collision with root package name */
    private final int f87762N;

    /* renamed from: O, reason: collision with root package name */
    private int f87763O;

    /* renamed from: P, reason: collision with root package name */
    private int f87764P;

    /* renamed from: Q, reason: collision with root package name */
    private int f87765Q;

    /* renamed from: R, reason: collision with root package name */
    private int f87766R;

    /* renamed from: S, reason: collision with root package name */
    private int f87767S;

    /* renamed from: T, reason: collision with root package name */
    private int f87768T;

    /* renamed from: U, reason: collision with root package name */
    private int f87769U;

    /* renamed from: V, reason: collision with root package name */
    private final Rect f87770V;

    /* renamed from: W, reason: collision with root package name */
    private final Rect f87771W;

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f87772a;

    /* renamed from: a0, reason: collision with root package name */
    private final RectF f87773a0;

    /* renamed from: b, reason: collision with root package name */
    private final StartCompoundLayout f87774b;

    /* renamed from: b0, reason: collision with root package name */
    private Typeface f87775b0;

    /* renamed from: c, reason: collision with root package name */
    private final EndCompoundLayout f87776c;

    /* renamed from: c0, reason: collision with root package name */
    private Drawable f87777c0;

    /* renamed from: d, reason: collision with root package name */
    EditText f87778d;

    /* renamed from: d0, reason: collision with root package name */
    private int f87779d0;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f87780e;

    /* renamed from: e0, reason: collision with root package name */
    private final LinkedHashSet<f> f87781e0;

    /* renamed from: f, reason: collision with root package name */
    private int f87782f;

    /* renamed from: f0, reason: collision with root package name */
    private Drawable f87783f0;

    /* renamed from: g, reason: collision with root package name */
    private int f87784g;

    /* renamed from: g0, reason: collision with root package name */
    private int f87785g0;

    /* renamed from: h, reason: collision with root package name */
    private int f87786h;

    /* renamed from: h0, reason: collision with root package name */
    private Drawable f87787h0;

    /* renamed from: i, reason: collision with root package name */
    private int f87788i;

    /* renamed from: i0, reason: collision with root package name */
    private ColorStateList f87789i0;

    /* renamed from: j, reason: collision with root package name */
    private final t f87790j;

    /* renamed from: j0, reason: collision with root package name */
    private ColorStateList f87791j0;

    /* renamed from: k, reason: collision with root package name */
    boolean f87792k;

    /* renamed from: k0, reason: collision with root package name */
    private int f87793k0;

    /* renamed from: l, reason: collision with root package name */
    private int f87794l;

    /* renamed from: l0, reason: collision with root package name */
    private int f87795l0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f87796m;

    /* renamed from: m0, reason: collision with root package name */
    private int f87797m0;

    /* renamed from: n, reason: collision with root package name */
    private e f87798n;

    /* renamed from: n0, reason: collision with root package name */
    private ColorStateList f87799n0;

    /* renamed from: o, reason: collision with root package name */
    private TextView f87800o;

    /* renamed from: o0, reason: collision with root package name */
    private int f87801o0;

    /* renamed from: p, reason: collision with root package name */
    private int f87802p;

    /* renamed from: p0, reason: collision with root package name */
    private int f87803p0;

    /* renamed from: q, reason: collision with root package name */
    private int f87804q;

    /* renamed from: q0, reason: collision with root package name */
    private int f87805q0;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f87806r;

    /* renamed from: r0, reason: collision with root package name */
    private int f87807r0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f87808s;

    /* renamed from: s0, reason: collision with root package name */
    private int f87809s0;

    /* renamed from: t, reason: collision with root package name */
    private TextView f87810t;

    /* renamed from: t0, reason: collision with root package name */
    int f87811t0;

    /* renamed from: u, reason: collision with root package name */
    private ColorStateList f87812u;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f87813u0;

    /* renamed from: v, reason: collision with root package name */
    private int f87814v;

    /* renamed from: v0, reason: collision with root package name */
    final com.google.android.material.internal.b f87815v0;

    /* renamed from: w, reason: collision with root package name */
    private C3656c f87816w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f87817w0;

    /* renamed from: x, reason: collision with root package name */
    private C3656c f87818x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f87819x0;

    /* renamed from: y, reason: collision with root package name */
    private ColorStateList f87820y;

    /* renamed from: y0, reason: collision with root package name */
    private ValueAnimator f87821y0;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f87822z;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f87823z0;

    class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        int f87824a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f87825b;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        a(EditText editText) {
            this.f87825b = editText;
            this.f87824a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.s0(!r0.f87748A0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f87792k) {
                textInputLayout.i0(editable);
            }
            if (TextInputLayout.this.f87808s) {
                TextInputLayout.this.w0(editable);
            }
            int lineCount = this.f87825b.getLineCount();
            int i10 = this.f87824a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int iA = ViewCompat.A(this.f87825b);
                    int i11 = TextInputLayout.this.f87811t0;
                    if (iA != i11) {
                        this.f87825b.setMinimumHeight(i11);
                    }
                }
                this.f87824a = lineCount;
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f87776c.h();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f87815v0.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i10);
    }

    static class h extends AbstractC17751a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        CharSequence f87830c;

        /* renamed from: d, reason: collision with root package name */
        boolean f87831d;

        class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }

            a() {
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f87830c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f87831d = parcel.readInt() == 1;
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f87830c) + "}";
        }

        @Override // w2.AbstractC17751a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f87830c, parcel, i10);
            parcel.writeInt(this.f87831d ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44536p0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fsSuperDispatchDraw_e02d38f646047fbea4837028cd2251d2(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f87748A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f87748A0 = false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_e02d38f646047fbea4837028cd2251d2(canvas, view, j10);
    }

    public void fsSuperDispatchDraw_e02d38f646047fbea4837028cd2251d2(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_e02d38f646047fbea4837028cd2251d2(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    public void fsSuperDraw_e02d38f646047fbea4837028cd2251d2(Canvas canvas) {
        if (FS.isRecordingDraw(this, canvas)) {
            return;
        }
        super.draw(canvas);
    }

    void s0(boolean z10) {
        t0(z10, false);
    }

    public void setEndIconContentDescription(int i10) {
        this.f87776c.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f87776c.R(i10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f87776c.b0(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f87751C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.m.FLAG_MOVED);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f87776c.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f87776c.k0(i10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? C14791a.b(getContext(), i10) : null);
    }

    public static class d extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        private final TextInputLayout f87829d;

        public d(TextInputLayout textInputLayout) {
            this.f87829d = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void g(View view, q2.y yVar) {
            CharSequence text;
            boolean z10;
            String string;
            super.g(view, yVar);
            EditText editText = this.f87829d.getEditText();
            if (editText != null) {
                text = editText.getText();
            } else {
                text = null;
            }
            CharSequence hint = this.f87829d.getHint();
            CharSequence error = this.f87829d.getError();
            CharSequence placeholderText = this.f87829d.getPlaceholderText();
            int counterMaxLength = this.f87829d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f87829d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zP = this.f87829d.P();
            boolean zIsEmpty3 = TextUtils.isEmpty(error);
            if (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!zIsEmpty2) {
                string = hint.toString();
            } else {
                string = "";
            }
            this.f87829d.f87774b.A(yVar);
            if (!zIsEmpty) {
                yVar.X0(text);
            } else if (!TextUtils.isEmpty(string)) {
                yVar.X0(string);
                if (!zP && placeholderText != null) {
                    yVar.X0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                yVar.X0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    yVar.C0(string);
                } else {
                    if (!zIsEmpty) {
                        string = ((Object) text) + ", " + string;
                    }
                    yVar.X0(string);
                }
                yVar.T0(zIsEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            yVar.H0(counterMaxLength);
            if (z10) {
                if (zIsEmpty3) {
                    error = counterOverflowDescription;
                }
                yVar.y0(error);
            }
            View viewT = this.f87829d.f87790j.t();
            if (viewT != null) {
                yVar.E0(viewT);
            }
            this.f87829d.f87776c.m().o(view, yVar);
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f87829d.f87776c.m().p(view, accessibilityEvent);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f87745C0;
        super(C17250a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f87782f = -1;
        this.f87784g = -1;
        this.f87786h = -1;
        this.f87788i = -1;
        this.f87790j = new t(this);
        this.f87798n = new e() { // from class: com.google.android.material.textfield.E
            @Override // com.google.android.material.textfield.TextInputLayout.e
            public final int a(Editable editable) {
                return TextInputLayout.b(editable);
            }
        };
        this.f87770V = new Rect();
        this.f87771W = new Rect();
        this.f87773a0 = new RectF();
        this.f87781e0 = new LinkedHashSet<>();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f87815v0 = bVar;
        this.f87750B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f87772a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = C6230a.f60115a;
        bVar.L0(timeInterpolator);
        bVar.G0(timeInterpolator);
        bVar.j0(8388659);
        M mJ = com.google.android.material.internal.s.j(context2, attributeSet, ae.l.f45087X8, i10, i11, ae.l.f45361u9, ae.l.f45337s9, ae.l.f44965M9, ae.l.f45022R9, ae.l.f45066V9);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, mJ);
        this.f87774b = startCompoundLayout;
        this.f87751C = mJ.a(ae.l.f45055U9, true);
        setHint(mJ.p(ae.l.f45145c9));
        this.f87819x0 = mJ.a(ae.l.f45044T9, true);
        this.f87817w0 = mJ.a(ae.l.f44989O9, true);
        if (mJ.s(ae.l.f45169e9)) {
            setMinEms(mJ.k(ae.l.f45169e9, -1));
        } else if (mJ.s(ae.l.f45133b9)) {
            setMinWidth(mJ.f(ae.l.f45133b9, -1));
        }
        if (mJ.s(ae.l.f45157d9)) {
            setMaxEms(mJ.k(ae.l.f45157d9, -1));
        } else if (mJ.s(ae.l.f45121a9)) {
            setMaxWidth(mJ.f(ae.l.f45121a9, -1));
        }
        this.f87760L = C16765m.e(context2, attributeSet, i10, i11).m();
        this.f87762N = context2.getResources().getDimensionPixelOffset(ae.d.f44642z0);
        this.f87764P = mJ.e(ae.l.f45205h9, 0);
        this.f87766R = mJ.f(ae.l.f45289o9, context2.getResources().getDimensionPixelSize(ae.d.f44562A0));
        this.f87767S = mJ.f(ae.l.f45301p9, context2.getResources().getDimensionPixelSize(ae.d.f44564B0));
        this.f87765Q = this.f87766R;
        float fD = mJ.d(ae.l.f45253l9, -1.0f);
        float fD2 = mJ.d(ae.l.f45241k9, -1.0f);
        float fD3 = mJ.d(ae.l.f45217i9, -1.0f);
        float fD4 = mJ.d(ae.l.f45229j9, -1.0f);
        C16765m.b bVarV = this.f87760L.v();
        if (fD >= 0.0f) {
            bVarV.D(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.H(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.z(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.v(fD4);
        }
        this.f87760L = bVarV.m();
        ColorStateList colorStateListB = C16026c.b(context2, mJ, ae.l.f45181f9);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f87801o0 = defaultColor;
            this.f87769U = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f87803p0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f87805q0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f87807r0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f87805q0 = this.f87801o0;
                ColorStateList colorStateListA = C14791a.a(context2, ae.c.f44557h);
                this.f87803p0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f87807r0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f87769U = 0;
            this.f87801o0 = 0;
            this.f87803p0 = 0;
            this.f87805q0 = 0;
            this.f87807r0 = 0;
        }
        if (mJ.s(ae.l.f45109Z8)) {
            ColorStateList colorStateListC = mJ.c(ae.l.f45109Z8);
            this.f87791j0 = colorStateListC;
            this.f87789i0 = colorStateListC;
        }
        ColorStateList colorStateListB2 = C16026c.b(context2, mJ, ae.l.f45265m9);
        this.f87797m0 = mJ.b(ae.l.f45265m9, 0);
        this.f87793k0 = Z1.b.c(context2, ae.c.f44558i);
        this.f87809s0 = Z1.b.c(context2, ae.c.f44559j);
        this.f87795l0 = Z1.b.c(context2, ae.c.f44560k);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (mJ.s(ae.l.f45277n9)) {
            setBoxStrokeErrorColor(C16026c.b(context2, mJ, ae.l.f45277n9));
        }
        if (mJ.n(ae.l.f45066V9, -1) != -1) {
            setHintTextAppearance(mJ.n(ae.l.f45066V9, 0));
        }
        this.f87747A = mJ.c(ae.l.f45385w9);
        this.f87749B = mJ.c(ae.l.f45397x9);
        int iN = mJ.n(ae.l.f44965M9, 0);
        CharSequence charSequenceP = mJ.p(ae.l.f44905H9);
        int iK = mJ.k(ae.l.f44893G9, 1);
        boolean zA = mJ.a(ae.l.f44917I9, false);
        int iN2 = mJ.n(ae.l.f45022R9, 0);
        boolean zA2 = mJ.a(ae.l.f45011Q9, false);
        CharSequence charSequenceP2 = mJ.p(ae.l.f45000P9);
        int iN3 = mJ.n(ae.l.f45158da, 0);
        CharSequence charSequenceP3 = mJ.p(ae.l.f45146ca);
        boolean zA3 = mJ.a(ae.l.f45313q9, false);
        setCounterMaxLength(mJ.k(ae.l.f45325r9, -1));
        this.f87804q = mJ.n(ae.l.f45361u9, 0);
        this.f87802p = mJ.n(ae.l.f45337s9, 0);
        setBoxBackgroundMode(mJ.k(ae.l.f45193g9, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f87802p);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f87804q);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        if (mJ.s(ae.l.f44977N9)) {
            setErrorTextColor(mJ.c(ae.l.f44977N9));
        }
        if (mJ.s(ae.l.f45033S9)) {
            setHelperTextColor(mJ.c(ae.l.f45033S9));
        }
        if (mJ.s(ae.l.f45077W9)) {
            setHintTextColor(mJ.c(ae.l.f45077W9));
        }
        if (mJ.s(ae.l.f45373v9)) {
            setCounterTextColor(mJ.c(ae.l.f45373v9));
        }
        if (mJ.s(ae.l.f45349t9)) {
            setCounterOverflowTextColor(mJ.c(ae.l.f45349t9));
        }
        if (mJ.s(ae.l.f45170ea)) {
            setPlaceholderTextColor(mJ.c(ae.l.f45170ea));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, mJ);
        this.f87776c = endCompoundLayout;
        boolean zA4 = mJ.a(ae.l.f45098Y8, true);
        mJ.x();
        ViewCompat.w0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            ViewCompat.y0(this, 1);
        }
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(endCompoundLayout);
        addView(frameLayout);
        setEnabled(zA4);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceP2);
    }

    private C3656c A() {
        C3656c c3656c = new C3656c();
        c3656c.i0(ne.i.f(getContext(), C5597b.f44492N, 87));
        c3656c.k0(ne.i.g(getContext(), C5597b.f44498T, C6230a.f60115a));
        return c3656c;
    }

    private boolean B() {
        return this.f87751C && !TextUtils.isEmpty(this.f87752D) && (this.f87754F instanceof com.google.android.material.textfield.h);
    }

    private void C() {
        Iterator<f> it = this.f87781e0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void D(Canvas canvas) {
        C16760h c16760h;
        if (this.f87759K == null || (c16760h = this.f87758J) == null) {
            return;
        }
        c16760h.draw(canvas);
        if (this.f87778d.isFocused()) {
            Rect bounds = this.f87759K.getBounds();
            Rect bounds2 = this.f87758J.getBounds();
            float F10 = this.f87815v0.F();
            int iCenterX = bounds2.centerX();
            bounds.left = C6230a.c(iCenterX, bounds2.left, F10);
            bounds.right = C6230a.c(iCenterX, bounds2.right, F10);
            this.f87759K.draw(canvas);
        }
    }

    private void E(Canvas canvas) {
        if (this.f87751C) {
            this.f87815v0.l(canvas);
        }
    }

    private void F(boolean z10) {
        ValueAnimator valueAnimator = this.f87821y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f87821y0.cancel();
        }
        if (z10 && this.f87819x0) {
            l(0.0f);
        } else {
            this.f87815v0.y0(0.0f);
        }
        if (B() && ((com.google.android.material.textfield.h) this.f87754F).s0()) {
            y();
        }
        this.f87813u0 = true;
        L();
        this.f87774b.l(true);
        this.f87776c.H(true);
    }

    private int I(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f87778d.getCompoundPaddingLeft() : this.f87776c.y() : this.f87774b.c());
    }

    private int J(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f87778d.getCompoundPaddingRight() : this.f87774b.c() : this.f87776c.y());
    }

    private static Drawable K(Context context, C16760h c16760h, int i10, int[][] iArr) {
        int iC = C14718a.c(context, C5597b.f44541s, "TextInputLayout");
        C16760h c16760h2 = new C16760h(c16760h.E());
        int iJ = C14718a.j(i10, iC, 0.1f);
        c16760h2.b0(new ColorStateList(iArr, new int[]{iJ, 0}));
        c16760h2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        C16760h c16760h3 = new C16760h(c16760h.E());
        c16760h3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c16760h2, c16760h3), c16760h});
    }

    private void L() {
        TextView textView = this.f87810t;
        if (textView == null || !this.f87808s) {
            return;
        }
        textView.setText((CharSequence) null);
        H4.t.a(this.f87772a, this.f87818x);
        this.f87810t.setVisibility(4);
    }

    private boolean S() {
        return this.f87763O == 1 && this.f87778d.getMinLines() <= 1;
    }

    private void Y() {
        TextView textView = this.f87810t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Z() {
        EditText editText = this.f87778d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.f87763O;
                if (i10 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i10 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public static /* synthetic */ int b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private boolean c0() {
        return (this.f87776c.G() || ((this.f87776c.A() && M()) || this.f87776c.w() != null)) && this.f87776c.getMeasuredWidth() > 0;
    }

    private void e0() {
        if (this.f87810t == null || !this.f87808s || TextUtils.isEmpty(this.f87806r)) {
            return;
        }
        this.f87810t.setText(this.f87806r);
        H4.t.a(this.f87772a, this.f87816w);
        this.f87810t.setVisibility(0);
        this.f87810t.bringToFront();
        announceForAccessibility(this.f87806r);
    }

    private void f0() {
        if (this.f87763O == 1) {
            if (C16026c.i(getContext())) {
                this.f87764P = getResources().getDimensionPixelSize(ae.d.f44577M);
            } else if (C16026c.h(getContext())) {
                this.f87764P = getResources().getDimensionPixelSize(ae.d.f44576L);
            }
        }
    }

    private void g0(Rect rect) {
        C16760h c16760h = this.f87758J;
        if (c16760h != null) {
            int i10 = rect.bottom;
            c16760h.setBounds(rect.left, i10 - this.f87766R, rect.right, i10);
        }
        C16760h c16760h2 = this.f87759K;
        if (c16760h2 != null) {
            int i11 = rect.bottom;
            c16760h2.setBounds(rect.left, i11 - this.f87767S, rect.right, i11);
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f87778d;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.f87754F;
        }
        int iD = C14718a.d(this.f87778d, C5597b.f44527l);
        int i10 = this.f87763O;
        if (i10 == 2) {
            return K(getContext(), this.f87754F, iD, f87746D0);
        }
        if (i10 == 1) {
            return H(this.f87754F, this.f87769U, iD, f87746D0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f87756H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f87756H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f87756H.addState(new int[0], G(false));
        }
        return this.f87756H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f87755G == null) {
            this.f87755G = G(true);
        }
        return this.f87755G;
    }

    private void h0() {
        if (this.f87800o != null) {
            EditText editText = this.f87778d;
            i0(editText == null ? null : editText.getText());
        }
    }

    private void j() {
        TextView textView = this.f87810t;
        if (textView != null) {
            this.f87772a.addView(textView);
            this.f87810t.setVisibility(0);
        }
    }

    private static void j0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? ae.j.f44749c : ae.j.f44748b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void k() {
        if (this.f87778d == null || this.f87763O != 1) {
            return;
        }
        if (C16026c.i(getContext())) {
            EditText editText = this.f87778d;
            ViewCompat.B0(editText, ViewCompat.E(editText), getResources().getDimensionPixelSize(ae.d.f44575K), ViewCompat.D(this.f87778d), getResources().getDimensionPixelSize(ae.d.f44574J));
        } else if (C16026c.h(getContext())) {
            EditText editText2 = this.f87778d;
            ViewCompat.B0(editText2, ViewCompat.E(editText2), getResources().getDimensionPixelSize(ae.d.f44573I), ViewCompat.D(this.f87778d), getResources().getDimensionPixelSize(ae.d.f44572H));
        }
    }

    private void k0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f87800o;
        if (textView != null) {
            a0(textView, this.f87796m ? this.f87802p : this.f87804q);
            if (!this.f87796m && (colorStateList2 = this.f87820y) != null) {
                this.f87800o.setTextColor(colorStateList2);
            }
            if (!this.f87796m || (colorStateList = this.f87822z) == null) {
                return;
            }
            this.f87800o.setTextColor(colorStateList);
        }
    }

    private void l0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.f87747A;
        if (colorStateListG == null) {
            colorStateListG = C14718a.g(getContext(), C5597b.f44525k);
        }
        EditText editText = this.f87778d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = C13462a.r(this.f87778d.getTextCursorDrawable()).mutate();
        if (Q() && (colorStateList = this.f87749B) != null) {
            colorStateListG = colorStateList;
        }
        C13462a.o(drawableMutate, colorStateListG);
    }

    private void m() {
        C16760h c16760h = this.f87754F;
        if (c16760h == null) {
            return;
        }
        C16765m c16765mE = c16760h.E();
        C16765m c16765m = this.f87760L;
        if (c16765mE != c16765m) {
            this.f87754F.setShapeAppearanceModel(c16765m);
        }
        if (w()) {
            this.f87754F.i0(this.f87765Q, this.f87768T);
        }
        int iQ = q();
        this.f87769U = iQ;
        this.f87754F.b0(ColorStateList.valueOf(iQ));
        n();
        p0();
    }

    private void n() {
        if (this.f87758J == null || this.f87759K == null) {
            return;
        }
        if (x()) {
            this.f87758J.b0(this.f87778d.isFocused() ? ColorStateList.valueOf(this.f87793k0) : ColorStateList.valueOf(this.f87768T));
            this.f87759K.b0(ColorStateList.valueOf(this.f87768T));
        }
        invalidate();
    }

    private void o(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f87762N;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private void p() {
        int i10 = this.f87763O;
        if (i10 == 0) {
            this.f87754F = null;
            this.f87758J = null;
            this.f87759K = null;
            return;
        }
        if (i10 == 1) {
            this.f87754F = new C16760h(this.f87760L);
            this.f87758J = new C16760h();
            this.f87759K = new C16760h();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f87763O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f87751C || (this.f87754F instanceof com.google.android.material.textfield.h)) {
                this.f87754F = new C16760h(this.f87760L);
            } else {
                this.f87754F = com.google.android.material.textfield.h.r0(this.f87760L);
            }
            this.f87758J = null;
            this.f87759K = null;
        }
    }

    private int q() {
        return this.f87763O == 1 ? C14718a.i(C14718a.e(this, C5597b.f44541s, 0), this.f87769U) : this.f87769U;
    }

    private boolean q0() {
        int iMax;
        if (this.f87778d == null || this.f87778d.getMeasuredHeight() >= (iMax = Math.max(this.f87776c.getMeasuredHeight(), this.f87774b.getMeasuredHeight()))) {
            return false;
        }
        this.f87778d.setMinimumHeight(iMax);
        return true;
    }

    private Rect r(Rect rect) {
        if (this.f87778d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f87771W;
        boolean zK = com.google.android.material.internal.x.k(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f87763O;
        if (i10 == 1) {
            rect2.left = I(rect.left, zK);
            rect2.top = rect.top + this.f87764P;
            rect2.right = J(rect.right, zK);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = I(rect.left, zK);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, zK);
            return rect2;
        }
        rect2.left = rect.left + this.f87778d.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f87778d.getPaddingRight();
        return rect2;
    }

    private void r0() {
        if (this.f87763O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f87772a.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f87772a.requestLayout();
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f87778d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            FS.log_i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f87778d = editText;
        int i10 = this.f87782f;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f87786h);
        }
        int i11 = this.f87784g;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f87788i);
        }
        this.f87757I = false;
        T();
        setTextInputAccessibilityDelegate(new d(this));
        this.f87815v0.N0(this.f87778d.getTypeface());
        this.f87815v0.v0(this.f87778d.getTextSize());
        int i12 = Build.VERSION.SDK_INT;
        this.f87815v0.q0(this.f87778d.getLetterSpacing());
        int gravity = this.f87778d.getGravity();
        this.f87815v0.j0((gravity & (-113)) | 48);
        this.f87815v0.u0(gravity);
        this.f87811t0 = ViewCompat.A(editText);
        this.f87778d.addTextChangedListener(new a(editText));
        if (this.f87789i0 == null) {
            this.f87789i0 = this.f87778d.getHintTextColors();
        }
        if (this.f87751C) {
            if (TextUtils.isEmpty(this.f87752D)) {
                CharSequence hint = this.f87778d.getHint();
                this.f87780e = hint;
                setHint(hint);
                this.f87778d.setHint((CharSequence) null);
            }
            this.f87753E = true;
        }
        if (i12 >= 29) {
            l0();
        }
        if (this.f87800o != null) {
            i0(this.f87778d.getText());
        }
        n0();
        this.f87790j.f();
        this.f87774b.bringToFront();
        this.f87776c.bringToFront();
        C();
        this.f87776c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        t0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f87752D)) {
            return;
        }
        this.f87752D = charSequence;
        this.f87815v0.K0(charSequence);
        if (this.f87813u0) {
            return;
        }
        U();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f87808s == z10) {
            return;
        }
        if (z10) {
            j();
        } else {
            Y();
            this.f87810t = null;
        }
        this.f87808s = z10;
    }

    private Rect u(Rect rect) {
        if (this.f87778d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f87771W;
        float fC = this.f87815v0.C();
        rect2.left = rect.left + this.f87778d.getCompoundPaddingLeft();
        rect2.top = t(rect, fC);
        rect2.right = rect.right - this.f87778d.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fC);
        return rect2;
    }

    private void u0() {
        EditText editText;
        if (this.f87810t == null || (editText = this.f87778d) == null) {
            return;
        }
        this.f87810t.setGravity(editText.getGravity());
        this.f87810t.setPadding(this.f87778d.getCompoundPaddingLeft(), this.f87778d.getCompoundPaddingTop(), this.f87778d.getCompoundPaddingRight(), this.f87778d.getCompoundPaddingBottom());
    }

    private int v() {
        float fR;
        if (!this.f87751C) {
            return 0;
        }
        int i10 = this.f87763O;
        if (i10 == 0) {
            fR = this.f87815v0.r();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fR = this.f87815v0.r() / 2.0f;
        }
        return (int) fR;
    }

    private void v0() {
        EditText editText = this.f87778d;
        w0(editText == null ? null : editText.getText());
    }

    private boolean w() {
        return this.f87763O == 2 && x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(Editable editable) {
        if (this.f87798n.a(editable) != 0 || this.f87813u0) {
            L();
        } else {
            e0();
        }
    }

    private boolean x() {
        return this.f87765Q > -1 && this.f87768T != 0;
    }

    private void x0(boolean z10, boolean z11) {
        int defaultColor = this.f87799n0.getDefaultColor();
        int colorForState = this.f87799n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f87799n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f87768T = colorForState2;
        } else if (z11) {
            this.f87768T = colorForState;
        } else {
            this.f87768T = defaultColor;
        }
    }

    private void z(boolean z10) {
        ValueAnimator valueAnimator = this.f87821y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f87821y0.cancel();
        }
        if (z10 && this.f87819x0) {
            l(1.0f);
        } else {
            this.f87815v0.y0(1.0f);
        }
        this.f87813u0 = false;
        if (B()) {
            U();
        }
        v0();
        this.f87774b.l(false);
        this.f87776c.H(false);
    }

    public boolean M() {
        return this.f87776c.F();
    }

    public boolean N() {
        return this.f87790j.A();
    }

    public boolean O() {
        return this.f87790j.B();
    }

    final boolean P() {
        return this.f87813u0;
    }

    public boolean R() {
        return this.f87753E;
    }

    public void X() {
        this.f87774b.m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f87772a.addView(view, layoutParams2);
        this.f87772a.setLayoutParams(layoutParams);
        r0();
        setEditText((EditText) view);
    }

    boolean b0() {
        return this.f87790j.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f87778d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f87780e != null) {
            boolean z10 = this.f87753E;
            this.f87753E = false;
            CharSequence hint = editText.getHint();
            this.f87778d.setHint(this.f87780e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f87778d.setHint(hint);
                this.f87753E = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f87772a.getChildCount());
        for (int i11 = 0; i11 < this.f87772a.getChildCount(); i11++) {
            View childAt = this.f87772a.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f87778d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f87823z0) {
            return;
        }
        this.f87823z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.f87815v0;
        boolean zI0 = bVar != null ? bVar.I0(drawableState) : false;
        if (this.f87778d != null) {
            s0(ViewCompat.S(this) && isEnabled());
        }
        n0();
        y0();
        if (zI0) {
            invalidate();
        }
        this.f87823z0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f87778d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    C16760h getBoxBackground() {
        int i10 = this.f87763O;
        if (i10 == 1 || i10 == 2) {
            return this.f87754F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f87769U;
    }

    public int getBoxBackgroundMode() {
        return this.f87763O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f87764P;
    }

    public int getBoxStrokeColor() {
        return this.f87797m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f87799n0;
    }

    public int getBoxStrokeWidth() {
        return this.f87766R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f87767S;
    }

    public int getCounterMaxLength() {
        return this.f87794l;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f87792k && this.f87796m && (textView = this.f87800o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f87822z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f87820y;
    }

    public ColorStateList getCursorColor() {
        return this.f87747A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f87749B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f87789i0;
    }

    public EditText getEditText() {
        return this.f87778d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f87776c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f87776c.n();
    }

    public int getEndIconMinSize() {
        return this.f87776c.o();
    }

    public int getEndIconMode() {
        return this.f87776c.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f87776c.q();
    }

    CheckableImageButton getEndIconView() {
        return this.f87776c.r();
    }

    public CharSequence getError() {
        if (this.f87790j.A()) {
            return this.f87790j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f87790j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f87790j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f87790j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f87776c.s();
    }

    public CharSequence getHelperText() {
        if (this.f87790j.B()) {
            return this.f87790j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f87790j.u();
    }

    public CharSequence getHint() {
        if (this.f87751C) {
            return this.f87752D;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f87815v0.r();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f87815v0.w();
    }

    public ColorStateList getHintTextColor() {
        return this.f87791j0;
    }

    public e getLengthCounter() {
        return this.f87798n;
    }

    public int getMaxEms() {
        return this.f87784g;
    }

    public int getMaxWidth() {
        return this.f87788i;
    }

    public int getMinEms() {
        return this.f87782f;
    }

    public int getMinWidth() {
        return this.f87786h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f87776c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f87776c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f87808s) {
            return this.f87806r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f87814v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f87812u;
    }

    public CharSequence getPrefixText() {
        return this.f87774b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f87774b.b();
    }

    public TextView getPrefixTextView() {
        return this.f87774b.d();
    }

    public C16765m getShapeAppearanceModel() {
        return this.f87760L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f87774b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f87774b.f();
    }

    public int getStartIconMinSize() {
        return this.f87774b.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f87774b.h();
    }

    public CharSequence getSuffixText() {
        return this.f87776c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f87776c.x();
    }

    public TextView getSuffixTextView() {
        return this.f87776c.z();
    }

    public Typeface getTypeface() {
        return this.f87775b0;
    }

    public void i(f fVar) {
        this.f87781e0.add(fVar);
        if (this.f87778d != null) {
            fVar.a(this);
        }
    }

    void i0(Editable editable) {
        int iA = this.f87798n.a(editable);
        boolean z10 = this.f87796m;
        int i10 = this.f87794l;
        if (i10 == -1) {
            this.f87800o.setText(String.valueOf(iA));
            this.f87800o.setContentDescription(null);
            this.f87796m = false;
        } else {
            this.f87796m = iA > i10;
            j0(getContext(), this.f87800o, iA, this.f87794l, this.f87796m);
            if (z10 != this.f87796m) {
                k0();
            }
            this.f87800o.setText(C15544a.c().j(getContext().getString(ae.j.f44750d, Integer.valueOf(iA), Integer.valueOf(this.f87794l))));
        }
        if (this.f87778d == null || z10 == this.f87796m) {
            return;
        }
        s0(false);
        y0();
        n0();
    }

    void l(float f10) {
        if (this.f87815v0.F() == f10) {
            return;
        }
        if (this.f87821y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f87821y0 = valueAnimator;
            valueAnimator.setInterpolator(ne.i.g(getContext(), C5597b.f44497S, C6230a.f60116b));
            this.f87821y0.setDuration(ne.i.f(getContext(), C5597b.f44490L, 167));
            this.f87821y0.addUpdateListener(new c());
        }
        this.f87821y0.setFloatValues(this.f87815v0.F(), f10);
        this.f87821y0.start();
    }

    boolean m0() {
        boolean z10;
        if (this.f87778d == null) {
            return false;
        }
        boolean z11 = true;
        if (d0()) {
            int measuredWidth = this.f87774b.getMeasuredWidth() - this.f87778d.getPaddingLeft();
            if (this.f87777c0 == null || this.f87779d0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f87777c0 = colorDrawable;
                this.f87779d0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = androidx.core.widget.k.a(this.f87778d);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.f87777c0;
            if (drawable != drawable2) {
                androidx.core.widget.k.j(this.f87778d, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f87777c0 != null) {
                Drawable[] drawableArrA2 = androidx.core.widget.k.a(this.f87778d);
                androidx.core.widget.k.j(this.f87778d, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.f87777c0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (c0()) {
            int measuredWidth2 = this.f87776c.z().getMeasuredWidth() - this.f87778d.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f87776c.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + C16236t.b((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams());
            }
            Drawable[] drawableArrA3 = androidx.core.widget.k.a(this.f87778d);
            Drawable drawable3 = this.f87783f0;
            if (drawable3 != null && this.f87785g0 != measuredWidth2) {
                this.f87785g0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.k.j(this.f87778d, drawableArrA3[0], drawableArrA3[1], this.f87783f0, drawableArrA3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f87783f0 = colorDrawable2;
                this.f87785g0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = drawableArrA3[2];
            Drawable drawable5 = this.f87783f0;
            if (drawable4 != drawable5) {
                this.f87787h0 = drawable4;
                androidx.core.widget.k.j(this.f87778d, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                return true;
            }
        } else if (this.f87783f0 != null) {
            Drawable[] drawableArrA4 = androidx.core.widget.k.a(this.f87778d);
            if (drawableArrA4[2] == this.f87783f0) {
                androidx.core.widget.k.j(this.f87778d, drawableArrA4[0], drawableArrA4[1], this.f87787h0, drawableArrA4[3]);
            } else {
                z11 = z10;
            }
            this.f87783f0 = null;
            return z11;
        }
        return z10;
    }

    void n0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f87778d;
        if (editText == null || this.f87763O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C5648y.a(background)) {
            background = background.mutate();
        }
        if (b0()) {
            background.setColorFilter(C5629e.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f87796m && (textView = this.f87800o) != null) {
            background.setColorFilter(C5629e.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C13462a.c(background);
            this.f87778d.refreshDrawableState();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f87776c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f87750B0 = false;
        boolean zQ0 = q0();
        boolean zM0 = m0();
        if (zQ0 || zM0) {
            this.f87778d.post(new Runnable() { // from class: com.google.android.material.textfield.D
                @Override // java.lang.Runnable
                public final void run() {
                    this.f87690a.f87778d.requestLayout();
                }
            });
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f87830c);
        if (hVar.f87831d) {
            post(new b());
        }
        requestLayout();
    }

    void p0() {
        EditText editText = this.f87778d;
        if (editText == null || this.f87754F == null) {
            return;
        }
        if ((this.f87757I || editText.getBackground() == null) && this.f87763O != 0) {
            o0();
            this.f87757I = true;
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f87769U != i10) {
            this.f87769U = i10;
            this.f87801o0 = i10;
            this.f87805q0 = i10;
            this.f87807r0 = i10;
            m();
        }
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f87763O) {
            return;
        }
        this.f87763O = i10;
        if (this.f87778d != null) {
            T();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f87764P = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.f87760L = this.f87760L.v().B(i10, this.f87760L.r()).F(i10, this.f87760L.t()).t(i10, this.f87760L.j()).x(i10, this.f87760L.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f87797m0 != i10) {
            this.f87797m0 = i10;
            y0();
        }
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f87799n0 != colorStateList) {
            this.f87799n0 = colorStateList;
            y0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f87766R = i10;
        y0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f87767S = i10;
        y0();
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f87792k != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f87800o = appCompatTextView;
                appCompatTextView.setId(ae.f.f44673S);
                Typeface typeface = this.f87775b0;
                if (typeface != null) {
                    this.f87800o.setTypeface(typeface);
                }
                this.f87800o.setMaxLines(1);
                this.f87790j.e(this.f87800o, 2);
                C16236t.d((ViewGroup.MarginLayoutParams) this.f87800o.getLayoutParams(), getResources().getDimensionPixelOffset(ae.d.f44566C0));
                k0();
                h0();
            } else {
                this.f87790j.C(this.f87800o, 2);
                this.f87800o = null;
            }
            this.f87792k = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f87794l != i10) {
            if (i10 > 0) {
                this.f87794l = i10;
            } else {
                this.f87794l = -1;
            }
            if (this.f87792k) {
                h0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f87802p != i10) {
            this.f87802p = i10;
            k0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f87822z != colorStateList) {
            this.f87822z = colorStateList;
            k0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f87804q != i10) {
            this.f87804q = i10;
            k0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f87820y != colorStateList) {
            this.f87820y = colorStateList;
            k0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f87747A != colorStateList) {
            this.f87747A = colorStateList;
            l0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f87749B != colorStateList) {
            this.f87749B = colorStateList;
            if (Q()) {
                l0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f87789i0 = colorStateList;
        this.f87791j0 = colorStateList;
        if (this.f87778d != null) {
            s0(false);
        }
    }

    public void setEndIconActivated(boolean z10) {
        this.f87776c.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f87776c.O(z10);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f87776c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f87776c.S(drawable);
    }

    public void setEndIconMinSize(int i10) {
        this.f87776c.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f87776c.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f87776c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f87776c.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f87776c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f87776c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f87776c.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f87776c.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f87790j.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f87790j.w();
        } else {
            this.f87790j.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f87790j.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f87790j.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f87790j.G(z10);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f87776c.c0(drawable);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f87776c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f87776c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f87776c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f87776c.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f87790j.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f87790j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f87817w0 != z10) {
            this.f87817w0 = z10;
            s0(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f87790j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f87790j.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f87790j.J(i10);
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f87819x0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f87751C) {
            this.f87751C = z10;
            if (z10) {
                CharSequence hint = this.f87778d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f87752D)) {
                        setHint(hint);
                    }
                    this.f87778d.setHint((CharSequence) null);
                }
                this.f87753E = true;
            } else {
                this.f87753E = false;
                if (!TextUtils.isEmpty(this.f87752D) && TextUtils.isEmpty(this.f87778d.getHint())) {
                    this.f87778d.setHint(this.f87752D);
                }
                setHintInternal(null);
            }
            if (this.f87778d != null) {
                r0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f87815v0.g0(i10);
        this.f87791j0 = this.f87815v0.p();
        if (this.f87778d != null) {
            s0(false);
            r0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f87791j0 != colorStateList) {
            if (this.f87789i0 == null) {
                this.f87815v0.i0(colorStateList);
            }
            this.f87791j0 = colorStateList;
            if (this.f87778d != null) {
                s0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f87798n = eVar;
    }

    public void setMaxEms(int i10) {
        this.f87784g = i10;
        EditText editText = this.f87778d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f87788i = i10;
        EditText editText = this.f87778d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMinEms(int i10) {
        this.f87782f = i10;
        EditText editText = this.f87778d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f87786h = i10;
        EditText editText = this.f87778d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f87776c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f87776c.l0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f87776c.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f87776c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f87776c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f87810t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f87810t = appCompatTextView;
            appCompatTextView.setId(ae.f.f44676V);
            ViewCompat.w0(this.f87810t, 2);
            C3656c c3656cA = A();
            this.f87816w = c3656cA;
            c3656cA.n0(67L);
            this.f87818x = A();
            setPlaceholderTextAppearance(this.f87814v);
            setPlaceholderTextColor(this.f87812u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f87808s) {
                setPlaceholderTextEnabled(true);
            }
            this.f87806r = charSequence;
        }
        v0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f87814v = i10;
        TextView textView = this.f87810t;
        if (textView != null) {
            androidx.core.widget.k.p(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f87812u != colorStateList) {
            this.f87812u = colorStateList;
            TextView textView = this.f87810t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f87774b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f87774b.o(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f87774b.p(colorStateList);
    }

    public void setShapeAppearanceModel(C16765m c16765m) {
        C16760h c16760h = this.f87754F;
        if (c16760h == null || c16760h.E() == c16765m) {
            return;
        }
        this.f87760L = c16765m;
        m();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f87774b.q(z10);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f87774b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f87774b.s(drawable);
    }

    public void setStartIconMinSize(int i10) {
        this.f87774b.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f87774b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f87774b.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f87774b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f87774b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f87774b.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f87774b.z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f87776c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f87776c.q0(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f87776c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f87778d;
        if (editText != null) {
            ViewCompat.m0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f87775b0) {
            this.f87775b0 = typeface;
            this.f87815v0.N0(typeface);
            this.f87790j.N(typeface);
            TextView textView = this.f87800o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void y0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f87754F == null || this.f87763O == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f87778d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f87778d) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f87768T = this.f87809s0;
        } else if (b0()) {
            if (this.f87799n0 != null) {
                x0(z11, z10);
            } else {
                this.f87768T = getErrorCurrentTextColors();
            }
        } else if (!this.f87796m || (textView = this.f87800o) == null) {
            if (z11) {
                this.f87768T = this.f87797m0;
            } else if (z10) {
                this.f87768T = this.f87795l0;
            } else {
                this.f87768T = this.f87793k0;
            }
        } else if (this.f87799n0 != null) {
            x0(z11, z10);
        } else {
            this.f87768T = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            l0();
        }
        this.f87776c.I();
        X();
        if (this.f87763O == 2) {
            int i10 = this.f87765Q;
            if (z11 && isEnabled()) {
                this.f87765Q = this.f87767S;
            } else {
                this.f87765Q = this.f87766R;
            }
            if (this.f87765Q != i10) {
                V();
            }
        }
        if (this.f87763O == 1) {
            if (!isEnabled()) {
                this.f87769U = this.f87803p0;
            } else if (z10 && !z11) {
                this.f87769U = this.f87807r0;
            } else if (z11) {
                this.f87769U = this.f87805q0;
            } else {
                this.f87769U = this.f87801o0;
            }
        }
        m();
    }

    private C16760h G(boolean z10) throws Resources.NotFoundException {
        float f10;
        float dimensionPixelOffset;
        ColorStateList dropDownBackgroundTintList;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(ae.d.f44622p0);
        if (z10) {
            f10 = dimensionPixelOffset2;
        } else {
            f10 = 0.0f;
        }
        EditText editText = this.f87778d;
        if (editText instanceof MaterialAutoCompleteTextView) {
            dimensionPixelOffset = ((MaterialAutoCompleteTextView) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(ae.d.f44639y);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(ae.d.f44618n0);
        C16765m c16765mM = C16765m.a().D(f10).H(f10).v(dimensionPixelOffset2).z(dimensionPixelOffset2).m();
        EditText editText2 = this.f87778d;
        if (editText2 instanceof MaterialAutoCompleteTextView) {
            dropDownBackgroundTintList = ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList();
        } else {
            dropDownBackgroundTintList = null;
        }
        C16760h c16760hM = C16760h.m(getContext(), dimensionPixelOffset, dropDownBackgroundTintList);
        c16760hM.setShapeAppearanceModel(c16765mM);
        c16760hM.d0(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        return c16760hM;
    }

    private static Drawable H(C16760h c16760h, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{C14718a.j(i11, i10, 0.1f), i10}), c16760h, c16760h);
    }

    private boolean Q() {
        if (!b0()) {
            if (this.f87800o == null || !this.f87796m) {
                return false;
            }
            return true;
        }
        return true;
    }

    private void T() {
        p();
        p0();
        y0();
        f0();
        k();
        if (this.f87763O != 0) {
            r0();
        }
        Z();
    }

    private void U() {
        if (B()) {
            RectF rectF = this.f87773a0;
            this.f87815v0.o(rectF, this.f87778d.getWidth(), this.f87778d.getGravity());
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                o(rectF);
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f87765Q);
                ((com.google.android.material.textfield.h) this.f87754F).v0(rectF);
            }
        }
    }

    private void V() {
        if (B() && !this.f87813u0) {
            y();
            U();
        }
    }

    private static void W(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                W((ViewGroup) childAt, z10);
            }
        }
    }

    private boolean d0() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f87774b.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private void o0() {
        ViewCompat.q0(this.f87778d, getEditTextBoxBackground());
    }

    private int s(Rect rect, Rect rect2, float f10) {
        if (S()) {
            return (int) (rect2.top + f10);
        }
        return rect.bottom - this.f87778d.getCompoundPaddingBottom();
    }

    private int t(Rect rect, float f10) {
        if (S()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return rect.top + this.f87778d.getCompoundPaddingTop();
    }

    private void t0(boolean z10, boolean z11) {
        boolean z12;
        ColorStateList colorStateList;
        TextView textView;
        int colorForState;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f87778d;
        boolean z13 = false;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText2 = this.f87778d;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        }
        ColorStateList colorStateList2 = this.f87789i0;
        if (colorStateList2 != null) {
            this.f87815v0.d0(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f87789i0;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, this.f87809s0);
            } else {
                colorForState = this.f87809s0;
            }
            this.f87815v0.d0(ColorStateList.valueOf(colorForState));
        } else if (b0()) {
            this.f87815v0.d0(this.f87790j.r());
        } else if (this.f87796m && (textView = this.f87800o) != null) {
            this.f87815v0.d0(textView.getTextColors());
        } else if (z13 && (colorStateList = this.f87791j0) != null) {
            this.f87815v0.i0(colorStateList);
        }
        if (!z12 && this.f87817w0 && (!isEnabled() || !z13)) {
            if (z11 || !this.f87813u0) {
                F(z10);
                return;
            }
            return;
        }
        if (!z11 && !this.f87813u0) {
            return;
        }
        z(z10);
    }

    private void y() {
        if (B()) {
            ((com.google.android.material.textfield.h) this.f87754F).t0();
        }
    }

    void a0(TextView textView, int i10) {
        try {
            androidx.core.widget.k.p(textView, i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        androidx.core.widget.k.p(textView, ae.k.f44788d);
        textView.setTextColor(Z1.b.c(getContext(), ae.c.f44550a));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        fsSuperDraw_e02d38f646047fbea4837028cd2251d2(canvas);
        E(canvas);
        D(canvas);
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (com.google.android.material.internal.x.k(this)) {
            return this.f87760L.j().a(this.f87773a0);
        }
        return this.f87760L.l().a(this.f87773a0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (com.google.android.material.internal.x.k(this)) {
            return this.f87760L.l().a(this.f87773a0);
        }
        return this.f87760L.j().a(this.f87773a0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (com.google.android.material.internal.x.k(this)) {
            return this.f87760L.r().a(this.f87773a0);
        }
        return this.f87760L.t().a(this.f87773a0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (com.google.android.material.internal.x.k(this)) {
            return this.f87760L.t().a(this.f87773a0);
        }
        return this.f87760L.r().a(this.f87773a0);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f87815v0.Y(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f87778d;
        if (editText != null) {
            Rect rect = this.f87770V;
            com.google.android.material.internal.d.a(this, editText, rect);
            g0(rect);
            if (this.f87751C) {
                this.f87815v0.v0(this.f87778d.getTextSize());
                int gravity = this.f87778d.getGravity();
                this.f87815v0.j0((gravity & (-113)) | 48);
                this.f87815v0.u0(gravity);
                this.f87815v0.f0(r(rect));
                this.f87815v0.p0(u(rect));
                this.f87815v0.a0();
                if (B() && !this.f87813u0) {
                    U();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f87750B0) {
            this.f87776c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f87750B0 = true;
        }
        u0();
        this.f87776c.x0();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != this.f87761M) {
            float fA = this.f87760L.r().a(this.f87773a0);
            float fA2 = this.f87760L.t().a(this.f87773a0);
            float fA3 = this.f87760L.j().a(this.f87773a0);
            float fA4 = this.f87760L.l().a(this.f87773a0);
            C16756d c16756dQ = this.f87760L.q();
            C16756d c16756dS = this.f87760L.s();
            C16765m c16765mM = C16765m.a().C(c16756dS).G(c16756dQ).u(this.f87760L.k()).y(this.f87760L.i()).D(fA2).H(fA).v(fA4).z(fA3).m();
            this.f87761M = z10;
            setShapeAppearanceModel(c16765mM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (b0()) {
            hVar.f87830c = getError();
        }
        hVar.f87831d = this.f87776c.E();
        return hVar;
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(Z1.b.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f87801o0 = defaultColor;
        this.f87769U = defaultColor;
        this.f87803p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f87805q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f87807r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f87793k0 = colorStateList.getDefaultColor();
            this.f87809s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f87795l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f87797m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f87797m0 != colorStateList.getDefaultColor()) {
            this.f87797m0 = colorStateList.getDefaultColor();
        }
        y0();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        W(this, z10);
        super.setEnabled(z10);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f87790j.R(charSequence);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }
}
