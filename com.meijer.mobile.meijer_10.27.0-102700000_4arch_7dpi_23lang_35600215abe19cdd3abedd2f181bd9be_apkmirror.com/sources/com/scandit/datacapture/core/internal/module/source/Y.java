package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.source.FrameSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class Y extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameSource f124823a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(FrameSource frameSource) {
        super(0);
        this.f124823a = frameSource;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f124823a;
    }
}
