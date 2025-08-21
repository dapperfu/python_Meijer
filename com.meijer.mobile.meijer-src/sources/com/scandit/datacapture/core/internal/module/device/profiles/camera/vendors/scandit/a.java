package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.scandit;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes12.dex */
public final class a extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f125494d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125495e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f125496f;

    static {
        a aVar = new a();
        f125494d = aVar;
        f125495e = "scandit-default-continuous-custom_metering_disabled.*";
        f125496f = f.a(aVar.f125176a, false, 0.0f, true, false, 0, 109);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f125496f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125495e;
    }
}
