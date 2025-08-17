package com.scandit.datacapture.barcode.internal.module.spark.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13209b {

    /* renamed from: a, reason: collision with root package name */
    public final int f123054a;

    public C13209b(Context context) {
        Intrinsics.j(context, "context");
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f123054a = scaledTouchSlop * scaledTouchSlop;
    }

    public final EnumC13208a a(PointF start, PointF end) {
        Intrinsics.j(start, "start");
        Intrinsics.j(end, "end");
        float f10 = end.x - start.x;
        float f11 = end.y - start.y;
        if ((f11 * f11) + (f10 * f10) < this.f123054a) {
            return EnumC13208a.f123042b;
        }
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        return f10 >= 0.0f ? f11 >= 0.0f ? fAbs >= fAbs2 ? EnumC13208a.f123044d : EnumC13208a.f123045e : fAbs >= fAbs2 ? EnumC13208a.f123044d : EnumC13208a.f123043c : f11 >= 0.0f ? fAbs >= fAbs2 ? EnumC13208a.f123046f : EnumC13208a.f123045e : fAbs >= fAbs2 ? EnumC13208a.f123046f : EnumC13208a.f123043c;
    }
}
