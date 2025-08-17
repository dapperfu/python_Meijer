package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.honeywell;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes11.dex */
public final class c extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f124322d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f124323e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f124324f;

    static {
        c cVar = new c();
        f124322d = cVar;
        f124323e = "ct40";
        f124324f = f.a(cVar.f124224a, false, 0.0f, false, true, 0, 95);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f124324f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124323e;
    }
}
