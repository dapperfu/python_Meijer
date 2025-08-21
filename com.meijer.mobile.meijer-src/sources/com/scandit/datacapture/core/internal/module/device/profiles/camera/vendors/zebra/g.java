package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.zebra;

import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* loaded from: classes12.dex */
public final class g extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final g f125533d = new g();

    /* renamed from: e, reason: collision with root package name */
    public static final String f125534e = "TC52.*";

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f125535f = true;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f125536g = true;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeFocusStrategy e() {
        return NativeFocusStrategy.FORCE_RETRIGGER;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125534e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f125536g;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean j() {
        return f125535f;
    }
}
