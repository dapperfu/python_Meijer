package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightdrawer.customview;

import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.RectUtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements Function2 {
    public d(Object obj) {
        super(2, obj, f.class, "shouldAllowStatusIconTap", "shouldAllowStatusIconTap(Lcom/scandit/datacapture/core/common/geometry/Point;I)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Point p02 = (Point) obj;
        int iIntValue = ((Number) obj2).intValue();
        Intrinsics.j(p02, "p0");
        f fVar = (f) this.receiver;
        int iW0 = CollectionsKt.w0(fVar.f122620j.keySet(), Integer.valueOf(iIntValue));
        Collection collectionValues = fVar.f122620j.values();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj3 : collectionValues) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            a aVar = (a) obj3;
            if (i10 > iW0 && RectUtilsKt.contains(aVar.f122602b, p02)) {
                arrayList.add(obj3);
            }
            i10 = i11;
        }
        return Boolean.valueOf(arrayList.isEmpty());
    }
}
