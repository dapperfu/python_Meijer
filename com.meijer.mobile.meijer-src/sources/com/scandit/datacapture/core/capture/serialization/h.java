package com.scandit.datacapture.core.capture.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureContextDeserializer f125055a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DataCaptureContextDeserializer dataCaptureContextDeserializer) {
        super(0);
        this.f125055a = dataCaptureContextDeserializer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f125055a;
    }
}
