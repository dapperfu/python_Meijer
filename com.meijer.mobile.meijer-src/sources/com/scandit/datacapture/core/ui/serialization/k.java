package com.scandit.datacapture.core.ui.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureViewDeserializerListener f127121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataCaptureViewDeserializerProxyAdapter f127122b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DataCaptureViewDeserializerListener dataCaptureViewDeserializerListener, DataCaptureViewDeserializerProxyAdapter dataCaptureViewDeserializerProxyAdapter) {
        super(0);
        this.f127121a = dataCaptureViewDeserializerListener;
        this.f127122b = dataCaptureViewDeserializerProxyAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DataCaptureViewDeserializerListenerReversedAdapter(this.f127121a, this.f127122b._deserializer(), null, 4, null);
    }
}
