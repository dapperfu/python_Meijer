package com.google.android.material.textview;

import ae.C5597b;
import ae.l;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import oe.C16025b;
import oe.C16026c;
import ue.C17250a;

/* loaded from: classes4.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private static int x(Context context, TypedArray typedArray, int... iArr) {
        int iC = -1;
        for (int i10 = 0; i10 < iArr.length && iC < 0; i10++) {
            iC = C16026c.c(context, typedArray, iArr[i10], -1);
        }
        return iC;
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        super(C17250a.c(context, attributeSet, i10, 0), attributeSet, i10);
        w(attributeSet, i10, 0);
    }

    private void t(Resources.Theme theme, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, l.f45141c5);
        int iX = x(getContext(), typedArrayObtainStyledAttributes, l.f45165e5, l.f45177f5);
        typedArrayObtainStyledAttributes.recycle();
        if (iX >= 0) {
            setLineHeight(iX);
        }
    }

    private static boolean u(Context context) {
        return C16025b.b(context, C5597b.f44532n0, true);
    }

    private static int v(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f45189g5, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.f45201h5, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static boolean y(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f45189g5, i10, i11);
        int iX = x(context, typedArrayObtainStyledAttributes, l.f45213i5, l.f45225j5);
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
