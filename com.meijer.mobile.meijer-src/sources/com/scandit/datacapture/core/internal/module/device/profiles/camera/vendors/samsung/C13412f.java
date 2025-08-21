package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* renamed from: com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13412f extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C13412f f125430d = new C13412f();

    /* renamed from: e, reason: collision with root package name */
    public static final String f125431e = "SM-A528B";

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f125432f = true;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeFocusStrategy e() {
        return NativeFocusStrategy.AUTO;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125431e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean j() {
        return f125432f;
    }
}
