package com.scandit.datacapture.core.internal.module.source;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b0 implements InterfaceC13503t {

    /* renamed from: a, reason: collision with root package name */
    public final String f125966a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125967b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125968c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125969d;

    public b0(String cameraId, Camera.CameraInfo cameraInfo) {
        Intrinsics.j(cameraId, "cameraId");
        Intrinsics.j(cameraInfo, "cameraInfo");
        this.f125966a = cameraId;
        this.f125967b = cameraInfo.canDisableShutterSound;
        this.f125968c = cameraInfo.facing;
        this.f125969d = cameraInfo.orientation;
    }
}
