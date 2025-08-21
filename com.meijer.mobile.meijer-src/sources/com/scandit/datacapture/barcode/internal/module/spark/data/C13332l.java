package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.source.TorchState;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13332l extends ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanStateManager f123859a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13332l(TorchState torchState, SparkScanStateManager sparkScanStateManager) {
        super(torchState);
        this.f123859a = sparkScanStateManager;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.j(property, "property");
        com.scandit.datacapture.barcode.internal.module.spark.internal.b bVarV = this.f123859a.v();
        bVarV.f123885a.setValue(bVarV, com.scandit.datacapture.barcode.internal.module.spark.internal.b.f123884c[0], (TorchState) obj2);
    }
}
