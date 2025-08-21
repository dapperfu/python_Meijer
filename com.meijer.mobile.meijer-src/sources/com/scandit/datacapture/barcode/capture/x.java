package com.scandit.datacapture.barcode.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class x extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCaptureDeserializer f121545a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(BarcodeCaptureDeserializer barcodeCaptureDeserializer) {
        super(0);
        this.f121545a = barcodeCaptureDeserializer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f121545a;
    }
}
