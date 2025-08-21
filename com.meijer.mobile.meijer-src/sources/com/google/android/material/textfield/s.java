package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import d2.C13595a;
import java.util.Arrays;

/* loaded from: classes4.dex */
class s {
    static void e(CheckableImageButton checkableImageButton) {
    }

    static ImageView.ScaleType b(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 5 ? i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = C13595a.r(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                C13595a.o(drawable, ColorStateList.valueOf(colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                C13595a.o(drawable, colorStateList);
            }
            if (mode != null) {
                C13595a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private static int[] c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(c(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable drawableMutate = C13595a.r(drawable).mutate();
            C13595a.o(drawableMutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(drawableMutate);
        }
    }

    private static void f(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z10;
        boolean zO = ViewCompat.O(checkableImageButton);
        boolean z11 = false;
        int i10 = 1;
        if (onLongClickListener != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (zO || z10) {
            z11 = true;
        }
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(zO);
        checkableImageButton.setPressable(zO);
        checkableImageButton.setLongClickable(z10);
        if (!z11) {
            i10 = 2;
        }
        ViewCompat.w0(checkableImageButton, i10);
    }

    static void g(CheckableImageButton checkableImageButton, int i10) {
        checkableImageButton.setMinimumWidth(i10);
        checkableImageButton.setMinimumHeight(i10);
    }

    static void h(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void i(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f(checkableImageButton, onLongClickListener);
    }

    static void j(CheckableImageButton checkableImageButton, ImageView.ScaleType scaleType) {
        checkableImageButton.setScaleType(scaleType);
    }
}
