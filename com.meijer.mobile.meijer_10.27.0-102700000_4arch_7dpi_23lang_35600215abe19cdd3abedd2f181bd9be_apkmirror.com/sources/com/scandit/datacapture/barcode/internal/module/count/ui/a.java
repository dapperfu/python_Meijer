package com.scandit.datacapture.barcode.internal.module.count.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f121340a;

    /* renamed from: b, reason: collision with root package name */
    public final float f121341b;

    /* renamed from: c, reason: collision with root package name */
    public final int f121342c;

    /* renamed from: d, reason: collision with root package name */
    public Size f121343d;

    /* renamed from: e, reason: collision with root package name */
    public final SharedPreferences f121344e;

    public a(Context context, float f10, float f11, int i10) {
        Intrinsics.j(context, "context");
        this.f121340a = f10;
        this.f121341b = f11;
        this.f121342c = i10;
        this.f121343d = new Size(0, 0);
        this.f121344e = context.getSharedPreferences("com.scandit.barcode.count_shutter_button", 0);
    }

    public final float a() {
        return RangesKt.j(this.f121344e.getFloat("barcode-count-floating-shutter-x-location", this.f121340a), this.f121343d.getWidth() - this.f121342c);
    }

    public final float b() {
        return RangesKt.j(this.f121344e.getFloat("barcode-count-floating-shutter-y-location", this.f121341b), this.f121343d.getHeight() - this.f121342c);
    }
}
