package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.source.Camera;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13204q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f122912a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13204q(O o10) {
        super(1);
        this.f122912a = o10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeAndroidCamera f125871a;
        NativeAndroidCamera f125871a2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        Camera camera = this.f122912a.f122859f;
        if (camera != null && (f125871a2 = camera.getF125871a()) != null) {
            f125871a2.setBatterySavingMode(zBooleanValue);
        }
        Camera camera2 = this.f122912a.f122860g;
        if (camera2 != null && (f125871a = camera2.getF125871a()) != null) {
            f125871a.setBatterySavingMode(zBooleanValue);
        }
        return Unit.f142422a;
    }
}
