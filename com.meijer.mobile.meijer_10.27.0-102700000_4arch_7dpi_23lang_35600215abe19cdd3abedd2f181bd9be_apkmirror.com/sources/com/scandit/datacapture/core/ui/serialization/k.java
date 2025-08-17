package com.scandit.datacapture.core.ui.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureViewDeserializerListener f126169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataCaptureViewDeserializerProxyAdapter f126170b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DataCaptureViewDeserializerListener dataCaptureViewDeserializerListener, DataCaptureViewDeserializerProxyAdapter dataCaptureViewDeserializerProxyAdapter) {
        super(0);
        this.f126169a = dataCaptureViewDeserializerListener;
        this.f126170b = dataCaptureViewDeserializerProxyAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new DataCaptureViewDeserializerListenerReversedAdapter(this.f126169a, this.f126170b._deserializer(), null, 4, null);
    }
}
