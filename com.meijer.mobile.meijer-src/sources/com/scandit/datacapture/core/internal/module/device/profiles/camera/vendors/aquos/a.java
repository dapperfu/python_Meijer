package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.aquos;

import android.util.Range;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.e;
import com.scandit.datacapture.core.internal.module.source.N;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f125190c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final String f125191d = "sh-m08|sh-01L";

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
        return f125191d;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeCameraApi k() {
        return NativeCameraApi.CAMERA2;
    }
}
