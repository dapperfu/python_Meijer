package te;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import ce.C6503b;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;
import com.medallia.digital.mobilesdk.l3;
import java.util.BitSet;
import ke.C15121a;
import me.C15711a;
import se.C17068a;
import te.C17239m;
import te.C17240n;
import te.C17241o;

/* renamed from: te.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17234h extends Drawable implements InterfaceC17242p, FSDraw {

    /* renamed from: x, reason: collision with root package name */
    private static final String f162501x = "h";

    /* renamed from: y, reason: collision with root package name */
    private static final Paint f162502y;

    /* renamed from: a, reason: collision with root package name */
    private c f162503a;

    /* renamed from: b, reason: collision with root package name */
    private final C17241o.g[] f162504b;

    /* renamed from: c, reason: collision with root package name */
    private final C17241o.g[] f162505c;

    /* renamed from: d, reason: collision with root package name */
    private final BitSet f162506d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f162507e;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f162508f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f162509g;

    /* renamed from: h, reason: collision with root package name */
    private final Path f162510h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f162511i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f162512j;

    /* renamed from: k, reason: collision with root package name */
    private final Region f162513k;

    /* renamed from: l, reason: collision with root package name */
    private final Region f162514l;

    /* renamed from: m, reason: collision with root package name */
    private C17239m f162515m;

    /* renamed from: n, reason: collision with root package name */
    private final Paint f162516n;

    /* renamed from: o, reason: collision with root package name */
    private final Paint f162517o;

    /* renamed from: p, reason: collision with root package name */
    private final C17068a f162518p;

    /* renamed from: q, reason: collision with root package name */
    private final C17240n.b f162519q;

    /* renamed from: r, reason: collision with root package name */
    private final C17240n f162520r;

    /* renamed from: s, reason: collision with root package name */
    private PorterDuffColorFilter f162521s;

    /* renamed from: t, reason: collision with root package name */
    private PorterDuffColorFilter f162522t;

    /* renamed from: u, reason: collision with root package name */
    private int f162523u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f162524v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f162525w;

    /* renamed from: te.h$a */
    class a implements C17240n.b {
        a() {
        }

        @Override // te.C17240n.b
        public void a(C17241o c17241o, Matrix matrix, int i10) {
            C17234h.this.f162506d.set(i10, c17241o.e());
            C17234h.this.f162504b[i10] = c17241o.f(matrix);
        }

        @Override // te.C17240n.b
        public void b(C17241o c17241o, Matrix matrix, int i10) {
            C17234h.this.f162506d.set(i10 + 4, c17241o.e());
            C17234h.this.f162505c[i10] = c17241o.f(matrix);
        }
    }

    /* renamed from: te.h$b */
    class b implements C17239m.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f162527a;

        b(float f10) {
            this.f162527a = f10;
        }

        @Override // te.C17239m.c
        public InterfaceC17229c a(InterfaceC17229c interfaceC17229c) {
            return interfaceC17229c instanceof C17237k ? interfaceC17229c : new C17228b(this.f162527a, interfaceC17229c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: te.h$c */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        C17239m f162529a;

        /* renamed from: b, reason: collision with root package name */
        C15711a f162530b;

        /* renamed from: c, reason: collision with root package name */
        ColorFilter f162531c;

        /* renamed from: d, reason: collision with root package name */
        ColorStateList f162532d;

        /* renamed from: e, reason: collision with root package name */
        ColorStateList f162533e;

        /* renamed from: f, reason: collision with root package name */
        ColorStateList f162534f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f162535g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f162536h;

        /* renamed from: i, reason: collision with root package name */
        Rect f162537i;

        /* renamed from: j, reason: collision with root package name */
        float f162538j;

        /* renamed from: k, reason: collision with root package name */
        float f162539k;

        /* renamed from: l, reason: collision with root package name */
        float f162540l;

        /* renamed from: m, reason: collision with root package name */
        int f162541m;

        /* renamed from: n, reason: collision with root package name */
        float f162542n;

        /* renamed from: o, reason: collision with root package name */
        float f162543o;

        /* renamed from: p, reason: collision with root package name */
        float f162544p;

        /* renamed from: q, reason: collision with root package name */
        int f162545q;

        /* renamed from: r, reason: collision with root package name */
        int f162546r;

        /* renamed from: s, reason: collision with root package name */
        int f162547s;

        /* renamed from: t, reason: collision with root package name */
        int f162548t;

        /* renamed from: u, reason: collision with root package name */
        boolean f162549u;

        /* renamed from: v, reason: collision with root package name */
        Paint.Style f162550v;

        public c(C17239m c17239m, C15711a c15711a) {
            this.f162532d = null;
            this.f162533e = null;
            this.f162534f = null;
            this.f162535g = null;
            this.f162536h = PorterDuff.Mode.SRC_IN;
            this.f162537i = null;
            this.f162538j = 1.0f;
            this.f162539k = 1.0f;
            this.f162541m = l3.f93323c;
            this.f162542n = 0.0f;
            this.f162543o = 0.0f;
            this.f162544p = 0.0f;
            this.f162545q = 0;
            this.f162546r = 0;
            this.f162547s = 0;
            this.f162548t = 0;
            this.f162549u = false;
            this.f162550v = Paint.Style.FILL_AND_STROKE;
            this.f162529a = c17239m;
            this.f162530b = c15711a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C17234h c17234h = new C17234h(this);
            c17234h.f162507e = true;
            return c17234h;
        }

        public c(c cVar) {
            this.f162532d = null;
            this.f162533e = null;
            this.f162534f = null;
            this.f162535g = null;
            this.f162536h = PorterDuff.Mode.SRC_IN;
            this.f162537i = null;
            this.f162538j = 1.0f;
            this.f162539k = 1.0f;
            this.f162541m = l3.f93323c;
            this.f162542n = 0.0f;
            this.f162543o = 0.0f;
            this.f162544p = 0.0f;
            this.f162545q = 0;
            this.f162546r = 0;
            this.f162547s = 0;
            this.f162548t = 0;
            this.f162549u = false;
            this.f162550v = Paint.Style.FILL_AND_STROKE;
            this.f162529a = cVar.f162529a;
            this.f162530b = cVar.f162530b;
            this.f162540l = cVar.f162540l;
            this.f162531c = cVar.f162531c;
            this.f162532d = cVar.f162532d;
            this.f162533e = cVar.f162533e;
            this.f162536h = cVar.f162536h;
            this.f162535g = cVar.f162535g;
            this.f162541m = cVar.f162541m;
            this.f162538j = cVar.f162538j;
            this.f162547s = cVar.f162547s;
            this.f162545q = cVar.f162545q;
            this.f162549u = cVar.f162549u;
            this.f162539k = cVar.f162539k;
            this.f162542n = cVar.f162542n;
            this.f162543o = cVar.f162543o;
            this.f162544p = cVar.f162544p;
            this.f162546r = cVar.f162546r;
            this.f162548t = cVar.f162548t;
            this.f162534f = cVar.f162534f;
            this.f162550v = cVar.f162550v;
            if (cVar.f162537i != null) {
                this.f162537i = new Rect(cVar.f162537i);
            }
        }
    }

    public C17234h() {
        this(new C17239m());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f162507e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f162507e = true;
        super.onBoundsChange(rect);
    }

    static {
        Paint paint = new Paint(1);
        f162502y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C17234h(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(C17239m.e(context, attributeSet, i10, i11).m());
    }

    private boolean N() {
        c cVar = this.f162503a;
        int i10 = cVar.f162545q;
        if (i10 == 1 || cVar.f162546r <= 0) {
            return false;
        }
        return i10 == 2 || X();
    }

    private boolean O() {
        Paint.Style style = this.f162503a.f162550v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean P() {
        Paint.Style style = this.f162503a.f162550v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f162517o.getStrokeWidth() > 0.0f;
    }

    private static int V(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private PorterDuffColorFilter f(Paint paint, boolean z10) {
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iL = l(color);
        this.f162523u = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    public static C17234h m(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(C15121a.c(context, C6503b.f61556s, C17234h.class.getSimpleName()));
        }
        C17234h c17234h = new C17234h();
        c17234h.Q(context);
        c17234h.b0(colorStateList);
        c17234h.a0(f10);
        return c17234h;
    }

    private boolean m0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f162503a.f162532d == null || color2 == (colorForState2 = this.f162503a.f162532d.getColorForState(iArr, (color2 = this.f162516n.getColor())))) {
            z10 = false;
        } else {
            this.f162516n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f162503a.f162533e == null || color == (colorForState = this.f162503a.f162533e.getColorForState(iArr, (color = this.f162517o.getColor())))) {
            return z10;
        }
        this.f162517o.setColor(colorForState);
        return true;
    }

    private void n(Canvas canvas) {
        if (this.f162506d.cardinality() > 0) {
            FS.log_w(f162501x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f162503a.f162547s != 0) {
            canvas.drawPath(this.f162509g, this.f162518p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f162504b[i10].b(this.f162518p, this.f162503a.f162546r, canvas);
            this.f162505c[i10].b(this.f162518p, this.f162503a.f162546r, canvas);
        }
        if (this.f162525w) {
            int iB = B();
            int iC = C();
            canvas.translate(-iB, -iC);
            canvas.drawPath(this.f162509g, f162502y);
            canvas.translate(iB, iC);
        }
    }

    private boolean n0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f162521s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f162522t;
        c cVar = this.f162503a;
        this.f162521s = k(cVar.f162535g, cVar.f162536h, this.f162516n, true);
        c cVar2 = this.f162503a;
        this.f162522t = k(cVar2.f162534f, cVar2.f162536h, this.f162517o, false);
        c cVar3 = this.f162503a;
        if (cVar3.f162549u) {
            this.f162518p.d(cVar3.f162535g.getColorForState(getState(), 0));
        }
        return (o2.c.a(porterDuffColorFilter, this.f162521s) && o2.c.a(porterDuffColorFilter2, this.f162522t)) ? false : true;
    }

    private void o(Canvas canvas) {
        q(canvas, this.f162516n, this.f162509g, this.f162503a.f162529a, u());
    }

    private RectF v() {
        this.f162512j.set(u());
        float fG = G();
        this.f162512j.inset(fG, fG);
        return this.f162512j;
    }

    public int A() {
        return this.f162523u;
    }

    public int B() {
        c cVar = this.f162503a;
        return (int) (cVar.f162547s * Math.sin(Math.toRadians(cVar.f162548t)));
    }

    public int C() {
        c cVar = this.f162503a;
        return (int) (cVar.f162547s * Math.cos(Math.toRadians(cVar.f162548t)));
    }

    public int D() {
        return this.f162503a.f162546r;
    }

    public C17239m E() {
        return this.f162503a.f162529a;
    }

    public ColorStateList F() {
        return this.f162503a.f162533e;
    }

    public float H() {
        return this.f162503a.f162540l;
    }

    public ColorStateList I() {
        return this.f162503a.f162535g;
    }

    public float J() {
        return this.f162503a.f162529a.r().a(u());
    }

    public float K() {
        return this.f162503a.f162529a.t().a(u());
    }

    public float L() {
        return this.f162503a.f162544p;
    }

    public void Q(Context context) {
        this.f162503a.f162530b = new C15711a(context);
        o0();
    }

    public boolean S() {
        C15711a c15711a = this.f162503a.f162530b;
        return c15711a != null && c15711a.e();
    }

    public boolean T() {
        return this.f162503a.f162529a.u(u());
    }

    public boolean X() {
        return (T() || this.f162509g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Y(float f10) {
        setShapeAppearanceModel(this.f162503a.f162529a.w(f10));
    }

    public void Z(InterfaceC17229c interfaceC17229c) {
        setShapeAppearanceModel(this.f162503a.f162529a.x(interfaceC17229c));
    }

    public void a0(float f10) {
        c cVar = this.f162503a;
        if (cVar.f162543o != f10) {
            cVar.f162543o = f10;
            o0();
        }
    }

    public void b0(ColorStateList colorStateList) {
        c cVar = this.f162503a;
        if (cVar.f162532d != colorStateList) {
            cVar.f162532d = colorStateList;
            onStateChange(getState());
        }
    }

    public void c0(float f10) {
        c cVar = this.f162503a;
        if (cVar.f162539k != f10) {
            cVar.f162539k = f10;
            this.f162507e = true;
            invalidateSelf();
        }
    }

    public void d0(int i10, int i11, int i12, int i13) {
        c cVar = this.f162503a;
        if (cVar.f162537i == null) {
            cVar.f162537i = new Rect();
        }
        this.f162503a.f162537i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f162516n.setColorFilter(this.f162521s);
        int alpha = this.f162516n.getAlpha();
        this.f162516n.setAlpha(V(alpha, this.f162503a.f162541m));
        this.f162517o.setColorFilter(this.f162522t);
        this.f162517o.setStrokeWidth(this.f162503a.f162540l);
        int alpha2 = this.f162517o.getAlpha();
        this.f162517o.setAlpha(V(alpha2, this.f162503a.f162541m));
        if (this.f162507e) {
            i();
            g(u(), this.f162509g);
            this.f162507e = false;
        }
        U(canvas);
        if (O()) {
            o(canvas);
        }
        if (P()) {
            r(canvas);
        }
        this.f162516n.setAlpha(alpha);
        this.f162517o.setAlpha(alpha2);
    }

    public void e0(float f10) {
        c cVar = this.f162503a;
        if (cVar.f162542n != f10) {
            cVar.f162542n = f10;
            o0();
        }
    }

    public void f0(boolean z10) {
        this.f162525w = z10;
    }

    public void g0(int i10) {
        this.f162518p.d(i10);
        this.f162503a.f162549u = false;
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f162503a.f162541m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f162503a;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f162503a.f162545q == 2) {
            return;
        }
        if (T()) {
            outline.setRoundRect(getBounds(), J() * this.f162503a.f162539k);
        } else {
            g(u(), this.f162509g);
            com.google.android.material.drawable.d.j(outline, this.f162509g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f162503a.f162537i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    protected final void h(RectF rectF, Path path) {
        C17240n c17240n = this.f162520r;
        c cVar = this.f162503a;
        c17240n.e(cVar.f162529a, cVar.f162539k, rectF, this.f162519q, path);
    }

    public void h0(int i10) {
        c cVar = this.f162503a;
        if (cVar.f162545q != i10) {
            cVar.f162545q = i10;
            R();
        }
    }

    public void k0(ColorStateList colorStateList) {
        c cVar = this.f162503a;
        if (cVar.f162533e != colorStateList) {
            cVar.f162533e = colorStateList;
            onStateChange(getState());
        }
    }

    public void l0(float f10) {
        this.f162503a.f162540l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f162503a = new c(this.f162503a);
        return this;
    }

    protected void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f162503a.f162529a, rectF);
    }

    protected void r(Canvas canvas) {
        q(canvas, this.f162517o, this.f162510h, this.f162515m, v());
    }

    public float s() {
        return this.f162503a.f162529a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f162503a;
        if (cVar.f162541m != i10) {
            cVar.f162541m = i10;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f162503a.f162531c = colorFilter;
        R();
    }

    @Override // te.InterfaceC17242p
    public void setShapeAppearanceModel(C17239m c17239m) {
        this.f162503a.f162529a = c17239m;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f162503a.f162535g = colorStateList;
        n0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f162503a;
        if (cVar.f162536h != mode) {
            cVar.f162536h = mode;
            n0();
            R();
        }
    }

    public float t() {
        return this.f162503a.f162529a.l().a(u());
    }

    protected RectF u() {
        this.f162511i.set(getBounds());
        return this.f162511i;
    }

    public float w() {
        return this.f162503a.f162543o;
    }

    public ColorStateList x() {
        return this.f162503a.f162532d;
    }

    public float y() {
        return this.f162503a.f162539k;
    }

    public float z() {
        return this.f162503a.f162542n;
    }

    public C17234h(C17239m c17239m) {
        this(new c(c17239m, null));
    }

    private float G() {
        if (P()) {
            return this.f162517o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private void R() {
        super.invalidateSelf();
    }

    private void U(Canvas canvas) {
        if (!N()) {
            return;
        }
        canvas.save();
        W(canvas);
        if (!this.f162525w) {
            n(canvas);
            canvas.restore();
            return;
        }
        int iWidth = (int) (this.f162524v.width() - getBounds().width());
        int iHeight = (int) (this.f162524v.height() - getBounds().height());
        if (iWidth >= 0 && iHeight >= 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f162524v.width()) + (this.f162503a.f162546r * 2) + iWidth, ((int) this.f162524v.height()) + (this.f162503a.f162546r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f162503a.f162546r) - iWidth;
            float f11 = (getBounds().top - this.f162503a.f162546r) - iHeight;
            canvas2.translate(-f10, -f11);
            n(canvas2);
            canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
            FS.bitmap_recycle(bitmapCreateBitmap);
            canvas.restore();
            return;
        }
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    private void W(Canvas canvas) {
        canvas.translate(B(), C());
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f162503a.f162538j != 1.0f) {
            this.f162508f.reset();
            Matrix matrix = this.f162508f;
            float f10 = this.f162503a.f162538j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f162508f);
        }
        path.computeBounds(this.f162524v, true);
    }

    private void i() {
        C17239m c17239mY = E().y(new b(-G()));
        this.f162515m = c17239mY;
        this.f162520r.d(c17239mY, this.f162503a.f162539k, v(), this.f162510h);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f162523u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private void o0() {
        float fM = M();
        this.f162503a.f162546r = (int) Math.ceil(0.75f * fM);
        this.f162503a.f162547s = (int) Math.ceil(fM * 0.25f);
        n0();
        R();
    }

    private void q(Canvas canvas, Paint paint, Path path, C17239m c17239m, RectF rectF) {
        if (c17239m.u(rectF)) {
            float fA = c17239m.t().a(rectF) * this.f162503a.f162539k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public float M() {
        return w() + L();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f162513k.set(getBounds());
        g(u(), this.f162509g);
        this.f162514l.setPath(this.f162509g, this.f162513k);
        this.f162513k.op(this.f162514l, Region.Op.DIFFERENCE);
        return this.f162513k;
    }

    public void i0(float f10, int i10) {
        l0(f10);
        k0(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.f162503a.f162535g;
            if (colorStateList == null || !colorStateList.isStateful()) {
                ColorStateList colorStateList2 = this.f162503a.f162534f;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.f162503a.f162533e;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        ColorStateList colorStateList4 = this.f162503a.f162532d;
                        if (colorStateList4 == null || !colorStateList4.isStateful()) {
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public void j0(float f10, ColorStateList colorStateList) {
        l0(f10);
        k0(colorStateList);
    }

    protected int l(int i10) {
        float fM = M() + z();
        C15711a c15711a = this.f162503a.f162530b;
        if (c15711a != null) {
            return c15711a.c(i10, fM);
        }
        return i10;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.q.b
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean zM0 = m0(iArr);
        boolean zN0 = n0();
        if (!zM0 && !zN0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    protected C17234h(c cVar) {
        C17240n c17240n;
        this.f162504b = new C17241o.g[4];
        this.f162505c = new C17241o.g[4];
        this.f162506d = new BitSet(8);
        this.f162508f = new Matrix();
        this.f162509g = new Path();
        this.f162510h = new Path();
        this.f162511i = new RectF();
        this.f162512j = new RectF();
        this.f162513k = new Region();
        this.f162514l = new Region();
        Paint paint = new Paint(1);
        this.f162516n = paint;
        Paint paint2 = new Paint(1);
        this.f162517o = paint2;
        this.f162518p = new C17068a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c17240n = C17240n.k();
        } else {
            c17240n = new C17240n();
        }
        this.f162520r = c17240n;
        this.f162524v = new RectF();
        this.f162525w = true;
        this.f162503a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        n0();
        m0(getState());
        this.f162519q = new a();
    }
}
