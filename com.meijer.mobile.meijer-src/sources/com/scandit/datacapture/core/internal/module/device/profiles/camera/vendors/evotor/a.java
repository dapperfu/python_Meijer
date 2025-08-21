package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.evotor;

import android.util.Range;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f125232c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final String f125233d = "st-5i";

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125233d;
    }
}
