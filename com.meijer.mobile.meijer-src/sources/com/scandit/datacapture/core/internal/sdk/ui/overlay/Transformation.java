package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.geometry.PointUtilsKt;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.RotationExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;", "", "", "scale", "Lcom/scandit/datacapture/core/common/geometry/Point;", "rotationPivot", "", "rotationDegrees", "<init>", "(FLcom/scandit/datacapture/core/common/geometry/Point;I)V", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "quadrilateral", "transform", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "point", "(Lcom/scandit/datacapture/core/common/geometry/Point;)Lcom/scandit/datacapture/core/common/geometry/Point;", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class Transformation {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Transformation f126744d = new Transformation(1.0f, PointUtilsKt.getPOINT_ZERO(), 0);

    /* renamed from: a, reason: collision with root package name */
    private final float f126745a;

    /* renamed from: b, reason: collision with root package name */
    private final Point f126746b;

    /* renamed from: c, reason: collision with root package name */
    private final int f126747c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation$Companion;", "", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DataCaptureViewSize;", "from", "to", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;", "between", "(Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DataCaptureViewSize;Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/DataCaptureViewSize;)Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;", "ID", "Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;", "getID", "()Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/Transformation;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public final Transformation between(DataCaptureViewSize from, DataCaptureViewSize to2) {
            Intrinsics.j(from, "from");
            Intrinsics.j(to2, "to");
            if (Intrinsics.e(from, to2)) {
                return getID();
            }
            Size2 size = from.getSize();
            Size2 size2 = to2.getSize();
            return new Transformation(Math.max(size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight()), Size2UtilsKt.getCenter(from.getSize()), RotationExtensionsKt.toAngle(to2.getRotation()) - RotationExtensionsKt.toAngle(from.getRotation()));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Transformation getID() {
            return Transformation.f126744d;
        }
    }

    public final Quadrilateral transform(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "quadrilateral");
        int i10 = this.f126747c;
        if (i10 != 0) {
            quadrilateral = QuadrilateralUtilsKt.rotatedDegrees(quadrilateral, this.f126746b, i10);
        }
        float f10 = this.f126745a;
        return f10 == 1.0f ? quadrilateral : QuadrilateralUtilsKt.scaled(quadrilateral, f10);
    }

    public Transformation(float f10, Point rotationPivot, int i10) {
        Intrinsics.j(rotationPivot, "rotationPivot");
        this.f126745a = f10;
        this.f126746b = rotationPivot;
        this.f126747c = i10;
    }

    public final Point transform(Point point) {
        Intrinsics.j(point, "point");
        int i10 = this.f126747c;
        if (i10 != 0) {
            point = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedDegrees(point, this.f126746b, i10);
        }
        float f10 = this.f126745a;
        return f10 == 1.0f ? point : com.scandit.datacapture.core.common.geometry.PointUtilsKt.scaled(point, f10);
    }
}
