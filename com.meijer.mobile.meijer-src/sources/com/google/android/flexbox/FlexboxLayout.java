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
    private int f65274a;

    /* renamed from: b, reason: collision with root package name */
    private int f65275b;

    /* renamed from: c, reason: collision with root package name */
    private int f65276c;

    /* renamed from: d, reason: collision with root package name */
    private int f65277d;

    /* renamed from: e, reason: collision with root package name */
    private int f65278e;

    /* renamed from: f, reason: collision with root package name */
    private int f65279f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f65280g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f65281h;

    /* renamed from: i, reason: collision with root package name */
    private int f65282i;

    /* renamed from: j, reason: collision with root package name */
    private int f65283j;

    /* renamed from: k, reason: collision with root package name */
    private int f65284k;

    /* renamed from: l, reason: collision with root package name */
    private int f65285l;

    /* renamed from: m, reason: collision with root package name */
    private int[] f65286m;

    /* renamed from: n, reason: collision with root package name */
    private SparseIntArray f65287n;

    /* renamed from: o, reason: collision with root package name */
    private d f65288o;

    /* renamed from: p, reason: collision with root package name */
    private List<c> f65289p;

    /* renamed from: q, reason: collision with root package name */
    private d.b f65290q;

    public static class a extends ViewGroup.MarginLayoutParams implements b {
        public static final Parcelable.Creator<a> CREATOR = new C1264a();

        /* renamed from: a, reason: collision with root package name */
        private int f65291a;

        /* renamed from: b, reason: collision with root package name */
        private float f65292b;

        /* renamed from: c, reason: collision with root package name */
        private float f65293c;

        /* renamed from: d, reason: collision with root package name */
        private int f65294d;

        /* renamed from: e, reason: collision with root package name */
        private float f65295e;

        /* renamed from: f, reason: collision with root package name */
        private int f65296f;

        /* renamed from: g, reason: collision with root package name */
        private int f65297g;

        /* renamed from: h, reason: collision with root package name */
        private int f65298h;

        /* renamed from: i, reason: collision with root package name */
        private int f65299i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f65300j;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$a$a, reason: collision with other inner class name */
        class C1264a implements Parcelable.Creator<a> {
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

            C1264a() {
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f65291a = 1;
            this.f65292b = 0.0f;
            this.f65293c = 1.0f;
            this.f65294d = -1;
            this.f65295e = -1.0f;
            this.f65296f = -1;
            this.f65297g = -1;
            this.f65298h = 16777215;
            this.f65299i = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Fc.a.f9164o);
            this.f65291a = typedArrayObtainStyledAttributes.getInt(Fc.a.f9173x, 1);
            this.f65292b = typedArrayObtainStyledAttributes.getFloat(Fc.a.f9167r, 0.0f);
            this.f65293c = typedArrayObtainStyledAttributes.getFloat(Fc.a.f9168s, 1.0f);
            this.f65294d = typedArrayObtainStyledAttributes.getInt(Fc.a.f9165p, -1);
            this.f65295e = typedArrayObtainStyledAttributes.getFraction(Fc.a.f9166q, 1, 1, -1.0f);
            this.f65296f = typedArrayObtainStyledAttributes.getDimensionPixelSize(Fc.a.f9172w, -1);
            this.f65297g = typedArrayObtainStyledAttributes.getDimensionPixelSize(Fc.a.f9171v, -1);
            this.f65298h = typedArrayObtainStyledAttributes.getDimensionPixelSize(Fc.a.f9170u, 16777215);
            this.f65299i = typedArrayObtainStyledAttributes.getDimensionPixelSize(Fc.a.f9169t, 16777215);
            this.f65300j = typedArrayObtainStyledAttributes.getBoolean(Fc.a.f9174y, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.b
        public int A2() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.b
        public int G3() {
            return this.f65299i;
        }

        @Override // com.google.android.flexbox.b
        public int J0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.b
        public int K1() {
            return this.f65298h;
        }

        @Override // com.google.android.flexbox.b
        public void P0(int i10) {
            this.f65297g = i10;
        }

        @Override // com.google.android.flexbox.b
        public float T0() {
            return this.f65292b;
        }

        public void a(float f10) {
            this.f65292b = f10;
        }

        @Override // com.google.android.flexbox.b
        public float e1() {
            return this.f65295e;
        }

        @Override // com.google.android.flexbox.b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.b
        public int getOrder() {
            return this.f65291a;
        }

        @Override // com.google.android.flexbox.b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.b
        public int j0() {
            return this.f65294d;
        }

        @Override // com.google.android.flexbox.b
        public float m0() {
            return this.f65293c;
        }

        @Override // com.google.android.flexbox.b
        public boolean r1() {
            return this.f65300j;
        }

        @Override // com.google.android.flexbox.b
        public int s0() {
            return this.f65296f;
        }

        @Override // com.google.android.flexbox.b
        public int t3() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.b
        public void v2(int i10) {
            this.f65296f = i10;
        }

        @Override // com.google.android.flexbox.b
        public int v3() {
            return this.f65297g;
        }

        @Override // com.google.android.flexbox.b
        public int w2() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f65291a);
            parcel.writeFloat(this.f65292b);
            parcel.writeFloat(this.f65293c);
            parcel.writeInt(this.f65294d);
            parcel.writeFloat(this.f65295e);
            parcel.writeInt(this.f65296f);
            parcel.writeInt(this.f65297g);
            parcel.writeInt(this.f65298h);
            parcel.writeInt(this.f65299i);
            parcel.writeByte(this.f65300j ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f65291a = 1;
            this.f65292b = 0.0f;
            this.f65293c = 1.0f;
            this.f65294d = -1;
            this.f65295e = -1.0f;
            this.f65296f = -1;
            this.f65297g = -1;
            this.f65298h = 16777215;
            this.f65299i = 16777215;
            this.f65291a = aVar.f65291a;
            this.f65292b = aVar.f65292b;
            this.f65293c = aVar.f65293c;
            this.f65294d = aVar.f65294d;
            this.f65295e = aVar.f65295e;
            this.f65296f = aVar.f65296f;
            this.f65297g = aVar.f65297g;
            this.f65298h = aVar.f65298h;
            this.f65299i = aVar.f65299i;
            this.f65300j = aVar.f65300j;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f65291a = 1;
            this.f65292b = 0.0f;
            this.f65293c = 1.0f;
            this.f65294d = -1;
            this.f65295e = -1.0f;
            this.f65296f = -1;
            this.f65297g = -1;
            this.f65298h = 16777215;
            this.f65299i = 16777215;
        }

        public a(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.f65291a = 1;
            this.f65292b = 0.0f;
            this.f65293c = 1.0f;
            this.f65294d = -1;
            this.f65295e = -1.0f;
            this.f65296f = -1;
            this.f65297g = -1;
            this.f65298h = 16777215;
            this.f65299i = 16777215;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f65291a = 1;
            this.f65292b = 0.0f;
            this.f65293c = 1.0f;
            this.f65294d = -1;
            this.f65295e = -1.0f;
            this.f65296f = -1;
            this.f65297g = -1;
            this.f65298h = 16777215;
            this.f65299i = 16777215;
        }

        protected a(Parcel parcel) {
            super(0, 0);
            this.f65291a = 1;
            this.f65292b = 0.0f;
            this.f65293c = 1.0f;
            this.f65294d = -1;
            this.f65295e = -1.0f;
            this.f65296f = -1;
            this.f65297g = -1;
            this.f65298h = 16777215;
            this.f65299i = 16777215;
            this.f65291a = parcel.readInt();
            this.f65292b = parcel.readFloat();
            this.f65293c = parcel.readFloat();
            this.f65294d = parcel.readInt();
            this.f65295e = parcel.readFloat();
            this.f65296f = parcel.readInt();
            this.f65297g = parcel.readInt();
            this.f65298h = parcel.readInt();
            this.f65299i = parcel.readInt();
            this.f65300j = parcel.readByte() != 0;
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
            if (this.f65289p.get(i11).c() > 0) {
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
        if (i10 >= 0 && i10 < this.f65289p.size()) {
            if (a(i10)) {
                return q() ? (this.f65282i & 1) != 0 : (this.f65283j & 1) != 0;
            }
            if (q()) {
                return (this.f65282i & 2) != 0;
            }
            if ((this.f65283j & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean u(int i10) {
        if (i10 >= 0 && i10 < this.f65289p.size()) {
            for (int i11 = i10 + 1; i11 < this.f65289p.size(); i11++) {
                if (this.f65289p.get(i11).c() > 0) {
                    return false;
                }
            }
            if (q()) {
                return (this.f65282i & 4) != 0;
            }
            if ((this.f65283j & 4) != 0) {
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
        if (this.f65280g == null && this.f65281h == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private void e(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f65280g;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.f65284k + i11);
        this.f65280g.draw(canvas);
    }

    private void h(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f65281h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.f65285l + i10, i12 + i11);
        this.f65281h.draw(canvas);
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
        this.f65289p.clear();
        this.f65290q.a();
        this.f65288o.c(this.f65290q, i10, i11);
        this.f65289p = this.f65290q.f65380a;
        this.f65288o.p(i10, i11);
        if (this.f65277d == 3) {
            for (c cVar : this.f65289p) {
                int iMax = Integer.MIN_VALUE;
                for (int i12 = 0; i12 < cVar.f65364h; i12++) {
                    View viewR = r(cVar.f65371o + i12);
                    if (viewR != null && viewR.getVisibility() != 8) {
                        a aVar = (a) viewR.getLayoutParams();
                        iMax = this.f65275b != 2 ? Math.max(iMax, viewR.getMeasuredHeight() + Math.max(cVar.f65368l - viewR.getBaseline(), ((ViewGroup.MarginLayoutParams) aVar).topMargin) + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin) : Math.max(iMax, viewR.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar).topMargin + Math.max((cVar.f65368l - viewR.getMeasuredHeight()) + viewR.getBaseline(), ((ViewGroup.MarginLayoutParams) aVar).bottomMargin));
                    }
                }
                cVar.f65363g = iMax;
            }
        }
        this.f65288o.o(i10, i11, getPaddingTop() + getPaddingBottom());
        this.f65288o.X();
        z(this.f65274a, i10, i11, this.f65290q.f65381b);
    }

    private void y(int i10, int i11) {
        this.f65289p.clear();
        this.f65290q.a();
        this.f65288o.f(this.f65290q, i10, i11);
        this.f65289p = this.f65290q.f65380a;
        this.f65288o.p(i10, i11);
        this.f65288o.o(i10, i11, getPaddingLeft() + getPaddingRight());
        this.f65288o.X();
        z(this.f65274a, i10, i11, this.f65290q.f65381b);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f65287n == null) {
            this.f65287n = new SparseIntArray(getChildCount());
        }
        this.f65286m = this.f65288o.n(view, i10, layoutParams, this.f65287n);
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
        return this.f65278e;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.f65277d;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f65280g;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f65281h;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.f65274a;
    }

    public List<c> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f65289p.size());
        for (c cVar : this.f65289p) {
            if (cVar.c() != 0) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.a
    public List<c> getFlexLinesInternal() {
        return this.f65289p;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.f65275b;
    }

    public int getJustifyContent() {
        return this.f65276c;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        Iterator<c> it = this.f65289p.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f65361e);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.f65279f;
    }

    public int getShowDividerHorizontal() {
        return this.f65282i;
    }

    public int getShowDividerVertical() {
        return this.f65283j;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.f65289p.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = this.f65289p.get(i11);
            if (t(i11)) {
                i10 += q() ? this.f65284k : this.f65285l;
            }
            if (u(i11)) {
                i10 += q() ? this.f65284k : this.f65285l;
            }
            i10 += cVar.f65363g;
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
        if (this.f65281h == null && this.f65280g == null) {
            return;
        }
        if (this.f65282i == 0 && this.f65283j == 0) {
            return;
        }
        int iZ = ViewCompat.z(this);
        int i10 = this.f65274a;
        if (i10 == 0) {
            c(canvas, iZ == 1, this.f65275b == 2);
            return;
        }
        if (i10 == 1) {
            c(canvas, iZ != 1, this.f65275b == 2);
            return;
        }
        if (i10 == 2) {
            boolean z10 = iZ == 1;
            if (this.f65275b == 2) {
                z10 = !z10;
            }
            d(canvas, z10, false);
            return;
        }
        if (i10 != 3) {
            return;
        }
        boolean z11 = iZ == 1;
        if (this.f65275b == 2) {
            z11 = !z11;
        }
        d(canvas, z11, true);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f65287n == null) {
            this.f65287n = new SparseIntArray(getChildCount());
        }
        if (this.f65288o.O(this.f65287n)) {
            this.f65286m = this.f65288o.m(this.f65287n);
        }
        int i12 = this.f65274a;
        if (i12 == 0 || i12 == 1) {
            x(i10, i11);
            return;
        }
        if (i12 == 2 || i12 == 3) {
            y(i10, i11);
            return;
        }
        throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f65274a);
    }

    @Override // com.google.android.flexbox.a
    public boolean q() {
        int i10 = this.f65274a;
        return i10 == 0 || i10 == 1;
    }

    public View r(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.f65286m;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    public void setAlignContent(int i10) {
        if (this.f65278e != i10) {
            this.f65278e = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.f65277d != i10) {
            this.f65277d = i10;
            requestLayout();
        }
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f65280g) {
            return;
        }
        this.f65280g = drawable;
        if (drawable != null) {
            this.f65284k = drawable.getIntrinsicHeight();
        } else {
            this.f65284k = 0;
        }
        A();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.f65281h) {
            return;
        }
        this.f65281h = drawable;
        if (drawable != null) {
            this.f65285l = drawable.getIntrinsicWidth();
        } else {
            this.f65285l = 0;
        }
        A();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.f65274a != i10) {
            this.f65274a = i10;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<c> list) {
        this.f65289p = list;
    }

    public void setFlexWrap(int i10) {
        if (this.f65275b != i10) {
            this.f65275b = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.f65276c != i10) {
            this.f65276c = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.f65279f != i10) {
            this.f65279f = i10;
            requestLayout();
        }
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.f65282i) {
            this.f65282i = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.f65283j) {
            this.f65283j = i10;
            requestLayout();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f65279f = -1;
        this.f65288o = new d(this);
        this.f65289p = new ArrayList();
        this.f65290q = new d.b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Fc.a.f9151b, i10, 0);
        this.f65274a = typedArrayObtainStyledAttributes.getInt(Fc.a.f9157h, 0);
        this.f65275b = typedArrayObtainStyledAttributes.getInt(Fc.a.f9158i, 0);
        this.f65276c = typedArrayObtainStyledAttributes.getInt(Fc.a.f9159j, 0);
        this.f65277d = typedArrayObtainStyledAttributes.getInt(Fc.a.f9153d, 0);
        this.f65278e = typedArrayObtainStyledAttributes.getInt(Fc.a.f9152c, 0);
        this.f65279f = typedArrayObtainStyledAttributes.getInt(Fc.a.f9160k, -1);
        Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, Fc.a.f9154e);
        if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 != null) {
            setDividerDrawableHorizontal(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160);
            setDividerDrawableVertical(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160);
        }
        Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1602 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, Fc.a.f9155f);
        if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1602 != null) {
            setDividerDrawableHorizontal(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1602);
        }
        Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1603 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, Fc.a.f9156g);
        if (drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1603 != null) {
            setDividerDrawableVertical(drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c1603);
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(Fc.a.f9161l, 0);
        if (i11 != 0) {
            this.f65283j = i11;
            this.f65282i = i11;
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(Fc.a.f9163n, 0);
        if (i12 != 0) {
            this.f65283j = i12;
        }
        int i13 = typedArrayObtainStyledAttributes.getInt(Fc.a.f9162m, 0);
        if (i13 != 0) {
            this.f65282i = i13;
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
        int size = this.f65289p.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = this.f65289p.get(i12);
            for (int i13 = 0; i13 < cVar.f65364h; i13++) {
                int i14 = cVar.f65371o + i13;
                View viewR = r(i14);
                if (viewR != null && viewR.getVisibility() != 8) {
                    a aVar = (a) viewR.getLayoutParams();
                    if (s(i14, i13)) {
                        if (z10) {
                            left = viewR.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        } else {
                            left = (viewR.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f65285l;
                        }
                        h(canvas, left, cVar.f65358b, cVar.f65363g);
                    }
                    if (i13 == cVar.f65364h - 1 && (this.f65283j & 4) > 0) {
                        if (z10) {
                            right = (viewR.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f65285l;
                        } else {
                            right = viewR.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        }
                        h(canvas, right, cVar.f65358b, cVar.f65363g);
                    }
                }
            }
            if (t(i12)) {
                if (z11) {
                    i11 = cVar.f65360d;
                } else {
                    i11 = cVar.f65358b - this.f65284k;
                }
                e(canvas, paddingLeft, i11, iMax);
            }
            if (u(i12) && (this.f65282i & 4) > 0) {
                if (z11) {
                    i10 = cVar.f65358b - this.f65284k;
                } else {
                    i10 = cVar.f65360d;
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
        int size = this.f65289p.size();
        for (int i12 = 0; i12 < size; i12++) {
            c cVar = this.f65289p.get(i12);
            for (int i13 = 0; i13 < cVar.f65364h; i13++) {
                int i14 = cVar.f65371o + i13;
                View viewR = r(i14);
                if (viewR != null && viewR.getVisibility() != 8) {
                    a aVar = (a) viewR.getLayoutParams();
                    if (s(i14, i13)) {
                        if (z11) {
                            top = viewR.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        } else {
                            top = (viewR.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.f65284k;
                        }
                        e(canvas, cVar.f65357a, top, cVar.f65363g);
                    }
                    if (i13 == cVar.f65364h - 1 && (this.f65282i & 4) > 0) {
                        if (z11) {
                            bottom = (viewR.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.f65284k;
                        } else {
                            bottom = viewR.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        }
                        e(canvas, cVar.f65357a, bottom, cVar.f65363g);
                    }
                }
            }
            if (t(i12)) {
                if (z10) {
                    i11 = cVar.f65359c;
                } else {
                    i11 = cVar.f65357a - this.f65285l;
                }
                h(canvas, i11, paddingTop, iMax);
            }
            if (u(i12) && (this.f65283j & 4) > 0) {
                if (z10) {
                    i10 = cVar.f65357a - this.f65285l;
                } else {
                    i10 = cVar.f65359c;
                }
                h(canvas, i10, paddingTop, iMax);
            }
        }
    }

    private boolean s(int i10, int i11) {
        if (b(i10, i11)) {
            if (q()) {
                if ((this.f65283j & 1) == 0) {
                    return false;
                }
                return true;
            }
            if ((this.f65282i & 1) == 0) {
                return false;
            }
            return true;
        }
        if (q()) {
            if ((this.f65283j & 2) == 0) {
                return false;
            }
            return true;
        }
        if ((this.f65282i & 2) == 0) {
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
                int i12 = cVar.f65361e;
                int i13 = this.f65285l;
                cVar.f65361e = i12 + i13;
                cVar.f65362f += i13;
                return;
            }
            int i14 = cVar.f65361e;
            int i15 = this.f65284k;
            cVar.f65361e = i14 + i15;
            cVar.f65362f += i15;
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
            if ((this.f65283j & 4) > 0) {
                int i10 = cVar.f65361e;
                int i11 = this.f65285l;
                cVar.f65361e = i10 + i11;
                cVar.f65362f += i11;
                return;
            }
            return;
        }
        if ((this.f65282i & 4) > 0) {
            int i12 = cVar.f65361e;
            int i13 = this.f65284k;
            cVar.f65361e = i12 + i13;
            cVar.f65362f += i13;
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
        int i22 = this.f65274a;
        boolean z13 = false;
        if (i22 != 0) {
            if (i22 != 1) {
                if (i22 != 2) {
                    if (i22 == 3) {
                        if (iZ == 1) {
                            z13 = true;
                        }
                        if (this.f65275b == 2) {
                            z13 = !z13;
                        }
                        w(z13, true, i10, i11, i12, i13);
                        return;
                    }
                    throw new IllegalStateException("Invalid flex direction is set: " + this.f65274a);
                }
                if (iZ == 1) {
                    z13 = true;
                }
                if (this.f65275b == 2) {
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
                i13 = this.f65285l;
            }
            if ((this.f65283j & 4) > 0) {
                i12 = this.f65285l;
            } else {
                return i13;
            }
        } else {
            if (s(i10, i11)) {
                i13 = this.f65284k;
            }
            if ((this.f65282i & 4) > 0) {
                i12 = this.f65284k;
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
