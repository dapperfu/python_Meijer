package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.graphics.Path;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes12.dex */
public final class D {

    /* renamed from: f, reason: collision with root package name */
    public static final Lazy f122475f = LazyKt.b(C.f122474a);

    /* renamed from: a, reason: collision with root package name */
    public final NativeCluster f122476a;

    /* renamed from: b, reason: collision with root package name */
    public final Quadrilateral f122477b;

    /* renamed from: c, reason: collision with root package name */
    public final int f122478c;

    /* renamed from: d, reason: collision with root package name */
    public final Point f122479d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f122480e;

    public D(NativeCluster nativeCluster, Quadrilateral location, int i10) {
        Intrinsics.j(location, "location");
        this.f122476a = nativeCluster;
        this.f122477b = location;
        this.f122478c = i10;
        Point[] pointArr = {location.getTopLeft(), location.getTopRight(), location.getBottomRight(), location.getBottomLeft()};
        Point point = pointArr[0];
        int iM0 = ArraysKt.m0(pointArr);
        if (iM0 != 0) {
            float x10 = point.getX() - point.getY();
            IntIterator it = new IntRange(1, iM0).iterator();
            while (it.hasNext()) {
                Point point2 = pointArr[it.nextInt()];
                float x11 = point2.getX() - point2.getY();
                if (Float.compare(x10, x11) < 0) {
                    point = point2;
                    x10 = x11;
                }
            }
        }
        Intrinsics.i(point, "maxBy(...)");
        this.f122479d = new Point(point.getX() + ((Number) f122475f.getValue()).intValue(), point.getY());
        this.f122480e = com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush.k.a(this.f122477b);
    }
}
