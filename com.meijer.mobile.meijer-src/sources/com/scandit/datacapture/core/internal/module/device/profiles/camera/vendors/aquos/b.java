package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.aquos;

import android.util.Range;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.e;
import com.scandit.datacapture.core.internal.module.source.N;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final b f125192c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final String f125193d = "907sh";

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return N.c(frameRateRanges, f10);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range b(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return N.c(frameRateRanges, f10);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125193d;
    }
}
