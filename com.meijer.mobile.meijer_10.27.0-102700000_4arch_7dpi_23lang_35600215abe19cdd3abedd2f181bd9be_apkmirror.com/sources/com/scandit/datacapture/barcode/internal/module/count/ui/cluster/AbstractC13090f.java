package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import android.view.MotionEvent;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.cluster.f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC13090f {
    public static boolean a(MotionEvent event, List items, Function1 onCluster) {
        Intrinsics.j(event, "event");
        Intrinsics.j(items, "items");
        Intrinsics.j(onCluster, "onCluster");
        Iterator it = items.iterator();
        while (it.hasNext()) {
            D d10 = (D) it.next();
            NativeCluster nativeCluster = d10.f121524a;
            if (nativeCluster != null) {
                float x10 = event.getX();
                float x11 = d10.f121527d.getX();
                Lazy lazy = j.f121538h;
                if (x10 >= x11 - ((Number) lazy.getValue()).intValue() && event.getX() <= d10.f121527d.getX() + ((Number) lazy.getValue()).intValue() && event.getY() >= d10.f121527d.getY() - ((Number) lazy.getValue()).intValue() && event.getY() <= d10.f121527d.getY() + ((Number) lazy.getValue()).intValue()) {
                    onCluster.invoke(nativeCluster);
                    return true;
                }
            }
        }
        return false;
    }
}
