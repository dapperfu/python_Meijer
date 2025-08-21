package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.source.CameraSettings;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class h0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final N f125859a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f125860b;

    /* renamed from: c, reason: collision with root package name */
    public final C13481v f125861c;

    public h0(O cameraInfo) {
        Intrinsics.j(cameraInfo, "cameraInfo");
        this.f125859a = cameraInfo;
        this.f125860b = new AtomicReference();
        CameraSettings cameraSettings = cameraInfo.f125806c;
        Object property = cameraSettings != null ? cameraSettings.getProperty("numFramesInCameraApi2FrameDataPool") : null;
        Integer num = property instanceof Integer ? (Integer) property : null;
        this.f125861c = new C13481v(num != null ? num.intValue() : 3);
    }
}
