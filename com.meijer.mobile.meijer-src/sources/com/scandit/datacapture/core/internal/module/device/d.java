package com.scandit.datacapture.core.internal.module.device;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d extends NativeDeviceInterface {

    /* renamed from: a, reason: collision with root package name */
    public final a f125168a;

    public d(c batteryStatusProvider) {
        Intrinsics.j(batteryStatusProvider, "batteryStatusProvider");
        this.f125168a = batteryStatusProvider;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.NativeDeviceInterface
    public final NativeBatteryData getBatteryData() {
        return ((c) this.f125168a).a();
    }
}
