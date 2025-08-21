package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class k1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f122979a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(n1 n1Var) {
        super(1);
        this.f122979a = n1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return PointWithUnitUtilsKt.PointWithUnit(this.f122979a.f122994b.j() + AbstractC13236b.f122920f + AbstractC13236b.f122922h, this.f122979a.f122994b.h() + AbstractC13236b.f122921g, MeasureUnit.PIXEL);
        }
        int iJ = this.f122979a.f122994b.j();
        int i10 = AbstractC13236b.f122921g;
        return PointWithUnitUtilsKt.PointWithUnit(iJ + i10, this.f122979a.f122994b.h() + i10, MeasureUnit.PIXEL);
    }
}
