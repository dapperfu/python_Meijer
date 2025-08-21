package com.scandit.datacapture.core.common.geometry;

import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/common/geometry/Size2;", "", "toJson", "(Lcom/scandit/datacapture/core/common/geometry/Size2;)Ljava/lang/String;", "", "width", "height", "Size2", "(II)Lcom/scandit/datacapture/core/common/geometry/Size2;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class Size2UtilsKt {
    public static final Size2 Size2(int i10, int i11) {
        return new Size2(i10, i11);
    }

    public static final String toJson(Size2 size) {
        Intrinsics.j(size, "<this>");
        Intrinsics.j(size, "size");
        String string = new JSONObject(MapsKt.o(TuplesKt.a("width", Float.valueOf(size.width)), TuplesKt.a("height", Float.valueOf(size.height)))).toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }
}
