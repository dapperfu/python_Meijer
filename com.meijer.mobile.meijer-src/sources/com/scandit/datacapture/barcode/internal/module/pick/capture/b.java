package com.scandit.datacapture.barcode.internal.module.pick.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodePick f123381a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NativeBarcodePick nativeBarcodePick) {
        super(0);
        this.f123381a = nativeBarcodePick;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodePickScanningSession scanningSession = this.f123381a.getSession().getScanningSession();
        Intrinsics.i(scanningSession, "getScanningSession(...)");
        return scanningSession;
    }
}
