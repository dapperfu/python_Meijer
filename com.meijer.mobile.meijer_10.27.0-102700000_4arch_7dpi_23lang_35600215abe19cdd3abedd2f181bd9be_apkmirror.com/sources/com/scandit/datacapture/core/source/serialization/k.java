package com.scandit.datacapture.core.source.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameSourceDeserializerListener f125940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameSourceDeserializerProxyAdapter f125941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FrameSourceDeserializerListener frameSourceDeserializerListener, FrameSourceDeserializerProxyAdapter frameSourceDeserializerProxyAdapter) {
        super(0);
        this.f125940a = frameSourceDeserializerListener;
        this.f125941b = frameSourceDeserializerProxyAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new FrameSourceDeserializerListenerReversedAdapter(this.f125940a, this.f125941b._deserializer(), null, 4, null);
    }
}
