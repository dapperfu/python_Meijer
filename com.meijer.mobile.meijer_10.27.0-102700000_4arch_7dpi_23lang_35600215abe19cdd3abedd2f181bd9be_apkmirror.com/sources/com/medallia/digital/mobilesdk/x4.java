package com.medallia.digital.mobilesdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;

/* loaded from: classes7.dex */
class x4 extends FrameLayout {

    /* renamed from: A, reason: collision with root package name */
    private static final float f93463A = 2.0E-4f;

    /* renamed from: B, reason: collision with root package name */
    private static final float f93464B = 0.002f;

    /* renamed from: C, reason: collision with root package name */
    private static final float f93465C = 0.2f;

    /* renamed from: y, reason: collision with root package name */
    private static final int f93466y = 255;

    /* renamed from: z, reason: collision with root package name */
    private static final float f93467z = 0.5f;

    /* renamed from: a, reason: collision with root package name */
    private final float f93468a;

    /* renamed from: b, reason: collision with root package name */
    private final float f93469b;

    /* renamed from: c, reason: collision with root package name */
    private int f93470c;

    /* renamed from: d, reason: collision with root package name */
    private int f93471d;

    /* renamed from: e, reason: collision with root package name */
    private float f93472e;

    /* renamed from: f, reason: collision with root package name */
    private float f93473f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f93474g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f93475h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f93476i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f93477j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f93478k;

    /* renamed from: l, reason: collision with root package name */
    private final int[] f93479l;

    /* renamed from: m, reason: collision with root package name */
    private final int f93480m;

    /* renamed from: n, reason: collision with root package name */
    private final int f93481n;

    /* renamed from: o, reason: collision with root package name */
    private int f93482o;

    /* renamed from: p, reason: collision with root package name */
    private NinePatchDrawable f93483p;

    /* renamed from: q, reason: collision with root package name */
    private int f93484q;

    /* renamed from: r, reason: collision with root package name */
    private NinePatchDrawable f93485r;

    /* renamed from: s, reason: collision with root package name */
    private int f93486s;

    /* renamed from: t, reason: collision with root package name */
    private NinePatchDrawable f93487t;

    /* renamed from: u, reason: collision with root package name */
    private int f93488u;

    /* renamed from: v, reason: collision with root package name */
    private NinePatchDrawable f93489v;

    /* renamed from: w, reason: collision with root package name */
    private final Rect f93490w;

    /* renamed from: x, reason: collision with root package name */
    private final int[] f93491x;

    private static class a extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C1314a();

        /* renamed from: a, reason: collision with root package name */
        float f93492a;

        /* renamed from: b, reason: collision with root package name */
        float f93493b;

        /* renamed from: c, reason: collision with root package name */
        boolean f93494c;

        /* renamed from: d, reason: collision with root package name */
        boolean f93495d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f93496e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f93497f;

