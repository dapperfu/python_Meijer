package com.scandit.datacapture.core.source.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameSourceDeserializerListener f126892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameSourceDeserializerProxyAdapter f126893b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FrameSourceDeserializerListener frameSourceDeserializerListener, FrameSourceDeserializerProxyAdapter frameSourceDeserializerProxyAdapter) {
        super(0);
        this.f126892a = frameSourceDeserializerListener;
        this.f126893b = frameSourceDeserializerProxyAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new FrameSourceDeserializerListenerReversedAdapter(this.f126892a, this.f126893b._deserializer(), null, 4, null);
    }
}
