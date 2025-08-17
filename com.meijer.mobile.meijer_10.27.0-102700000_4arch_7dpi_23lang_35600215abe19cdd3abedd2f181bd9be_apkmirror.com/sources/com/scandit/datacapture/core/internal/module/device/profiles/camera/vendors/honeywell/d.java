package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.honeywell;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes11.dex */
public final class d extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final d f124325d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f124326e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f124327f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f124328g;

    static {
        d dVar = new d();
        f124325d = dVar;
        f124326e = "ct60";
        f124327f = f.a(dVar.f124224a, false, 0.0f, false, true, 0, 95);
        f124328g = true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f124327f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124326e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f124328g;
    }
}
