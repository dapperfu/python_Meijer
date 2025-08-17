package com.scandit.datacapture.barcode.internal.module.spark.ui.minipreview;

import com.scandit.datacapture.barcode.internal.module.spark.ui.EnumC13208a;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class s extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f123217a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar) {
        super(1);
        this.f123217a = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x xVar;
        EnumC13208a gesture = (EnumC13208a) obj;
        Intrinsics.j(gesture, "gesture");
        int iOrdinal = gesture.ordinal();
        if (iOrdinal == 1) {
            x xVar2 = this.f123217a.f123219b;
            if (xVar2 != null) {
                ((SparkScanViewPresenter) xVar2).s();
            }
        } else if (iOrdinal == 6) {
            x xVar3 = this.f123217a.f123219b;
            if (xVar3 != null) {
                ((SparkScanViewPresenter) xVar3).i(true);
            }
        } else if (iOrdinal == 7 && (xVar = this.f123217a.f123219b) != null) {
            ((SparkScanViewPresenter) xVar).i(false);
        }
        return Unit.f142422a;
    }
}
