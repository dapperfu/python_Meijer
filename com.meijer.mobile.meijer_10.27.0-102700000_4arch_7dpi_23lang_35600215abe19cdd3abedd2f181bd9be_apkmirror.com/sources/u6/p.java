package u6;

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
import c2.EnumC6348a;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;
import d0.W;
import h6.C14380a;

/* loaded from: classes4.dex */
public class p {

    /* renamed from: B, reason: collision with root package name */
    private static final Matrix f162720B = new Matrix();

    /* renamed from: A, reason: collision with root package name */
    private C17230d f162721A;

    /* renamed from: a, reason: collision with root package name */
    private Canvas f162722a;

    /* renamed from: b, reason: collision with root package name */
    private a f162723b;

    /* renamed from: c, reason: collision with root package name */
    private b f162724c;

    /* renamed from: d, reason: collision with root package name */
    private RectF f162725d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f162726e;

    /* renamed from: f, reason: collision with root package name */
    private Rect f162727f;

    /* renamed from: g, reason: collision with root package name */
    private RectF f162728g;

    /* renamed from: h, reason: collision with root package name */
    private RectF f162729h;

    /* renamed from: i, reason: collision with root package name */
    private Rect f162730i;

    /* renamed from: j, reason: collision with root package name */
    private RectF f162731j;

    /* renamed from: k, reason: collision with root package name */
    private Paint f162732k;

    /* renamed from: l, reason: collision with root package name */
    private Bitmap f162733l;

    /* renamed from: m, reason: collision with root package name */
    private Canvas f162734m;

    /* renamed from: n, reason: collision with root package name */
    private Rect f162735n;

    /* renamed from: o, reason: collision with root package name */
    private C14380a f162736o;

    /* renamed from: p, reason: collision with root package name */
    Matrix f162737p;

    /* renamed from: q, reason: collision with root package name */
    float[] f162738q;

    /* renamed from: r, reason: collision with root package name */
    private Bitmap f162739r;

    /* renamed from: s, reason: collision with root package name */
    private Bitmap f162740s;

    /* renamed from: t, reason: collision with root package name */
    private Canvas f162741t;

    /* renamed from: u, reason: collision with root package name */
    private Canvas f162742u;

    /* renamed from: v, reason: collision with root package name */
    private C14380a f162743v;

    /* renamed from: w, reason: collision with root package name */
    private BlurMaskFilter f162744w;

    /* renamed from: x, reason: collision with root package name */
    private float f162745x = 0.0f;

    /* renamed from: y, reason: collision with root package name */
    private RenderNode f162746y;

    /* renamed from: z, reason: collision with root package name */
    private RenderNode f162747z;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f162748a;

        /* renamed from: b, reason: collision with root package name */
        public EnumC6348a f162749b;

        /* renamed from: c, reason: collision with root package name */
        public ColorFilter f162750c;

        /* renamed from: d, reason: collision with root package name */
        public C17230d f162751d;

        public boolean a() {
            EnumC6348a enumC6348a = this.f162749b;
            return (enumC6348a == null || enumC6348a == EnumC6348a.SRC_OVER) ? false : true;
        }

        public boolean b() {
            return this.f162750c != null;
        }

        public boolean c() {
            return this.f162751d != null;
        }

        public boolean e() {
            return this.f162748a < 255;
        }

