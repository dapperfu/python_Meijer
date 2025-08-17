package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.capture.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13039c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeCapture f120572a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13039c(NativeBarcodeCapture nativeBarcodeCapture) {
        super(0);
        this.f120572a = nativeBarcodeCapture;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodeCaptureSession session = this.f120572a.getSession();
        Intrinsics.i(session, "getSession(...)");
        return session;
    }
}
