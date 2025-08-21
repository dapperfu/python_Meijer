package ee;

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
import ce.C6503b;
import ce.f;
import ce.j;
import ce.k;
import com.fullstory.instrumentation.FSDraw;
import com.google.android.material.internal.q;
import com.google.android.material.internal.s;
import de.C13661a;
import ee.C13791b;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import qe.C16634c;
import qe.C16635d;
import te.C17234h;
import te.C17239m;

/* renamed from: ee.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13790a extends Drawable implements q.b, FSDraw {

    /* renamed from: n, reason: collision with root package name */
    private static final int f130077n = k.f61821v;

    /* renamed from: o, reason: collision with root package name */
    private static final int f130078o = C6503b.f61526d;

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f130079a;

    /* renamed from: b, reason: collision with root package name */
    private final C17234h f130080b;

    /* renamed from: c, reason: collision with root package name */
    private final q f130081c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f130082d;

    /* renamed from: e, reason: collision with root package name */
    private final C13791b f130083e;

    /* renamed from: f, reason: collision with root package name */
    private float f130084f;

    /* renamed from: g, reason: collision with root package name */
    private float f130085g;

    /* renamed from: h, reason: collision with root package name */
    private int f130086h;

    /* renamed from: i, reason: collision with root package name */
    private float f130087i;

    /* renamed from: j, reason: collision with root package name */
    private float f130088j;

    /* renamed from: k, reason: collision with root package name */
    private float f130089k;

    /* renamed from: l, reason: collision with root package name */
    private WeakReference<View> f130090l;

    /* renamed from: m, reason: collision with root package name */
    private WeakReference<FrameLayout> f130091m;

    /* renamed from: ee.a$a, reason: collision with other inner class name */
    class RunnableC2045a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f130092a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f130093b;

        RunnableC2045a(View view, FrameLayout frameLayout) {
            this.f130092a = view;
            this.f130093b = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            C13790a.this.Y(this.f130092a, this.f130093b);
        }
    }

    public void R(int i10) {
        int iMax = Math.max(0, i10);
        if (this.f130083e.x() != iMax) {
            this.f130083e.M(iMax);
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
        this.f130081c.g().setAlpha(getAlpha());
        invalidateSelf();
    }

    private void D() {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(this.f130083e.f());
        if (this.f130080b.x() != colorStateListValueOf) {
            this.f130080b.b0(colorStateListValueOf);
            invalidateSelf();
        }
    }

    private void E() {
        this.f130081c.l(true);
        G();
        Z();
        invalidateSelf();
    }

    private void F() {
        WeakReference<View> weakReference = this.f130090l;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = this.f130090l.get();
        WeakReference<FrameLayout> weakReference2 = this.f130091m;
        Y(view, weakReference2 != null ? weakReference2.get() : null);
    }

    private void G() {
        Context context = this.f130079a.get();
        if (context == null) {
            return;
        }
        this.f130080b.setShapeAppearanceModel(C17239m.b(context, y() ? this.f130083e.n() : this.f130083e.j(), y() ? this.f130083e.m() : this.f130083e.i()).m());
        invalidateSelf();
    }

    private void H() {
        C16635d c16635d;
        Context context = this.f130079a.get();
        if (context == null || this.f130081c.e() == (c16635d = new C16635d(context, this.f130083e.A()))) {
            return;
        }
        this.f130081c.k(c16635d, context);
        I();
        Z();
        invalidateSelf();
    }

    private void I() {
        this.f130081c.g().setColor(this.f130083e.k());
        invalidateSelf();
    }

    private void L() {
        boolean zG = this.f130083e.G();
        setVisible(zG, false);
        if (!C13792c.f130136a || j() == null || zG) {
            return;
        }
        ((ViewGroup) j().getParent()).invalidate();
    }

    private void Z() {
        Context context = this.f130079a.get();
        WeakReference<View> weakReference = this.f130090l;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f130082d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<FrameLayout> weakReference2 = this.f130091m;
        FrameLayout frameLayout = weakReference2 != null ? weakReference2.get() : null;
        if (frameLayout != null || C13792c.f130136a) {
            if (frameLayout == null) {
                frameLayout = (ViewGroup) view.getParent();
            }
            frameLayout.offsetDescendantRectToMyCoords(view, rect2);
        }
        c(rect2, view);
        C13792c.e(this.f130082d, this.f130084f, this.f130085g, this.f130088j, this.f130089k);
        float f10 = this.f130087i;
        if (f10 != -1.0f) {
            this.f130080b.Y(f10);
        }
        if (rect.equals(this.f130082d)) {
            return;
        }
        this.f130080b.setBounds(this.f130082d);
    }

    public static C13790a e(Context context) {
        return new C13790a(context, 0, f130078o, f130077n, null);
    }

    private CharSequence k() {
        return this.f130083e.q();
    }

    private float l(View view, float f10) {
        return (this.f130084f - this.f130088j) + view.getX() + f10;
    }

    private String p() {
        if (this.f130086h == -2 || o() <= this.f130086h) {
            return NumberFormat.getInstance(this.f130083e.y()).format(o());
        }
        Context context = this.f130079a.get();
        return context == null ? "" : String.format(this.f130083e.y(), context.getString(j.f61780s), Integer.valueOf(this.f130086h), "+");
    }

    private String q() {
        Context context;
        if (this.f130083e.r() == 0 || (context = this.f130079a.get()) == null) {
            return null;
        }
        return (this.f130086h == -2 || o() <= this.f130086h) ? context.getResources().getQuantityString(this.f130083e.r(), o(), Integer.valueOf(o())) : context.getString(this.f130083e.o(), Integer.valueOf(this.f130086h));
    }

    private CharSequence u() {
        CharSequence charSequenceP = this.f130083e.p();
        return charSequenceP != null ? charSequenceP : s();
    }

    private float v(View view, float f10) {
        return (this.f130085g - this.f130089k) + view.getY() + f10;
    }

    private int x() {
        int iC = this.f130083e.C();
        if (y()) {
            iC = this.f130083e.B();
            Context context = this.f130079a.get();
            if (context != null) {
                iC = C13661a.c(iC, iC - this.f130083e.u(), C13661a.b(0.0f, 1.0f, 0.3f, 1.0f, C16634c.e(context) - 1.0f));
            }
        }
        if (this.f130083e.f130105k == 0) {
            iC -= Math.round(this.f130089k);
        }
        return iC + this.f130083e.d();
    }

    public boolean A() {
        return this.f130083e.E();
    }

    public void N(int i10) {
        this.f130083e.J(i10);
    }

    public void P(int i10) {
        this.f130083e.K(i10);
        Z();
    }

    public void Q(int i10) {
        this.f130083e.L(i10);
        Z();
    }

    public void T(int i10) {
        this.f130083e.N(i10);
        Z();
    }

    public void U(int i10) {
        this.f130083e.O(i10);
        Z();
    }

    public void V(boolean z10) {
        this.f130083e.P(z10);
        L();
    }

    public void Y(View view, FrameLayout frameLayout) {
        this.f130090l = new WeakReference<>(view);
        boolean z10 = C13792c.f130136a;
        if (z10 && frameLayout == null) {
            W(view);
        } else {
            this.f130091m = new WeakReference<>(frameLayout);
        }
        if (!z10) {
            X(view);
        }
        Z();
        invalidateSelf();
    }

    public void d() {
        if (this.f130083e.D()) {
            this.f130083e.a();
            K();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f130083e.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f130082d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f130082d.width();
    }

    public FrameLayout j() {
        WeakReference<FrameLayout> weakReference = this.f130091m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int m() {
        return this.f130083e.v();
    }

    public int n() {
        return this.f130083e.w();
    }

    public int o() {
        if (this.f130083e.D()) {
            return this.f130083e.x();
        }
        return 0;
    }

    public String s() {
        return this.f130083e.z();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f130083e.I(i10);
        C();
    }

    public boolean z() {
        return !this.f130083e.E() && this.f130083e.D();
    }

    private C13790a(Context context, int i10, int i11, int i12, C13791b.a aVar) {
        int iJ;
        int i13;
        this.f130079a = new WeakReference<>(context);
        s.c(context);
        this.f130082d = new Rect();
        q qVar = new q(this);
        this.f130081c = qVar;
        qVar.g().setTextAlign(Paint.Align.CENTER);
        C13791b c13791b = new C13791b(context, i10, i11, i12, aVar);
        this.f130083e = c13791b;
        if (y()) {
            iJ = c13791b.n();
        } else {
            iJ = c13791b.j();
        }
        if (y()) {
            i13 = c13791b.m();
        } else {
            i13 = c13791b.i();
        }
        this.f130080b = new C17234h(C17239m.b(context, iJ, i13).m());
        M();
    }

    private boolean B() {
        FrameLayout frameLayoutJ = j();
        if (frameLayoutJ != null && frameLayoutJ.getId() == f.f61722z) {
            return true;
        }
        return false;
    }

    private void J() {
        a0();
        this.f130081c.l(true);
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
        if (viewGroup == null || viewGroup.getId() != f.f61722z) {
            WeakReference<FrameLayout> weakReference = this.f130091m;
            if (weakReference != null && weakReference.get() == viewGroup) {
                return;
            }
            X(view);
            FrameLayout frameLayout = new FrameLayout(view.getContext());
            frameLayout.setId(f.f61722z);
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
            this.f130091m = new WeakReference<>(frameLayout);
            frameLayout.post(new RunnableC2045a(view, frameLayout));
        }
    }

    private static void X(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    private void a0() {
        if (m() != -2) {
            this.f130086h = ((int) Math.pow(10.0d, m() - 1.0d)) - 1;
        } else {
            this.f130086h = n();
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
            this.f130085g += Math.abs(fV);
        }
        if (fL < 0.0f) {
            this.f130084f += Math.abs(fL);
        }
        if (fH > 0.0f) {
            this.f130085g -= Math.abs(fH);
        }
        if (fR > 0.0f) {
            this.f130084f -= Math.abs(fR);
        }
    }

    private void c(Rect rect, View view) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        if (y()) {
            f10 = this.f130083e.f130098d;
        } else {
            f10 = this.f130083e.f130097c;
        }
        this.f130087i = f10;
        if (f10 != -1.0f) {
            this.f130088j = f10;
            this.f130089k = f10;
        } else {
            if (y()) {
                f11 = this.f130083e.f130101g;
            } else {
                f11 = this.f130083e.f130099e;
            }
            this.f130088j = Math.round(f11 / 2.0f);
            if (y()) {
                f12 = this.f130083e.f130102h;
            } else {
                f12 = this.f130083e.f130100f;
            }
            this.f130089k = Math.round(f12 / 2.0f);
        }
        if (y()) {
            String strG = g();
            this.f130088j = Math.max(this.f130088j, (this.f130081c.h(strG) / 2.0f) + this.f130083e.h());
            float fMax = Math.max(this.f130089k, (this.f130081c.f(strG) / 2.0f) + this.f130083e.l());
            this.f130089k = fMax;
            this.f130088j = Math.max(this.f130088j, fMax);
        }
        int iX = x();
        int iG = this.f130083e.g();
        if (iG != 8388691 && iG != 8388693) {
            this.f130085g = rect.top + iX;
        } else {
            this.f130085g = rect.bottom - iX;
        }
        int iW = w();
        int iG2 = this.f130083e.g();
        if (iG2 != 8388659 && iG2 != 8388691) {
            if (ViewCompat.z(view) == 0) {
                f14 = (rect.right + this.f130088j) - iW;
            } else {
                f14 = (rect.left - this.f130088j) + iW;
            }
            this.f130084f = f14;
        } else {
            if (ViewCompat.z(view) == 0) {
                f13 = (rect.left - this.f130088j) + iW;
            } else {
                f13 = (rect.right + this.f130088j) - iW;
            }
            this.f130084f = f13;
        }
        if (this.f130083e.F()) {
            b(view);
        }
    }

    private void f(Canvas canvas) {
        int iRound;
        String strG = g();
        if (strG != null) {
            Rect rect = new Rect();
            this.f130081c.g().getTextBounds(strG, 0, strG.length(), rect);
            float fExactCenterY = this.f130085g - rect.exactCenterY();
            float f10 = this.f130084f;
            if (rect.bottom <= 0) {
                iRound = (int) fExactCenterY;
            } else {
                iRound = Math.round(fExactCenterY);
            }
            canvas.drawText(strG, f10, iRound, this.f130081c.g());
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
            return ((this.f130085g + this.f130089k) - (((View) view.getParent()).getHeight() - view.getY())) + f10;
        }
        return 0.0f;
    }

    private float r(View view, float f10) {
        if (view.getParent() instanceof View) {
            return ((this.f130084f + this.f130088j) - (((View) view.getParent()).getWidth() - view.getX())) + f10;
        }
        return 0.0f;
    }

    private String t() {
        String strS = s();
        int iM = m();
        if (iM != -2 && strS != null && strS.length() > iM) {
            Context context = this.f130079a.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(j.f61770i), strS.substring(0, iM - 1), "…");
        }
        return strS;
    }

    private int w() {
        int iT;
        int i10;
        if (y()) {
            iT = this.f130083e.s();
        } else {
            iT = this.f130083e.t();
        }
        if (this.f130083e.f130105k == 1) {
            if (y()) {
                i10 = this.f130083e.f130104j;
            } else {
                i10 = this.f130083e.f130103i;
            }
            iT += i10;
        }
        return iT + this.f130083e.c();
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
            this.f130080b.draw(canvas);
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
