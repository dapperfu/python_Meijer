package com.scandit.datacapture.barcode.internal.module.spark.ui;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.ui.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13342b {

    /* renamed from: a, reason: collision with root package name */
    public final int f124006a;

    public C13342b(Context context) {
        Intrinsics.j(context, "context");
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f124006a = scaledTouchSlop * scaledTouchSlop;
    }

    public final EnumC13341a a(PointF start, PointF end) {
        Intrinsics.j(start, "start");
        Intrinsics.j(end, "end");
        float f10 = end.x - start.x;
        float f11 = end.y - start.y;
        if ((f11 * f11) + (f10 * f10) < this.f124006a) {
            return EnumC13341a.f123994b;
        }
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        return f10 >= 0.0f ? f11 >= 0.0f ? fAbs >= fAbs2 ? EnumC13341a.f123996d : EnumC13341a.f123997e : fAbs >= fAbs2 ? EnumC13341a.f123996d : EnumC13341a.f123995c : f11 >= 0.0f ? fAbs >= fAbs2 ? EnumC13341a.f123998f : EnumC13341a.f123997e : fAbs >= fAbs2 ? EnumC13341a.f123998f : EnumC13341a.f123995c;
    }
}
