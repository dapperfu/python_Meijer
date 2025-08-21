package com.google.android.material.imageview;

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
import ce.k;
import ce.l;
import j.C14879a;
import qe.C16634c;
import te.C17234h;
import te.C17239m;
import te.C17240n;
import te.InterfaceC17242p;
import we.C17867a;

/* loaded from: classes4.dex */
public class ShapeableImageView extends AppCompatImageView implements InterfaceC17242p {

    /* renamed from: s, reason: collision with root package name */
    private static final int f87887s = k.f61795H;

    /* renamed from: a, reason: collision with root package name */
    private final C17240n f87888a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f87889b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f87890c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f87891d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f87892e;

    /* renamed from: f, reason: collision with root package name */
    private final Path f87893f;

    /* renamed from: g, reason: collision with root package name */
    private ColorStateList f87894g;

    /* renamed from: h, reason: collision with root package name */
    private C17234h f87895h;

    /* renamed from: i, reason: collision with root package name */
    private C17239m f87896i;

    /* renamed from: j, reason: collision with root package name */
    private float f87897j;

    /* renamed from: k, reason: collision with root package name */
    private Path f87898k;

    /* renamed from: l, reason: collision with root package name */
    private int f87899l;

    /* renamed from: m, reason: collision with root package name */
    private int f87900m;

    /* renamed from: n, reason: collision with root package name */
    private int f87901n;

    /* renamed from: o, reason: collision with root package name */
    private int f87902o;

    /* renamed from: p, reason: collision with root package name */
    private int f87903p;

    /* renamed from: q, reason: collision with root package name */
    private int f87904q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f87905r;

    @TargetApi(21)
    class a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Rect f87906a = new Rect();

        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f87896i == null) {
                return;
            }
            if (ShapeableImageView.this.f87895h == null) {
                ShapeableImageView.this.f87895h = new C17234h(ShapeableImageView.this.f87896i);
            }
            ShapeableImageView.this.f87889b.round(this.f87906a);
            ShapeableImageView.this.f87895h.setBounds(this.f87906a);
            ShapeableImageView.this.f87895h.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f87887s;
        super(C17867a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f87888a = C17240n.k();
        this.f87893f = new Path();
        this.f87905r = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f87892e = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f87889b = new RectF();
        this.f87890c = new RectF();
        this.f87898k = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, l.f61989N6, i10, i11);
        setLayerType(2, null);
        this.f87894g = C16634c.a(context2, typedArrayObtainStyledAttributes, l.f62078V6);
        this.f87897j = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f62089W6, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f62001O6, 0);
        this.f87899l = dimensionPixelSize;
        this.f87900m = dimensionPixelSize;
        this.f87901n = dimensionPixelSize;
        this.f87902o = dimensionPixelSize;
        this.f87899l = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f62034R6, dimensionPixelSize);
        this.f87900m = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f62067U6, dimensionPixelSize);
        this.f87901n = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f62045S6, dimensionPixelSize);
        this.f87902o = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f62012P6, dimensionPixelSize);
        this.f87903p = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f62056T6, Integer.MIN_VALUE);
        this.f87904q = typedArrayObtainStyledAttributes.getDimensionPixelSize(l.f62023Q6, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f87891d = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f87896i = C17239m.e(context2, attributeSet, i10, i11).m();
        setOutlineProvider(new a());
    }

    private void j(Canvas canvas) {
        if (this.f87894g == null) {
            return;
        }
        this.f87891d.setStrokeWidth(this.f87897j);
        int colorForState = this.f87894g.getColorForState(getDrawableState(), this.f87894g.getDefaultColor());
        if (this.f87897j <= 0.0f || colorForState == 0) {
            return;
        }
        this.f87891d.setColor(colorForState);
        canvas.drawPath(this.f87893f, this.f87891d);
    }

    private boolean k() {
        return (this.f87903p == Integer.MIN_VALUE && this.f87904q == Integer.MIN_VALUE) ? false : true;
    }

    private void m(int i10, int i11) {
        this.f87889b.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f87888a.d(this.f87896i, 1.0f, this.f87889b, this.f87893f);
        this.f87898k.rewind();
        this.f87898k.addPath(this.f87893f);
        this.f87890c.set(0.0f, 0.0f, i10, i11);
        this.f87898k.addRect(this.f87890c, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f87902o;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.f87904q;
        return i10 != Integer.MIN_VALUE ? i10 : l() ? this.f87899l : this.f87901n;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f87903p;
        return i10 != Integer.MIN_VALUE ? i10 : l() ? this.f87901n : this.f87899l;
    }

    public int getContentPaddingTop() {
        return this.f87900m;
    }

    public C17239m getShapeAppearanceModel() {
        return this.f87896i;
    }

    public ColorStateList getStrokeColor() {
        return this.f87894g;
    }

    public float getStrokeWidth() {
        return this.f87897j;
    }

    @Override // te.InterfaceC17242p
    public void setShapeAppearanceModel(C17239m c17239m) {
        this.f87896i = c17239m;
        C17234h c17234h = this.f87895h;
        if (c17234h != null) {
            c17234h.setShapeAppearanceModel(c17239m);
        }
        m(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f87894g = colorStateList;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        if (this.f87897j != f10) {
            this.f87897j = f10;
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
            if (l() && (i11 = this.f87904q) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!l() && (i10 = this.f87903p) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f87899l;
    }

    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (k()) {
            if (l() && (i11 = this.f87903p) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!l() && (i10 = this.f87904q) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f87901n;
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
        canvas.drawPath(this.f87898k, this.f87892e);
        j(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f87905r || !isLayoutDirectionResolved()) {
            return;
        }
        this.f87905r = true;
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
        setStrokeColor(C14879a.a(getContext(), i10));
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }
}
