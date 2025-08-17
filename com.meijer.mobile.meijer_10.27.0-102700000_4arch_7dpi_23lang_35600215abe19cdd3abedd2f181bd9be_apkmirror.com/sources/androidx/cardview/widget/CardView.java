package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f47692h = {R.attr.colorBackground};

    /* renamed from: i, reason: collision with root package name */
    private static final c f47693i;

    /* renamed from: a, reason: collision with root package name */
    private boolean f47694a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f47695b;

    /* renamed from: c, reason: collision with root package name */
    int f47696c;

    /* renamed from: d, reason: collision with root package name */
    int f47697d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f47698e;

    /* renamed from: f, reason: collision with root package name */
    final Rect f47699f;

    /* renamed from: g, reason: collision with root package name */
    private final b f47700g;

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f47701a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.f47699f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f47698e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // androidx.cardview.widget.b
        public void b(Drawable drawable) {
            this.f47701a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable d() {
            return this.f47701a;
        }

        @Override // androidx.cardview.widget.b
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public View f() {
            return CardView.this;
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Y.a.f39937a);
    }

    public void setCardBackgroundColor(int i10) {
        f47693i.n(this.f47700g, ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f47698e = rect;
        this.f47699f = new Rect();
        a aVar = new a();
        this.f47700g = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y.d.f39941a, i10, Y.c.f39940a);
        if (typedArrayObtainStyledAttributes.hasValue(Y.d.f39944d)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(Y.d.f39944d);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f47692h);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(Y.b.f39939b) : getResources().getColor(Y.b.f39938a));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(Y.d.f39945e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(Y.d.f39946f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(Y.d.f39947g, 0.0f);
        this.f47694a = typedArrayObtainStyledAttributes.getBoolean(Y.d.f39949i, false);
        this.f47695b = typedArrayObtainStyledAttributes.getBoolean(Y.d.f39948h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(Y.d.f39950j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(Y.d.f39952l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(Y.d.f39954n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(Y.d.f39953m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(Y.d.f39951k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f47696c = typedArrayObtainStyledAttributes.getDimensionPixelSize(Y.d.f39942b, 0);
        this.f47697d = typedArrayObtainStyledAttributes.getDimensionPixelSize(Y.d.f39943c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f47693i.h(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void e(int i10, int i11, int i12, int i13) {
        this.f47698e.set(i10, i11, i12, i13);
        f47693i.k(this.f47700g);
    }

    public ColorStateList getCardBackgroundColor() {
        return f47693i.e(this.f47700g);
    }

    public float getCardElevation() {
        return f47693i.i(this.f47700g);
    }

    public int getContentPaddingBottom() {
        return this.f47698e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f47698e.left;
    }

    public int getContentPaddingRight() {
        return this.f47698e.right;
    }

    public int getContentPaddingTop() {
        return this.f47698e.top;
    }

    public float getMaxCardElevation() {
        return f47693i.d(this.f47700g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f47695b;
    }

    public float getRadius() {
        return f47693i.b(this.f47700g);
    }

    public boolean getUseCompatPadding() {
        return this.f47694a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (f47693i instanceof androidx.cardview.widget.a) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.m(this.f47700g)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.f(this.f47700g)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f47693i.n(this.f47700g, colorStateList);
    }

    public void setCardElevation(float f10) {
        f47693i.c(this.f47700g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f47693i.o(this.f47700g, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f47697d = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f47696c = i10;
        super.setMinimumWidth(i10);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f47695b) {
            this.f47695b = z10;
            f47693i.g(this.f47700g);
        }
    }

    public void setRadius(float f10) {
        f47693i.a(this.f47700g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f47694a != z10) {
            this.f47694a = z10;
            f47693i.j(this.f47700g);
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f47693i = aVar;
        aVar.l();
    }
}
