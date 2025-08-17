package androidx.vectordrawable.graphics.drawable;

import Z.C5503a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import b2.C6183d;
import b2.C6187h;
import b2.C6190k;
import c2.f;
import com.fullstory.instrumentation.FSDraw;
import com.medallia.digital.mobilesdk.l3;
import d2.C13462a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class f extends androidx.vectordrawable.graphics.drawable.e implements FSDraw {

    /* renamed from: j, reason: collision with root package name */
    static final PorterDuff.Mode f58842j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private h f58843b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f58844c;

    /* renamed from: d, reason: collision with root package name */
    private ColorFilter f58845d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f58846e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f58847f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f58848g;

    /* renamed from: h, reason: collision with root package name */
    private final Matrix f58849h;

    /* renamed from: i, reason: collision with root package name */
    private final Rect f58850i;

    private static class b extends AbstractC1154f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f58877b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f58876a = c2.f.d(string2);
            }
            this.f58878c = C6190k.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.AbstractC1154f
        public boolean c() {
            return true;
        }

        b(b bVar) {
            super(bVar);
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C6190k.p(xmlPullParser, "pathData")) {
                TypedArray typedArrayQ = C6190k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f58815d);
                f(typedArrayQ, xmlPullParser);
                typedArrayQ.recycle();
            }
        }
    }

    private static class c extends AbstractC1154f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f58851e;

        /* renamed from: f, reason: collision with root package name */
        C6183d f58852f;

        /* renamed from: g, reason: collision with root package name */
        float f58853g;

        /* renamed from: h, reason: collision with root package name */
        C6183d f58854h;

        /* renamed from: i, reason: collision with root package name */
        float f58855i;

        /* renamed from: j, reason: collision with root package name */
        float f58856j;

        /* renamed from: k, reason: collision with root package name */
        float f58857k;

        /* renamed from: l, reason: collision with root package name */
        float f58858l;

        /* renamed from: m, reason: collision with root package name */
        float f58859m;

        /* renamed from: n, reason: collision with root package name */
        Paint.Cap f58860n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Join f58861o;

        /* renamed from: p, reason: collision with root package name */
        float f58862p;

        c() {
            this.f58853g = 0.0f;
            this.f58855i = 1.0f;
            this.f58856j = 1.0f;
            this.f58857k = 0.0f;
            this.f58858l = 1.0f;
            this.f58859m = 0.0f;
            this.f58860n = Paint.Cap.BUTT;
            this.f58861o = Paint.Join.MITER;
            this.f58862p = 4.0f;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f58851e = null;
            if (C6190k.p(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f58877b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f58876a = c2.f.d(string2);
                }
                this.f58854h = C6190k.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f58856j = C6190k.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f58856j);
                this.f58860n = e(C6190k.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f58860n);
                this.f58861o = f(C6190k.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f58861o);
                this.f58862p = C6190k.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f58862p);
                this.f58852f = C6190k.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f58855i = C6190k.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f58855i);
                this.f58853g = C6190k.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f58853g);
                this.f58858l = C6190k.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f58858l);
                this.f58859m = C6190k.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f58859m);
                this.f58857k = C6190k.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f58857k);
                this.f58878c = C6190k.k(typedArray, xmlPullParser, "fillType", 13, this.f58878c);
            }
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            return this.f58854h.i() || this.f58852f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            return this.f58852f.j(iArr) | this.f58854h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayQ = C6190k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f58814c);
            h(typedArrayQ, xmlPullParser, theme);
            typedArrayQ.recycle();
        }

        float getFillAlpha() {
            return this.f58856j;
        }

        int getFillColor() {
            return this.f58854h.e();
        }

        float getStrokeAlpha() {
            return this.f58855i;
        }

        int getStrokeColor() {
            return this.f58852f.e();
        }

        float getStrokeWidth() {
            return this.f58853g;
        }

        float getTrimPathEnd() {
            return this.f58858l;
        }

        float getTrimPathOffset() {
            return this.f58859m;
        }

        float getTrimPathStart() {
            return this.f58857k;
        }

        void setFillAlpha(float f10) {
            this.f58856j = f10;
        }

        void setFillColor(int i10) {
            this.f58854h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f58855i = f10;
        }

        void setStrokeColor(int i10) {
            this.f58852f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f58853g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f58858l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f58859m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f58857k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f58853g = 0.0f;
            this.f58855i = 1.0f;
            this.f58856j = 1.0f;
            this.f58857k = 0.0f;
            this.f58858l = 1.0f;
            this.f58859m = 0.0f;
            this.f58860n = Paint.Cap.BUTT;
            this.f58861o = Paint.Join.MITER;
            this.f58862p = 4.0f;
            this.f58851e = cVar.f58851e;
            this.f58852f = cVar.f58852f;
            this.f58853g = cVar.f58853g;
            this.f58855i = cVar.f58855i;
            this.f58854h = cVar.f58854h;
            this.f58878c = cVar.f58878c;
            this.f58856j = cVar.f58856j;
            this.f58857k = cVar.f58857k;
            this.f58858l = cVar.f58858l;
            this.f58859m = cVar.f58859m;
            this.f58860n = cVar.f58860n;
            this.f58861o = cVar.f58861o;
            this.f58862p = cVar.f58862p;
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f58863a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<e> f58864b;

        /* renamed from: c, reason: collision with root package name */
        float f58865c;

        /* renamed from: d, reason: collision with root package name */
        private float f58866d;

        /* renamed from: e, reason: collision with root package name */
        private float f58867e;

        /* renamed from: f, reason: collision with root package name */
        private float f58868f;

        /* renamed from: g, reason: collision with root package name */
        private float f58869g;

        /* renamed from: h, reason: collision with root package name */
        private float f58870h;

        /* renamed from: i, reason: collision with root package name */
        private float f58871i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f58872j;

        /* renamed from: k, reason: collision with root package name */
        int f58873k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f58874l;

        /* renamed from: m, reason: collision with root package name */
        private String f58875m;

        d(d dVar, C5503a<String, Object> c5503a) {
            AbstractC1154f bVar;
            super();
            this.f58863a = new Matrix();
            this.f58864b = new ArrayList<>();
            this.f58865c = 0.0f;
            this.f58866d = 0.0f;
            this.f58867e = 0.0f;
            this.f58868f = 1.0f;
            this.f58869g = 1.0f;
            this.f58870h = 0.0f;
            this.f58871i = 0.0f;
            Matrix matrix = new Matrix();
            this.f58872j = matrix;
            this.f58875m = null;
            this.f58865c = dVar.f58865c;
            this.f58866d = dVar.f58866d;
            this.f58867e = dVar.f58867e;
            this.f58868f = dVar.f58868f;
            this.f58869g = dVar.f58869g;
            this.f58870h = dVar.f58870h;
            this.f58871i = dVar.f58871i;
            this.f58874l = dVar.f58874l;
            String str = dVar.f58875m;
            this.f58875m = str;
            this.f58873k = dVar.f58873k;
            if (str != null) {
                c5503a.put(str, this);
            }
            matrix.set(dVar.f58872j);
            ArrayList<e> arrayList = dVar.f58864b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f58864b.add(new d((d) eVar, c5503a));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f58864b.add(bVar);
                    String str2 = bVar.f58877b;
                    if (str2 != null) {
                        c5503a.put(str2, bVar);
                    }
                }
            }
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f58874l = null;
            this.f58865c = C6190k.j(typedArray, xmlPullParser, "rotation", 5, this.f58865c);
            this.f58866d = typedArray.getFloat(1, this.f58866d);
            this.f58867e = typedArray.getFloat(2, this.f58867e);
            this.f58868f = C6190k.j(typedArray, xmlPullParser, "scaleX", 3, this.f58868f);
            this.f58869g = C6190k.j(typedArray, xmlPullParser, "scaleY", 4, this.f58869g);
            this.f58870h = C6190k.j(typedArray, xmlPullParser, "translateX", 6, this.f58870h);
            this.f58871i = C6190k.j(typedArray, xmlPullParser, "translateY", 7, this.f58871i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f58875m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f58864b.size(); i10++) {
                if (this.f58864b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f58864b.size(); i10++) {
                zB |= this.f58864b.get(i10).b(iArr);
            }
            return zB;
        }

        private void d() {
            this.f58872j.reset();
            this.f58872j.postTranslate(-this.f58866d, -this.f58867e);
            this.f58872j.postScale(this.f58868f, this.f58869g);
            this.f58872j.postRotate(this.f58865c, 0.0f, 0.0f);
            this.f58872j.postTranslate(this.f58870h + this.f58866d, this.f58871i + this.f58867e);
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayQ = C6190k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f58813b);
            e(typedArrayQ, xmlPullParser);
            typedArrayQ.recycle();
        }

        public String getGroupName() {
            return this.f58875m;
        }

        public Matrix getLocalMatrix() {
            return this.f58872j;
        }

        public float getPivotX() {
            return this.f58866d;
        }

        public float getPivotY() {
            return this.f58867e;
        }

        public float getRotation() {
            return this.f58865c;
        }

        public float getScaleX() {
            return this.f58868f;
        }

        public float getScaleY() {
            return this.f58869g;
        }

        public float getTranslateX() {
            return this.f58870h;
        }

        public float getTranslateY() {
            return this.f58871i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f58866d) {
                this.f58866d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f58867e) {
                this.f58867e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f58865c) {
                this.f58865c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f58868f) {
                this.f58868f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f58869g) {
                this.f58869g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f58870h) {
                this.f58870h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f58871i) {
                this.f58871i = f10;
                d();
            }
        }

        d() {
            super();
            this.f58863a = new Matrix();
            this.f58864b = new ArrayList<>();
            this.f58865c = 0.0f;
            this.f58866d = 0.0f;
            this.f58867e = 0.0f;
            this.f58868f = 1.0f;
            this.f58869g = 1.0f;
            this.f58870h = 0.0f;
            this.f58871i = 0.0f;
            this.f58872j = new Matrix();
            this.f58875m = null;
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.f$f, reason: collision with other inner class name */
    private static abstract class AbstractC1154f extends e {

        /* renamed from: a, reason: collision with root package name */
        protected f.b[] f58876a;

        /* renamed from: b, reason: collision with root package name */
        String f58877b;

        /* renamed from: c, reason: collision with root package name */
        int f58878c;

        /* renamed from: d, reason: collision with root package name */
        int f58879d;

        AbstractC1154f() {
            super();
            this.f58876a = null;
            this.f58878c = 0;
        }

        public boolean c() {
            return false;
        }

        public f.b[] getPathData() {
            return this.f58876a;
        }

        public String getPathName() {
            return this.f58877b;
        }

        public void setPathData(f.b[] bVarArr) {
            if (c2.f.b(this.f58876a, bVarArr)) {
                c2.f.k(this.f58876a, bVarArr);
            } else {
                this.f58876a = c2.f.f(bVarArr);
            }
        }

        public void d(Path path) {
            path.reset();
            f.b[] bVarArr = this.f58876a;
            if (bVarArr != null) {
                c2.f.j(bVarArr, path);
            }
        }

        AbstractC1154f(AbstractC1154f abstractC1154f) {
            super();
            this.f58876a = null;
            this.f58878c = 0;
            this.f58877b = abstractC1154f.f58877b;
            this.f58879d = abstractC1154f.f58879d;
            this.f58876a = c2.f.f(abstractC1154f.f58876a);
        }
    }

    private static class g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f58880q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f58881a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f58882b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f58883c;

        /* renamed from: d, reason: collision with root package name */
        Paint f58884d;

        /* renamed from: e, reason: collision with root package name */
        Paint f58885e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f58886f;

        /* renamed from: g, reason: collision with root package name */
        private int f58887g;

        /* renamed from: h, reason: collision with root package name */
        final d f58888h;

        /* renamed from: i, reason: collision with root package name */
        float f58889i;

        /* renamed from: j, reason: collision with root package name */
        float f58890j;

        /* renamed from: k, reason: collision with root package name */
        float f58891k;

        /* renamed from: l, reason: collision with root package name */
        float f58892l;

        /* renamed from: m, reason: collision with root package name */
        int f58893m;

        /* renamed from: n, reason: collision with root package name */
        String f58894n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f58895o;

        /* renamed from: p, reason: collision with root package name */
        final C5503a<String, Object> f58896p;

        g() {
            this.f58883c = new Matrix();
            this.f58889i = 0.0f;
            this.f58890j = 0.0f;
            this.f58891k = 0.0f;
            this.f58892l = 0.0f;
            this.f58893m = l3.f92484c;
            this.f58894n = null;
            this.f58895o = null;
            this.f58896p = new C5503a<>();
            this.f58888h = new d();
            this.f58881a = new Path();
            this.f58882b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void d(d dVar, AbstractC1154f abstractC1154f, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f58891k;
            float f11 = i11 / this.f58892l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f58863a;
            this.f58883c.set(matrix);
            this.f58883c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            abstractC1154f.d(this.f58881a);
            Path path = this.f58881a;
            this.f58882b.reset();
            if (abstractC1154f.c()) {
                this.f58882b.setFillType(abstractC1154f.f58878c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f58882b.addPath(path, this.f58883c);
                canvas.clipPath(this.f58882b);
                return;
            }
            c cVar = (c) abstractC1154f;
            float f12 = cVar.f58857k;
            if (f12 != 0.0f || cVar.f58858l != 1.0f) {
                float f13 = cVar.f58859m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f58858l + f13) % 1.0f;
                if (this.f58886f == null) {
                    this.f58886f = new PathMeasure();
                }
                this.f58886f.setPath(this.f58881a, false);
                float length = this.f58886f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f58886f.getSegment(f16, length, path, true);
                    this.f58886f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f58886f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f58882b.addPath(path, this.f58883c);
            if (cVar.f58854h.l()) {
                C6183d c6183d = cVar.f58854h;
                if (this.f58885e == null) {
                    Paint paint = new Paint(1);
                    this.f58885e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f58885e;
                if (c6183d.h()) {
                    Shader shaderF = c6183d.f();
                    shaderF.setLocalMatrix(this.f58883c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f58856j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(l3.f92484c);
                    paint2.setColor(f.a(c6183d.e(), cVar.f58856j));
                }
                paint2.setColorFilter(colorFilter);
                this.f58882b.setFillType(cVar.f58878c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f58882b, paint2);
            }
            if (cVar.f58852f.l()) {
                C6183d c6183d2 = cVar.f58852f;
                if (this.f58884d == null) {
                    Paint paint3 = new Paint(1);
                    this.f58884d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f58884d;
                Paint.Join join = cVar.f58861o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f58860n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f58862p);
                if (c6183d2.h()) {
                    Shader shaderF2 = c6183d2.f();
                    shaderF2.setLocalMatrix(this.f58883c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f58855i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(l3.f92484c);
                    paint4.setColor(f.a(c6183d2.e(), cVar.f58855i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f58853g * fMin * fE);
                canvas.drawPath(this.f58882b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f58863a.set(matrix);
            dVar2.f58863a.preConcat(dVar2.f58872j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.f58864b.size()) {
                e eVar = dVar2.f58864b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f58863a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof AbstractC1154f) {
                    d(dVar2, (AbstractC1154f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f58888h, f58880q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f58895o == null) {
                this.f58895o = Boolean.valueOf(this.f58888h.a());
            }
            return this.f58895o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f58888h.b(iArr);
        }

        public int getRootAlpha() {
            return this.f58893m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f58893m = i10;
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        g(g gVar) {
            this.f58883c = new Matrix();
            this.f58889i = 0.0f;
            this.f58890j = 0.0f;
            this.f58891k = 0.0f;
            this.f58892l = 0.0f;
            this.f58893m = l3.f92484c;
            this.f58894n = null;
            this.f58895o = null;
            C5503a<String, Object> c5503a = new C5503a<>();
            this.f58896p = c5503a;
            this.f58888h = new d(gVar.f58888h, c5503a);
            this.f58881a = new Path(gVar.f58881a);
            this.f58882b = new Path(gVar.f58882b);
            this.f58889i = gVar.f58889i;
            this.f58890j = gVar.f58890j;
            this.f58891k = gVar.f58891k;
            this.f58892l = gVar.f58892l;
            this.f58887g = gVar.f58887g;
            this.f58893m = gVar.f58893m;
            this.f58894n = gVar.f58894n;
            String str = gVar.f58894n;
            if (str != null) {
                c5503a.put(str, this);
            }
            this.f58895o = gVar.f58895o;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f58897a;

        /* renamed from: b, reason: collision with root package name */
        g f58898b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f58899c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f58900d;

        /* renamed from: e, reason: collision with root package name */
        boolean f58901e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f58902f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f58903g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f58904h;

        /* renamed from: i, reason: collision with root package name */
        int f58905i;

        /* renamed from: j, reason: collision with root package name */
        boolean f58906j;

        /* renamed from: k, reason: collision with root package name */
        boolean f58907k;

        /* renamed from: l, reason: collision with root package name */
        Paint f58908l;

        h(h hVar) {
            this.f58899c = null;
            this.f58900d = f.f58842j;
            if (hVar != null) {
                this.f58897a = hVar.f58897a;
                g gVar = new g(hVar.f58898b);
                this.f58898b = gVar;
                if (hVar.f58898b.f58885e != null) {
                    gVar.f58885e = new Paint(hVar.f58898b.f58885e);
                }
                if (hVar.f58898b.f58884d != null) {
                    this.f58898b.f58884d = new Paint(hVar.f58898b.f58884d);
                }
                this.f58899c = hVar.f58899c;
                this.f58900d = hVar.f58900d;
                this.f58901e = hVar.f58901e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new f(this);
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f58902f.getWidth() && i11 == this.f58902f.getHeight();
        }

        public boolean b() {
            return !this.f58907k && this.f58903g == this.f58899c && this.f58904h == this.f58900d && this.f58906j == this.f58901e && this.f58905i == this.f58898b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f58902f == null || !a(i10, i11)) {
                this.f58902f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f58907k = true;
            }
        }

        public boolean f() {
            return this.f58898b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f58898b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f58897a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f58898b.g(iArr);
            this.f58907k |= zG;
            return zG;
        }

        public void i() {
            this.f58903g = this.f58899c;
            this.f58904h = this.f58900d;
            this.f58905i = this.f58898b.getRootAlpha();
            this.f58906j = this.f58901e;
            this.f58907k = false;
        }

        public void j(int i10, int i11) {
            this.f58902f.eraseColor(0);
            this.f58898b.b(new Canvas(this.f58902f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f58902f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f58908l == null) {
                Paint paint = new Paint();
                this.f58908l = paint;
                paint.setFilterBitmap(true);
            }
            this.f58908l.setAlpha(this.f58898b.getRootAlpha());
            this.f58908l.setColorFilter(colorFilter);
            return this.f58908l;
        }

        h() {
            this.f58899c = null;
            this.f58900d = f.f58842j;
            this.f58898b = new g();
        }
    }

    private static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f58909a;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f58841a = (VectorDrawable) this.f58909a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f58909a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f58909a.getChangingConfigurations();
        }

        i(Drawable.ConstantState constantState) {
            this.f58909a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f58841a = (VectorDrawable) this.f58909a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f58841a = (VectorDrawable) this.f58909a.newDrawable(resources, theme);
            return fVar;
        }
    }

    f() {
        this.f58847f = true;
        this.f58848g = new float[9];
        this.f58849h = new Matrix();
        this.f58850i = new Rect();
        this.f58843b = new h();
    }

    private static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    public static f b(Resources resources, int i10, Resources.Theme theme) {
        f fVar = new f();
        fVar.f58841a = C6187h.f(resources, i10, theme);
        return fVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f58843b;
        g gVar = hVar.f58898b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f58888h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if (dVar != null) {
                    if ("path".equals(name)) {
                        c cVar = new c();
                        cVar.g(resources, attributeSet, theme, xmlPullParser);
                        dVar.f58864b.add(cVar);
                        if (cVar.getPathName() != null) {
                            gVar.f58896p.put(cVar.getPathName(), cVar);
                        }
                        hVar.f58897a = cVar.f58879d | hVar.f58897a;
                        z10 = false;
                    } else if ("clip-path".equals(name)) {
                        b bVar = new b();
                        bVar.e(resources, attributeSet, theme, xmlPullParser);
                        dVar.f58864b.add(bVar);
                        if (bVar.getPathName() != null) {
                            gVar.f58896p.put(bVar.getPathName(), bVar);
                        }
                        hVar.f58897a = bVar.f58879d | hVar.f58897a;
                    } else if ("group".equals(name)) {
                        d dVar2 = new d();
                        dVar2.c(resources, attributeSet, theme, xmlPullParser);
                        dVar.f58864b.add(dVar2);
                        arrayDeque.push(dVar2);
                        if (dVar2.getGroupName() != null) {
                            gVar.f58896p.put(dVar2.getGroupName(), dVar2);
                        }
                        hVar.f58897a = dVar2.f58873k | hVar.f58897a;
                    }
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f58843b;
        g gVar = hVar.f58898b;
        hVar.f58900d = f(C6190k.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = C6190k.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            hVar.f58899c = colorStateListG;
        }
        hVar.f58901e = C6190k.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f58901e);
        gVar.f58891k = C6190k.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f58891k);
        float fJ = C6190k.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f58892l);
        gVar.f58892l = fJ;
        if (gVar.f58891k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f58889i = typedArray.getDimension(3, gVar.f58889i);
        float dimension = typedArray.getDimension(2, gVar.f58890j);
        gVar.f58890j = dimension;
        if (gVar.f58889i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(C6190k.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f58894n = string;
            gVar.f58896p.put(string, gVar);
        }
    }

    Object c(String str) {
        return this.f58843b.f58898b.f58896p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f58841a;
        if (drawable == null) {
            return false;
        }
        C13462a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f58850i);
        if (this.f58850i.width() <= 0 || this.f58850i.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f58845d;
        if (colorFilter == null) {
            colorFilter = this.f58844c;
        }
        canvas.getMatrix(this.f58849h);
        this.f58849h.getValues(this.f58848g);
        float fAbs = Math.abs(this.f58848g[0]);
        float fAbs2 = Math.abs(this.f58848g[4]);
        float fAbs3 = Math.abs(this.f58848g[1]);
        float fAbs4 = Math.abs(this.f58848g[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(RecyclerView.m.FLAG_MOVED, (int) (this.f58850i.width() * fAbs));
        int iMin2 = Math.min(RecyclerView.m.FLAG_MOVED, (int) (this.f58850i.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f58850i;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f58850i.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f58850i.offsetTo(0, 0);
        this.f58843b.c(iMin, iMin2);
        if (!this.f58847f) {
            this.f58843b.j(iMin, iMin2);
        } else if (!this.f58843b.b()) {
            this.f58843b.j(iMin, iMin2);
            this.f58843b.i();
        }
        this.f58843b.d(canvas, colorFilter, this.f58850i);
        canvas.restoreToCount(iSave);
    }

    void g(boolean z10) {
        this.f58847f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f58841a;
        return drawable != null ? C13462a.d(drawable) : this.f58843b.f58898b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f58841a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f58843b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f58841a;
        return drawable != null ? C13462a.e(drawable) : this.f58845d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f58841a != null) {
            return new i(this.f58841a.getConstantState());
        }
        this.f58843b.f58897a = getChangingConfigurations();
        return this.f58843b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f58841a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f58843b.f58898b.f58890j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f58841a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f58843b.f58898b.f58889i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f58841a;
        return drawable != null ? C13462a.h(drawable) : this.f58843b.f58901e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f58843b;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f58843b.f58899c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f58846e && super.mutate() == this) {
            this.f58843b = new h(this.f58843b);
            this.f58846e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f58843b;
        ColorStateList colorStateList = hVar.f58899c;
        if (colorStateList == null || (mode = hVar.f58900d) == null) {
            z10 = false;
        } else {
            this.f58844c = i(this.f58844c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f58843b.f58898b.getRootAlpha() != i10) {
            this.f58843b.f58898b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            C13462a.j(drawable, z10);
        } else {
            this.f58843b.f58901e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f58845d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            C13462a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            C13462a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f58843b;
        if (hVar.f58899c != colorStateList) {
            hVar.f58899c = colorStateList;
            this.f58844c = i(this.f58844c, colorStateList, hVar.f58900d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            C13462a.p(drawable, mode);
            return;
        }
        h hVar = this.f58843b;
        if (hVar.f58900d != mode) {
            hVar.f58900d = mode;
            this.f58844c = i(this.f58844c, hVar.f58899c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f58841a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    private boolean e() {
        if (isAutoMirrored() && C13462a.f(this) == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f58841a;
        if (drawable != null) {
            C13462a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f58843b;
        hVar.f58898b = new g();
        TypedArray typedArrayQ = C6190k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f58812a);
        h(typedArrayQ, xmlPullParser, theme);
        typedArrayQ.recycle();
        hVar.f58897a = getChangingConfigurations();
        hVar.f58907k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f58844c = i(this.f58844c, hVar.f58899c, hVar.f58900d);
    }

    f(h hVar) {
        this.f58847f = true;
        this.f58848g = new float[9];
        this.f58849h = new Matrix();
        this.f58850i = new Rect();
        this.f58843b = hVar;
        this.f58844c = i(this.f58844c, hVar.f58899c, hVar.f58900d);
    }
}
