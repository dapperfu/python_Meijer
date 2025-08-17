package com.scandit.datacapture.core.internal.sdk.extensions;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Rect;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u001a\u0010\u0007\u001a\u00020\b*\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\f"}, d2 = {"createSdcRect", "Lcom/scandit/datacapture/core/common/geometry/Rect;", "left", "", "top", "right", "bottom", "toGraphicRect", "Landroid/graphics/Rect;", "min", "", "max", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GraphicsExtensionsKt {
    public static final Rect createSdcRect(float f10, float f11, float f12, float f13) {
        return new Rect(new Point(f10, f11), new Size2(f12 - f10, f13 - f11));
    }

    public static final android.graphics.Rect toGraphicRect(Rect rect, int i10, int i11) {
        Intrinsics.j(rect, "<this>");
        int i12 = i11 - i10;
        float f10 = i10;
        float f11 = i12;
        android.graphics.Rect rect2 = new android.graphics.Rect(MathKt.d((rect.getOrigin().getX() * f11) + f10), MathKt.d((rect.getOrigin().getY() * f11) + f10), MathKt.d((rect.getSize().getWidth() * f11) + (rect.getOrigin().getX() * f11) + f10), MathKt.d((rect.getSize().getHeight() * f11) + (rect.getOrigin().getY() * f11) + f10));
        rect2.sort();
        return rect2;
    }
}
