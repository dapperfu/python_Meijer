package com.scandit.datacapture.barcode.batch.capture;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.batch.capture.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13168g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeDataCaptureContext f121400a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13168g(NativeDataCaptureContext nativeDataCaptureContext) {
        super(0);
        this.f121400a = nativeDataCaptureContext;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f121400a);
    }
}