        /* renamed from: com.medallia.digital.mobilesdk.x4$a$a, reason: collision with other inner class name */
        class C1314a implements Parcelable.Creator<a> {
            C1314a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        a(Parcel parcel) {
            super(parcel);
            this.f93492a = parcel.readFloat();
            this.f93493b = parcel.readFloat();
            this.f93494c = parcel.readByte() != 0;
            this.f93495d = parcel.readByte() != 0;
            this.f93496e = parcel.readByte() != 0;
            this.f93497f = parcel.readByte() != 0;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f93492a);
            parcel.writeFloat(this.f93493b);
            parcel.writeByte(this.f93494c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f93495d ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f93496e ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f93497f ? (byte) 1 : (byte) 0);
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    x4(Context context, AttributeSet attributeSet, int i10, int i11) throws Resources.NotFoundException {
        super(context, attributeSet, i10);
        this.f93472e = 0.0f;
        this.f93473f = 0.0f;
        this.f93474g = true;
        this.f93475h = false;
        this.f93476i = true;
        this.f93477j = true;
        this.f93490w = new Rect();
        this.f93491x = new int[2];
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.md_MaterialShadowContainerView, i10, i11);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.md_MaterialShadowContainerView_md_shadowTranslationZ, this.f93472e);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.md_MaterialShadowContainerView_md_shadowElevation, this.f93473f);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.md_MaterialShadowContainerView_md_spotShadowDrawablesList, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.md_MaterialShadowContainerView_md_ambientShadowDrawablesList, 0);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.md_MaterialShadowContainerView_md_forceUseCompatShadow, this.f93475h);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.md_MaterialShadowContainerView_md_affectsDisplayedPosition, this.f93474g);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.md_MaterialShadowContainerView_md_useAmbientShadow, this.f93476i);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.md_MaterialShadowContainerView_md_useSpotShadow, this.f93477j);
        typedArrayObtainStyledAttributes.recycle();
        int[] iArrA = a(getResources(), resourceId);
        this.f93478k = iArrA;
        int[] iArrA2 = a(getResources(), resourceId2);
        this.f93479l = iArrA2;
        this.f93480m = a(iArrA);
        this.f93481n = a(iArrA2);
        float f10 = getResources().getDisplayMetrics().density;
        this.f93468a = f10;
        this.f93469b = 1.0f / f10;
        this.f93472e = dimension;
        this.f93473f = dimension2;
        this.f93475h = z10;
        this.f93474g = z11;
        this.f93476i = z12;
        this.f93477j = z13;
        e(true);
    }

    private static int a(int[] iArr) {
        if (iArr != null) {
            return Math.max(0, iArr.length - 1);
        }
        return 0;
    }

    private void e(boolean z10) {
        if (j()) {
            a(this.f93472e, this.f93473f, z10);
        } else {
            b(this.f93472e, this.f93473f, z10);
        }
    }

    private void f() {
        if (getChildCount() <= 0) {
            return;
        }
        View childAt = getChildAt(0);
        int left = childAt.getLeft();
        int top = childAt.getTop();
        int right = childAt.getRight();
        int bottom = childAt.getBottom();
        a(this.f93483p, left, top, right, bottom);
        NinePatchDrawable ninePatchDrawable = this.f93487t;
        NinePatchDrawable ninePatchDrawable2 = this.f93485r;
        if (ninePatchDrawable != ninePatchDrawable2) {
            a(ninePatchDrawable2, left, top, right, bottom);
        }
        a(this.f93487t, left, top, right, bottom);
        NinePatchDrawable ninePatchDrawable3 = this.f93487t;
        NinePatchDrawable ninePatchDrawable4 = this.f93489v;
        if (ninePatchDrawable3 != ninePatchDrawable4) {
            a(ninePatchDrawable4, left, top, right, bottom);
        }
    }

    private void g() {
        float fSqrt;
        float fSqrt2;
        if (getChildCount() < 1) {
            return;
        }
        View childAt = getChildAt(0);
        childAt.getWindowVisibleDisplayFrame(this.f93490w);
        int iWidth = this.f93490w.width() / 2;
        childAt.getLocationInWindow(this.f93491x);
        float f10 = this.f93472e + this.f93473f;
        float translationX = childAt.getTranslationX();
        float translationY = childAt.getTranslationY();
        if (this.f93474g) {
            int width = childAt.getWidth();
            int height = childAt.getHeight();
            int[] iArr = this.f93491x;
            int i10 = iArr[0] + (width / 2);
            int i11 = iArr[1] + (height / 2);
            fSqrt2 = ((float) Math.sqrt((i10 - iWidth) * this.f93469b * f93463A)) * f10;
            fSqrt = ((float) Math.sqrt(i11 * this.f93469b * 0.002f)) * f10;
        } else {
            fSqrt = this.f93468a * 0.2f * f10;
            fSqrt2 = 0.0f;
        }
        this.f93470c = (int) (fSqrt2 + translationX + 0.5f);
        this.f93471d = (int) (fSqrt + translationY + 0.5f);
    }

    private boolean h() {
        boolean z10 = false;
        boolean z11 = this.f93476i && !(this.f93487t == null && this.f93489v == null);
        boolean z12 = this.f93477j && !(this.f93483p == null && this.f93485r == null);
        if (!z11 && !z12 && getBackground() == null && getForeground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        return z10;
    }

    public float b() {
        return this.f93473f;
    }

    public float c() {
        return this.f93472e;
    }

    public void d(boolean z10) {
        if (this.f93477j == z10) {
            return;
        }
        this.f93477j = z10;
        if (h()) {
            return;
        }
        ViewCompat.d0(this);
    }

    public boolean i() {
        return this.f93476i;
    }

    public boolean j() {
        if (e()) {
            return this.f93475h;
        }
        return true;
    }

    public boolean k() {
        return this.f93477j;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getChildCount() <= 0 || getChildAt(0).getVisibility() != 0) {
            return;
        }
        if (this.f93476i) {
            NinePatchDrawable ninePatchDrawable = this.f93487t;
            if (ninePatchDrawable != null) {
                ninePatchDrawable.draw(canvas);
            }
            NinePatchDrawable ninePatchDrawable2 = this.f93489v;
            if (ninePatchDrawable2 != null) {
                ninePatchDrawable2.draw(canvas);
            }
        }
        if (this.f93477j) {
            if (this.f93483p == null && this.f93485r == null) {
                return;
            }
            int iSave = canvas.save();
            canvas.translate(this.f93470c, this.f93471d);
            NinePatchDrawable ninePatchDrawable3 = this.f93483p;
            if (ninePatchDrawable3 != null) {
                ninePatchDrawable3.draw(canvas);
            }
            NinePatchDrawable ninePatchDrawable4 = this.f93485r;
            if (ninePatchDrawable4 != null) {
                ninePatchDrawable4.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        f();
        g();
        if (j()) {
            return;
        }
        b(this.f93472e, this.f93473f, true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.f93473f = aVar.f93493b;
        this.f93472e = aVar.f93492a;
        this.f93474g = aVar.f93494c;
        this.f93475h = aVar.f93495d;
        this.f93476i = aVar.f93496e;
        this.f93477j = aVar.f93497f;
        e(true);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f93493b = this.f93473f;
        aVar.f93492a = this.f93472e;
        aVar.f93494c = this.f93474g;
        aVar.f93495d = this.f93475h;
        aVar.f93496e = this.f93476i;
        aVar.f93497f = this.f93477j;
        return aVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        f();
        g();
    }

    private NinePatchDrawable a(int i10) {
        Drawable drawableE = (i10 == 0 || i4.c().b() == null) ? null : Z1.b.e(i4.c().b(), i10);
        if (drawableE instanceof NinePatchDrawable) {
            return (NinePatchDrawable) drawableE;
        }
        return null;
    }

    public static boolean e() {
        return true;
    }

    public void b(float f10) {
        if (this.f93472e == f10) {
            return;
        }
        this.f93472e = f10;
        e(false);
    }

    public void c(boolean z10) {
        if (this.f93476i == z10) {
            return;
        }
        this.f93476i = z10;
        if (h()) {
            return;
        }
        ViewCompat.d0(this);
    }

    public boolean d() {
        return this.f93474g;
    }

    @SuppressLint({"RtlHardcoded"})
    private void a() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.gravity == -1) {
                layoutParams.gravity = 51;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    private void b(float f10, float f11, boolean z10) {
        if (z10) {
            this.f93483p = null;
            this.f93482o = 0;
            this.f93485r = null;
            this.f93484q = 0;
            this.f93487t = null;
            this.f93486s = 0;
            this.f93489v = null;
            this.f93488u = 0;
            h();
        }
        View childAt = getChildCount() > 0 ? getChildAt(0) : null;
        if (childAt != null) {
            ViewCompat.H0(childAt, f10);
            ViewCompat.u0(childAt, f11);
        }
    }

    public void a(float f10) {
        if (this.f93473f == f10) {
            return;
        }
        this.f93473f = f10;
        e(false);
    }

    public void b(boolean z10) {
        if (this.f93475h == z10) {
            return;
        }
        boolean zJ = j();
        this.f93475h = z10;
        boolean zJ2 = j();
        if (zJ != zJ2) {
            if (zJ2 && e()) {
                b(0.0f, 0.0f, true);
            }
            e(true);
        }
    }

    private void a(float f10, float f11, boolean z10) {
        float fMax = Math.max((f10 + f11) * this.f93469b, 0.0f);
        int i10 = (int) fMax;
        int iMin = Math.min(i10, this.f93480m);
        int i11 = i10 + 1;
        int iMin2 = Math.min(i11, this.f93480m);
        int iMin3 = Math.min(i10, this.f93481n);
        int iMin4 = Math.min(i11, this.f93481n);
        int[] iArr = this.f93478k;
        int i12 = iArr != null ? iArr[iMin] : 0;
        int i13 = iArr != null ? iArr[iMin2] : 0;
        int[] iArr2 = this.f93479l;
        int i14 = iArr2 != null ? iArr2[iMin3] : 0;
        int i15 = iArr2 != null ? iArr2[iMin4] : 0;
        if (z10 || i12 != this.f93482o || i13 != this.f93484q || i14 != this.f93486s || i15 != this.f93488u) {
            if (i12 != this.f93482o) {
                this.f93483p = a(i12);
                this.f93482o = i12;
            }
            if (i13 != this.f93484q) {
                this.f93485r = i13 == i12 ? null : a(i13);
                if (i13 == i12) {
                    i13 = 0;
                }
                this.f93484q = i13;
            }
            if (i14 != this.f93486s) {
                this.f93487t = a(i14);
                this.f93486s = i14;
            }
            if (i15 != this.f93488u) {
                this.f93489v = i15 != i14 ? a(i15) : null;
                if (i15 == i14) {
                    i15 = 0;
                }
                this.f93488u = i15;
            }
            f();
            g();
            h();
        }
        int iMin5 = 255 - Math.min(Math.max((int) (((fMax - i10) * 255.0f) + 0.5f), 0), 255);
        int i16 = 255 - iMin5;
        NinePatchDrawable ninePatchDrawable = this.f93483p;
        if (ninePatchDrawable != null) {
            if (this.f93485r != null) {
                ninePatchDrawable.setAlpha(iMin5);
            } else {
                ninePatchDrawable.setAlpha(255);
            }
        }
        NinePatchDrawable ninePatchDrawable2 = this.f93485r;
        if (ninePatchDrawable2 != null) {
            ninePatchDrawable2.setAlpha(i16);
        }
        NinePatchDrawable ninePatchDrawable3 = this.f93487t;
        if (ninePatchDrawable3 != null) {
            if (this.f93489v != null) {
                ninePatchDrawable3.setAlpha(iMin5);
            } else {
                ninePatchDrawable3.setAlpha(255);
            }
        }
        NinePatchDrawable ninePatchDrawable4 = this.f93489v;
        if (ninePatchDrawable4 != null) {
            ninePatchDrawable4.setAlpha(i16);
        }
        if (willNotDraw()) {
            return;
        }
        ViewCompat.d0(this);
    }

    private void a(int i10, int i11) {
        int iMin = Math.min(1, getChildCount());
        boolean z10 = (View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == 1073741824) ? false : true;
        View view = null;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < iMin; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i10, 0, i11, 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int iMax = Math.max(i12, childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
                int iMax2 = Math.max(i13, childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
                int measuredState = childAt.getMeasuredState() | i14;
                if (z10 && (layoutParams.width == -1 || layoutParams.height == -1)) {
                    view = childAt;
                }
                i14 = measuredState;
                i13 = iMax2;
                i12 = iMax;
            }
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iMax3 = Math.max(i13 + paddingTop, getSuggestedMinimumHeight());
        int iMax4 = Math.max(i12 + paddingLeft, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            iMax3 = Math.max(iMax3, foreground.getMinimumHeight());
            iMax4 = Math.max(iMax4, foreground.getMinimumWidth());
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax4, i10, i14), View.resolveSizeAndState(iMax3, i11, i14 << 16));
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i16 = marginLayoutParams.width;
            int iMakeMeasureSpec = i16 == -1 ? View.MeasureSpec.makeMeasureSpec(((getMeasuredWidth() - paddingLeft) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824) : ViewGroup.getChildMeasureSpec(i10, paddingLeft + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, i16);
            int i17 = marginLayoutParams.height;
            view.measure(iMakeMeasureSpec, i17 == -1 ? View.MeasureSpec.makeMeasureSpec(((getMeasuredHeight() - paddingTop) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin, 1073741824) : ViewGroup.getChildMeasureSpec(i11, paddingTop + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, i17));
        }
    }

    private void a(NinePatchDrawable ninePatchDrawable, int i10, int i11, int i12, int i13) {
        if (ninePatchDrawable == null) {
            return;
        }
        Rect rect = this.f93490w;
        ninePatchDrawable.getPadding(rect);
        ninePatchDrawable.setBounds(i10 - rect.left, i11 - rect.top, i12 + rect.right, i13 + rect.bottom);
    }

    public void a(boolean z10) {
        if (this.f93474g == z10) {
            return;
        }
        this.f93474g = z10;
        if (j()) {
            e(true);
        }
    }

    private int[] a(Resources resources, int i10) throws Resources.NotFoundException {
        if (i10 == 0 || isInEditMode()) {
            return null;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        int length = typedArrayObtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = typedArrayObtainTypedArray.getResourceId(i11, 0);
        }
        typedArrayObtainTypedArray.recycle();
        return iArr;
    }
}
