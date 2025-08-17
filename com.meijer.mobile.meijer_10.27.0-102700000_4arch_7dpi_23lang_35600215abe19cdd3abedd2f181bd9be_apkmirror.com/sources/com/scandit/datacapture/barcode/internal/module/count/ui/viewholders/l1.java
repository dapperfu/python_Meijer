package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class l1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f122035a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(n1 n1Var) {
        super(1);
        this.f122035a = n1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Boolean) obj).booleanValue() ? PointWithUnitUtilsKt.PointWithUnit(AbstractC13103b.f121971i, this.f122035a.f122042b.j() + AbstractC13103b.f121968f + AbstractC13103b.f121970h, MeasureUnit.PIXEL) : PointWithUnitUtilsKt.PointWithUnit(AbstractC13103b.f121971i, this.f122035a.f122042b.j() + AbstractC13103b.f121969g, MeasureUnit.PIXEL);
    }
}
