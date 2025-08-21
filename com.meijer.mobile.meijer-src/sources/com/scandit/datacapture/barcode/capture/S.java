package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class S extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f121516a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(Function0 function0) {
        super(0);
        this.f121516a = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new BarcodeCaptureSessionProxyAdapter((NativeBarcodeCaptureSession) this.f121516a.invoke(), null, 2, null);
    }
}
