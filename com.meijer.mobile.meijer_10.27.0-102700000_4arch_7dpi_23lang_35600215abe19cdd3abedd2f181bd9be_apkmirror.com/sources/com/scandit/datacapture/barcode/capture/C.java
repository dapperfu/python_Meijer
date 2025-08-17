package com.scandit.datacapture.barcode.capture;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class C extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeCaptureDeserializer f120549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(BarcodeCaptureDeserializer barcodeCaptureDeserializer) {
        super(0);
        this.f120549a = barcodeCaptureDeserializer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f120549a;
    }
}
