package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.scandit;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes12.dex */
public final class b extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final b f125497d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125498e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f125499f;

    static {
        b bVar = new b();
        f125497d = bVar;
        f125498e = "scandit-default-continuous.*";
        f125499f = f.a(bVar.f125176a, false, 0.0f, false, false, 0, 125);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f125499f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125498e;
    }
}
