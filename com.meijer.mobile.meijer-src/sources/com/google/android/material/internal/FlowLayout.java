package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.gms.common.api.a;
import p2.C16381t;

/* loaded from: classes4.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private int f87917a;

    /* renamed from: b, reason: collision with root package name */
    private int f87918b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f87919c;

    /* renamed from: d, reason: collision with root package name */
    private int f87920d;

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f87919c = false;
        d(context, attributeSet);
    }

    private static int a(int i10, int i11, int i12) {
        return i11 != Integer.MIN_VALUE ? i11 != 1073741824 ? i12 : i10 : Math.min(i12, i10);
    }

    public int b(View view) {
        Object tag = view.getTag(ce.f.f61682M);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean c() {
        return this.f87919c;
    }

    protected int getItemSpacing() {
        return this.f87918b;
    }

    protected int getLineSpacing() {
        return this.f87917a;
    }

    protected int getRowCount() {
        return this.f87920d;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : a.e.API_PRIORITY_OTHER;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin;
                    i13 = marginLayoutParams.rightMargin;
                } else {
                    i12 = 0;
                    i13 = 0;
                }
                int i18 = paddingLeft2;
                if (paddingLeft2 + i12 + childAt.getMeasuredWidth() <= paddingRight || c()) {
                    paddingLeft = i18;
                } else {
                    paddingLeft = getPaddingLeft();
                    i15 = this.f87917a + paddingTop;
                }
                int measuredWidth = paddingLeft + i12 + childAt.getMeasuredWidth();
                int measuredHeight = i15 + childAt.getMeasuredHeight();
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i12 + i13 + childAt.getMeasuredWidth() + this.f87918b;
                if (i17 == getChildCount() - 1) {
                    i16 += i13;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i16 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    protected void setItemSpacing(int i10) {
        this.f87918b = i10;
    }

    protected void setLineSpacing(int i10) {
        this.f87917a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f87919c = z10;
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ce.l.f61997O2, 0, 0);
        this.f87917a = typedArrayObtainStyledAttributes.getDimensionPixelSize(ce.l.f62019Q2, 0);
        this.f87918b = typedArrayObtainStyledAttributes.getDimensionPixelSize(ce.l.f62008P2, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int paddingLeft;
        int paddingRight;
        int iA;
        int iB;
        if (getChildCount() == 0) {
            this.f87920d = 0;
            return;
        }
        this.f87920d = 1;
        if (ViewCompat.z(this) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z11) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i14 = (i12 - i10) - paddingRight;
        int measuredWidth = paddingLeft;
        int i15 = paddingTop;
        for (int i16 = 0; i16 < getChildCount(); i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(ce.f.f61682M, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iB = C16381t.b(marginLayoutParams);
                    iA = C16381t.a(marginLayoutParams);
                } else {
                    iA = 0;
                    iB = 0;
                }
                int measuredWidth2 = measuredWidth + iB + childAt.getMeasuredWidth();
                if (!this.f87919c && measuredWidth2 > i14) {
                    i15 = this.f87917a + paddingTop;
                    this.f87920d++;
                    measuredWidth = paddingLeft;
                }
                childAt.setTag(ce.f.f61682M, Integer.valueOf(this.f87920d - 1));
                int i17 = measuredWidth + iB;
                int measuredWidth3 = childAt.getMeasuredWidth() + i17;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (z11) {
                    childAt.layout(i14 - measuredWidth3, i15, (i14 - measuredWidth) - iB, measuredHeight);
                } else {
                    childAt.layout(i17, i15, measuredWidth3, measuredHeight);
                }
                measuredWidth += iB + iA + childAt.getMeasuredWidth() + this.f87918b;
                paddingTop = measuredHeight;
            }
        }
    }
}
