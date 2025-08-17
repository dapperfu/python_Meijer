package com.scandit.datacapture.core.capture.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureContextDeserializer f124106a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DataCaptureContextDeserializer dataCaptureContextDeserializer) {
        super(0);
        this.f124106a = dataCaptureContextDeserializer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f124106a;
    }
}
