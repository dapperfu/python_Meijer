package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.source.FrameSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameSource f126120a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FrameSource frameSource) {
        super(1);
        this.f126120a = frameSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.core.internal.module.gl.l use = (com.scandit.datacapture.core.internal.module.gl.l) obj;
        Intrinsics.j(use, "$this$use");
        use.f125616w = this.f126120a != null;
        return Unit.f143329a;
    }
}
