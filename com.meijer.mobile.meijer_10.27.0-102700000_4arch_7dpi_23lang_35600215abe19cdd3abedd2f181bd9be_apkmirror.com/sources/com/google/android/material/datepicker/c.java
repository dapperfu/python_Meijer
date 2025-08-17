package com.google.android.material.datepicker;

import ae.C5597b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import oe.C16025b;
import oe.C16026c;

/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    final b f86893a;

    /* renamed from: b, reason: collision with root package name */
    final b f86894b;

    /* renamed from: c, reason: collision with root package name */
    final b f86895c;

    /* renamed from: d, reason: collision with root package name */
    final b f86896d;

    /* renamed from: e, reason: collision with root package name */
    final b f86897e;

    /* renamed from: f, reason: collision with root package name */
    final b f86898f;

    /* renamed from: g, reason: collision with root package name */
    final b f86899g;

    /* renamed from: h, reason: collision with root package name */
    final Paint f86900h;

    c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C16025b.d(context, C5597b.f44483E, MaterialCalendar.class.getCanonicalName()), ae.l.f45140c4);
        this.f86893a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ae.l.f45188g4, 0));
        this.f86899g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ae.l.f45164e4, 0));
        this.f86894b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ae.l.f45176f4, 0));
        this.f86895c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ae.l.f45200h4, 0));
        ColorStateList colorStateListA = C16026c.a(context, typedArrayObtainStyledAttributes, ae.l.f45212i4);
        this.f86896d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ae.l.f45236k4, 0));
        this.f86897e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ae.l.f45224j4, 0));
        this.f86898f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ae.l.f45248l4, 0));
        Paint paint = new Paint();
        this.f86900h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
