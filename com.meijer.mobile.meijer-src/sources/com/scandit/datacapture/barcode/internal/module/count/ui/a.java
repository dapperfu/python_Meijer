package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f122292a;

    /* renamed from: b, reason: collision with root package name */
    public final float f122293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f122294c;

    /* renamed from: d, reason: collision with root package name */
    public Size f122295d;

    /* renamed from: e, reason: collision with root package name */
    public final SharedPreferences f122296e;

    public a(Context context, float f10, float f11, int i10) {
        Intrinsics.j(context, "context");
        this.f122292a = f10;
        this.f122293b = f11;
        this.f122294c = i10;
        this.f122295d = new Size(0, 0);
        this.f122296e = context.getSharedPreferences("com.scandit.barcode.count_shutter_button", 0);
    }

    public final float a() {
        return RangesKt.j(this.f122296e.getFloat("barcode-count-floating-shutter-x-location", this.f122292a), this.f122295d.getWidth() - this.f122294c);
    }

    public final float b() {
        return RangesKt.j(this.f122296e.getFloat("barcode-count-floating-shutter-y-location", this.f122293b), this.f122295d.getHeight() - this.f122294c);
    }
}
