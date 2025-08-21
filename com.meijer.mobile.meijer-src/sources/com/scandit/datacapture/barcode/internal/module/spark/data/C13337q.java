package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.source.Camera;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13337q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f123864a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13337q(O o10) {
        super(1);
        this.f123864a = o10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeAndroidCamera f126823a;
        NativeAndroidCamera f126823a2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Camera camera = this.f123864a.f123811f;
        if (camera != null && (f126823a2 = camera.getF126823a()) != null) {
            f126823a2.setBatterySavingMode(zBooleanValue);
        }
        Camera camera2 = this.f123864a.f123812g;
        if (camera2 != null && (f126823a = camera2.getF126823a()) != null) {
            f126823a.setBatterySavingMode(zBooleanValue);
        }
        return Unit.f143329a;
    }
}
