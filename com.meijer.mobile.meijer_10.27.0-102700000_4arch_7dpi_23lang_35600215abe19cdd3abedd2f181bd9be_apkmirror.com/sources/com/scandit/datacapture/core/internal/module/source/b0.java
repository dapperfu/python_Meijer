package com.scandit.datacapture.core.internal.module.source;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b0 implements InterfaceC13370t {

    /* renamed from: a, reason: collision with root package name */
    public final String f125014a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125015b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125016c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125017d;

    public b0(String cameraId, Camera.CameraInfo cameraInfo) {
        Intrinsics.j(cameraId, "cameraId");
        Intrinsics.j(cameraInfo, "cameraInfo");
        this.f125014a = cameraId;
        this.f125015b = cameraInfo.canDisableShutterSound;
        this.f125016c = cameraInfo.facing;
        this.f125017d = cameraInfo.orientation;
    }
}
