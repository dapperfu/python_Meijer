package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import android.util.Range;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung.v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13427v extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C13427v f125479d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125480e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125481f;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125481f;
    }

    static {
        C13427v c13427v = new C13427v();
        f125479d = c13427v;
        f125480e = "(sm-j50|sm-j51).*";
        f125481f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(c13427v.f125176a, false, 0.0f, true, false, 0, 111);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return com.scandit.datacapture.core.internal.module.source.N.c(frameRateRanges, f10);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125480e;
    }
}
