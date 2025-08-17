package com.scandit.datacapture.core.source.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameSourceDeserializer f125937a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FrameSourceDeserializer frameSourceDeserializer) {
        super(0);
        this.f125937a = frameSourceDeserializer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f125937a;
    }
}
