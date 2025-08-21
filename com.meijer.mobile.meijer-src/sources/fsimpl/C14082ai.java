package fsimpl;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fullstory.instrumentation.frameworks.compose.FSComposeAndroidViewHolder;
import com.fullstory.instrumentation.frameworks.compose.FSComposeChildLayerDependenciesTracker;
import com.fullstory.instrumentation.frameworks.compose.FSComposeGraphicsLayer;
import com.fullstory.instrumentation.frameworks.compose.FSComposeLayoutNode;
import com.fullstory.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: fsimpl.ai, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C14082ai extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f132833a = new HashSet();

    /* renamed from: A, reason: collision with root package name */
    private String f132834A;

    /* renamed from: B, reason: collision with root package name */
    private boolean f132835B;

    /* renamed from: C, reason: collision with root package name */
    private final boolean f132836C;

    /* renamed from: D, reason: collision with root package name */
    private final boolean f132837D;

    /* renamed from: E, reason: collision with root package name */
    private final boolean[] f132838E;

    /* renamed from: b, reason: collision with root package name */
    private boolean f132839b;

    /* renamed from: c, reason: collision with root package name */
    private final C14138ck f132840c;

    /* renamed from: d, reason: collision with root package name */
    private final C14185ee f132841d;

    /* renamed from: e, reason: collision with root package name */
    private final dG f132842e;

    /* renamed from: f, reason: collision with root package name */
    private final aO f132843f;

    /* renamed from: g, reason: collision with root package name */
    private final aZ f132844g;

    /* renamed from: h, reason: collision with root package name */
    private final C14093at f132845h;

    /* renamed from: i, reason: collision with root package name */
    private final bV f132846i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC14101ba f132847j;

    /* renamed from: k, reason: collision with root package name */
    private final Matrix f132848k;

    /* renamed from: l, reason: collision with root package name */
    private final float[] f132849l;

    /* renamed from: m, reason: collision with root package name */
    private final Rect f132850m;

    /* renamed from: n, reason: collision with root package name */
    private LinkedHashMap f132851n;

    /* renamed from: o, reason: collision with root package name */
    private List f132852o;

    /* renamed from: p, reason: collision with root package name */
    private List f132853p;

    /* renamed from: q, reason: collision with root package name */
    private Map f132854q;

    /* renamed from: r, reason: collision with root package name */
    private short f132855r;

    /* renamed from: s, reason: collision with root package name */
    private final Bitmap f132856s;

    /* renamed from: t, reason: collision with root package name */
    private View f132857t;

    /* renamed from: u, reason: collision with root package name */
    private C14252y f132858u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f132859v;

    /* renamed from: w, reason: collision with root package name */
    private float f132860w;

    /* renamed from: x, reason: collision with root package name */
    private float f132861x;

    /* renamed from: y, reason: collision with root package name */
    private int f132862y;

    /* renamed from: z, reason: collision with root package name */
    private int f132863z;

    public C14082ai(C14138ck c14138ck, C14185ee c14185ee, Bitmap bitmap, dG dGVar, InterfaceC14101ba interfaceC14101ba, aO aOVar, C14093at c14093at, aZ aZVar, bV bVVar, boolean z10, boolean z11) {
        super(bitmap);
        this.f132848k = new Matrix();
        this.f132849l = new float[9];
        this.f132850m = new Rect();
        this.f132855r = (short) -1;
        this.f132838E = new boolean[]{false};
        this.f132840c = c14138ck;
        this.f132841d = c14185ee;
        this.f132856s = bitmap;
        this.f132842e = dGVar;
        this.f132847j = interfaceC14101ba;
        this.f132843f = aOVar;
        this.f132845h = c14093at;
        this.f132844g = aZVar;
        this.f132846i = bVVar;
        this.f132836C = z10;
        this.f132837D = z11;
        super.save();
        this.f132862y = 1;
        this.f132863z = -1;
    }

    private int a(Bitmap bitmap) {
        return c(bitmap) ? this.f132847j.b(bitmap) : this.f132847j.a(bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    private static int a(Paint paint, Typeface typeface) {
        boolean z10;
        if (typeface != null) {
            boolean zIsBold = typeface.isBold();
            z10 = zIsBold;
            if (typeface.isItalic()) {
                z10 = (zIsBold ? 1 : 0) | 2;
            }
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        if (paint.isFakeBoldText()) {
            z11 = (z10 ? 1 : 0) | true;
        }
        ?? r02 = z11;
        if ((paint.getFlags() & 8) != 0) {
            r02 = (z11 ? 1 : 0) | 4;
        }
        return (paint.getFlags() & 16) != 0 ? r02 | 8 : r02;
    }

    private void a(ColorFilter colorFilter) {
        if (colorFilter instanceof PorterDuffColorFilter) {
            this.f132844g.a((PorterDuffColorFilter) colorFilter, this.f132842e);
            return;
        }
        if (colorFilter != null) {
            if (C14233fz.f133547g == null || !C14233fz.f133547g.isInstance(colorFilter)) {
                c("unhandled color filter: " + colorFilter.getClass());
            } else {
                this.f132844g.a(colorFilter, this.f132842e);
            }
        }
    }

    private void a(Matrix matrix) {
        if (matrix != null) {
            matrix.getValues(this.f132849l);
            this.f132842e.a((byte) 10, this.f132849l);
        }
    }

    private void a(Paint paint) {
        a(paint, true);
    }

    private void a(Paint paint, String str) {
        Integer numA;
        Typeface typeface = paint.getTypeface();
        if (p()) {
            paint.getTextBounds("X", 0, 1, this.f132850m);
        } else {
            paint.getTextBounds(str, 0, str.length(), this.f132850m);
        }
        float fMeasureText = paint.measureText(str, 0, str.length());
        this.f132842e.f(paint.getColor());
        this.f132842e.c(paint.getTextSize());
        this.f132842e.l(a(paint, typeface));
        this.f132842e.m(paint.getTextAlign().ordinal());
        this.f132842e.c(0, this.f132850m.top, (int) fMeasureText, this.f132850m.bottom);
        if (typeface == null || (numA = this.f132845h.a(typeface)) == null) {
            return;
        }
        this.f132842e.q(numA.intValue());
    }

    private void a(Paint paint, boolean z10) {
        if (paint == null) {
            this.f132842e.d();
            return;
        }
        this.f132842e.f(paint.getColor());
        this.f132842e.g(paint.getStyle().ordinal());
        this.f132842e.b(paint.getStrokeWidth());
        a(paint.getColorFilter());
        if (paint.getXfermode() instanceof PorterDuffXfermode) {
            this.f132844g.a((PorterDuffXfermode) paint.getXfermode(), this.f132842e);
        } else if (paint.getXfermode() != null) {
            c("unhandled xfer mode: " + paint.getXfermode().getClass());
        }
        if (paint.getMaskFilter() != null) {
            c("unhandled mask filter: " + paint.getMaskFilter().getClass());
        }
        if (paint.getPathEffect() != null) {
            c("unhandled path effect: " + paint.getPathEffect().getClass());
        }
        if (z10) {
            Shader shader = paint.getShader();
            if (!(shader instanceof BitmapShader)) {
                if (shader != null) {
                    this.f132842e.i(this.f132847j.a(shader));
                    return;
                }
                return;
            }
            BitmapShader bitmapShader = (BitmapShader) shader;
            if (C14073a.a()) {
                this.f132842e.h(a(C14073a.a(bitmapShader)));
            } else {
                Log.i("Unable to record the bitmap from the BitmapShader instance");
            }
            this.f132843f.a(this.f132842e, bitmapShader);
            if (bitmapShader.getLocalMatrix(this.f132848k)) {
                this.f132848k.getValues(this.f132849l);
                this.f132842e.a(this.f132849l);
            }
        }
    }

    private void a(Path path) {
        this.f132842e.b(this.f132847j.a(path));
        this.f132842e.c(path.getFillType().ordinal());
    }

    private void a(Drawable drawable) {
        Paint paint;
        if (!gb.a(drawable)) {
            Log.e("Only VectorDrawables and AnimatedVectorDrawables are allowed in fsDrawVectorDrawable");
            return;
        }
        if (a((short) 5)) {
            this.f132842e.d(b(drawable));
            drawable.copyBounds(this.f132850m);
            this.f132842e.b(this.f132850m.left, this.f132850m.top, this.f132850m.right, this.f132850m.bottom);
            if (gb.b(drawable)) {
                paint = null;
            } else {
                paint = new Paint(0);
                paint.setColorFilter(drawable.getColorFilter() != null ? drawable.getColorFilter() : gb.c(drawable));
            }
            a(paint, false);
            o();
        }
    }

    private void a(AbsSeekBar absSeekBar) {
        Drawable tickMark = absSeekBar.getTickMark();
        if (tickMark != null) {
            int max = absSeekBar.getMax() - absSeekBar.getMin();
            if (max > 1) {
                int intrinsicWidth = tickMark.getIntrinsicWidth();
                int intrinsicHeight = tickMark.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                int width = absSeekBar.getWidth();
                int height = absSeekBar.getHeight();
                int paddingLeft = absSeekBar.getPaddingLeft();
                int paddingRight = absSeekBar.getPaddingRight();
                tickMark.setBounds(-i10, -i11, i10, i11);
                float f10 = ((width - paddingLeft) - paddingRight) / max;
                int iSave = save();
                translate(paddingLeft, height / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    tickMark.draw(this);
                    translate(f10, 0.0f);
                }
                restoreToCount(iSave);
            }
        }
    }

    private void a(ProgressBar progressBar) {
        Drawable drawableA = AbstractC14239l.a(progressBar);
        boolean zB = AbstractC14239l.b(progressBar);
        if (drawableA != null) {
            int iSave = save();
            boolean zIsLayoutRtl = progressBar.isLayoutRtl();
            int width = progressBar.getWidth();
            int paddingRight = progressBar.getPaddingRight();
            int paddingRight2 = progressBar.getPaddingRight();
            int paddingTop = progressBar.getPaddingTop();
            Drawable current = drawableA.getCurrent();
            if (zIsLayoutRtl && zB) {
                translate(width - paddingRight2, paddingTop);
                scale(-1.0f, 1.0f);
            } else {
                translate(paddingRight, paddingTop);
            }
            if (gb.a(current)) {
                a(current);
            } else {
                drawableA.draw(this);
            }
            restoreToCount(iSave);
        }
    }

    private void a(String str, float f10, float f11, Paint paint) {
        this.f132842e.a(this.f132847j.a(b(str)));
        this.f132842e.a(f10, f11);
        a(paint, str);
    }

    private void a(String str, int i10, int i11, Paint paint) {
        this.f132842e.a(this.f132847j.a(b(str)));
        this.f132842e.a(i10, i11);
        a(paint, str);
    }

    private boolean a(float f10, float f11, float f12, float f13) {
        return ((int) f12) - ((int) f10) == 0 || ((int) f13) - ((int) f11) == 0;
    }

    private boolean a(Rect rect) {
        return rect.right - rect.left == 0 || rect.bottom - rect.top == 0;
    }

    private boolean a(RectF rectF) {
        return ((int) rectF.right) - ((int) rectF.left) == 0 || ((int) rectF.bottom) - ((int) rectF.top) == 0;
    }

    private static boolean a(Object obj) {
        FSComposeChildLayerDependenciesTracker fSComposeChildLayerDependenciesTracker_fsGetChildDependenciesTracker;
        if (!(obj instanceof FSComposeGraphicsLayer) || (fSComposeChildLayerDependenciesTracker_fsGetChildDependenciesTracker = ((FSComposeGraphicsLayer) obj)._fsGetChildDependenciesTracker()) == null) {
            return false;
        }
        return fSComposeChildLayerDependenciesTracker_fsGetChildDependenciesTracker.getTrackingInProgress();
    }

    private boolean a(short s10) {
        if (this.f132855r != -1 || !this.f132839b) {
            return false;
        }
        if (this.f132842e.f()) {
            if (this.f132840c.b()) {
                Log.logAlways("RecordingCanvas canvasEncoder is nearly full, not capturing Canvas operations.");
            }
            return false;
        }
        if (!n()) {
            if (this.f132840c.b()) {
                Log.logAlways("RecordingCanvas could not flush pending operations, not capturing Canvas operations.");
            }
            return false;
        }
        this.f132835B = true;
        this.f132855r = s10;
        this.f132842e.a(s10);
        return true;
    }

    private boolean a(boolean z10) {
        C14252y c14252y = this.f132858u;
        if (c14252y == null) {
            return true;
        }
        if (c14252y.a()) {
            return !z10 || this.f132837D || this.f132840c.d();
        }
        return false;
    }

    private int b(Bitmap bitmap) {
        return c((Bitmap) null) ? this.f132847j.d(bitmap) : this.f132847j.c(bitmap);
    }

    private int b(Drawable drawable) {
        return q() ? this.f132847j.b(drawable) : this.f132847j.a(drawable);
    }

    private String b(String str) {
        if (!p()) {
            return str;
        }
        String strA = fF.a(this.f132857t, str);
        this.f132842e.e();
        return strA;
    }

    private void b(Rect rect) {
        if (rect != null) {
            this.f132842e.a(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    private void b(RectF rectF) {
        if (rectF != null) {
            this.f132842e.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    private void b(AbsSeekBar absSeekBar) {
        Drawable thumb = absSeekBar.getThumb();
        if (thumb != null) {
            Drawable current = thumb.getCurrent();
            int iSave = save();
            translate(absSeekBar.getPaddingLeft() - absSeekBar.getThumbOffset(), absSeekBar.getPaddingTop());
            if (gb.a(current)) {
                a(current);
            } else {
                absSeekBar.getThumb().draw(this);
            }
            restoreToCount(iSave);
        }
    }

    private void c(Rect rect) {
        if (rect != null) {
            this.f132842e.b(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    private void c(RectF rectF) {
        if (rectF != null) {
            this.f132842e.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    private void c(AbsSeekBar absSeekBar) {
        Drawable thumb = absSeekBar.getThumb();
        if (thumb == null || !absSeekBar.getSplitTrack()) {
            a((ProgressBar) absSeekBar);
            a(absSeekBar);
            return;
        }
        Insets opticalInsets = thumb.getOpticalInsets();
        Rect rect = new Rect();
        thumb.copyBounds(rect);
        rect.offset(absSeekBar.getPaddingLeft() - absSeekBar.getThumbOffset(), absSeekBar.getPaddingTop());
        rect.left += opticalInsets.left;
        rect.right -= opticalInsets.right;
        int iSave = save();
        clipRect(rect, Region.Op.DIFFERENCE);
        a((ProgressBar) absSeekBar);
        a(absSeekBar);
        restoreToCount(iSave);
    }

    private void c(String str) {
        a("Unsupported operation: " + str);
    }

    private boolean c(Bitmap bitmap) {
        if (this.f132836C) {
            return true;
        }
        return a(d(bitmap));
    }

    private void d(String str) {
        a("Invalid operation: " + str);
    }

    private boolean d(Bitmap bitmap) {
        bV bVVar;
        if (bitmap == null || (bVVar = this.f132846i) == null) {
            return false;
        }
        return bVVar.a(bitmap, this.f132838E);
    }

    private void e(String str) {
        this.f132842e.a((short) 27);
        this.f132842e.a(this.f132847j.a(str));
    }

    private void m() {
        if (this.f132863z < 0) {
            this.f132863z = this.f132862y;
        }
    }

    private boolean n() {
        if (!this.f132859v) {
            return true;
        }
        if (Math.abs(this.f132860w) > 0.001f || Math.abs(this.f132861x) > 0.001f) {
            this.f132842e.a((short) 21);
            this.f132842e.a(this.f132860w, this.f132861x);
            o();
        }
        this.f132860w = 0.0f;
        this.f132861x = 0.0f;
        this.f132859v = false;
        return true;
    }

    private void o() {
        this.f132855r = (short) -1;
        String str = this.f132834A;
        if (str != null) {
            e(str);
            this.f132834A = null;
        }
    }

    private boolean p() {
        return r();
    }

    private boolean q() {
        if (this.f132836C) {
            return true;
        }
        return a(true);
    }

    private boolean r() {
        C14252y c14252y = this.f132858u;
        if (c14252y == null) {
            return true;
        }
        return c14252y.a();
    }

    int a(int i10, float f10, float f11, float f12, float f13) {
        if (!a((short) 3)) {
            return 0;
        }
        this.f132842e.d(i10);
        this.f132842e.b((int) f10, (int) f11, (int) f12, (int) f13);
        o();
        return i10;
    }

    int a(Bitmap bitmap, float f10, float f11, float f12, float f13) {
        if (bitmap == null || bitmap.isRecycled() || !a((short) 3)) {
            return 0;
        }
        int iB = b(bitmap);
        this.f132842e.d(iB);
        this.f132842e.b((int) f10, (int) f11, (int) f12, (int) f13);
        o();
        return iB;
    }

    LinkedHashMap a() {
        return this.f132851n;
    }

    void a(float f10, float f11, C14252y c14252y) {
        g();
        this.f132857t = null;
        this.f132858u = c14252y;
        this.f132839b = true;
        this.f132835B = false;
        this.f132859v = false;
        this.f132851n = null;
        this.f132852o = null;
        this.f132853p = null;
        this.f132854q = null;
        this.f132842e.a();
        super.restoreToCount(1);
        super.save();
        this.f132862y = 1;
        this.f132863z = -1;
        if (f10 == 0.0f && f11 == 0.0f) {
            return;
        }
        translate(-f10, -f11);
    }

    void a(Drawable drawable, View view, boolean z10) {
        if (drawable == null || view == null) {
            return;
        }
        if (!gb.a(drawable)) {
            Log.e("Only VectorDrawables and AnimatedVectorDrawables are allowed. Got: " + drawable.getClass().getName());
            return;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        if ((view instanceof ImageView) && !z10) {
            ImageView imageView = (ImageView) view;
            Matrix imageMatrix = imageView.getImageMatrix();
            int paddingTop = imageView.getPaddingTop();
            int paddingLeft = imageView.getPaddingLeft();
            if (imageMatrix != null || paddingLeft != 0 || paddingTop != 0) {
                save();
                if (imageView.getCropToPadding()) {
                    int scrollX = view.getScrollX();
                    int scrollY = view.getScrollY();
                    clipRect(scrollX + paddingLeft, scrollY + paddingTop, (scrollX + width) - view.getPaddingRight(), (scrollY + height) - view.getPaddingBottom());
                }
                translate(paddingLeft, paddingTop);
                if (imageMatrix != null) {
                    concat(imageMatrix);
                }
                a(drawable);
                restore();
                return;
            }
        }
        a(drawable);
    }

    void a(View view) {
        if (this.f132851n == null) {
            this.f132851n = new LinkedHashMap();
        }
        this.f132851n.put(view, l());
        if (a((short) 26)) {
            this.f132842e.a(gd.c(view));
            o();
        }
    }

    void a(View view, Object obj, C14252y c14252y) {
        g();
        this.f132857t = view;
        this.f132858u = c14252y;
        this.f132839b = true;
        this.f132835B = false;
        this.f132859v = false;
        this.f132851n = null;
        this.f132852o = null;
        this.f132853p = null;
        this.f132854q = null;
        this.f132842e.a();
        super.restoreToCount(1);
        super.save();
        this.f132862y = 1;
        this.f132863z = -1;
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        super.scale(super.getWidth() / width, super.getHeight() / height);
        if ((obj instanceof ViewGroup) && ((ViewGroup) obj).getClipChildren()) {
            clipRect(0, 0, width, height);
        }
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        if (scrollX == 0 && scrollY == 0) {
            return;
        }
        translate(-scrollX, -scrollY);
    }

    void a(ViewGroup viewGroup) {
        b(viewGroup);
        if (C14124bx.a(viewGroup)) {
            return;
        }
        List listA = gc.a(viewGroup);
        if (listA != null) {
            try {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    AbstractC14235h.a(viewGroup, this, (View) it.next(), 0L);
                }
                return;
            } finally {
                listA.clear();
            }
        }
        boolean zB = gc.b(viewGroup);
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            AbstractC14235h.a(viewGroup, this, viewGroup.getChildAt(zB ? gc.a(viewGroup, viewGroup.getChildCount(), i10) : i10), 0L);
        }
    }

    void a(Object obj, Object obj2, boolean z10) {
        if (obj instanceof FSComposeLayoutNode) {
            if (this.f132853p == null) {
                this.f132853p = new ArrayList();
            }
            this.f132841d.a(obj);
            aF aFVarB = gd.b(this.f132841d, obj);
            if (aFVarB != null && aFVarB.f132716d != null) {
                obj = aFVarB;
            }
            this.f132853p.add(obj);
            if (z10 && obj2 != null) {
                if (this.f132854q == null) {
                    this.f132854q = new WeakHashMap();
                }
                this.f132854q.put(obj, new C14083aj(obj2, a(obj2)));
            }
            if (a((short) 26)) {
                this.f132842e.a(gd.c(obj));
                o();
            }
        }
    }

    void a(String str) {
        if (f132833a.add(str)) {
            Log.d(str);
            if (this.f132855r == -1) {
                e(str);
            } else {
                this.f132834A = str;
            }
        }
    }

    List b() {
        return this.f132852o;
    }

    void b(View view) {
        if (this.f132852o == null) {
            this.f132852o = new ArrayList();
        }
        Rect rect = new Rect();
        boolean z10 = view instanceof FSComposeAndroidViewHolder;
        if (z10) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            C14228fu.b(childCount == 1, "AndroidViewHolder had %d children, expected 1", Integer.valueOf(childCount));
            if (childCount == 0) {
                return;
            }
            View childAt = viewGroup.getChildAt(0);
            C14228fu.b(childAt != null, "AndroidViewHolder's first child should not be null", new Object[0]);
            if (childAt == null) {
                return;
            }
            view.getLocalVisibleRect(rect);
            view = childAt;
        } else if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).getLocalVisibleRect(rect);
        } else {
            rect = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        this.f132852o.add(Pair.create(view, rect));
        if (a((short) 26)) {
            if (!z10) {
                a("Android Classic View child is not FSComposeAndroidViewHolder");
            }
            this.f132842e.a(gd.c(view));
            o();
        }
    }

    void b(ViewGroup viewGroup) {
        if (viewGroup.getClipToPadding()) {
            int paddingLeft = viewGroup.getPaddingLeft();
            int paddingTop = viewGroup.getPaddingTop();
            int paddingRight = viewGroup.getPaddingRight();
            int paddingBottom = viewGroup.getPaddingBottom();
            if (paddingLeft == 0 && paddingTop == 0 && paddingRight == 0 && paddingBottom == 0) {
                return;
            }
            int scrollX = viewGroup.getScrollX();
            int scrollY = viewGroup.getScrollY();
            clipRect(new RectF(paddingLeft + scrollX, paddingTop + scrollY, (viewGroup.getWidth() + scrollX) - paddingRight, (viewGroup.getHeight() + scrollY) - paddingBottom));
        }
    }

    List c() {
        return this.f132853p;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(Path path) {
        return clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float f10, float f11, float f12, float f13) {
        return clipRect(f10, f11, f12, f13, Region.Op.DIFFERENCE);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int i10, int i11, int i12, int i13) {
        return clipRect(i10, i11, i12, i13, Region.Op.DIFFERENCE);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(Rect rect) {
        return clipRect(rect, Region.Op.DIFFERENCE);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(RectF rectF) {
        return clipRect(rectF, Region.Op.DIFFERENCE);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        boolean zClipPath = super.clipPath(path);
        if (a((short) 28)) {
            m();
            a(path);
            o();
        }
        return zClipPath;
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path, Region.Op op2) {
        boolean zClipPath = super.clipPath(path, op2);
        if (a((short) 28)) {
            m();
            a(path);
            this.f132842e.e(op2.nativeInt);
            o();
        }
        return zClipPath;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f10, float f11, float f12, float f13) {
        boolean zClipRect = super.clipRect(f10, f11, f12, f13);
        if (a((short) 0)) {
            m();
            this.f132842e.a(f10, f11, f12, f13);
            this.f132842e.e(EnumC14180e.INTERSECT.f133308g);
            o();
        }
        return zClipRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op2) {
        boolean zClipRect = super.clipRect(f10, f11, f12, f13, op2);
        if (a((short) 0)) {
            m();
            this.f132842e.a(f10, f11, f12, f13);
            this.f132842e.e(op2.nativeInt);
            o();
        }
        return zClipRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int i10, int i11, int i12, int i13) {
        boolean zClipRect = super.clipRect(i10, i11, i12, i13);
        if (a((short) 0)) {
            m();
            this.f132842e.a(i10, i11, i12, i13);
            this.f132842e.e(EnumC14180e.INTERSECT.f133308g);
            o();
        }
        return zClipRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        boolean zClipRect = super.clipRect(rect);
        if (a((short) 0)) {
            m();
            b(rect);
            this.f132842e.e(EnumC14180e.INTERSECT.f133308g);
            o();
        }
        return zClipRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect, Region.Op op2) {
        boolean zClipRect = super.clipRect(rect, op2);
        if (a((short) 0)) {
            m();
            b(rect);
            this.f132842e.e(op2.nativeInt);
            o();
        }
        return zClipRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rectF) {
        boolean zClipRect = super.clipRect(rectF);
        if (a((short) 0)) {
            m();
            b(rectF);
            this.f132842e.e(EnumC14180e.INTERSECT.f133308g);
            o();
        }
        return zClipRect;
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rectF, Region.Op op2) {
        boolean zClipRect = super.clipRect(rectF, op2);
        if (a((short) 0)) {
            m();
            b(rectF);
            this.f132842e.e(op2.nativeInt);
            o();
        }
        return zClipRect;
    }

    public boolean clipRegion(Region region) {
        c("clipRegion(Region region)");
        return super.clipRegion(region);
    }

    public boolean clipRegion(Region region, Region.Op op2) {
        c("clipRegion(Region region, Op op)");
        return super.clipRegion(region, op2);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        if (matrix.isIdentity()) {
            return;
        }
        super.concat(matrix);
        if (a((short) 24)) {
            a(matrix);
            o();
        }
    }

    Map d() {
        return this.f132854q;
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        c("disableZ()");
        super.disableZ();
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int i10, int i11, int i12, int i13) {
        int iArgb = Color.argb(i10, i11, i12, i13);
        if (iArgb != 0 && a((short) 1)) {
            this.f132842e.f(iArgb);
            this.f132842e.e(aY.a(PorterDuff.Mode.SRC_OVER));
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        if (a((short) 14)) {
            this.f132842e.b(f10, f11, f12, f13);
            this.f132842e.a(f14, f15);
            this.f132842e.e(z10 ? 1 : 0);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        if (a((short) 14)) {
            c(rectF);
            this.f132842e.a(f10, f11);
            this.f132842e.e(z10 ? 1 : 0);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        if (!bitmap.isRecycled() && a((short) 4)) {
            boolean z10 = bitmap.getConfig() == Bitmap.Config.ALPHA_8;
            if (z10) {
                this.f132842e.e(1);
            }
            this.f132842e.d(a(bitmap));
            this.f132842e.a((int) f10, (int) f11);
            a(paint, z10);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        if (!bitmap.isRecycled() && a((short) 4)) {
            boolean z10 = bitmap.getConfig() == Bitmap.Config.ALPHA_8;
            if (z10) {
                this.f132842e.e(1);
            }
            this.f132842e.d(a(bitmap));
            a(matrix);
            a(paint, z10);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        if (!bitmap.isRecycled() && a((short) 5)) {
            boolean z10 = bitmap.getConfig() == Bitmap.Config.ALPHA_8;
            if (z10) {
                this.f132842e.e(1);
            }
            this.f132842e.d(a(bitmap));
            b(rect);
            c(rect2);
            a(paint, z10);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        if (!bitmap.isRecycled() && a((short) 5)) {
            boolean z10 = bitmap.getConfig() == Bitmap.Config.ALPHA_8;
            if (z10) {
                this.f132842e.e(1);
            }
            this.f132842e.d(a(bitmap));
            b(rect);
            c(rectF);
            a(paint, z10);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i10, int i11, float f10, float f11, int i12, int i13, boolean z10, Paint paint) {
        c("drawBitmap(int[] colors, int offset, int stride, float x, float y, int width, int height, boolean hasAlpha, Paint paint)");
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        c("drawBitmap(int[] colors, int offset, int stride, int x, int y, int width, int height, boolean hasAlpha, Paint paint)");
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        c("drawBitmapMesh(...)");
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float f10, float f11, float f12, Paint paint) {
        if (a((short) 12)) {
            this.f132842e.a((int) f10, (int) f11);
            this.f132842e.a(f12);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10) {
        if (i10 != 0 && a((short) 1)) {
            this.f132842e.f(i10);
            this.f132842e.e(aY.a(PorterDuff.Mode.SRC_OVER));
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10, BlendMode blendMode) {
        if (a((short) 1)) {
            this.f132842e.f(i10);
            Xfermode xfermodeA = C14100b.a(blendMode);
            if (C14127c.a(xfermodeA)) {
                this.f132842e.e(C14127c.c(xfermodeA));
            }
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawColor(int i10, PorterDuff.Mode mode) {
        if (a((short) 1)) {
            this.f132842e.f(i10);
            this.f132842e.e(aY.a(mode));
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j10) {
        drawColor(j10, BlendMode.SRC_OVER);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long j10, BlendMode blendMode) {
        drawColor(Color.toArgb(j10), blendMode);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        c("drawDoubleRoundRect(RectF, float, float, RectF, float, float, Paint)");
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        c("drawDoubleRoundRect(RectF, float[], RectF, float[], Paint)");
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        c("drawGlyphs(int[], int, float[], int, int, Font, Paint)");
    }

    @Override // android.graphics.Canvas
    public void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        if (a((short) 11)) {
            this.f132842e.b(f10, f11, f12, f13);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        c("drawLines(float[] pts, int offset, int count, Paint paint)");
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] fArr, Paint paint) {
        c("drawLines(float[] pts, Paint paint)");
    }

    @Override // android.graphics.Canvas
    public void drawMesh(Mesh mesh, BlendMode blendMode, Paint paint) {
        c("drawMesh(Mesh, BlendMode, Paint)");
    }

    @Override // android.graphics.Canvas
    public void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        if (!a(f10, f11, f12, f13) && a((short) 13)) {
            this.f132842e.b(f10, f11, f12, f13);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF rectF, Paint paint) {
        if (!a(rectF) && a((short) 13)) {
            c(rectF);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        if (a((short) 2)) {
            a(paint);
            o();
        }
    }

    public void drawPatch(Bitmap bitmap, byte[] bArr, Rect rect, Paint paint) {
        if (!bitmap.isRecycled() && a((short) 6)) {
            this.f132842e.d(a(bitmap));
            c(rect);
            a(paint);
            o();
        }
    }

    public void drawPatch(Bitmap bitmap, byte[] bArr, RectF rectF, Paint paint) {
        if (!bitmap.isRecycled() && a((short) 6)) {
            this.f132842e.d(a(bitmap));
            c(rectF);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        if (!ninePatch.getBitmap().isRecycled() && a((short) 6)) {
            this.f132842e.d(a(ninePatch.getBitmap()));
            c(rect);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        if (!ninePatch.getBitmap().isRecycled() && a((short) 6)) {
            this.f132842e.d(a(ninePatch.getBitmap()));
            c(rectF);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        if (a((short) 8)) {
            a(path);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        c("drawPicture(Picture picture)");
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect rect) {
        c("drawPicture(Picture picture, Rect dst)");
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF rectF) {
        c("drawPicture(Picture picture, RectF dst)");
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float f10, float f11, Paint paint) {
        c("drawPoint(float x, float y, Paint paint)");
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        c("drawPoints(float[] pts, int offset, int count, Paint paint)");
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] fArr, Paint paint) {
        c("drawPoints(float[] pts, Paint paint)");
    }

    @Override // android.graphics.Canvas
    public void drawPosText(String str, float[] fArr, Paint paint) {
        c("drawPosText(String text, float[] pos, Paint paint)");
    }

    @Override // android.graphics.Canvas
    public void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        c("drawPosText(char[] text, int index, int count, float[] pos, Paint paint)");
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int i10, int i11, int i12) {
        int iRgb = Color.rgb(i10, i11, i12);
        if (a((short) 1)) {
            this.f132842e.f(iRgb);
            this.f132842e.e(aY.a(PorterDuff.Mode.SRC_OVER));
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        if (!a(f10, f11, f12, f13) && a((short) 9)) {
            this.f132842e.b(f10, f11, f12, f13);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect rect, Paint paint) {
        if (!a(rect) && a((short) 9)) {
            c(rect);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rectF, Paint paint) {
        if (!a(rectF) && a((short) 9)) {
            c(rectF);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(RenderNode renderNode) {
        c("drawRenderNode(RenderNode renderNode");
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        if (!a(f10, f11, f12, f13) && a((short) 10)) {
            this.f132842e.b(f10, f11, f12, f13);
            this.f132842e.a(f14, f15);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        if (!a(rectF) && a((short) 10)) {
            c(rectF);
            this.f132842e.a(f10, f11);
            a(paint);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence charSequence, int i10, int i11, float f10, float f11, Paint paint) {
        if (charSequence == null || i10 == i11 || !a((short) 7)) {
            return;
        }
        a(charSequence.subSequence(i10, i11).toString(), (int) f10, (int) f11, paint);
        o();
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, float f10, float f11, Paint paint) {
        if (str == null || str.isEmpty() || !a((short) 7)) {
            return;
        }
        a(str, (int) f10, (int) f11, paint);
        o();
    }

    @Override // android.graphics.Canvas
    public void drawText(String str, int i10, int i11, float f10, float f11, Paint paint) {
        if (str == null || i10 == i11 || !a((short) 7)) {
            return;
        }
        a(str.substring(i10, i11), (int) f10, (int) f11, paint);
        o();
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] cArr, int i10, int i11, float f10, float f11, Paint paint) {
        if (cArr == null || cArr.length == 0 || !a((short) 7)) {
            return;
        }
        a(new String(cArr, i10, i11), (int) f10, (int) f11, paint);
        o();
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        if (str == null || str.isEmpty() || !a((short) 7)) {
            return;
        }
        a(str, f10, f11, paint);
        a(path);
        o();
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f10, float f11, Paint paint) {
        if (cArr == null || i11 == 0 || !a((short) 7)) {
            return;
        }
        a(new String(cArr, i10, i11), f10, f11, paint);
        a(path);
        o();
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        char[] cArrA;
        if (measuredText == null || i10 == i11 || (cArrA = C14234g.a(measuredText)) == null || !a((short) 7)) {
            return;
        }
        a(new String(cArrA, i10, i11 - i10), (int) f10, (int) f11, paint);
        o();
    }

    public void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, int i14, Paint paint) {
        drawTextRun(charSequence, i10, i11, i12, i13, f10, f11, i14 == 1, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        if (charSequence == null || i10 == i11 || !a((short) 7)) {
            return;
        }
        a(charSequence.subSequence(i10, i11).toString(), (int) f10, (int) f11, paint);
        o();
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z10, Paint paint) {
        if (cArr == null || i11 == 0 || !a((short) 7)) {
            return;
        }
        a(new String(cArr, i10, i11), (int) f10, (int) f11, paint);
        o();
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        c("drawVertices(...)");
    }

    Bitmap e() {
        return this.f132856s;
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        super.enableZ();
    }

    void f() {
        this.f132838E[0] = false;
    }

    public void fsDrawCompoundVectorDrawable(Drawable drawable, TextView textView, int i10) {
        int paddingLeft;
        float fWidth;
        int iHeight;
        int right = textView.getRight();
        int left = textView.getLeft();
        int bottom = textView.getBottom();
        int top = textView.getTop();
        int compoundPaddingBottom = ((bottom - top) - textView.getCompoundPaddingBottom()) - textView.getCompoundPaddingTop();
        int compoundPaddingRight = ((right - left) - textView.getCompoundPaddingRight()) - textView.getCompoundPaddingLeft();
        int scrollX = textView.getScrollX();
        int scrollY = textView.getScrollY();
        int compoundPaddingTop = textView.getCompoundPaddingTop();
        int compoundPaddingLeft = textView.getCompoundPaddingLeft();
        int paddingTop = textView.getPaddingTop();
        int paddingBottom = textView.getPaddingBottom();
        Rect rect = new Rect();
        drawable.copyBounds(rect);
        switch (i10) {
            case 0:
                save();
                paddingLeft = scrollX + textView.getPaddingLeft() + 0;
                break;
            case 1:
                save();
                fWidth = scrollX + compoundPaddingLeft + ((compoundPaddingRight - rect.width()) / 2);
                iHeight = scrollY + paddingTop;
                translate(fWidth, iHeight);
                a(drawable);
                restore();
            case 2:
                save();
                paddingLeft = ((((scrollX + right) - left) - textView.getPaddingRight()) - rect.width()) + 0;
                break;
            case 3:
                save();
                fWidth = scrollX + compoundPaddingLeft + ((compoundPaddingRight - rect.width()) / 2);
                iHeight = (((scrollY + bottom) - top) - paddingBottom) - rect.height();
                translate(fWidth, iHeight);
                a(drawable);
                restore();
            default:
                return;
        }
        fWidth = paddingLeft;
        iHeight = scrollY + compoundPaddingTop + ((compoundPaddingBottom - rect.height()) / 2);
        translate(fWidth, iHeight);
        a(drawable);
        restore();
    }

    public void fsDrawProgressBar(ProgressBar progressBar) {
        if (!(progressBar instanceof AbsSeekBar)) {
            a(progressBar);
            return;
        }
        AbsSeekBar absSeekBar = (AbsSeekBar) progressBar;
        c(absSeekBar);
        b(absSeekBar);
    }

    void g() {
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect rect) {
        return super.getClipBounds(rect);
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        return super.getDensity();
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        return super.getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        View view = this.f132857t;
        return view == null ? super.getHeight() : view.getHeight();
    }

    @Override // android.graphics.Canvas
    public void getMatrix(Matrix matrix) {
        super.getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        return super.getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        return super.getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        return this.f132862y;
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        View view = this.f132857t;
        return view == null ? super.getWidth() : view.getWidth();
    }

    ByteBuffer h() {
        return k();
    }

    void i() {
        g();
        this.f132857t = null;
        this.f132858u = null;
        this.f132839b = true;
        this.f132835B = false;
        this.f132859v = false;
        this.f132851n = null;
        this.f132852o = null;
        this.f132853p = null;
        this.f132854q = null;
        this.f132842e.a();
        super.restoreToCount(1);
        super.save();
        this.f132862y = 1;
        this.f132863z = -1;
    }

    public boolean isEmpty() {
        return !this.f132835B;
    }

    @Override // android.graphics.Canvas
    public boolean isHardwareAccelerated() {
        return false;
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        return super.isOpaque();
    }

    ByteBuffer j() {
        return k();
    }

    ByteBuffer k() {
        n();
        this.f132842e.c();
        this.f132857t = null;
        this.f132858u = null;
        return this.f132842e.b();
    }

    Rect l() {
        if (this.f132863z > 0) {
            return super.getClipBounds();
        }
        return null;
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f10, float f11, float f12, float f13) {
        return super.quickReject(f10, f11, f12, f13);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        return super.quickReject(f10, f11, f12, f13, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path) {
        return super.quickReject(path);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return super.quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rectF) {
        return super.quickReject(rectF);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return super.quickReject(rectF, edgeType);
    }

    public void release() {
        d("Attempted to call release() during onDraw");
    }

    @Override // android.graphics.Canvas
    public void restore() {
        if (this.f132862y == 1) {
            d("Attempted to restore more times than saved");
            return;
        }
        super.restore();
        int i10 = this.f132862y - 1;
        this.f132862y = i10;
        if (i10 < this.f132863z) {
            this.f132863z = -1;
        }
        if (a((short) 18)) {
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int i10) {
        if (i10 <= 0) {
            i10 = 1;
        }
        if (i10 >= this.f132862y) {
            d("Attempted to restore to an invalid index");
            return;
        }
        this.f132862y = i10;
        if (i10 < this.f132863z) {
            this.f132863z = -1;
        }
        super.restoreToCount(i10 + 1);
        if (a((short) 19)) {
            this.f132842e.e(i10);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void rotate(float f10) {
        if (f10 == 0.0f) {
            return;
        }
        super.rotate(f10);
        if (a((short) 23)) {
            this.f132842e.a(f10);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public int save() {
        this.f132862y++;
        super.save();
        if (a((short) 15)) {
            this.f132842e.e(3);
            o();
        }
        return this.f132862y - 1;
    }

    public int save(int i10) {
        if (i10 != 31) {
            c("Save flags other than ALL_SAVE_FLAG are deprecated");
        }
        this.f132862y++;
        super.save(i10);
        if (a((short) 15)) {
            this.f132842e.e(i10);
            o();
        }
        return this.f132862y - 1;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        this.f132862y++;
        super.saveLayer(f10, f11, f12, f13, paint, 31);
        if (a((short) 16)) {
            this.f132842e.a(f10, f11, f12, f13);
            a(paint);
            this.f132842e.e(31);
            o();
        }
        return this.f132862y - 1;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i10) {
        if (i10 != 31) {
            c("Save flags other than ALL_SAVE_FLAG are deprecated");
        }
        this.f132862y++;
        super.saveLayer(f10, f11, f12, f13, paint, i10);
        if (a((short) 16)) {
            this.f132842e.a(f10, f11, f12, f13);
            a(paint);
            this.f132842e.e(i10);
            o();
        }
        return this.f132862y - 1;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint) {
        this.f132862y++;
        super.saveLayer(rectF, paint, 31);
        if (a((short) 16)) {
            b(rectF);
            a(paint);
            this.f132842e.e(31);
            o();
        }
        return this.f132862y - 1;
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF rectF, Paint paint, int i10) {
        if (i10 != 31) {
            c("Save flags other than ALL_SAVE_FLAG are deprecated");
        }
        this.f132862y++;
        super.saveLayer(rectF, paint, i10);
        if (a((short) 16)) {
            b(rectF);
            a(paint);
            this.f132842e.e(i10);
            o();
        }
        return this.f132862y - 1;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10) {
        this.f132862y++;
        super.saveLayerAlpha(f10, f11, f12, f13, i10, 31);
        if (a((short) 17)) {
            this.f132842e.a(f10, f11, f12, f13);
            this.f132842e.e(i10 | 7936);
            o();
        }
        return this.f132862y - 1;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10, int i11) {
        if (i11 != 31) {
            c("Save flags other than ALL_SAVE_FLAG are deprecated");
        }
        this.f132862y++;
        super.saveLayerAlpha(f10, f11, f12, f13, i10, i11);
        if (a((short) 17)) {
            this.f132842e.a(f10, f11, f12, f13);
            this.f132842e.e((i11 << 8) | i10);
            o();
        }
        return this.f132862y - 1;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i10) {
        this.f132862y++;
        super.saveLayerAlpha(rectF, i10, 31);
        if (a((short) 17)) {
            b(rectF);
            this.f132842e.e(i10 | 7936);
            o();
        }
        return this.f132862y - 1;
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF rectF, int i10, int i11) {
        if (i11 != 31) {
            c("Save flags other than ALL_SAVE_FLAG are deprecated");
        }
        this.f132862y++;
        super.saveLayerAlpha(rectF, i10, i11);
        if (a((short) 17)) {
            b(rectF);
            this.f132842e.e(i10 | (i11 << 8));
            o();
        }
        return this.f132862y - 1;
    }

    @Override // android.graphics.Canvas
    public void scale(float f10, float f11) {
        if (f10 == 1.0f && f11 == 1.0f) {
            return;
        }
        super.scale(f10, f11);
        if (a((short) 20)) {
            this.f132842e.a(f10, f11);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        d("Attempted to call setBitmap during onDraw");
    }

    @Override // android.graphics.Canvas
    public void setDensity(int i10) {
        c("setDensity(int density)");
        super.setDensity(i10);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter drawFilter) {
        c("setDrawFilter(DrawFilter filter)");
        super.setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        super.setMatrix(matrix);
        if (a((short) 25)) {
            a(matrix);
            o();
        }
    }

    public void setScreenDensity(int i10) {
        c("setScreenDensity(int density)");
        super.setScreenDensity(i10);
    }

    @Override // android.graphics.Canvas
    public void skew(float f10, float f11) {
        super.skew(f10, f11);
        if (a((short) 22)) {
            this.f132842e.a(f10, f11);
            o();
        }
    }

    @Override // android.graphics.Canvas
    public void translate(float f10, float f11) {
        if (f10 == 0.0f && f11 == 0.0f) {
            return;
        }
        this.f132859v = true;
        this.f132860w += f10;
        this.f132861x += f11;
        super.translate(f10, f11);
    }
}
