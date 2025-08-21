package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.core.internal.module.serialization.NativeStructSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¨\u0006\b"}, d2 = {"center", "Lcom/scandit/datacapture/core/common/geometry/Point;", "Lcom/scandit/datacapture/core/common/geometry/Rect;", "contains", "", "point", "toJson", "", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RectUtilsKt {
    public static final Point center(Rect rect) {
        Intrinsics.j(rect, "<this>");
        Point point = rect.origin;
        float f10 = point.f125078x;
        Size2 size2 = rect.size;
        float f11 = 2;
        return new Point((size2.width / f11) + f10, (size2.height / f11) + point.f125079y);
    }

    public static final boolean contains(Rect rect, Point point) {
        Intrinsics.j(rect, "<this>");
        Intrinsics.j(point, "point");
        float f10 = point.f125078x;
        Point point2 = rect.origin;
        float f11 = point2.f125078x;
        if (f10 < f11) {
            return false;
        }
        Size2 size2 = rect.size;
        if (f10 >= f11 + size2.width) {
            return false;
        }
        float f12 = point.f125079y;
        float f13 = point2.f125079y;
        return f12 >= f13 && f12 < f13 + size2.height;
    }

    public static final /* synthetic */ String toJson(Rect rect) {
        Intrinsics.j(rect, "<this>");
        String strRectToJson = NativeStructSerializer.rectToJson(rect);
        Intrinsics.i(strRectToJson, "rectToJson(...)");
        return strRectToJson;
    }
}
