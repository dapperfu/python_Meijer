package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import ce.C6503b;
import qe.C16633b;
import qe.C16634c;

/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    final b f87733a;

    /* renamed from: b, reason: collision with root package name */
    final b f87734b;

    /* renamed from: c, reason: collision with root package name */
    final b f87735c;

    /* renamed from: d, reason: collision with root package name */
    final b f87736d;

    /* renamed from: e, reason: collision with root package name */
    final b f87737e;

    /* renamed from: f, reason: collision with root package name */
    final b f87738f;

    /* renamed from: g, reason: collision with root package name */
    final b f87739g;

    /* renamed from: h, reason: collision with root package name */
    final Paint f87740h;

    c(Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C16633b.d(context, C6503b.f61498E, MaterialCalendar.class.getCanonicalName()), ce.l.f62155c4);
        this.f87733a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ce.l.f62203g4, 0));
        this.f87739g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ce.l.f62179e4, 0));
        this.f87734b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ce.l.f62191f4, 0));
        this.f87735c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ce.l.f62215h4, 0));
        ColorStateList colorStateListA = C16634c.a(context, typedArrayObtainStyledAttributes, ce.l.f62227i4);
        this.f87736d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ce.l.f62251k4, 0));
        this.f87737e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ce.l.f62239j4, 0));
        this.f87738f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ce.l.f62263l4, 0));
        Paint paint = new Paint();
        this.f87740h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
