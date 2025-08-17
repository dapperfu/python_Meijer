package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.scandit;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes11.dex */
public final class b extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final b f124545d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f124546e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f124547f;

    static {
        b bVar = new b();
        f124545d = bVar;
        f124546e = "scandit-default-continuous.*";
        f124547f = f.a(bVar.f124224a, false, 0.0f, false, false, 0, 125);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f124547f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124546e;
    }
}
