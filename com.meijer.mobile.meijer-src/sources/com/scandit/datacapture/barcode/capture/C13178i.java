package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.capture.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13178i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeDataCaptureContext f121530a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13178i(NativeDataCaptureContext nativeDataCaptureContext) {
        super(0);
        this.f121530a = nativeDataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f121530a);
    }
}
