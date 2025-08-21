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
import qe.C16634c;
import te.C17234h;
import te.C17239m;

/* loaded from: classes4.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Rect f87727a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f87728b;

    /* renamed from: c, reason: collision with root package name */
    private final ColorStateList f87729c;

    /* renamed from: d, reason: collision with root package name */
    private final ColorStateList f87730d;

    /* renamed from: e, reason: collision with root package name */
    private final int f87731e;

    /* renamed from: f, reason: collision with root package name */
    private final C17239m f87732f;

    static b a(Context context, int i10) throws Resources.NotFoundException {
        o2.i.b(i10 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, ce.l.f62275m4);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(ce.l.f62287n4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ce.l.f62311p4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ce.l.f62299o4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ce.l.f62323q4, 0));
        ColorStateList colorStateListA = C16634c.a(context, typedArrayObtainStyledAttributes, ce.l.f62335r4);
        ColorStateList colorStateListA2 = C16634c.a(context, typedArrayObtainStyledAttributes, ce.l.f62395w4);
        ColorStateList colorStateListA3 = C16634c.a(context, typedArrayObtainStyledAttributes, ce.l.f62371u4);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ce.l.f62383v4, 0);
        C17239m c17239mM = C17239m.b(context, typedArrayObtainStyledAttributes.getResourceId(ce.l.f62347s4, 0), typedArrayObtainStyledAttributes.getResourceId(ce.l.f62359t4, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, c17239mM, rect);
    }

    void d(TextView textView) {
        e(textView, null, null);
    }

    int b() {
        return this.f87727a.bottom;
    }

    int c() {
        return this.f87727a.top;
    }

    void e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        C17234h c17234h = new C17234h();
        C17234h c17234h2 = new C17234h();
        c17234h.setShapeAppearanceModel(this.f87732f);
        c17234h2.setShapeAppearanceModel(this.f87732f);
        if (colorStateList == null) {
            colorStateList = this.f87729c;
        }
        c17234h.b0(colorStateList);
        c17234h.j0(this.f87731e, this.f87730d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f87728b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f87728b.withAlpha(30), c17234h, c17234h2);
        Rect rect = this.f87727a;
        ViewCompat.q0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, C17239m c17239m, Rect rect) {
        o2.i.d(rect.left);
        o2.i.d(rect.top);
        o2.i.d(rect.right);
        o2.i.d(rect.bottom);
        this.f87727a = rect;
        this.f87728b = colorStateList2;
        this.f87729c = colorStateList;
        this.f87730d = colorStateList3;
        this.f87731e = i10;
        this.f87732f = c17239m;
    }
}
