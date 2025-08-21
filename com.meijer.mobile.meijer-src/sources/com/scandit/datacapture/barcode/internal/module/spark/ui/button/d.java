package com.scandit.datacapture.barcode.internal.module.spark.ui.button;

import com.scandit.datacapture.barcode.internal.module.spark.ui.EnumC13341a;
import com.scandit.datacapture.barcode.internal.module.spark.ui.SparkScanViewPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f124030a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.f124030a = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EnumC13341a gesture = (EnumC13341a) obj;
        Intrinsics.j(gesture, "gesture");
        int iOrdinal = gesture.ordinal();
        if (iOrdinal != 0) {
            switch (iOrdinal) {
                case 6:
                    k kVar = this.f124030a.f124033c;
                    if (kVar != null) {
                        ((SparkScanViewPresenter) kVar).E();
                        break;
                    }
                    break;
                case 7:
                    k kVar2 = this.f124030a.f124033c;
                    if (kVar2 != null) {
                        ((SparkScanViewPresenter) kVar2).D();
                        break;
                    }
                    break;
                case 8:
                    k kVar3 = this.f124030a.f124033c;
                    if (kVar3 != null) {
                        ((SparkScanViewPresenter) kVar3).a(true);
                        break;
                    }
                    break;
                case 9:
                    k kVar4 = this.f124030a.f124033c;
                    if (kVar4 != null) {
                        ((SparkScanViewPresenter) kVar4).a(false);
                        break;
                    }
                    break;
                case 10:
                    k kVar5 = this.f124030a.f124033c;
                    if (kVar5 != null) {
                        ((SparkScanViewPresenter) kVar5).B();
                        break;
                    }
                    break;
            }
        } else {
            k kVar6 = this.f124030a.f124033c;
            if (kVar6 != null) {
                ((SparkScanViewPresenter) kVar6).A();
            }
        }
        return Unit.f143329a;
    }
}
