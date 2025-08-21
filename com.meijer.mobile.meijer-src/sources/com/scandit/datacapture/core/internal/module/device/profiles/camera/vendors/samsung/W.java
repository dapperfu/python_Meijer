package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* loaded from: classes12.dex */
public final class W extends com.scandit.datacapture.core.internal.module.device.profiles.camera.e {

    /* renamed from: c, reason: collision with root package name */
    public static final W f125397c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125398d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125399e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean j() {
        return true;
    }

    static {
        W w10 = new W();
        f125397c = w10;
        f125398d = "sm-g736u|sm-g736u1|sm-g736b";
        f125399e = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(w10.f125176a, false, 0.0f, false, false, 1, 63);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125399e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeFocusStrategy e() {
        return NativeFocusStrategy.CONTINUOUS_UNTIL_NO_SCAN;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125398d;
    }
}
