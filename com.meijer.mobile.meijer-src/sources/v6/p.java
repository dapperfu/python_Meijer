package v6;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import c2.EnumC6474a;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;
import d0.W;
import i6.C14689a;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: B, reason: collision with root package name */
    private static final Matrix f165649B = new Matrix();

    /* renamed from: A, reason: collision with root package name */
    private C17643d f165650A;

    /* renamed from: a, reason: collision with root package name */
    private Canvas f165651a;

    /* renamed from: b, reason: collision with root package name */
    private a f165652b;

    /* renamed from: c, reason: collision with root package name */
    private b f165653c;

    /* renamed from: d, reason: collision with root package name */
    private RectF f165654d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f165655e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f165656f;

    /* renamed from: g, reason: collision with root package name */
    private RectF f165657g;

    /* renamed from: h, reason: collision with root package name */
    private RectF f165658h;

    /* renamed from: i, reason: collision with root package name */
    private Rect f165659i;

    /* renamed from: j, reason: collision with root package name */
    private RectF f165660j;

    /* renamed from: k, reason: collision with root package name */
    private Paint f165661k;

    /* renamed from: l, reason: collision with root package name */
    private Bitmap f165662l;

    /* renamed from: m, reason: collision with root package name */
    private Canvas f165663m;

    /* renamed from: n, reason: collision with root package name */
    private Rect f165664n;

    /* renamed from: o, reason: collision with root package name */
    private C14689a f165665o;

    /* renamed from: p, reason: collision with root package name */
    Matrix f165666p;

    /* renamed from: q, reason: collision with root package name */
    float[] f165667q;

    /* renamed from: r, reason: collision with root package name */
    private Bitmap f165668r;

    /* renamed from: s, reason: collision with root package name */
    private Bitmap f165669s;

    /* renamed from: t, reason: collision with root package name */
    private Canvas f165670t;

    /* renamed from: u, reason: collision with root package name */
    private Canvas f165671u;

    /* renamed from: v, reason: collision with root package name */
    private C14689a f165672v;

    /* renamed from: w, reason: collision with root package name */
    private BlurMaskFilter f165673w;

    /* renamed from: x, reason: collision with root package name */
    private float f165674x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    private RenderNode f165675y;

    /* renamed from: z, reason: collision with root package name */
    private RenderNode f165676z;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f165677a;

        /* renamed from: b, reason: collision with root package name */
        public EnumC6474a f165678b;

        /* renamed from: c, reason: collision with root package name */
        public ColorFilter f165679c;

        /* renamed from: d, reason: collision with root package name */
        public C17643d f165680d;

        public boolean a() {
            EnumC6474a enumC6474a = this.f165678b;
            return (enumC6474a == null || enumC6474a == EnumC6474a.SRC_OVER) ? false : true;
        }

        public boolean b() {
            return this.f165679c != null;
        }

        public boolean c() {
            return this.f165680d != null;
        }

        public boolean e() {
            return this.f165677a < 255;
        }

        public void f() {
            this.f165677a = l3.f93323c;
            this.f165678b = null;
            this.f165679c = null;
            this.f165680d = null;
        }

        public a() {
            f();
        }

        public boolean d() {
            if (!e() && !a() && !c() && !b()) {
                return true;
            }
            return false;
        }
    }

    protected enum b {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    private boolean g(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    private RectF b(RectF rectF, C17643d c17643d) {
        if (this.f165655e == null) {
            this.f165655e = new RectF();
        }
        if (this.f165657g == null) {
            this.f165657g = new RectF();
        }
        this.f165655e.set(rectF);
        this.f165655e.offsetTo(rectF.left + c17643d.f(), rectF.top + c17643d.g());
        this.f165655e.inset(-c17643d.h(), -c17643d.h());
        this.f165657g.set(rectF);
        this.f165655e.union(this.f165657g);
        return this.f165655e;
    }

    private void h(Canvas canvas, C17643d c17643d) {
        C14689a c14689a;
        RectF rectF = this.f165654d;
        if (rectF == null || this.f165662l == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF rectFB = b(rectF, c17643d);
        if (this.f165656f == null) {
            this.f165656f = new Rect();
        }
        this.f165656f.set((int) Math.floor(rectFB.left), (int) Math.floor(rectFB.top), (int) Math.ceil(rectFB.right), (int) Math.ceil(rectFB.bottom));
        float[] fArr = this.f165667q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        if (this.f165658h == null) {
            this.f165658h = new RectF();
        }
        this.f165658h.set(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        if (this.f165659i == null) {
            this.f165659i = new Rect();
        }
        this.f165659i.set(0, 0, Math.round(this.f165658h.width()), Math.round(this.f165658h.height()));
        if (g(this.f165668r, this.f165658h)) {
            Bitmap bitmap = this.f165668r;
            if (bitmap != null) {
                d(bitmap);
            }
            Bitmap bitmap2 = this.f165669s;
            if (bitmap2 != null) {
                d(bitmap2);
            }
            this.f165668r = a(this.f165658h, Bitmap.Config.ARGB_8888);
            this.f165669s = a(this.f165658h, Bitmap.Config.ALPHA_8);
            this.f165670t = new Canvas(this.f165668r);
            this.f165671u = new Canvas(this.f165669s);
        } else {
            Canvas canvas2 = this.f165670t;
            if (canvas2 == null || this.f165671u == null || (c14689a = this.f165665o) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.f165659i, c14689a);
            this.f165671u.drawRect(this.f165659i, this.f165665o);
        }
        if (this.f165669s == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f165672v == null) {
            this.f165672v = new C14689a(1);
        }
        RectF rectF2 = this.f165654d;
        this.f165671u.drawBitmap(this.f165662l, Math.round((rectF2.left - rectFB.left) * f10), Math.round((rectF2.top - rectFB.top) * f11), (Paint) null);
        if (this.f165673w == null || this.f165674x != c17643d.h()) {
            float fH = (c17643d.h() * (f10 + f11)) / 2.0f;
            if (fH > 0.0f) {
                this.f165673w = new BlurMaskFilter(fH, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.f165673w = null;
            }
            this.f165674x = c17643d.h();
        }
        this.f165672v.setColor(c17643d.e());
        if (c17643d.h() > 0.0f) {
            this.f165672v.setMaskFilter(this.f165673w);
        } else {
            this.f165672v.setMaskFilter(null);
        }
        this.f165672v.setFilterBitmap(true);
        this.f165670t.drawBitmap(this.f165669s, Math.round(c17643d.f() * f10), Math.round(c17643d.g() * f11), this.f165672v);
        canvas.drawBitmap(this.f165668r, this.f165659i, this.f165656f, this.f165661k);
    }

    private void i(Canvas canvas, C17643d c17643d) {
        if (this.f165675y == null || this.f165676z == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.f165667q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        C17643d c17643d2 = this.f165650A;
        if (c17643d2 == null || !c17643d.j(c17643d2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(c17643d.e(), PorterDuff.Mode.SRC_IN));
            if (c17643d.h() > 0.0f) {
                float fH = (c17643d.h() * (f10 + f11)) / 2.0f;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(fH, fH, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.f165676z.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.f165650A = c17643d;
        }
        RectF rectFB = b(this.f165654d, c17643d);
        RectF rectF = new RectF(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        this.f165676z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.f165676z.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((-rectF.left) + (c17643d.f() * f10), (-rectF.top) + (c17643d.g() * f11));
        recordingCanvasBeginRecording.drawRenderNode(this.f165675y);
        this.f165676z.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.f165676z);
        canvas.restore();
    }

    public void e() {
        if (this.f165651a == null || this.f165652b == null || this.f165667q == null || this.f165654d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iOrdinal = this.f165653c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f165651a.restore();
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                if (this.f165675y == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f165651a.save();
                Canvas canvas = this.f165651a;
                float[] fArr = this.f165667q;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.f165675y.endRecording();
                if (this.f165652b.c()) {
                    i(this.f165651a, this.f165652b.f165680d);
                }
                this.f165651a.drawRenderNode(this.f165675y);
                this.f165651a.restore();
            }
        } else {
            if (this.f165662l == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.f165652b.c()) {
                h(this.f165651a, this.f165652b.f165680d);
            }
            if (this.f165664n == null) {
                this.f165664n = new Rect();
            }
            this.f165664n.set(0, 0, (int) (this.f165654d.width() * this.f165667q[0]), (int) (this.f165654d.height() * this.f165667q[4]));
            this.f165651a.drawBitmap(this.f165662l, this.f165664n, this.f165654d, this.f165661k);
        }
        this.f165651a = null;
    }

    public boolean f() {
        return this.f165653c == b.RENDER_NODE;
    }

    public Canvas j(Canvas canvas, RectF rectF, a aVar) {
        if (this.f165651a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f165667q == null) {
            this.f165667q = new float[9];
        }
        if (this.f165666p == null) {
            this.f165666p = new Matrix();
        }
        canvas.getMatrix(this.f165666p);
        this.f165666p.getValues(this.f165667q);
        float[] fArr = this.f165667q;
        float f10 = fArr[0];
        float f11 = fArr[4];
        if (this.f165660j == null) {
            this.f165660j = new RectF();
        }
        this.f165660j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f165651a = canvas;
        this.f165652b = aVar;
        this.f165653c = c(canvas, aVar);
        if (this.f165654d == null) {
            this.f165654d = new RectF();
        }
        this.f165654d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f165661k == null) {
            this.f165661k = new C14689a();
        }
        this.f165661k.reset();
        int iOrdinal = this.f165653c.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.f165661k.setAlpha(aVar.f165677a);
            this.f165661k.setColorFilter(aVar.f165679c);
            if (aVar.a()) {
                c2.e.b(this.f165661k, aVar.f165678b);
            }
            q.n(canvas, rectF, this.f165661k);
            return canvas;
        }
        if (iOrdinal == 2) {
            if (this.f165665o == null) {
                C14689a c14689a = new C14689a();
                this.f165665o = c14689a;
                c14689a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (g(this.f165662l, this.f165660j)) {
                Bitmap bitmap = this.f165662l;
                if (bitmap != null) {
                    d(bitmap);
                }
                this.f165662l = a(this.f165660j, Bitmap.Config.ARGB_8888);
                this.f165663m = new Canvas(this.f165662l);
            } else {
                Canvas canvas2 = this.f165663m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(f165649B);
                this.f165663m.drawRect(-1.0f, -1.0f, this.f165660j.width() + 1.0f, this.f165660j.height() + 1.0f, this.f165665o);
            }
            c2.e.b(this.f165661k, aVar.f165678b);
            this.f165661k.setColorFilter(aVar.f165679c);
            this.f165661k.setAlpha(aVar.f165677a);
            Canvas canvas3 = this.f165663m;
            canvas3.scale(f10, f11);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (iOrdinal != 3) {
            throw new RuntimeException("Invalid render strategy for OffscreenLayer");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
        }
        if (this.f165675y == null) {
            this.f165675y = W.a("OffscreenLayer.main");
        }
        if (aVar.c() && this.f165676z == null) {
            this.f165676z = W.a("OffscreenLayer.shadow");
            this.f165650A = null;
        }
        if (aVar.a() || aVar.b()) {
            if (this.f165661k == null) {
                this.f165661k = new C14689a();
            }
            this.f165661k.reset();
            c2.e.b(this.f165661k, aVar.f165678b);
            this.f165661k.setColorFilter(aVar.f165679c);
            this.f165675y.setUseCompositingLayer(true, this.f165661k);
            if (aVar.c()) {
                RenderNode renderNode = this.f165676z;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f165661k);
            }
        }
        this.f165675y.setAlpha(aVar.f165677a / 255.0f);
        if (aVar.c()) {
            RenderNode renderNode2 = this.f165676z;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(aVar.f165677a / 255.0f);
        }
        this.f165675y.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f165675y;
        RectF rectF2 = this.f165660j;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f165675y.beginRecording((int) this.f165660j.width(), (int) this.f165660j.height());
        recordingCanvasBeginRecording.setMatrix(f165649B);
        recordingCanvasBeginRecording.scale(f10, f11);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }

    private Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    private b c(Canvas canvas, a aVar) {
        if (aVar.d()) {
            return b.DIRECT;
        }
        if (!aVar.c()) {
            return b.SAVE_LAYER;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && canvas.isHardwareAccelerated()) {
            if (i10 <= 31) {
                return b.BITMAP;
            }
            return b.RENDER_NODE;
        }
        return b.BITMAP;
    }

    private void d(Bitmap bitmap) {
        FS.bitmap_recycle(bitmap);
    }
}
