package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat;
import i.C14583f;
import i.C14587j;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f46821a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f46822b;

    /* renamed from: c, reason: collision with root package name */
    private int f46823c;

    private boolean b() {
        return this.f46822b;
    }

    private void setStacked(boolean z10) {
        if (this.f46822b != z10) {
            if (!z10 || this.f46821a) {
                this.f46822b = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? 8388613 : 80);
                View viewFindViewById = findViewById(C14583f.f136403y);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f46821a != z10) {
            this.f46821a = z10;
            if (!z10 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46823c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14587j.f136505N0);
        ViewCompat.k0(this, context, C14587j.f136505N0, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f46821a = typedArrayObtainStyledAttributes.getBoolean(C14587j.f136509O0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f46821a);
        }
    }

    private int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iMakeMeasureSpec;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int paddingBottom = 0;
        if (this.f46821a) {
            if (size > this.f46823c && b()) {
                setStacked(false);
            }
            this.f46823c = size;
        }
        if (!b() && View.MeasureSpec.getMode(i10) == 1073741824) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        } else {
            iMakeMeasureSpec = i10;
            z10 = false;
        }
        super.onMeasure(iMakeMeasureSpec, i11);
        if (this.f46821a && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z10 = true;
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (ViewCompat.A(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }
}
