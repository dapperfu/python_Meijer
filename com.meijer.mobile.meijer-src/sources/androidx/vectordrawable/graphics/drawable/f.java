package androidx.vectordrawable.graphics.drawable;

import Z.C5603a;
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
import b2.C6323d;
import b2.C6327h;
import b2.C6330k;
import c2.f;
import com.fullstory.instrumentation.FSDraw;
import com.medallia.digital.mobilesdk.l3;
import d2.C13595a;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class f extends androidx.vectordrawable.graphics.drawable.e implements FSDraw {

    /* renamed from: j, reason: collision with root package name */
    static final PorterDuff.Mode f59028j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private h f59029b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f59030c;

    /* renamed from: d, reason: collision with root package name */
    private ColorFilter f59031d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f59032e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f59033f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f59034g;

    /* renamed from: h, reason: collision with root package name */
    private final Matrix f59035h;

    /* renamed from: i, reason: collision with root package name */
    private final Rect f59036i;

    private static class b extends AbstractC1164f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f59063b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f59062a = c2.f.d(string2);
            }
            this.f59064c = C6330k.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.AbstractC1164f
        public boolean c() {
            return true;
        }

        b(b bVar) {
            super(bVar);
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C6330k.p(xmlPullParser, "pathData")) {
                TypedArray typedArrayQ = C6330k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f59001d);
                f(typedArrayQ, xmlPullParser);
                typedArrayQ.recycle();
            }
        }
    }

    private static class c extends AbstractC1164f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f59037e;

        /* renamed from: f, reason: collision with root package name */
        C6323d f59038f;

        /* renamed from: g, reason: collision with root package name */
        float f59039g;

        /* renamed from: h, reason: collision with root package name */
        C6323d f59040h;

        /* renamed from: i, reason: collision with root package name */
        float f59041i;

        /* renamed from: j, reason: collision with root package name */
        float f59042j;

        /* renamed from: k, reason: collision with root package name */
        float f59043k;

        /* renamed from: l, reason: collision with root package name */
        float f59044l;

        /* renamed from: m, reason: collision with root package name */
        float f59045m;

        /* renamed from: n, reason: collision with root package name */
        Paint.Cap f59046n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Join f59047o;

        /* renamed from: p, reason: collision with root package name */
        float f59048p;

        c() {
            this.f59039g = 0.0f;
            this.f59041i = 1.0f;
            this.f59042j = 1.0f;
            this.f59043k = 0.0f;
            this.f59044l = 1.0f;
            this.f59045m = 0.0f;
            this.f59046n = Paint.Cap.BUTT;
            this.f59047o = Paint.Join.MITER;
            this.f59048p = 4.0f;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f59037e = null;
            if (C6330k.p(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f59063b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f59062a = c2.f.d(string2);
                }
                this.f59040h = C6330k.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f59042j = C6330k.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f59042j);
                this.f59046n = e(C6330k.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f59046n);
                this.f59047o = f(C6330k.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f59047o);
                this.f59048p = C6330k.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f59048p);
                this.f59038f = C6330k.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f59041i = C6330k.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f59041i);
                this.f59039g = C6330k.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f59039g);
                this.f59044l = C6330k.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f59044l);
                this.f59045m = C6330k.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f59045m);
                this.f59043k = C6330k.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f59043k);
                this.f59064c = C6330k.k(typedArray, xmlPullParser, "fillType", 13, this.f59064c);
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
            return this.f59040h.i() || this.f59038f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            return this.f59038f.j(iArr) | this.f59040h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayQ = C6330k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f59000c);
            h(typedArrayQ, xmlPullParser, theme);
            typedArrayQ.recycle();
        }

        float getFillAlpha() {
            return this.f59042j;
        }

        int getFillColor() {
            return this.f59040h.e();
        }

        float getStrokeAlpha() {
            return this.f59041i;
        }

        int getStrokeColor() {
            return this.f59038f.e();
        }

        float getStrokeWidth() {
            return this.f59039g;
        }

        float getTrimPathEnd() {
            return this.f59044l;
        }

        float getTrimPathOffset() {
            return this.f59045m;
        }

        float getTrimPathStart() {
            return this.f59043k;
        }

        void setFillAlpha(float f10) {
            this.f59042j = f10;
        }

        void setFillColor(int i10) {
            this.f59040h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f59041i = f10;
        }

        void setStrokeColor(int i10) {
            this.f59038f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f59039g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f59044l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f59045m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f59043k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f59039g = 0.0f;
            this.f59041i = 1.0f;
            this.f59042j = 1.0f;
            this.f59043k = 0.0f;
            this.f59044l = 1.0f;
            this.f59045m = 0.0f;
            this.f59046n = Paint.Cap.BUTT;
            this.f59047o = Paint.Join.MITER;
            this.f59048p = 4.0f;
            this.f59037e = cVar.f59037e;
            this.f59038f = cVar.f59038f;
            this.f59039g = cVar.f59039g;
            this.f59041i = cVar.f59041i;
            this.f59040h = cVar.f59040h;
            this.f59064c = cVar.f59064c;
            this.f59042j = cVar.f59042j;
            this.f59043k = cVar.f59043k;
            this.f59044l = cVar.f59044l;
            this.f59045m = cVar.f59045m;
            this.f59046n = cVar.f59046n;
            this.f59047o = cVar.f59047o;
            this.f59048p = cVar.f59048p;
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f59049a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<e> f59050b;

        /* renamed from: c, reason: collision with root package name */
        float f59051c;

        /* renamed from: d, reason: collision with root package name */
        private float f59052d;

        /* renamed from: e, reason: collision with root package name */
        private float f59053e;

        /* renamed from: f, reason: collision with root package name */
        private float f59054f;

        /* renamed from: g, reason: collision with root package name */
        private float f59055g;

        /* renamed from: h, reason: collision with root package name */
        private float f59056h;

        /* renamed from: i, reason: collision with root package name */
        private float f59057i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f59058j;

        /* renamed from: k, reason: collision with root package name */
        int f59059k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f59060l;

        /* renamed from: m, reason: collision with root package name */
        private String f59061m;

        d(d dVar, C5603a<String, Object> c5603a) {
            AbstractC1164f bVar;
            super();
            this.f59049a = new Matrix();
            this.f59050b = new ArrayList<>();
            this.f59051c = 0.0f;
            this.f59052d = 0.0f;
            this.f59053e = 0.0f;
            this.f59054f = 1.0f;
            this.f59055g = 1.0f;
            this.f59056h = 0.0f;
            this.f59057i = 0.0f;
            Matrix matrix = new Matrix();
            this.f59058j = matrix;
            this.f59061m = null;
            this.f59051c = dVar.f59051c;
            this.f59052d = dVar.f59052d;
            this.f59053e = dVar.f59053e;
            this.f59054f = dVar.f59054f;
            this.f59055g = dVar.f59055g;
            this.f59056h = dVar.f59056h;
            this.f59057i = dVar.f59057i;
            this.f59060l = dVar.f59060l;
            String str = dVar.f59061m;
            this.f59061m = str;
            this.f59059k = dVar.f59059k;
            if (str != null) {
                c5603a.put(str, this);
            }
            matrix.set(dVar.f59058j);
            ArrayList<e> arrayList = dVar.f59050b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f59050b.add(new d((d) eVar, c5603a));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f59050b.add(bVar);
                    String str2 = bVar.f59063b;
                    if (str2 != null) {
                        c5603a.put(str2, bVar);
                    }
                }
            }
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f59060l = null;
            this.f59051c = C6330k.j(typedArray, xmlPullParser, "rotation", 5, this.f59051c);
            this.f59052d = typedArray.getFloat(1, this.f59052d);
            this.f59053e = typedArray.getFloat(2, this.f59053e);
            this.f59054f = C6330k.j(typedArray, xmlPullParser, "scaleX", 3, this.f59054f);
            this.f59055g = C6330k.j(typedArray, xmlPullParser, "scaleY", 4, this.f59055g);
            this.f59056h = C6330k.j(typedArray, xmlPullParser, "translateX", 6, this.f59056h);
            this.f59057i = C6330k.j(typedArray, xmlPullParser, "translateY", 7, this.f59057i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f59061m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f59050b.size(); i10++) {
                if (this.f59050b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f59050b.size(); i10++) {
                zB |= this.f59050b.get(i10).b(iArr);
            }
            return zB;
        }

        private void d() {
            this.f59058j.reset();
            this.f59058j.postTranslate(-this.f59052d, -this.f59053e);
            this.f59058j.postScale(this.f59054f, this.f59055g);
            this.f59058j.postRotate(this.f59051c, 0.0f, 0.0f);
            this.f59058j.postTranslate(this.f59056h + this.f59052d, this.f59057i + this.f59053e);
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayQ = C6330k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f58999b);
            e(typedArrayQ, xmlPullParser);
            typedArrayQ.recycle();
        }

        public String getGroupName() {
            return this.f59061m;
        }

        public Matrix getLocalMatrix() {
            return this.f59058j;
        }

        public float getPivotX() {
            return this.f59052d;
        }

        public float getPivotY() {
            return this.f59053e;
        }

        public float getRotation() {
            return this.f59051c;
        }

        public float getScaleX() {
            return this.f59054f;
        }

        public float getScaleY() {
            return this.f59055g;
        }

        public float getTranslateX() {
            return this.f59056h;
        }

        public float getTranslateY() {
            return this.f59057i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f59052d) {
                this.f59052d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f59053e) {
                this.f59053e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f59051c) {
                this.f59051c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f59054f) {
                this.f59054f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f59055g) {
                this.f59055g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f59056h) {
                this.f59056h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f59057i) {
                this.f59057i = f10;
                d();
            }
        }

        d() {
            super();
            this.f59049a = new Matrix();
            this.f59050b = new ArrayList<>();
            this.f59051c = 0.0f;
            this.f59052d = 0.0f;
            this.f59053e = 0.0f;
            this.f59054f = 1.0f;
            this.f59055g = 1.0f;
            this.f59056h = 0.0f;
            this.f59057i = 0.0f;
            this.f59058j = new Matrix();
            this.f59061m = null;
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
    private static abstract class AbstractC1164f extends e {

        /* renamed from: a, reason: collision with root package name */
        protected f.b[] f59062a;

        /* renamed from: b, reason: collision with root package name */
        String f59063b;

        /* renamed from: c, reason: collision with root package name */
        int f59064c;

        /* renamed from: d, reason: collision with root package name */
        int f59065d;

        AbstractC1164f() {
            super();
            this.f59062a = null;
            this.f59064c = 0;
        }

        public boolean c() {
            return false;
        }

        public f.b[] getPathData() {
            return this.f59062a;
        }

        public String getPathName() {
            return this.f59063b;
        }

        public void setPathData(f.b[] bVarArr) {
            if (c2.f.b(this.f59062a, bVarArr)) {
                c2.f.k(this.f59062a, bVarArr);
            } else {
                this.f59062a = c2.f.f(bVarArr);
            }
        }

        public void d(Path path) {
            path.reset();
            f.b[] bVarArr = this.f59062a;
            if (bVarArr != null) {
                c2.f.j(bVarArr, path);
            }
        }

        AbstractC1164f(AbstractC1164f abstractC1164f) {
            super();
            this.f59062a = null;
            this.f59064c = 0;
            this.f59063b = abstractC1164f.f59063b;
            this.f59065d = abstractC1164f.f59065d;
            this.f59062a = c2.f.f(abstractC1164f.f59062a);
        }
    }

    private static class g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f59066q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f59067a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f59068b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f59069c;

        /* renamed from: d, reason: collision with root package name */
        Paint f59070d;

        /* renamed from: e, reason: collision with root package name */
        Paint f59071e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f59072f;

        /* renamed from: g, reason: collision with root package name */
        private int f59073g;

        /* renamed from: h, reason: collision with root package name */
        final d f59074h;

        /* renamed from: i, reason: collision with root package name */
        float f59075i;

        /* renamed from: j, reason: collision with root package name */
        float f59076j;

        /* renamed from: k, reason: collision with root package name */
        float f59077k;

        /* renamed from: l, reason: collision with root package name */
        float f59078l;

        /* renamed from: m, reason: collision with root package name */
        int f59079m;

        /* renamed from: n, reason: collision with root package name */
        String f59080n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f59081o;

        /* renamed from: p, reason: collision with root package name */
        final C5603a<String, Object> f59082p;

        g() {
            this.f59069c = new Matrix();
            this.f59075i = 0.0f;
            this.f59076j = 0.0f;
            this.f59077k = 0.0f;
            this.f59078l = 0.0f;
            this.f59079m = l3.f93323c;
            this.f59080n = null;
            this.f59081o = null;
            this.f59082p = new C5603a<>();
            this.f59074h = new d();
            this.f59067a = new Path();
            this.f59068b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void d(d dVar, AbstractC1164f abstractC1164f, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f59077k;
            float f11 = i11 / this.f59078l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f59049a;
            this.f59069c.set(matrix);
            this.f59069c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            abstractC1164f.d(this.f59067a);
            Path path = this.f59067a;
            this.f59068b.reset();
            if (abstractC1164f.c()) {
                this.f59068b.setFillType(abstractC1164f.f59064c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f59068b.addPath(path, this.f59069c);
                canvas.clipPath(this.f59068b);
                return;
            }
            c cVar = (c) abstractC1164f;
            float f12 = cVar.f59043k;
            if (f12 != 0.0f || cVar.f59044l != 1.0f) {
                float f13 = cVar.f59045m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f59044l + f13) % 1.0f;
                if (this.f59072f == null) {
                    this.f59072f = new PathMeasure();
                }
                this.f59072f.setPath(this.f59067a, false);
                float length = this.f59072f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f59072f.getSegment(f16, length, path, true);
                    this.f59072f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f59072f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f59068b.addPath(path, this.f59069c);
            if (cVar.f59040h.l()) {
                C6323d c6323d = cVar.f59040h;
                if (this.f59071e == null) {
                    Paint paint = new Paint(1);
                    this.f59071e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f59071e;
                if (c6323d.h()) {
                    Shader shaderF = c6323d.f();
                    shaderF.setLocalMatrix(this.f59069c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f59042j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(l3.f93323c);
                    paint2.setColor(f.a(c6323d.e(), cVar.f59042j));
                }
                paint2.setColorFilter(colorFilter);
                this.f59068b.setFillType(cVar.f59064c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f59068b, paint2);
            }
            if (cVar.f59038f.l()) {
                C6323d c6323d2 = cVar.f59038f;
                if (this.f59070d == null) {
                    Paint paint3 = new Paint(1);
                    this.f59070d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f59070d;
                Paint.Join join = cVar.f59047o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f59046n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f59048p);
                if (c6323d2.h()) {
                    Shader shaderF2 = c6323d2.f();
                    shaderF2.setLocalMatrix(this.f59069c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f59041i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(l3.f93323c);
                    paint4.setColor(f.a(c6323d2.e(), cVar.f59041i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f59039g * fMin * fE);
                canvas.drawPath(this.f59068b, paint4);
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
            dVar2.f59049a.set(matrix);
            dVar2.f59049a.preConcat(dVar2.f59058j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.f59050b.size()) {
                e eVar = dVar2.f59050b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f59049a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof AbstractC1164f) {
                    d(dVar2, (AbstractC1164f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f59074h, f59066q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f59081o == null) {
                this.f59081o = Boolean.valueOf(this.f59074h.a());
            }
            return this.f59081o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f59074h.b(iArr);
        }

        public int getRootAlpha() {
            return this.f59079m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f59079m = i10;
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        g(g gVar) {
            this.f59069c = new Matrix();
            this.f59075i = 0.0f;
            this.f59076j = 0.0f;
            this.f59077k = 0.0f;
            this.f59078l = 0.0f;
            this.f59079m = l3.f93323c;
            this.f59080n = null;
            this.f59081o = null;
            C5603a<String, Object> c5603a = new C5603a<>();
            this.f59082p = c5603a;
            this.f59074h = new d(gVar.f59074h, c5603a);
            this.f59067a = new Path(gVar.f59067a);
            this.f59068b = new Path(gVar.f59068b);
            this.f59075i = gVar.f59075i;
            this.f59076j = gVar.f59076j;
            this.f59077k = gVar.f59077k;
            this.f59078l = gVar.f59078l;
            this.f59073g = gVar.f59073g;
            this.f59079m = gVar.f59079m;
            this.f59080n = gVar.f59080n;
            String str = gVar.f59080n;
            if (str != null) {
                c5603a.put(str, this);
            }
            this.f59081o = gVar.f59081o;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f59083a;

        /* renamed from: b, reason: collision with root package name */
        g f59084b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f59085c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f59086d;

        /* renamed from: e, reason: collision with root package name */
        boolean f59087e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f59088f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f59089g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f59090h;

        /* renamed from: i, reason: collision with root package name */
        int f59091i;

        /* renamed from: j, reason: collision with root package name */
        boolean f59092j;

        /* renamed from: k, reason: collision with root package name */
        boolean f59093k;

        /* renamed from: l, reason: collision with root package name */
        Paint f59094l;

        h(h hVar) {
            this.f59085c = null;
            this.f59086d = f.f59028j;
            if (hVar != null) {
                this.f59083a = hVar.f59083a;
                g gVar = new g(hVar.f59084b);
                this.f59084b = gVar;
                if (hVar.f59084b.f59071e != null) {
                    gVar.f59071e = new Paint(hVar.f59084b.f59071e);
                }
                if (hVar.f59084b.f59070d != null) {
                    this.f59084b.f59070d = new Paint(hVar.f59084b.f59070d);
                }
                this.f59085c = hVar.f59085c;
                this.f59086d = hVar.f59086d;
                this.f59087e = hVar.f59087e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new f(this);
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f59088f.getWidth() && i11 == this.f59088f.getHeight();
        }

        public boolean b() {
            return !this.f59093k && this.f59089g == this.f59085c && this.f59090h == this.f59086d && this.f59092j == this.f59087e && this.f59091i == this.f59084b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f59088f == null || !a(i10, i11)) {
                this.f59088f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f59093k = true;
            }
        }

        public boolean f() {
            return this.f59084b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f59084b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f59083a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f59084b.g(iArr);
            this.f59093k |= zG;
            return zG;
        }

        public void i() {
            this.f59089g = this.f59085c;
            this.f59090h = this.f59086d;
            this.f59091i = this.f59084b.getRootAlpha();
            this.f59092j = this.f59087e;
            this.f59093k = false;
        }

        public void j(int i10, int i11) {
            this.f59088f.eraseColor(0);
            this.f59084b.b(new Canvas(this.f59088f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f59088f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f59094l == null) {
                Paint paint = new Paint();
                this.f59094l = paint;
                paint.setFilterBitmap(true);
            }
            this.f59094l.setAlpha(this.f59084b.getRootAlpha());
            this.f59094l.setColorFilter(colorFilter);
            return this.f59094l;
        }

        h() {
            this.f59085c = null;
            this.f59086d = f.f59028j;
            this.f59084b = new g();
        }
    }

    private static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f59095a;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f59027a = (VectorDrawable) this.f59095a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f59095a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f59095a.getChangingConfigurations();
        }

        i(Drawable.ConstantState constantState) {
            this.f59095a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f59027a = (VectorDrawable) this.f59095a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f59027a = (VectorDrawable) this.f59095a.newDrawable(resources, theme);
            return fVar;
        }
    }

    f() {
        this.f59033f = true;
        this.f59034g = new float[9];
        this.f59035h = new Matrix();
        this.f59036i = new Rect();
        this.f59029b = new h();
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
        Drawable drawable = this.f59027a;
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
        fVar.f59027a = C6327h.f(resources, i10, theme);
        return fVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f59029b;
        g gVar = hVar.f59084b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f59074h);
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
                        dVar.f59050b.add(cVar);
                        if (cVar.getPathName() != null) {
                            gVar.f59082p.put(cVar.getPathName(), cVar);
                        }
                        hVar.f59083a = cVar.f59065d | hVar.f59083a;
                        z10 = false;
                    } else if ("clip-path".equals(name)) {
                        b bVar = new b();
                        bVar.e(resources, attributeSet, theme, xmlPullParser);
                        dVar.f59050b.add(bVar);
                        if (bVar.getPathName() != null) {
                            gVar.f59082p.put(bVar.getPathName(), bVar);
                        }
                        hVar.f59083a = bVar.f59065d | hVar.f59083a;
                    } else if ("group".equals(name)) {
                        d dVar2 = new d();
                        dVar2.c(resources, attributeSet, theme, xmlPullParser);
                        dVar.f59050b.add(dVar2);
                        arrayDeque.push(dVar2);
                        if (dVar2.getGroupName() != null) {
                            gVar.f59082p.put(dVar2.getGroupName(), dVar2);
                        }
                        hVar.f59083a = dVar2.f59059k | hVar.f59083a;
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
        h hVar = this.f59029b;
        g gVar = hVar.f59084b;
        hVar.f59086d = f(C6330k.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = C6330k.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            hVar.f59085c = colorStateListG;
        }
        hVar.f59087e = C6330k.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f59087e);
        gVar.f59077k = C6330k.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f59077k);
        float fJ = C6330k.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f59078l);
        gVar.f59078l = fJ;
        if (gVar.f59077k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f59075i = typedArray.getDimension(3, gVar.f59075i);
        float dimension = typedArray.getDimension(2, gVar.f59076j);
        gVar.f59076j = dimension;
        if (gVar.f59075i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(C6330k.j(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f59080n = string;
            gVar.f59082p.put(string, gVar);
        }
    }

    Object c(String str) {
        return this.f59029b.f59084b.f59082p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f59027a;
        if (drawable == null) {
            return false;
        }
        C13595a.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f59036i);
        if (this.f59036i.width() <= 0 || this.f59036i.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f59031d;
        if (colorFilter == null) {
            colorFilter = this.f59030c;
        }
        canvas.getMatrix(this.f59035h);
        this.f59035h.getValues(this.f59034g);
        float fAbs = Math.abs(this.f59034g[0]);
        float fAbs2 = Math.abs(this.f59034g[4]);
        float fAbs3 = Math.abs(this.f59034g[1]);
        float fAbs4 = Math.abs(this.f59034g[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(RecyclerView.m.FLAG_MOVED, (int) (this.f59036i.width() * fAbs));
        int iMin2 = Math.min(RecyclerView.m.FLAG_MOVED, (int) (this.f59036i.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f59036i;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f59036i.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f59036i.offsetTo(0, 0);
        this.f59029b.c(iMin, iMin2);
        if (!this.f59033f) {
            this.f59029b.j(iMin, iMin2);
        } else if (!this.f59029b.b()) {
            this.f59029b.j(iMin, iMin2);
            this.f59029b.i();
        }
        this.f59029b.d(canvas, colorFilter, this.f59036i);
        canvas.restoreToCount(iSave);
    }

    void g(boolean z10) {
        this.f59033f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f59027a;
        return drawable != null ? C13595a.d(drawable) : this.f59029b.f59084b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f59027a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f59029b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f59027a;
        return drawable != null ? C13595a.e(drawable) : this.f59031d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f59027a != null) {
            return new i(this.f59027a.getConstantState());
        }
        this.f59029b.f59083a = getChangingConfigurations();
        return this.f59029b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f59027a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f59029b.f59084b.f59076j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f59027a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f59029b.f59084b.f59075i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f59027a;
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
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f59027a;
        return drawable != null ? C13595a.h(drawable) : this.f59029b.f59087e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f59029b;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f59029b.f59085c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f59032e && super.mutate() == this) {
            this.f59029b = new h(this.f59029b);
            this.f59032e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f59029b;
        ColorStateList colorStateList = hVar.f59085c;
        if (colorStateList == null || (mode = hVar.f59086d) == null) {
            z10 = false;
        } else {
            this.f59030c = i(this.f59030c, colorStateList, mode);
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
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f59029b.f59084b.getRootAlpha() != i10) {
            this.f59029b.f59084b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            C13595a.j(drawable, z10);
        } else {
            this.f59029b.f59087e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f59031d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            C13595a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            C13595a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f59029b;
        if (hVar.f59085c != colorStateList) {
            hVar.f59085c = colorStateList;
            this.f59030c = i(this.f59030c, colorStateList, hVar.f59086d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            C13595a.p(drawable, mode);
            return;
        }
        h hVar = this.f59029b;
        if (hVar.f59086d != mode) {
            hVar.f59086d = mode;
            this.f59030c = i(this.f59030c, hVar.f59085c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f59027a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f59027a;
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
        if (isAutoMirrored() && C13595a.f(this) == 1) {
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
        Drawable drawable = this.f59027a;
        if (drawable != null) {
            C13595a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f59029b;
        hVar.f59084b = new g();
        TypedArray typedArrayQ = C6330k.q(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f58998a);
        h(typedArrayQ, xmlPullParser, theme);
        typedArrayQ.recycle();
        hVar.f59083a = getChangingConfigurations();
        hVar.f59093k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f59030c = i(this.f59030c, hVar.f59085c, hVar.f59086d);
    }

    f(h hVar) {
        this.f59033f = true;
        this.f59034g = new float[9];
        this.f59035h = new Matrix();
        this.f59036i = new Rect();
        this.f59029b = hVar;
        this.f59030c = i(this.f59030c, hVar.f59085c, hVar.f59086d);
    }
}
