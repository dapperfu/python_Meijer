package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.capture.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13172c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeCapture f121524a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13172c(NativeBarcodeCapture nativeBarcodeCapture) {
        super(0);
        this.f121524a = nativeBarcodeCapture;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodeCaptureSession session = this.f121524a.getSession();
        Intrinsics.i(session, "getSession(...)");
        return session;
    }
}
