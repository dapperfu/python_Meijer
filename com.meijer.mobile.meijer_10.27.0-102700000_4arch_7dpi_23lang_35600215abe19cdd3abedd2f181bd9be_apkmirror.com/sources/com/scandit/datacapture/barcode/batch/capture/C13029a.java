package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.batch.internal.module.capture.NativeBarcodeTrackingSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.batch.capture.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13029a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeTracking f120443a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13029a(NativeBarcodeTracking nativeBarcodeTracking) {
        super(0);
        this.f120443a = nativeBarcodeTracking;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodeTrackingSession session = this.f120443a.getSession();
        Intrinsics.i(session, "getSession(...)");
        return session;
    }
}
