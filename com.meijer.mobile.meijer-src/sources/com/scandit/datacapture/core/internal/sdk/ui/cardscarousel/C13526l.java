package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13526l extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f126645a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13526l(Function1 function1) {
        super(1);
        this.f126645a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f126645a.invoke(Float.valueOf(((Number) obj).floatValue()));
        return Unit.f143329a;
    }
}
