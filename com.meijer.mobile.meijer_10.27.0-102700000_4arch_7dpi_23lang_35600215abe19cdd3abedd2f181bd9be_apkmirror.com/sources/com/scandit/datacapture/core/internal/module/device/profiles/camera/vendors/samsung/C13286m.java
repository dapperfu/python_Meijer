package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;

/* renamed from: com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung.m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13286m extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C13286m f124500d = new C13286m();

    /* renamed from: e, reason: collision with root package name */
    public static final String f124501e = "sm-t575.*";

    /* renamed from: f, reason: collision with root package name */
    public static final NativeCameraApi f124502f = NativeCameraApi.CAMERA2;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124501e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeCameraApi k() {
        return f124502f;
    }
}
