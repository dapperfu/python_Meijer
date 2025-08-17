package re;

import ae.C5597b;
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
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDraw;
import com.medallia.digital.mobilesdk.l3;
import ie.C14718a;
import java.util.BitSet;
import ke.C15140a;
import qe.C16520a;
import re.C16765m;
import re.C16766n;
import re.C16767o;

/* renamed from: re.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16760h extends Drawable implements InterfaceC16768p, FSDraw {

    /* renamed from: x, reason: collision with root package name */
    private static final String f158011x = "h";

    /* renamed from: y, reason: collision with root package name */
    private static final Paint f158012y;

    /* renamed from: a, reason: collision with root package name */
    private c f158013a;

    /* renamed from: b, reason: collision with root package name */
    private final C16767o.g[] f158014b;

    /* renamed from: c, reason: collision with root package name */
    private final C16767o.g[] f158015c;

    /* renamed from: d, reason: collision with root package name */
    private final BitSet f158016d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f158017e;

    /* renamed from: f, reason: collision with root package name */
    private final Matrix f158018f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f158019g;

    /* renamed from: h, reason: collision with root package name */
    private final Path f158020h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f158021i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f158022j;

    /* renamed from: k, reason: collision with root package name */
    private final Region f158023k;

    /* renamed from: l, reason: collision with root package name */
    private final Region f158024l;

    /* renamed from: m, reason: collision with root package name */
    private C16765m f158025m;

    /* renamed from: n, reason: collision with root package name */
    private final Paint f158026n;

    /* renamed from: o, reason: collision with root package name */
    private final Paint f158027o;

    /* renamed from: p, reason: collision with root package name */
    private final C16520a f158028p;

    /* renamed from: q, reason: collision with root package name */
    private final C16766n.b f158029q;

    /* renamed from: r, reason: collision with root package name */
    private final C16766n f158030r;

    /* renamed from: s, reason: collision with root package name */
    private PorterDuffColorFilter f158031s;

    /* renamed from: t, reason: collision with root package name */
    private PorterDuffColorFilter f158032t;

    /* renamed from: u, reason: collision with root package name */
    private int f158033u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f158034v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f158035w;

    /* renamed from: re.h$a */
    class a implements C16766n.b {
        a() {
        }

        @Override // re.C16766n.b
        public void a(C16767o c16767o, Matrix matrix, int i10) {
            C16760h.this.f158016d.set(i10, c16767o.e());
            C16760h.this.f158014b[i10] = c16767o.f(matrix);
        }

        @Override // re.C16766n.b
        public void b(C16767o c16767o, Matrix matrix, int i10) {
            C16760h.this.f158016d.set(i10 + 4, c16767o.e());
            C16760h.this.f158015c[i10] = c16767o.f(matrix);
        }
    }

    /* renamed from: re.h$b */
    class b implements C16765m.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f158037a;

        b(float f10) {
            this.f158037a = f10;
        }

        @Override // re.C16765m.c
        public InterfaceC16755c a(InterfaceC16755c interfaceC16755c) {
            return interfaceC16755c instanceof C16763k ? interfaceC16755c : new C16754b(this.f158037a, interfaceC16755c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: re.h$c */
    public static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        C16765m f158039a;

        /* renamed from: b, reason: collision with root package name */
        C15140a f158040b;

        /* renamed from: c, reason: collision with root package name */
        ColorFilter f158041c;

        /* renamed from: d, reason: collision with root package name */
        ColorStateList f158042d;

        /* renamed from: e, reason: collision with root package name */
        ColorStateList f158043e;

        /* renamed from: f, reason: collision with root package name */
        ColorStateList f158044f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f158045g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f158046h;

        /* renamed from: i, reason: collision with root package name */
        Rect f158047i;

        /* renamed from: j, reason: collision with root package name */
        float f158048j;

        /* renamed from: k, reason: collision with root package name */
        float f158049k;

        /* renamed from: l, reason: collision with root package name */
        float f158050l;

        /* renamed from: m, reason: collision with root package name */
        int f158051m;

        /* renamed from: n, reason: collision with root package name */
        float f158052n;

        /* renamed from: o, reason: collision with root package name */
        float f158053o;

        /* renamed from: p, reason: collision with root package name */
        float f158054p;

        /* renamed from: q, reason: collision with root package name */
        int f158055q;

        /* renamed from: r, reason: collision with root package name */
        int f158056r;

        /* renamed from: s, reason: collision with root package name */
        int f158057s;

        /* renamed from: t, reason: collision with root package name */
        int f158058t;

        /* renamed from: u, reason: collision with root package name */
        boolean f158059u;

        /* renamed from: v, reason: collision with root package name */
        Paint.Style f158060v;

        public c(C16765m c16765m, C15140a c15140a) {
            this.f158042d = null;
            this.f158043e = null;
            this.f158044f = null;
            this.f158045g = null;
            this.f158046h = PorterDuff.Mode.SRC_IN;
            this.f158047i = null;
            this.f158048j = 1.0f;
            this.f158049k = 1.0f;
            this.f158051m = l3.f92484c;
            this.f158052n = 0.0f;
            this.f158053o = 0.0f;
            this.f158054p = 0.0f;
            this.f158055q = 0;
            this.f158056r = 0;
            this.f158057s = 0;
            this.f158058t = 0;
            this.f158059u = false;
            this.f158060v = Paint.Style.FILL_AND_STROKE;
            this.f158039a = c16765m;
            this.f158040b = c15140a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C16760h c16760h = new C16760h(this);
            c16760h.f158017e = true;
            return c16760h;
        }

        public c(c cVar) {
            this.f158042d = null;
            this.f158043e = null;
            this.f158044f = null;
            this.f158045g = null;
            this.f158046h = PorterDuff.Mode.SRC_IN;
            this.f158047i = null;
            this.f158048j = 1.0f;
            this.f158049k = 1.0f;
            this.f158051m = l3.f92484c;
            this.f158052n = 0.0f;
            this.f158053o = 0.0f;
            this.f158054p = 0.0f;
            this.f158055q = 0;
            this.f158056r = 0;
            this.f158057s = 0;
            this.f158058t = 0;
            this.f158059u = false;
            this.f158060v = Paint.Style.FILL_AND_STROKE;
            this.f158039a = cVar.f158039a;
            this.f158040b = cVar.f158040b;
            this.f158050l = cVar.f158050l;
            this.f158041c = cVar.f158041c;
            this.f158042d = cVar.f158042d;
            this.f158043e = cVar.f158043e;
            this.f158046h = cVar.f158046h;
            this.f158045g = cVar.f158045g;
            this.f158051m = cVar.f158051m;
            this.f158048j = cVar.f158048j;
            this.f158057s = cVar.f158057s;
            this.f158055q = cVar.f158055q;
            this.f158059u = cVar.f158059u;
            this.f158049k = cVar.f158049k;
            this.f158052n = cVar.f158052n;
            this.f158053o = cVar.f158053o;
            this.f158054p = cVar.f158054p;
            this.f158056r = cVar.f158056r;
            this.f158058t = cVar.f158058t;
            this.f158044f = cVar.f158044f;
            this.f158060v = cVar.f158060v;
            if (cVar.f158047i != null) {
                this.f158047i = new Rect(cVar.f158047i);
            }
        }
    }

    public C16760h() {
        this(new C16765m());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f158017e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f158017e = true;
        super.onBoundsChange(rect);
    }

    static {
        Paint paint = new Paint(1);
        f158012y = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C16760h(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(C16765m.e(context, attributeSet, i10, i11).m());
    }

    private boolean N() {
        c cVar = this.f158013a;
        int i10 = cVar.f158055q;
        if (i10 == 1 || cVar.f158056r <= 0) {
            return false;
        }
        return i10 == 2 || X();
    }

    private boolean O() {
        Paint.Style style = this.f158013a.f158060v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean P() {
        Paint.Style style = this.f158013a.f158060v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f158027o.getStrokeWidth() > 0.0f;
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
        this.f158033u = iL;
        if (iL != color) {
            return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        return (colorStateList == null || mode == null) ? f(paint, z10) : j(colorStateList, mode, z10);
    }

    public static C16760h m(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(C14718a.c(context, C5597b.f44541s, C16760h.class.getSimpleName()));
        }
        C16760h c16760h = new C16760h();
        c16760h.Q(context);
        c16760h.b0(colorStateList);
        c16760h.a0(f10);
        return c16760h;
    }

    private boolean m0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f158013a.f158042d == null || color2 == (colorForState2 = this.f158013a.f158042d.getColorForState(iArr, (color2 = this.f158026n.getColor())))) {
            z10 = false;
        } else {
            this.f158026n.setColor(colorForState2);
            z10 = true;
        }
        if (this.f158013a.f158043e == null || color == (colorForState = this.f158013a.f158043e.getColorForState(iArr, (color = this.f158027o.getColor())))) {
            return z10;
        }
        this.f158027o.setColor(colorForState);
        return true;
    }

    private void n(Canvas canvas) {
        if (this.f158016d.cardinality() > 0) {
            FS.log_w(f158011x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f158013a.f158057s != 0) {
            canvas.drawPath(this.f158019g, this.f158028p.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f158014b[i10].b(this.f158028p, this.f158013a.f158056r, canvas);
            this.f158015c[i10].b(this.f158028p, this.f158013a.f158056r, canvas);
        }
        if (this.f158035w) {
            int iB = B();
            int iC = C();
            canvas.translate(-iB, -iC);
            canvas.drawPath(this.f158019g, f158012y);
            canvas.translate(iB, iC);
        }
    }

    private boolean n0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f158031s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f158032t;
        c cVar = this.f158013a;
        this.f158031s = k(cVar.f158045g, cVar.f158046h, this.f158026n, true);
        c cVar2 = this.f158013a;
        this.f158032t = k(cVar2.f158044f, cVar2.f158046h, this.f158027o, false);
        c cVar3 = this.f158013a;
        if (cVar3.f158059u) {
            this.f158028p.d(cVar3.f158045g.getColorForState(getState(), 0));
        }
        return (o2.c.a(porterDuffColorFilter, this.f158031s) && o2.c.a(porterDuffColorFilter2, this.f158032t)) ? false : true;
    }

    private void o(Canvas canvas) {
        q(canvas, this.f158026n, this.f158019g, this.f158013a.f158039a, u());
    }

    private RectF v() {
        this.f158022j.set(u());
        float fG = G();
        this.f158022j.inset(fG, fG);
        return this.f158022j;
    }

    public int A() {
        return this.f158033u;
    }

    public int B() {
        c cVar = this.f158013a;
        return (int) (cVar.f158057s * Math.sin(Math.toRadians(cVar.f158058t)));
    }

    public int C() {
        c cVar = this.f158013a;
        return (int) (cVar.f158057s * Math.cos(Math.toRadians(cVar.f158058t)));
    }

    public int D() {
        return this.f158013a.f158056r;
    }

    public C16765m E() {
        return this.f158013a.f158039a;
    }

    public ColorStateList F() {
        return this.f158013a.f158043e;
    }

    public float H() {
        return this.f158013a.f158050l;
    }

    public ColorStateList I() {
        return this.f158013a.f158045g;
    }

    public float J() {
        return this.f158013a.f158039a.r().a(u());
    }

    public float K() {
        return this.f158013a.f158039a.t().a(u());
    }

    public float L() {
        return this.f158013a.f158054p;
    }

    public void Q(Context context) {
        this.f158013a.f158040b = new C15140a(context);
        o0();
    }

    public boolean S() {
        C15140a c15140a = this.f158013a.f158040b;
        return c15140a != null && c15140a.e();
    }

    public boolean T() {
        return this.f158013a.f158039a.u(u());
    }

    public boolean X() {
        return (T() || this.f158019g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public void Y(float f10) {
        setShapeAppearanceModel(this.f158013a.f158039a.w(f10));
    }

    public void Z(InterfaceC16755c interfaceC16755c) {
        setShapeAppearanceModel(this.f158013a.f158039a.x(interfaceC16755c));
    }

    public void a0(float f10) {
        c cVar = this.f158013a;
        if (cVar.f158053o != f10) {
            cVar.f158053o = f10;
            o0();
        }
    }

    public void b0(ColorStateList colorStateList) {
        c cVar = this.f158013a;
        if (cVar.f158042d != colorStateList) {
            cVar.f158042d = colorStateList;
            onStateChange(getState());
        }
    }

    public void c0(float f10) {
        c cVar = this.f158013a;
        if (cVar.f158049k != f10) {
            cVar.f158049k = f10;
            this.f158017e = true;
            invalidateSelf();
        }
    }

    public void d0(int i10, int i11, int i12, int i13) {
        c cVar = this.f158013a;
        if (cVar.f158047i == null) {
            cVar.f158047i = new Rect();
        }
        this.f158013a.f158047i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f158026n.setColorFilter(this.f158031s);
        int alpha = this.f158026n.getAlpha();
        this.f158026n.setAlpha(V(alpha, this.f158013a.f158051m));
        this.f158027o.setColorFilter(this.f158032t);
        this.f158027o.setStrokeWidth(this.f158013a.f158050l);
        int alpha2 = this.f158027o.getAlpha();
        this.f158027o.setAlpha(V(alpha2, this.f158013a.f158051m));
        if (this.f158017e) {
            i();
            g(u(), this.f158019g);
            this.f158017e = false;
        }
        U(canvas);
        if (O()) {
            o(canvas);
        }
        if (P()) {
            r(canvas);
        }
        this.f158026n.setAlpha(alpha);
        this.f158027o.setAlpha(alpha2);
    }

    public void e0(float f10) {
        c cVar = this.f158013a;
        if (cVar.f158052n != f10) {
            cVar.f158052n = f10;
            o0();
        }
    }

    public void f0(boolean z10) {
        this.f158035w = z10;
    }

    public void g0(int i10) {
        this.f158028p.d(i10);
        this.f158013a.f158059u = false;
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f158013a.f158051m;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f158013a;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f158013a.f158055q == 2) {
            return;
        }
        if (T()) {
            outline.setRoundRect(getBounds(), J() * this.f158013a.f158049k);
        } else {
            g(u(), this.f158019g);
            com.google.android.material.drawable.d.j(outline, this.f158019g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f158013a.f158047i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    protected final void h(RectF rectF, Path path) {
        C16766n c16766n = this.f158030r;
        c cVar = this.f158013a;
        c16766n.e(cVar.f158039a, cVar.f158049k, rectF, this.f158029q, path);
    }

    public void h0(int i10) {
        c cVar = this.f158013a;
        if (cVar.f158055q != i10) {
            cVar.f158055q = i10;
            R();
        }
    }

    public void k0(ColorStateList colorStateList) {
        c cVar = this.f158013a;
        if (cVar.f158043e != colorStateList) {
            cVar.f158043e = colorStateList;
            onStateChange(getState());
        }
    }

    public void l0(float f10) {
        this.f158013a.f158050l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f158013a = new c(this.f158013a);
        return this;
    }

    protected void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f158013a.f158039a, rectF);
    }

    protected void r(Canvas canvas) {
        q(canvas, this.f158027o, this.f158020h, this.f158025m, v());
    }

    public float s() {
        return this.f158013a.f158039a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f158013a;
        if (cVar.f158051m != i10) {
            cVar.f158051m = i10;
            R();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f158013a.f158041c = colorFilter;
        R();
    }

    @Override // re.InterfaceC16768p
    public void setShapeAppearanceModel(C16765m c16765m) {
        this.f158013a.f158039a = c16765m;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f158013a.f158045g = colorStateList;
        n0();
        R();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f158013a;
        if (cVar.f158046h != mode) {
            cVar.f158046h = mode;
            n0();
            R();
        }
    }

    public float t() {
        return this.f158013a.f158039a.l().a(u());
    }

    protected RectF u() {
        this.f158021i.set(getBounds());
        return this.f158021i;
    }

    public float w() {
        return this.f158013a.f158053o;
    }

    public ColorStateList x() {
        return this.f158013a.f158042d;
    }

    public float y() {
        return this.f158013a.f158049k;
    }

    public float z() {
        return this.f158013a.f158052n;
    }

    public C16760h(C16765m c16765m) {
        this(new c(c16765m, null));
    }

    private float G() {
        if (P()) {
            return this.f158027o.getStrokeWidth() / 2.0f;
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
        if (!this.f158035w) {
            n(canvas);
            canvas.restore();
            return;
        }
        int iWidth = (int) (this.f158034v.width() - getBounds().width());
        int iHeight = (int) (this.f158034v.height() - getBounds().height());
        if (iWidth >= 0 && iHeight >= 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f158034v.width()) + (this.f158013a.f158056r * 2) + iWidth, ((int) this.f158034v.height()) + (this.f158013a.f158056r * 2) + iHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap);
            float f10 = (getBounds().left - this.f158013a.f158056r) - iWidth;
            float f11 = (getBounds().top - this.f158013a.f158056r) - iHeight;
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
        if (this.f158013a.f158048j != 1.0f) {
            this.f158018f.reset();
            Matrix matrix = this.f158018f;
            float f10 = this.f158013a.f158048j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f158018f);
        }
        path.computeBounds(this.f158034v, true);
    }

    private void i() {
        C16765m c16765mY = E().y(new b(-G()));
        this.f158025m = c16765mY;
        this.f158030r.d(c16765mY, this.f158013a.f158049k, v(), this.f158020h);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = l(colorForState);
        }
        this.f158033u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private void o0() {
        float fM = M();
        this.f158013a.f158056r = (int) Math.ceil(0.75f * fM);
        this.f158013a.f158057s = (int) Math.ceil(fM * 0.25f);
        n0();
        R();
    }

    private void q(Canvas canvas, Paint paint, Path path, C16765m c16765m, RectF rectF) {
        if (c16765m.u(rectF)) {
            float fA = c16765m.t().a(rectF) * this.f158013a.f158049k;
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
        this.f158023k.set(getBounds());
        g(u(), this.f158019g);
        this.f158024l.setPath(this.f158019g, this.f158023k);
        this.f158023k.op(this.f158024l, Region.Op.DIFFERENCE);
        return this.f158023k;
    }

    public void i0(float f10, int i10) {
        l0(f10);
        k0(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.f158013a.f158045g;
            if (colorStateList == null || !colorStateList.isStateful()) {
                ColorStateList colorStateList2 = this.f158013a.f158044f;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    ColorStateList colorStateList3 = this.f158013a.f158043e;
                    if (colorStateList3 == null || !colorStateList3.isStateful()) {
                        ColorStateList colorStateList4 = this.f158013a.f158042d;
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
        C15140a c15140a = this.f158013a.f158040b;
        if (c15140a != null) {
            return c15140a.c(i10, fM);
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

    protected C16760h(c cVar) {
        C16766n c16766n;
        this.f158014b = new C16767o.g[4];
        this.f158015c = new C16767o.g[4];
        this.f158016d = new BitSet(8);
        this.f158018f = new Matrix();
        this.f158019g = new Path();
        this.f158020h = new Path();
        this.f158021i = new RectF();
        this.f158022j = new RectF();
        this.f158023k = new Region();
        this.f158024l = new Region();
        Paint paint = new Paint(1);
        this.f158026n = paint;
        Paint paint2 = new Paint(1);
        this.f158027o = paint2;
        this.f158028p = new C16520a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c16766n = C16766n.k();
        } else {
            c16766n = new C16766n();
        }
        this.f158030r = c16766n;
        this.f158034v = new RectF();
        this.f158035w = true;
        this.f158013a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        n0();
        m0(getState());
        this.f158029q = new a();
    }
}
