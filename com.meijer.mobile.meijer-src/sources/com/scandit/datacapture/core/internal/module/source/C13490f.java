package com.scandit.datacapture.core.internal.module.source;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.f, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13490f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f126031a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13490f(boolean z10) {
        super(1);
        this.f126031a = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.core.internal.module.gl.l use = (com.scandit.datacapture.core.internal.module.gl.l) obj;
        Intrinsics.j(use, "$this$use");
        use.f125617x = this.f126031a;
        return Unit.f143329a;
    }
}
