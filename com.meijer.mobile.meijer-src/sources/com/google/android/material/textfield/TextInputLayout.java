package com.google.android.material.textfield;

import I4.C3822c;
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
import androidx.appcompat.widget.C5771e;
import androidx.appcompat.widget.C5790y;
import androidx.appcompat.widget.M;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import ce.C6503b;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.material.internal.CheckableImageButton;
import d2.C13595a;
import de.C13661a;
import j.C14879a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ke.C15121a;
import m2.C15655a;
import p2.C16381t;
import qe.C16634c;
import te.C17230d;
import te.C17234h;
import te.C17239m;
import w2.AbstractC17821a;
import we.C17867a;

/* loaded from: classes4.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener, FSDraw, FSDispatchDraw {

    /* renamed from: C0, reason: collision with root package name */
    private static final int f88585C0 = ce.k.f61817r;

    /* renamed from: D0, reason: collision with root package name */
    private static final int[][] f88586D0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    private ColorStateList f88587A;

    /* renamed from: A0, reason: collision with root package name */
    private boolean f88588A0;

    /* renamed from: B, reason: collision with root package name */
    private ColorStateList f88589B;

    /* renamed from: B0, reason: collision with root package name */
    private boolean f88590B0;

    /* renamed from: C, reason: collision with root package name */
    private boolean f88591C;

    /* renamed from: D, reason: collision with root package name */
    private CharSequence f88592D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f88593E;

    /* renamed from: F, reason: collision with root package name */
    private C17234h f88594F;

    /* renamed from: G, reason: collision with root package name */
    private C17234h f88595G;

    /* renamed from: H, reason: collision with root package name */
    private StateListDrawable f88596H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f88597I;

    /* renamed from: J, reason: collision with root package name */
    private C17234h f88598J;

    /* renamed from: K, reason: collision with root package name */
    private C17234h f88599K;

    /* renamed from: L, reason: collision with root package name */
    private C17239m f88600L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f88601M;

    /* renamed from: N, reason: collision with root package name */
    private final int f88602N;

    /* renamed from: O, reason: collision with root package name */
    private int f88603O;

    /* renamed from: P, reason: collision with root package name */
    private int f88604P;

    /* renamed from: Q, reason: collision with root package name */
    private int f88605Q;

    /* renamed from: R, reason: collision with root package name */
    private int f88606R;

    /* renamed from: S, reason: collision with root package name */
    private int f88607S;

    /* renamed from: T, reason: collision with root package name */
    private int f88608T;

    /* renamed from: U, reason: collision with root package name */
    private int f88609U;

    /* renamed from: V, reason: collision with root package name */
    private final Rect f88610V;

    /* renamed from: W, reason: collision with root package name */
    private final Rect f88611W;

    /* renamed from: a, reason: collision with root package name */
    private final FrameLayout f88612a;

    /* renamed from: a0, reason: collision with root package name */
    private final RectF f88613a0;

    /* renamed from: b, reason: collision with root package name */
    private final StartCompoundLayout f88614b;

    /* renamed from: b0, reason: collision with root package name */
    private Typeface f88615b0;

    /* renamed from: c, reason: collision with root package name */
    private final EndCompoundLayout f88616c;

    /* renamed from: c0, reason: collision with root package name */
    private Drawable f88617c0;

    /* renamed from: d, reason: collision with root package name */
    EditText f88618d;

    /* renamed from: d0, reason: collision with root package name */
    private int f88619d0;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f88620e;

    /* renamed from: e0, reason: collision with root package name */
    private final LinkedHashSet<f> f88621e0;

    /* renamed from: f, reason: collision with root package name */
    private int f88622f;

    /* renamed from: f0, reason: collision with root package name */
    private Drawable f88623f0;

    /* renamed from: g, reason: collision with root package name */
    private int f88624g;

    /* renamed from: g0, reason: collision with root package name */
    private int f88625g0;

    /* renamed from: h, reason: collision with root package name */
    private int f88626h;

    /* renamed from: h0, reason: collision with root package name */
    private Drawable f88627h0;

    /* renamed from: i, reason: collision with root package name */
    private int f88628i;

    /* renamed from: i0, reason: collision with root package name */
    private ColorStateList f88629i0;

    /* renamed from: j, reason: collision with root package name */
    private final t f88630j;

    /* renamed from: j0, reason: collision with root package name */
    private ColorStateList f88631j0;

    /* renamed from: k, reason: collision with root package name */
    boolean f88632k;

    /* renamed from: k0, reason: collision with root package name */
    private int f88633k0;

    /* renamed from: l, reason: collision with root package name */
    private int f88634l;

    /* renamed from: l0, reason: collision with root package name */
    private int f88635l0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f88636m;

    /* renamed from: m0, reason: collision with root package name */
    private int f88637m0;

    /* renamed from: n, reason: collision with root package name */
    private e f88638n;

    /* renamed from: n0, reason: collision with root package name */
    private ColorStateList f88639n0;

    /* renamed from: o, reason: collision with root package name */
    private TextView f88640o;

    /* renamed from: o0, reason: collision with root package name */
    private int f88641o0;

    /* renamed from: p, reason: collision with root package name */
    private int f88642p;

    /* renamed from: p0, reason: collision with root package name */
    private int f88643p0;

    /* renamed from: q, reason: collision with root package name */
    private int f88644q;

    /* renamed from: q0, reason: collision with root package name */
    private int f88645q0;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f88646r;

    /* renamed from: r0, reason: collision with root package name */
    private int f88647r0;

    /* renamed from: s, reason: collision with root package name */
    private boolean f88648s;

    /* renamed from: s0, reason: collision with root package name */
    private int f88649s0;

    /* renamed from: t, reason: collision with root package name */
    private TextView f88650t;

    /* renamed from: t0, reason: collision with root package name */
    int f88651t0;

    /* renamed from: u, reason: collision with root package name */
    private ColorStateList f88652u;

    /* renamed from: u0, reason: collision with root package name */
    private boolean f88653u0;

    /* renamed from: v, reason: collision with root package name */
    private int f88654v;

    /* renamed from: v0, reason: collision with root package name */
    final com.google.android.material.internal.b f88655v0;

    /* renamed from: w, reason: collision with root package name */
    private C3822c f88656w;

    /* renamed from: w0, reason: collision with root package name */
    private boolean f88657w0;

    /* renamed from: x, reason: collision with root package name */
    private C3822c f88658x;

    /* renamed from: x0, reason: collision with root package name */
    private boolean f88659x0;

    /* renamed from: y, reason: collision with root package name */
    private ColorStateList f88660y;

    /* renamed from: y0, reason: collision with root package name */
    private ValueAnimator f88661y0;

    /* renamed from: z, reason: collision with root package name */
    private ColorStateList f88662z;

    /* renamed from: z0, reason: collision with root package name */
    private boolean f88663z0;

    class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        int f88664a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f88665b;

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        a(EditText editText) {
            this.f88665b = editText;
            this.f88664a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.s0(!r0.f88588A0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f88632k) {
                textInputLayout.i0(editable);
            }
            if (TextInputLayout.this.f88648s) {
                TextInputLayout.this.w0(editable);
            }
            int lineCount = this.f88665b.getLineCount();
            int i10 = this.f88664a;
            if (lineCount != i10) {
                if (lineCount < i10) {
                    int iA = ViewCompat.A(this.f88665b);
                    int i11 = TextInputLayout.this.f88651t0;
                    if (iA != i11) {
                        this.f88665b.setMinimumHeight(i11);
                    }
                }
                this.f88664a = lineCount;
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f88616c.h();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f88655v0.y0(((Float) valueAnimator.getAnimatedValue()).floatValue());
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

    static class h extends AbstractC17821a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        CharSequence f88670c;

        /* renamed from: d, reason: collision with root package name */
        boolean f88671d;

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
            this.f88670c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f88671d = parcel.readInt() == 1;
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f88670c) + "}";
        }

        @Override // w2.AbstractC17821a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.f88670c, parcel, i10);
            parcel.writeInt(this.f88671d ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6503b.f61551p0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fsSuperDispatchDraw_e02d38f646047fbea4837028cd2251d2(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f88588A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f88588A0 = false;
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
        this.f88616c.P(i10);
    }

    public void setEndIconDrawable(int i10) {
        this.f88616c.R(i10);
    }

    public void setErrorIconDrawable(int i10) {
        this.f88616c.b0(i10);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f88591C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.m.FLAG_MOVED);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        this.f88616c.i0(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        this.f88616c.k0(i10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? C14879a.b(getContext(), i10) : null);
    }

    public static class d extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        private final TextInputLayout f88669d;

        public d(TextInputLayout textInputLayout) {
            this.f88669d = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void g(View view, q2.y yVar) {
            CharSequence text;
            boolean z10;
            String string;
            super.g(view, yVar);
            EditText editText = this.f88669d.getEditText();
            if (editText != null) {
                text = editText.getText();
            } else {
                text = null;
            }
            CharSequence hint = this.f88669d.getHint();
            CharSequence error = this.f88669d.getError();
            CharSequence placeholderText = this.f88669d.getPlaceholderText();
            int counterMaxLength = this.f88669d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f88669d.getCounterOverflowDescription();
            boolean zIsEmpty = TextUtils.isEmpty(text);
            boolean zIsEmpty2 = TextUtils.isEmpty(hint);
            boolean zP = this.f88669d.P();
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
            this.f88669d.f88614b.A(yVar);
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
            View viewT = this.f88669d.f88630j.t();
            if (viewT != null) {
                yVar.E0(viewT);
            }
            this.f88669d.f88616c.m().o(view, yVar);
        }

        @Override // androidx.core.view.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f88669d.f88616c.m().p(view, accessibilityEvent);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f88585C0;
        super(C17867a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f88622f = -1;
        this.f88624g = -1;
        this.f88626h = -1;
        this.f88628i = -1;
        this.f88630j = new t(this);
        this.f88638n = new e() { // from class: com.google.android.material.textfield.E
            @Override // com.google.android.material.textfield.TextInputLayout.e
            public final int a(Editable editable) {
                return TextInputLayout.b(editable);
            }
        };
        this.f88610V = new Rect();
        this.f88611W = new Rect();
        this.f88613a0 = new RectF();
        this.f88621e0 = new LinkedHashSet<>();
        com.google.android.material.internal.b bVar = new com.google.android.material.internal.b(this);
        this.f88655v0 = bVar;
        this.f88590B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f88612a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = C13661a.f128350a;
        bVar.L0(timeInterpolator);
        bVar.G0(timeInterpolator);
        bVar.j0(8388659);
        M mJ = com.google.android.material.internal.s.j(context2, attributeSet, ce.l.f62102X8, i10, i11, ce.l.f62376u9, ce.l.f62352s9, ce.l.f61980M9, ce.l.f62037R9, ce.l.f62081V9);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, mJ);
        this.f88614b = startCompoundLayout;
        this.f88591C = mJ.a(ce.l.f62070U9, true);
        setHint(mJ.p(ce.l.f62160c9));
        this.f88659x0 = mJ.a(ce.l.f62059T9, true);
        this.f88657w0 = mJ.a(ce.l.f62004O9, true);
        if (mJ.s(ce.l.f62184e9)) {
            setMinEms(mJ.k(ce.l.f62184e9, -1));
        } else if (mJ.s(ce.l.f62148b9)) {
            setMinWidth(mJ.f(ce.l.f62148b9, -1));
        }
        if (mJ.s(ce.l.f62172d9)) {
            setMaxEms(mJ.k(ce.l.f62172d9, -1));
        } else if (mJ.s(ce.l.f62136a9)) {
            setMaxWidth(mJ.f(ce.l.f62136a9, -1));
        }
        this.f88600L = C17239m.e(context2, attributeSet, i10, i11).m();
        this.f88602N = context2.getResources().getDimensionPixelOffset(ce.d.f61657z0);
        this.f88604P = mJ.e(ce.l.f62220h9, 0);
        this.f88606R = mJ.f(ce.l.f62304o9, context2.getResources().getDimensionPixelSize(ce.d.f61577A0));
        this.f88607S = mJ.f(ce.l.f62316p9, context2.getResources().getDimensionPixelSize(ce.d.f61579B0));
        this.f88605Q = this.f88606R;
        float fD = mJ.d(ce.l.f62268l9, -1.0f);
        float fD2 = mJ.d(ce.l.f62256k9, -1.0f);
        float fD3 = mJ.d(ce.l.f62232i9, -1.0f);
        float fD4 = mJ.d(ce.l.f62244j9, -1.0f);
        C17239m.b bVarV = this.f88600L.v();
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
        this.f88600L = bVarV.m();
        ColorStateList colorStateListB = C16634c.b(context2, mJ, ce.l.f62196f9);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.f88641o0 = defaultColor;
            this.f88609U = defaultColor;
            if (colorStateListB.isStateful()) {
                this.f88643p0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                this.f88645q0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f88647r0 = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f88645q0 = this.f88641o0;
                ColorStateList colorStateListA = C14879a.a(context2, ce.c.f61572h);
                this.f88643p0 = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                this.f88647r0 = colorStateListA.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f88609U = 0;
            this.f88641o0 = 0;
            this.f88643p0 = 0;
            this.f88645q0 = 0;
            this.f88647r0 = 0;
        }
        if (mJ.s(ce.l.f62124Z8)) {
            ColorStateList colorStateListC = mJ.c(ce.l.f62124Z8);
            this.f88631j0 = colorStateListC;
            this.f88629i0 = colorStateListC;
        }
        ColorStateList colorStateListB2 = C16634c.b(context2, mJ, ce.l.f62280m9);
        this.f88637m0 = mJ.b(ce.l.f62280m9, 0);
        this.f88633k0 = Z1.b.c(context2, ce.c.f61573i);
        this.f88649s0 = Z1.b.c(context2, ce.c.f61574j);
        this.f88635l0 = Z1.b.c(context2, ce.c.f61575k);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        if (mJ.s(ce.l.f62292n9)) {
            setBoxStrokeErrorColor(C16634c.b(context2, mJ, ce.l.f62292n9));
        }
        if (mJ.n(ce.l.f62081V9, -1) != -1) {
            setHintTextAppearance(mJ.n(ce.l.f62081V9, 0));
        }
        this.f88587A = mJ.c(ce.l.f62400w9);
        this.f88589B = mJ.c(ce.l.f62412x9);
        int iN = mJ.n(ce.l.f61980M9, 0);
        CharSequence charSequenceP = mJ.p(ce.l.f61920H9);
        int iK = mJ.k(ce.l.f61908G9, 1);
        boolean zA = mJ.a(ce.l.f61932I9, false);
        int iN2 = mJ.n(ce.l.f62037R9, 0);
        boolean zA2 = mJ.a(ce.l.f62026Q9, false);
        CharSequence charSequenceP2 = mJ.p(ce.l.f62015P9);
        int iN3 = mJ.n(ce.l.f62173da, 0);
        CharSequence charSequenceP3 = mJ.p(ce.l.f62161ca);
        boolean zA3 = mJ.a(ce.l.f62328q9, false);
        setCounterMaxLength(mJ.k(ce.l.f62340r9, -1));
        this.f88644q = mJ.n(ce.l.f62376u9, 0);
        this.f88642p = mJ.n(ce.l.f62352s9, 0);
        setBoxBackgroundMode(mJ.k(ce.l.f62208g9, 0));
        setErrorContentDescription(charSequenceP);
        setErrorAccessibilityLiveRegion(iK);
        setCounterOverflowTextAppearance(this.f88642p);
        setHelperTextTextAppearance(iN2);
        setErrorTextAppearance(iN);
        setCounterTextAppearance(this.f88644q);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        if (mJ.s(ce.l.f61992N9)) {
            setErrorTextColor(mJ.c(ce.l.f61992N9));
        }
        if (mJ.s(ce.l.f62048S9)) {
            setHelperTextColor(mJ.c(ce.l.f62048S9));
        }
        if (mJ.s(ce.l.f62092W9)) {
            setHintTextColor(mJ.c(ce.l.f62092W9));
        }
        if (mJ.s(ce.l.f62388v9)) {
            setCounterTextColor(mJ.c(ce.l.f62388v9));
        }
        if (mJ.s(ce.l.f62364t9)) {
            setCounterOverflowTextColor(mJ.c(ce.l.f62364t9));
        }
        if (mJ.s(ce.l.f62185ea)) {
            setPlaceholderTextColor(mJ.c(ce.l.f62185ea));
        }
        EndCompoundLayout endCompoundLayout = new EndCompoundLayout(this, mJ);
        this.f88616c = endCompoundLayout;
        boolean zA4 = mJ.a(ce.l.f62113Y8, true);
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

    private C3822c A() {
        C3822c c3822c = new C3822c();
        c3822c.i0(pe.i.f(getContext(), C6503b.f61507N, 87));
        c3822c.k0(pe.i.g(getContext(), C6503b.f61513T, C13661a.f128350a));
        return c3822c;
    }

    private boolean B() {
        return this.f88591C && !TextUtils.isEmpty(this.f88592D) && (this.f88594F instanceof com.google.android.material.textfield.h);
    }

    private void C() {
        Iterator<f> it = this.f88621e0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void D(Canvas canvas) {
        C17234h c17234h;
        if (this.f88599K == null || (c17234h = this.f88598J) == null) {
            return;
        }
        c17234h.draw(canvas);
        if (this.f88618d.isFocused()) {
            Rect bounds = this.f88599K.getBounds();
            Rect bounds2 = this.f88598J.getBounds();
            float F10 = this.f88655v0.F();
            int iCenterX = bounds2.centerX();
            bounds.left = C13661a.c(iCenterX, bounds2.left, F10);
            bounds.right = C13661a.c(iCenterX, bounds2.right, F10);
            this.f88599K.draw(canvas);
        }
    }

    private void E(Canvas canvas) {
        if (this.f88591C) {
            this.f88655v0.l(canvas);
        }
    }

    private void F(boolean z10) {
        ValueAnimator valueAnimator = this.f88661y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f88661y0.cancel();
        }
        if (z10 && this.f88659x0) {
            l(0.0f);
        } else {
            this.f88655v0.y0(0.0f);
        }
        if (B() && ((com.google.android.material.textfield.h) this.f88594F).s0()) {
            y();
        }
        this.f88653u0 = true;
        L();
        this.f88614b.l(true);
        this.f88616c.H(true);
    }

    private int I(int i10, boolean z10) {
        return i10 + ((z10 || getPrefixText() == null) ? (!z10 || getSuffixText() == null) ? this.f88618d.getCompoundPaddingLeft() : this.f88616c.y() : this.f88614b.c());
    }

    private int J(int i10, boolean z10) {
        return i10 - ((z10 || getSuffixText() == null) ? (!z10 || getPrefixText() == null) ? this.f88618d.getCompoundPaddingRight() : this.f88614b.c() : this.f88616c.y());
    }

    private static Drawable K(Context context, C17234h c17234h, int i10, int[][] iArr) {
        int iC = C15121a.c(context, C6503b.f61556s, "TextInputLayout");
        C17234h c17234h2 = new C17234h(c17234h.E());
        int iJ = C15121a.j(i10, iC, 0.1f);
        c17234h2.b0(new ColorStateList(iArr, new int[]{iJ, 0}));
        c17234h2.setTint(iC);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iJ, iC});
        C17234h c17234h3 = new C17234h(c17234h.E());
        c17234h3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c17234h2, c17234h3), c17234h});
    }

    private void L() {
        TextView textView = this.f88650t;
        if (textView == null || !this.f88648s) {
            return;
        }
        textView.setText((CharSequence) null);
        I4.t.a(this.f88612a, this.f88658x);
        this.f88650t.setVisibility(4);
    }

    private boolean S() {
        return this.f88603O == 1 && this.f88618d.getMinLines() <= 1;
    }

    private void Y() {
        TextView textView = this.f88650t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void Z() {
        EditText editText = this.f88618d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i10 = this.f88603O;
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
        return (this.f88616c.G() || ((this.f88616c.A() && M()) || this.f88616c.w() != null)) && this.f88616c.getMeasuredWidth() > 0;
    }

    private void e0() {
        if (this.f88650t == null || !this.f88648s || TextUtils.isEmpty(this.f88646r)) {
            return;
        }
        this.f88650t.setText(this.f88646r);
        I4.t.a(this.f88612a, this.f88656w);
        this.f88650t.setVisibility(0);
        this.f88650t.bringToFront();
        announceForAccessibility(this.f88646r);
    }

    private void f0() {
        if (this.f88603O == 1) {
            if (C16634c.i(getContext())) {
                this.f88604P = getResources().getDimensionPixelSize(ce.d.f61592M);
            } else if (C16634c.h(getContext())) {
                this.f88604P = getResources().getDimensionPixelSize(ce.d.f61591L);
            }
        }
    }

    private void g0(Rect rect) {
        C17234h c17234h = this.f88598J;
        if (c17234h != null) {
            int i10 = rect.bottom;
            c17234h.setBounds(rect.left, i10 - this.f88606R, rect.right, i10);
        }
        C17234h c17234h2 = this.f88599K;
        if (c17234h2 != null) {
            int i11 = rect.bottom;
            c17234h2.setBounds(rect.left, i11 - this.f88607S, rect.right, i11);
        }
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f88618d;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.f88594F;
        }
        int iD = C15121a.d(this.f88618d, C6503b.f61542l);
        int i10 = this.f88603O;
        if (i10 == 2) {
            return K(getContext(), this.f88594F, iD, f88586D0);
        }
        if (i10 == 1) {
            return H(this.f88594F, this.f88609U, iD, f88586D0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f88596H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f88596H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f88596H.addState(new int[0], G(false));
        }
        return this.f88596H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f88595G == null) {
            this.f88595G = G(true);
        }
        return this.f88595G;
    }

    private void h0() {
        if (this.f88640o != null) {
            EditText editText = this.f88618d;
            i0(editText == null ? null : editText.getText());
        }
    }

    private void j() {
        TextView textView = this.f88650t;
        if (textView != null) {
            this.f88612a.addView(textView);
            this.f88650t.setVisibility(0);
        }
    }

    private static void j0(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? ce.j.f61764c : ce.j.f61763b, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void k() {
        if (this.f88618d == null || this.f88603O != 1) {
            return;
        }
        if (C16634c.i(getContext())) {
            EditText editText = this.f88618d;
            ViewCompat.B0(editText, ViewCompat.E(editText), getResources().getDimensionPixelSize(ce.d.f61590K), ViewCompat.D(this.f88618d), getResources().getDimensionPixelSize(ce.d.f61589J));
        } else if (C16634c.h(getContext())) {
            EditText editText2 = this.f88618d;
            ViewCompat.B0(editText2, ViewCompat.E(editText2), getResources().getDimensionPixelSize(ce.d.f61588I), ViewCompat.D(this.f88618d), getResources().getDimensionPixelSize(ce.d.f61587H));
        }
    }

    private void k0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f88640o;
        if (textView != null) {
            a0(textView, this.f88636m ? this.f88642p : this.f88644q);
            if (!this.f88636m && (colorStateList2 = this.f88660y) != null) {
                this.f88640o.setTextColor(colorStateList2);
            }
            if (!this.f88636m || (colorStateList = this.f88662z) == null) {
                return;
            }
            this.f88640o.setTextColor(colorStateList);
        }
    }

    private void l0() {
        ColorStateList colorStateList;
        ColorStateList colorStateListG = this.f88587A;
        if (colorStateListG == null) {
            colorStateListG = C15121a.g(getContext(), C6503b.f61540k);
        }
        EditText editText = this.f88618d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = C13595a.r(this.f88618d.getTextCursorDrawable()).mutate();
        if (Q() && (colorStateList = this.f88589B) != null) {
            colorStateListG = colorStateList;
        }
        C13595a.o(drawableMutate, colorStateListG);
    }

    private void m() {
        C17234h c17234h = this.f88594F;
        if (c17234h == null) {
            return;
        }
        C17239m c17239mE = c17234h.E();
        C17239m c17239m = this.f88600L;
        if (c17239mE != c17239m) {
            this.f88594F.setShapeAppearanceModel(c17239m);
        }
        if (w()) {
            this.f88594F.i0(this.f88605Q, this.f88608T);
        }
        int iQ = q();
        this.f88609U = iQ;
        this.f88594F.b0(ColorStateList.valueOf(iQ));
        n();
        p0();
    }

    private void n() {
        if (this.f88598J == null || this.f88599K == null) {
            return;
        }
        if (x()) {
            this.f88598J.b0(this.f88618d.isFocused() ? ColorStateList.valueOf(this.f88633k0) : ColorStateList.valueOf(this.f88608T));
            this.f88599K.b0(ColorStateList.valueOf(this.f88608T));
        }
        invalidate();
    }

    private void o(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.f88602N;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private void p() {
        int i10 = this.f88603O;
        if (i10 == 0) {
            this.f88594F = null;
            this.f88598J = null;
            this.f88599K = null;
            return;
        }
        if (i10 == 1) {
            this.f88594F = new C17234h(this.f88600L);
            this.f88598J = new C17234h();
            this.f88599K = new C17234h();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(this.f88603O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f88591C || (this.f88594F instanceof com.google.android.material.textfield.h)) {
                this.f88594F = new C17234h(this.f88600L);
            } else {
                this.f88594F = com.google.android.material.textfield.h.r0(this.f88600L);
            }
            this.f88598J = null;
            this.f88599K = null;
        }
    }

    private int q() {
        return this.f88603O == 1 ? C15121a.i(C15121a.e(this, C6503b.f61556s, 0), this.f88609U) : this.f88609U;
    }

    private boolean q0() {
        int iMax;
        if (this.f88618d == null || this.f88618d.getMeasuredHeight() >= (iMax = Math.max(this.f88616c.getMeasuredHeight(), this.f88614b.getMeasuredHeight()))) {
            return false;
        }
        this.f88618d.setMinimumHeight(iMax);
        return true;
    }

    private Rect r(Rect rect) {
        if (this.f88618d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f88611W;
        boolean zK = com.google.android.material.internal.x.k(this);
        rect2.bottom = rect.bottom;
        int i10 = this.f88603O;
        if (i10 == 1) {
            rect2.left = I(rect.left, zK);
            rect2.top = rect.top + this.f88604P;
            rect2.right = J(rect.right, zK);
            return rect2;
        }
        if (i10 != 2) {
            rect2.left = I(rect.left, zK);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, zK);
            return rect2;
        }
        rect2.left = rect.left + this.f88618d.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f88618d.getPaddingRight();
        return rect2;
    }

    private void r0() {
        if (this.f88603O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f88612a.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f88612a.requestLayout();
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f88618d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            FS.log_i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f88618d = editText;
        int i10 = this.f88622f;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f88626h);
        }
        int i11 = this.f88624g;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f88628i);
        }
        this.f88597I = false;
        T();
        setTextInputAccessibilityDelegate(new d(this));
        this.f88655v0.N0(this.f88618d.getTypeface());
        this.f88655v0.v0(this.f88618d.getTextSize());
        int i12 = Build.VERSION.SDK_INT;
        this.f88655v0.q0(this.f88618d.getLetterSpacing());
        int gravity = this.f88618d.getGravity();
        this.f88655v0.j0((gravity & (-113)) | 48);
        this.f88655v0.u0(gravity);
        this.f88651t0 = ViewCompat.A(editText);
        this.f88618d.addTextChangedListener(new a(editText));
        if (this.f88629i0 == null) {
            this.f88629i0 = this.f88618d.getHintTextColors();
        }
        if (this.f88591C) {
            if (TextUtils.isEmpty(this.f88592D)) {
                CharSequence hint = this.f88618d.getHint();
                this.f88620e = hint;
                setHint(hint);
                this.f88618d.setHint((CharSequence) null);
            }
            this.f88593E = true;
        }
        if (i12 >= 29) {
            l0();
        }
        if (this.f88640o != null) {
            i0(this.f88618d.getText());
        }
        n0();
        this.f88630j.f();
        this.f88614b.bringToFront();
        this.f88616c.bringToFront();
        C();
        this.f88616c.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        t0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f88592D)) {
            return;
        }
        this.f88592D = charSequence;
        this.f88655v0.K0(charSequence);
        if (this.f88653u0) {
            return;
        }
        U();
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f88648s == z10) {
            return;
        }
        if (z10) {
            j();
        } else {
            Y();
            this.f88650t = null;
        }
        this.f88648s = z10;
    }

    private Rect u(Rect rect) {
        if (this.f88618d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f88611W;
        float fC = this.f88655v0.C();
        rect2.left = rect.left + this.f88618d.getCompoundPaddingLeft();
        rect2.top = t(rect, fC);
        rect2.right = rect.right - this.f88618d.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fC);
        return rect2;
    }

    private void u0() {
        EditText editText;
        if (this.f88650t == null || (editText = this.f88618d) == null) {
            return;
        }
        this.f88650t.setGravity(editText.getGravity());
        this.f88650t.setPadding(this.f88618d.getCompoundPaddingLeft(), this.f88618d.getCompoundPaddingTop(), this.f88618d.getCompoundPaddingRight(), this.f88618d.getCompoundPaddingBottom());
    }

    private int v() {
        float fR;
        if (!this.f88591C) {
            return 0;
        }
        int i10 = this.f88603O;
        if (i10 == 0) {
            fR = this.f88655v0.r();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fR = this.f88655v0.r() / 2.0f;
        }
        return (int) fR;
    }

    private void v0() {
        EditText editText = this.f88618d;
        w0(editText == null ? null : editText.getText());
    }

    private boolean w() {
        return this.f88603O == 2 && x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(Editable editable) {
        if (this.f88638n.a(editable) != 0 || this.f88653u0) {
            L();
        } else {
            e0();
        }
    }

    private boolean x() {
        return this.f88605Q > -1 && this.f88608T != 0;
    }

    private void x0(boolean z10, boolean z11) {
        int defaultColor = this.f88639n0.getDefaultColor();
        int colorForState = this.f88639n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f88639n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f88608T = colorForState2;
        } else if (z11) {
            this.f88608T = colorForState;
        } else {
            this.f88608T = defaultColor;
        }
    }

    private void z(boolean z10) {
        ValueAnimator valueAnimator = this.f88661y0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f88661y0.cancel();
        }
        if (z10 && this.f88659x0) {
            l(1.0f);
        } else {
            this.f88655v0.y0(1.0f);
        }
        this.f88653u0 = false;
        if (B()) {
            U();
        }
        v0();
        this.f88614b.l(false);
        this.f88616c.H(false);
    }

    public boolean M() {
        return this.f88616c.F();
    }

    public boolean N() {
        return this.f88630j.A();
    }

    public boolean O() {
        return this.f88630j.B();
    }

    final boolean P() {
        return this.f88653u0;
    }

    public boolean R() {
        return this.f88593E;
    }

    public void X() {
        this.f88614b.m();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f88612a.addView(view, layoutParams2);
        this.f88612a.setLayoutParams(layoutParams);
        r0();
        setEditText((EditText) view);
    }

    boolean b0() {
        return this.f88630j.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f88618d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f88620e != null) {
            boolean z10 = this.f88593E;
            this.f88593E = false;
            CharSequence hint = editText.getHint();
            this.f88618d.setHint(this.f88620e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f88618d.setHint(hint);
                this.f88593E = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.f88612a.getChildCount());
        for (int i11 = 0; i11 < this.f88612a.getChildCount(); i11++) {
            View childAt = this.f88612a.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f88618d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f88663z0) {
            return;
        }
        this.f88663z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.f88655v0;
        boolean zI0 = bVar != null ? bVar.I0(drawableState) : false;
        if (this.f88618d != null) {
            s0(ViewCompat.S(this) && isEnabled());
        }
        n0();
        y0();
        if (zI0) {
            invalidate();
        }
        this.f88663z0 = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f88618d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    C17234h getBoxBackground() {
        int i10 = this.f88603O;
        if (i10 == 1 || i10 == 2) {
            return this.f88594F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f88609U;
    }

    public int getBoxBackgroundMode() {
        return this.f88603O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f88604P;
    }

    public int getBoxStrokeColor() {
        return this.f88637m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f88639n0;
    }

    public int getBoxStrokeWidth() {
        return this.f88606R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f88607S;
    }

    public int getCounterMaxLength() {
        return this.f88634l;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f88632k && this.f88636m && (textView = this.f88640o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f88662z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f88660y;
    }

    public ColorStateList getCursorColor() {
        return this.f88587A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f88589B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f88629i0;
    }

    public EditText getEditText() {
        return this.f88618d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f88616c.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f88616c.n();
    }

    public int getEndIconMinSize() {
        return this.f88616c.o();
    }

    public int getEndIconMode() {
        return this.f88616c.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f88616c.q();
    }

    CheckableImageButton getEndIconView() {
        return this.f88616c.r();
    }

    public CharSequence getError() {
        if (this.f88630j.A()) {
            return this.f88630j.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f88630j.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f88630j.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f88630j.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f88616c.s();
    }

    public CharSequence getHelperText() {
        if (this.f88630j.B()) {
            return this.f88630j.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f88630j.u();
    }

    public CharSequence getHint() {
        if (this.f88591C) {
            return this.f88592D;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f88655v0.r();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f88655v0.w();
    }

    public ColorStateList getHintTextColor() {
        return this.f88631j0;
    }

    public e getLengthCounter() {
        return this.f88638n;
    }

    public int getMaxEms() {
        return this.f88624g;
    }

    public int getMaxWidth() {
        return this.f88628i;
    }

    public int getMinEms() {
        return this.f88622f;
    }

    public int getMinWidth() {
        return this.f88626h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f88616c.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f88616c.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f88648s) {
            return this.f88646r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f88654v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f88652u;
    }

    public CharSequence getPrefixText() {
        return this.f88614b.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f88614b.b();
    }

    public TextView getPrefixTextView() {
        return this.f88614b.d();
    }

    public C17239m getShapeAppearanceModel() {
        return this.f88600L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f88614b.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f88614b.f();
    }

    public int getStartIconMinSize() {
        return this.f88614b.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f88614b.h();
    }

    public CharSequence getSuffixText() {
        return this.f88616c.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f88616c.x();
    }

    public TextView getSuffixTextView() {
        return this.f88616c.z();
    }

    public Typeface getTypeface() {
        return this.f88615b0;
    }

    public void i(f fVar) {
        this.f88621e0.add(fVar);
        if (this.f88618d != null) {
            fVar.a(this);
        }
    }

    void i0(Editable editable) {
        int iA = this.f88638n.a(editable);
        boolean z10 = this.f88636m;
        int i10 = this.f88634l;
        if (i10 == -1) {
            this.f88640o.setText(String.valueOf(iA));
            this.f88640o.setContentDescription(null);
            this.f88636m = false;
        } else {
            this.f88636m = iA > i10;
            j0(getContext(), this.f88640o, iA, this.f88634l, this.f88636m);
            if (z10 != this.f88636m) {
                k0();
            }
            this.f88640o.setText(C15655a.c().j(getContext().getString(ce.j.f61765d, Integer.valueOf(iA), Integer.valueOf(this.f88634l))));
        }
        if (this.f88618d == null || z10 == this.f88636m) {
            return;
        }
        s0(false);
        y0();
        n0();
    }

    void l(float f10) {
        if (this.f88655v0.F() == f10) {
            return;
        }
        if (this.f88661y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f88661y0 = valueAnimator;
            valueAnimator.setInterpolator(pe.i.g(getContext(), C6503b.f61512S, C13661a.f128351b));
            this.f88661y0.setDuration(pe.i.f(getContext(), C6503b.f61505L, 167));
            this.f88661y0.addUpdateListener(new c());
        }
        this.f88661y0.setFloatValues(this.f88655v0.F(), f10);
        this.f88661y0.start();
    }

    boolean m0() {
        boolean z10;
        if (this.f88618d == null) {
            return false;
        }
        boolean z11 = true;
        if (d0()) {
            int measuredWidth = this.f88614b.getMeasuredWidth() - this.f88618d.getPaddingLeft();
            if (this.f88617c0 == null || this.f88619d0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f88617c0 = colorDrawable;
                this.f88619d0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = androidx.core.widget.k.a(this.f88618d);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.f88617c0;
            if (drawable != drawable2) {
                androidx.core.widget.k.j(this.f88618d, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z10 = true;
            }
            z10 = false;
        } else {
            if (this.f88617c0 != null) {
                Drawable[] drawableArrA2 = androidx.core.widget.k.a(this.f88618d);
                androidx.core.widget.k.j(this.f88618d, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.f88617c0 = null;
                z10 = true;
            }
            z10 = false;
        }
        if (c0()) {
            int measuredWidth2 = this.f88616c.z().getMeasuredWidth() - this.f88618d.getPaddingRight();
            CheckableImageButton checkableImageButtonK = this.f88616c.k();
            if (checkableImageButtonK != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButtonK.getMeasuredWidth() + C16381t.b((ViewGroup.MarginLayoutParams) checkableImageButtonK.getLayoutParams());
            }
            Drawable[] drawableArrA3 = androidx.core.widget.k.a(this.f88618d);
            Drawable drawable3 = this.f88623f0;
            if (drawable3 != null && this.f88625g0 != measuredWidth2) {
                this.f88625g0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.k.j(this.f88618d, drawableArrA3[0], drawableArrA3[1], this.f88623f0, drawableArrA3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f88623f0 = colorDrawable2;
                this.f88625g0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = drawableArrA3[2];
            Drawable drawable5 = this.f88623f0;
            if (drawable4 != drawable5) {
                this.f88627h0 = drawable4;
                androidx.core.widget.k.j(this.f88618d, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                return true;
            }
        } else if (this.f88623f0 != null) {
            Drawable[] drawableArrA4 = androidx.core.widget.k.a(this.f88618d);
            if (drawableArrA4[2] == this.f88623f0) {
                androidx.core.widget.k.j(this.f88618d, drawableArrA4[0], drawableArrA4[1], this.f88627h0, drawableArrA4[3]);
            } else {
                z11 = z10;
            }
            this.f88623f0 = null;
            return z11;
        }
        return z10;
    }

    void n0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f88618d;
        if (editText == null || this.f88603O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C5790y.a(background)) {
            background = background.mutate();
        }
        if (b0()) {
            background.setColorFilter(C5771e.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f88636m && (textView = this.f88640o) != null) {
            background.setColorFilter(C5771e.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C13595a.c(background);
            this.f88618d.refreshDrawableState();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f88616c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f88590B0 = false;
        boolean zQ0 = q0();
        boolean zM0 = m0();
        if (zQ0 || zM0) {
            this.f88618d.post(new Runnable() { // from class: com.google.android.material.textfield.D
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88530a.f88618d.requestLayout();
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
        setError(hVar.f88670c);
        if (hVar.f88671d) {
            post(new b());
        }
        requestLayout();
    }

    void p0() {
        EditText editText = this.f88618d;
        if (editText == null || this.f88594F == null) {
            return;
        }
        if ((this.f88597I || editText.getBackground() == null) && this.f88603O != 0) {
            o0();
            this.f88597I = true;
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f88609U != i10) {
            this.f88609U = i10;
            this.f88641o0 = i10;
            this.f88645q0 = i10;
            this.f88647r0 = i10;
            m();
        }
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f88603O) {
            return;
        }
        this.f88603O = i10;
        if (this.f88618d != null) {
            T();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f88604P = i10;
    }

    public void setBoxCornerFamily(int i10) {
        this.f88600L = this.f88600L.v().B(i10, this.f88600L.r()).F(i10, this.f88600L.t()).t(i10, this.f88600L.j()).x(i10, this.f88600L.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f88637m0 != i10) {
            this.f88637m0 = i10;
            y0();
        }
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f88639n0 != colorStateList) {
            this.f88639n0 = colorStateList;
            y0();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f88606R = i10;
        y0();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f88607S = i10;
        y0();
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f88632k != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f88640o = appCompatTextView;
                appCompatTextView.setId(ce.f.f61688S);
                Typeface typeface = this.f88615b0;
                if (typeface != null) {
                    this.f88640o.setTypeface(typeface);
                }
                this.f88640o.setMaxLines(1);
                this.f88630j.e(this.f88640o, 2);
                C16381t.d((ViewGroup.MarginLayoutParams) this.f88640o.getLayoutParams(), getResources().getDimensionPixelOffset(ce.d.f61581C0));
                k0();
                h0();
            } else {
                this.f88630j.C(this.f88640o, 2);
                this.f88640o = null;
            }
            this.f88632k = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f88634l != i10) {
            if (i10 > 0) {
                this.f88634l = i10;
            } else {
                this.f88634l = -1;
            }
            if (this.f88632k) {
                h0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f88642p != i10) {
            this.f88642p = i10;
            k0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f88662z != colorStateList) {
            this.f88662z = colorStateList;
            k0();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f88644q != i10) {
            this.f88644q = i10;
            k0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f88660y != colorStateList) {
            this.f88660y = colorStateList;
            k0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f88587A != colorStateList) {
            this.f88587A = colorStateList;
            l0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f88589B != colorStateList) {
            this.f88589B = colorStateList;
            if (Q()) {
                l0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f88629i0 = colorStateList;
        this.f88631j0 = colorStateList;
        if (this.f88618d != null) {
            s0(false);
        }
    }

    public void setEndIconActivated(boolean z10) {
        this.f88616c.N(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f88616c.O(z10);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f88616c.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f88616c.S(drawable);
    }

    public void setEndIconMinSize(int i10) {
        this.f88616c.T(i10);
    }

    public void setEndIconMode(int i10) {
        this.f88616c.U(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f88616c.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f88616c.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f88616c.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f88616c.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f88616c.Z(mode);
    }

    public void setEndIconVisible(boolean z10) {
        this.f88616c.a0(z10);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f88630j.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f88630j.w();
        } else {
            this.f88630j.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        this.f88630j.E(i10);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f88630j.F(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.f88630j.G(z10);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f88616c.c0(drawable);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f88616c.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f88616c.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f88616c.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f88616c.g0(mode);
    }

    public void setErrorTextAppearance(int i10) {
        this.f88630j.H(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f88630j.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f88657w0 != z10) {
            this.f88657w0 = z10;
            s0(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f88630j.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.f88630j.K(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.f88630j.J(i10);
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f88659x0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f88591C) {
            this.f88591C = z10;
            if (z10) {
                CharSequence hint = this.f88618d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f88592D)) {
                        setHint(hint);
                    }
                    this.f88618d.setHint((CharSequence) null);
                }
                this.f88593E = true;
            } else {
                this.f88593E = false;
                if (!TextUtils.isEmpty(this.f88592D) && TextUtils.isEmpty(this.f88618d.getHint())) {
                    this.f88618d.setHint(this.f88592D);
                }
                setHintInternal(null);
            }
            if (this.f88618d != null) {
                r0();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.f88655v0.g0(i10);
        this.f88631j0 = this.f88655v0.p();
        if (this.f88618d != null) {
            s0(false);
            r0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f88631j0 != colorStateList) {
            if (this.f88629i0 == null) {
                this.f88655v0.i0(colorStateList);
            }
            this.f88631j0 = colorStateList;
            if (this.f88618d != null) {
                s0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f88638n = eVar;
    }

    public void setMaxEms(int i10) {
        this.f88624g = i10;
        EditText editText = this.f88618d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f88628i = i10;
        EditText editText = this.f88618d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMinEms(int i10) {
        this.f88622f = i10;
        EditText editText = this.f88618d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.f88626h = i10;
        EditText editText = this.f88618d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f88616c.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f88616c.l0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        this.f88616c.m0(z10);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f88616c.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f88616c.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f88650t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f88650t = appCompatTextView;
            appCompatTextView.setId(ce.f.f61691V);
            ViewCompat.w0(this.f88650t, 2);
            C3822c c3822cA = A();
            this.f88656w = c3822cA;
            c3822cA.n0(67L);
            this.f88658x = A();
            setPlaceholderTextAppearance(this.f88654v);
            setPlaceholderTextColor(this.f88652u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f88648s) {
                setPlaceholderTextEnabled(true);
            }
            this.f88646r = charSequence;
        }
        v0();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f88654v = i10;
        TextView textView = this.f88650t;
        if (textView != null) {
            androidx.core.widget.k.p(textView, i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f88652u != colorStateList) {
            this.f88652u = colorStateList;
            TextView textView = this.f88650t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f88614b.n(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.f88614b.o(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f88614b.p(colorStateList);
    }

    public void setShapeAppearanceModel(C17239m c17239m) {
        C17234h c17234h = this.f88594F;
        if (c17234h == null || c17234h.E() == c17239m) {
            return;
        }
        this.f88600L = c17239m;
        m();
    }

    public void setStartIconCheckable(boolean z10) {
        this.f88614b.q(z10);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f88614b.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f88614b.s(drawable);
    }

    public void setStartIconMinSize(int i10) {
        this.f88614b.t(i10);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f88614b.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f88614b.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f88614b.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f88614b.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f88614b.y(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.f88614b.z(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f88616c.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i10) {
        this.f88616c.q0(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f88616c.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f88618d;
        if (editText != null) {
            ViewCompat.m0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f88615b0) {
            this.f88615b0 = typeface;
            this.f88655v0.N0(typeface);
            this.f88630j.N(typeface);
            TextView textView = this.f88640o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void y0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f88594F == null || this.f88603O == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f88618d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f88618d) != null && editText.isHovered())) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f88608T = this.f88649s0;
        } else if (b0()) {
            if (this.f88639n0 != null) {
                x0(z11, z10);
            } else {
                this.f88608T = getErrorCurrentTextColors();
            }
        } else if (!this.f88636m || (textView = this.f88640o) == null) {
            if (z11) {
                this.f88608T = this.f88637m0;
            } else if (z10) {
                this.f88608T = this.f88635l0;
            } else {
                this.f88608T = this.f88633k0;
            }
        } else if (this.f88639n0 != null) {
            x0(z11, z10);
        } else {
            this.f88608T = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            l0();
        }
        this.f88616c.I();
        X();
        if (this.f88603O == 2) {
            int i10 = this.f88605Q;
            if (z11 && isEnabled()) {
                this.f88605Q = this.f88607S;
            } else {
                this.f88605Q = this.f88606R;
            }
            if (this.f88605Q != i10) {
                V();
            }
        }
        if (this.f88603O == 1) {
            if (!isEnabled()) {
                this.f88609U = this.f88643p0;
            } else if (z10 && !z11) {
                this.f88609U = this.f88647r0;
            } else if (z11) {
                this.f88609U = this.f88645q0;
            } else {
                this.f88609U = this.f88641o0;
            }
        }
        m();
    }

    private C17234h G(boolean z10) throws Resources.NotFoundException {
        float f10;
        float dimensionPixelOffset;
        ColorStateList dropDownBackgroundTintList;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(ce.d.f61637p0);
        if (z10) {
            f10 = dimensionPixelOffset2;
        } else {
            f10 = 0.0f;
        }
        EditText editText = this.f88618d;
        if (editText instanceof MaterialAutoCompleteTextView) {
            dimensionPixelOffset = ((MaterialAutoCompleteTextView) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(ce.d.f61654y);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(ce.d.f61633n0);
        C17239m c17239mM = C17239m.a().D(f10).H(f10).v(dimensionPixelOffset2).z(dimensionPixelOffset2).m();
        EditText editText2 = this.f88618d;
        if (editText2 instanceof MaterialAutoCompleteTextView) {
            dropDownBackgroundTintList = ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList();
        } else {
            dropDownBackgroundTintList = null;
        }
        C17234h c17234hM = C17234h.m(getContext(), dimensionPixelOffset, dropDownBackgroundTintList);
        c17234hM.setShapeAppearanceModel(c17239mM);
        c17234hM.d0(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        return c17234hM;
    }

    private static Drawable H(C17234h c17234h, int i10, int i11, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{C15121a.j(i11, i10, 0.1f), i10}), c17234h, c17234h);
    }

    private boolean Q() {
        if (!b0()) {
            if (this.f88640o == null || !this.f88636m) {
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
        if (this.f88603O != 0) {
            r0();
        }
        Z();
    }

    private void U() {
        if (B()) {
            RectF rectF = this.f88613a0;
            this.f88655v0.o(rectF, this.f88618d.getWidth(), this.f88618d.getGravity());
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                o(rectF);
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f88605Q);
                ((com.google.android.material.textfield.h) this.f88594F).v0(rectF);
            }
        }
    }

    private void V() {
        if (B() && !this.f88653u0) {
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
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f88614b.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    private void o0() {
        ViewCompat.q0(this.f88618d, getEditTextBoxBackground());
    }

    private int s(Rect rect, Rect rect2, float f10) {
        if (S()) {
            return (int) (rect2.top + f10);
        }
        return rect.bottom - this.f88618d.getCompoundPaddingBottom();
    }

    private int t(Rect rect, float f10) {
        if (S()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return rect.top + this.f88618d.getCompoundPaddingTop();
    }

    private void t0(boolean z10, boolean z11) {
        boolean z12;
        ColorStateList colorStateList;
        TextView textView;
        int colorForState;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f88618d;
        boolean z13 = false;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z12 = true;
        } else {
            z12 = false;
        }
        EditText editText2 = this.f88618d;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        }
        ColorStateList colorStateList2 = this.f88629i0;
        if (colorStateList2 != null) {
            this.f88655v0.d0(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f88629i0;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, this.f88649s0);
            } else {
                colorForState = this.f88649s0;
            }
            this.f88655v0.d0(ColorStateList.valueOf(colorForState));
        } else if (b0()) {
            this.f88655v0.d0(this.f88630j.r());
        } else if (this.f88636m && (textView = this.f88640o) != null) {
            this.f88655v0.d0(textView.getTextColors());
        } else if (z13 && (colorStateList = this.f88631j0) != null) {
            this.f88655v0.i0(colorStateList);
        }
        if (!z12 && this.f88657w0 && (!isEnabled() || !z13)) {
            if (z11 || !this.f88653u0) {
                F(z10);
                return;
            }
            return;
        }
        if (!z11 && !this.f88653u0) {
            return;
        }
        z(z10);
    }

    private void y() {
        if (B()) {
            ((com.google.android.material.textfield.h) this.f88594F).t0();
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
        androidx.core.widget.k.p(textView, ce.k.f61803d);
        textView.setTextColor(Z1.b.c(getContext(), ce.c.f61565a));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        fsSuperDraw_e02d38f646047fbea4837028cd2251d2(canvas);
        E(canvas);
        D(canvas);
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (com.google.android.material.internal.x.k(this)) {
            return this.f88600L.j().a(this.f88613a0);
        }
        return this.f88600L.l().a(this.f88613a0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (com.google.android.material.internal.x.k(this)) {
            return this.f88600L.l().a(this.f88613a0);
        }
        return this.f88600L.j().a(this.f88613a0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (com.google.android.material.internal.x.k(this)) {
            return this.f88600L.r().a(this.f88613a0);
        }
        return this.f88600L.t().a(this.f88613a0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (com.google.android.material.internal.x.k(this)) {
            return this.f88600L.t().a(this.f88613a0);
        }
        return this.f88600L.r().a(this.f88613a0);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f88655v0.Y(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f88618d;
        if (editText != null) {
            Rect rect = this.f88610V;
            com.google.android.material.internal.d.a(this, editText, rect);
            g0(rect);
            if (this.f88591C) {
                this.f88655v0.v0(this.f88618d.getTextSize());
                int gravity = this.f88618d.getGravity();
                this.f88655v0.j0((gravity & (-113)) | 48);
                this.f88655v0.u0(gravity);
                this.f88655v0.f0(r(rect));
                this.f88655v0.p0(u(rect));
                this.f88655v0.a0();
                if (B() && !this.f88653u0) {
                    U();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f88590B0) {
            this.f88616c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f88590B0 = true;
        }
        u0();
        this.f88616c.x0();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != this.f88601M) {
            float fA = this.f88600L.r().a(this.f88613a0);
            float fA2 = this.f88600L.t().a(this.f88613a0);
            float fA3 = this.f88600L.j().a(this.f88613a0);
            float fA4 = this.f88600L.l().a(this.f88613a0);
            C17230d c17230dQ = this.f88600L.q();
            C17230d c17230dS = this.f88600L.s();
            C17239m c17239mM = C17239m.a().C(c17230dS).G(c17230dQ).u(this.f88600L.k()).y(this.f88600L.i()).D(fA2).H(fA).v(fA4).z(fA3).m();
            this.f88601M = z10;
            setShapeAppearanceModel(c17239mM);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (b0()) {
            hVar.f88670c = getError();
        }
        hVar.f88671d = this.f88616c.E();
        return hVar;
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(Z1.b.c(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f88641o0 = defaultColor;
        this.f88609U = defaultColor;
        this.f88643p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f88645q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f88647r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f88633k0 = colorStateList.getDefaultColor();
            this.f88649s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f88635l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f88637m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f88637m0 != colorStateList.getDefaultColor()) {
            this.f88637m0 = colorStateList.getDefaultColor();
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
            this.f88630j.R(charSequence);
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
