package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview;

import android.graphics.Paint;
import com.medallia.digital.mobilesdk.l3;
import kotlin.ranges.RangesKt;

/* loaded from: classes11.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Paint f122629a;

    static {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(com.scandit.datacapture.barcode.internal.module.extensions.a.a(-65536, (int) (RangesKt.n(0.3f, 0.0f, 1.0f) * l3.f92484c)));
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        f122629a = paint;
    }
}
