package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import oe.C16026c;
import re.C16760h;
import re.C16765m;

/* loaded from: classes4.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f86887a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f86888b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f86889c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f86890d;

    /* renamed from: e, reason: collision with root package name */
    private final int f86891e;

    /* renamed from: f, reason: collision with root package name */
    private final C16765m f86892f;

    static b a(Context context, int i10) throws Resources.NotFoundException {
        o2.i.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, ae.l.f45260m4);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(ae.l.f45272n4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ae.l.f45296p4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ae.l.f45284o4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ae.l.f45308q4, 0));
        ColorStateList colorStateListA = C16026c.a(context, typedArrayObtainStyledAttributes, ae.l.f45320r4);
        ColorStateList colorStateListA2 = C16026c.a(context, typedArrayObtainStyledAttributes, ae.l.f45380w4);
        ColorStateList colorStateListA3 = C16026c.a(context, typedArrayObtainStyledAttributes, ae.l.f45356u4);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ae.l.f45368v4, 0);
        C16765m c16765mM = C16765m.b(context, typedArrayObtainStyledAttributes.getResourceId(ae.l.f45332s4, 0), typedArrayObtainStyledAttributes.getResourceId(ae.l.f45344t4, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, c16765mM, rect);
    }

    void d(TextView textView) {
        e(textView, null, null);
    }

    int b() {
        return this.f86887a.bottom;
    }

    int c() {
        return this.f86887a.top;
    }

    void e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        C16760h c16760h = new C16760h();
        C16760h c16760h2 = new C16760h();
        c16760h.setShapeAppearanceModel(this.f86892f);
        c16760h2.setShapeAppearanceModel(this.f86892f);
        if (colorStateList == null) {
            colorStateList = this.f86889c;
        }
        c16760h.b0(colorStateList);
        c16760h.j0(this.f86891e, this.f86890d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f86888b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f86888b.withAlpha(30), c16760h, c16760h2);
        Rect rect = this.f86887a;
        ViewCompat.q0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, C16765m c16765m, Rect rect) {
        o2.i.d(rect.left);
        o2.i.d(rect.top);
        o2.i.d(rect.right);
        o2.i.d(rect.bottom);
        this.f86887a = rect;
        this.f86888b = colorStateList2;
        this.f86889c = colorStateList;
        this.f86890d = colorStateList3;
        this.f86891e = i10;
        this.f86892f = c16765m;
    }
}
