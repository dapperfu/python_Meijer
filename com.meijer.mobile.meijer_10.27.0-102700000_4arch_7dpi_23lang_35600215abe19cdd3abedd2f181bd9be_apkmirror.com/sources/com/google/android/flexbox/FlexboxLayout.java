package com.google.android.flexbox;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import com.google.android.flexbox.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class FlexboxLayout extends ViewGroup implements com.google.android.flexbox.a {

    /* renamed from: a, reason: collision with root package name */
    private int f64434a;

    /* renamed from: b, reason: collision with root package name */
    private int f64435b;

    /* renamed from: c, reason: collision with root package name */
    private int f64436c;

    /* renamed from: d, reason: collision with root package name */
    private int f64437d;

    /* renamed from: e, reason: collision with root package name */
    private int f64438e;

    /* renamed from: f, reason: collision with root package name */
    private int f64439f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f64440g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f64441h;

    /* renamed from: i, reason: collision with root package name */
    private int f64442i;

    /* renamed from: j, reason: collision with root package name */
    private int f64443j;

    /* renamed from: k, reason: collision with root package name */
    private int f64444k;

    /* renamed from: l, reason: collision with root package name */
    private int f64445l;

    /* renamed from: m, reason: collision with root package name */
    private int[] f64446m;

    /* renamed from: n, reason: collision with root package name */
    private SparseIntArray f64447n;

    /* renamed from: o, reason: collision with root package name */
    private d f64448o;

    /* renamed from: p, reason: collision with root package name */
    private List<c> f64449p;

    /* renamed from: q, reason: collision with root package name */
    private d.b f64450q;

    public static class a extends ViewGroup.MarginLayoutParams implements b {
        public static final Parcelable.Creator<a> CREATOR = new C1255a();

        /* renamed from: a, reason: collision with root package name */
        private int f64451a;

        /* renamed from: b, reason: collision with root package name */
        private float f64452b;

        /* renamed from: c, reason: collision with root package name */
        private float f64453c;

        /* renamed from: d, reason: collision with root package name */
        private int f64454d;

        /* renamed from: e, reason: collision with root package name */
        private float f64455e;

        /* renamed from: f, reason: collision with root package name */
        private int f64456f;

        /* renamed from: g, reason: collision with root package name */
        private int f64457g;

        /* renamed from: h, reason: collision with root package name */
        private int f64458h;

        /* renamed from: i, reason: collision with root package name */
        private int f64459i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f64460j;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$a$a, reason: collision with other inner class name */
        class C1255a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }

            C1255a() {
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f64451a = 1;
            this.f64452b = 0.0f;
            this.f64453c = 1.0f;
            this.f64454d = -1;
            this.f64455e = -1.0f;
            this.f64456f = -1;
            this.f64457g = -1;
            this.f64458h = 16777215;
            this.f64459i = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Dc.a.f5131o);
            this.f64451a = typedArrayObtainStyledAttributes.getInt(Dc.a.f5140x, 1);
            this.f64452b = typedArrayObtainStyledAttributes.getFloat(Dc.a.f5134r, 0.0f);
            this.f64453c = typedArrayObtainStyledAttributes.getFloat(Dc.a.f5135s, 1.0f);
            this.f64454d = typedArrayObtainStyledAttributes.getInt(Dc.a.f5132p, -1);
            this.f64455e = typedArrayObtainStyledAttributes.getFraction(Dc.a.f5133q, 1, 1, -1.0f);
            this.f64456f = typedArrayObtainStyledAttributes.getDimensionPixelSize(Dc.a.f5139w, -1);
            this.f64457g = typedArrayObtainStyledAttributes.getDimensionPixelSize(Dc.a.f5138v, -1);
            this.f64458h = typedArrayObtainStyledAttributes.getDimensionPixelSize(Dc.a.f5137u, 16777215);
            this.f64459i = typedArrayObtainStyledAttributes.getDimensionPixelSize(Dc.a.f5136t, 16777215);
            this.f64460j = typedArrayObtainStyledAttributes.getBoolean(Dc.a.f5141y, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.b
        public int B2() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.b
        public int H3() {
            return this.f64459i;
        }

        @Override // com.google.android.flexbox.b
        public int I1() {
            return this.f64458h;
        }

        @Override // com.google.android.flexbox.b
        public int L0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.b
        public void R0(int i10) {
            this.f64457g = i10;
        }

        @Override // com.google.android.flexbox.b
        public float V0() {
            return this.f64452b;
        }

        public void a(float f10) {
            this.f64452b = f10;
        }

        @Override // com.google.android.flexbox.b
        public float e1() {
            return this.f64455e;
        }

        @Override // com.google.android.flexbox.b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.b
        public int getOrder() {
            return this.f64451a;
        }

        @Override // com.google.android.flexbox.b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.b
        public int i0() {
            return this.f64454d;
        }

        @Override // com.google.android.flexbox.b
        public float l0() {
            return this.f64453c;
        }

        @Override // com.google.android.flexbox.b
        public int r0() {
            return this.f64456f;
        }

        @Override // com.google.android.flexbox.b
        public boolean r1() {
            return this.f64460j;
        }

        @Override // com.google.android.flexbox.b
        public int t3() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.b
        public int v3() {
            return this.f64457g;
        }

        @Override // com.google.android.flexbox.b
        public void w2(int i10) {
            this.f64456f = i10;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f64451a);
            parcel.writeFloat(this.f64452b);
            parcel.writeFloat(this.f64453c);
            parcel.writeInt(this.f64454d);
            parcel.writeFloat(this.f64455e);
            parcel.writeInt(this.f64456f);
            parcel.writeInt(this.f64457g);
            parcel.writeInt(this.f64458h);
            parcel.writeInt(this.f64459i);
            parcel.writeByte(this.f64460j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.b
        public int x2() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f64451a = 1;
            this.f64452b = 0.0f;
            this.f64453c = 1.0f;
            this.f64454d = -1;
            this.f64455e = -1.0f;
            this.f64456f = -1;
            this.f64457g = -1;
            this.f64458h = 16777215;
            this.f64459i = 16777215;
            this.f64451a = aVar.f64451a;
            this.f64452b = aVar.f64452b;
            this.f64453c = aVar.f64453c;
            this.f64454d = aVar.f64454d;
            this.f64455e = aVar.f64455e;
            this.f64456f = aVar.f64456f;
            this.f64457g = aVar.f64457g;
            this.f64458h = aVar.f64458h;
            this.f64459i = aVar.f64459i;
            this.f64460j = aVar.f64460j;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f64451a = 1;
            this.f64452b = 0.0f;
            this.f64453c = 1.0f;
            this.f64454d = -1;
            this.f64455e = -1.0f;
            this.f64456f = -1;
            this.f64457g = -1;
            this.f64458h = 16777215;
            this.f64459i = 16777215;
        }

        public a(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.f64451a = 1;
            this.f64452b = 0.0f;
            this.f64453c = 1.0f;
            this.f64454d = -1;
            this.f64455e = -1.0f;
            this.f64456f = -1;
            this.f64457g = -1;
            this.f64458h = 16777215;
            this.f64459i = 16777215;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f64451a = 1;
            this.f64452b = 0.0f;
            this.f64453c = 1.0f;
            this.f64454d = -1;
            this.f64455e = -1.0f;
            this.f64456f = -1;
            this.f64457g = -1;
            this.f64458h = 16777215;
            this.f64459i = 16777215;
        }

        protected a(Parcel parcel) {
            super(0, 0);
            this.f64451a = 1;
            this.f64452b = 0.0f;
            this.f64453c = 1.0f;
            this.f64454d = -1;
            this.f64455e = -1.0f;
            this.f64456f = -1;
            this.f64457g = -1;
            this.f64458h = 16777215;
            this.f64459i = 16777215;
            this.f64451a = parcel.readInt();
            this.f64452b = parcel.readFloat();
            this.f64453c = parcel.readFloat();
            this.f64454d = parcel.readInt();
            this.f64455e = parcel.readFloat();
            this.f64456f = parcel.readInt();
            this.f64457g = parcel.readInt();
            this.f64458h = parcel.readInt();
            this.f64459i = parcel.readInt();
            this.f64460j = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    private boolean a(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f64449p.get(i11).c() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean b(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View viewR = r(i10 - i12);
            if (viewR != null && viewR.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private boolean t(int i10) {
        if (i10 >= 0 && i10 < this.f64449p.size()) {
            if (a(i10)) {
                return q() ? (this.f64442i & 1) != 0 : (this.f64443j & 1) != 0;
            }
            if (q()) {
                return (this.f64442i & 2) != 0;
            }
            if ((this.f64443j & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean u(int i10) {
        if (i10 >= 0 && i10 < this.f64449p.size()) {
            for (int i11 = i10 + 1; i11 < this.f64449p.size(); i11++) {
                if (this.f64449p.get(i11).c() > 0) {
                    return false;
                }
            }
            if (q()) {
                return (this.f64442i & 4) != 0;
            }
            if ((this.f64443j & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.v(boolean, int, int, int, int):void");
    }

    @Override // com.google.android.flexbox.a
    public int l(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.a
    public void o(int i10, View view) {
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A() {
        if (this.f64440g == null && this.f64441h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private void e(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f64440g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.f64444k + i11);
        this.f64440g.draw(canvas);
    }

    private void h(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f64441h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.f64445l + i10, i12 + i11);
        this.f64441h.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w(boolean r25, boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.w(boolean, boolean, int, int, int, int):void");
    }

    private void x(int i10, int i11) {
        this.f64449p.clear();
        this.f64450q.a();
        this.f64448o.c(this.f64450q, i10, i11);
        this.f64449p = this.f64450q.f64540a;
        this.f64448o.p(i10, i11);
        if (this.f64437d == 3) {
            for (c cVar : this.f64449p) {
                int iMax = Integer.MIN_VALUE;
                for (int i12 = 0; i12 < cVar.f64524h; i12++) {
                    View viewR = r(cVar.f64531o + i12);
                    if (viewR != null && viewR.getVisibility() != 8) {
                        a aVar = (a) viewR.getLayoutParams();
                        iMax = this.f64435b != 2 ? Math.max(iMax, viewR.getMeasuredHeight() + Math.max(cVar.f64528l - viewR.getBaseline(), ((ViewGroup.MarginLayoutParams) aVar).topMargin) + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin) : Math.max(iMax, viewR.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + Math.max((cVar.f64528l - viewR.getMeasuredHeight()) + viewR.getBaseline(), ((ViewGroup.MarginLayoutParams) aVar).bottomMargin));
                    }
                }
                cVar.f64523g = iMax;
            }
        }
        this.f64448o.o(i10, i11, getPaddingTop() + getPaddingBottom());
        this.f64448o.X();
        z(this.f64434a, i10, i11, this.f64450q.f64541b);
    }

    private void y(int i10, int i11) {
        this.f64449p.clear();
        this.f64450q.a();
        this.f64448o.f(this.f64450q, i10, i11);
        this.f64449p = this.f64450q.f64540a;
        this.f64448o.p(i10, i11);
        this.f64448o.o(i10, i11, getPaddingLeft() + getPaddingRight());
        this.f64448o.X();
        z(this.f64434a, i10, i11, this.f64450q.f64541b);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f64447n == null) {
            this.f64447n = new SparseIntArray(getChildCount());
        }
        this.f64446m = this.f64448o.n(view, i10, layoutParams, this.f64447n);
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return this.f64438e;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.f64437d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f64440g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f64441h;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.f64434a;
    }

    public List<c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f64449p.size());
        for (c cVar : this.f64449p) {
            if (cVar.c() != 0) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.a
    public List<c> getFlexLinesInternal() {
        return this.f64449p;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.f64435b;
    }

    public int getJustifyContent() {
        return this.f64436c;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        Iterator<c> it = this.f64449p.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f64521e);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f64439f;
    }

    public int getShowDividerHorizontal() {
        return this.f64442i;
    }

    public int getShowDividerVertical() {
        return this.f64443j;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.f64449p.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = this.f64449p.get(i11);
            if (t(i11)) {
                i10 += q() ? this.f64444k : this.f64445l;
            }
            if (u(i11)) {
                i10 += q() ? this.f64444k : this.f64445l;
            }
            i10 += cVar.f64523g;
        }
        return i10;
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f64441h == null && this.f64440g == null) {
            return;
        }
        if (this.f64442i == 0 && this.f64443j == 0) {
            return;
        }
        int iZ = ViewCompat.z(this);
        int i10 = this.f64434a;
        if (i10 == 0) {
            c(canvas, iZ == 1, this.f64435b == 2);
            return;
        }
        if (i10 == 1) {
            c(canvas, iZ != 1, this.f64435b == 2);
            return;
        }
        if (i10 == 2) {
            boolean z10 = iZ == 1;
            if (this.f64435b == 2) {
                z10 = !z10;
            }
            d(canvas, z10, false);
            return;
        }
        if (i10 != 3) {
            return;
        }
        boolean z11 = iZ == 1;
        if (this.f64435b == 2) {
            z11 = !z11;
        }
        d(canvas, z11, true);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f64447n == null) {
            this.f64447n = new SparseIntArray(getChildCount());
        }
        if (this.f64448o.O(this.f64447n)) {
            this.f64446m = this.f64448o.m(this.f64447n);
        }
        int i12 = this.f64434a;
        if (i12 == 0 || i12 == 1) {
            x(i10, i11);
            return;
        }
        if (i12 == 2 || i12 == 3) {
            y(i10, i11);
            return;
        }
        throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f64434a);
    }

    @Override // com.google.android.flexbox.a
    public boolean q() {
        int i10 = this.f64434a;
        return i10 == 0 || i10 == 1;
    }

    public View r(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.f64446m;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    public void setAlignContent(int i10) {
        if (this.f64438e != i10) {
            this.f64438e = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.f64437d != i10) {
            this.f64437d = i10;
            requestLayout();
        }
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f64440g) {
            return;
        }
        this.f64440g = drawable;
        if (drawable != null) {
            this.f64444k = drawable.getIntrinsicHeight();
        } else {
            this.f64444k = 0;
        }
        A();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f64441h) {
            return;
        }
        this.f64441h = drawable;
        if (drawable != null) {
            this.f64445l = drawable.getIntrinsicWidth();
        } else {
            this.f64445l = 0;
        }
        A();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.f64434a != i10) {
            this.f64434a = i10;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<c> list) {
        this.f64449p = list;
    }

    public void setFlexWrap(int i10) {
        if (this.f64435b != i10) {
            this.f64435b = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.f64436c != i10) {
            this.f64436c = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.f64439f != i10) {
            this.f64439f = i10;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.f64442i) {
            this.f64442i = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.f64443j) {
            this.f64443j = i10;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f64439f = -1;
        this.f64448o = new d(this);
        this.f64449p = new ArrayList();
        this.f64450q = new d.b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Dc.a.f5118b, i10, 0);
        this.f64434a = typedArrayObtainStyledAttributes.getInt(Dc.a.f5124h, 0);
        this.f64435b = typedArrayObtainStyledAttributes.getInt(Dc.a.f5125i, 0);
        this.f64436c = typedArrayObtainStyledAttributes.getInt(Dc.a.f5126j, 0);
        this.f64437d = typedArrayObtainStyledAttributes.getInt(Dc.a.f5120d, 0);
        this.f64438e = typedArrayObtainStyledAttributes.getInt(Dc.a.f5119c, 0);
        this.f64439f = typedArrayObtainStyledAttributes.getInt(Dc.a.f5127k, -1);
        Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, Dc.a.f5121e);
        if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 != null) {
            setDividerDrawableHorizontal(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160);
            setDividerDrawableVertical(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160);
        }
        Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1602 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, Dc.a.f5122f);
        if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1602 != null) {
            setDividerDrawableHorizontal(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1602);
        }
        Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1603 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, Dc.a.f5123g);
        if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1603 != null) {
            setDividerDrawableVertical(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1603);
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(Dc.a.f5128l, 0);
        if (i11 != 0) {
            this.f64443j = i11;
            this.f64442i = i11;
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(Dc.a.f5130n, 0);
        if (i12 != 0) {
            this.f64443j = i12;
        }
        int i13 = typedArrayObtainStyledAttributes.getInt(Dc.a.f5129m, 0);
        if (i13 != 0) {
            this.f64442i = i13;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f64449p.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = this.f64449p.get(i12);
            for (int i13 = 0; i13 < cVar.f64524h; i13++) {
                int i14 = cVar.f64531o + i13;
                View viewR = r(i14);
                if (viewR != null && viewR.getVisibility() != 8) {
                    a aVar = (a) viewR.getLayoutParams();
                    if (s(i14, i13)) {
                        if (z10) {
                            left = viewR.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        } else {
                            left = (viewR.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f64445l;
                        }
                        h(canvas, left, cVar.f64518b, cVar.f64523g);
                    }
                    if (i13 == cVar.f64524h - 1 && (this.f64443j & 4) > 0) {
                        if (z10) {
                            right = (viewR.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f64445l;
                        } else {
                            right = viewR.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        }
                        h(canvas, right, cVar.f64518b, cVar.f64523g);
                    }
                }
            }
            if (t(i12)) {
                if (z11) {
                    i11 = cVar.f64520d;
                } else {
                    i11 = cVar.f64518b - this.f64444k;
                }
                e(canvas, paddingLeft, i11, iMax);
            }
            if (u(i12) && (this.f64442i & 4) > 0) {
                if (z11) {
                    i10 = cVar.f64518b - this.f64444k;
                } else {
                    i10 = cVar.f64520d;
                }
                e(canvas, paddingLeft, i10, iMax);
            }
        }
    }

    private void d(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f64449p.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = this.f64449p.get(i12);
            for (int i13 = 0; i13 < cVar.f64524h; i13++) {
                int i14 = cVar.f64531o + i13;
                View viewR = r(i14);
                if (viewR != null && viewR.getVisibility() != 8) {
                    a aVar = (a) viewR.getLayoutParams();
                    if (s(i14, i13)) {
                        if (z11) {
                            top = viewR.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        } else {
                            top = (viewR.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.f64444k;
                        }
                        e(canvas, cVar.f64517a, top, cVar.f64523g);
                    }
                    if (i13 == cVar.f64524h - 1 && (this.f64442i & 4) > 0) {
                        if (z11) {
                            bottom = (viewR.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.f64444k;
                        } else {
                            bottom = viewR.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        }
                        e(canvas, cVar.f64517a, bottom, cVar.f64523g);
                    }
                }
            }
            if (t(i12)) {
                if (z10) {
                    i11 = cVar.f64519c;
                } else {
                    i11 = cVar.f64517a - this.f64445l;
                }
                h(canvas, i11, paddingTop, iMax);
            }
            if (u(i12) && (this.f64443j & 4) > 0) {
                if (z10) {
                    i10 = cVar.f64517a - this.f64445l;
                } else {
                    i10 = cVar.f64519c;
                }
                h(canvas, i10, paddingTop, iMax);
            }
        }
    }

    private boolean s(int i10, int i11) {
        if (b(i10, i11)) {
            if (q()) {
                if ((this.f64443j & 1) == 0) {
                    return false;
                }
                return true;
            }
            if ((this.f64442i & 1) == 0) {
                return false;
            }
            return true;
        }
        if (q()) {
            if ((this.f64443j & 2) == 0) {
                return false;
            }
            return true;
        }
        if ((this.f64442i & 2) == 0) {
            return false;
        }
        return true;
    }

    private void z(int i10, int i11, int i12, int i13) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i10);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        } else {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    if (size < largestMainSize) {
                        i13 = View.combineMeasuredStates(i13, 16777216);
                    }
                    iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
                } else {
                    throw new IllegalStateException("Unknown width mode is set: " + mode);
                }
            } else {
                iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
            }
        } else {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    if (size2 < sumOfCrossSize) {
                        i13 = View.combineMeasuredStates(i13, 256);
                    }
                    iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
                } else {
                    throw new IllegalStateException("Unknown height mode is set: " + mode2);
                }
            } else {
                iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i12, i13);
            }
        } else {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // com.google.android.flexbox.a
    public void f(View view, int i10, int i11, c cVar) {
        if (s(i10, i11)) {
            if (q()) {
                int i12 = cVar.f64521e;
                int i13 = this.f64445l;
                cVar.f64521e = i12 + i13;
                cVar.f64522f += i13;
                return;
            }
            int i14 = cVar.f64521e;
            int i15 = this.f64444k;
            cVar.f64521e = i14 + i15;
            cVar.f64522f += i15;
        }
    }

    @Override // com.google.android.flexbox.a
    public int g(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.google.android.flexbox.a
    public View i(int i10) {
        return getChildAt(i10);
    }

    @Override // com.google.android.flexbox.a
    public int k(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.google.android.flexbox.a
    public void m(c cVar) {
        if (q()) {
            if ((this.f64443j & 4) > 0) {
                int i10 = cVar.f64521e;
                int i11 = this.f64445l;
                cVar.f64521e = i10 + i11;
                cVar.f64522f += i11;
                return;
            }
            return;
        }
        if ((this.f64442i & 4) > 0) {
            int i12 = cVar.f64521e;
            int i13 = this.f64444k;
            cVar.f64521e = i12 + i13;
            cVar.f64522f += i13;
        }
    }

    @Override // com.google.android.flexbox.a
    public View n(int i10) {
        return r(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        FlexboxLayout flexboxLayout;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z12;
        FlexboxLayout flexboxLayout2;
        int i18;
        int i19;
        int i20;
        int i21;
        int iZ = ViewCompat.z(this);
        int i22 = this.f64434a;
        boolean z13 = false;
        if (i22 != 0) {
            if (i22 != 1) {
                if (i22 != 2) {
                    if (i22 == 3) {
                        if (iZ == 1) {
                            z13 = true;
                        }
                        if (this.f64435b == 2) {
                            z13 = !z13;
                        }
                        w(z13, true, i10, i11, i12, i13);
                        return;
                    }
                    throw new IllegalStateException("Invalid flex direction is set: " + this.f64434a);
                }
                if (iZ == 1) {
                    z13 = true;
                }
                if (this.f64435b == 2) {
                    z13 = !z13;
                }
                w(z13, false, i10, i11, i12, i13);
                return;
            }
            if (iZ != 1) {
                z12 = true;
                flexboxLayout2 = this;
                i18 = i10;
                i21 = i11;
                i20 = i13;
                i19 = i12;
            } else {
                z12 = false;
                flexboxLayout2 = this;
                i18 = i10;
                i19 = i12;
                i20 = i13;
                i21 = i11;
            }
            flexboxLayout2.v(z12, i18, i21, i19, i20);
            return;
        }
        if (iZ == 1) {
            z11 = true;
            flexboxLayout = this;
            i14 = i10;
            i17 = i11;
            i16 = i13;
            i15 = i12;
        } else {
            z11 = false;
            flexboxLayout = this;
            i14 = i10;
            i15 = i12;
            i16 = i13;
            i17 = i11;
        }
        flexboxLayout.v(z11, i14, i17, i15, i16);
    }

    @Override // com.google.android.flexbox.a
    public int p(View view, int i10, int i11) {
        int i12;
        int i13 = 0;
        if (q()) {
            if (s(i10, i11)) {
                i13 = this.f64445l;
            }
            if ((this.f64443j & 4) > 0) {
                i12 = this.f64445l;
            } else {
                return i13;
            }
        } else {
            if (s(i10, i11)) {
                i13 = this.f64444k;
            }
            if ((this.f64442i & 4) > 0) {
                i12 = this.f64444k;
            } else {
                return i13;
            }
        }
        return i13 + i12;
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }
}
