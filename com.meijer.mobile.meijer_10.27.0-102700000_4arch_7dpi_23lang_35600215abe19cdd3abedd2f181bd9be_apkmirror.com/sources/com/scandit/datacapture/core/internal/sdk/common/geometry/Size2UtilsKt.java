package com.scandit.datacapture.core.internal.sdk.common.geometry;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Size2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/core/common/geometry/Size2;", "a", "Lcom/scandit/datacapture/core/common/geometry/Size2;", "getSIZE_2_ZERO", "()Lcom/scandit/datacapture/core/common/geometry/Size2;", "SIZE_2_ZERO", "b", "getSIZE_2_ONE", "SIZE_2_ONE", "Lcom/scandit/datacapture/core/common/geometry/Point;", "getCenter", "(Lcom/scandit/datacapture/core/common/geometry/Size2;)Lcom/scandit/datacapture/core/common/geometry/Point;", "center", "scandit-capture-core"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class Size2UtilsKt {

    /* renamed from: a, reason: collision with root package name */
    private static final Size2 f125421a = new Size2(0.0f, 0.0f);

    /* renamed from: b, reason: collision with root package name */
    private static final Size2 f125422b = new Size2(1.0f, 1.0f);

    public static final Point getCenter(Size2 size2) {
        Intrinsics.j(size2, "<this>");
        float f10 = 2;
        return new Point(size2.getWidth() / f10, size2.getHeight() / f10);
    }

    public static final Size2 getSIZE_2_ONE() {
        return f125422b;
    }

    public static final Size2 getSIZE_2_ZERO() {
        return f125421a;
    }
}
