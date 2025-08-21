package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class H extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CameraFactory f125732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraPosition f125733b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(CameraFactory cameraFactory, CameraPosition cameraPosition) {
        super(1);
        this.f125732a = cameraFactory;
        this.f125733b = cameraPosition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeAndroidCamera f126823a;
        NativeCameraFrameData frameData = (NativeCameraFrameData) obj;
        Intrinsics.j(frameData, "frameData");
        D d10 = this.f125732a.f125727c;
        CameraPosition position = this.f125733b;
        d10.getClass();
        Intrinsics.j(position, "position");
        Camera camera = (Camera) d10.f125728a.get(D.a(position));
        if (camera != null && (f126823a = camera.getF126823a()) != null) {
            f126823a.onFrameOutputAndroid(frameData);
        }
        return Unit.f143329a;
    }
}
