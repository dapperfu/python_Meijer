package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.view.MotionEvent;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract class l {
    public static boolean a(MotionEvent event, List items, Function1 onCluster) {
        Intrinsics.j(event, "event");
        Intrinsics.j(items, "items");
        Intrinsics.j(onCluster, "onCluster");
        Point point = new Point(event.getX(), event.getY());
        Iterator it = items.iterator();
        while (it.hasNext()) {
            D d10 = (D) it.next();
            NativeCluster nativeCluster = d10.f121524a;
            if (nativeCluster != null && QuadrilateralUtilsKt.contains(d10.f121525b, point)) {
                onCluster.invoke(nativeCluster);
                return true;
            }
        }
        return false;
    }
}
