package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.scandit;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes11.dex */
public final class a extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f124542d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f124543e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f124544f;

    static {
        a aVar = new a();
        f124542d = aVar;
        f124543e = "scandit-default-continuous-custom_metering_disabled.*";
        f124544f = f.a(aVar.f124224a, false, 0.0f, true, false, 0, 109);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f124544f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124543e;
    }
}
