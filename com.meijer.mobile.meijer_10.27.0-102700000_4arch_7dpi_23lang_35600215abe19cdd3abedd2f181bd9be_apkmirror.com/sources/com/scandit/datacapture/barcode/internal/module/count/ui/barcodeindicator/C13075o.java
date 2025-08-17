package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C13075o extends FunctionReferenceImpl implements Function1 {
    public C13075o(Object obj) {
        super(1, obj, C13079t.class, "closestBarcodeToLocation", "closestBarcodeToLocation(Lcom/scandit/datacapture/core/common/geometry/Point;)Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        Point p02 = (Point) obj;
        Intrinsics.j(p02, "p0");
        C13079t c13079t = (C13079t) this.receiver;
        List<TrackedBarcode> listP0 = CollectionsKt.P0(c13079t.f121476t.values(), c13079t.f121478v);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listP0, 10));
        for (TrackedBarcode trackedBarcode : listP0) {
            S s10 = c13079t.f121458b;
            V vA = ((U) s10).a(trackedBarcode);
            arrayList.add(new C13065e(trackedBarcode, vA, PointExtensionsKt.dotProductSquared(PointExtensionsKt.minus(vA.f121414c, p02))));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float f10 = ((C13065e) next).f121438c;
                do {
                    Object next2 = it.next();
                    float f11 = ((C13065e) next2).f121438c;
                    if (Float.compare(f10, f11) > 0) {
                        next = next2;
                        f10 = f11;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C13065e c13065e = (C13065e) next;
        if (c13065e != null) {
            int iOrdinal = c13079t.d(c13065e.f121436a).ordinal();
            boolean zContains = true;
            if (iOrdinal == 0 || iOrdinal == 1) {
                S.f121408a.getClass();
                float fFloatValue = ((Number) Q.f121407b.getValue()).floatValue();
                V v10 = c13065e.f121437b;
                float f12 = ((fFloatValue * v10.f121415d) / 2) * 1.5f;
                if (PointExtensionsKt.dotProductSquared(PointExtensionsKt.minus(v10.f121414c, p02)) > f12 * f12) {
                    zContains = false;
                }
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zContains = QuadrilateralUtilsKt.contains(c13065e.f121437b.f121413b, p02);
            }
            if (!zContains) {
                c13065e = null;
            }
            if (c13065e != null) {
                return c13065e.f121436a;
            }
        }
        return null;
    }
}
