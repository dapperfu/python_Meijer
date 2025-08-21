package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* renamed from: com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13411e extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C13411e f125427d = new C13411e();

    /* renamed from: e, reason: collision with root package name */
    public static final String f125428e = "sm-a525f(/ds)?|sm-a525m(/ds)?|sm-a526b(/ds)?|sm-a5260|sm-a526w|sm-a526u1?";

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f125429f = true;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean h() {
        return true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeFocusStrategy e() {
        return NativeFocusStrategy.AUTO;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125428e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean j() {
        return f125429f;
    }
}
