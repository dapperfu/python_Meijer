package com.scandit.datacapture.core.source.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameSourceDeserializer f125933a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FrameSourceDeserializer frameSourceDeserializer) {
        super(0);
        this.f125933a = frameSourceDeserializer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f125933a;
    }
}
