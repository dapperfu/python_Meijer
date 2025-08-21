package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class l1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f122987a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(n1 n1Var) {
        super(1);
        this.f122987a = n1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Boolean) obj).booleanValue() ? PointWithUnitUtilsKt.PointWithUnit(AbstractC13236b.f122923i, this.f122987a.f122994b.j() + AbstractC13236b.f122920f + AbstractC13236b.f122922h, MeasureUnit.PIXEL) : PointWithUnitUtilsKt.PointWithUnit(AbstractC13236b.f122923i, this.f122987a.f122994b.j() + AbstractC13236b.f122921g, MeasureUnit.PIXEL);
    }
}
