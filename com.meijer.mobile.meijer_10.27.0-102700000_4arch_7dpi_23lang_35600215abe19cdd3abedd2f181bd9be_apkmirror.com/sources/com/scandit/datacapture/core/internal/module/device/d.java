package com.scandit.datacapture.core.internal.module.device;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class d extends NativeDeviceInterface {

    /* renamed from: a, reason: collision with root package name */
    public final a f124216a;

    public d(c batteryStatusProvider) {
        Intrinsics.j(batteryStatusProvider, "batteryStatusProvider");
        this.f124216a = batteryStatusProvider;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.NativeDeviceInterface
    public final NativeBatteryData getBatteryData() {
        return ((c) this.f124216a).a();
    }
}
