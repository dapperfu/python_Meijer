package com.google.android.material.imageview;

import ae.k;
import ae.l;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import j.C14791a;
import oe.C16026c;
import re.C16760h;
import re.C16765m;
import re.C16766n;
import re.InterfaceC16768p;
import ue.C17250a;

/* loaded from: classes4.dex */
public class ShapeableImageView extends AppCompatImageView implements InterfaceC16768p {

    /* renamed from: s, reason: collision with root package name */
    private static final int f87047s = k.f44780H;

    /* renamed from: a, reason: collision with root package name */
    private final C16766n f87048a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f87049b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f87050c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f87051d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f87052e;

    /* renamed from: f, reason: collision with root package name */
    private final Path f87053f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f87054g;

    /* renamed from: h, reason: collision with root package name */
    private C16760h f87055h;

    /* renamed from: i, reason: collision with root package name */
    private C16765m f87056i;

    /* renamed from: j, reason: collision with root package name */
    private float f87057j;

    /* renamed from: k, reason: collision with root package name */
    private Path f87058k;

    /* renamed from: l, reason: collision with root package name */
    private int f87059l;

    /* renamed from: m, reason: collision with root package name */
    private int f87060m;

    /* renamed from: n, reason: collision with root package name */
    private int f87061n;

    /* renamed from: o, reason: collision with root package name */
    private int f87062o;

    /* renamed from: p, reason: collision with root package name */
    private int f87063p;

    /* renamed from: q, reason: collision with root package name */
    private int f87064q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f87065r;

    @TargetApi(21)
    class a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f87066a = new Rect();

        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f87056i == null) {
                return;
            }
            if (ShapeableImageView.this.f87055h == null) {
                ShapeableImageView.this.f87055h = new C16760h(ShapeableImageView.this.f87056i);
            }
            ShapeableImageView.this.f87049b.round(this.f87066a);
            ShapeableImageView.this.f87055h.setBounds(this.f87066a);
            ShapeableImageView.this.f87055h.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f87047s;
        super(C17250a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f87048a = C16766n.k();
        this.f87053f = new Path();
        this.f87065r = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f87052e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f87049b = new RectF();
        this.f87050c = new RectF();
        this.f87058k = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, l.f44974N6, i10, i11);
        setLayerType(2, null);
        this.f87054g = C16026c.a(context2, typedArrayObtainStyledAttributes, l.f45063V6);
        this.f87057j = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f45074W6, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f44986O6, 0);
        this.f87059l = dimensionPixelSize;
        this.f87060m = dimensionPixelSize;
        this.f87061n = dimensionPixelSize;
        this.f87062o = dimensionPixelSize;
        this.f87059l = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f45019R6, dimensionPixelSize);
        this.f87060m = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f45052U6, dimensionPixelSize);
        this.f87061n = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f45030S6, dimensionPixelSize);
        this.f87062o = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f44997P6, dimensionPixelSize);
        this.f87063p = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f45041T6, Integer.MIN_VALUE);
        this.f87064q = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f45008Q6, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f87051d = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f87056i = C16765m.e(context2, attributeSet, i10, i11).m();
        setOutlineProvider(new a());
    }

    private void j(Canvas canvas) {
        if (this.f87054g == null) {
            return;
        }
        this.f87051d.setStrokeWidth(this.f87057j);
        int colorForState = this.f87054g.getColorForState(getDrawableState(), this.f87054g.getDefaultColor());
        if (this.f87057j <= 0.0f || colorForState == 0) {
            return;
        }
        this.f87051d.setColor(colorForState);
        canvas.drawPath(this.f87053f, this.f87051d);
    }

    private boolean k() {
        return (this.f87063p == Integer.MIN_VALUE && this.f87064q == Integer.MIN_VALUE) ? false : true;
    }

    private void m(int i10, int i11) {
        this.f87049b.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f87048a.d(this.f87056i, 1.0f, this.f87049b, this.f87053f);
        this.f87058k.rewind();
        this.f87058k.addPath(this.f87053f);
        this.f87050c.set(0.0f, 0.0f, i10, i11);
        this.f87058k.addRect(this.f87050c, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f87062o;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f87064q;
        return i10 != Integer.MIN_VALUE ? i10 : l() ? this.f87059l : this.f87061n;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f87063p;
        return i10 != Integer.MIN_VALUE ? i10 : l() ? this.f87061n : this.f87059l;
    }

    public int getContentPaddingTop() {
        return this.f87060m;
    }

    public C16765m getShapeAppearanceModel() {
        return this.f87056i;
    }

    public ColorStateList getStrokeColor() {
        return this.f87054g;
    }

    public float getStrokeWidth() {
        return this.f87057j;
    }

    @Override // re.InterfaceC16768p
    public void setShapeAppearanceModel(C16765m c16765m) {
        this.f87056i = c16765m;
        C16760h c16760h = this.f87055h;
        if (c16760h != null) {
            c16760h.setShapeAppearanceModel(c16765m);
        }
        m(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f87054g = colorStateList;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        if (this.f87057j != f10) {
            this.f87057j = f10;
            invalidate();
        }
    }

    private boolean l() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (k()) {
            if (l() && (i11 = this.f87064q) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!l() && (i10 = this.f87063p) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f87059l;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (k()) {
            if (l() && (i11 = this.f87063p) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!l() && (i10 = this.f87064q) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f87061n;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f87058k, this.f87052e);
        j(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f87065r || !isLayoutDirectionResolved()) {
            return;
        }
        this.f87065r = true;
        if (!isPaddingRelative() && !k()) {
            setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
        } else {
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m(i10, i11);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10 + getContentPaddingLeft(), i11 + getContentPaddingTop(), i12 + getContentPaddingRight(), i13 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10 + getContentPaddingStart(), i11 + getContentPaddingTop(), i12 + getContentPaddingEnd(), i13 + getContentPaddingBottom());
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(C14791a.a(getContext(), i10));
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }
}
