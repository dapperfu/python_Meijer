package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class k1 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n1 f122027a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(n1 n1Var) {
        super(1);
        this.f122027a = n1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return PointWithUnitUtilsKt.PointWithUnit(this.f122027a.f122042b.j() + AbstractC13103b.f121968f + AbstractC13103b.f121970h, this.f122027a.f122042b.h() + AbstractC13103b.f121969g, MeasureUnit.PIXEL);
        }
        int iJ = this.f122027a.f122042b.j();
        int i10 = AbstractC13103b.f121969g;
        return PointWithUnitUtilsKt.PointWithUnit(iJ + i10, this.f122027a.f122042b.h() + i10, MeasureUnit.PIXEL);
    }
}
