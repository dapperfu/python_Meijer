package ce;

import ae.C5597b;
import ae.f;
import ae.j;
import ae.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import be.C6230a;
import ce.C6387b;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.material.internal.q;
import com.google.android.material.internal.s;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import oe.C16026c;
import oe.C16027d;
import re.C16760h;
import re.C16765m;

/* renamed from: ce.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6386a extends Drawable implements q.b, FSDraw {

    /* renamed from: n, reason: collision with root package name */
    private static final int f61695n = k.f44806v;

    /* renamed from: o, reason: collision with root package name */
    private static final int f61696o = C5597b.f44511d;

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f61697a;

    /* renamed from: b, reason: collision with root package name */
    private final C16760h f61698b;

    /* renamed from: c, reason: collision with root package name */
    private final q f61699c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f61700d;

    /* renamed from: e, reason: collision with root package name */
    private final C6387b f61701e;

    /* renamed from: f, reason: collision with root package name */
    private float f61702f;

    /* renamed from: g, reason: collision with root package name */
    private float f61703g;

    /* renamed from: h, reason: collision with root package name */
    private int f61704h;

    /* renamed from: i, reason: collision with root package name */
    private float f61705i;

    /* renamed from: j, reason: collision with root package name */
    private float f61706j;

    /* renamed from: k, reason: collision with root package name */
    private float f61707k;

    /* renamed from: l, reason: collision with root package name */
    private WeakReference<View> f61708l;

    /* renamed from: m, reason: collision with root package name */
    private WeakReference<FrameLayout> f61709m;

    /* renamed from: ce.a$a, reason: collision with other inner class name */
    class RunnableC1218a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f61710a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f61711b;

        RunnableC1218a(View view, FrameLayout frameLayout) {
            this.f61710a = view;
            this.f61711b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6386a.this.Y(this.f61710a, this.f61711b);
        }
    }

    public void R(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f61701e.x() != iMax) {
            this.f61701e.M(iMax);
            K();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    private void C() {
        this.f61699c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void D() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f61701e.f());
        if (this.f61698b.x() != colorStateListValueOf) {
            this.f61698b.b0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void E() {
        this.f61699c.l(true);
        G();
        Z();
        invalidateSelf();
    }

    private void F() {
        WeakReference<View> weakReference = this.f61708l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.f61708l.get();
        WeakReference<FrameLayout> weakReference2 = this.f61709m;
        Y(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void G() {
        Context context = this.f61697a.get();
        if (context == null) {
            return;
        }
        this.f61698b.setShapeAppearanceModel(C16765m.b(context, y() ? this.f61701e.n() : this.f61701e.j(), y() ? this.f61701e.m() : this.f61701e.i()).m());
        invalidateSelf();
    }

    private void H() {
        C16027d c16027d;
        Context context = this.f61697a.get();
        if (context == null || this.f61699c.e() == (c16027d = new C16027d(context, this.f61701e.A()))) {
            return;
        }
        this.f61699c.k(c16027d, context);
        I();
        Z();
        invalidateSelf();
    }

    private void I() {
        this.f61699c.g().setColor(this.f61701e.k());
        invalidateSelf();
    }

    private void L() {
        boolean zG = this.f61701e.G();
        setVisible(zG, false);
        if (!C6388c.f61754a || j() == null || zG) {
            return;
        }
        ((ViewGroup) j().getParent()).invalidate();
    }

    private void Z() {
        Context context = this.f61697a.get();
        WeakReference<View> weakReference = this.f61708l;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f61700d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f61709m;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || C6388c.f61754a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        c(rect2, view);
        C6388c.e(this.f61700d, this.f61702f, this.f61703g, this.f61706j, this.f61707k);
        float f10 = this.f61705i;
        if (f10 != -1.0f) {
            this.f61698b.Y(f10);
        }
        if (rect.equals(this.f61700d)) {
            return;
        }
        this.f61698b.setBounds(this.f61700d);
    }

    public static C6386a e(Context context) {
        return new C6386a(context, 0, f61696o, f61695n, null);
    }

    private CharSequence k() {
        return this.f61701e.q();
    }

    private float l(View view, float f10) {
        return (this.f61702f - this.f61706j) + view.getX() + f10;
    }

    private String p() {
        if (this.f61704h == -2 || o() <= this.f61704h) {
            return NumberFormat.getInstance(this.f61701e.y()).format(o());
        }
        Context context = this.f61697a.get();
        return context == null ? "" : String.format(this.f61701e.y(), context.getString(j.f44765s), Integer.valueOf(this.f61704h), "+");
    }

    private String q() {
        Context context;
        if (this.f61701e.r() == 0 || (context = this.f61697a.get()) == null) {
            return null;
        }
        return (this.f61704h == -2 || o() <= this.f61704h) ? context.getResources().getQuantityString(this.f61701e.r(), o(), Integer.valueOf(o())) : context.getString(this.f61701e.o(), Integer.valueOf(this.f61704h));
    }

    private CharSequence u() {
        CharSequence charSequenceP = this.f61701e.p();
        return charSequenceP != null ? charSequenceP : s();
    }

    private float v(View view, float f10) {
        return (this.f61703g - this.f61707k) + view.getY() + f10;
    }

    private int x() {
        int iC = this.f61701e.C();
        if (y()) {
            iC = this.f61701e.B();
            Context context = this.f61697a.get();
            if (context != null) {
                iC = C6230a.c(iC, iC - this.f61701e.u(), C6230a.b(0.0f, 1.0f, 0.3f, 1.0f, C16026c.e(context) - 1.0f));
            }
        }
        if (this.f61701e.f61723k == 0) {
            iC -= Math.round(this.f61707k);
        }
        return iC + this.f61701e.d();
    }

    public boolean A() {
        return this.f61701e.E();
    }

    public void N(int i10) {
        this.f61701e.J(i10);
    }

    public void P(int i10) {
        this.f61701e.K(i10);
        Z();
    }

    public void Q(int i10) {
        this.f61701e.L(i10);
        Z();
    }

    public void T(int i10) {
        this.f61701e.N(i10);
        Z();
    }

    public void U(int i10) {
        this.f61701e.O(i10);
        Z();
    }

    public void V(boolean z10) {
        this.f61701e.P(z10);
        L();
    }

    public void Y(View view, FrameLayout frameLayout) {
        this.f61708l = new WeakReference<>(view);
        boolean z10 = C6388c.f61754a;
        if (z10 && frameLayout == null) {
            W(view);
        } else {
            this.f61709m = new WeakReference<>(frameLayout);
        }
        if (!z10) {
            X(view);
        }
        Z();
        invalidateSelf();
    }

    public void d() {
        if (this.f61701e.D()) {
            this.f61701e.a();
            K();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f61701e.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f61700d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f61700d.width();
    }

    public FrameLayout j() {
        WeakReference<FrameLayout> weakReference = this.f61709m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int m() {
        return this.f61701e.v();
    }

    public int n() {
        return this.f61701e.w();
    }

    public int o() {
        if (this.f61701e.D()) {
            return this.f61701e.x();
        }
        return 0;
    }

    public String s() {
        return this.f61701e.z();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f61701e.I(i10);
        C();
    }

    public boolean z() {
        return !this.f61701e.E() && this.f61701e.D();
    }

    private C6386a(Context context, int i10, int i11, int i12, C6387b.a aVar) {
        int iJ;
        int i13;
        this.f61697a = new WeakReference<>(context);
        s.c(context);
        this.f61700d = new Rect();
        q qVar = new q(this);
        this.f61699c = qVar;
        qVar.g().setTextAlign(Paint.Align.CENTER);
        C6387b c6387b = new C6387b(context, i10, i11, i12, aVar);
        this.f61701e = c6387b;
        if (y()) {
            iJ = c6387b.n();
        } else {
            iJ = c6387b.j();
        }
        if (y()) {
            i13 = c6387b.m();
        } else {
            i13 = c6387b.i();
        }
        this.f61698b = new C16760h(C16765m.b(context, iJ, i13).m());
        M();
    }

    private boolean B() {
        FrameLayout frameLayoutJ = j();
        if (frameLayoutJ != null && frameLayoutJ.getId() == f.f44707z) {
            return true;
        }
        return false;
    }

    private void J() {
        a0();
        this.f61699c.l(true);
        Z();
        invalidateSelf();
    }

    private void K() {
        if (!A()) {
            E();
        }
    }

    private void M() {
        G();
        H();
        J();
        E();
        C();
        D();
        I();
        F();
        Z();
        L();
    }

    private void W(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != f.f44707z) {
            WeakReference<FrameLayout> weakReference = this.f61709m;
            if (weakReference != null && weakReference.get() == viewGroup) {
                return;
            }
            X(view);
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setId(f.f44707z);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            frameLayout.setLayoutParams(view.getLayoutParams());
            frameLayout.setMinimumWidth(view.getWidth());
            frameLayout.setMinimumHeight(view.getHeight());
            int iIndexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(iIndexOfChild);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(view);
            viewGroup.addView(frameLayout, iIndexOfChild);
            this.f61709m = new WeakReference<>(frameLayout);
            frameLayout.post(new RunnableC1218a(view, frameLayout));
        }
    }

    private static void X(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void a0() {
        if (m() != -2) {
            this.f61704h = ((int) Math.pow(10.0d, m() - 1.0d)) - 1;
        } else {
            this.f61704h = n();
        }
    }

    private void b(View view) {
        float y10;
        float x10;
        View viewJ = j();
        if (viewJ == null) {
            if (view.getParent() instanceof View) {
                float y11 = view.getY();
                x10 = view.getX();
                viewJ = (View) view.getParent();
                y10 = y11;
            } else {
                return;
            }
        } else if (B()) {
            if (viewJ.getParent() instanceof View) {
                y10 = viewJ.getY();
                x10 = viewJ.getX();
                viewJ = (View) viewJ.getParent();
            } else {
                return;
            }
        } else {
            y10 = 0.0f;
            x10 = 0.0f;
        }
        float fV = v(viewJ, y10);
        float fL = l(viewJ, x10);
        float fH = h(viewJ, y10);
        float fR = r(viewJ, x10);
        if (fV < 0.0f) {
            this.f61703g += Math.abs(fV);
        }
        if (fL < 0.0f) {
            this.f61702f += Math.abs(fL);
        }
        if (fH > 0.0f) {
            this.f61703g -= Math.abs(fH);
        }
        if (fR > 0.0f) {
            this.f61702f -= Math.abs(fR);
        }
    }

    private void c(Rect rect, View view) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (y()) {
            f10 = this.f61701e.f61716d;
        } else {
            f10 = this.f61701e.f61715c;
        }
        this.f61705i = f10;
        if (f10 != -1.0f) {
            this.f61706j = f10;
            this.f61707k = f10;
        } else {
            if (y()) {
                f11 = this.f61701e.f61719g;
            } else {
                f11 = this.f61701e.f61717e;
            }
            this.f61706j = Math.round(f11 / 2.0f);
            if (y()) {
                f12 = this.f61701e.f61720h;
            } else {
                f12 = this.f61701e.f61718f;
            }
            this.f61707k = Math.round(f12 / 2.0f);
        }
        if (y()) {
            String strG = g();
            this.f61706j = Math.max(this.f61706j, (this.f61699c.h(strG) / 2.0f) + this.f61701e.h());
            float fMax = Math.max(this.f61707k, (this.f61699c.f(strG) / 2.0f) + this.f61701e.l());
            this.f61707k = fMax;
            this.f61706j = Math.max(this.f61706j, fMax);
        }
        int iX = x();
        int iG = this.f61701e.g();
        if (iG != 8388691 && iG != 8388693) {
            this.f61703g = rect.top + iX;
        } else {
            this.f61703g = rect.bottom - iX;
        }
        int iW = w();
        int iG2 = this.f61701e.g();
        if (iG2 != 8388659 && iG2 != 8388691) {
            if (ViewCompat.z(view) == 0) {
                f14 = (rect.right + this.f61706j) - iW;
            } else {
                f14 = (rect.left - this.f61706j) + iW;
            }
            this.f61702f = f14;
        } else {
            if (ViewCompat.z(view) == 0) {
                f13 = (rect.left - this.f61706j) + iW;
            } else {
                f13 = (rect.right + this.f61706j) - iW;
            }
            this.f61702f = f13;
        }
        if (this.f61701e.F()) {
            b(view);
        }
    }

    private void f(Canvas canvas) {
        int iRound;
        String strG = g();
        if (strG != null) {
            Rect rect = new Rect();
            this.f61699c.g().getTextBounds(strG, 0, strG.length(), rect);
            float fExactCenterY = this.f61703g - rect.exactCenterY();
            float f10 = this.f61702f;
            if (rect.bottom <= 0) {
                iRound = (int) fExactCenterY;
            } else {
                iRound = Math.round(fExactCenterY);
            }
            canvas.drawText(strG, f10, iRound, this.f61699c.g());
        }
    }

    private String g() {
        if (A()) {
            return t();
        }
        if (z()) {
            return p();
        }
        return null;
    }

    private float h(View view, float f10) {
        if (view.getParent() instanceof View) {
            return ((this.f61703g + this.f61707k) - (((View) view.getParent()).getHeight() - view.getY())) + f10;
        }
        return 0.0f;
    }

    private float r(View view, float f10) {
        if (view.getParent() instanceof View) {
            return ((this.f61702f + this.f61706j) - (((View) view.getParent()).getWidth() - view.getX())) + f10;
        }
        return 0.0f;
    }

    private String t() {
        String strS = s();
        int iM = m();
        if (iM != -2 && strS != null && strS.length() > iM) {
            Context context = this.f61697a.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(j.f44755i), strS.substring(0, iM - 1), "…");
        }
        return strS;
    }

    private int w() {
        int iT;
        int i10;
        if (y()) {
            iT = this.f61701e.s();
        } else {
            iT = this.f61701e.t();
        }
        if (this.f61701e.f61723k == 1) {
            if (y()) {
                i10 = this.f61701e.f61722j;
            } else {
                i10 = this.f61701e.f61721i;
            }
            iT += i10;
        }
        return iT + this.f61701e.c();
    }

    private boolean y() {
        if (!A() && !z()) {
            return false;
        }
        return true;
    }

    public void O(int i10) {
        Q(i10);
        P(i10);
    }

    public void S(int i10) {
        U(i10);
        T(i10);
    }

    @Override // com.google.android.material.internal.q.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f61698b.draw(canvas);
            if (y()) {
                f(canvas);
            }
        }
    }

    public CharSequence i() {
        if (!isVisible()) {
            return null;
        }
        if (A()) {
            return u();
        }
        if (z()) {
            return q();
        }
        return k();
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.q.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }
}
