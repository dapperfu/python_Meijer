package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.brush;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class l extends FunctionReferenceImpl implements Function2 {
    public l(Object obj) {
        super(2, obj, n.class, "shouldAllowStatusIconTap", "shouldAllowStatusIconTap(Lcom/scandit/datacapture/core/common/geometry/Point;I)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar;
        v vVar;
        Quadrilateral quadrilateral;
        Point p02 = (Point) obj;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.j(p02, "p0");
        n nVar = (n) this.receiver;
        Iterator it = nVar.f122577e.keySet().iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            if (!it.hasNext()) {
                z10 = true;
                break;
            }
            int iIntValue2 = ((Number) it.next()).intValue();
            if (iIntValue2 != iIntValue) {
                if (z11 && (aVar = (a) nVar.f122577e.get(Integer.valueOf(iIntValue2))) != null && (vVar = aVar.f122549b) != null && (quadrilateral = vVar.f122590a) != null && QuadrilateralUtilsKt.contains(quadrilateral, p02)) {
                    break;
                }
            } else {
                z11 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
