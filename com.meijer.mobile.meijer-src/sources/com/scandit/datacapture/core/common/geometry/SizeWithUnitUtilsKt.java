package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.core.internal.module.serialization.NativeStructSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0001¨\u0006\t"}, d2 = {"SizeWithUnit", "Lcom/scandit/datacapture/core/common/geometry/SizeWithUnit;", "width", "", "height", "unit", "Lcom/scandit/datacapture/core/common/geometry/MeasureUnit;", "toJson", "", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SizeWithUnitUtilsKt {
    public static final SizeWithUnit SizeWithUnit(float f10, float f11, MeasureUnit unit) {
        Intrinsics.j(unit, "unit");
        return new SizeWithUnit(new FloatWithUnit(f10, unit), new FloatWithUnit(f11, unit));
    }

    public static final /* synthetic */ String toJson(SizeWithUnit sizeWithUnit) {
        Intrinsics.j(sizeWithUnit, "<this>");
        String strSizeWithUnitToJson = NativeStructSerializer.sizeWithUnitToJson(sizeWithUnit);
        Intrinsics.i(strSizeWithUnitToJson, "sizeWithUnitToJson(...)");
        return strSizeWithUnitToJson;
    }
}
