package com.flipp.sfml.views;

import Ra.n;
import Sa.h;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.flipp.sfml.views.ZoomScrollView;
import com.fullstory.instrumentation.FSDraw;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class b extends Drawable implements h.a, ZoomScrollView.f, FSDraw {

    /* renamed from: a, reason: collision with root package name */
    private n f64308a;

    /* renamed from: g, reason: collision with root package name */
    private float f64314g;

    /* renamed from: h, reason: collision with root package name */
    private float f64315h;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f64309b = new RectF();

    /* renamed from: c, reason: collision with root package name */
    private final Rect f64310c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    private final RectF f64311d = new RectF();

    /* renamed from: e, reason: collision with root package name */
    private float f64312e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    private float f64313f = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private RectF f64319l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    private RectF f64320m = new RectF();

    /* renamed from: i, reason: collision with root package name */
    private RectF f64316i = new RectF();

    /* renamed from: j, reason: collision with root package name */
    private RectF f64317j = new RectF();

    /* renamed from: k, reason: collision with root package name */
    private SparseArray<HashSet<String>> f64318k = new SparseArray<>();

    private void l(RectF rectF, Rect rect, double d10) {
        rect.set(0, 0, 256, 256);
        float f10 = rectF.top;
        RectF rectF2 = this.f64311d;
        float f11 = rectF2.top;
        if (f10 < f11) {
            rect.top = (int) (((f11 - f10) / d10) * 256.0d);
            rectF.top = f11;
        }
        float f12 = rectF.bottom;
        float f13 = rectF2.bottom;
        if (f12 > f13) {
            rect.bottom = (int) ((1.0d - ((f12 - f13) / d10)) * 256.0d);
            rectF.bottom = f13;
        }
        float f14 = rectF.left;
        float f15 = rectF2.left;
        if (f14 < f15) {
            rect.left = (int) (((f15 - f14) / d10) * 256.0d);
            rectF.left = f15;
        }
        float f16 = rectF.right;
        float f17 = rectF2.right;
        if (f16 > f17) {
            rect.right = (int) ((1.0d - ((f16 - f17) / d10)) * 256.0d);
            rectF.right = f17;
        }
    }

    @Override // Sa.h.a
    public void b() {
        o(new int[0]);
    }

    @Override // com.flipp.sfml.views.ZoomScrollView.f
    public void c() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void r(n nVar) {
        o(new int[0]);
        this.f64308a = nVar;
        if (nVar != null) {
            this.f64311d.set(nVar.n());
        } else {
            this.f64311d.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    private int d(float f10) {
        double d10 = 256.0f / f10;
        double d11 = Double.POSITIVE_INFINITY;
        int i10 = 0;
        int i11 = 0;
        for (double d12 : this.f64308a.o()) {
            double dAbs = Math.abs((d12 * 256.0d) - d10);
            if (dAbs < d11) {
                i10 = i11;
                d11 = dAbs;
            }
            i11++;
        }
        return i10;
    }

    private String f(int i10, int i11, int i12) {
        return this.f64308a.m() + i12 + "_" + i11 + "_" + i10 + ".jpg";
    }

    private HashSet<String> h(int i10) {
        HashSet<String> hashSet = this.f64318k.get(i10);
        if (hashSet != null) {
            return hashSet;
        }
        HashSet<String> hashSet2 = new HashSet<>();
        this.f64318k.put(i10, hashSet2);
        return hashSet2;
    }

    private void i() {
        this.f64319l.set(this.f64316i);
        k(this.f64319l);
        this.f64320m.set(this.f64317j);
        k(this.f64320m);
    }

    private void j(Canvas canvas, RectF rectF, int i10) {
        HashSet<String> hashSet;
        Bitmap bitmapF;
        HashSet<String> hashSetH = h(i10);
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(hashSetH);
        double dN = n(i10);
        int iFloor = (int) Math.floor(this.f64308a.h() / dN);
        float fH = this.f64308a.h() - rectF.top;
        int iMax = Math.max((int) Math.floor((this.f64308a.h() - rectF.bottom) / dN), 0);
        int iMin = Math.min((int) Math.ceil(fH / dN), iFloor);
        int iMax2 = Math.max((int) Math.floor(rectF.left / dN), 0);
        int iFloor2 = (int) Math.floor(rectF.right / dN);
        if (i10 != 0) {
            RectF rectF2 = this.f64317j;
            RectF rectF3 = this.f64316i;
            if (!rectF2.intersects(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom)) {
                o(0);
                return;
            }
        }
        while (iMax <= iMin) {
            int i11 = iMax2;
            while (i11 <= iFloor2) {
                double dH = this.f64308a.h() - ((iMax + 1) * dN);
                double d10 = i11 * dN;
                int i12 = iMin;
                int i13 = iMax2;
                HashSet<String> hashSet3 = hashSetH;
                HashSet hashSet4 = hashSet2;
                int i14 = iFloor2;
                this.f64309b.set((float) d10, (float) dH, (float) (d10 + dN), (float) (dH + dN));
                l(this.f64309b, this.f64310c, dN);
                String strF = f(iMax, i11, i10);
                hashSet4.remove(strF);
                if (this.f64309b.isEmpty()) {
                    hashSet = hashSet3;
                    bitmapF = null;
                } else {
                    bitmapF = ((h) Qa.c.c(h.class)).f(strF, this);
                    hashSet = hashSet3;
                    if (!hashSet.contains(strF)) {
                        hashSet.add(strF);
                    }
                }
                if (bitmapF != null) {
                    canvas.drawBitmap(bitmapF, this.f64310c, this.f64309b, (Paint) null);
                }
                i11++;
                iFloor2 = i14;
                hashSet2 = hashSet4;
                hashSetH = hashSet;
                iMin = i12;
                iMax2 = i13;
            }
            iMax++;
            hashSetH = hashSetH;
            iMax2 = iMax2;
        }
        HashSet<String> hashSet5 = hashSetH;
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((h) Qa.c.c(h.class)).e(str, this);
            hashSet5.remove(str);
        }
    }

    private void k(RectF rectF) {
        if (rectF == null || rectF.isEmpty()) {
            return;
        }
        float fWidth = this.f64311d.width() / this.f64317j.width();
        float fHeight = this.f64311d.height() / this.f64317j.height();
        if (Float.isNaN(fWidth) || Float.isNaN(fHeight) || Float.isInfinite(fWidth) || Float.isInfinite(fHeight)) {
            rectF.setEmpty();
            return;
        }
        if (!rectF.setIntersect(rectF, this.f64317j)) {
            rectF.setEmpty();
            return;
        }
        RectF rectF2 = this.f64311d;
        float f10 = rectF2.left;
        float f11 = rectF.left;
        RectF rectF3 = this.f64317j;
        float f12 = rectF3.left;
        float f13 = rectF2.top;
        float f14 = rectF.top;
        float f15 = rectF3.top;
        rectF.set(((f11 - f12) * fWidth) + f10, ((f14 - f15) * fHeight) + f13, f10 + ((rectF.right - f12) * fWidth), f13 + ((rectF.bottom - f15) * fHeight));
    }

    private double n(int i10) {
        return this.f64308a.o()[i10] * 256.0d;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        n nVar = this.f64308a;
        if (nVar == null || nVar.o() == null || this.f64308a.o().length == 0) {
            return;
        }
        i();
        int iD = d(this.f64313f * this.f64312e);
        o(0, iD);
        int iSave = canvas.save();
        canvas.scale(this.f64314g, this.f64315h);
        RectF rectF = this.f64311d;
        canvas.translate(-rectF.left, -rectF.top);
        j(canvas, this.f64320m, 0);
        if (iD != 0) {
            j(canvas, this.f64319l, iD);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // com.flipp.sfml.views.ZoomScrollView.f
    public void e(boolean z10, boolean z11, float f10, float f11, float f12, float f13) {
        RectF rectF = this.f64316i;
        if (rectF.left == f10 && rectF.right == f12 && rectF.top == f11 && rectF.bottom == f13) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    @Override // com.flipp.sfml.views.ZoomScrollView.f
    public void g(float f10) {
        if (this.f64312e == f10) {
            return;
        }
        this.f64312e = f10;
        invalidateSelf();
    }

    protected void o(int... iArr) {
        n nVar = this.f64308a;
        if (nVar == null || nVar.o() == null) {
            return;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (iArr != null) {
            for (int i10 : iArr) {
                sparseBooleanArray.put(i10, true);
            }
        }
        for (int i11 = 0; i11 < this.f64308a.o().length; i11++) {
            if (!sparseBooleanArray.get(i11, false)) {
                m(i11);
            }
        }
    }

    public float p() {
        n nVar = this.f64308a;
        if (nVar == null) {
            return 0.0f;
        }
        return nVar.l();
    }

    public float q() {
        n nVar = this.f64308a;
        if (nVar == null) {
            return 0.0f;
        }
        return nVar.q();
    }

    public void s(RectF rectF) {
        this.f64317j.set(rectF);
    }

    private int m(int i10) {
        HashSet<String> hashSetH = h(i10);
        int i11 = 0;
        if (hashSetH.isEmpty()) {
            return 0;
        }
        Iterator<String> it = hashSetH.iterator();
        while (it.hasNext()) {
            i11++;
            ((h) Qa.c.c(h.class)).e(it.next(), this);
        }
        hashSetH.clear();
        this.f64318k.remove(i10);
        return i11;
    }

    @Override // Sa.h.a
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) p();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) q();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f64314g = rect.width() / q();
        this.f64315h = rect.height() / p();
        this.f64313f = this.f64314g;
    }
}
