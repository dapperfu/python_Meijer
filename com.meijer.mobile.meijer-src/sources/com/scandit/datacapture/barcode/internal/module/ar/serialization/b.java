package com.scandit.datacapture.barcode.internal.module.ar.serialization;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeDataCaptureContext f122022a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NativeDataCaptureContext nativeDataCaptureContext) {
        super(0);
        this.f122022a = nativeDataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f122022a);
    }
}
