package com.scandit.datacapture.core.capture.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureContextDeserializerListener f124110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataCaptureContextDeserializerProxyAdapter f124111b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(DataCaptureContextDeserializerListener dataCaptureContextDeserializerListener, DataCaptureContextDeserializerProxyAdapter dataCaptureContextDeserializerProxyAdapter) {
        super(0);
        this.f124110a = dataCaptureContextDeserializerListener;
        this.f124111b = dataCaptureContextDeserializerProxyAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DataCaptureContextDeserializerListenerReversedAdapter(this.f124110a, this.f124111b._deserializer(), null, 4, null);
    }
}
