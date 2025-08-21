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
/* loaded from: classes12.dex */
public final /* synthetic */ class C13208o extends FunctionReferenceImpl implements Function1 {
    public C13208o(Object obj) {
        super(1, obj, C13212t.class, "closestBarcodeToLocation", "closestBarcodeToLocation(Lcom/scandit/datacapture/core/common/geometry/Point;)Lcom/scandit/datacapture/barcode/batch/data/TrackedBarcode;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        Point p02 = (Point) obj;
        Intrinsics.j(p02, "p0");
        C13212t c13212t = (C13212t) this.receiver;
        List<TrackedBarcode> listP0 = CollectionsKt.P0(c13212t.f122428t.values(), c13212t.f122430v);
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listP0, 10));
        for (TrackedBarcode trackedBarcode : listP0) {
            S s10 = c13212t.f122410b;
            V vA = ((U) s10).a(trackedBarcode);
            arrayList.add(new C13198e(trackedBarcode, vA, PointExtensionsKt.dotProductSquared(PointExtensionsKt.minus(vA.f122366c, p02))));
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float f10 = ((C13198e) next).f122390c;
                do {
                    Object next2 = it.next();
                    float f11 = ((C13198e) next2).f122390c;
                    if (Float.compare(f10, f11) > 0) {
                        next = next2;
                        f10 = f11;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        C13198e c13198e = (C13198e) next;
        if (c13198e != null) {
            int iOrdinal = c13212t.d(c13198e.f122388a).ordinal();
            boolean zContains = true;
            if (iOrdinal == 0 || iOrdinal == 1) {
                S.f122360a.getClass();
                float fFloatValue = ((Number) Q.f122359b.getValue()).floatValue();
                V v10 = c13198e.f122389b;
                float f12 = ((fFloatValue * v10.f122367d) / 2) * 1.5f;
                if (PointExtensionsKt.dotProductSquared(PointExtensionsKt.minus(v10.f122366c, p02)) > f12 * f12) {
                    zContains = false;
                }
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zContains = QuadrilateralUtilsKt.contains(c13198e.f122389b.f122365b, p02);
            }
            if (!zContains) {
                c13198e = null;
            }
            if (c13198e != null) {
                return c13198e.f122388a;
            }
        }
        return null;
    }
}
