package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview;

import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.RectUtilsKt;
import com.scandit.datacapture.core.internal.sdk.common.geometry.QuadrilateralUtilsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f122625a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Map map) {
        super(1);
        this.f122625a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Point location = (Point) obj;
        Intrinsics.j(location, "location");
        Collection<a> collectionValues = this.f122625a.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (RectUtilsKt.contains(((a) obj2).f122602b, location)) {
                arrayList.add(obj2);
            }
        }
        a aVar = null;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                ?? next = it.next();
                if (it.hasNext()) {
                    float fDistanceSquared = PointExtensionsKt.distanceSquared(RectUtilsKt.center(((a) next).f122602b), location);
                    do {
                        Object next2 = it.next();
                        float fDistanceSquared2 = PointExtensionsKt.distanceSquared(RectUtilsKt.center(((a) next2).f122602b), location);
                        next = next;
                        if (Float.compare(fDistanceSquared, fDistanceSquared2) > 0) {
                            next = next2;
                            fDistanceSquared = fDistanceSquared2;
                        }
                    } while (it.hasNext());
                }
                aVar = next;
            }
            return aVar;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionValues) {
            if (QuadrilateralUtilsKt.contains(((a) obj3).f122603c.f122590a, location)) {
                arrayList2.add(obj3);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList();
        float fMax = Float.MIN_VALUE;
        boolean z10 = false;
        boolean z11 = false;
        float fMax2 = Float.MIN_VALUE;
        for (a aVar2 : collectionValues) {
            BarcodePickState barcodePickState = aVar2.f122604d;
            if (barcodePickState == BarcodePickState.TO_PICK) {
                z10 = true;
            }
            BarcodePickState barcodePickState2 = BarcodePickState.IGNORE;
            if (barcodePickState == barcodePickState2) {
                z11 = true;
            }
            fMax2 = Math.max(fMax2, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.h.a(barcodePickState));
            if (aVar2.f122604d != barcodePickState2) {
                arrayList3.add(aVar2);
                fMax = Math.max(fMax, com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.h.a(aVar2.f122604d));
            }
        }
        if (!z10 || !z11) {
            fMax = fMax2;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : collectionValues) {
            if (com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.h.a(((a) obj4).f122604d) == fMax) {
                arrayList4.add(obj4);
            }
        }
        Iterator it2 = arrayList4.iterator();
        if (it2.hasNext()) {
            ?? next3 = it2.next();
            if (it2.hasNext()) {
                float fDistanceSquared3 = PointExtensionsKt.distanceSquared(RectUtilsKt.center(((a) next3).f122602b), location);
                do {
                    Object next4 = it2.next();
                    float fDistanceSquared4 = PointExtensionsKt.distanceSquared(RectUtilsKt.center(((a) next4).f122602b), location);
                    next3 = next3;
                    if (Float.compare(fDistanceSquared3, fDistanceSquared4) > 0) {
                        next3 = next4;
                        fDistanceSquared3 = fDistanceSquared4;
                    }
                } while (it2.hasNext());
            }
            aVar = next3;
        }
        return aVar;
    }
}
