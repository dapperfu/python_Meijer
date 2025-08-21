package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ce.C6503b;
import ce.l;
import qe.C16633b;
import qe.C16634c;
import we.C17867a;

/* loaded from: classes4.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private static int x(Context context, TypedArray typedArray, int... iArr) {
        int iC = -1;
        for (int i10 = 0; i10 < iArr.length && iC < 0; i10++) {
            iC = C16634c.c(context, typedArray, iArr[i10], -1);
        }
        return iC;
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(C17867a.c(context, attributeSet, i10, 0), attributeSet, i10);
        w(attributeSet, i10, 0);
    }

    private void t(Resources.Theme theme, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, l.f62156c5);
        int iX = x(getContext(), typedArrayObtainStyledAttributes, l.f62180e5, l.f62192f5);
        typedArrayObtainStyledAttributes.recycle();
        if (iX >= 0) {
            setLineHeight(iX);
        }
    }

    private static boolean u(Context context) {
        return C16633b.b(context, C6503b.f61547n0, true);
    }

    private static int v(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f62204g5, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.f62216h5, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static boolean y(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f62204g5, i10, i11);
        int iX = x(context, typedArrayObtainStyledAttributes, l.f62228i5, l.f62240j5);
        typedArrayObtainStyledAttributes.recycle();
        return iX != -1;
    }

    private void w(AttributeSet attributeSet, int i10, int i11) throws Resources.NotFoundException {
        int iV;
        Context context = getContext();
        if (u(context)) {
            Resources.Theme theme = context.getTheme();
            if (!y(context, theme, attributeSet, i10, i11) && (iV = v(theme, attributeSet, i10, i11)) != -1) {
                t(theme, iV);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i10) throws Resources.NotFoundException {
        super.setTextAppearance(context, i10);
        if (u(context)) {
            t(context.getTheme(), i10);
        }
    }
}
