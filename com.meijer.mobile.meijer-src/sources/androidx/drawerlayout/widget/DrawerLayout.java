package androidx.drawerlayout.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.P;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import d2.C13595a;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p2.G;
import p2.r;
import q2.InterfaceC16593B;
import q2.y;
import w2.AbstractC17821a;
import x2.C18060c;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements FSDispatchDraw {

    /* renamed from: N, reason: collision with root package name */
    private static final int[] f54725N = {R.attr.colorPrimaryDark};

    /* renamed from: O, reason: collision with root package name */
    static final int[] f54726O = {R.attr.layout_gravity};

    /* renamed from: P, reason: collision with root package name */
    static final boolean f54727P;

    /* renamed from: Q, reason: collision with root package name */
    private static final boolean f54728Q;

    /* renamed from: R, reason: collision with root package name */
    private static final boolean f54729R;

    /* renamed from: A, reason: collision with root package name */
    private Drawable f54730A;

    /* renamed from: B, reason: collision with root package name */
    private CharSequence f54731B;

    /* renamed from: C, reason: collision with root package name */
    private CharSequence f54732C;

    /* renamed from: D, reason: collision with root package name */
    private j f54733D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f54734E;

    /* renamed from: F, reason: collision with root package name */
    private Drawable f54735F;

    /* renamed from: G, reason: collision with root package name */
    private Drawable f54736G;

    /* renamed from: H, reason: collision with root package name */
    private Drawable f54737H;

    /* renamed from: I, reason: collision with root package name */
    private Drawable f54738I;

    /* renamed from: J, reason: collision with root package name */
    private final ArrayList<View> f54739J;

    /* renamed from: K, reason: collision with root package name */
    private Rect f54740K;

    /* renamed from: L, reason: collision with root package name */
    private Matrix f54741L;

    /* renamed from: M, reason: collision with root package name */
    private final InterfaceC16593B f54742M;

    /* renamed from: a, reason: collision with root package name */
    private final c f54743a;

    /* renamed from: b, reason: collision with root package name */
    private float f54744b;

    /* renamed from: c, reason: collision with root package name */
    private final int f54745c;

    /* renamed from: d, reason: collision with root package name */
    private int f54746d;

    /* renamed from: e, reason: collision with root package name */
    private float f54747e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f54748f;

    /* renamed from: g, reason: collision with root package name */
    private final C18060c f54749g;

    /* renamed from: h, reason: collision with root package name */
    private final C18060c f54750h;

    /* renamed from: i, reason: collision with root package name */
    private final h f54751i;

    /* renamed from: j, reason: collision with root package name */
    private final h f54752j;

    /* renamed from: k, reason: collision with root package name */
    private int f54753k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f54754l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f54755m;

    /* renamed from: n, reason: collision with root package name */
    private OnBackInvokedCallback f54756n;

    /* renamed from: o, reason: collision with root package name */
    private OnBackInvokedDispatcher f54757o;

    /* renamed from: p, reason: collision with root package name */
    private int f54758p;

    /* renamed from: q, reason: collision with root package name */
    private int f54759q;

    /* renamed from: r, reason: collision with root package name */
    private int f54760r;

    /* renamed from: s, reason: collision with root package name */
    private int f54761s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f54762t;

    /* renamed from: u, reason: collision with root package name */
    private d f54763u;

    /* renamed from: v, reason: collision with root package name */
    private List<d> f54764v;

    /* renamed from: w, reason: collision with root package name */
    private float f54765w;

    /* renamed from: x, reason: collision with root package name */
    private float f54766x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f54767y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f54768z;

    class a extends androidx.core.view.a {

        /* renamed from: d, reason: collision with root package name */
        private final Rect f54769d = new Rect();

        a() {
        }

        private void o(y yVar, y yVar2) {
            Rect rect = this.f54769d;
            yVar2.n(rect);
            yVar.m0(rect);
            yVar.e1(yVar2.a0());
            yVar.J0(yVar2.z());
            yVar.p0(yVar2.q());
            yVar.t0(yVar2.t());
            yVar.x0(yVar2.O());
            yVar.A0(yVar2.R());
            yVar.i0(yVar2.J());
            yVar.S0(yVar2.X());
            yVar.a(yVar2.k());
        }

        @Override // androidx.core.view.a
        public void g(View view, y yVar) {
            if (DrawerLayout.f54727P) {
                super.g(view, yVar);
            } else {
                y yVarD0 = y.d0(yVar);
                super.g(view, yVarD0);
                yVar.U0(view);
                Object objF = ViewCompat.F(view);
                if (objF instanceof View) {
                    yVar.L0((View) objF);
                }
                o(yVar, yVarD0);
                yVarD0.f0();
                n(yVar, (ViewGroup) view);
            }
            yVar.p0("androidx.drawerlayout.widget.DrawerLayout");
            yVar.z0(false);
            yVar.A0(false);
            yVar.g0(y.a.f157837e);
            yVar.g0(y.a.f157838f);
        }

        @Override // androidx.core.view.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.f54727P || DrawerLayout.C(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        private void n(y yVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.C(childAt)) {
                    yVar.c(childAt);
                }
            }
        }

        @Override // androidx.core.view.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View viewR = DrawerLayout.this.r();
                if (viewR != null) {
                    CharSequence charSequenceU = DrawerLayout.this.u(DrawerLayout.this.v(viewR));
                    if (charSequenceU != null) {
                        text.add(charSequenceU);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }
    }

    static class b {
        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }

        static OnBackInvokedDispatcher a(DrawerLayout drawerLayout) {
            return drawerLayout.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new P(runnable);
        }
    }

    public interface d {
        void a(View view);

        void b(View view);

        void c(int i10);

        void d(View view, float f10);
    }

    public static abstract class g implements d {
        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void c(int i10) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        public void d(View view, float f10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h extends C18060c.d {

        /* renamed from: a, reason: collision with root package name */
        private final int f54780a;

        /* renamed from: b, reason: collision with root package name */
        private C18060c f54781b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f54782c = new Runnable() { // from class: androidx.drawerlayout.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f54786a.o();
            }
        };

        @Override // x2.C18060c.d
        public void f(int i10, int i11) {
            View viewP = (i10 & 1) == 1 ? DrawerLayout.this.p(3) : DrawerLayout.this.p(5);
            if (viewP == null || DrawerLayout.this.t(viewP) != 0) {
                return;
            }
            this.f54781b.c(viewP, i11);
        }

        @Override // x2.C18060c.d
        public boolean g(int i10) {
            return false;
        }

        h(int i10) {
            this.f54780a = i10;
        }

        private void n() {
            View viewP = DrawerLayout.this.p(this.f54780a == 3 ? 5 : 3);
            if (viewP != null) {
                DrawerLayout.this.h(viewP);
            }
        }

        @Override // x2.C18060c.d
        public int a(View view, int i10, int i11) {
            if (DrawerLayout.this.e(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // x2.C18060c.d
        public int d(View view) {
            if (DrawerLayout.this.G(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // x2.C18060c.d
        public void h(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f54782c, 160L);
        }

        @Override // x2.C18060c.d
        public void j(int i10) {
            DrawerLayout.this.a0(i10, this.f54781b.w());
        }

        @Override // x2.C18060c.d
        public void l(View view, float f10, float f11) {
            int i10;
            float fW = DrawerLayout.this.w(view);
            int width = view.getWidth();
            if (DrawerLayout.this.e(view, 3)) {
                i10 = (f10 > 0.0f || (f10 == 0.0f && fW > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && fW > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f54781b.Q(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // x2.C18060c.d
        public boolean m(View view, int i10) {
            return DrawerLayout.this.G(view) && DrawerLayout.this.e(view, this.f54780a) && DrawerLayout.this.t(view) == 0;
        }

        void o() {
            View viewP;
            int width;
            int iY = this.f54781b.y();
            boolean z10 = this.f54780a == 3;
            if (z10) {
                viewP = DrawerLayout.this.p(3);
                width = (viewP != null ? -viewP.getWidth() : 0) + iY;
            } else {
                viewP = DrawerLayout.this.p(5);
                width = DrawerLayout.this.getWidth() - iY;
            }
            if (viewP != null) {
                if (((!z10 || viewP.getLeft() >= width) && (z10 || viewP.getLeft() <= width)) || DrawerLayout.this.t(viewP) != 0) {
                    return;
                }
                e eVar = (e) viewP.getLayoutParams();
                this.f54781b.S(viewP, width, viewP.getTop());
                eVar.f54773c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.d();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f54782c);
        }

        public void q(C18060c c18060c) {
            this.f54781b = c18060c;
        }

        @Override // x2.C18060c.d
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // x2.C18060c.d
        public void i(View view, int i10) {
            ((e) view.getLayoutParams()).f54773c = false;
            n();
        }

        @Override // x2.C18060c.d
        public void k(View view, int i10, int i11, int i12, int i13) {
            float width;
            int i14;
            int width2 = view.getWidth();
            if (DrawerLayout.this.e(view, 3)) {
                width = i10 + width2;
            } else {
                width = DrawerLayout.this.getWidth() - i10;
            }
            float f10 = width / width2;
            DrawerLayout.this.W(view, f10);
            if (f10 == 0.0f) {
                i14 = 4;
            } else {
                i14 = 0;
            }
            view.setVisibility(i14);
            DrawerLayout.this.invalidate();
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, G2.a.f11176a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    public void M(int i10) {
        N(i10, true);
    }

    public void O(View view) {
        P(view, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        fsSuperDispatchDraw_c13e2a28b18b31a4d162bb1cddaa459b(canvas);
    }

    public void f(int i10) {
        g(i10, true);
    }

    public void fsSuperDispatchDraw_c13e2a28b18b31a4d162bb1cddaa459b(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_c13e2a28b18b31a4d162bb1cddaa459b(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public void h(View view) {
        i(view, true);
    }

    public void j() {
        k(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !B()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewR = r();
        if (viewR != null && t(viewR) == 0) {
            j();
        }
        return viewR != null;
    }

    public void setDrawerLockMode(int i10) {
        V(i10, 3);
        V(i10, 5);
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f54767y = drawable;
        invalidate();
    }

    static final class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, y yVar) {
            super.g(view, yVar);
            if (!DrawerLayout.C(view)) {
                yVar.L0(null);
            }
        }
    }

    protected static class f extends AbstractC17821a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        int f54775c;

        /* renamed from: d, reason: collision with root package name */
        int f54776d;

        /* renamed from: e, reason: collision with root package name */
        int f54777e;

        /* renamed from: f, reason: collision with root package name */
        int f54778f;

        /* renamed from: g, reason: collision with root package name */
        int f54779g;

        class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }

            a() {
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f54775c = 0;
            this.f54775c = parcel.readInt();
            this.f54776d = parcel.readInt();
            this.f54777e = parcel.readInt();
            this.f54778f = parcel.readInt();
            this.f54779g = parcel.readInt();
        }

        @Override // w2.AbstractC17821a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f54775c);
            parcel.writeInt(this.f54776d);
            parcel.writeInt(this.f54777e);
            parcel.writeInt(this.f54778f);
            parcel.writeInt(this.f54779g);
        }

        public f(Parcelable parcelable) {
            super(parcelable);
            this.f54775c = 0;
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f54743a = new c();
        this.f54746d = -1728053248;
        this.f54748f = new Paint();
        this.f54755m = true;
        this.f54758p = 3;
        this.f54759q = 3;
        this.f54760r = 3;
        this.f54761s = 3;
        this.f54735F = null;
        this.f54736G = null;
        this.f54737H = null;
        this.f54738I = null;
        this.f54742M = new InterfaceC16593B() { // from class: androidx.drawerlayout.widget.b
            @Override // q2.InterfaceC16593B
            public final boolean a(View view, InterfaceC16593B.a aVar) {
                return DrawerLayout.b(this.f54785a, view, aVar);
            }
        };
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f54745c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        h hVar = new h(3);
        this.f54751i = hVar;
        h hVar2 = new h(5);
        this.f54752j = hVar2;
        C18060c c18060cO = C18060c.o(this, 1.0f, hVar);
        this.f54749g = c18060cO;
        c18060cO.O(1);
        c18060cO.P(f11);
        hVar.q(c18060cO);
        C18060c c18060cO2 = C18060c.o(this, 1.0f, hVar2);
        this.f54750h = c18060cO2;
        c18060cO2.O(2);
        c18060cO2.P(f11);
        hVar2.q(c18060cO2);
        setFocusableInTouchMode(true);
        ViewCompat.w0(this, 1);
        ViewCompat.m0(this, new a());
        setMotionEventSplittingEnabled(false);
        if (ViewCompat.w(this)) {
            ViewCompat.A0(this, new G() { // from class: androidx.drawerlayout.widget.c
                @Override // p2.G
                public final j onApplyWindowInsets(View view, j jVar) {
                    return DrawerLayout.a(view, jVar);
                }
            });
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f54725N);
            try {
                this.f54767y = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, G2.c.f11178a, i10, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(G2.c.f11179b)) {
                this.f54744b = typedArrayObtainStyledAttributes2.getDimension(G2.c.f11179b, 0.0f);
            } else {
                this.f54744b = getResources().getDimension(G2.b.f11177a);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f54739J = new ArrayList<>();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    private boolean J(float f10, float f11, View view) {
        if (this.f54740K == null) {
            this.f54740K = new Rect();
        }
        view.getHitRect(this.f54740K);
        return this.f54740K.contains((int) f10, (int) f11);
    }

    private void K(Drawable drawable, int i10) {
        if (drawable == null || !C13595a.h(drawable)) {
            return;
        }
        C13595a.m(drawable, i10);
    }

    private void T() {
        if (f54728Q) {
            return;
        }
        this.f54768z = R();
        this.f54730A = S();
    }

    private void Y(View view) {
        y.a aVar = y.a.f157857y;
        ViewCompat.g0(view, aVar.b());
        if (!F(view) || t(view) == 2) {
            return;
        }
        ViewCompat.i0(view, aVar, null, this.f54742M);
    }

    public static /* synthetic */ j a(View view, j jVar) {
        ((DrawerLayout) view).U(jVar, jVar.n().f61162b > 0);
        return jVar.c();
    }

    static String y(int i10) {
        return (i10 & 3) == 3 ? "LEFT" : (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    public void Q(d dVar) {
        List<d> list = this.f54764v;
        if (list == null) {
            return;
        }
        list.remove(dVar);
    }

    public void U(j jVar, boolean z10) {
        this.f54733D = jVar;
        this.f54734E = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    void X() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            View viewR = r();
            OnBackInvokedDispatcher onBackInvokedDispatcherA = b.a(this);
            boolean z10 = viewR != null && onBackInvokedDispatcherA != null && t(viewR) == 0 && ViewCompat.R(this);
            if (z10 && this.f54757o == null) {
                if (this.f54756n == null) {
                    this.f54756n = b.b(new Runnable() { // from class: androidx.drawerlayout.widget.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f54784a.j();
                        }
                    });
                }
                b.c(onBackInvokedDispatcherA, this.f54756n);
                this.f54757o = onBackInvokedDispatcherA;
                return;
            }
            if (z10 || (onBackInvokedDispatcher = this.f54757o) == null) {
                return;
            }
            b.d(onBackInvokedDispatcher, this.f54756n);
            this.f54757o = null;
        }
    }

    void a0(int i10, View view) {
        int i11;
        int iB = this.f54749g.B();
        int iB2 = this.f54750h.B();
        if (iB == 1 || iB2 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (iB != 2 && iB2 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((e) view.getLayoutParams()).f54772b;
            if (f10 == 0.0f) {
                l(view);
            } else if (f10 == 1.0f) {
                m(view);
            }
        }
        if (i11 != this.f54753k) {
            this.f54753k = i11;
            List<d> list = this.f54764v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f54764v.get(size).c(i11);
                }
            }
        }
    }

    public void c(d dVar) {
        if (this.f54764v == null) {
            this.f54764v = new ArrayList();
        }
        this.f54764v.add(dVar);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    void d() {
        if (this.f54762t) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f54762t = true;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public float getDrawerElevation() {
        if (f54728Q) {
            return this.f54744b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f54767y;
    }

    void n(View view, float f10) {
        List<d> list = this.f54764v;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f54764v.get(size).d(view, f10);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        j jVarG;
        float f10;
        int i14;
        boolean z11 = true;
        this.f54754l = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (D(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) eVar).topMargin, childAt.getMeasuredWidth() + i17, ((ViewGroup.MarginLayoutParams) eVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (e(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (eVar.f54772b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        f10 = (i15 - r11) / f12;
                        i14 = i15 - ((int) (eVar.f54772b * f12));
                    }
                    boolean z12 = f10 != eVar.f54772b ? z11 : false;
                    int i18 = eVar.f54771a & 112;
                    if (i18 == 16) {
                        int i19 = i13 - i11;
                        int i20 = (i19 - measuredHeight) / 2;
                        int i21 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        if (i20 < i21) {
                            i20 = i21;
                        } else {
                            int i22 = i20 + measuredHeight;
                            int i23 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                            if (i22 > i19 - i23) {
                                i20 = (i19 - i23) - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i20, measuredWidth + i14, measuredHeight + i20);
                    } else if (i18 != 80) {
                        int i24 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                        childAt.layout(i14, i24, measuredWidth + i14, measuredHeight + i24);
                    } else {
                        int i25 = i13 - i11;
                        childAt.layout(i14, (i25 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i25 - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
                    }
                    if (z12) {
                        W(childAt, f10);
                    }
                    int i26 = eVar.f54772b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i26) {
                        childAt.setVisibility(i26);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (f54729R && (jVarG = ViewCompat.G(this)) != null) {
            c2.d dVarI = jVarG.i();
            C18060c c18060c = this.f54749g;
            c18060c.N(Math.max(c18060c.x(), dVarI.f61161a));
            C18060c c18060c2 = this.f54750h;
            c18060c2.N(Math.max(c18060c2.x(), dVarI.f61163c));
        }
        this.f54754l = false;
        this.f54755m = false;
    }

    @Override // android.view.View
    @SuppressLint({"WrongConstant"})
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z10 = this.f54733D != null && ViewCompat.w(this);
        int iZ = ViewCompat.z(this);
        int childCount = getChildCount();
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (z10) {
                    int iB = r.b(eVar.f54771a, iZ);
                    if (ViewCompat.w(childAt)) {
                        j jVarU = this.f54733D;
                        if (iB == 3) {
                            jVarU = jVarU.u(jVarU.k(), jVarU.m(), 0, jVarU.j());
                        } else if (iB == 5) {
                            jVarU = jVarU.u(0, jVarU.m(), jVarU.l(), jVarU.j());
                        }
                        ViewCompat.h(childAt, jVarU);
                    } else {
                        j jVarU2 = this.f54733D;
                        if (iB == 3) {
                            jVarU2 = jVarU2.u(jVarU2.k(), jVarU2.m(), 0, jVarU2.j());
                        } else if (iB == 5) {
                            jVarU2 = jVarU2.u(0, jVarU2.m(), jVarU2.l(), jVarU2.j());
                        }
                        ((ViewGroup.MarginLayoutParams) eVar).leftMargin = jVarU2.k();
                        ((ViewGroup.MarginLayoutParams) eVar).topMargin = jVarU2.m();
                        ((ViewGroup.MarginLayoutParams) eVar).rightMargin = jVarU2.l();
                        ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = jVarU2.j();
                    }
                }
                if (D(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, 1073741824));
                } else {
                    if (!G(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f54728Q) {
                        float fU = ViewCompat.u(childAt);
                        float f10 = this.f54744b;
                        if (fU != f10) {
                            ViewCompat.u0(childAt, f10);
                        }
                    }
                    int iV = v(childAt) & 7;
                    boolean z13 = iV == 3;
                    if ((z13 && z11) || (!z13 && z12)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + y(iV) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z13) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f54745c + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin, ((ViewGroup.MarginLayoutParams) eVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewP;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        int i10 = fVar.f54775c;
        if (i10 != 0 && (viewP = p(i10)) != null) {
            O(viewP);
        }
        int i11 = fVar.f54776d;
        if (i11 != 3) {
            V(i11, 3);
        }
        int i12 = fVar.f54777e;
        if (i12 != 3) {
            V(i12, 5);
        }
        int i13 = fVar.f54778f;
        if (i13 != 3) {
            V(i13, 8388611);
        }
        int i14 = fVar.f54779g;
        if (i14 != 3) {
            V(i14, 8388613);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            x2.c r0 = r6.f54749g
            r0.G(r7)
            x2.c r0 = r6.f54750h
            r0.G(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5f
            if (r0 == r2) goto L20
            r7 = 3
            if (r0 == r7) goto L1a
            goto L6d
        L1a:
            r6.k(r2)
            r6.f54762t = r1
            goto L6d
        L20:
            float r0 = r7.getX()
            float r7 = r7.getY()
            x2.c r3 = r6.f54749g
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.u(r4, r5)
            if (r3 == 0) goto L5a
            boolean r3 = r6.D(r3)
            if (r3 == 0) goto L5a
            float r3 = r6.f54765w
            float r0 = r0 - r3
            float r3 = r6.f54766x
            float r7 = r7 - r3
            x2.c r3 = r6.f54749g
            int r3 = r3.A()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            android.view.View r7 = r6.q()
            if (r7 == 0) goto L5a
            int r7 = r6.t(r7)
            r0 = 2
            if (r7 != r0) goto L5b
        L5a:
            r1 = r2
        L5b:
            r6.k(r1)
            goto L6d
        L5f:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f54765w = r0
            r6.f54766x = r7
            r6.f54762t = r1
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f54754l) {
            return;
        }
        super.requestLayout();
    }

    public void setDrawerElevation(float f10) {
        this.f54744b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (G(childAt)) {
                ViewCompat.u0(childAt, this.f54744b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(d dVar) {
        d dVar2 = this.f54763u;
        if (dVar2 != null) {
            Q(dVar2);
        }
        if (dVar != null) {
            c(dVar);
        }
        this.f54763u = dVar;
    }

    public void setScrimColor(int i10) {
        this.f54746d = i10;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f54767y = new ColorDrawable(i10);
        invalidate();
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = true;
        f54727P = true;
        f54728Q = true;
        if (i10 < 29) {
            z10 = false;
        }
        f54729R = z10;
    }

    private boolean A() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((e) getChildAt(i10).getLayoutParams()).f54773c) {
                return true;
            }
        }
        return false;
    }

    private boolean B() {
        if (r() != null) {
            return true;
        }
        return false;
    }

    static boolean C(View view) {
        if (ViewCompat.x(view) != 4 && ViewCompat.x(view) != 2) {
            return true;
        }
        return false;
    }

    private Drawable R() {
        int iZ = ViewCompat.z(this);
        if (iZ == 0) {
            Drawable drawable = this.f54735F;
            if (drawable != null) {
                K(drawable, iZ);
                return this.f54735F;
            }
        } else {
            Drawable drawable2 = this.f54736G;
            if (drawable2 != null) {
                K(drawable2, iZ);
                return this.f54736G;
            }
        }
        return this.f54737H;
    }

    private Drawable S() {
        int iZ = ViewCompat.z(this);
        if (iZ == 0) {
            Drawable drawable = this.f54736G;
            if (drawable != null) {
                K(drawable, iZ);
                return this.f54736G;
            }
        } else {
            Drawable drawable2 = this.f54735F;
            if (drawable2 != null) {
                K(drawable2, iZ);
                return this.f54735F;
            }
        }
        return this.f54738I;
    }

    private void Z(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((!z10 && !G(childAt)) || (z10 && childAt == view)) {
                ViewCompat.w0(childAt, 1);
            } else {
                ViewCompat.w0(childAt, 4);
            }
        }
    }

    public static /* synthetic */ boolean b(DrawerLayout drawerLayout, View view, InterfaceC16593B.a aVar) {
        if (drawerLayout.F(view) && drawerLayout.t(view) != 2) {
            drawerLayout.h(view);
            return true;
        }
        return false;
    }

    private boolean o(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventX = x(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventX);
            motionEventX.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private MotionEvent x(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f54741L == null) {
                this.f54741L = new Matrix();
            }
            matrix.invert(this.f54741L);
            motionEventObtain.transform(this.f54741L);
        }
        return motionEventObtain;
    }

    private static boolean z(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    boolean D(View view) {
        if (((e) view.getLayoutParams()).f54771a == 0) {
            return true;
        }
        return false;
    }

    public boolean E(int i10) {
        View viewP = p(i10);
        if (viewP != null) {
            return F(viewP);
        }
        return false;
    }

    public boolean F(View view) {
        if (G(view)) {
            if ((((e) view.getLayoutParams()).f54774d & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean G(View view) {
        int iB = r.b(((e) view.getLayoutParams()).f54771a, ViewCompat.z(view));
        if ((iB & 3) != 0 || (iB & 5) != 0) {
            return true;
        }
        return false;
    }

    public boolean H(int i10) {
        View viewP = p(i10);
        if (viewP != null) {
            return I(viewP);
        }
        return false;
    }

    public boolean I(View view) {
        if (G(view)) {
            if (((e) view.getLayoutParams()).f54772b > 0.0f) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void L(View view, float f10) {
        float fW = w(view);
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (fW * width));
        if (!e(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        W(view, f10);
    }

    public void N(int i10, boolean z10) {
        View viewP = p(i10);
        if (viewP != null) {
            P(viewP, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + y(i10));
    }

    public void P(View view, boolean z10) {
        if (G(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.f54755m) {
                eVar.f54772b = 1.0f;
                eVar.f54774d = 1;
                Z(view, true);
                Y(view);
                X();
            } else if (z10) {
                eVar.f54774d |= 2;
                if (e(view, 3)) {
                    this.f54749g.S(view, 0, view.getTop());
                } else {
                    this.f54750h.S(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                L(view, 1.0f);
                a0(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void V(int i10, int i11) {
        View viewP;
        C18060c c18060c;
        int iB = r.b(i11, ViewCompat.z(this));
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 8388611) {
                    if (i11 == 8388613) {
                        this.f54761s = i10;
                    }
                } else {
                    this.f54760r = i10;
                }
            } else {
                this.f54759q = i10;
            }
        } else {
            this.f54758p = i10;
        }
        if (i10 != 0) {
            if (iB == 3) {
                c18060c = this.f54749g;
            } else {
                c18060c = this.f54750h;
            }
            c18060c.b();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewP = p(iB)) != null) {
                O(viewP);
                return;
            }
            return;
        }
        View viewP2 = p(iB);
        if (viewP2 != null) {
            h(viewP2);
        }
    }

    void W(View view, float f10) {
        e eVar = (e) view.getLayoutParams();
        if (f10 == eVar.f54772b) {
            return;
        }
        eVar.f54772b = f10;
        n(view, f10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (G(childAt)) {
                if (F(childAt)) {
                    childAt.addFocusables(arrayList, i10, i11);
                    z10 = true;
                }
            } else {
                this.f54739J.add(childAt);
            }
        }
        if (!z10) {
            int size = this.f54739J.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = this.f54739J.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.f54739J.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (q() == null && !G(view)) {
            ViewCompat.w0(view, 1);
        } else {
            ViewCompat.w0(view, 4);
        }
        if (!f54727P) {
            ViewCompat.m0(view, this.f54743a);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((e) getChildAt(i10).getLayoutParams()).f54772b);
        }
        this.f54747e = fMax;
        boolean zN = this.f54749g.n(true);
        boolean zN2 = this.f54750h.n(true);
        if (!zN && !zN2) {
            return;
        }
        ViewCompat.d0(this);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f54747e > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                for (int i10 = childCount - 1; i10 >= 0; i10--) {
                    View childAt = getChildAt(i10);
                    if (J(x10, y10, childAt) && !D(childAt) && o(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean zD = D(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zD) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && z(childAt) && G(childAt) && childAt.getHeight() >= height) {
                    if (e(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zFsSuperDrawChild_c13e2a28b18b31a4d162bb1cddaa459b = fsSuperDrawChild_c13e2a28b18b31a4d162bb1cddaa459b(canvas, view, j10);
        canvas.restoreToCount(iSave);
        float f10 = this.f54747e;
        if (f10 > 0.0f && zD) {
            this.f54748f.setColor((this.f54746d & 16777215) | (((int) ((((-16777216) & r14) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.f54748f);
            return zFsSuperDrawChild_c13e2a28b18b31a4d162bb1cddaa459b;
        }
        if (this.f54768z != null && e(view, 3)) {
            int intrinsicWidth = this.f54768z.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f54749g.y(), 1.0f));
            this.f54768z.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f54768z.setAlpha((int) (fMax * 255.0f));
            this.f54768z.draw(canvas);
            return zFsSuperDrawChild_c13e2a28b18b31a4d162bb1cddaa459b;
        }
        if (this.f54730A != null && e(view, 5)) {
            int intrinsicWidth2 = this.f54730A.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f54750h.y(), 1.0f));
            this.f54730A.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f54730A.setAlpha((int) (fMax2 * 255.0f));
            this.f54730A.draw(canvas);
        }
        return zFsSuperDrawChild_c13e2a28b18b31a4d162bb1cddaa459b;
    }

    boolean e(View view, int i10) {
        if ((v(view) & i10) == i10) {
            return true;
        }
        return false;
    }

    public void g(int i10, boolean z10) {
        View viewP = p(i10);
        if (viewP != null) {
            i(viewP, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + y(i10));
    }

    public void i(View view, boolean z10) {
        if (G(view)) {
            e eVar = (e) view.getLayoutParams();
            if (this.f54755m) {
                eVar.f54772b = 0.0f;
                eVar.f54774d = 0;
            } else if (z10) {
                eVar.f54774d |= 4;
                if (e(view, 3)) {
                    this.f54749g.S(view, -view.getWidth(), view.getTop());
                } else {
                    this.f54750h.S(view, getWidth(), view.getTop());
                }
            } else {
                L(view, 0.0f);
                a0(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    void k(boolean z10) {
        boolean zS;
        int childCount = getChildCount();
        boolean z11 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            e eVar = (e) childAt.getLayoutParams();
            if (G(childAt) && (!z10 || eVar.f54773c)) {
                int width = childAt.getWidth();
                if (e(childAt, 3)) {
                    zS = this.f54749g.S(childAt, -width, childAt.getTop());
                } else {
                    zS = this.f54750h.S(childAt, getWidth(), childAt.getTop());
                }
                z11 |= zS;
                eVar.f54773c = false;
            }
        }
        this.f54751i.p();
        this.f54752j.p();
        if (z11) {
            invalidate();
        }
    }

    void l(View view) {
        View rootView;
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f54774d & 1) == 1) {
            eVar.f54774d = 0;
            List<d> list = this.f54764v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f54764v.get(size).b(view);
                }
            }
            Z(view, false);
            Y(view);
            X();
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    void m(View view) {
        e eVar = (e) view.getLayoutParams();
        if ((eVar.f54774d & 1) == 0) {
            eVar.f54774d = 1;
            List<d> list = this.f54764v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f54764v.get(size).a(view);
                }
            }
            Z(view, true);
            Y(view);
            X();
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f54755m = true;
        X();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f54755m = true;
        X();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int iM;
        super.onDraw(canvas);
        if (this.f54734E && this.f54767y != null) {
            j jVar = this.f54733D;
            if (jVar != null) {
                iM = jVar.m();
            } else {
                iM = 0;
            }
            if (iM > 0) {
                this.f54767y.setBounds(0, 0, getWidth(), iM);
                this.f54767y.draw(canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            x2.c r1 = r6.f54749g
            boolean r1 = r1.R(r7)
            x2.c r2 = r6.f54750h
            boolean r2 = r2.R(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L36
        L1e:
            x2.c r7 = r6.f54749g
            boolean r7 = r7.e(r4)
            if (r7 == 0) goto L36
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.f54751i
            r7.p()
            androidx.drawerlayout.widget.DrawerLayout$h r7 = r6.f54752j
            r7.p()
            goto L36
        L31:
            r6.k(r2)
            r6.f54762t = r3
        L36:
            r7 = r3
            goto L60
        L38:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.f54765w = r0
            r6.f54766x = r7
            float r4 = r6.f54747e
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5d
            x2.c r4 = r6.f54749g
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.u(r0, r7)
            if (r7 == 0) goto L5d
            boolean r7 = r6.D(r7)
            if (r7 == 0) goto L5d
            r7 = r2
            goto L5e
        L5d:
            r7 = r3
        L5e:
            r6.f54762t = r3
        L60:
            if (r1 != 0) goto L70
            if (r7 != 0) goto L70
            boolean r7 = r6.A()
            if (r7 != 0) goto L70
            boolean r7 = r6.f54762t
            if (r7 == 0) goto L6f
            goto L70
        L6f:
            return r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        T();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z10;
        f fVar = new f(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            e eVar = (e) getChildAt(i10).getLayoutParams();
            int i11 = eVar.f54774d;
            boolean z11 = true;
            if (i11 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 2) {
                z11 = false;
            }
            if (z10 || z11) {
                fVar.f54775c = eVar.f54771a;
                break;
            }
        }
        fVar.f54776d = this.f54758p;
        fVar.f54777e = this.f54759q;
        fVar.f54778f = this.f54760r;
        fVar.f54779g = this.f54761s;
        return fVar;
    }

    View p(int i10) {
        int iB = r.b(i10, ViewCompat.z(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((v(childAt) & 7) == iB) {
                return childAt;
            }
        }
        return null;
    }

    View q() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((e) childAt.getLayoutParams()).f54774d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    View r() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (G(childAt) && I(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            k(true);
        }
    }

    public int s(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int iZ = ViewCompat.z(this);
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 8388611) {
                    if (i10 == 8388613) {
                        int i15 = this.f54761s;
                        if (i15 != 3) {
                            return i15;
                        }
                        if (iZ == 0) {
                            i14 = this.f54759q;
                        } else {
                            i14 = this.f54758p;
                        }
                        if (i14 != 3) {
                            return i14;
                        }
                        return 0;
                    }
                    return 0;
                }
                int i16 = this.f54760r;
                if (i16 != 3) {
                    return i16;
                }
                if (iZ == 0) {
                    i13 = this.f54758p;
                } else {
                    i13 = this.f54759q;
                }
                if (i13 != 3) {
                    return i13;
                }
                return 0;
            }
            int i17 = this.f54759q;
            if (i17 != 3) {
                return i17;
            }
            if (iZ == 0) {
                i12 = this.f54761s;
            } else {
                i12 = this.f54760r;
            }
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        int i18 = this.f54758p;
        if (i18 != 3) {
            return i18;
        }
        if (iZ == 0) {
            i11 = this.f54760r;
        } else {
            i11 = this.f54761s;
        }
        if (i11 != 3) {
            return i11;
        }
        return 0;
    }

    public void setStatusBarBackground(int i10) {
        this.f54767y = i10 != 0 ? Z1.b.e(getContext(), i10) : null;
        invalidate();
    }

    public int t(View view) {
        if (G(view)) {
            return s(((e) view.getLayoutParams()).f54771a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public CharSequence u(int i10) {
        int iB = r.b(i10, ViewCompat.z(this));
        if (iB == 3) {
            return this.f54731B;
        }
        if (iB == 5) {
            return this.f54732C;
        }
        return null;
    }

    int v(View view) {
        return r.b(((e) view.getLayoutParams()).f54771a, ViewCompat.z(this));
    }

    float w(View view) {
        return ((e) view.getLayoutParams()).f54772b;
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f54771a;

        /* renamed from: b, reason: collision with root package name */
        float f54772b;

        /* renamed from: c, reason: collision with root package name */
        boolean f54773c;

        /* renamed from: d, reason: collision with root package name */
        int f54774d;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f54771a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.f54726O);
            this.f54771a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f54771a = 0;
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f54771a = 0;
            this.f54771a = eVar.f54771a;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f54771a = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f54771a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }
}
