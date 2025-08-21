package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.honeywell;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes12.dex */
public final class d extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final d f125277d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125278e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f125279f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f125280g;

    static {
        d dVar = new d();
        f125277d = dVar;
        f125278e = "ct60";
        f125279f = f.a(dVar.f125176a, false, 0.0f, false, true, 0, 95);
        f125280g = true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f125279f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125278e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f125280g;
    }
}