        public void f() {
            this.f162748a = l3.f92484c;
            this.f162749b = null;
            this.f162750c = null;
            this.f162751d = null;
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

    private RectF b(RectF rectF, C17230d c17230d) {
        if (this.f162726e == null) {
            this.f162726e = new RectF();
        }
        if (this.f162728g == null) {
            this.f162728g = new RectF();
        }
        this.f162726e.set(rectF);
        this.f162726e.offsetTo(rectF.left + c17230d.f(), rectF.top + c17230d.g());
        this.f162726e.inset(-c17230d.h(), -c17230d.h());
        this.f162728g.set(rectF);
        this.f162726e.union(this.f162728g);
        return this.f162726e;
    }

    private void h(Canvas canvas, C17230d c17230d) {
        C14380a c14380a;
        RectF rectF = this.f162725d;
        if (rectF == null || this.f162733l == null) {
            throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
        }
        RectF rectFB = b(rectF, c17230d);
        if (this.f162727f == null) {
            this.f162727f = new Rect();
        }
        this.f162727f.set((int) Math.floor(rectFB.left), (int) Math.floor(rectFB.top), (int) Math.ceil(rectFB.right), (int) Math.ceil(rectFB.bottom));
        float[] fArr = this.f162738q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        if (this.f162729h == null) {
            this.f162729h = new RectF();
        }
        this.f162729h.set(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        if (this.f162730i == null) {
            this.f162730i = new Rect();
        }
        this.f162730i.set(0, 0, Math.round(this.f162729h.width()), Math.round(this.f162729h.height()));
        if (g(this.f162739r, this.f162729h)) {
            Bitmap bitmap = this.f162739r;
            if (bitmap != null) {
                d(bitmap);
            }
            Bitmap bitmap2 = this.f162740s;
            if (bitmap2 != null) {
                d(bitmap2);
            }
            this.f162739r = a(this.f162729h, Bitmap.Config.ARGB_8888);
            this.f162740s = a(this.f162729h, Bitmap.Config.ALPHA_8);
            this.f162741t = new Canvas(this.f162739r);
            this.f162742u = new Canvas(this.f162740s);
        } else {
            Canvas canvas2 = this.f162741t;
            if (canvas2 == null || this.f162742u == null || (c14380a = this.f162736o) == null) {
                throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
            }
            canvas2.drawRect(this.f162730i, c14380a);
            this.f162742u.drawRect(this.f162730i, this.f162736o);
        }
        if (this.f162740s == null) {
            throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
        }
        if (this.f162743v == null) {
            this.f162743v = new C14380a(1);
        }
        RectF rectF2 = this.f162725d;
        this.f162742u.drawBitmap(this.f162733l, Math.round((rectF2.left - rectFB.left) * f10), Math.round((rectF2.top - rectFB.top) * f11), (Paint) null);
        if (this.f162744w == null || this.f162745x != c17230d.h()) {
            float fH = (c17230d.h() * (f10 + f11)) / 2.0f;
            if (fH > 0.0f) {
                this.f162744w = new BlurMaskFilter(fH, BlurMaskFilter.Blur.NORMAL);
            } else {
                this.f162744w = null;
            }
            this.f162745x = c17230d.h();
        }
        this.f162743v.setColor(c17230d.e());
        if (c17230d.h() > 0.0f) {
            this.f162743v.setMaskFilter(this.f162744w);
        } else {
            this.f162743v.setMaskFilter(null);
        }
        this.f162743v.setFilterBitmap(true);
        this.f162741t.drawBitmap(this.f162740s, Math.round(c17230d.f() * f10), Math.round(c17230d.g() * f11), this.f162743v);
        canvas.drawBitmap(this.f162739r, this.f162730i, this.f162727f, this.f162732k);
    }

    private void i(Canvas canvas, C17230d c17230d) {
        if (this.f162746y == null || this.f162747z == null) {
            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new RuntimeException("RenderEffect is not supported on API level <31");
        }
        float[] fArr = this.f162738q;
        float f10 = fArr != null ? fArr[0] : 1.0f;
        float f11 = fArr != null ? fArr[4] : 1.0f;
        C17230d c17230d2 = this.f162721A;
        if (c17230d2 == null || !c17230d.j(c17230d2)) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(c17230d.e(), PorterDuff.Mode.SRC_IN));
            if (c17230d.h() > 0.0f) {
                float fH = (c17230d.h() * (f10 + f11)) / 2.0f;
                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(fH, fH, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
            }
            this.f162747z.setRenderEffect(renderEffectCreateColorFilterEffect);
            this.f162721A = c17230d;
        }
        RectF rectFB = b(this.f162725d, c17230d);
        RectF rectF = new RectF(rectFB.left * f10, rectFB.top * f11, rectFB.right * f10, rectFB.bottom * f11);
        this.f162747z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
        RecordingCanvas recordingCanvasBeginRecording = this.f162747z.beginRecording((int) rectF.width(), (int) rectF.height());
        recordingCanvasBeginRecording.translate((-rectF.left) + (c17230d.f() * f10), (-rectF.top) + (c17230d.g() * f11));
        recordingCanvasBeginRecording.drawRenderNode(this.f162746y);
        this.f162747z.endRecording();
        canvas.save();
        canvas.translate(rectF.left, rectF.top);
        canvas.drawRenderNode(this.f162747z);
        canvas.restore();
    }

    public void e() {
        if (this.f162722a == null || this.f162723b == null || this.f162738q == null || this.f162725d == null) {
            throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int iOrdinal = this.f162724c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            this.f162722a.restore();
        } else if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                if (this.f162746y == null) {
                    throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                }
                if (Build.VERSION.SDK_INT < 29) {
                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                }
                this.f162722a.save();
                Canvas canvas = this.f162722a;
                float[] fArr = this.f162738q;
                canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                this.f162746y.endRecording();
                if (this.f162723b.c()) {
                    i(this.f162722a, this.f162723b.f162751d);
                }
                this.f162722a.drawRenderNode(this.f162746y);
                this.f162722a.restore();
            }
        } else {
            if (this.f162733l == null) {
                throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
            }
            if (this.f162723b.c()) {
                h(this.f162722a, this.f162723b.f162751d);
            }
            if (this.f162735n == null) {
                this.f162735n = new Rect();
            }
            this.f162735n.set(0, 0, (int) (this.f162725d.width() * this.f162738q[0]), (int) (this.f162725d.height() * this.f162738q[4]));
            this.f162722a.drawBitmap(this.f162733l, this.f162735n, this.f162725d, this.f162732k);
        }
        this.f162722a = null;
    }

    public boolean f() {
        return this.f162724c == b.RENDER_NODE;
    }

    public Canvas j(Canvas canvas, RectF rectF, a aVar) {
        if (this.f162722a != null) {
            throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.f162738q == null) {
            this.f162738q = new float[9];
        }
        if (this.f162737p == null) {
            this.f162737p = new Matrix();
        }
        canvas.getMatrix(this.f162737p);
        this.f162737p.getValues(this.f162738q);
        float[] fArr = this.f162738q;
        float f10 = fArr[0];
        float f11 = fArr[4];
        if (this.f162731j == null) {
            this.f162731j = new RectF();
        }
        this.f162731j.set(rectF.left * f10, rectF.top * f11, rectF.right * f10, rectF.bottom * f11);
        this.f162722a = canvas;
        this.f162723b = aVar;
        this.f162724c = c(canvas, aVar);
        if (this.f162725d == null) {
            this.f162725d = new RectF();
        }
        this.f162725d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f162732k == null) {
            this.f162732k = new C14380a();
        }
        this.f162732k.reset();
        int iOrdinal = this.f162724c.ordinal();
        if (iOrdinal == 0) {
            canvas.save();
            return canvas;
        }
        if (iOrdinal == 1) {
            this.f162732k.setAlpha(aVar.f162748a);
            this.f162732k.setColorFilter(aVar.f162750c);
            if (aVar.a()) {
                c2.e.b(this.f162732k, aVar.f162749b);
            }
            q.n(canvas, rectF, this.f162732k);
            return canvas;
        }
        if (iOrdinal == 2) {
            if (this.f162736o == null) {
                C14380a c14380a = new C14380a();
                this.f162736o = c14380a;
                c14380a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (g(this.f162733l, this.f162731j)) {
                Bitmap bitmap = this.f162733l;
                if (bitmap != null) {
                    d(bitmap);
                }
                this.f162733l = a(this.f162731j, Bitmap.Config.ARGB_8888);
                this.f162734m = new Canvas(this.f162733l);
            } else {
                Canvas canvas2 = this.f162734m;
                if (canvas2 == null) {
                    throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(f162720B);
                this.f162734m.drawRect(-1.0f, -1.0f, this.f162731j.width() + 1.0f, this.f162731j.height() + 1.0f, this.f162736o);
            }
            c2.e.b(this.f162732k, aVar.f162749b);
            this.f162732k.setColorFilter(aVar.f162750c);
            this.f162732k.setAlpha(aVar.f162748a);
            Canvas canvas3 = this.f162734m;
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
        if (this.f162746y == null) {
            this.f162746y = W.a("OffscreenLayer.main");
        }
        if (aVar.c() && this.f162747z == null) {
            this.f162747z = W.a("OffscreenLayer.shadow");
            this.f162721A = null;
        }
        if (aVar.a() || aVar.b()) {
            if (this.f162732k == null) {
                this.f162732k = new C14380a();
            }
            this.f162732k.reset();
            c2.e.b(this.f162732k, aVar.f162749b);
            this.f162732k.setColorFilter(aVar.f162750c);
            this.f162746y.setUseCompositingLayer(true, this.f162732k);
            if (aVar.c()) {
                RenderNode renderNode = this.f162747z;
                if (renderNode == null) {
                    throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode.setUseCompositingLayer(true, this.f162732k);
            }
        }
        this.f162746y.setAlpha(aVar.f162748a / 255.0f);
        if (aVar.c()) {
            RenderNode renderNode2 = this.f162747z;
            if (renderNode2 == null) {
                throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
            }
            renderNode2.setAlpha(aVar.f162748a / 255.0f);
        }
        this.f162746y.setHasOverlappingRendering(true);
        RenderNode renderNode3 = this.f162746y;
        RectF rectF2 = this.f162731j;
        renderNode3.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f162746y.beginRecording((int) this.f162731j.width(), (int) this.f162731j.height());
        recordingCanvasBeginRecording.setMatrix(f162720B);
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
