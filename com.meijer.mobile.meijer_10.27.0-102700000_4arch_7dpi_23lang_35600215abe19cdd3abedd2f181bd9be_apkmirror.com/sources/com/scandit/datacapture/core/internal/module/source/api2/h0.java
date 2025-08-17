package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.source.CameraSettings;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class h0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final N f124907a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f124908b;

    /* renamed from: c, reason: collision with root package name */
    public final C13348v f124909c;

    public h0(O cameraInfo) {
        Intrinsics.j(cameraInfo, "cameraInfo");
        this.f124907a = cameraInfo;
        this.f124908b = new AtomicReference();
        CameraSettings cameraSettings = cameraInfo.f124854c;
        Object property = cameraSettings != null ? cameraSettings.getProperty("numFramesInCameraApi2FrameDataPool") : null;
        Integer num = property instanceof Integer ? (Integer) property : null;
        this.f124909c = new C13348v(num != null ? num.intValue() : 3);
    }
}
