package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush;

import android.content.Context;
import android.graphics.Paint;
import com.medallia.digital.mobilesdk.l3;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes12.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Paint f123540a;

    /* renamed from: b, reason: collision with root package name */
    public static final Paint f123541b;

    static {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float f10 = l3.f93323c;
        paint.setColor(com.scandit.datacapture.barcode.internal.module.extensions.a.a(-65536, (int) (RangesKt.n(0.3f, 0.0f, 1.0f) * f10)));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        f123540a = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(com.scandit.datacapture.barcode.internal.module.extensions.a.a(-16711936, (int) (RangesKt.n(0.3f, 0.0f, 1.0f) * f10)));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(PixelExtensionsKt.pxFromDp$default(2.0f, (Context) null, 1, (Object) null));
        f123541b = paint2;
    }
}
