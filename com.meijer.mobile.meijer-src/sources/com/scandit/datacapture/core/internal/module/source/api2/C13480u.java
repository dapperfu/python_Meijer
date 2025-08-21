package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameterKey;
import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13480u extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13481v f125945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f125946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraApi2Info f125947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f125948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13480u(C13481v c13481v, F f10, CameraApi2Info cameraApi2Info, Long l10) {
        super(1);
        this.f125945a = c13481v;
        this.f125946b = f10;
        this.f125947c = cameraApi2Info;
        this.f125948d = l10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeCameraCaptureParameters updateFrameData = (NativeCameraCaptureParameters) obj;
        Intrinsics.j(updateFrameData, "$this$updateFrameData");
        C13481v.a(this.f125945a, updateFrameData, this.f125946b, this.f125947c);
        CameraApi2Info cameraInfo = this.f125947c;
        Intrinsics.j(updateFrameData, "<this>");
        Intrinsics.j(cameraInfo, "cameraInfo");
        NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey = NativeCameraCaptureParameterKey.POSITION;
        int facing = cameraInfo.getFacing();
        updateFrameData.insertInt64(nativeCameraCaptureParameterKey, facing != 0 ? facing != 1 ? -1L : 1L : 2L);
        updateFrameData.insertInt64(NativeCameraCaptureParameterKey.LENS_FOCUS_CALIBRATION, cameraInfo.getFocusCalibration());
        Long l10 = this.f125948d;
        Intrinsics.j(updateFrameData, "<this>");
        updateFrameData.insertInt64(NativeCameraCaptureParameterKey.DELAY_BETWEEN_YUV_AND_PREVIEW, l10 != null ? l10.longValue() : 0L);
        return Unit.f143329a;
    }
}
