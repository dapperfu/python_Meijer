package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameterKey;
import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters;
import com.scandit.datacapture.core.internal.sdk.source.api2.CameraApi2Info;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13347u extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13348v f124993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f124994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CameraApi2Info f124995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f124996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13347u(C13348v c13348v, F f10, CameraApi2Info cameraApi2Info, Long l10) {
        super(1);
        this.f124993a = c13348v;
        this.f124994b = f10;
        this.f124995c = cameraApi2Info;
        this.f124996d = l10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeCameraCaptureParameters updateFrameData = (NativeCameraCaptureParameters) obj;
        Intrinsics.j(updateFrameData, "$this$updateFrameData");
        C13348v.a(this.f124993a, updateFrameData, this.f124994b, this.f124995c);
        CameraApi2Info cameraInfo = this.f124995c;
        Intrinsics.j(updateFrameData, "<this>");
        Intrinsics.j(cameraInfo, "cameraInfo");
        NativeCameraCaptureParameterKey nativeCameraCaptureParameterKey = NativeCameraCaptureParameterKey.POSITION;
        int facing = cameraInfo.getFacing();
        updateFrameData.insertInt64(nativeCameraCaptureParameterKey, facing != 0 ? facing != 1 ? -1L : 1L : 2L);
        updateFrameData.insertInt64(NativeCameraCaptureParameterKey.LENS_FOCUS_CALIBRATION, cameraInfo.getFocusCalibration());
        Long l10 = this.f124996d;
        Intrinsics.j(updateFrameData, "<this>");
        updateFrameData.insertInt64(NativeCameraCaptureParameterKey.DELAY_BETWEEN_YUV_AND_PREVIEW, l10 != null ? l10.longValue() : 0L);
        return Unit.f142422a;
    }
}
