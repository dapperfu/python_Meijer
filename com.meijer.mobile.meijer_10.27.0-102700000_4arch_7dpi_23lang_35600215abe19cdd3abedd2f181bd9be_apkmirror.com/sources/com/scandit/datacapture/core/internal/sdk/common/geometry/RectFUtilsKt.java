package com.scandit.datacapture.core.internal.sdk.common.geometry;

import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"scaleCentered", "Landroid/graphics/RectF;", "scaleFactor", "", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RectFUtilsKt {
    public static final RectF scaleCentered(RectF rectF, float f10) {
        Intrinsics.j(rectF, "<this>");
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float f11 = rectF.left;
        float f12 = f10 - 1.0f;
        float f13 = ((f11 - fCenterX) * f12) + f11;
        float f14 = rectF.top;
        float f15 = ((f14 - fCenterY) * f12) + f14;
        float f16 = rectF.right;
        float f17 = rectF.bottom;
        return new RectF(f13, f15, ((f16 - fCenterX) * f12) + f16, ((f17 - fCenterY) * f12) + f17);
    }
}
