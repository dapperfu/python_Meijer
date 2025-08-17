package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.panasonic;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.e;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes11.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f124385c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f124386d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f124387e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f124388f;

    static {
        a aVar = new a();
        f124385c = aVar;
        f124386d = "fz-n1";
        f124387e = f.a(aVar.f124224a, false, 0.0f, false, false, 0, 125);
        f124388f = true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f124387e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124386d;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f124388f;
    }
}
