package com.scandit.datacapture.core.capture.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureContextDeserializerListener f125062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataCaptureContextDeserializerProxyAdapter f125063b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(DataCaptureContextDeserializerListener dataCaptureContextDeserializerListener, DataCaptureContextDeserializerProxyAdapter dataCaptureContextDeserializerProxyAdapter) {
        super(0);
        this.f125062a = dataCaptureContextDeserializerListener;
        this.f125063b = dataCaptureContextDeserializerProxyAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DataCaptureContextDeserializerListenerReversedAdapter(this.f125062a, this.f125063b._deserializer(), null, 4, null);
    }
}
