package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.source.CameraPosition;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13200m extends ObservableProperty {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanStateManager f122908a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13200m(CameraPosition cameraPosition, SparkScanStateManager sparkScanStateManager) {
        super(cameraPosition);
        this.f122908a = sparkScanStateManager;
    }

    @Override // kotlin.properties.ObservableProperty
    public final void afterChange(KProperty property, Object obj, Object obj2) {
        Intrinsics.j(property, "property");
        com.scandit.datacapture.barcode.internal.module.spark.internal.b bVarB = this.f122908a.b();
        bVarB.f122933a.setValue(bVarB, com.scandit.datacapture.barcode.internal.module.spark.internal.b.f122932c[0], (CameraPosition) obj2);
    }
}
