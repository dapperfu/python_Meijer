package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.source.FrameSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class Z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameSource f125776a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(FrameSource frameSource) {
        super(0);
        this.f125776a = frameSource;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f125776a;
    }
}
